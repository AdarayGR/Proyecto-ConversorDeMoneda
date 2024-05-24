import javax.swing.*;

public class Principal {
    public static void main(String[] args) throws Exception {
        Object[] opciones = {"Convertir Divisas", "Salir"};
        int elige = JOptionPane.showOptionDialog(null,"¡Comencemos!", "Conversor de moneda :)", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        if (elige == 1){
            JOptionPane.showMessageDialog(null, "Espero haberte ayudado. ¡Hasta luego! :)");
            System.exit(0);
        }
    }
}