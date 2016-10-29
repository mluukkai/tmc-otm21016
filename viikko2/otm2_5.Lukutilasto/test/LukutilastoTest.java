import org.junit.Test;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;

@Points("2-5")
public class LukutilastoTest {

    @Test
    public void alussaSummaOnNolla() {
        Lukutilasto tilasto = new Lukutilasto();
        assertEquals(0, tilasto.summa());
    }
}