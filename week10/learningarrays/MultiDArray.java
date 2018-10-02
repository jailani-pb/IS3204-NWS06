package week10.learningarrays;

public class MultiDArray {

	public static void main(String[] args) {
		int[][][] values = new int[3][3][3];
		values[1][1][2] = 14;
		values[2][0][1] = 15;
		
		for(int x = 0; x < values.length; x++) {
			for(int y = 0; y < values[x].length; y++) {
				for(int z = 0; z < values[x][y].length; z++) {
					System.out.println(values[x][y][z]);
				}
			}
		}
	}
	
}
