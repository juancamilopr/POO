package Banco.app;

import Banco.dominio.CuentaBancaria;
import Banco.dominio.Persona;

public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");

        Persona JuanCamilo = new Persona();
        Persona Matias = new Persona();

        CuentaBancaria miCuenta = new CuentaBancaria();
        CuentaBancaria cuentaMatias = new CuentaBancaria();

        JuanCamilo.nombre = "Juan Camilo";
        miCuenta.titular = JuanCamilo;
        miCuenta.saldo = 800000;
        miCuenta.estado = "A";

        Matias.nombre = "Matias Cuartas";
        cuentaMatias.titular = Matias;
        cuentaMatias.saldo = 20000;
        cuentaMatias.estado = "A";

        miCuenta.retirar(200000);

        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaMatias.consultarSaldo());

        boolean resultadoTransferencia = miCuenta.transferir(216000, cuentaMatias);

        System.out.println(resultadoTransferencia);
        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaMatias.consultarSaldo());
    }
}

