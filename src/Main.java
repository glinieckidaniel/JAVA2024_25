public class Main {
    public static void main(String[] args) {
        Personaggio p1 = new Personaggio("Carlo",100);
        Personaggio p2 = new Medico("andrea",70,"Dentista");
        Personaggio p3 = new Insegnante("marco",40,"italiano");
        Personaggio p4 = new MedicoOspedaliero("ciro",89,"Chirurgo","san camillo");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p1.participa());
        System.out.println(p2.participa());
        System.out.println(p3.participa());
        System.out.println(p4.participa());
    }
}