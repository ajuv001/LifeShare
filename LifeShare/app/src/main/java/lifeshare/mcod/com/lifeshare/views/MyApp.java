package lifeshare.mcod.com.lifeshare.views;

import android.app.Application;

/**
 * Created by aju.vidyadharan on 13-12-2016.
 */

public class MyApp extends Application {

    public static int getLogin() {
        return login;
    }

    public static void setLogin(int login) {
        MyApp.login = login;
    }

    public static int login;
}
