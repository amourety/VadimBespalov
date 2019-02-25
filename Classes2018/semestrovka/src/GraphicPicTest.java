import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by amour on 06.03.2018.
 */

public class GraphicPicTest {
    private GraphicPic testedGraphicPic = new GraphicPic();

    @Before
    public void setUp(){
        testedGraphicPic.add(new Segment(0,0,0,0));
        testedGraphicPic.add(new Segment(1,0,0,1));
        testedGraphicPic.add(new Segment(0,0,10,10));
        testedGraphicPic.add(new Segment(3,0,0,2));
        testedGraphicPic.add(new Segment(4,0,0,5));
    }

    @Test
    public void testAdd(){
        testedGraphicPic.add(new Segment(0,0,0,5));
        Assert.assertEquals(testedGraphicPic.get(5).getX1(),0,0.00001);
        Assert.assertEquals(testedGraphicPic.get(5).getX2(),0,0.00001);
        Assert.assertEquals(testedGraphicPic.get(5).getY1(),0,0.00001);
        Assert.assertEquals(testedGraphicPic.get(5).getY2(),5,0.00001);

    }

    @Test
    public void testSort(){

        GraphicPic graphicPic = testedGraphicPic.sort();

        Assert.assertEquals(graphicPic.get(1).getX1(),1,0.00001);
        Assert.assertEquals(graphicPic.get(1).getX2(),0,0.00001);
        Assert.assertEquals(graphicPic.get(1).getY1(),0,0.00001);
        Assert.assertEquals(graphicPic.get(1).getY2(),1,0.00001);
    }

    @Test
    public void testLengthList(){

        GraphicPic graphicPic = testedGraphicPic.lengthList(-1,1);

        Assert.assertEquals(graphicPic.get(0).getX1(),0,0.00001);
        Assert.assertEquals(graphicPic.get(0).getX2(),0,0.00001);
        Assert.assertEquals(graphicPic.get(0).getY1(),0,0.00001);
        Assert.assertEquals(graphicPic.get(0).getY2(),0,0.00001);
    }

    @Test
    public void testAngleList(){
        GraphicPic graphicPic = testedGraphicPic.angleList();
        Assert.assertEquals(graphicPic.get(1).getX1(),0,0.00001);
        Assert.assertEquals(graphicPic.get(1).getX2(),10,0.00001);
        Assert.assertEquals(graphicPic.get(1).getY1(),0,0.00001);
        Assert.assertEquals(graphicPic.get(1).getY2(),10,0.00001);
    }
}
