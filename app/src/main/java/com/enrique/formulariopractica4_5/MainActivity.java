package com.enrique.formulariopractica4_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * author Enrique García-Palacios Blasco
 */
public class MainActivity extends AppCompatActivity {

    Button enviar;
    Button borrar;
    EditText campo1txt;
    EditText campo2txt;
    CheckBox chk1;
    CheckBox chk2;
    CheckBox chk3;
    CheckBox chk4;
    RadioButton rd1;
    RadioButton rd2;
    RadioButton rd3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enviar=(Button) findViewById(R.id.enviar);
        borrar=(Button) findViewById(R.id.borrar);
        campo1txt=(EditText) findViewById(R.id.campo1txt);
        campo2txt=(EditText) findViewById(R.id.campo2txt);
        chk1 =(CheckBox) findViewById(R.id.checkBox);
        chk2 =(CheckBox) findViewById(R.id.checkBox2);
        chk3 =(CheckBox) findViewById(R.id.checkBox3);
        chk4 =(CheckBox) findViewById(R.id.checkBox4);
        rd1=(RadioButton) findViewById(R.id.radioButton2);
        rd2=(RadioButton) findViewById(R.id.radioButton5);
        rd3=(RadioButton) findViewById(R.id.radioButton6);

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campo1txt.setText(null);
                campo2txt.setText(null);
                if(chk1.isChecked())
                    chk1.toggle();
                if (chk2.isChecked())
                chk2.toggle();
                if(chk3.isChecked())
                chk3.toggle();
                if(chk4.isChecked())
                chk4.toggle();

                if(rd1.isChecked())
                    rd1.setChecked(false);
                else if(rd2.isChecked())
                    rd2.setChecked(false);
                else if(rd3.isChecked())
                    rd3.setChecked(false);
            }
        });
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"enviar",Toast.LENGTH_LONG).show();

                //Toast.makeText(MainActivity.this, "Formulario enviado", Toast.LENGTH_LONG).show();
            }
        });
    }

    /*public void onCheckboxClicked(View v){
        boolean checked=((checkBox)v).isChecked;

        switch (v.getId()){
            case R.id.checkBox:
                if(checked)
                    break;
                else
                    break;
            case R.id.checkBox:
                if(checked)
                    break;
                else
                    break;

        }
    }*/
}