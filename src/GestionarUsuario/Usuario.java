package GestionarUsuario;

public class Usuario {

    private String nombreUsuario;
    private String apellidoUsuario;
    private String domicilioUsuario;
    private String edadUsuario;
    private TipoUsuario tipoUsuario;

    public Usuario(String nombreUsuario, String apellidoUsuario, String domicilioUsuario, String edadUsuario, TipoUsuario tipoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.domicilioUsuario = domicilioUsuario;
        this.edadUsuario = edadUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getDomicilioUsuario() {
        return domicilioUsuario;
    }

    public void setDomicilioUsuario(String domicilioUsuario) {
        this.domicilioUsuario = domicilioUsuario;
    }

    public String getEdadUsuario() {
        return edadUsuario;
    }

    public void setEdadUsuario(String edadUsuario) {
        this.edadUsuario = edadUsuario;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
