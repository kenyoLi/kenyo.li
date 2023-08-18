package herencia;

public class superclase {
    protected String nombres;
    protected String apellido;
    protected String documento;
    protected String tipo;

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getTipo() {
        return tipo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
