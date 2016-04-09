package za.ac.cput.Composition;

/**
 * Created by Game330 on 2016/03/22.
 */
public class RoadVechile implements Transport{

    public int time = 0;
    public double distance = 0.0;
    public double rate = 0.0;

    /*
    public void setTravelTime(int minutes) {
        this.time = minutes;
    }

    public int getTravelTime(){
        return time;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance(){
        return distance;
    }
    */

    public double calculateCost() {
        return rate*distance;
    }

}
