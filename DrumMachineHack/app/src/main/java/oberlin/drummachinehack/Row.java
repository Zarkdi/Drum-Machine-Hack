package oberlin.drummachinehack;

import java.util.ArrayList;

/**
 * Created by Lukas on 9/23/17.
 */

public class Row {
    private int rowNum ;
    private float rowHeight;
    private int viewWidth;

    private ArrayList<Square> listSquares;
    private int rowLength;

    public Row(int rowNum, int rowLength, int viewWidth, float rowHeight){
        this.rowNum=rowNum;
        this.viewWidth=viewWidth;
        this.rowLength=rowLength;
        this.rowHeight=rowHeight;
        this.listSquares=new ArrayList<Square>();
        createSquare();

    }
    public void createSquare(){
        float topLeftX;
        float topLeftY;
        float bottomRightX;
        float bottomRightY;
        for (int i = 0; i < rowLength; i++) {
            topLeftX = i * (viewWidth/ rowLength);
            topLeftY = rowNum * 200;
            bottomRightX = i * (viewWidth / rowLength) + rowHeight;
            bottomRightY = rowNum * 200 + rowHeight;
            Square s=new Square(topLeftX,topLeftY,bottomRightX,bottomRightY);
            listSquares.add(s);

        }
    }

    public ArrayList<Square> getListSquares() {
        return listSquares;
    }

    public int getRowNum(){
        return rowNum;
    }

    public float getRowHeight(){
        return rowHeight;
    }
}
