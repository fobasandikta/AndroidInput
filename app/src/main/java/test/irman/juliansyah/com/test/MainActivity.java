package test.irman.juliansyah.com.test;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int a,b,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input);

        final EditText angka1 = (EditText) findViewById(R.id.txtAngka1);
        final EditText angka2 = (EditText) findViewById(R.id.txtAngka2);
        Button proses = (Button) findViewById(R.id.btnProses);
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a = Integer.parseInt(angka1.getText().toString());
                b = Integer.parseInt(angka2.getText().toString());
                hasil = a + b;

                Intent pindah = new Intent(MainActivity.this ,Pindah.class);

                Bundle b = new Bundle();
                b.putInt("hasil", hasil);
                pindah.putExtras(b);

                startActivity(pindah);

            }
        });

    }
}
