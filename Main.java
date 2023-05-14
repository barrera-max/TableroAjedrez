import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("TABLERO AJEDREZ");
        //Creo una referencia de tipo tablero para el nuevo objeto
        Tablero t;
        Scanner sc = new Scanner(System.in);
        //Le pido al usuario que determine el tamaño de su tablero
        System.out.println("Ingrese el numero de filas: ");
        int fila = sc.nextInt();
        System.out.println("Ingrese el numero de columnas:");
        int columna = sc.nextInt();
        t = new Tablero(fila,columna);
        t.pintarTablero();
        System.out.println(t.toString());

        //La conclusion al problema es que no sera posible seguir el criterio de que no hayan dos filas o dos columnas
        //con distinta cantidad de casilleros azules o rojos. Seria posible solo si el numero de columnas es mayor al numero de filas

    }
}
