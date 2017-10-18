package edu.cnm.bootcamp.russell.helloworld;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

import edu.cnm.bootcamp.russell.helloworld.fragments.MainFragment;

public class MainActivity extends AppCompatActivity
        implements MainFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHelloWorld = (Button) findViewById(R.id.btnHelloWorld);
        btnHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.txtHelloWorld);
                String text = textView.getText().toString();
                String expected = getString(R.string.message_received);

                if (Objects.equals(text, expected)) {
                    textView.setText(R.string.hello_world);
                }
                else {
                    textView.setText(R.string.message_received);
                }
            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
