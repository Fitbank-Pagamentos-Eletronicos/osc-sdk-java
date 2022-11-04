package domains;

public class LogData {

    private float latitude;
    private float longitude;
    private String ocourrenceDate;
    private String userAgent;
    private String ip;
    private String mac;

    public LogData(float latitude, float longitude, String ocourrenceDate, String userAgent, String ip, String mac){
        setLatitude(latitude);
        setLongitude(longitude);
        setOcourrenceDate(ocourrenceDate);
        setUserAgent(userAgent);
        setIp(ip);
        setMac(mac);
    }

    public float getLatitude(){    
        return latitude;
    }
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
    
    public float getLongitude(){
        return longitude;
    }
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getOcourrenceDate(){
        return ocourrenceDate;
    }
    public void setOcourrenceDate(String ocourrenceDate) {
        this.ocourrenceDate = ocourrenceDate;
    }

    public String getUserAgent(){
        return userAgent;
    }
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }
    public void setMac(String mac) {
        this.mac = mac;
    }


}