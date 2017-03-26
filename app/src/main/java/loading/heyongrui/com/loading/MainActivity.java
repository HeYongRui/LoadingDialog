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
        loadingDialog = new LoadingDialog(this);
        loadingDialog.setColor(Color.BLACK);
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
    }
}
