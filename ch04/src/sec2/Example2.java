package sec2;

public class Example2 { //2차원과 3차원
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[][] arr2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}, {20, 40, 60}};      //{0.0,0.1,0.2} -- 로 시작
        int[][][] arr3 = {{{10, 20}, {30, 40}, {10, 20}}, {{10, 20}, {30, 40}, {10, 20}}};

        System.out.println(arr2.length);

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 0; i < arr3.length; i++) {    //면
            for (int j = 0; j < arr3[0].length; j++) {    //줄
                for (int k = 0; k < arr3[0][0].length; k++) {
                    System.out.print(arr3[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println("-------------------");

        }
    }
}


//[]qoduf {}계산 ()조건문
