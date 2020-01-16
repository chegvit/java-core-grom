package lesson20.task2.exeption;

public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }
}
