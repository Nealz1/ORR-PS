import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MatrixTask extends Remote {
    int computeElement(int[][] A, int[][] B, int row, int col) throws RemoteException;
}
