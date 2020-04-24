public class Exception extends java.lang.Exception {
    enum ExceptionType{
        INVALID_CONVERSION, INVALID_QUANTITY_NAME_CONVERSION, INVALID_VALUE_GIVEN
    }
    ExceptionType type;

    public Exception(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
