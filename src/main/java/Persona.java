
/**
 * Created by Koba on 08/05/2016.
 */
public class Persona {

    private static final String PERSONA_ONE = "School dropout";
    private static final String PERSONA_TWO = "Rap superstar";
    private static final String PERSONA_THREE = "Psycho";
    private static final String PERSONA_FOUR = "Rich drug addict";
    private static final String PERSONA_FIVE = "Well, that would be me";
    private static final String PERSONA_SEVEN = "British Secret Service agent";

    public static String getPersona(int personaIndx) {
        switch(personaIndx) {
            case 1: return Persona.PERSONA_ONE;
            case 2: return Persona.PERSONA_TWO;
            case 3: return  Persona.PERSONA_THREE;
            case 4: return Persona.PERSONA_FOUR;
            case 5: return  Persona.PERSONA_FIVE;
            default: return Persona.PERSONA_SEVEN;
        }
    }
}
