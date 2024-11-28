public class MedicoOspedaliero extends Medico {
    private String ospedale;

    public MedicoOspedaliero(String nome, int esperienza, String specializzazione, String ospedale) {
        super(nome, esperienza, specializzazione);
        this.ospedale = ospedale;
    }

    public String getOspedale() {

        return ospedale;
    }

    public void setOspedale(String ospedale) {

        this.ospedale = ospedale;
    }
    @Override
    public String toString() {
        String testo="";
        testo+=specializzazione;
        return testo;
    }
}

