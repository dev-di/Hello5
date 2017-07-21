package hello5.hello5;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testTrue()
    {
        assertTrue( true );
    }
    
    /**
     * 
     */
    public void testHello()
    {
    	App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }    
    
    /**
     * 
     */
    public void testDummy()
    {
        assertTrue( true );
    }
    
}
