import java.util.Random;

public class MatrixManipulation {
    static double[][] generateMatrix(int rows, int cols) {
        double[][] mat = new double[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10) + 1; // Random 1-10
        return mat;
    }
    static double[][] transpose(double[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        double[][] trans = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                trans[j][i] = mat[i][j];
        return trans;
    }
    static double determinant2x2(double[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }
    static double determinant3x3(double[][] mat) {
        return mat[0][0]*(mat[1][1]*mat[2][2]-mat[1][2]*mat[2][1])
             - mat[0][1]*(mat[1][0]*mat[2][2]-mat[1][2]*mat[2][0])
             + mat[0][2]*(mat[1][0]*mat[2][1]-mat[1][1]*mat[2][0]);
    }
    static double[][] inverse2x2(double[][] mat) {
        double det = determinant2x2(mat);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = mat[1][1]/det;
        inv[0][1] = -mat[0][1]/det;
        inv[1][0] = -mat[1][0]/det;
        inv[1][1] = mat[0][0]/det;
        return inv;
    }
    static double[][] inverse3x3(double[][] mat) {
        double det = determinant3x3(mat);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        inv[0][0] = (mat[1][1]*mat[2][2]-mat[1][2]*mat[2][1])/det;
        inv[0][1] = -(mat[0][1]*mat[2][2]-mat[0][2]*mat[2][1])/det;
        inv[0][2] = (mat[0][1]*mat[1][2]-mat[0][2]*mat[1][1])/det;
        inv[1][0] = -(mat[1][0]*mat[2][2]-mat[1][2]*mat[2][0])/det;
        inv[1][1] = (mat[0][0]*mat[2][2]-mat[0][2]*mat[2][0])/det;
        inv[1][2] = -(mat[0][0]*mat[1][2]-mat[0][2]*mat[1][0])/det;
        inv[2][0] = (mat[1][0]*mat[2][1]-mat[1][1]*mat[2][0])/det;
        inv[2][1] = -(mat[0][0]*mat[2][1]-mat[0][1]*mat[2][0])/det;
        inv[2][2] = (mat[0][0]*mat[1][1]-mat[0][1]*mat[1][0])/det;
        return inv;
    }
    static void displayMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row) System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] mat2x2 = generateMatrix(2,2);
        double[][] mat3x3 = generateMatrix(3,3);
        System.out.println("2x2 Matrix:");
        displayMatrix(mat2x2);
        System.out.println("Transpose:");
        displayMatrix(transpose(mat2x2));
        System.out.println("Determinant: " + determinant2x2(mat2x2));
        System.out.println("Inverse:");
        displayMatrix(inverse2x2(mat2x2));
        System.out.println("\n3x3 Matrix:");
        displayMatrix(mat3x3);
        System.out.println("Transpose:");
        displayMatrix(transpose(mat3x3));
        System.out.println("Determinant: " + determinant3x3(mat3x3));
        System.out.println("Inverse:");
        displayMatrix(inverse3x3(mat3x3));
    }
}
