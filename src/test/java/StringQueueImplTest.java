import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringQueueImplTest {
    Stack<String> q;
    //Queue<Integer> q2;


    @Before
    public void setUp() throws Exception{
        this.q = new StackImpl<String>(5);
        this.q.push("1");
        this.q.push("2");
        this.q.push("3");

    }

    @After
    public void tearDown() {
        this.q =null;
    }

    @Test
    public void testPush1() throws Exception {
        Assert.assertEquals(3, this.q.size());
        this.q.push("4");
        Assert.assertEquals(4, this.q.size());

    }

    @Test
    public void testPush2() throws Exception {
        Assert.assertEquals(3, this.q.size());
        this.q.push("4");
        this.q.push("5");
        Assert.assertEquals(5, this.q.size());
    }

    //@Test(expected = FullStackException.class)
    @Test
    public void testPushFull() throws Exception {
        Assert.assertEquals(3, this.q.size());
        this.q.push("4");
        this.q.push("5");

        Assert.assertThrows(FullStackException.class, () ->
                this.q.push("6"));

        Assert.assertEquals(5, this.q.size());
    }


    @Test
    public void testPop1() throws Exception {
        Assert.assertEquals(3, this.q.size());
        String tres = this.q.peek();
        Assert.assertEquals(3, this.q.size());
        tres = this.q.pop();
        Assert.assertEquals(2, this.q.size());
        Assert.assertEquals("3", tres);

        String dos = this.q.pop();
        Assert.assertEquals(1, this.q.size());
        Assert.assertEquals("2", dos);

        String un = this.q.pop();
        Assert.assertEquals(0, this.q.size());
        Assert.assertEquals("1", un);
    }

//    @Test(expected = EmptyStackException.class)
    @Test
    public void testPopEmpty() throws Exception {
        testPop1();

        Assert.assertThrows(EmptyStackException.class, () ->
                this.q.pop());

        Assert.assertEquals(0, this.q.size());

    }




}
