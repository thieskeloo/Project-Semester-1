import java.util.Scanner;

public class Project1{
	public static void main(String[] args){
		char[][] pentP = {{'p','p'},{'p','p'},{'p',null}}; //3x3 nxm
		char[][] pentX = {{null,'x',null},{'x','x','x'},{null,'x',null}}; //3x3 mxm

		char[][] pentF1 = {{null,'f',null},{'f','f','f'},{null,null,'f'}};
		char[][] pentF2 = {{null,'f','f'},{'f','f',null},{null,'f',null}};
		char[][] pentF3 = {{'f',null,null},{'f','f','f'},{null,'f',null}};
		char[][] pentF4 = {{null,'f',null},{null,'f','f'},{'f','f',null}};
		char[][] pentF5 = {{null,null,'f'},{'f','f','f'},{null,'f',null}};
		char[][] pentF6 = {{'f','f',null},{null,'f','f'},{null,'f',null}};
		char[][] pentF7 = {{null,'f',null},{'f','f','f'},{'f',null,null}};
		char[][] pentF8 = {{null,'f',null},{'f','f',null},{null,'f','f'}};
		char[] pentF = {pentF1,pentF2,pentF3,pentF4,pentF5,pentF6,pentF7,pentF8};

		char[][] pentV1 = {{'v',null,null},{'v',null,null},{'v','v','v'}};
		char[][] pentV2 = {{'v','v','v'},{'v',null,null},{'v',null,null}};
		char[][] pentV3 = {{null,null,'v'},{null,null,'v'},{'v','v','v'}};
		char[][] pentV4 = {{'v','v','v'},{null,null,'v'},{null,null,'v'}};
		char[] pentV = {pentV1,pentV2,pentV3,pentV4};

		char[][] pentW1 = {{'w',null,null},{'w','w',null},{null,'w','w'}};
		char[][] pentW2 = {{null,null,'w'},{null,'w','w'},{'w','w',null}};
		char[][] pentW3 = {{'w','w',null},{null,'w','w'},{null,null,'w'}};
		char[][] pentW4 = {{null,'w','w'},{'w','w',null},{'w',null,null}};
		char[] pentW = {pentW1,pentW2,pentW3,pentW4};

		char[][] pentY1 = {{null,null,'y',null},{'y','y','y','y'}};
		char[][] pentY2 = {{null,'y'},{'y','y'},{null,'y'},{null,'y'}};
		char[][] pentY3 = {{'y','y','y','y'},{null,'y',null,null}};
		char[][] pentY4 = {{'y',null},{'y',null},{'y','y'},{'y',0}};
		char[][] pentY5 = {{'y','y','y','y'},{null,null,'y',null}};
		char[][] pentY6 = {{'y',null},{'y','y'},{'y',null},{'y',null}};
		char[][] pentY7 = {{null,'y',null,null},{'y','y','y','y'}};
		char[][] pentY8 = {{null,'y'},{null,'y'},{'y','y'},{null,'y'}};
		char[] pentY = {pentY1,pentY2,pentY3,pentY4,pentY5,pentY6,pentY7,pentY8};

		char[][] pentI1 = {{'i','i','i','i','i'}};
		char[][] pentI2 = {{'i'},{'i'},{'i'},{'i'},{'i'}};
		char[][][] pentI ={pentI1,pentI2};

		char[][] pentT1 = {{'t','t','t'},{null,'t',null},{null,'t',null}};
		char[][] pentT2 = {{null,null,'t'},{'t','t','t'},{null,null,'t'}};
		char[][] pentT3 = {{'t',null,null},{'t','t','t'},{'t',null,null}};
		char[][] pentT4 = {{null,'t',null},{null,'t',null},{'t','t','t'}};
		char[][][] pentT = {pentT1,pentT2,pentT3,pentT4};

		char[][] pentZ1 = {{null,'z','z'},{null,'z',null},{'z','z',null}};
		char[][] pentZ2 = {{'z',null,null},{'z','z','z'},{null,null,'z'}};
		char[][] pentZ3 = {{'z','z',null},{null,'z',null},{null,'z','z'}};
		char[][] pentZ4 = {{null,null,'z'},{'z','z','z'},{'z',null,null}};
		char[] pentZ = {pentZ1,pentZ2,pentZ3,pentZ4};

		char[][] pentU1 = {{'u','u','u'},{'u',null,'u'}};
		char[][] pentU2 = {{'u','u'},{null,'u'},{'u','u'}};
		char[][] pentU3 = {{'u',null,'u'},{'u','u','u'}};
		char[][] pentU4 = {{'u','u'},{'u',null},{'u','u'}};
		char[] pentU = {pentU1,pentU2,pentU3,pentU4};

		char[][] pentN1 = {{'n','n','n',null},{null,null,'n','n'}};
		char[][] pentN2 = {{'n',null},{'n','n'},{null,'n'},{null,'n'}};
		char[][] pentN3 = {{null,'n','n','n'},{'n','n',null,null}};
		char[][] pentN4 = {{'n',null},{'n',null},{'n','n'},{null,'n'}};
		char[][] pentN5 = {{'n','n',null,null},{null,'n','n','n'}};
		char[][] pentN6 = {{null,'n'},{null,'n'},{'n','n'},{'n',null}};
		char[][] pentN7 = {{'n','n','n',null},{null,null,'n','n'}};
		char[][] pentN8 = {{null,'n'},{'n','n'},{'n',null},{'n',null}};
		char[] pentN = {pentN1,pentN2,pentN3,pentN4,pentN5,pentN6,pentN7,pentN8};

		char[][] pentL1 = {{'l',null,null,null,},{'l','l','l','l'}};
		char[][] pentL2 = {{null,'l'},{null,'l'},{null,'l'}{'l','l'}};
		char[][] pentL3 = {{'l','l','l','l'},{null,null,null,'l'}};
		char[][] pentL4 = {{'l','l'},{'l',null},{'l',null},{'l',null}};
		char[][] pentL5 = {{'l','l'},{null,'l'},{null,'l'},{null,'l'}};
		char[][] pentL6 = {{'l','l','l','l'},{'l',null,null,null}};
		char[][] pentL7 = {{'l',null},{'l',null},{'l',null},{'l','l'}};
		char[][] pentL8 = {{null,null,null,'l'},{'l','l','l','l'}};
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
