public class autor {
    private String nombre;
    private String apellidos;
    private String fecha_nacimiento;
    private String localidad_nacimiento;
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos(){
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getFecha_nacimiento(){
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public String getLocalidad_nacimiento(){
        return localidad_nacimiento;
    }

    public void setLocalidad_nacimiento(String localidad_nacimiento) {
        this.localidad_nacimiento = localidad_nacimiento;
    }
}
