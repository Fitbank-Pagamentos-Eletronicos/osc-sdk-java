package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.BorrowerInfo;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class BorrowerInfoTest {
    @Test
    public void borrowerInfoTest(){
        BorrowerInfo borrowerInfo = new BorrowerInfo(true, false);
        String s = JSON.getGson().toJson(borrowerInfo);
        BorrowerInfo newBorrowerInfo = JSON.getGson().fromJson(s, BorrowerInfo.class);
        assertNotNull(newBorrowerInfo);

    }

}
