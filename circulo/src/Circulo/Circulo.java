package Circulo;

public class Circulo {
    private  double pi=3.1416;
    private int radio;

    public Circulo() {
    }

    public Circulo( int radio) {
        this.radio = radio;
    }
    public  void resp(int radio){
        double r;
        r=pi*Math.pow(radio,2);
        System.out.println("el area de un circulo es "+r);

    }
}

