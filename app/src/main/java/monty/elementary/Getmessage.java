package monty.elementary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by monty on 6/9/16.
 */
public class Getmessage extends AppCompatActivity {

    TextView display;
    Bundle bundle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message);

        display = (TextView) findViewById(R.id.getmessage) ;
        bundle = getIntent().getExtras();
        String msg = bundle.getString("message");
        display.setText(msg);
    }

}
