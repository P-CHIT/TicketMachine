package finalticketmachine;

import java.util.Scanner;

public class Calculation {

    private int price;
    StationCost co = new StationCost();
    Ticket tk = new Ticket();
    private int balance;
    Scanner money = new Scanner(System.in);

    public Calculation() {
        balance = 0;
    }

    public int getTotalPrice(int cost, int pieces) {
        price = cost * pieces;
        return price;
    }

    public void insertMoney() {
        while (balance < price) {
            System.out.print("Please insert your money: ");
            int income = money.nextInt();
            if (income > 0) {
                balance += income;
            } else {
                System.out.println("Error Value!!");
            }
        }
    }

    public void recieveChange() {
        if (balance > price) {
            System.out.println("Your change: " + (balance - price));
        }
    }
}
