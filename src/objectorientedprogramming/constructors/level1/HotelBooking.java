package objectorientedprogramming.constructors.level1;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    HotelBooking(){
        this("Unknown","Basic",1);
    }

    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking others){
        this.guestName = others.guestName;
        this.roomType = others.roomType;
        this.nights = others.nights;
    }

    void displayDetails() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
}
