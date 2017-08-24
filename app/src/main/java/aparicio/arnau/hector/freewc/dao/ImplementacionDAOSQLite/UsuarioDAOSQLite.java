package aparicio.arnau.hector.freewc.dao.ImplementacionDAOSQLite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

import aparicio.arnau.hector.freewc.controlador.Controlador;
import aparicio.arnau.hector.freewc.dao.BusinessException;
import aparicio.arnau.hector.freewc.dao.UsuarioDAO;
import aparicio.arnau.hector.freewc.modelo.TipoUsuario;
import aparicio.arnau.hector.freewc.modelo.Usuario;

/**
 * Created by hector on 16/08/17.
 */

public class UsuarioDAOSQLite implements UsuarioDAO {

    private SQLiteDatabase lectura,escritura;

    public UsuarioDAOSQLite(){
        lectura= Controlador.obtenReadable();
        escritura= Controlador.obtenWritable();


    }

    @Override
    public Usuario create() throws BusinessException {
    return null;

    }

    @Override
    public void saveOrUpdate(Usuario entity) throws BusinessException {

    }

    @Override
    public void save(Usuario entity) throws BusinessException {

    }

    @Override
    public void update(Usuario entity) throws BusinessException {

    }

    @Override
    public Usuario get(Integer id) throws BusinessException {

        String[] campos = new String[] {"nombre,password,admin"};
        String[] args = new String[] {id.toString()};
        Cursor c = lectura.query("tblUsuario", campos, "_id=?", args, null, null, null);
        if(c.getCount()==0){
            return null;
        }
        c.moveToFirst();
        if((c.getString(2).compareTo("1")==0)){
            return new Usuario(c.getString(0),c.getString(1),false);
        }
        else {
            return new Usuario(c.getString(0),c.getString(1), true);
        }
    }

    public Usuario get(String nombre) throws BusinessException {

        String[] campos = new String[] {"nombre,password,admin"};
        String[] args = new String[] {nombre};
        Cursor c = lectura.query("tblUsuario", campos, "nombre=?", args, null, null, null);
        if(c.getCount()==0){
            return null;
        }
        c.moveToFirst();
        if((c.getString(2).compareTo("1")==0)){
            return new Usuario(c.getString(0),c.getString(1),false);
        }
        else {
            return new Usuario(c.getString(0),c.getString(1), true);
        }
    }


    @Override
    public void delete(Integer integer) throws BusinessException {

    }

    @Override
    public List<Usuario> findAll() throws BusinessException {
        return null;
    }
}
