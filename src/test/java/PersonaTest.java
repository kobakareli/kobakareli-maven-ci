import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Koba on 08/05/2016.
 */
public class PersonaTest {

    @Test
    public void testGetPersona() {
        assertEquals("School dropout", Persona.getPersona(1));
        assertEquals("Rap superstar", Persona.getPersona(2));
        assertEquals("Psycho", Persona.getPersona(3));
        assertEquals("Rich drug addict", Persona.getPersona(4));
        assertEquals("Well, that would be me", Persona.getPersona(5));
        assertEquals("British Secret Service agent", Persona.getPersona(6));
    }

}
