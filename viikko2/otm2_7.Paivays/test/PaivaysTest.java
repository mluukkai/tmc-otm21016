import org.junit.Test;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;

@Points("2-7")
public class PaivaysTest {

    @Test
    public void toStringUutenavuotena() {
        Paivays paivays = new Paivays(1,1,2017);
        assertEquals("1.1.2017", paivays.toString());
    }
}