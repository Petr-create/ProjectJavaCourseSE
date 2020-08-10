package LessonTest;

import homework.LessonTest.Vector2D;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Vector2DTest {
    private final double EPS = 1e-9;
    private Vector2D vector2D;

    @Before
    public void createNewVector2D(){
        vector2D = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength(){
        Assert.assertEquals(0, vector2D.length(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX(){
        Assert.assertEquals(0, vector2D.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY(){
        Assert.assertEquals(0, vector2D.getX(), EPS);
    }
}


