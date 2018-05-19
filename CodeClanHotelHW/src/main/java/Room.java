import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.guests = new ArrayList<>();
        this.capacity = capacity;
    }



    public void canCheckGuestIn(Guest guest){
        this.guests.add(guest);
    }

}
