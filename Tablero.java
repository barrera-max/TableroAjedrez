import java.util.Arrays;
import java.util.Vector;

public class Tablero {
    private String tablero[][];


    public Tablero(int f, int c) {
        tablero = new String[f][c];
    }
    //Se recorren las filas "i" y cada columna "j", si la suma del numero de fila y columna da como resultado un numero par
    //se pinta el casillero de Rojo, caso contrario Azul.
    public void pintarTablero(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if((i+j) % 2 == 0) {
                    tablero[i][j] = "Rojo";
                }
                    else{
                        tablero[i][j] = "Azul";
                }
            }
        }
    }

    //Concateno los valores de cada casillero en un String para mostralo despues.
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Tablero{"+"\n");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

        sb.append("[").append(tablero[i][j]+ "]") ;
        }
            sb.append("\n");
        }
        sb.append('}');
        return sb.toString();
    }
}
