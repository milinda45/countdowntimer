package lk.ac.kln.countdowntimer;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int Counter =99;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountDown();
    }

    private void CountDown () {
        final TextView textview= findViewById(R.id.textView);
        final Handler Handler = new Handler();
        Handler.post(new Runnable(){
            @Override
            public void run() {
                textview.setText(Integer.toString(Counter));
                Counter--;
                Handler.postDelayed(this, 1000);
        }
    });
}