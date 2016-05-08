import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Koba on 08/05/2016.
 */
public class MainTest {

    private NameChooser nc;

    @Before
    public void setup() {
        nc = mock(NameChooser.class);
        when(nc.getName("Psycho")).thenReturn("Slim Shady");
        when(nc.getName("British Secret Service agent")).thenReturn("Bond, James Bond");
    }

    @Test
    public void testGetPersonaName() {
        assertEquals("Slim Shady", Main.getPersonaName(nc, 3));
        assertEquals("Bond, James Bond", Main.getPersonaName(nc, 6));
        verify(nc).getName("Psycho");
        verify(nc).getName("British Secret Service agent");
    }

}
