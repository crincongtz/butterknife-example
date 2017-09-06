package com.crincongtz.ejemplobutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    TextView textViewA;

    @BindView(R.id.textB) TextView textViewB;
    @BindView(R.id.boton) Button boton;

    @OnClick(R.id.boton)
    public void clicked(){
        Toast.makeText(this, "Click with ButterKnife", Toast.LENGTH_SHORT).show();
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
