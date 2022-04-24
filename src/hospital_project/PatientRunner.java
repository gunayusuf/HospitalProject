package hospital_project;

public class PatientRunner {
    private static Hospital hastane1 = new Hospital();

    public static void main(String[] args) {

        String hastaDurumu = hastane1.durumlar[2];
        String unvan = doktorUnvan(hastaDurumu);

        hastane1.setDoktor(doktorBul(unvan));
        hastane1.setHasta(hastaBul(hastaDurumu));

        System.out.println("Doktor ismi: "+hastane1.getDoktor().getIsim());
        System.out.println("Doktor soy isim: "+hastane1.getDoktor().getSoyIsim());
        System.out.println("Doktor unvani: "+hastane1.getDoktor().getUnvan());
        System.out.println("Hasta ismi: "+hastane1.getHasta().getIsim());
        System.out.println("Hasta soy isim: "+hastane1.getHasta().getSoyIsim());
        System.out.println("Hasta unvani: "+hastane1.getHasta().getHastaID());

    }

    public static String doktorUnvan(String aktuelDurum) {
        if (aktuelDurum.contains("Allergist")) {
            return hastane1.unvanlar[0];
        } else if (aktuelDurum.contains("Bas agrisi")) {
            return hastane1.unvanlar[1];
        } else if (aktuelDurum.contains("Diabet")) {
            return hastane1.unvanlar[2];
        } else if (aktuelDurum.contains("Soguk alginligi")) {
            return hastane1.unvanlar[3];
        } else if (aktuelDurum.contains("Migren")) {
            return hastane1.unvanlar[4];
        } else if (aktuelDurum.contains("Kalp hastaliklari")) {
            return hastane1.unvanlar[5];
        } else {
            System.out.println("Yanlis unvan");
        }
        return doktorUnvan(aktuelDurum);
    }
    public static Doctor doktorBul(String unvan){

        Doctor doktor= new Doctor();
        for (int i = 0; i <hastane1.unvanlar.length ; i++) {
            if (unvan.equals(hastane1.unvanlar[i])){
                doktor.setIsim(hastane1.doctorIsimleri[i]);
                doktor.setSoyIsim(hastane1.doctorSoyIsimleri[i]);
                doktor.setUnvan(hastane1.unvanlar[i]);
            }
        }
        return doktor;
    }
    public static Condition hastaDurumuBul(String aktuelDurum){
        Condition hastaDurumu= new Condition();
        switch (aktuelDurum){
            case "Allerji":
                hastaDurumu.setAciliyet(false);
                break;
            case "Bas agrisi":
                hastaDurumu.setAciliyet(false);
                break;
            case "Diabet":
                hastaDurumu.setAciliyet(false);
                break;
            case "Soguk alginligi":
                hastaDurumu.setAciliyet(false);
                break;
            case "Migren":
                hastaDurumu.setAciliyet(true);
                break;
            case "Kalp hastaliklari":
                hastaDurumu.setAciliyet(true);
                break;
            default:
                System.out.println("Gecerli bir durum degil");
        }
        return hastaDurumu;

    }
    public static Patient hastaBul(String actualCase){
        Patient hasta= new Patient();
        for (int i = 0; i <hastane1.durumlar.length ; i++) {
            if (actualCase.equals(hastane1.durumlar[i])){
                hasta.setIsim(hastane1.hastaIsimleri[i]);
                hasta.setSoyIsim(hastane1.hastaSoyIsimleri[i]);
                hasta.setHastaID(hastane1.hastaIDleri[i]);
            }
        }
        return hasta;

    }
}
