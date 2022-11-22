import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        int op=-1;
        //El programa inicia creando una cuenta
        m.nombrarCuenta();
        do {
            mostrarMenu();
            System.out.print("Ingrese la opcion a realizar: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    //Llama al metodo para consultar saldo
                    m.consultarSaldo();
                    break;
                case 2:
                    //Llama al metodo para retirar dinero de la cuenta
                    m.retirar();
                    break;
            }
        }while(op!=0);

    }
    //Menu del cajero
    static void mostrarMenu() {
        System.out.println("MENU DE CAJERO");
        System.out.println("1. Consulta de saldo");
        System.out.println("2. Retirar dinero");
        System.out.println("0. Salir");
    }
}
