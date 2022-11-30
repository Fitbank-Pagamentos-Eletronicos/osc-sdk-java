package br.com.fitbank.domains;




import br.com.fitbank.utils.JSON;

public class ErrorFieldTest {
    public static void main(String[] args) {
        ErrorField errorField = new ErrorField("field", "message");

        System.out.println(errorField);
        System.out.println("_______");

        String s = JSON.getGson().toJson(errorField);
        System.out.println(s);
        System.out.println("_______");

        ErrorField newErrorField = JSON.getGson().fromJson(s, ErrorField.class);
        System.out.println(newErrorField);
        System.out.println(newErrorField.getField());
        System.out.println(newErrorField.getMessage());
    }
}
