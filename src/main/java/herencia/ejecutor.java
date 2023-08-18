package herencia;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ejecutor{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingresar nombres: ");
        String nombres = scan.next();
        System.out.println("Ingresar apellidos: ");
        String apellidos = scan.next();
        System.out.println("Ingresar documento: ");
        String documento = scan.next();
        System.out.println("Ingresar dias trabajados: ");
        int diasTrabajados = scan.nextInt();
        System.out.println("Ingresar Sueldo por dia: ");
        int sueldo = scan.nextInt();


        empleadeishon empleado1 = new empleadeishon();
        empleado1.setNombres(nombres);
        empleado1.setDiasTrabajados(diasTrabajados);
        empleado1.setApellido(apellidos);
        empleado1.setDocumento(documento);
        empleado1.setSueldo(sueldo);

        System.out.println("el empleado "+ empleado1.getNombres());
    }
}
