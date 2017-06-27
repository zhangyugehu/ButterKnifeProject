package com.hth.butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    @BindView(R.id.text_view)
    @com.thssh.BindView(R.id.text_view)
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InjectView.bind(this);
//        ButterKnife.bind(this);


        textView.setText("i'm bindView");
    }
}
