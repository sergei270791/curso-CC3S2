interface Secret {
    String magic(double d);
}
class Secret1 implements Secret {
    public static void main(String[] args) {
        Secret1 s=new Secret1();
        System.out.println(s.magic(5));
    }
    public String magic(double d) {
        return "Poof";
    }
}
