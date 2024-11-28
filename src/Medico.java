public class Medico extends Personaggio{
    public String specializzazione;

    public Medico(String nome, int esperienza, String specializzazione) {
        super(nome, esperienza);
        this.specializzazione = specializzazione;
    }

    public String getSpecializzazione() {

        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {

        this.specializzazione = specializzazione;
    }

    public String partecipa(){

        return "ho la specializzazione "+specializzazione;
    }

    @Override
    public String toString() {
        String testo="";
        testo+=specializzazione;
        return testo;
    }
}
