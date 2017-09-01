package aparicio.arnau.hector.freewc.modelo;

/**
 * Created by hector on 6/08/17.
 */

public class Usuario {
    private String nombre,password;
    private boolean administrador;

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
        administrador= false;
    }

    public Usuario(String nombre, String password,boolean administrador) {
        this.nombre = nombre;
        this.password = password;
        this.administrador=administrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void hazAdministrador() {
        this.administrador = true;
    }
    public void hazNoAdministrador() {
        this.administrador = false;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", administradir=" + administrador +
                '}';
    }
}
