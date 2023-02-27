package br.com.fitbank.domains;


import br.com.fitbank.domains.domains.LogData;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LogDataTest {
    @Test
    public void logDataTest(){
        LogData logData = new LogData(0, 0, "ocourrence date", "user Agent", "ip ip ip", "mac mac mac");
        String s = JSON.getGson().toJson(logData);
        LogData newLD = JSON.getGson().fromJson(s, LogData.class);
        assertNotNull(newLD);

    }
}
