package loading.heyongrui.com.loadinglibrary;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.github.ybq.android.spinkit.SpinKitView;
import com.github.ybq.android.spinkit.style.ChasingDots;
import com.github.ybq.android.spinkit.style.Circle;
import com.github.ybq.android.spinkit.style.CubeGrid;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.github.ybq.android.spinkit.style.FadingCircle;
import com.github.ybq.android.spinkit.style.FoldingCube;
import com.github.ybq.android.spinkit.style.Pulse;
import com.github.ybq.android.spinkit.style.RotatingCircle;
import com.github.ybq.android.spinkit.style.RotatingPlane;
import com.github.ybq.android.spinkit.style.ThreeBounce;
import com.github.ybq.android.spinkit.style.WanderingCubes;
import com.github.ybq.android.spinkit.style.Wave;

/**
 * Created by Mr.He on 2017/3/26.
 */

public class LoadingDialog {
    public static final int ChASINGDOTS = 0;
    public static final int ROTATINGPLANE = 1;
    public static final int DOUBLEBOUNCE = 2;
    public static final int WAVE = 3;
    public static final int WANDERINGCUBES = 4;
    public static final int PULSE = 5;
    public static final int THREEBOUNCE = 6;
    public static final int CIRCLE = 7;
    public static final int CUBEGRID = 8;
    public static final int FADINGCIRCLE = 9;
    public static final int FOLDINGCUBE = 10;
    public static final int ROTATINGCIRCLE = 11;

    private Context mcontext;
    private float alpha;//loading框的透明度0-1f
    private int type;//loading框的类型
    private int color;//loading框的动画的颜色
    private AlertDialog.Builder builder;
    private AlertDialog alertDialog;
    private boolean cancelable;//loading框是否可取消


    public LoadingDialog(Context mcontext) {
        this(mcontext, true);
    }

    public LoadingDialog(Context mcontext, boolean cancelable) {
        this(mcontext, cancelable, 1f, 0);
    }

    public LoadingDialog(Context mcontext, boolean cancelable, float alpha, int type) {
        this(mcontext, cancelable, alpha, type, Color.parseColor("#9ec9ec"));
    }

    public LoadingDialog(Context mcontext, boolean cancelable, float alpha, int type, @ColorInt int color) {
        this.mcontext = mcontext;
        this.cancelable = cancelable;
        this.alpha = alpha;
        this.type = type;
        this.color = color;
        init();
    }

    public void init() {
        builder = new AlertDialog.Builder(mcontext);
        View loading_dialog_ll = LayoutInflater.from(mcontext).inflate(R.layout.laoding_dialog, null);
        SpinKitView skv = (SpinKitView) loading_dialog_ll.findViewById(R.id.spin_kit);
        skv.setColor(this.color);
        switch (this.type) {
            case 0:
                ChasingDots chasingDots = new ChasingDots();
                skv.setIndeterminateDrawable(chasingDots);
                break;
            case 1:
                RotatingPlane rotatingPlane = new RotatingPlane();
                skv.setIndeterminateDrawable(rotatingPlane);
                break;
            case 2:
                DoubleBounce doubleBounce = new DoubleBounce();
                skv.setIndeterminateDrawable(doubleBounce);
                break;
            case 3:
                Wave wave = new Wave();
                skv.setIndeterminateDrawable(wave);
                break;
            case 4:
                WanderingCubes wanderingCubes = new WanderingCubes();
                skv.setIndeterminateDrawable(wanderingCubes);
                break;
            case 5:
                Pulse pulse = new Pulse();
                skv.setIndeterminateDrawable(pulse);
                break;
            case 6:
                ThreeBounce threeBounce = new ThreeBounce();
                skv.setIndeterminateDrawable(threeBounce);
                break;
            case 7:
                Circle circle = new Circle();
                skv.setIndeterminateDrawable(circle);
                break;
            case 8:
                CubeGrid cubeGrid = new CubeGrid();
                skv.setIndeterminateDrawable(cubeGrid);
                break;
            case 9:
                FadingCircle fadingCircle = new FadingCircle();
                skv.setIndeterminateDrawable(fadingCircle);
                break;
            case 10:
                FoldingCube foldingCube = new FoldingCube();
                skv.setIndeterminateDrawable(foldingCube);
                break;
            case 11:
                RotatingCircle rotatingCircle = new RotatingCircle();
                skv.setIndeterminateDrawable(rotatingCircle);
                break;
        }
        builder = new AlertDialog.Builder(mcontext);
        builder.setCustomTitle(loading_dialog_ll);
        alertDialog = builder.create();
        alertDialog.setCancelable(cancelable);
        Window window = alertDialog.getWindow();
        //loading框透明度
        WindowManager.LayoutParams lp = window.getAttributes();
        lp.alpha = this.alpha;
        window.setAttributes(lp);
    }

    public void show() {
        if (alertDialog != null) {
            if (!alertDialog.isShowing()) {
                alertDialog.show();
            }
        }
    }

    public void dismiss() {
        if (alertDialog != null) {
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
        }
    }

    public boolean isShowing() {
        boolean isShowing = false;
        if (alertDialog != null) {
            if (alertDialog.isShowing()) {
                isShowing = true;
            } else {
                isShowing = false;
            }
        }
        return isShowing;
    }

    public void setColor(@ColorInt int color) {
        this.color = color;
        init();
    }

    public void setType(int type) {
        this.type = type;
        init();
    }

    public void setCancelable(boolean cancelable) {
        this.cancelable = cancelable;
        init();
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
        init();
    }
}
