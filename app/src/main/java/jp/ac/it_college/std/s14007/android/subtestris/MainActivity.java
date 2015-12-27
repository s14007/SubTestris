package jp.ac.it_college.std.s14007.android.subtestris;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Board.Callback{
    private Board board;
    private Handler handler;
    private Tetromino.Type type;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        handler = new Handler();
        setContentView(R.layout.activity_main);

        Bitmap srcImage = BitmapFactory.decodeResource(getResources(),
                android.R.drawable.ic_media_play);
        Matrix matrix = new Matrix();

        matrix.postRotate(90);
        Bitmap fallImage = Bitmap.createBitmap(srcImage, 0, 0,
                srcImage.getWidth(), srcImage.getHeight(), matrix, true);
        ((ImageButton) findViewById(R.id.fall)).setImageBitmap(fallImage);

        matrix.postRotate(90);
        Bitmap leftImage = Bitmap.createBitmap(srcImage, 0, 0,
                srcImage.getWidth(), srcImage.getHeight(), matrix, true);
        ((ImageButton) findViewById(R.id.left)).setImageBitmap(leftImage);

        board = (Board) findViewById(R.id.board);
        board.setCallback(this);
    }

    public void gameButtonClick(View v) {
        switch (v.getId()) {
            case R.id.left:
                board.send(Input.Left);
                break;
            case R.id.right:
                board.send(Input.Right);
                break;
            case R.id.fall:
                board.send(Input.Down);
                break;
            case R.id.rotate:
                board.send(Input.Rotate);
                break;
            case R.id.keep:
                board.send(Input.Keep);
                break;
        }
    }


    @Override
    public void scoreAdd(final int score) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                TextView scoreVIew = (TextView) findViewById(R.id.score);
                int current = Integer.parseInt(scoreVIew.getText().toString());
                current += score;
                scoreVIew.setText(String.valueOf(current));
            }
        });
    }

    public void stockId(final int id) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                String message = String.valueOf(id);
                switch (id) {
                    case 1:
                        Log.e("Log :", message + ": case 1");
                        break;
                    case 2:
                        Log.e("Log :", message + ": case 2");
                        break;
                    case 3:
                        Log.e("Log :", message + ": case 3");
                        break;
                    case 4:
                        Log.e("Log :", message + ": case 4");
                        break;
                    case 5:
                        Log.e("Log :", message + ": case 5");
                        break;
                    case 6:
                        Log.e("Log :", message + ": case 6");
                        break;
                    case 7:
                        Log.e("Log :", message + ": case 7");
                        break;
                }
            }
        });
//        String m = String.valueOf(id);
//        Log.e("Log :", m);
    }

}

