package _0928_1006_Metódusok_Tömbök;

public class Gyakorlas {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Írjon be egy számot");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("A szám pozitív");
        }
        else  {
            System.out.println("A szám negatív");
        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg az életkorod!");
        int number = scanner.nextInt();
        if (number <= 17){
            System.out.println("Este 9kor az ágyban a helyed");
        }
        else if (18 < number && number < 30 ) {
            System.out.println("Buli");
        }
        else {
            System.out.println("Este 8kor az ágyban a helyed");
        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a fizetésedet");
        int fizetes = scanner.nextInt();
        if (fizetes < 50000) {
            System.out.println("A fizetésem kisebb mint 50000");
        }
        else if (fizetes > 50000 && fizetes < 100000) {
                System.out.println("A fizetésem nagyobb, mint 50.000, de kisebb, mint 100.000");
            } else if (fizetes > 100000 && fizetes < 200000) {
                System.out.println("A fizetésem nagyobb mint 100000, de kisebb mint 200000");
            }
        else {
                System.out.println("A fizetésem nagyobb mint 200000");
            }*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Az első felhasználó adjon meg egy számot");
        int number1 = scanner.nextInt();
        System.out.println("A második felhasználó is adjon meg egy számot");
        int number2 = scanner.nextInt();
        if (number1 == number2){
            System.out.println("Egy kerékre jár az agyunk");
        }
        else {
            System.out.println("Ez most nem jött össze");
        }*/


        /*Scanner scanner = new Scanner (System.in);
        System.out.println("Adja meg a testméretét");
        int testméret = scanner.nextInt();
        System.out.println("Adja meg a testtömegét");
        int testtömeg = scanner.nextInt();*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, válassz egy állatot és én megpróbálom kitalálni.");
        System.out.println("Az állat amire gondoltál emlős?");
        String valasz = scanner.nextLine();
        if (valasz.equals("nem")) {
            System.out.println("Szerintem madárra gondoltál");
        }
            else if (valasz.equals("igen")){
                System.out.println("Az állat amire gondoltál egy házi állat?");
            valasz = scanner.nextLine();
            if (valasz.equals("nem")){
                System.out.println("Szerintem az elefántra gondoltál.");
            } else if (valasz.equals("igen")){
                System.out.println("Szerintem a kutyára gondoltál");
            }
            
        }*/

        /*Scanner scanner = new Scanner (System.in);
        int year = scanner.nextInt();
        for (int year = 1800 ; year <= 2000; year++)
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
            System.out.println(year);
        } */

        /*Írj programot, ami egy egész számról (egy változó értékéről) eldönti, hogy az prím szám-e!
                Prímek azok a számok, amiknek az 1-en és önmagán kívül nincs más osztójuk.*/


        /*Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int k = 0;
        if (x > 1) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("prím");
            } else {
                System.out.println("nem prím");
            }

        }*/

        /*Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean prime = true;
        int counter = 0;
        int i = 1;
        while (i <= x) {
            if (x % i ==0){
                prime = false;
            }
            x++;
            if(prime){
                System.out.println(prime);
            }
        }*/

        /*Írjuk ki a számokat 1-től 50-ig! Azonban mindig, amikor egy 3-mal osztható számotint j = írunk ki, a szám helyett azt írjuk ki, hogy “fizz”; amikor egy 5-tel osztható számot írnánk ki, akkor azt írjuk ki, hogy “buzz”; amikor 3-mal és 5-tel osztható számot írnánk ki, azt írjuk ki, hogy “fizzbuzz”.*/

        /*for (int j = 1; j < 51; j++){
            if (j %  3== 0 && j % 5 == 0){
                System.out.println("Fizzbuzz");
            }
            else if (j % 3== 0) {
                System.out.println("fizz");
            }
            else if (j % 5 == 0){
                System.out.println("buzz");
            }
            else {
                System.out.println(j);
            }
        }*/

        /*Írj programot, ami  kiszámolja a 80. Fibonacci-számot. A Fibonacci-számok definíciója:
        A nulladik Fibonacci-szám: 0.
        Az első Fibonacci-szám: 1.
        Minden további Fibonacci-szám pedig az első két Fibonacci-szám összege.
                pl. az első 10 Fibonacci-szám: 0, 1, 2, 3, 5, 8, 13, 21.
        (Megoldás: 23416728348467685)*/

        /*long n1 = 0, n2 = 1, n3;
        for (int i = 0; i < 79; i++){
            n3 = n2;
            n2 += n1;
            n1 = n3;
        }
        System.out.println(n2);*/

    }

    public static class Main {

        public static void main(String[] args) {
          int x = 10;
          int y = 2;
         /* int mul = x*y;
          int sum = x + mul -;
            System.out.println(sum);*/

            //  ++x+x*y-2
           //  int a = ++x +(x*y)-2;
            /* ++x;
            int mul = x*y;
            int sum = x + mul - 2;
            System.out.println(sum);*/

            //4. feladat
            System.out.println(x++ + x * ++y - 2 / y--);

            int mul = (x+1)*y;
            int div = 2 / y;
            int sum = x + mul - div;
            y--;
            x++;

        }

    }
}



