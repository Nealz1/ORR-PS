import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class AgentImpl extends UnicastRemoteObject implements MatrixTask {
    public AgentImpl() throws RemoteException {
        super();
    }

    public int computeElement(int[][] A, int[][] B, int row, int col) throws RemoteException {
        return A[row][0] * B[0][col] + A[row][1] * B[1][col];
    }
}
