package _0921_0927_Elágazás_Ciklus;

public class Ciklusok {

    public static void main(String[] args) {
        /*int n = 1;
        int x = 2;
        while (n <= 100){
            System.out.println(n++ + ".:" + x);
            x = x + 2;*/

        /*int n = 1;
        for (int x = 1; x <= 200; x++) {
            if (x % 2 == 0) {
                System.out.println(n++ + ".:" + x);
            }
        }*/
        /*int n = 1;
        for (int x = 7; x <= 700; x++) {
            if (x % 7 == 0) {
                System.out.println(n++ + ".:" + x);
            }
        }*/


        /*int szum = 0;
        for (int n = 1; n <= 42; n++) {
            szum = szum + n;
        }
        System.out.println(szum);*/

        /*long szum = 1;
        for (long n = 1; n <= 20; n++) {
            szum = szum * n;
            System.out.println(n + ".:" + szum);
        }*/

        /*for (int i = 10; i > 0; i--){
            System.out.println(i);
        }*/

        /*int i = 10000;
        while (i < 20000) {
            if (i % 89==0 && i % 103 == 0){
                System.out.println(i);
            }
            i++;
        } */

        /* for (int J = 10000; J < 20000; J++){
            if (J % 89 == 0 && J % 103 == 0){
                System.out.println(J);
            }
        } */

        /*int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum = sum + 1;
        }
        System.out.println(sum);*/

        /*Mennyi a 200-nál kisebb, 7-tel osztható pozitív számok összege?*/

        /*int num = 1;
        int sum = 0;
        while (num< 200){
            if (num % 7 == 0) {
                sum += num;
            }
            num++;
            }
        System.out.println(sum);*/

        /*Mennyi a 100 és 200 közötti páros számok összege?*/

        /* int sum = 0;
        for (int number = 100; number < 200 ; number ++ ){
            if(number % 2 == 0){
                sum = sum + number;
            }
        }
        System.out.println(sum); */


        /*int i = 0;
        do{
            System.out.println("do while");
            i++;
        } while (i<5);*/

        /*int j = 0;
        while (j<5){
            System.out.println("while");
            j++;
        }*/

        /*for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i + " " + j);
            }
        }*/

        // Mennyi a 200-nál kisebb, 7-tel osztható pozitív számok összege?

         int sum = 0;
        for (int i = 0; i < 200; i++) {
            if(i % 7 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);

       /* int sum = 0;
        int i = 0;
        while(i < 200){
            sum = sum + i;
            i = i +7;
        }
        System.out.println(sum); */





    }
}

