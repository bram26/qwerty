package com.jani.biodata_jani;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText npm,nama,prodi,alamat;
    TextView txtnama,txtnpm,txtprodi,txtalamat;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        npm=(EditText)findViewById(R.id.npm);
        nama=(EditText)findViewById(R.id.nama);
        alamat=(EditText)findViewById(R.id.alamat);
        prodi=(EditText)findViewById(R.id.prodi);
        txtnpm=(TextView)findViewById(R.id.txtnpm);
        txtnama=(TextView)findViewById(R.id.txtnama);
        txtalamat=(TextView)findViewById(R.id.txtalamat);
        txtprodi=(TextView)findViewById(R.id.txtprodi);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnpm = npm.getText().toString();
                String strnama = nama.getText().toString();
                String stralamat = alamat.getText().toString();
                String strprodi = prodi.getText().toString();

                txtnpm.setText(strnpm);
                txtnama.setText(strnama);
                txtalamat.setText(stralamat);
                txtprodi.setText(strprodi);

            }
        });


    }
}