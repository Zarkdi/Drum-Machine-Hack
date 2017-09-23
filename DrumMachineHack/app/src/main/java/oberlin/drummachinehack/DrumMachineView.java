package oberlin.drummachinehack;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Lukas on 9/23/17.
 */

public class DrumMachineView extends View {
    private Paint squarePaint;

    public DrumMachineView(Context context, AttributeSet attrs) {
        super(context, attrs);


        squarePaint = new Paint();
        squarePaint.setColor(Color.RED);
        squarePaint.setStyle(Paint.Style.FILL);//fills the area
    }

    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        /*
        * 1st 2 params: top left corner of square.
        * 2nd 2 params: (width and height)
        * */
        System.out.println("\n\ndrawing the rect.....");
        drawRows(canvas, 16, 3);

    }

    protected void drawRows(Canvas canvas, int numSquares, int numRows){
        float topLeftX;
        float topLeftY;
        float bottomRightX;
        float bottomRightY;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numSquares; j++) {
                topLeftX = j * (getWidth() / 16);
                topLeftY = i * 200;
                bottomRightX = j * (getWidth() / 16) + 100;
                bottomRightY = i * 200 + 100;
                canvas.drawRect(topLeftX, topLeftY, bottomRightX, bottomRightY, squarePaint);
            }



        }
    }
}
