import java.util.Scanner;

public class Project1{
	public static void main(String[] args){
    char[][] pentP = {{'p','p'},{'p','p'},{'p',null}}; //3x3 nxm
		char[][] pentX = {{null,'x',0},{'x','x','x'},{0,'x',0}}; //3x3 mxm
		
		char[][] pentF1 = {{null,'f',null},{'f','f','f'},{0,0,'f'}};
		char[][] pentF2 = {{0,'f','f'},{'f','f',0},{0,'f',0}};
		char[][] pentF3 = {{'f',0,0},{'f','f','f'},{0,'f',0}};
		char[][] pentF4 = {{0,'f',0},{0,'f','f'},{'f','f',0}};
		char[][] pentF5 = {{0,0,'f'},{'f','f','f'},{0,'f',0}};
		char[][] pentF6 = {{'f','f',0},{0,'f','f'},{0,'f',0}};
		char[][] pentF7 = {{0,'f',0},{'f','f','f'},{'f',0,0}};
		char[][] pentF8 = {{0,'f',0},{'f','f',0},{0,'f','f'}};
		char[] pentF = {pentF1,pentF2,pentF3,pentF4,pentF5,pentF6,pentF7,pentF8};
		
		char[][] pentV1 = {{'v',0,0},{'v',0,0},{'v','v','v'}};
		char[][] pentV2 = {{'v','v','v'},{'v',0,0},{'v',0,0}};
		char[][] pentV3 = {{0,0,'v'},{0,0,'v'},{'v','v','v'}};
		char[][] pentV4 = {{'v','v','v'},{0,0,'v'},{0,0,'v'}};
		char[] pentV = {pentV1,pentV2,pentV3,pentV4};
		
		char[][] pentW1 = {{'w',0,0},{'w','w',0},{0,'w','w'}};
		char[][] pentW2 = {{0,0,'w'},{0,'w','w'},{'w','w',0}};
		char[][] pentW3 = {{'w','w',0},{0,'w','w'},{0,0,'w'}};
		char[][] pentW4 = {{0,'w','w'},{'w','w',0},{'w',0,0}};
		char[] pentW = {pentW1,pentW2,pentW3,pentW4};
		
		char[][] pentY1 = {{0,0,'y',0},{'y','y','y','y'}};
		char[][] pentY2 = {{0,'y'},{'y','y'},{0,'y'},{0,'y'}};
		char[][] pentY3 = {{'y','y','y','y'},{0,'y',0,0}};
		char[][] pentY4 = {{'y',0},{'y',0},{'y','y'},{'y',0}};
		char[][] pentY5 = {{'y','y','y','y'},{0,0,'y',0}};
		char[][] pentY6 = {{'y',0},{'y','y'},{'y',0},{'y',0}};
		char[][] pentY7 = {{0,'y',0,0},{'y','y','y','y'}};
		char[][] pentY8 = {{0,'y'},{0,'y'},{'y','y'},{0,'y'}};
		char[] pentY = {pentY1,pentY2,pentY3,pentY4,pentY5,pentY6,pentY7,pentY8};
		
		char[][] pentI1 = {{'i','i','i','i','i'}};
		char[][] pentI2 = {{'i'},{'i'},{'i'},{'i'},{'i'}};
		char[][][] pentI ={pentI1,pentI2};
		
		char[][] pentT1 = {{'t','t','t'},{0,'t',0},{0,'t',0}};
		char[][] pentT2 = {{0,0,'t'},{'t','t','t'},{0,0,'t'}};
		char[][] pentT3 = {{'t',0,0},{'t','t','t'},{'t',0,0}};
		char[][] pentT4 = {{0,'t',0},{0,'t',0},{'t','t','t'}};
		char[][][] pentT = {pentT1,pentT2,pentT3,pentT4};
		
		char[][] pentZ1 = {{0,'z','z'},{0,'z',0},{'z','z',0}};
		char[][] pentZ2 = {{'z',0,0},{'z','z','z'},{0,0,'z'}};
		char[][] pentZ3 = {{'z','z',0},{0,'z',0},{0,'z','z'}};
		char[][] pentZ4 = {{0,0,'z'},{'z','z','z'},{'z',0,0}};
		char[] pentZ = {pentZ1,pentZ2,pentZ3,pentZ4};
		
		char[][] pentU1 = {{'u','u','u'},{'u',0,'u'}};
		char[][] pentU2 = {{'u','u'},{0,'u'},{'u','u'}};
		char[][] pentU3 = {{'u',0,'u'},{'u','u','u'}};
		char[][] pentU4 = {{'u','u'},{'u',0},{'u','u'}};
		char[] pentU = {pentU1,pentU2,pentU3,pentU4};
		
		char[][] pentN1 = {{'n','n','n',0},{0,0,'n','n'}};
		char[][] pentN2 = {{'n',0},{'n','n'},{0,'n'},{0,'n'}};
		char[][] pentN3 = {{0,'n','n','n'},{'n','n',0,0}};
		char[][] pentN4 = {{'n',0},{'n',0},{'n','n'},{0,'n'}};
		char[][] pentN5 = {{'n','n',0,0},{0,'n','n','n'}};
		char[][] pentN6 = {{0,'n'},{0,'n'},{'n','n'},{'n',0}};
		char[][] pentN7 = {{'n','n','n',0},{0,0,'n','n'}};
		char[][] pentN8 = {{0,'n'},{'n','n'},{'n',0},{'n',0}};
		char[] pentN = {pentN1,pentN2,pentN3,pentN4,pentN5,pentN6,pentN7,pentN8};
		
		char[][] pentL1 = {{'l',0,0,0,},{'l','l','l','l'}};
		char[][] pentL2 = {{0,'l'},{0,'l'},{0,'l'}{'l','l'}};
		char[][] pentL3 = {{'l','l','l','l'},{0,0,0,'l'}};
		char[][] pentL4 = {{'l','l'},{'l',0},{'l',0},{'l',0}};
		char[][] pentL5 = {{'l','l'},{0,'l'},{0,'l'},{0,'l'}};
		char[][] pentL6 = {{'l','l','l','l'},{'l',0,0,0}};
		char[][] pentL7 = {{'l',0},{'l',0},{'l',0},{'l','l'}};
		char[][] pentL8 = {{0,0,0,'l'},{'l','l','l','l'}};
		char[] pentL = {pentL1,pentL2,pentL3,pentL4,pentL5,pentL6,pentL7,pentL8};
		
		
		char[] pentArray ={pentP, pentX, pentF, pentV, pentW, pentY, pentI, pentT, pentZ, pentU, pentN, pentL};

		Scanner input = new Scanner(System.in);
		System.out.println("Type the length of the grid.");
		int lengthGrid = input.nextInt();
		System.out.println("Type the width of the grid.");
		int widthGrid = input.nextInt();

		int area = lengthGrid * widthGrid;
		char[][] grid = new char[lengthGrid][widthGrid];


		if(area%5 != 0){
			System.out.println("Not possible.");
		}
		if else(area > 60){
			System.out.println("Definetely not possible!");
		}
		if else(grid[1][5] || grid[5][1]){ //????? or grid.length == 5 && grid[0].length == 1
			System.out.println("True."); //show??
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		
		for(int i=0; i<lengthGrid; i++){
			for(int j =0; j<widthGrid; j++){
				rotateMatrix(pentArray);
				flipMatrix(pentArray);
			}
		}
	}

  public static char[][] rotateMatrix(char[][] a){
    int n = a.length;
    int m = a[0].length;
    char[][] tempMatrix = a[m][n];
    for(int i=0; i<m; i++){
      for(int j=0; j<n; j++){
        tempMatrix[i][j] = a[j][i];
      }
    }
    rotatedMatrix[][]=flipMatrix(tempMatrix);
    return rotatedMatrix;
  }

  //flipping
  public static char[][] flipMatrix(char[][] a){
    int n = a.length;
    int m = a[0].length;
    char[][] flipMatrix = a[m][n]; //do we need a temp matrix/value??
    for(int i=0; i<m; i++){
      for(int j=0; j<n; j++){
        flipMatrix[i][j] = a[i][a[0].length-1-j];
      }
    }
    return flipMatrix;
  }*/
}
