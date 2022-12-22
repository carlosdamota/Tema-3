public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.PonerPuerta();
        System.out.println(miCoche.puertas);

        int resultado;
        resultado = suma(1, 2, 3);
        System.out.println(resultado);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
class Coche {
    public int puertas = 3;

    public void PonerPuerta() {
        this.puertas++;
    }
}