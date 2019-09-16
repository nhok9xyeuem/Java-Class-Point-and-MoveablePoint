public class MainTest {
    public static void main(String[] args) {
        MainTest mainTest=new MainTest();
        mainTest= new Point(2.5f,4f);
        System.out.println(mainTest);
        mainTest=new MoveablePoint(2f,3f,4f,5f);
        System.out.println(mainTest);
        mainTest=new MoveablePoint(2f,3f,4f,5f).Move();
        System.out.println(mainTest);
    }

}
