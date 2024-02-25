package day_34.Bicycle;

public class Mountainbike extends bicycle {
    int seatHeight;

    public Mountainbike(int cadence, int gear, int speed,int seatHeight) {
        super(cadence, gear, speed);
        this.seatHeight =seatHeight;
    }
    public void setSeatHeight(int newValue){
        this.seatHeight = newValue;
    }
}
