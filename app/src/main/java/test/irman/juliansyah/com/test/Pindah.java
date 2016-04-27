package test.irman.juliansyah.com.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by root on 27/04/16.
 */
public class Pindah extends AppCompatActivity{

    int getAngka;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil);

        TextView hasil = (TextView) findViewById(R.id.tvHasil);
        Bundle b = getIntent().getExtras();
        getAngka = b.getInt("hasil");

        hasil.setText("hasilnya"+getAngka);

    }
}
