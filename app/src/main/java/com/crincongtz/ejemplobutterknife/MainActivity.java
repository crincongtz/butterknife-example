package com.crincongtz.ejemplobutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    TextView textViewA;

    @BindView(R.id.textB) TextView textViewB;
    @BindView(R.id.boton) Button boton;
    @BindView(R.id.botonA) Button botonA;
    @BindView(R.id.botonB) Button botonB;

    @OnClick({R.id.boton, R.id.botonA, R.id.botonB})
    public void clicked(View view){
        switch (view.getId()){
            case R.id.boton:
                Toast.makeText(this, "Click boton", Toast.LENGTH_SHORT).show();
                break;
            case R.id.botonA:
                Toast.makeText(this, "Click boton A", Toast.LENGTH_SHORT).show();
                break;
            case R.id.botonB:
                Toast.makeText(this, "Click boton B", Toast.LENGTH_SHORT).show();
                break;
        }
//        Toast.makeText(this, "Click: " + view.getId(), Toast.LENGTH_SHORT).show();
//        textViewB.setText("Texto ButterKnife");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        textViewA = (TextView) findViewById(R.id.textA);
        textViewA.setText("Texto C");

        textViewB.setText("Texto D");



    }
}
