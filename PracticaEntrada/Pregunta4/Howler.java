package Pregunta4;
public class Howler {
    public Howler(long shadow) {
        System.out.println(shadow);
    }
    private Howler(int moon) {
        super();
    }
}
class Wolf extends Howler {
    protected Wolf(String stars) {
        super(2L);
    }
    public Wolf() {
        super(120);
    }
}