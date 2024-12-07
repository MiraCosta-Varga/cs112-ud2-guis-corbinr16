package cs112.ud2;

public class NameAlreadyTakenException extends Exception {

    Character duplicate;

    public NameAlreadyTakenException() {
        super("ERROR: Username already exists, please try another.");
    }

    public NameAlreadyTakenException(String message, Character duplicate) {
        super(message + " You tried the name: " + duplicate);
        this.duplicate = duplicate;
    }

    public Character getCharacter() {
        return this.duplicate;
    }

}
