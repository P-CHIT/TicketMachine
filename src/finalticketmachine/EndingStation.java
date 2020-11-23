package finalticketmachine;

import java.util.Scanner;

public class EndingStation {

    int theEnd;

    public EndingStation() {
    }

    public int End() {
        while (true) {
            System.out.print("Please insert your destination: ");
            Scanner te = new Scanner(System.in);
            theEnd = te.nextInt();
            if (theEnd > 0 && theEnd <= 8) {
                break;
            }
            
        }
        return theEnd;
    }

    public int getTheEnd() {
        return theEnd;
    }
    
}
