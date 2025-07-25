package mtech.prokect.openapigenerator;


import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;




@RestController
@Validated
@RequestMapping("/v2/users")
public class UserController {

    @PostMapping
    public ResponseEntity<?> addUser(@Valid @RequestBody User user) {
        return new ResponseEntity<>(user, HttpStatus.BAD_REQUEST);
    }


    @GetMapping
    public  ResponseEntity<?> getUser(@Valid @RequestParam String name){
        return new ResponseEntity<>(name,HttpStatus.OK);
    }

    @GetMapping("/test/vaild")
    public ResponseEntity<?> getUser2(
            @NotNull @Pattern(regexp = "^\\+962[1-9][0-9]{8}$") @Size(max = 10) @Parameter(name = "phoneNumber", description = "Phone number in Jordanian format starting with +962 followed by 9 digits", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "phoneNumber", required = true) String phoneNumber,
            @NotNull @Pattern(regexp = "^[A-Za-z\\\\s]{1,60}$") @Size(max = 60) @Parameter(name = "name", description = "Name should be alphabetic only and max 60 characters", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "name", required = true) String name
    ){

        return  new ResponseEntity<>(phoneNumber,HttpStatus.OK);
    }





}
