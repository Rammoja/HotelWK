import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;

    @Before
    public void before() {
        bedroom1 = new Bedroom(1,RoomType.SINGLE, 23);
        bedroom2 = new Bedroom(2,RoomType.DOUBLE, 45);
        bedroom3 = new Bedroom(4,RoomType.SUITE, 65);
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.SINGLE, bedroom1.getRoomType());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(23, bedroom1.getRoomNumber());
    }
}

