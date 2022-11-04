package domains;

public class BorrowerInfo {
    private boolean isRegistred;
    private boolean isBlocked;

    public BorrowerInfo(boolean isRegistred, boolean isBlocked){
        setRegistred(isRegistred);
        setBlocked(isBlocked);
    }

    public boolean isRegistred() {
        return isRegistred;
    }
    public void setRegistred(boolean isRegistred) {
        this.isRegistred = isRegistred;
    }

    public boolean isBlocked() {
        return isBlocked;
    }
    public void setBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }
}
