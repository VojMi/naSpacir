package eu.naspacir.naspacir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class HlavniMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rozcestnik);

        final Button btn_letosni = findViewById(R.id.letosni);
        btn_letosni.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Zalozky.class);
                startActivity(intent);

            }
        });

        final Button btn_gps = findViewById(R.id.gps);
        btn_gps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Zalozky.class);
                startActivity(intent);

            }
        });
    }

}