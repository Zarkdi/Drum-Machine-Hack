package oberlin.drummachinehack;

/**
 * Created by Lukas on 9/23/17.
 */

public class Square {
    float topLeftX;
    float topLeftY;
    float bottomRightX;
    float bottomRightY;
    boolean isSelected;

    public Square(float topLeftX, float topLeftY, float bottomRightX, float bottomRightY){
        this.topLeftX=topLeftX;
        this.topLeftY=topLeftY;
        this.bottomRightX=bottomRightX;
        this.bottomRightY=bottomRightY;
        isSelected=false;
    }

    public float getTopLeftX() {
        return topLeftX;
    }

    public float getTopLeftY() {
        return topLeftY;
    }

    public float getBottomRightX() {
        return bottomRightX;
    }

    public float getBottomRightY() {
        return bottomRightY;
    }


}
