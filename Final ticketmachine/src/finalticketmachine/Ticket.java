package finalticketmachine;

import java.util.Scanner;

public class Ticket {

    private int pieces;

    public int insertQuantity() {
//pieces <= 0 && pieces >= 10
        while (true) {
            System.out.print("How many ticket you want to buy (limit as 10): ");
            Scanner quantity = new Scanner(System.in);
            pieces = quantity.nextInt();
            if (pieces > 0 && pieces <= 10) {
                break;
            }
        }
        return pieces;
    }

    public int getPieces() {
        return pieces;
    }

}
