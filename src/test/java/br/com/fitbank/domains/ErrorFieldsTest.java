package br.com.fitbank.domains;




import br.com.fitbank.utils.JSON;

public class ErrorFieldsTest {
    public static void main(String[] args) {
        ErrorFields errorFields = new ErrorFields("code", "message", new ErrorField("field", "field Message"));

        System.out.println(errorFields);
        System.out.println(errorFields.getErrors());
        System.out.println("_______");

        String s = JSON.getGson().toJson(errorFields);
        System.out.println(s);
        System.out.println("_______");

        ErrorFields newErrorFields = JSON.getGson().fromJson(s, ErrorFields.class);
        System.out.println(newErrorFields);
        System.out.println(newErrorFields.getCode());
        System.out.println(newErrorFields.getMessage());
        System.out.println(newErrorFields.getErrors());
        System.out.println(newErrorFields.getErrors().getField());
        System.out.println(newErrorFields.getErrors().getMessage());
    }
}
