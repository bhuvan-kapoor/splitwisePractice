import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestStructure {
    public void testGroup2(String group1, String group2) {
        List<String> list = new ArrayList<String>();
        list.add(group1);
        list.add(group2);
        for (int i = 0; i < list.size(); i++) {
            Assert.assertEquals(list.get(i), "test");
        }
    }

    public void testFinal() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        testGroup2(a,b);
    }
}

