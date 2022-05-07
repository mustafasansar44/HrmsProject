package kodlamaio.hrms.core.utilities.verification.result;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor

public class HandleValidationException {
    private HttpStatus httpStatus;
    private String message;
    private List<String> errors;

    public HandleValidationException(HttpStatus httpStatus, String message, String error){
        this.httpStatus = httpStatus;
        this.message = message;
        errors = Arrays.asList(error);
    }
}
