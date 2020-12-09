package _0928_1006_Metódusok_Tömbök;

import java.util.Scanner;

public class _0927_OtthoniGyakorlas {
    public static void main(String[] args) {

        /*Legyenek x és y int változók. Legyen pl. x értéke 10, y értéke 2!
            Írj programot, ami kiszámítja az alábbi kifejezések értékét:*/

        /* x+x*y-2

        /* int x = 10;
        int y = 2;
        int mul = x * y;
        int sum = x + mul - 2;
        System.out.println(sum);*/

        /* ++x + x*y-2 */
        /* int a = ++x + x * y - 2;
        int mul = x * y;
        int sum = x + mul - 2;
        System.out.println(sum); */

        /* x++ + x*y-2 */

         /* int a = x++ + x * y - 2;
        int mul = x * y;
        int sum = x + mul - 2;
        System.out.println(sum); */

        /* x++ + x * ++y - 2 / y--; */

         /* int a = x++ + x * ++y - 2 / y--;
        int mul = x * ++y;
        int div = 2 / y--;
        int sum = mul - div + x;
        System.out.println(sum); */

        /* Írj programot, ami bekér a felhasználótól egy számot, és eldönti, hogy a szám páros-e vagy páratlan! */

        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy számot");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("páros");
        } else {
            System.out.println("páratlan");
        }*/

        /* Írj programot, ami bekéri a felhasználó korát, majd a korától függő módon köszönti a felhasználót!
        0 és 3 év közötti a köszöntés:
        "bru-bru-bru-bruuu, póó-póó, babuci", 3 és 13 között: “szióka”, 13 és 20 között: “csá”,
        20 felett “Jó napot kívánok”. Negatív érték esetén írja ki, hogy “Helló Marty Mcfly!”!
         */

        /* Scanner scanner = new Scanner (System.in);
        System.out.println("Add meg a korod");
        int age = scanner.nextInt();

        if (age > 0 && age < 3){
            System.out.println("Bruu bruu bruu");
        } else if (age > 3 && age < 13){
            System.out.println("Szióka");
        } else if (age > 13 && age < 20){
            System.out.println("Csá");
        } else if (age > 20){
            System.out.println("Jó napot kívánok!");
        } else {
            System.out.println("Helló Marty McFly");
        } */

        /* Módosítsd a fenti programot azzal, hogy a felhasználó nevét is kérd be,
        és a köszönés után írd ki ezt a nevet is (pl. "cső Aladár").Negatív érték esetén viszont továbbra is a
        “Helló Marty Mcfly!” szöveget írjuk ki! */

        /* Scanner scanner = new Scanner (System.in);
        System.out.println("Add meg a korod");
        System.out.println("Add meg a neved");
        int age = scanner.nextInt();
        String name = scanner.nextLine();
        if (age > 0 && age < 3){
            System.out.println("Bruu bruu bruu" + name);
        } else if (age > 3 && age < 13){
            System.out.println("Szióka" + name);
        } else if (age > 13 && age < 20){
            System.out.println("Csá" + name);
        } else if (age > 20){
            System.out.println("Jó napot kívánok!" + name);
        } else {
            System.out.println("Helló Marty McFly");
        } */

        /* Írj programot, ami bekéri a felhasználótól egy szín nevét. Ha a felhasználó azt írja be, hogy piros, a program írja ki,
                hogy "A piros tilos".
                Ha a felhasználó azt írja be, hogy zöld, a program írja ki, hogy "Szabad!!!".
                Minden egyéb esetben a program írja ki, hogy "Hibás input."! */

       /* Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();
        if (color.equals("piros")) {
            System.out.println("A piros Tilos");
        } else if (color.equals("zöld")) {
            System.out.println("Szabad");
        } else
            System.out.println("Hibás input"); */

        /* Írj programot, ami bekéri a felhasználó nemét (lehetséges értékek: no, ffi) és testmagasságát,
        majd kiírja, hogy a felhasználó az átlagnál alacsonyabb, magasabb, vagy a testmagassága éppen átlagos.
        A magyar férfiak átlagmagassága 176 cm, a nőké 164 cm. */

         /*Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a nemét és tesmagasságát");
        String gender = scanner.nextLine();
        int height = scanner.nextInt();

        if (gender.equals("no")) {
            if (height < 164) {
                System.out.println("alacsony");
            } else if (height == 164) {
                System.out.println("atlagos");
            } else {
                System.out.println("magas");
            }
        }
        else if (gender.equals("ffi")){
            if (height < 176) {
                System.out.println("alacsony");
            } else if  (height == 176) {
                System.out.println("atlagos");
            } else {
                System.out.println("magas");
            }
        } */

        /* Írj programot, ami az x int változó értékéről eldönti, hogy az szökőév-e. Szökőévek a következők:
        minden néggyel osztható év, kivéve a százzal is oszthatókat. Szökőévek viszont a 400-zal osztható évek.
        Vagyis a századfordulók évei közül csak azok szökőévek, amelyek 400-zal is oszthatók. */

         /* Scanner scanner = new Scanner((System.in));
        System.out.println("Írj be egy évszámot");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("szökőév");
        } else{
            System.out.println("nem szökőév");
        } */

        /* Írj programot, ami bekéri egy felhasználó testméretét és testsúlyát, majd kiszámolja az illető
        testtömegindexét, illetve megadja, hogy a felhasználó sovány, normál testsúlyú, vagy túlsúlyos. */

        /* Scanner scanner2 = new Scanner((System.in));
        System.out.println(("Adja meg a magasságát (Méterben)"));
        double height = scanner2.nextDouble();
        System.out.println("Adja meg súlyát (Kilogrammban)");
        double weight = scanner2.nextDouble();
        double index = weight / (height * height);
        System.out.println("Testtömegindex:");
        if (index <= 18.5){
            System.out.println("Sovány");
        } else if (index > 18.5 && index < 24.99){
            System.out.println("Normális");
        } else {
            System.out.println("Túlsúlyos");
        } */

        /* Írj programot, ami bekéri a felhasználó fizetésének összegét! Amennyiben az összeg kisebb mint 50.000 akkor írja ki,
                hogy „A fizetésem kisebb mint 50.000”,
        ha az összeg 50.000 és 100.000 között van akkor írja ki, hogy „A fizetésem nagyobb, mint 50.000, de kisebb,
        mint 100.000”, ha az összeg 100.000 és 200.000 között van akkor írja ki,
                hogy „A fizetésem nagyobb, mint 100.000, de kisebb, mint 200.000”, ha az összeg 200.000 felett van
        akkor írja ki, hogy „A fizetésem nagyobb, mint 200.000”. */

        /* Scanner scanner = new Scanner((System.in));
        System.out.println("Add meg a fizetésed");
        int salary = scanner.nextInt();
        if (salary < 50000) {
            System.out.println("A fizetésem kisebb mint 50.000");
        } else if (salary >= 50000 && salary < 100000){
                System.out.println("A fizetésem nagyobb mint 50000 de kisebb mint 100000");
        } else if (salary >= 100000 && salary < 200000){
            System.out.println("A fizetésem nagyobb mint 100000 de kisebb mint 200000");
        } else {
            System.out.println("A fizetésem nagyobb mint 200000");
        } */

        /* Írj programot, ami kiírja az első 100 természetes páros számot! Írd meg a programot while ciklussal!
                o   A kiíráskor írjunk ki egy sorszámot is! A program kimenete ilyesmi legyen:
        1.: 2
        2.: 4
        3.: 6
                .
    	.
   	 .
        100: 200

        int x = 1;
        int y = 2;
        while (y <= 200){
            System.out.println(x++ + ".:" + y);
            y = y + 2;
        } */


        /* Írj programot, ami kiírja az első 100 természetes 7-el osztható számot! */

        /* int x = 1;
        int y = 7;
        while (y <= 700){
            System.out.println(x++ + "::" + y);
            y = y + 7;
        }  */

        /*int x = 1;
        for (int y = 7; y <= 700; y++){
            if(y % 7 == 0){
                System.out.println(x++ + ".:" + y++);
            }
        }*/

        /* Írj programot, ami kiírja az első 42 természetes szám összegét! */

        /* int sum = 0;
        for (int x = 1; x <= 42 ; x++){
            sum = sum + x;
        }
        System.out.println(sum); */

        /* int x = 1;
        int sum = 0;
        while (x <= 42){
            sum = sum + x;
            x++;
        }
        System.out.println(sum); */

        /* Írj programot, ami kiírja az első 20 pozitív egész szám szorzatát (a nullát nem beleértve)! */

        /* long sum = 1;
        for (long x = 1; x <= 20; x++){
            sum = sum * x;
        }
        System.out.println(sum); */

        /* long sum1 = 1;
        long x1 = 1;
        while (x1 <= 20){
            sum1 = sum1 * x1;
            x1++;
        }
        System.out.println(sum1); */

        /* Írjuk ki 10-1-ig a természetes számokat visszafelé! */

        /* for (int x = 10; x >= 1; x--) {
            System.out.println(x);
        } */

        /* int x = 10;
        while(x >= 1){
            System.out.println(x);
            x--;
        } */

        /* Hány olyan szám van 10.000 és 20.000 között, ami osztható 89-cel és 103-mal is? */

        /* int x = 10000;
        while(x <= 20000){
            if (x % 89 == 0 && x % 103 == 0){
                System.out.println(x);
            }
            x++;
        } */

        /* Mennyi a 100 és 200 közötti páros számok összege? */

        /* int x = 100;
        int sum = 1;
        while (x <= 200){
            if (x % 2 == 0){
                sum = sum + x++;
            }
        }
        System.out.println(sum); */

        /* int sum = 0;
        for(int x = 100; x <= 200; x++){
            if(x % 2 == 0){
                sum = sum + x;
            }
        } System.out.println(sum); */

       /*  Mennyi a 200-nál kisebb, 7-tel osztható pozitív számok összege? */


        /*for(int x = 1; x <=200; x++);
            if (x % 7 == 0){

        } */

    }
}
