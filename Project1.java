import java.util.Scanner;

public class Project1{
	public static void main(String[] args){
		Char[][] pentP = {{p,p},{p,p},{p,0}}; //3x3 nxm
		Char[][] pentX = {{0,x,0},{x,x,x},{0,x,0}}; //3x3 mxm
		Char[][] pentF = {{0,f,f},{f,f,0},{0,f,0}};
		Char[][] pentV = {{v,0,0},{v,0,0},{v,v,v}};
		Char[][] pentW = {{w,0,0},{w,w,0},{0,w,w}};
		Char[][] pentY = {{0,y},{y,y},{0,y},{0,y};
		Char[][] pentI = {{i},{i},{i},{i},{i}};
		Char[][] pentT = {{t,t,t},{0,t,0},{0,t,0}};
		Char[][] pentZ = {{z,z,0},{0,z,0},{0,z,z}};
		Char[][] pentU = {{u,0,u},{u,u,u}};
		Char[][] pentN = {{n,n,0,0},{0,n,n,n}};
		Char[][] pentL = {{0,0,0,l},{l,l,l,l}};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type the length of the grid.");
		int lengthGrid = input.nextInt();
		System.out.println("Type the width of the grid.");
		int widthGrid = input.nextInt();
		
		int area = lengthGrid * widthGrid;
		Char[][] grid = new Char[lengthGrid][widthGrid];
		
		
		if(area%5 != 0){
			System.out.println("Not possible.");
		}
		if else(area > 60){
			System.out.println("Definetely not possible!");
		}
		if else(grid[1][5] || grid[5][1]){ //????? or grid.length == 5 && grid[0].length == 1
			System.out.println("True."); //show??
		}
		
		for(int i=0; i<lengthGrid; i++){
			for(int j =0; j<widthGrid; j++){
				rotateMatrix(pent, , );
			}
		}
		
		
		//rotating
		public static Char[][] rotateMatrix(Char[][] a, int n, int m){
			Char[][] tempMatrix = a[m][n];
			for(int i=0; i<m; i++){
				for(int j=0; j<n; j++){
					tempMatrix[i][j] = a[j][i];
				}
			}
			rotatedMatrix[][]=flipMatrix(tempMatrix);
			return rotatedMatrix;
		}
		
		//flipping
		public static Char[][] flipMatrix(Char[][] a, int n, int m){
			Char[][] flipMatrix = a[m][n]; //do we need a temp matrix/value??
			for(int i=0; i<m; i++){
				for(int j=0; j<n; j++){
					flipMatrix[i][j] = a[i][a[0].length-1-j];
				}
			}
			return flipMatrix;
		}
	}
}