import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MatrixTask extends Remote {

    int[][] multiply(int[][] A, int[][] B) throws Exception;
}
