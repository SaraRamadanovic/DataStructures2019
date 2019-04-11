package LinkedLists;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class DoublyLinkedListTest {

    DoublyLinkedList<Integer> a = new DoublyLinkedList<>();

    public DoublyLinkedListTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class DoublyLinkedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        a.add(0, 0);
        assertEquals(1, a.count());
    }

    /**
     * Test of addToRear method, of class DoublyLinkedList.
     */
    @Test
    public void testAddToRear() {
        System.out.println("addToRear");
        a.addToRear(2);
        assertEquals(1, a.count());
        a.addToRear(3);
        assertEquals(2, a.count());
        int lastElem = (int) a.getFirst().getNext().getValue();
        assertEquals(3, lastElem);
    }

    /**
     * Test of remove method, of class DoublyLinkedList.
     */
    @Test
    public void testRemove() {
        a.addToFront(2);
        a.addToRear(3);
        a.remove(0);
        assertEquals(1, a.count());
    }

    /**
     * Test of count method, of class DoublyLinkedList.
     */
    @Test
    public void testCount() {
        a.addToFront(1);
        a.add(2, 0);
        assertEquals(2, a.count());
    }

    /**
     * Test of getFirst method, of class DoublyLinkedList.
     */
    @Test
    public void testGetFirst() {
        a.addToFront(1);
        a.addToFront(5);
        int first = (int) a.getFirst().getValue();
        assertEquals(5, first);
    }

    /**
     * Test of setFirst method, of class DoublyLinkedList.
     */
    @Test
    public void testSetFirst() {
        a.setFirst(5);
        a.setFirst(8);
        int first = (int) a.getFirst().getValue();
        assertEquals(8, first);
    }

    /**
     * Test of addToFront method, of class DoublyLinkedList.
     */
    @Test
    public void testAddToFront() {
        a.add(5, 0);
        a.addToFront(8);
        a.addToFront(12);
        int num = (int) a.getFirst().getValue();
        assertEquals(12, num);
    }

    /**
     * Test of removeFromFront method, of class DoublyLinkedList.
     */
    @Test
    public void testRemoveFromFront() {
        a.addToFront(12);
        a.addToFront(15);
        int num = (int) a.getFirst().getValue();
        assertEquals(12, num);
    }

    /**
     * Test of removeFromRear method, of class DoublyLinkedList.
     */
    @Test
    public void testRemoveFromRear() {
        a.addToFront(12);
        a.addToRear(15);
        a.removeFromRear();
        assertEquals(1, a.count());

    }

    /**
     * Test of toString method, of class DoublyLinkedList.
     */
    @Test
    public void testToString() {

    }

    /**
     * Test of iterator method, of class DoublyLinkedList.
     */
    @Test
    public void testIterator() {

    }

}