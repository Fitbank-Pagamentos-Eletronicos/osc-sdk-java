package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class LogDataTest {
    public static void main(String[] args) throws JsonProcessingException {
        LogData logData = new LogData(0, 0, "ocourrence date", "user Agent", "ip ip ip", "mac mac mac");

        System.out.println(logData);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(logData);
        System.out.println(s);
        System.out.println("_______");

        LogData newLD = new ObjectMapper().readValue(s, LogData.class);
        System.out.println(newLD);
        System.out.println(newLD.getIp());
        System.out.println(newLD.getLatitude());
        System.out.println(newLD.getLongitude());
        System.out.println(newLD.getMac());
        System.out.println(newLD.getOcourrenceDate());
        System.out.println(newLD.getUserAgent());

    }
}
