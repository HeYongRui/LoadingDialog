package loading.heyongrui.com.loading;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import loading.heyongrui.com.loadinglibrary.LoadingDialog;

public class MainActivity extends AppCompatActivity {

    private LoadingDialog loadingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button viewById = (Button) findViewById(R.id.btn);
        Button viewById2 = (Button) findViewById(R.id.btn2);
        Button viewById3 = (Button) findViewById(R.id.btn3);
        Button viewById4 = (Button) findViewById(R.id.btn4);
        loadingDialog = new LoadingDialog(this);
        loadingDialog.setType(LoadingDialog.FOLDINGCUBE);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!loadingDialog.isShowing()) {
                    loadingDialog.show();
                } else {
                    loadingDialog.dismiss();
                }
            }
        });
        viewById2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadingDialog loadingDialog = new LoadingDialog(MainActivity.this);
                loadingDialog.setColor(Color.parseColor("#FFE3AB90"));
                loadingDialog.setType(LoadingDialog.WAVE);
                loadingDialog.show();
            }
        });
        viewById3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadingDialog loadingDialog = new LoadingDialog(MainActivity.this);
                loadingDialog.setColor(Color.parseColor("#FFE38888"));
                loadingDialog.setType(LoadingDialog.DOUBLEBOUNCE);
                loadingDialog.show();
            }
        });
        viewById4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadingDialog loadingDialog = new LoadingDialog(MainActivity.this);
                loadingDialog.setColor(Color.parseColor("#FFA3FF78"));
                loadingDialog.show();
            }
        });
    }
}
