public class ZeroOne_triangle {
    public static void main(String[] args) {
        // int n = 5;
        // int ZeroOne = 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(ZeroOne + " ");
        //         if (ZeroOne == 1) {
        //             ZeroOne = 0;
        //         } else {
        //             ZeroOne = 1;
        //         }
        //     }
        //     System.out.println();
        // }

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }


    
    }
}
