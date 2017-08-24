package aparicio.arnau.hector.freewc.controlador;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;

import aparicio.arnau.hector.freewc.FreeWCSQLiteOpenHelper;
import aparicio.arnau.hector.freewc.dao.BusinessException;
import aparicio.arnau.hector.freewc.dao.ComentarioDAO;
import aparicio.arnau.hector.freewc.dao.ImplementacionDAOSQLite.ComentarioDAOSQLite;
import aparicio.arnau.hector.freewc.dao.ImplementacionDAOSQLite.UsuarioDAOSQLite;
import aparicio.arnau.hector.freewc.dao.ImplementacionDAOSQLite.WaterDAOSQLite;
import aparicio.arnau.hector.freewc.dao.UsuarioDAO;
import aparicio.arnau.hector.freewc.dao.WaterDAO;
import aparicio.arnau.hector.freewc.modelo.TipoUsuario;
import aparicio.arnau.hector.freewc.modelo.Usuario;

/**
 * Created by hector on 14/08/17.
 */

public class Controlador {

    private static Controlador controlador;

    private WaterDAO waterDAO;
    private UsuarioDAO usuarioDAO;
    private ComentarioDAO comentarioDAO;
    private static FreeWCSQLiteOpenHelper freeWCSQL;

    private Controlador(Activity actividad){

        freeWCSQL=new FreeWCSQLiteOpenHelper(actividad,"dbFreeWC2",null,1);
        waterDAO=new WaterDAOSQLite();
        usuarioDAO=new UsuarioDAOSQLite();
        comentarioDAO=new ComentarioDAOSQLite();


    }

    public static void creaCrontrolador(Activity actividad){
        if (controlador==null){
           controlador=new Controlador(actividad);
        }
    }

    public Controlador clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static Controlador obtenControlador(){

        return controlador;
    }

    public static SQLiteDatabase obtenReadable(){

        return freeWCSQL.getReadableDatabase();
    }

    public static SQLiteDatabase obtenWritable(){
        return freeWCSQL.getWritableDatabase();
    }

    public Usuario getUsuario(int id){
        try {
            usuarioDAO.get(id);
        } catch (BusinessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
