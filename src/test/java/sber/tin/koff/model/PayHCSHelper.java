package sber.tin.koff.model;

import org.openqa.selenium.By;
import sber.tin.koff.appmanager.HelperBase;

import static com.codeborne.selenide.Selenide.$;

public class PayHCSHelper extends HelperBase {
  /**
   * Метод проверяет что страница Задолженность по ЖКУ
   */
  public void checkPages() {
    assertElement("Узнайте задолженность по ЖКУ в Москве", "._9xv51._3vBro");
  }

  /**
   * Метод нажимает кнопку Оплатить ЖКУ в Москве
   */
  public void clickPayHCS() {
    click(".ui-button__text", By.xpath("//h2[contains(text(), 'Оплатить ЖКУ в Москве')]"));
  }

  /**
   * Переход на оплатить
   */
  public void pay() {
    click("a[href='/zhku-moskva/oplata/']");
  }
}
