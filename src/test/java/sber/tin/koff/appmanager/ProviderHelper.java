package sber.tin.koff.appmanager;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProviderHelper extends HelperBase {
  /**
   * Метод проверяет что на странице провайдера нет искомого элемента
   *
   * @param provider - искомый элемент
   */
  public void missingProvider(String provider) {
    $("section").$("ul").shouldNotHave(text(provider));
  }

  /**
   * Метод проверяем какой провайдер первый после ввода значения в поиск
   *
   * @param provider - ожидаемый результат
   */
  public void providerFirst(String provider) {
    ElementsCollection resultLinks = $$("._1Tp9e");
    resultLinks.first().shouldHave(text(provider));
  }

  /**
   * Метод проверяет первый элемент в блоке Выбор провайдера
   *
   * @param provider - ожидаемый провайдер
   */
  public void firstProvider(String provider) {
    $("section").$("ul>*:first-child").shouldHave(text(provider));
  }

  /**
   * Метод проверяет текущий регион. И если он не тот, выставляет нужный
   *
   * @param city     - нужный регион
   * @param cityName - название региона в списке регионов
   */
  public void selectRegion(String city, String cityName) {
    String town = $(".ui-link.payment-page__title_inner").getText();
    if (!town.equals(city)) {
      $(".ui-link.payment-page__title_inner").click();
      $(By.xpath(String.format("//span[contains(text(), '%s')]", cityName))).click();
    }
    assertElement(city, ".ui-link.payment-page__title_inner");
  }
}