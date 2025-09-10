
// Clase CuentaBancaria
class CuentaBancaria {
    // Atributo privado
    private double saldo;

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    // Método para consultar el saldo
    public double getSaldo() {
        return saldo;
    }
}

// Clase Main para probar CuentaBancaria
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        
        cuenta.depositar(500);
        cuenta.retirar(200);
        
        System.out.println("Saldo: " + cuenta.getSaldo()); // Debe imprimir 300
    }
}
