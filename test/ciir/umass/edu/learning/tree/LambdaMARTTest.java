package ciir.umass.edu.learning.tree;


import ciir.umass.edu.utilities.FileUtils;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LambdaMARTTest {

    @Test
    public void testLoadFromString() {
        LambdaMART mart = new LambdaMART();
        mart.loadFromString(FileUtils.read("resources/lambdamart.model", "UTF-8"));

        int[] features = mart.ensemble.getFeatures();
        assertArrayEquals(features, new int[]{2, 5, 6, 7, 8, 9});

    }
}
