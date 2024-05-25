import com.google.gson.annotations.SerializedName;

public class Moneda {
//    ATRIBUTOS
    @SerializedName("MXN")
    private double mxn;
    @SerializedName("USD")
    private double usd;
    @SerializedName("EUR")
    private double eur;
    @SerializedName("GBP")
    private double gbp;
    @SerializedName("JPY")
    private double jpy;
//    CONSTRUCTOR
    public Moneda(double mxn, double usd, double eur, double gbp, double jpy){
        this.mxn = mxn;
        this.usd = usd;
        this.eur = eur;
        this.gbp = gbp;
        this.jpy = jpy;
    }
//    GETTER
    public double mxn() { return mxn; }
    public double usd() {
        return usd;
    }
    public double eur() {
        return eur;
    }
    public double gbp() {
        return gbp;
    }
    public double jpy() {
        return jpy;
    }
//
//    GENERANDO CONVERSIÓN INVERSA
    public Moneda invertir(){ return new Moneda(1/mxn, 1/usd, 1/eur, 1/gbp, 1/jpy);}
}
