package A01_intro;

public class DivisibleFor {
    public static void main(String[] args) {
        int i;
        for(i = 1; i <= 100; i++) {
            if (i % 6 == 0) {
                System.out.println(i);
            }
        }

        i = 1;

        while(i <= 100){
            if (i % 6 == 0) {
                System.out.println(i);
            }

            i++;
        }


    }
}
