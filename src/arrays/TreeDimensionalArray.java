package arrays;

public class TreeDimensionalArray {
    public static void main(String[] args) {

        int [][][] multi = {{{1}}, {{1}, {2}}};

        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                for (int k = 0; k < multi[i][j].length; k++) {
                    System.out.print("arr[" + i + "][" + j + "][" + k + "] = ");
                    System.out.println(multi[i][j][k]);

                }

            }

        }

    }
}
