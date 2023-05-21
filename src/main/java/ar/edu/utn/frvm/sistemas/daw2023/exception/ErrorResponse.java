package ar.edu.utn.frvm.sistemas.daw2023.exception;

import lombok.Data;

// Clase para representar la respuesta de error
@Data
public class ErrorResponse {
    private int errorCode;
    private String message;

    public ErrorResponse(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

}
