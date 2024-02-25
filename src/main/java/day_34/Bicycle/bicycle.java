package day_34.Bicycle;

public class bicycle {
    int cadence;
    int gear;
    int speed;

    public bicycle(int cadence, int gear,int speed){
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }
    public void setCadence(int newValue){
        this.cadence = newValue;

    }
    public void setGear (int newGear){
        this.gear=newGear;
    }
    public void applyBreak(int decrement){
        speed-=decrement;
    }
    public void Speed(int increment){
        speed+=increment;
    }
}
