import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class project1{
	public static void main(String[] args){
		char[][][] pentP = {{{'p','p'},{'p','p'},{'p','0'}},{{'p','p'},{'p','p'},{'p','0'}},{{'p','0'},{'p','p'},{'p','p'}},{{'0','p'},{'p','p'},{'p','p'}},{{'p','p','p'},{'p','p','0'}},{{'p','p','p'},{'0','p','p'}},{{'p','p','0'},{'p','p','p'}},{{'0','p','p'},{'p','p','p'}}};

		char[][][] pentX = {{{'0','x','0'},{'x','x','x'},{'0','x','0'}}};

		char[][][] pentF = {{{'0','f','0'},{'f','f','f'},{'0','0','f'}},{{'0','f','f'},{'f','f','0'},{'0','f','0'}},{{'f','0','0'},{'f','f','f'},{'0','f','0'}},{{'0','f','0'},{'0','f','f'},{'f','f','0'}},{{'0','0','f'},{'f','f','f'},{'0','f','0'}},{{'f','f','0'},{'0','f','f'},{'0','f','0'}},{{'0','f','0'},{'f','f','f'},{'f','0','0'}},{{'0','f','0'},{'f','f','0'},{'0','f','f'}}};

		char[][][] pentV = {{{'v','0','0'},{'v','0','0'},{'v','v','v'}},{{'v','v','v'},{'v','0','0'},{'v','0','0'}},{{'0','0','v'},{'0','0','v'},{'v','v','v'}},{{'v','v','v'},{'0','0','v'},{'0','0','v'}}};

		char[][][] pentW = {{{'w','0','0'},{'w','w','0'},{'0','w','w'}},{{'0','0','w'},{'0','w','w'},{'w','w','0'}},{{'w','w','0'},{'0','w','w'},{'0','0','w'}},{{'0','w','w'},{'w','w','0'},{'w','0','0'}}};

		char[][][] pentY = {{{'0','0','y','0'},{'y','y','y','y'}},{{'0','y'},{'y','y'},{'0','y'},{'0','y'}},{{'y','y','y','y'},{'0','y','0','0'}},{{'y','0'},{'y','0'},{'y','y'},{'y','0'}},{{'y','y','y','y'},{'0','0','y','0'}},{{'y','0'},{'y','y'},{'y','0'},{'y','0'}},{{'0','y','0','0'},{'y','y','y','y'}},{{'0','y'},{'0','y'},{'y','y'},{'0','y'}}};

		char[][][] pentI = {{{'i','i','i','i','i'}},{{'i'},{'i'},{'i'},{'i'},{'i'}}};

		char[][][] pentT = {{{'t','t','t'},{'0','t','0'},{'0','t','0'}},{{'0','0','t'},{'t','t','t'},{'0','0','t'}},{{'t','0','0'},{'t','t','t'},{'t','0','0'}},{{'0','t','0'},{'0','t','0'},{'t','t','t'}}};

		char[][][] pentZ = {{{'0','z','z'},{'0','z','0'},{'z','z','0'}},{{'z','0','0'},{'z','z','z'},{'0','0','z'}},{{'z','z','0'},{'0','z','0'},{'0','z','z'}},{{'0','0','z'},{'z','z','z'},{'z','0','0'}}};

		char[][][] pentU = {{{'u','u','u'},{'u','0','u'}},{{'u','u'},{'0','u'},{'u','u'}},{{'u','0','u'},{'u','u','u'}},{{'u','u'},{'u','0'},{'u','u'}}};

		char[][][] pentN = {{{'n','n','n','0'},{'0','0','n','n'}},{{'n','0'},{'n','n'},{'0','n'},{'0','n'}},{{'0','n','n','n'},{'n','n','0','0'}},{{'n','0'},{'n','0'},{'n','n'},{'0','n'}},{{'n','n','0','0'},{'0','n','n','n'}},{{'0','n'},{'0','n'},{'n','n'},{'n','0'}},{{'n','n','n','0'},{'0','0','n','n'}},{{'0','n'},{'n','n'},{'n','0'},{'n','0'}}};

		char[][][] pentL = {{{'l','0','0','0',},{'l','l','l','l'}},{{'0','l'},{'0','l'},{'0','l'},{'l','l'}},{{'l','l','l','l'},{'0','0','0','l'}},{{'l','l'},{'l','0'},{'l','0'},{'l','0'}},{{'l','l'},{'0','l'},{'0','l'},{'0','l'}},{{'l','l','l','l'},{'l','0','0','0'}},{{'l','0'},{'l','0'},{'l','0'},{'l','l'}},{{'0','0','0','l'},{'l','l','l','l'}}};

		char[][][][] pentSet = {pentP, pentX, pentF, pentV, pentW, pentY, pentI, pentT, pentZ, pentU, pentN, pentL};

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		hmap.put('p', 0);
		hmap.put('x', 1);
		hmap.put('f', 2);
		hmap.put('v', 3);
		hmap.put('w', 4);
		hmap.put('y', 5);
		hmap.put('i', 6);
		hmap.put('t', 7);
		hmap.put('z', 8);
		hmap.put('u', 9);
		hmap.put('n', 10);
		hmap.put('l', 11);
		
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
		else if(area > 60){
			System.out.println("Definetely not possible!");
		}
		else if(area==5){ 
			System.out.println("True."); //show??
		}
		
		System.out.println("Which pentatoniminos should be used?");
		int numberOfPents = area / 5;
		int[] pentsUsed = new int[numberOfPents];
		for (int i = 0; i < numberOfPents; i++){
			char tmpChar = input.next().charAt(0);
			pentsUsed[i] = hmap.get(tmpChar);
		}
		
		

	}
	
	public static void placePentomino(char[][] grid, char[][][][] pentSet, int[] pentsUsed, int progress){
		char pent = pentsUsed[progress];
		int pentIndex = hmap.get(pent);
		for (int variant = 0; variant < pentSet[pentIndex].length; variant++){
			if (checkOutOfBounds(grid, pent, variant, x, y) || checkOverlap(grid, pent, variant, x, y)){
				for (int i = 0; i < pentSet[pentIndex][variant].length; j++){
					for(int j = y; j < pentSet[pentIndex][variant][0].length; j++){
						if (pentSet[pentIndex][variant][i][j] != 0){
							grid[x+i][y+j] = pentSet[pentIndex][variant][i][j];
							placePentomino(grid, pentSet, pentsUsed, progress+1);
							removePentomino(grid, pent);
						}
					}
				}
			}
		}
	}
	
	public static int emptyBlocks(char[][] grid, char[][][][] pentSet, char[] pentsUsed){ //recursion
		int height = grid.length;
		int width = grid[0].length;
		
		int emptyBoxes=0;
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				if(grid[i][j]=='0'){
					grid[i][j]='1';
					emptyBoxes++;
					if(i != 0){
						emptyBlocks(grid[i-1][j], pentSet, pentsUsed);
					}
					if(i != height)
					emptyBlocks(grid[i+1][j], pentSet, pentsUsed);
					if(j != 0){
						emptyBlocks(grid[i][j-1], pentSet, pentsUsed);
					}
					if(j != width){
						emptyBlocks(grid[i][j+1], pentSet, pentsUsed);
					}
				}
			}
		}
		return emptyBoxes;
	}
	
	public static void removePentomino(char[][] grid, char pent) {
		for (int i=0; i<grid.length; i++) {
			for (int j=0; j<grid[0].length; j++) {
				if (grid[i][j]==pent) {
					grid[i][j]='0';
				}
			}
		}
	}
	
	public static boolean outOfBound(char[][] grid, char pent) {
		int heightGrid = grid.length;
		int widthGrid = grid[0].length;
		int heigthPent = pent.length;
		int widthPent = pent[0], length;
		
		for(int i=0; i<heightGrid; i++){
			for(int j=0; j<widthGrid; j++){
				if(heigthGrid-i < heigthPent){
					return false;
				}
				if(widthGrid-j < widthPent){
					return false;
				}	
			}
		}
	}
	public static boolean checkOverlap(char[][] grid, char pent, int variant, int x, int y) {
		int p = hmap.get(pent); //this is the pentomino used
		if(grid[x][y]=='0') {
			for (int i=0; i<pentSet[p][variant].length; i++) {
				for(int j=0; j<pentSet[p][variant][i].length; j++) {
					if(pentSet[p][variant][i][j]=pent && grid[x+i][y+j]!='0') {
						return false;
						}
					}
				}
			} else {
			return false;
		}
		return true;
	}
}
