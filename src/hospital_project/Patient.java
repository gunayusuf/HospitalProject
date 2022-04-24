package hospital_project;

public class Patient {
    private String isim;
    private String soyIsim;
    private int hastaID;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getHastaID() {
        return hastaID;
    }

    public void setHastaID(int hastaID) {
        this.hastaID = hastaID;
    }

    public Condition getHastaDurumu() {
        return hastaDurumu;
    }

    public void setHastaDurumu(Condition hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }

    private Condition hastaDurumu;
}
