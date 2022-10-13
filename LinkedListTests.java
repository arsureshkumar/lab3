import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class LinkedListTests{
    @Test
    public void prependTest(){
        LinkedList testList = new LinkedList();
        testList.prepend(0);
        testList.prepend(1);
        testList.prepend(2);
        assertEquals("2 1 0 ", testList.toString());
    }
    @Test
    public void appendTest(){
        LinkedList testList = new LinkedList();
        testList.append(0);
        testList.append(1);
        testList.append(2);
        assertEquals("0 1 2 ", testList.toString());
    }
    @Test
    public void lengthTest(){
        LinkedList testList = new LinkedList();
        testList.append(0);
        testList.append(1);
        testList.append(2);
        assertEquals(3, testList.length());
    }
}