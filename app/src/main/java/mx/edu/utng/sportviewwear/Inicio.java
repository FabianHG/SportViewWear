package mx.edu.utng.sportviewwear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Inicio extends AppCompatActivity {
    Button btnSalir;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        mAuth = FirebaseAuth.getInstance();
        btnSalir = findViewById(R.id.btnSalir);

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                startActivity(new Intent(Inicio.this, MainActivity.class));
                finish();
            }
        });
    }
}