package aparicio.arnau.hector.freewc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hector on 9/08/17.
 */

public class FreeWCSQLiteOpenHelper extends SQLiteOpenHelper {

    String SQLcreaBD = "CREATE TABLE tblClientes (codigo INTEGER, nombre TEXT, tf TEXT)";
    private static FreeWCSQLiteOpenHelper db;

    private FreeWCSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {

        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase bd) {

        bd.execSQL(SQLcreaBD);

    }

    @Override
    public void onUpgrade(SQLiteDatabase bd, int arg1, int arg2) {

        bd.execSQL("DROP TABLE IF EXIST tblClientes");
        bd.execSQL(SQLcreaBD);

    }

    public static FreeWCSQLiteOpenHelper creaDB (Context context, String name, SQLiteDatabase.CursorFactory factory, int versie) {
        if (db == null){
            db = new FreeWCSQLiteOpenHelper(context,name,factory,versie);
        }
        return db;

    }

    public FreeWCSQLiteOpenHelper clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
