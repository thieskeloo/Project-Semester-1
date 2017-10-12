import java.util.Scanner;	
import java.util.HashMap;

public class Project1{
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
		for (int i = 0; i < grid.length; i++){
			for (int j = 0; j < grid[0].length; j++){
				grid[i][j] = '0';
			}
		}
		
		if(area%5 != 0){
			throw new IllegalArgumentException("Not possible.");
		}
		else if(area > 60){
			throw new IllegalArgumentException("YOU STUPID IDIOT!");
		}
		
		System.out.println("Which pentatoniminos should be used?");
		int numberOfPents = area / 5;
		char[] pentsUsed = new char[numberOfPents];
		for (int i = 0; i < numberOfPents; i++){
			char tmpChar = input.next().charAt(0);
			pentsUsed[i] = tmpChar;
		}
		
		placePentomino(grid, pentSet, pentsUsed, 0);

	}
	
	public static void placePentomino(char[][] grid, char[][][][] pentSet, char[] pentsUsed, int progress){
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
		int pentIndex = hmap.get(pentsUsed[progress]);
		char pent = pentsUsed[progress];
		
		System.out.println(grid.length + " " + grid[0].length);
		
		for (int x = 0; x < grid.length; x++){
			for (int y = 0; y < grid[0].length; y++){
				for (int variant = 0; variant < pentSet[pentIndex].length; variant++){
					System.out.println("oub is " + checkOutOfBounds(grid, pent, pentSet, variant, x, y ) + " for x y " + x + " " + y + " for pent " + pent + "" + variant);
					if (checkOutOfBounds(grid, pent, pentSet, variant, x, y) == true){
						System.out.println("overlap is" + checkOverlap(grid, pent, pentSet, variant, x, y ));
						if(checkOverlap(grid, pent, pentSet, variant, x, y ) == true){
							for (int i = 0; i < pentSet[pentIndex][variant].length; i++){
								for(int j = y; j < pentSet[pentIndex][variant][0].length; j++){
									if (pentSet[pentIndex][variant][i][j] != 0){
										grid[x+i][y+j] = pentSet[pentIndex][variant][i][j];
									}
								}
							}
							System.out.println("variant and number of variables" + variant + " " + pentSet[pentIndex].length);
							if (variant < pentSet[pentIndex].length - 1){
								System.out.println("progress and  number of pents used " + progress + " " + pentsUsed.length);
								if (progress < pentsUsed.length - 1) {
									placePentomino(grid, pentSet, pentsUsed, progress+1);
									removePentomino(grid, pent);
								} 
								for (int k = 0; k < grid.length; k++){
									for (int l = 0; k < grid[0].length; k++){
										System.out.print(grid[k][l]);
									}
									System.out.println("");
								}
							}
						}
					}
				}
			}
		}
	}
	
	/*public static int emptyBlocks(char[][] grid, char[][][][] pentSet, char[] pentsUsed){ //recursion
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
	}*/
	
	public static void removePentomino(char[][] grid, char pent) {
		for (int i=0; i<grid.length; i++) {
			for (int j=0; j<grid[0].length; j++) {
				if (grid[i][j]==pent) {
					grid[i][j]='0';
				}
			}
		}
	}
	
	public static boolean checkOutOfBounds(char[][] grid, char pent, char[][][][] pentSet, int variant, int x, int y) {
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
		
		int heightGrid = grid.length;
		int widthGrid = grid[0].length;
		int heightPent = pentSet[hmap.get(pent)][variant].length;
		int widthPent = pentSet[hmap.get(pent)][variant][0].length;
		
		
		/*System.out.println("the pent is " + pent + "" + variant + " pentheight is " + heightPent + " pentwidth is " + widthPent);
		System.out.println("x is " + x + " gridheight is " + heightGrid + " y is " + y + " gridwidth is " + widthGrid);*/
		
		
		if ((x + heightPent > heightGrid) || (y + widthPent > widthGrid)){
			return false;
		}
		
		return true;
	}
	
	public static boolean checkOverlap(char[][] grid, char pent, char[][][][] pentSet, int variant, int x, int y) {
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
		
		int pentIndex = hmap.get(pent); //this is the pentomino used
		
		for (int i = 0; i < pentSet[pentIndex][variant].length; i++){
			for(int j = 0; j < pentSet[pentIndex][variant][0].length; j++){
				System.out.println(grid[x+i][y+j] + " " + pentSet[pentIndex][variant][i][j]);
				if ((grid[x+i][y+j] != '0') && (pentSet[pentIndex][variant][i][j] != '0')){
					return false;
				}					
			}
		}
		return true;
	}
}
