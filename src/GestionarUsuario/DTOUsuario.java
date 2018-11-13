package GestionarUsuario;

public class DTOUsuario {

    private String idDTOUsuario;
    private String nombreDTOUsuario;
    private String apellidoDTOUsuario;
    private String domicilioDTOUsuario;
    private String edadDTOUsuario;
    private String tipoUsuarioDTOUsuario;

    public DTOUsuario(String idDTOUsuario) {
        this.idDTOUsuario = idDTOUsuario;
    }

    public DTOUsuario(String nombreDTOUsuario, String apellidoDTOUsuario, String domicilioDTOUsuario, String edadDTOUsuario, String tipoUsuarioDTOUsuario) {
        this.nombreDTOUsuario = nombreDTOUsuario;
        this.apellidoDTOUsuario = apellidoDTOUsuario;
        this.domicilioDTOUsuario = domicilioDTOUsuario;
        this.edadDTOUsuario = edadDTOUsuario;
        this.tipoUsuarioDTOUsuario = tipoUsuarioDTOUsuario;
    }

    public DTOUsuario(String idDTOUsuario, String nombreDTOUsuario, String apellidoDTOUsuario, String domicilioDTOUsuario, String edadDTOUsuario, String tipoUsuarioDTOUsuario) {
        this.idDTOUsuario = idDTOUsuario;
        this.nombreDTOUsuario = nombreDTOUsuario;
        this.apellidoDTOUsuario = apellidoDTOUsuario;
        this.domicilioDTOUsuario = domicilioDTOUsuario;
        this.edadDTOUsuario = edadDTOUsuario;
        this.tipoUsuarioDTOUsuario = tipoUsuarioDTOUsuario;
    }

    public String getIdDTOUsuario() {
        return idDTOUsuario;
    }

    public void setIdDTOUsuario(String idDTOUsuario) {
        this.idDTOUsuario = idDTOUsuario;
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
