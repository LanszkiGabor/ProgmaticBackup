package _0928_1006_Metódusok_Tömbök;

public class _0929_TombokHazi {
    public static void main(String[] args) {

        boolean [] trueOrFalse;

        String [] seasons = {"spring", "summer", "autumn","winter"};
        //System.out.println(seasons.length);
        //System.out.println(seasons[0]);
        //System.out.println(seasons[3]);
        //System.out.println(seasons[5]);
        // seasons[0] = "tavasz";
        for(int i = 0; i < seasons.length; i++){
            String season = seasons[i];
            System.out.println(season);
        }


        int [] numbers = {-1, 0, 1};
        // System.out.println(numbers.length);
        for(int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }
    }


}
