import javax.swing.*;
import java.net.http.HttpResponse;

public class ConversorDeMonedas {
    public static void ConvertirPesosA() {
        Consulta consulta = new Consulta();
        Convierte convierte = new Convierte();

//        Consultando en la API
        HttpResponse<String> response = consulta.DatosApi("https://v6.exchangerate-api.com/v6/84d5235ee83203c42f2f05c0/latest/USD");

//        json a objeto
        Moneda moneda = convierte.objetoJava(response);

//        Control del bucle
        boolean otraconversion = true;
        do{
            //Opciones
            String[] opciones = {
                "Convertir de Pesos Mexicanos a Dólar",
                "Convertir de Pesos Mexicanos a Euros",
                "Convertir de Pesos Mexicanos a Libras Esterlinas",
                "Convertir de Pesos Mexicanos a Yen Japonés",
                "Convertir de Dólar a Pesos Mexicanos",
                "Convertir de Euros a Pesos Mexicanos",
                "Convertir de Libras Esterlinas a Pesos Mexicanos",
                "Convertir de Yen Japonés a Pesos Mexicanos",
            };
//            Muestra menú desplegable de selección
            String seleccion = (String) JOptionPane.showInputDialog(null, "Elige un método",
                    "Conversor de Monedas :)", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//            Cancelar selección
            if (seleccion == null){
                otraconversion = false;
                JOptionPane.showMessageDialog(null,"¡Hasta luego! :)");
                break;
            }

            double resultado;

            switch (seleccion){
                case "Convertir de Pesos Mexicanos a Dólar":
                    resultado = convierte.convertirMoneda(1, cantidadValida(), moneda);
                    break;
                case "Convertir de Pesos Mexicanos a Euros":
                    resultado = convierte.convertirMoneda(2, cantidadValida(),moneda);
                    break;
                case "Convertir de Pesos Mexicanos a Libras Esterlinas":
                    resultado = convierte.convertirMoneda(3, cantidadValida(),moneda);
                    break;
                case "Convertir de Pesos Mexicanos a Yen Japonés":
                    resultado = convierte.convertirMoneda(4, cantidadValida(),moneda);
                    break;
                case "Convertir de Dólar a Pesos Mexicanos":
                    resultado = convierte.convertirMoneda(5, cantidadValida(),moneda);
                    break;
                case "Convertir de Euros a Pesos Mexicanos":
                    resultado = convierte.convertirMoneda(6, cantidadValida(), moneda);
                    break;
                case "Convertir de Libras Esterlinas a Pesos Mexicanos":
                    resultado = convierte.convertirMoneda(7, cantidadValida(),moneda);
                    break;
                case  "Convertir de Yen Japonés a Pesos Mexicanos":
                    resultado = convierte.convertirMoneda(8, cantidadValida(),moneda);
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Opción no válida");
                    return;
            }

            JOptionPane.showMessageDialog(null, "Resultado: "+resultado);

//            Consultar si quiere otra conversión:
            int repetir = JOptionPane.showConfirmDialog(null, "¿Realizar otra conversión?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (repetir != JOptionPane.YES_OPTION){
                otraconversion = false;
                JOptionPane.showMessageDialog(null, "¡Adios!♥");
            }
        } while (otraconversion);
    }
//    Obtener valores numéricos válidos:
    public static double cantidadValida(){
        while (true){
            try{
                String cantidad = JOptionPane.showInputDialog("Ingresa la cantidad a convertir:");
                if (cantidad == null){
                    throw new NullPointerException();
                }
                return Double.parseDouble(cantidad);
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Introduce solamente valores numéricos.");
            } catch (NullPointerException e){
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                throw e;
            }
        }
    }
}
