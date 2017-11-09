package sber.tin.koff.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sber.tin.koff.appmanager.ApplicationManager;

public class TestBase {
  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void after() {
    app.stop();
  }

  public ApplicationManager getApp() {
    return app;
  }
}
