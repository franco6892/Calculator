package FrancoRules;

public class Strings {
    public String noSpaces(String stringWithSpaces){

        if (stringWithSpaces.length() == 0){
            throw new RuntimeException("not a valid string");
        }

        return stringWithSpaces.replaceAll(" ", "");
    }

    public String emailMaker(String firstname, String lastname, String provider){
        if (firstname.length() == 0 || lastname.length() == 0){
            throw new RuntimeException("Not implemented yet");
        }
        return firstname + "." + lastname + "@" + provider;
    }
}
