package Ejercicio02;

public class cuenta_bancaria {
    int numero_cuenta;
    double saldo = 1.855;
    String nombre_propietario;

    public void cuenta(int numero_cuenta, double saldo, String nombre_propietario) {
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
        this.nombre_propietario = nombre_propietario;
    }

    public double depositar(double cantidad) {
        System.out.println("tienes en tu cuenta $" + saldo);
        double sum = saldo += cantidad;
        System.out.println("has depositado $" + cantidad + "tu cuenta ");
        return saldo;

    }

    public double retirar(double cantidad) {
        System.out.println("tienes en tu cuenta $" + saldo);
        double sum = saldo -= cantidad;
        if (cantidad > saldo) {
            System.out.println("saldo insuficiente");
        } else {
            System.out.println("retiro exitoso");
        }
        System.out.println(("has restirado $" + cantidad + "tu cuenta"));
        return saldo;
    }

    public double obtener_saldo() {
        System.out.println(" tu saldo actual es $" + saldo);
        return saldo;
    }


    public static void main(String[] args) {
        cuenta_bancaria banco = new cuenta_bancaria();
        banco.depositar(500);
        banco.retirar(100);
        banco.obtener_saldo();
    }

}
