
/**
 * Created by Koba on 08/05/2016.
 */
public class Main {

    public static void main(String[] args){
        NameChooser nc = new NameChooser();
        for(int i = 1; i < 7; i++) {
            System.out.println("Hi! My name is... " + getPersonaName(nc, i));
        }
    }

    public static String getPersonaName(NameChooser nc, int personaIndex) {
        return nc.getName(Persona.getPersona(personaIndex));
    }
}
