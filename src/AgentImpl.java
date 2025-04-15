import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class AgentImpl extends UnicastRemoteObject implements AgentTask {
    public AgentImpl() throws RemoteException {
        super();
    }

    public static void main(String[] args) throws Exception {
        String name = "agent" + args[0];
        try {
            Naming.rebind(name, new AgentImpl());
        } catch (Exception e) {
            System.out.println("Failed to start " + name);
            e.printStackTrace();
        }
    }

    @Override
    public int computeElement(int[][] A, int[][] B, int row, int col) throws RemoteException {
        return A[row][0] * B[0][col] + A[row][1] * B[1][col];
    }
}
