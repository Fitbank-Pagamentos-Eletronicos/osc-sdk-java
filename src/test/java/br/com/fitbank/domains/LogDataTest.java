package br.com.fitbank.domains;




import br.com.fitbank.utils.JSON;

public class LogDataTest {
    public static void main(String[] args) {
        LogData logData = new LogData(0, 0, "ocourrence date", "user Agent", "ip ip ip", "mac mac mac");

        System.out.println(logData);
        System.out.println("_______");

        String s = JSON.getGson().toJson(logData);
        System.out.println(s);
        System.out.println("_______");

        LogData newLD = JSON.getGson().fromJson(s, LogData.class);
        System.out.println(newLD);
        System.out.println(newLD.getIp());
        System.out.println(newLD.getLatitude());
        System.out.println(newLD.getLongitude());
        System.out.println(newLD.getMac());
        System.out.println(newLD.getOccurrenceDate());
        System.out.println(newLD.getUserAgent());

    }
}
