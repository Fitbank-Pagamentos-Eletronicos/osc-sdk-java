package br.com.fitbank.domains;


import br.com.fitbank.utils.JSON;



public class ReferenceTest {
    public static void main(String[] args) {
        Reference reference = new Reference("name", "number");

        System.out.println(reference);
        System.out.println("_______");

        String s = JSON.getGson().toJson(reference);
        System.out.println(s);
        System.out.println("_______");

        Reference newReference = JSON.getGson().fromJson(s, Reference.class);
        System.out.println(newReference);
        System.out.println(newReference.getName());
        System.out.println(newReference.getPhone());
    }
}
