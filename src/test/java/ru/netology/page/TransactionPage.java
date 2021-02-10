package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.valueOf;
import static ru.netology.data.DataHelper.getCardNumber1;
import static ru.netology.data.DataHelper.getCardNumber2;

public class TransactionPage {
    private SelenideElement amountField = $("[data-test-id=amount] input");
    private SelenideElement fromField = $("[data-test-id=from] input");
    private SelenideElement transferButton = $("[data-test-id=action-transfer]");

    public DashboardPage transferMoneyFromFirstToSecondCard(int amount) {
        amountField.setValue(valueOf(amount));
        fromField.setValue(valueOf(getCardNumber1()));
        transferButton.click();
        return new DashboardPage();
    }

    public DashboardPage transferMoneyFromSecondToFirstCard(int amount) {
        amountField.setValue(valueOf(amount));
        fromField.setValue(valueOf(getCardNumber2()));
        transferButton.click();
        return new DashboardPage();
    }
}