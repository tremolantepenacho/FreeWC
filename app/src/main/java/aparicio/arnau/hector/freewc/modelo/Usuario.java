package aparicio.arnau.hector.freewc.modelo;

/**
 * Created by hector on 6/08/17.
 */

public class Usuario {
    private String nombre,password;
    private TipoUsuario tipo;

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
        tipo= TipoUsuario.Normal;
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

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
