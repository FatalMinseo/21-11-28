
public class Ex05 {

	public static void main(String[] args) {

		int[][] matrix = new int[7][7];
		int n = 0;
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= 6; j++) {
				if (Math.abs(i - 3) + Math.abs(j - 3) <= 3) {// Math.abs() <- Àý´ë°ª
					n++;
					matrix[i][j] = n;
					if (matrix[i][j] < 10) {
						System.out.print(" " + matrix[i][j] + " ");
					} else {
						System.out.print(matrix[i][j] + " ");
					}
				} else {
					System.out.print(" 0 ");
				}
			}
			System.out.println();
		}
	}
}
