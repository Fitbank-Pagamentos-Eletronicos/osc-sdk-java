package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.Reference;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ReferenceTest {
    @Test
    public void referenceTest(){
        Reference reference = new Reference("name", "number");
        String s = JSON.getGson().toJson(reference);
        Reference newReference = JSON.getGson().fromJson(s, Reference.class);
        assertNotNull(newReference);

    }

}
