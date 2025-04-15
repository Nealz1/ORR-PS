import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.concurrent.*;

public class Server extends UnicastRemoteObject implements MatrixTask {
    private static final int NUM_AGENTS = 4;

    protected Server() throws RemoteException {
        super();
    }

    public static void main(String[] args) {
        try {
            Naming.rebind("MatrixTask", new Server());
        } catch (Exception e) {
            System.out.println("Failed to start server:");
            e.printStackTrace();
        }
    }

    @Override
    public int[][] multiply(int[][] A, int[][] B) throws Exception {
        int[][] result = new int[2][2];
        ExecutorService executor = Executors.newFixedThreadPool(NUM_AGENTS);

        AgentTask[] agents = new AgentTask[NUM_AGENTS];
        for (int i = 0; i < NUM_AGENTS; i++) {
            System.out.println("Agent " + i);
            agents[i] = (AgentTask) Naming.lookup("rmi://localhost/agent" + (i + 1));
        }

        Callable<Integer>[] tasks = new Callable[] {
                () -> agents[0 % NUM_AGENTS].computeElement(A, B, 0, 0),
                () -> agents[1 % NUM_AGENTS].computeElement(A, B, 0, 1),
                () -> agents[2 % NUM_AGENTS].computeElement(A, B, 1, 0),
                () -> agents[3 % NUM_AGENTS].computeElement(A, B, 1, 1)
        };

        Future<Integer>[] futures = new Future[4];
        for (int i = 0; i < 4; i++) {
            futures[i] = executor.submit(tasks[i]);
        }

        result[0][0] = futures[0].get();
        result[0][1] = futures[1].get();
        result[1][0] = futures[2].get();
        result[1][1] = futures[3].get();

        executor.shutdown();
        return result;
    }
}
