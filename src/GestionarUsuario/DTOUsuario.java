package GestionarUsuario;

public class DTOUsuario {

    private String nombreDTOUsuario;
    private String apellidoDTOUsuario;
    private String domicilioDTOUsuario;
    private String edadDTOUsuario;
    private String tipoUsuarioDTOUsuario;

    public DTOUsuario(String nombreDTOUsuario, String apellidoDTOUsuario) {
        this.nombreDTOUsuario = nombreDTOUsuario;
        this.apellidoDTOUsuario = apellidoDTOUsuario;
    }

    
    public DTOUsuario(String nombreDTOUsuario, String apellidoDTOUsuario, String domicilioDTOUsuario, String edadDTOUsuario, String tipoUsuarioDTOUsuario) {
        this.nombreDTOUsuario = nombreDTOUsuario;
        this.apellidoDTOUsuario = apellidoDTOUsuario;
        this.domicilioDTOUsuario = domicilioDTOUsuario;
        this.edadDTOUsuario = edadDTOUsuario;
        this.tipoUsuarioDTOUsuario = tipoUsuarioDTOUsuario;
    }

    public String getNombreDTOUsuario() {
        return nombreDTOUsuario;
    }

    public void setNombreDTOUsuario(String nombreDTOUsuario) {
        this.nombreDTOUsuario = nombreDTOUsuario;
    }

    public String getApellidoDTOUsuario() {
        return apellidoDTOUsuario;
    }

    public void setApellidoDTOUsuario(String apellidoDTOUsuario) {
        this.apellidoDTOUsuario = apellidoDTOUsuario;
    }

    public String getDomicilioDTOUsuario() {
        return domicilioDTOUsuario;
    }

    public void setDomicilioDTOUsuario(String domicilioDTOUsuario) {
        this.domicilioDTOUsuario = domicilioDTOUsuario;
    }

    public String getEdadDTOUsuario() {
        return edadDTOUsuario;
    }

    public void setEdadDTOUsuario(String edadDTOUsuario) {
        this.edadDTOUsuario = edadDTOUsuario;
    }

    public String getTipoUsuarioDTOUsuario() {
        return tipoUsuarioDTOUsuario;
    }

    public void setTipoUsuarioDTOUsuario(String tipoUsuarioDTOUsuario) {
        this.tipoUsuarioDTOUsuario = tipoUsuarioDTOUsuario;
    }

}
