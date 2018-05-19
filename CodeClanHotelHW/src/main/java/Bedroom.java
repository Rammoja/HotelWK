public class Bedroom extends Room {

    private RoomType roomtype;
    private int roomNumber;
    private int roomPrice;


    public Bedroom(int capacity,  RoomType roomtype, int roomNumber, int roomPrice) {
        super(capacity);
        this.roomtype = roomtype;
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;


    }


    public RoomType getRoomType(){
        return this.roomtype;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getRoomPrice(){
        return this.roomPrice;
    }




}
