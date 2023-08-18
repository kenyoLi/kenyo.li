package Ejemplo1;

public class alumno {
    public String nombre;
    public double[] calificaciones = new double[5];
    public  alumno(String nombre){
        this.nombre=nombre;
    }
    public void ingresarCalificacion(int calificacion){
        for (int i=0; i < calificaciones.length; i++){
            calificaciones[i] = calificacion;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public double calcularPromedio(){
        double promedio;
        double suma;
        for(int i = 0; i<calificaciones.length; i++){
            suma= suma  + calificaciones[i];
        }
        promedio = suma/calificaciones.length;
        return promedio;

    }
}
