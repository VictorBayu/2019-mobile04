package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import id.ac.polinema.intent.Model.USER;

public class ParcelableActivity extends AppCompatActivity {
    public static final String user_key = "user1";
    private EditText usernameInput, nameInput,ageInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);

        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);
    }

    public void HandleParcelable(View view) {
        String username = usernameInput.getText().toString();
        String name = nameInput.getText().toString();
        int age = Integer.parseInt(ageInput.getText().toString());
        USER user = new USER(username,name,age);
        Intent intent = new Intent (this, ProfileParcelableActivity.class);
        intent.putExtra(user_key, user);
        startActivity(intent);

    }
}
