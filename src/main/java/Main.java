import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {
        /*Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());*/

        /*Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());*/

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(1,"ahmet",1111);
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(2,"ayşe",2222);
        System.out.println(juniorDeveloper.toString());
        System.out.println(juniorDeveloper2.toString());
        juniorDeveloper.work();
        juniorDeveloper2.work();

        MidDeveloper midDeveloper = new MidDeveloper(1,"mehmet",30000);
        System.out.println(midDeveloper.toString());
        midDeveloper.work();

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(1,"hakan",40000);
        System.out.println(seniorDeveloper.toString());
        seniorDeveloper.work();

        HRManager hrManager = new HRManager(1,"kerem",10000,
                new JuniorDeveloper[5],new MidDeveloper[3],new SeniorDeveloper[6]);
        hrManager.addEmployee(0,juniorDeveloper);
        hrManager.addEmployee(1,juniorDeveloper2);
        hrManager.addEmployee(0,midDeveloper);
        hrManager.addEmployee(0,seniorDeveloper);
        System.out.println(hrManager.toString());
    }
}