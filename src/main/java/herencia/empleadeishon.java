package herencia;

public class empleadeishon extends superclase {
    private int diasTrabajados;
    private int sueldo;

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public float getSueldoPorDias() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public float calcularSueldo(){
        float sueldoGanado = diasTrabajados * sueldo;
        return sueldoGanado;
    }
}
