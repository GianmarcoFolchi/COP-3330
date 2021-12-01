package project3;

public class IdException extends Exception {

    public IdException() {
        super("IDs must be in the form of LetterLetterDigitDigitDigitDigit");
    }
}
