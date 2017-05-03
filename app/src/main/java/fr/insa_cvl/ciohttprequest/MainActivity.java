package fr.insa_cvl.ciohttprequest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                AsyncHTTP task = new AsyncHTTP(MainActivity.this);
                task.execute("https://openclassrooms.com/");
            }
        });


    }

}
