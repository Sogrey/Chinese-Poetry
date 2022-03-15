package top.sogrey.springbootservice.dao.exceptions;

public class BaseMapperException extends RuntimeException{

    public BaseMapperException(String message) {
        super(message);
    }

    public BaseMapperException(Throwable throwable) {
        super(throwable);
    }

    public BaseMapperException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
