public class MoveablePoint extends Point {
    private  float xSpeed , ySpeed;

    public MoveablePoint(){}

    public MoveablePoint(float x , float y , float xSpeed , float ySpeed){
        super(x, y);
        this.xSpeed =xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed , float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed,ySpeed};

    }
    public MoveablePoint Move(){
        setX(getX()+getXSpeed());
        setY(getY()+getYSpeed());
            return this ;
    }



    @Override
    public String toString() {
        return super.toString()
                + " Move with speed x = " +getXSpeed()
                + " and x= " + getYSpeed()
                ;
    }
}
