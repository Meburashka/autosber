package sber.tin.koff.appmanager;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class NavigationHelper extends HelperBase {
  /**
   * Метод нажимает Коммунальные платежи
   */
  public void gotoUtilities() {
    click(By.xpath("//span[contains(text(), 'Коммунальные платежи')]"));
  }

  /**
   * Метод нажимает пункт меню Платежи
   */
  public void gotoPayments() {
    click("li[data-menu-item='2']");
  }

  /**
   * Метод нажимает кнопку Поиск
   */
  public void search() {
    click("div[class='_2vlxq _2Vfxf _1SPg3 FH3k1']");
  }

  /**
   * Метод вводит значение в поле и переходит в следующее поле по нажатию TAB
   *
   * @param sendKeys - вводимое значение
   */
  public void keysTabSend(String sendKeys) {
    Actions builder = new Actions(WebDriverRunner.getWebDriver());
    builder.sendKeys(sendKeys);
    builder.sendKeys(Keys.TAB);
    builder.perform();
  }

  /**
   * Метод вводит значение в поле поиска
   *
   * @param text - вводимое значение
   */
  public void searchProvider(String text) {
    sendKeys("input[class='_2XFoD _1phV_']", text);
  }
}