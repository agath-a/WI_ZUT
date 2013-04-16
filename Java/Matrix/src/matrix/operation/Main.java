package matrix.operation;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner stream = new Scanner(System.in);
		int m, n, k; 
		
		try {
			do {
				System.out.println("Enter the dimensions of the matrix [values ​​greater than 0]:");
				System.out.print("[m] = "); m = stream.nextInt();
				System.out.print("[n] = "); n = stream.nextInt();
				System.out.print("[k] = "); k = stream.nextInt();
				System.out.println();
			}
			while(m <= 0 | n <=0 | k <= 0);
		}
		catch(Exception ex) {
			System.out.println("Wrong dimensions of the matrix. Run program again.");
			return; 
		}
		
		Matrix A = new Matrix(m,n); 
		Matrix B = new Matrix(m,k);
		Matrix C = new Matrix(k,n); 
		
		System.out.println("Enter the contents of the matrix B [0]:"); 
		B.setValueMatrix();
		System.out.println("Enter the contents of the matrix C:"); 
		C.setValueMatrix();
	
		A.setMatrix(B.multiplyMatrix(C, m, n, k));
		
		B.printMatrix("B"); 
		C.printMatrix("C");
		A.printMatrix("A"); 
	}
}
