package id.ac.poliban.mi.maya.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNama = findViewById(R.id.etNama);
        Button btTampil = findViewById(R.id.bttampilkan);

        btTampil.setOnClickListener(v -> Toast.makeText(this, "Hai Selamat Bergabung"  +etNama.getText().toString(), Toast.LENGTH_SHORT).show());
    }
}
