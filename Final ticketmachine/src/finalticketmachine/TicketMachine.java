package finalticketmachine;

public class TicketMachine {

    public static void main(String[] args) {
        StationInfo mn = new StationInfo();
        StartingStation st = new StartingStation();
        EndingStation ed = new EndingStation();
        Calculation cc = new Calculation();
        StationCost sc = new StationCost();
        Ticket tk = new Ticket();

        mn.outPutMenuList();
        sc.findDistance(st.Start(), ed.End());
        tk.insertQuantity();
        System.out.println("Your expenses per station " + sc.thinkCost());
        System.out.println("Your total price paid :" + cc.getTotalPrice(sc.getCost(), tk.getPieces()));
        cc.insertMoney();
        cc.recieveChange();
        System.out.println("Here is your ticket ");
        System.out.println(tk.getPieces() +" pcs.");
    }
}
