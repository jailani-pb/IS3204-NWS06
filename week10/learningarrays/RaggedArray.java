package week10.learningarrays;

public class RaggedArray {

	public static void main(String[] args) {
		int[][] value = 
			{
					{1, 2},
					{3, 4, 5},
					{6},
					{7, 8}
			};
		
		for(int x = 0; x < value.length; x++) {
			for(int y = 0; y < value[x].length; y++) {
				System.out.println(value[x][y]);
			}
		}
	}
	
}
