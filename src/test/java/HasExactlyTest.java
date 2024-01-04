import org.example.HasExactly;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class HasExactlyTest {
    @Test
    public void testHasExactly(){
        HasExactly testHasExactly = new HasExactly();

        // В коллекции 2 значения и одно из них равено value
//        testHasExactly.setValue("a");
//        testHasExactly.values.add("b");
//        testHasExactly.values.add("a");

        // передал пустые аргументы
//        testHasExactly.setValue("a");
//        testHasExactly.values.add(null);
//        testHasExactly.values.add(null);

        // передал 2 значения и оба равны value
//        testHasExactly.setValue("a");
//        testHasExactly.getValues().add("a");
//        testHasExactly.getValues().add("a");

        // передал 1 значение и оно равно value
//        testHasExactly.setValue("a");
//        testHasExactly.values.add("a");

        Assert.assertEquals(testHasExactly.values.size(), 1 );
        testHasExactly.hasExactly(testHasExactly.values, testHasExactly.value);
    }
}
