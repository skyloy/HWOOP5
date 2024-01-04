import org.example.ValueFinder;
import org.junit.Assert;
import org.junit.Test;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValueFinderTest {
    // тест к 1 методу
    @Test
    public void testValueFinder(){
        ValueFinder finder = new ValueFinder();
//         Правильный тест
        finder.values.add("python");
        finder.values.add("c++");
        finder.values.add("c#");
        finder.values.add("java");
        finder.values.add("javaScript");
        finder.setValue("c++");

        // Неправильный тест
//        finder.values.add("");
//        finder.values.add(null);
//        finder.setValue("c++");
        Assert.assertTrue(finder.contains(finder.getValues(), finder.getValue()));
    }
}

