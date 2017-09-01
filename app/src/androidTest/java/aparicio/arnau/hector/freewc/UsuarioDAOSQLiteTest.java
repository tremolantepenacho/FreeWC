package aparicio.arnau.hector.freewc;

import static android.support.test.InstrumentationRegistry.getTargetContext;

import android.database.sqlite.SQLiteDatabase;
import android.support.test.runner.AndroidJUnit4;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import aparicio.arnau.hector.freewc.controlador.Controlador;
import aparicio.arnau.hector.freewc.dao.ImplementacionDAOSQLite.UsuarioDAOSQLite;
import aparicio.arnau.hector.freewc.dao.UsuarioDAO;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


/**
 * Created by hector on 28/08/17.
 */

@RunWith(AndroidJUnit4.class)
public class UsuarioDAOSQLiteTest{

    private Controlador contro;
    private FreeWCSQLiteOpenHelper database;
    private UsuarioDAOSQLite uDAO;

    @Before
    public void setUp() throws Exception {
        getTargetContext().deleteDatabase(FreeWCSQLiteOpenHelper.DB_NAME);
        database = new FreeWCSQLiteOpenHelper(getTargetContext());
        contro=Controlador.obtenControlador();
        uDAO=new UsuarioDAOSQLite();

    }

    @After
    public void tearDown() throws Exception {
        database.close();
    }

    @Test
    public void getUsuarioByID() throws  Exception{
        assertTrue(uDAO.get(1).getNombre().compareTo("pepe")==1);
    }
}
