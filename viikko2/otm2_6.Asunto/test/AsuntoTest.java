import org.junit.Test;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;

@Points("2-6")
public class AsuntoTest {

    @Test
    public void asunnonLuominenOnnistuu() {
        Asunto asunto = new Asunto(1, 10, 10);
        assertFalse(asunto==null);
    }
}