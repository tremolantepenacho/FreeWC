package aparicio.arnau.hector.freewc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hector on 9/08/17.
 */

public class FreeWCSQLiteOpenHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "demo.db";

    private String SQLcreaUsuario = "CREATE TABLE tblUsuario (_id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE ," +
            " nombre TEXT NOT NULL  UNIQUE ," +
            " password TEXT NOT NULL ," +
            " admin INTEGER NOT NULL DEFAULT 0)";

    private String SQLcreaWater="CREATE TABLE tblWater (_id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE ," +
            "nombre TEXT NOT NULL ," +
            "latitud DOUBLE NOT NULL ," +
            "longitud DOUBLE NOT NULL ," +
            "comentario TEXT," +
            "creador INTEGER," +
            "fecha DATETIME,"+
            "FOREIGN KEY(creador) REFERENCES tblUsuario(_id)" +
            ");)";

    private String SQLcreaComentario="CREATE TABLE tblComentario (usuario INTEGER NOT NULL ," +
            "water INTEGER NOT NULL , " +
            "comentario TEXT," +
            "fecha DATETIME NOT NULL ," +
            "puntuacion INTEGER CHECK (puntuacion>=0 AND puntuacion<=5)," +
            "PRIMARY KEY (usuario,water)" +
            "FOREIGN KEY (usuario) REFERENCES tblUSUARIO(_id)" +
            "FOREIGN KEY (water) REFERENCES tblWATER(_id)" +
            ")";

   // private static FreeWCSQLiteOpenHelper db;

    public FreeWCSQLiteOpenHelper(Context context) {

        super(context, DB_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase bd) {

        bd.execSQL(SQLcreaUsuario);
        bd.execSQL(SQLcreaWater);
        bd.execSQL(SQLcreaComentario);
        bd.execSQL("INSERT INTO tblUsuario ('nombre', 'password', 'admin') VALUES ('pepe','caca',1)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase bd, int arg1, int arg2) {

        bd.execSQL("DROP TABLE IF EXIST tblUsuario");
        bd.execSQL("DROP TABLE IF EXIST tblWater");
        bd.execSQL("DROP TABLE IF EXIST tblComentario");
        bd.execSQL(SQLcreaUsuario);
        bd.execSQL(SQLcreaWater);
        bd.execSQL(SQLcreaComentario);

    }
}
