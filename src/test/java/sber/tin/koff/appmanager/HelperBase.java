package sber.tin.koff.appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HelperBase {
  /**
   * Вспомогательный метод клика
   * @param locator - локатор
   */
  protected void click(String locator) {
    $(locator).click();
  }

  /**
   * Вспомогательный метод клика
   * @param locator - локатор
   */
  protected void click(By locator) {
    $(locator).click();
  }

  /**
   * Вспомогательный метод клика
   * @param locatorS локатор стринга
   * @param locator локатор
   */
  protected void click (String locatorS, By locator) {
    $(locatorS).$(locator).click();
  }

  /**
   * Вспомогательный метод ввода
   * @param text - передаваемый параметр основного метода
   * @param locator - локатор
   */
  protected void sendKeys(String locator, String text) {
    $(locator).sendKeys(text);
  }

  /**
   * Метод assert
   * @param text текст
   * @param locator локатор
   */
  protected void assertElement(String text, String locator) {
    assert text.equals($(locator).getText());
  }

  /**
   * Метод assert
   * @param text текст
   * @param locator локатор
   */
  protected void assertElement(String text, String locator, String locator2) {
    assert text.equals($(locator).$(locator2).getText());
  }
}
