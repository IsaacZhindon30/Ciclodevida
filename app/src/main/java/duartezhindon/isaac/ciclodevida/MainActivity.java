package duartezhindon.isaac.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="Ciclos de vida";
    private int contador=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.util.Log.i(TAG,"Oncreate");
        contador++;
    }

    @Override
    protected void onStart() {
        super.onStart();
        android.util.Log.i(TAG,"OnStart");
        contador++;
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        android.util.Log.i(TAG,"OnRestart");

    }
    @Override
    protected void onPause() {
        super.onPause();
        android.util.Log.i(TAG,"OnPause");//TODO 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
        contador++;
    }
    @Override
    protected void onResume() {
        super.onResume();
        android.util.Log.i(TAG,"OnResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        android.util.Log.i(TAG,"OnStop");
        contador--;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.util.Log.i(TAG,"OnDestroy");

    }


}