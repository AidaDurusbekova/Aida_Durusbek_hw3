import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] num = {2.2, -3.1, 1.0, 5.1, 7.2, -2.7, 0.1, 1.3, 4.2, 6.2,
                4.5, -5.1, 6.0, 7.2, 5.9,};

    double sam = 0;
    int indeks = 0;
    boolean isNegetiv = false;
        for ( double number: num) {
            if ( number < 0 ){
                isNegetiv = true;
            } else if (number > 0 && isNegetiv) {
                sam = number;
                indeks ++;
                System.out.println( number);
            }

            }
        System.out.println( "count is: " + sam / indeks);


        }


                }










