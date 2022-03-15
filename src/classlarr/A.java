package classlarr;

public class A { //top class
    private C c;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public A(C c) {
        System.out.println("a");
        this.c = c;
    }

    public A() {
        System.out.println("aa");
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}
