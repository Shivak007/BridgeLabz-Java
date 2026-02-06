package javacollectionsandstreams.regexandjunit.junit.listmanager;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ListManagerTest {

    ListManager lm = new ListManager();

    @Test
    void testAddRemove() {
        List<Integer> list = new ArrayList<>();
        lm.addElement(list, 10);
        lm.removeElement(list, 10);
        assertEquals(0, lm.getSize(list));
    }
}

