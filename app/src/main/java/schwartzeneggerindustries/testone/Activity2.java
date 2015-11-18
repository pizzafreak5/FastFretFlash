package schwartzeneggerindustries.testone;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.content.Intent;
import android.os.CountDownTimer;


public class Activity2 extends AppCompatActivity {

    private TextView countDownTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

    }

        //Get fucked java
    public void runTimer(View v){
        countDownTimer = (TextView) findViewById(R.id.timer);
        FFFTimer timer = new FFFTimer(50000, 1);
        timer.start();
    }

    public class FFFTimer extends CountDownTimer{


        public FFFTimer(long startTime, long interval){
            super(startTime, interval);
        }

        @Override
        public void onTick(long millisUntilFinished){
            countDownTimer.setText("" + millisUntilFinished);
        }

        @Override
        public void onFinish(){
            countDownTimer.setText("TIMES UP");
        }
    }

}
