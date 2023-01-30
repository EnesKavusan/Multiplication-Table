package com.example.carpimtablosu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText say;
    Button gos;
    TextView tab;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        say=findViewById(R.id.editTextNumber);
        gos=findViewById(R.id.button);
        tab=findViewById(R.id.textView3);



        gos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer yaz=new StringBuffer();

                int sonuc,n;

                n=Integer.parseInt(say.getText().toString()) ;

                for(int i=0;i<=10;i++){
                    sonuc = i*n;
                    yaz.append(n + "\t X \t"+ i + "\t = \t" + sonuc + "\n");
                }
                tab.setText(yaz);
            }
        });
    }
}