package singelton;

import java.util.Date;

public class DBHelper {
    private static volatile DBHelper dbHelper;
    private  int count;

    private DBHelper() {}

    public static DBHelper getInstance() {
        DBHelper localdbHelper = dbHelper;
        if (localdbHelper == null) {
            synchronized (DBHelper.class) {
                localdbHelper = dbHelper;
                if (localdbHelper == null) {
                    dbHelper = localdbHelper = new DBHelper();
                    dbHelper.count = 0;
                }
            }
        }
        return localdbHelper;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "DBHelper " + count;
    }
}
