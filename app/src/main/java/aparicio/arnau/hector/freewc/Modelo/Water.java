package aparicio.arnau.hector.freewc.Modelo;

import java.util.Date;

/**
 * Created by hector on 6/08/17.
 */

public class Water {
    private int _id;
    private String nombre,comentario;
    private double latitud,longitud;
    private Usuario creador;
    private Date fechaCreacion;
    //falta horario

    public Water(String nombre, double latitud, double longitud,Usuario creador, Date fechaCreacion) {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.creador=creador;
        this.fechaCreacion=fechaCreacion;
    }

    public Water(String nombre, String comentario, double latitud, double longitud,Usuario creador, Date fechaCreacion) {
        this.nombre = nombre;
        this.comentario = comentario;
        this.latitud = latitud;
        this.longitud = longitud;
        this.creador=creador;
        this.fechaCreacion=fechaCreacion;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
