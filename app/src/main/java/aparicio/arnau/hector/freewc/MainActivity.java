package aparicio.arnau.hector.freewc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import aparicio.arnau.hector.freewc.controlador.Controlador;
import aparicio.arnau.hector.freewc.dao.UsuarioDAO;
import aparicio.arnau.hector.freewc.modelo.Usuario;


//android.database.sqlite.SQLiteConstraintException
//si hay valor repetido
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Controlador.creaCrontrolador(this);
        Controlador contro=Controlador.obtenControlador();
        contro.obtenUsuario(1);
        Usuario nuevo=new Usuario("cacac1a","1234");
        contro.insertaUsuario(nuevo);
        Usuario result=contro.obtenUsuario(3);
        System.out.println("************************************************************************************");
        System.out.println(result.getNombre());
    }
}
