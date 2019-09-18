package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class ProfileBundleActivity extends AppCompatActivity {
    private TextView usernameText, nameText, ageText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String username = extras.get("username").toString();
            String name = extras.get("name").toString();
            String age = extras.get("age").toString();
            usernameText.setText(username);
            nameText.setText(name);
            ageText.setText(age);
        }
    }
}
