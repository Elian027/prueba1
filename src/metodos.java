import java.util.Scanner;

public class metodos {
    Scanner sc = new Scanner(System.in);
    cajero c = new cajero();
    String nom="";
    String ci="";
    double valor1=0, ret=0, dep=0, valorNuevo=0;
    String cuenta="";
    int opC=0;
    //Metodo para crear la cuenta
    public void nombrarCuenta() {
        System.out.println("CREAR CUENTA");
        System.out.print("Ingrese su numero de identidad: ");
        ci=sc.next();
        while (ci.length()>10) {
            System.out.print("El numero de cedula solo debe contener 10 digitos");
            System.out.print("\nIngrese su numero de identidad: ");
            ci=sc.next();
        }
        c.setCedula(ci);
        System.out.println("1. Cuenta de ahorros");
        System.out.println("2. Cuenta corriente");
        System.out.print("Ingrese el numero del tipo de cuenta que desea: ");
        opC=sc.nextInt();
        if (opC==1) {
            c.setCuenta("Cuenta de ahorros");
            System.out.print("Ingrese el valor inicial de su cuenta: ");
            valor1=sc.nextDouble();
            c.setSaldo(valor1);
            System.out.print("Ingrese el nombre del titular de la cuenta: ");
            nom=sc.next();
            c.setTitular(nom);
            System.out.println("CREACION EXITOSA");
        }
        else if (opC==2) {
            c.setCuenta("Cuenta corriente");
            System.out.print("Ingrese el valor inicial de su cuenta: ");
            valor1=sc.nextDouble();
            c.setSaldo(valor1);
            System.out.print("Ingrese el nombre del titular de la cuenta: ");
            nom=sc.next();
            c.setTitular(nom);
            System.out.println("CREACION EXITOSA");
        }
        else {
            System.out.println("Error al crear la cuenta");
        }

    }
    //Metodo para consultar el saldo
    public void consultarSaldo() {
        System.out.println("CONSULTA DE SALDO");
        System.out.println("Nombre: "+c.getTitular());
        System.out.println("Cedula: "+c.getCedula());
        System.out.println("Tipo de cuenta: "+c.getCuenta());
        System.out.println("Saldo: "+c.getSaldo());
    }
    //Metodo para retirar dinero
    public void retirar() {
        System.out.println("RETIRAR DINERO");
        System.out.print("Ingrese la cantidad a retirar: ");
        ret=sc.nextDouble();
        if (ret>c.getSaldo()) {
            System.out.println("Lo sentimos, fondos insuficientes para realizar el retiro");
            System.out.print("Ingrese una nueva cantidad: ");
            ret=sc.nextDouble();
            valorNuevo=ret-valor1;
            c.setSaldo(valorNuevo);
        }
        valorNuevo=ret-valor1;
        c.setSaldo(valorNuevo);
        System.out.println("RETIRO EXITOSO");
    }


}
