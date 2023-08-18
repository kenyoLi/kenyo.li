package org.example;

class supermercado {
    public static void main(String[] args) {
        int cantdocena;
        int compra;
        int precio;



        double descuento15;
        double Descuento10;
        double pagodes15;
        double pagodes10;
        double compraT;

        cantdocena= 4;
        compra= cantdocena*12;
        precio = 15;


        if (compra >= 36) {

            descuento15 = compra * precio * 0.15;
            pagodes15 = compra * precio - descuento15;
            System.out.println("tu compra en unidades es de:");
            System.out.println(compra);
            System.out.println("tu descuento es de:");
            System.out.println(descuento15);
            System.out.println("tu pago total es:");
            System.out.println(pagodes15);

        } else {
            Descuento10 = compra * precio * 0.1;
            pagodes10 = compra * precio - Descuento10;
            System.out.println("tu descuento es de:");
            System.out.println(Descuento10);
            System.out.println("tu pago total es:"); System.out.println(pagodes10);
    }
        if (compra >=48) {
            compraT = compra + 1;
            System.out.println("te regalamos 1 gorro gratis por tu compra mayor a 3 docenas:");
            System.out.println("tu compra total es de:");
            System.out.println(compraT);
        }
}
}