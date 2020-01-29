package lesson22.homework22.exeption;

public class LimitExceeded extends BadRequestException {

    public LimitExceeded(String message) {
        super(message);
    }
}
