package jp.ac.it_college.std.s14007.android.subtestris;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by s14007 on 15/12/25.
 */
public class Keep {
    private int id;

    public Keep(int id) {
        this.id = id;
        viewTetromino(id);
    }

    public void viewTetromino(int id) {
        String m = String.valueOf(id);
        Log.e("Log :", m);
    }
}
