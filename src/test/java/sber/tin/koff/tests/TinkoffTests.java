package sber.tin.koff.tests;

import org.testng.annotations.Test;

public class TinkoffTests extends TestBase {

  @Test
  public void testTinkoff() {

    app.getNavigationHelper().gotoPayments();
    app.getNavigationHelper().gotoUtilities();
    app.getProviderHelper().selectRegion("Москве", "г. Москва");
    app.getProviderHelper().firstProvider("ЖКУ-Москва");
    app.getNavigationHelper().searchProvider("ЖКУ-Москва");
    app.getNavigationHelper().search();

    app.getPayHCSHelper().pay();
    app.getPayHCSHelper().clickPayHCS();
    app.getErrorHelper().errorPayerId("Поле обязательное");
    app.getErrorHelper().errorPeriodPayment("Поле обязательное");
    app.getErrorHelper().errorAmountPayment("Поле обязательное");

    app.getNavigationHelper().keysTabSend("111");
    app.getNavigationHelper().keysTabSend("12");
    app.getNavigationHelper().keysTabSend("112");
    app.getNavigationHelper().keysTabSend("1");

    app.getErrorHelper().errorPayerId("Поле неправильно заполнено");
    app.getErrorHelper().errorPeriodPayment("Поле заполнено некорректно");
    app.getErrorHelper().errorAmountPayment("Минимальная сумма перевода - 10 \u20BD");

    app.getNavigationHelper().gotoPayments();
    app.getNavigationHelper().searchProvider("ЖКУ-Москва");
    app.getProviderHelper().providerFirst("ЖКУ-Москва");
    app.getNavigationHelper().search();
    app.getPayHCSHelper().checkPages();

    app.getNavigationHelper().gotoPayments();
    app.getNavigationHelper().gotoUtilities();

    app.getProviderHelper().selectRegion("Санкт-Петербурге", "г. Санкт-Петербург");
    app.getProviderHelper().missingProvider("ЖКУ-Москва");
  }
}