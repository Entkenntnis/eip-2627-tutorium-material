public class T4_A4_Normalizer {

    // Vorgegeben: gibt den größten Wert des übergebenen Arrays zurück
    public static double max(double[] values) {
        double max = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }

        return max;
    }

    public static double[] normalize(double[] values) {
        double maxValue = max(values);
        double[] output = new double[values.length];

        for (int i = 0; i < values.length; i++) {
            output[i] = values[i] / maxValue;
        }

        return output;
    }

    public static double maxMatrix(double[][] matrix) {
        double max = matrix[0][0]; // must exist

        for (int i = 0; i < matrix.length; i++) {
            if (max(matrix[i]) > max) {
                max = max(matrix[i]);
            }
        }

        return max;
    }

    public static double[][] normalizeMatrix(double[][] matrix) {
        double maxValue = maxMatrix(matrix);

        double[][] output = new double[matrix.length][];

        for (int i = 0; i < matrix.length; i++) {
            output[i] = new double[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                output[i][j] = matrix[i][j] / maxValue;
            }
        }

        return output;
    }

    // Hiermit können Sie Ihre Methode testen.
    public static void main(String[] args) {
        double[] values = { 2.0, 4.0, 8.0, 6.0 };
        System.out.println(java.util.Arrays.toString(normalize(values)));

        double[][] v2 = { { 2, 3 }, { 4, 50, 7 }, { 0.1 } };
        System.out.println(java.util.Arrays.deepToString(v2));
        System.out.println(maxMatrix((v2)));
        System.out.println(java.util.Arrays.deepToString(normalizeMatrix((v2))));
    }
}
