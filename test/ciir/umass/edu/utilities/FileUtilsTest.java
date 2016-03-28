package ciir.umass.edu.utilities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FileUtilsTest {

    @Test
    public void testRead() {
        String testLoaded = FileUtils.read("resources/fileUtils.test","UTF-8");
        assertEquals(testLoaded, "it is a test" + System.lineSeparator());
    }
}
