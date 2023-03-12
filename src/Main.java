public class Main {
    public static void main(String[] args) {
        int resultado;
        //resultado = suma(10,+10,+ 10);

        Coche micoche = new Coche();
        micoche.increment( 4 );
        System.out.println("el coche tiene: " + micoche.puertas + " puertas" );



    }
    public static int suma(int a, int b, int c) {
        return a + b + c;

    }

}
