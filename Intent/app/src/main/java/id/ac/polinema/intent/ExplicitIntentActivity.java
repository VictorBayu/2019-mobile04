package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {

    private EditText nama;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        nama=findViewById(R.id.input_name);
        hasil=findViewById(R.id.text_output);
    }

    public void handleSubmit(View view) {
        String name=nama.getText().toString();
        hasil.setText(name);
    }
}
