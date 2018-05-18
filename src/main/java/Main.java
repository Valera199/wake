import java.io.IOException;
import java.util.Scanner;

public class Main {



 /*  public static double result(double price, int corner) {
        double result = price * corner;

        if (result > 500) {
            result = result * 0.9;
        }
       return result;

*/

    public static void main(String[] args) {
        int lenghtCable = 4;
       // double price = 0;
       // double amount = 0;



   /*     while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введдите цену: ");
            price = in.nextInt();
            System.out.println("Введдите колчество: ");
            int counter = in.nextInt();



            System.out.println("Сумма = " + result(price,counter));
        }
   */

        Boat boat1 = new Boat(230, 597, 249, 0, "MC", "X");

        //    System.out.println(boat1);
        //    System.out.println(boat1.power);

        Wakeboard wake = new Wakeboard(3, 37, 138, 0, "LF", "D");

        //   System.out.println(boat1.posX + wake.posX - 4);
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Время нажатия на дорсиль ");
            int change = in.nextInt();
            boat1.move(change);

            System.out.println("Позиция катера: " + boat1.posX + "\nПозиция вейка: " + wake.posX);
            if (wake.posX == (boat1.posX - lenghtCable)) {
                System.out.println("Ты справился!");
                break;
            }
            System.out.println("###############################################");
        }
    }
}
