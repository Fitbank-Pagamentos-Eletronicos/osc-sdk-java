package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.ErrorField;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ErrorFieldTest {
    @Test
    public void errorFieldTest(){
        ErrorField errorField = new ErrorField("field", "message");
        String s = JSON.getGson().toJson(errorField);
        ErrorField newErrorField = JSON.getGson().fromJson(s, ErrorField.class);
        assertNotNull(newErrorField);

    }

}
