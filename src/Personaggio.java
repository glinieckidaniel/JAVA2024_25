public class Personaggio {
    public String nome;
    public int esperienza;

    public Personaggio(String nome, int esperienza) {
        this.nome = nome;
        this.esperienza = esperienza;
    }

    public int getEsperienza() {
        return esperienza;
    }

    public void setEsperienza(int esperienza) {
        this.esperienza = esperienza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String participa(){
        return "Sto lavorando "+ esperienza;
    }

    @Override
    public String toString() {
        String testo="";
        testo+=nome+" "+esperienza;

        return testo;
    }
}
