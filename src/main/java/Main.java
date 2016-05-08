
/**
 * Created by Koba on 08/05/2016.
 */
public class Main {

    public static void main(String[] args){
        for(int i = 1; i < 7; i++) {
            System.out.println("Hi! My name is... " + getPersonaName(i));
        }
    }

    public static String getPersonaName(int personaIndex) {
        NameChooser nc = new NameChooser();
        return nc.getName(Persona.getPersona(personaIndex));
    }
}
