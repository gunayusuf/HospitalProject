package hospital_project;

public class Hospital extends DataBank {
    Doctor doktor = new Doctor();
    Patient hasta = new Patient();

    public Doctor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doctor doktor) {
        this.doktor = doktor;
    }

    public Patient getHasta() {
        return hasta;
    }

    public void setHasta(Patient hasta) {
        this.hasta = hasta;
    }
}
