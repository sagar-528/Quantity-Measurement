public class Exception extends java.lang.Exception {
    enum ExceptionType{
        INVALID_CONVERSION
    }
    ExceptionType type;

    public Exception(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
