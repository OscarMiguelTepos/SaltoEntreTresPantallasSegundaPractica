package omtc.itics.tesoem.edu.saltoentretrespantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void Siguiente2(View view){
        Intent siguiente = new Intent(this, MainActivity.class);
        startActivity(siguiente);
    }

}

