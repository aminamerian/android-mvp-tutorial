package am2.example.com.mvp_tutorial.features;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import am2.example.com.mvp_tutorial.R;

public class MainActivity extends AppCompatActivity implements Contract.View {

    private static final String TAG = "MainActivity";
    private Contract.Presenter presenterLayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenterLayer = new Presenter();
        presenterLayer.onViewAttached(this);

        final EditText input = findViewById(R.id.editText_input);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenterLayer.buttonClicked(input.getText().toString());
            }
        });
    }


    @Override
    public Context getActivityContext() {
        return this;
    }

    @Override
    public Context getAppContext() {
        return getActivityContext();
    }

    @Override
    public void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
