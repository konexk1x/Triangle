import application.Triangle;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TriangleTest {

    @DataProvider(name = "notNull")
    public static Object[] LengthNotNull() {
        return new Object[]{new Triangle(5, 0, 1), true};
    }

    @Test(dataProvider = "notNull")
    void notNullLength(Triangle triangle, boolean expected) {
        Assert.assertEquals(triangle.notNullLength(), expected);
    }
}
