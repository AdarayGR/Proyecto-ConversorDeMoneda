import javax.swing.*;
import java.util.Objects;

public class Principal {
    public static void main(String[] args) throws Exception {
        Object[] opciones = {"Convertir Divisas", "Salir"};
        int elige = JOptionPane.showOptionDialog(null,"¡Comencemos!\nHaz click en 'Convertir Divisas' para continuar", "Conversor de moneda 💲", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        if (elige == 1){
            JOptionPane.showMessageDialog(null, "Espero haberte ayudado. \n¡Hasta luego! ☺");
            System.exit(0);
        } else {
            ConversorDeMonedas.ConvertirPesosA();
        }
    }
}
