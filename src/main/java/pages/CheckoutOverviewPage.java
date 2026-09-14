package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckoutOverviewPage {
    WebDriver driver;

    @FindBy(id="finish")
    WebElement finishButton;

    @FindBy(className = "inventory_item_price")
    List<WebElement> itemPrices;

    @FindBy(className = "summary_subtotal_label")
    WebElement itemTotalLabel;

    @FindBy(className = "summary_tax_label")
    WebElement taxLabel;

    @FindBy(className = "summary_total_label")
    WebElement totalLabel;

    public CheckoutOverviewPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnFinishButton(){
        finishButton.click();
    }

    public double getSumOfItemPrices(){
        double sum = 0;
        for(WebElement price : itemPrices){
            sum += parsePrice(price.getText());
        }
        return sum;
    }

    public double getItemTotal(){
        return parsePrice(itemTotalLabel.getText());
    }

    public double getTax(){
        return parsePrice(taxLabel.getText());
    }

    public double getTotal(){
        return parsePrice(totalLabel.getText());
    }

    private double parsePrice(String priceText){
        return Double.parseDouble(priceText.replaceAll("[^0-9.]", ""));
    }
}
