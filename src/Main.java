public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Carro("BMW");
        Carro meuCarro1 = new Carro("MERCEDES");
        Carro meuCarro2 = new Carro("FERRARI");

        meuCarro.acelerar();
        meuCarro1.acelerar();
        meuCarro2.acelerar();
    }
}

class Carro {

    String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;

    }

    public void acelerar() {
        System.err.println("Acelerando carro" + this.modelo);
    }
}
