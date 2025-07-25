package mtech.prokect.openapigenerator;


import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return ResponseEntity.badRequest().body(errors);
    }



    @org.springframework.web.bind.annotation.ExceptionHandler(ConstraintViolationException.class)
    public  ResponseEntity<?> handleConstraintViolationException(ConstraintViolationException ex){
        System.out.println("constrains violation exception");
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
        @org.springframework.web.bind.annotation.ExceptionHandler(ConstraintViolationException.class)
    public  ResponseEntity<?> handleConstraintViolationException(ConstraintViolationException ex){
        System.out.println("constrains violation exception");
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

        @org.springframework.web.bind.annotation.ExceptionHandler(ConstraintViolationException.class)
    public  ResponseEntity<?> handleConstraintViolationException(ConstraintViolationException ex){
        System.out.println("constrains violation exception");
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

        @org.springframework.web.bind.annotation.ExceptionHandler(ConstraintViolationException.class)
    public  ResponseEntity<?> handleConstraintViolationException(ConstraintViolationException ex){
        System.out.println("constrains violation exception");
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
