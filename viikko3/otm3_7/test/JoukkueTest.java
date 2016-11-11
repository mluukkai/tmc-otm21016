import org.junit.Test;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;
import org.junit.Before;

@Points("3-7")
public class JoukkueTest {
    Joukkue joukkue;
    
    @Before
    public void setUp(){
        joukkue = new Joukkue("Kumpulan pallo");
    }
    
    @Test
    public void alussaKokoNolla() {
        assertEquals(0, joukkue.koko());
    }
}