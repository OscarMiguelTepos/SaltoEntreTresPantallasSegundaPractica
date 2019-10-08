package omtc.itics.tesoem.edu.saltoentretrespantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void Siguiente1(View view){
        Intent siguiente = new Intent(this, Main3Activity.class);
        startActivity(siguiente);
    }

}

