import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Guest guest;


    @Before
    public void before() {
        bedroom1 = new Bedroom(1,RoomType.SINGLE, 23,10);
        guest = new Guest();

    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.SINGLE, bedroom1.getRoomType());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(23, bedroom1.getRoomNumber());
    }


    @Test
    public void canGetRoomPrice(){
        assertEquals(10, bedroom1.getRoomPrice());
    }

    @Test
    public void canAddGuest(){
        this.guest = guest;

        //        create a guest object
//        add said guest to bedroom1
//        assertEquals the number of guests and make sure its one -- write method for it in Room
    }
}

