package fworks;

import fworks.client.ExampleAppTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class ExampleAppSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for ExampleApp");
    suite.addTestSuite(ExampleAppTest.class);
    return suite;
  }
}
