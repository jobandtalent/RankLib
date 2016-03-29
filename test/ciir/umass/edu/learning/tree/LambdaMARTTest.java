package ciir.umass.edu.learning.tree;


import ciir.umass.edu.learning.Ranker;
import ciir.umass.edu.learning.RankerFactory;
import ciir.umass.edu.utilities.FileUtils;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LambdaMARTTest {

    private static int[] FEATURES = new int[]{2, 5, 6, 7, 8, 9};

    @Test
    public void testLoadFromFactory() {
        RankerFactory factoryRanker = new RankerFactory();
        Ranker ranker = factoryRanker.loadRankerFromFile("resources/lambdamart.model");

        assertEquals(ranker.name(), "LambdaMART");
        assertArrayEquals(ranker.getFeatures(), FEATURES);
    }

    @Test
    public void testLoadFromString() {
        LambdaMART mart = new LambdaMART();
        mart.loadFromString(FileUtils.read("resources/lambdamart.model", "UTF-8"));

        assertEquals(mart.name(), "LambdaMART");
        assertArrayEquals(mart.ensemble.getFeatures(), FEATURES);
    }
}
