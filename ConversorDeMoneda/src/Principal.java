import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Object[] opciones = {"Convertir Divisas", "Salir"};
        //Cargando la imagen de mi icono:
        ImageIcon icono = new ImageIcon(Principal.class.getResource(""));
        int elige = JOptionPane.showOptionDialog(null,"¿Qué quieres hacer?", "Conversor de moneda", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
    }
}
