package matrix.operation;
import java.util.Scanner;
import java.lang.String;


public class Matrix implements MatrixInterface{

	private int m; 
	private int n; 
	private int[][] matrix; 
	
	Matrix(int m, int n) {
		this.m = m; 
		this.n = n; 
		this.matrix = new int[m][n];
	}	

	public int getElementOfMatrix(int i, int j) {
		return this.matrix[i][j];
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}

	
	public void setValueMatrix() {
		Scanner localStream = new Scanner(System.in);
		int element=0; 
		
		for(int i=0; i<this.m; i++) {
			try {
			for(int j=0; j<this.n; j++) {
				do {
					if(element < 0) System.out.println("Wrong input element! Enter correct element"); 
					System.out.print("[" + i + "][" + j + "] = ");
				
					element = localStream.nextInt();
				}
				while(element < 0); 
				this.matrix[i][j] = element; 
			}
			}

		catch(Exception ex) {
			System.out.println("Wrong input element! Other element of this matrix have been set on 0.");
			System.out.println(ex.toString());
			return; 
		}
		}
	}
	
	public void printMatrix(String nameOfMatrix) {
		System.out.println("Content of the matrix " + nameOfMatrix);
		
		for(int i=0; i<this.m; i++) {
			for(int j=0; j<this.n; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println(); 
		}
	}
	
	public int[][] multiplyMatrix(Object secondMatrix, int m, int n, int k) {
		int sum = 0; 
		int[][] result = new int[m][n];
		
		for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		for(int l = 0; l < k ; l++) {
        			sum += this.matrix[i][l] * ((Matrix) secondMatrix).getElementOfMatrix(l, j);
        		}
        		result[i][j] = sum;
                sum = 0;
        	}
        }
		return result; 
	}
}
