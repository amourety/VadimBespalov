/**
 * Created by amour on 25.04.2018.
 */
import org.junit.*;

import java.io.ByteArrayOutputStream;


public class BSTreeTest {
    private BSTree<Integer> expected, bad;

    @Before
    public void setUp() {
        expected = (new DummyBSTree()).getTree();
        bad = (new DummyBSTree()).getBadTree();
    }

    @Test
    public void insert() {
        BSTree<Integer> actual = new BSTree<>(new Integer[]{5, 2, 7, 3, 8, 4, 2, 9});
        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void remove() {
        BSTree<Integer> actualTree = new BSTree<>(new Integer[]{5, 2, 2, 7, 3, 8, 4, 2, 9});
        actualTree.remove(2);
        Assert.assertTrue(expected.equals(actualTree));
    }

    @Test
    public void contains() {
        Assert.assertTrue(expected.contains(7));
        Assert.assertFalse(expected.contains(10));
    }

    @Test
    public void print() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        expected.print();
        Assert.assertEquals("2 2 3 4 5 7 8 9 ", out.toString());
    }
    @Test
    public void isBST() {
        Assert.assertTrue(expected.isBST());
        Assert.assertFalse(bad.isBST());
    }
}
