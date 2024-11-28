public class Insegnante extends Personaggio{
    private String ruolo;

    public Insegnante(String nome, int esperienza, String ruolo) {
        super(nome, esperienza);
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }
    public String participa() {
        return "ho il ruolo "+ruolo;
    }

    @Override
    public String toString() {
        String testo="";
        testo+=ruolo;
        return testo;
    }
}
