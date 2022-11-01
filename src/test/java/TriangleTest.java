import application.Triangle;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TriangleTest {

    @DataProvider(name = "notNull")
    public Object[][] LengthNotNull() {
        return new Object[][]{{new Triangle(0, 7, 2), false},
                {new Triangle(5, 0, 1), false}};
    }

    @Test(dataProvider = "notNull")
    public void notNullLength(Triangle triangle, boolean expected) {
        Assert.assertEquals(triangle.notNullLength(), expected);
    }

    @DataProvider(name = "notTriangle")
    public Object[][] is_Triangle() {
        return new Object[][]{{new Triangle(9, 2, 6), false},
                {new Triangle(3, 8, 2), false}};
    }

    @Test(dataProvider = "notTriangle")
    public void isTriangle(Triangle triangle, boolean expected) {
        Assert.assertEquals(triangle.isTriangle(), expected);
    }

    @DataProvider(name = "outOfRangeValue")
    public Object[][] _outOfRangeValue() {
        return new Object[][]{{new Triangle(101, 2, 4), false},
                {new Triangle(7, 101, 8), false}};
    }
}
