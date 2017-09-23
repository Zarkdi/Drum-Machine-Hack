package oberlin.drummachinehack;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukas on 9/23/17.
 */

public class DrumMachineView extends View {
    private Paint squarePaint;
    private ArrayList<Row> listRows;

    public DrumMachineView(Context context, AttributeSet attrs) {
        super(context, attrs);
        listRows=new ArrayList<Row>();

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
        createRows(3);
        drawRows(canvas);

    }

    protected void createRows(int numRows){
        for (int i = 0; i < numRows; i++) {
            this.listRows.add(new Row(i,16,getWidth(),100));
        }

    }

    protected void drawRows(Canvas canvas){
        ArrayList<Square> squares;
        Square square;
        System.out.println("in drawRows, listRows size: " + listRows.size());
        for (int i = 0; i < listRows.size(); i++) {
            squares=listRows.get(i).getListSquares();
            System.out.println("in drawRows, squares size: " + squares.size());
            for (int j = 0; j < squares.size(); j++) {
                square=squares.get(j);
                canvas.drawRect(square.getTopLeftX(), square.getTopLeftY(), square.getBottomRightX(),square.getBottomRightY(), squarePaint);
            }

        }
    }


}
