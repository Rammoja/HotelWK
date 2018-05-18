import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {


    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(20, "Caribbean Room", 27.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Caribbean Room", conferenceRoom.getName());
    }

    @Test
    public void canGetDailyRate(){
        assertEquals(27.00, conferenceRoom.getDailyRate(), 0.01);
    }

}
