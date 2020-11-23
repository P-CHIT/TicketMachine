package finalticketmachine;

public class StationCost {

    private int Distance;
    private int[] DistanceCost = {25, 30, 40, 60};
    private int Cost;
    StartingStation st = new StartingStation();
    EndingStation ed = new EndingStation();

    public int findDistance(int end, int start) {
        int i = start - end;
        if(start > end)
          Distance =   i;
        else
        Distance = i*(-1);
        return Distance;
    }

    public int thinkCost() {
        if (Distance >= 1 && Distance <= 2) {
            Cost = DistanceCost[0];
        } else if (Distance > 2 && Distance <= 4) {
            Cost = DistanceCost[1];
        } else if (Distance > 4 && Distance <= 6) {
            Cost = DistanceCost[2];
        } else if (Distance > 6 && Distance <= 8) {
            Cost = DistanceCost[3];
        }
        return Cost;
    }

    public int getCost() {
        return Cost;
    }

}
