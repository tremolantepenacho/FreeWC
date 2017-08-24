package aparicio.arnau.hector.freewc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import aparicio.arnau.hector.freewc.controlador.Controlador;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Controlador.creaCrontrolador(this);
        Controlador contro=Controlador.obtenControlador();
        contro.getUsuario(1);
    }
}
