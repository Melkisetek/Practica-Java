
package Dominio;


public class usuario {
    private int idUsuario;
    private String usuario;
    private String password;
    
    //Constructor
    public usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
    
    public usuario(int idUsuario, String usuario, String password) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }
    
    //Getter and Setter

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
}
