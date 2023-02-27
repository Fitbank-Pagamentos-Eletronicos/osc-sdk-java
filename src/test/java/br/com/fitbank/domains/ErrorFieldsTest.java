package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.ErrorField;
import br.com.fitbank.domains.domains.ErrorFields;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ErrorFieldsTest {
    @Test
    public void errorFieldsTest(){
        ErrorFields errorFields = new ErrorFields("code", "message", new ErrorField("field", "field Message"));
        String s = JSON.getGson().toJson(errorFields);
        ErrorFields newErrorFields = JSON.getGson().fromJson(s, ErrorFields.class);
        assertNotNull(newErrorFields);

    }

}
