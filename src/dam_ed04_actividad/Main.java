/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;


public class Main {
    float importe;

    public static void main(String[] args) {
        Main main = new Main();
        main.operacion_cuenta(200);
    }
    
    public void operacion_cuenta(float importe) {
        CCuenta cuentaENRIQUE;
        double saldoActual;

        cuentaENRIQUE = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuentaENRIQUE.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuentaENRIQUE.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuentaENRIQUE.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
