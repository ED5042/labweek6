package ie.ul.shuhupdaphone.database;

import ie.ul.shuhupdaphone.gui.Slot;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class ModuleDatabase {
 
	


  // Database open/upgrade helper
  private ModuleDBOpenHelper moduleDBOpenHelper;

  public ModuleDatabase(Context context) {
    moduleDBOpenHelper = new ModuleDBOpenHelper(context, ModuleDBOpenHelper.DATABASE_NAME, null, 
                                              ModuleDBOpenHelper.DATABASE_VERSION);
  }
  
  // Called when you no longer need access to the database.
  public void closeDatabase() {
    moduleDBOpenHelper.close();
  }
  
  /*
   * Implement exercises 5 - 9 here:
   */

  
  /*
   * Implement exercise 3 and 4 here:
   */
  
 

  
  
  private static class ModuleDBOpenHelper extends SQLiteOpenHelper {
    



	// Called when no database exists in disk and the helper class needs
    // to create a new one.
    @Override
    public void onCreate(SQLiteDatabase db) {
      db.execSQL(DATABASE_CREATE);
    }

    // Called when there is a database version mismatch meaning that
    // the version of the database on disk needs to be upgraded to
    // the current version.
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, 
                          int newVersion) {
      // Log the version upgrade.
      Log.w("TaskDBAdapter", "Upgrading from version " +
        oldVersion + " to " +
        newVersion + ", which will destroy all old data");

      // Upgrade the existing database to conform to the new 
      // version. Multiple previous versions can be handled by 
      // comparing oldVersion and newVersion values.

      // The simplest case is to drop the old table and create a new one.
      db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_TABLE);
      // Create a new one.
      onCreate(db);
    }
  }
}
