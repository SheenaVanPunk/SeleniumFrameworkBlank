package testClasses;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class QuickTest extends BaseTest{

    @Test (groups = "smoke", priority = 1)
    public void testIsTheWebSiteLoadingTheHomePage(){

        assertNotNull(hp);
    }
}
