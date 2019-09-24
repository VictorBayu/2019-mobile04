package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import id.ac.polinema.intent.Model.USER;

public class ProfileParcelableActivity extends AppCompatActivity {

    private TextView text_username, text_name, text_age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);
        text_username = findViewById(R.id.text_username);
        text_name = findViewById(R.id.text_name);
        text_age = findViewById(R.id.text_age);
        USER user = getIntent().getParcelableExtra("user1");

        if (user != null) {
            String username = user.getUsername();
            String name = user.getName();
            int age = user.getAge();
            text_username.setText(username);
            text_name.setText(name);
            text_age.setText(String.valueOf(age));

        }
    }
}
