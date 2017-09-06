package com.crincongtz.ejemplobutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    TextView textViewA;
    @BindView(R.id.textB) TextView textViewB;

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
