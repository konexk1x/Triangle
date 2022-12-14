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

    @Test(dataProvider = "outOfRangeValue")
    public void outOfRange(Triangle triangle, boolean expected) {
        Assert.assertEquals(triangle.outOfRange(), expected);
    }

    @DataProvider(name = "Equilateral")
    public Object[][] _Equilateral() {
        return new Object[][]{{new Triangle(7, 7, 7), true},
                {new Triangle(11, 11, 11), true}};
    }

    @Test(dataProvider = "Equilateral")
    public void isEquilateral(Triangle triangle, boolean expected) {
        Assert.assertEquals(triangle.isEquilateral(), expected);
    }
}
