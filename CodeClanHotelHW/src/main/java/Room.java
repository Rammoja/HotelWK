import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guest;

    public Room(int capacity){
        this.guest = new ArrayList<>();
        this.capacity = capacity;
    }
}
