package mg.madaapps.plugin_nativescript;
import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public void show(Context context) {
        CharSequence text = "Mianga sa tsia ?";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}