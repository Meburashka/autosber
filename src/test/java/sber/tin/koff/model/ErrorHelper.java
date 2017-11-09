package sber.tin.koff.model;

import sber.tin.koff.appmanager.HelperBase;

import static com.codeborne.selenide.Selenide.$;

public class ErrorHelper extends HelperBase {

  /**
   * Метод проверяет ошибки контроля для поля Код плательщика ЖКУ
   * @param error - текст ошибки
   */
  public void errorAmountPayment(String error) {
    assertElement(error, ".ui-form__row.ui-form__row_amount.ui-form__row_default-error-view-visible",
            ".ui-form-field-error-message.ui-form-field-error-message_ui-form");
  }

  /**
   * Метод проверяет ошибки контроля для поля За какой период оплачиваете коммунальные услуги
   * @param error - текст ошибки
   */
  public void errorPeriodPayment(String error) {
    assertElement(error, ".ui-form__row.ui-form__row_date.ui-form__row_default-error-view-visible",
            ".ui-form-field-error-message.ui-form-field-error-message_ui-form");
  }

  /**
   * Метод проверяет ошибки контроля для поля Сумма платежа
   * @param error - текст ошибки
   */
  public void errorPayerId(String error) {
    assertElement(error, ".ui-form__row.ui-form__row_text.ui-form__row_default-error-view-visible",
            ".ui-form-field-error-message.ui-form-field-error-message_ui-form");
  }
}