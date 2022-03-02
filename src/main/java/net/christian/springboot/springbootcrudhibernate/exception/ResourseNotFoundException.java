package net.christian.springboot.springbootcrudhibernate.exception;

import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourseNotFoundException extends RuntimeException{

    public static final long serialVersionUID = 1L;

    public ResourseNotFoundException(String message) {
        super(message);
    }

    public ResourseNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
