package co.com.choucair.certification.exceptions;

public class FailedOrderException extends AssertionError{
    public FailedOrderException(String message, Throwable cause){
        super(message, cause);
    }
}
