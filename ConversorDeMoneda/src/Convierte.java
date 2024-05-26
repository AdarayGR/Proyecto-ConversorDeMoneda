import com.google.gson.Gson;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;

public class Convierte {
    //    Convierte Json a moneda
    public Moneda objetoJava(HttpResponse<String> response){
        Gson gson = new Gson();
        Datos datos = gson.fromJson(response.body(), Datos.class);
        return datos.conversion_rates();
    }
//    METODO
//Convierte la moneda según la cantidad ingresada
    public double convertirMoneda(int opcion, double cantidad, Moneda moneda){
        return switch (opcion) {
            case 1 -> cantidad / moneda.mxn(); // MXN a USD
            case 2 -> cantidad / (moneda.mxn()/moneda.eur()); // MXN a EUR
            case 3 -> cantidad / (moneda.mxn()/moneda.gbp()); // MXN a GBP
            case 4 -> cantidad / (moneda.mxn()/moneda.jpy()); // MXN a JPY
//            Invertir conversión
            case 5 -> cantidad * moneda.mxn(); // USD a MXN
            case 6 -> cantidad/(moneda.eur()/moneda.mxn()); // EUR a MXN
            case 7 -> cantidad/(moneda.gbp()/moneda.mxn()); // GBP a MXN
            case 8 -> cantidad/(moneda.jpy()/moneda.mxn()); // JPY a MXN

            default -> throw new IllegalArgumentException("Opción no válida");
        };
    }
}
