package ar.edu.utn.frvm.sistemas.daw2023.exception;

public class CustomException extends RuntimeException {
    private final int errorCode;

    public CustomException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
