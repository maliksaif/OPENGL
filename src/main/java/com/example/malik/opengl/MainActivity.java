package com.example.malik.opengl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Paint paint   = new Paint();
        paint.setColor(Color.parseColor("#BFBFBF"));


        Paint paint2   = new Paint();
        paint2.setColor(Color.parseColor("#000000"));


        Bitmap bg = Bitmap.createBitmap(480,800,Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bg);
        canvas.drawCircle(120,200,70,paint);
        canvas.drawCircle(350,200,70,paint);


        canvas.drawCircle(120,500,70,paint);
        canvas.drawCircle(350,500,70,paint);


        canvas.drawCircle(300,350,20,paint2);



        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.drawing_Area);
        linearLayout.setBackgroundDrawable(new BitmapDrawable(bg));





    }
}
