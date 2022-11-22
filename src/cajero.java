public class cajero {
    String titular;
    double saldo;
    String cuenta;
    String cedula;
    //Constructores
    public cajero() {
        titular="";
        saldo=0;
        cuenta = "";
        cedula = "";
    }

    public cajero(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    //Getters y Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
