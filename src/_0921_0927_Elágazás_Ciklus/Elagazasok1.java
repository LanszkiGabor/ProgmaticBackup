package _0921_0927_Elágazás_Ciklus;

public class Elagazasok1 {
    public static void main(String[] args) {
      int j = 5,  i= 10;
        //System.out.println(j += j * 2 == i ? j : i % 3);
        if(j*2 == i) {
            j = j + j;
        } else{
            j = + (i % 3);

        }
    }
}
