package finalticketmachine;

import java.util.Scanner;

public class StartingStation {

    int theOrigin;

    public StartingStation() {
    }

    public int Start() {
        while (true) {
            System.out.print("Please insert your starting station: ");
            Scanner og = new Scanner(System.in);
            theOrigin = og.nextInt();
            if (theOrigin >0 && theOrigin <= 8) {
                 break;
            }
           
        }
        return theOrigin;
    }

    public int getTheOrigin() {
        return theOrigin;
    }
    
}
