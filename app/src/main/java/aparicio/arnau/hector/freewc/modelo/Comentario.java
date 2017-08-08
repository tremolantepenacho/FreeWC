package aparicio.arnau.hector.freewc.modelo;

import java.util.Date;

/**
 * Created by hector on 6/08/17.
 */

public class Comentario {
    private Usuario usuario;
    private Water water;
    private Date fecha;
    private int puntuacion;
    private String texto;

    public Comentario(Usuario usuario, Water water, Date fecha, int puntuacion) {
        this.usuario = usuario;
        this.water = water;
        this.fecha = fecha;
        this.puntuacion = puntuacion;
    }

    public Comentario(Usuario usuario, Water water, Date fecha, int puntuacion, String texto) {
        this.usuario = usuario;
        this.water = water;
        this.fecha = fecha;
        this.puntuacion = puntuacion;
        this.texto = texto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "usuario=" + usuario +
                ", water=" + water +
                ", fecha=" + fecha +
                ", puntuacion=" + puntuacion +
                ", texto='" + texto + '\'' +
                '}';
    }
}
