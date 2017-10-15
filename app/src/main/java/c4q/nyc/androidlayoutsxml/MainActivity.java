package c4q.nyc.androidlayoutsxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // change the text in the text view
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("I replaced hello world, yay!!!");

        Log.d(TAG, "hello world");
    }
}
