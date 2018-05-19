import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuestTest {


    Guest guest1;

    @Before
    public void before() {
        guest1 = new Guest("David");

    }

    @Test
    public void canGetName(){
        assertEquals("David", guest1.getName());
    }

}


