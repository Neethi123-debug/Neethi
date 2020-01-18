package testObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DresspageObject extends BaseClass {

public DresspageObject() {
PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[1]//a")
private WebElement chkBoxSizeS;

@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[2]//a")
private WebElement chkBoxSizeM;

@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[3]//a")
private WebElement chkBoxSizeL;

@FindBy(xpath = "//*[@class='heading-counter']")
private WebElement txtCount;

@FindBys(value = { @FindBy(xpath = "//*[@class='product_list grid row']/li")})
private List<WebElement> productList;

@FindBy(xpath = "//*[@class='product_list grid row']/li[1]//div[@class='right-block']//a[contains(@title,'cart')]")
private WebElement btnFstPrdtAddToCart;

public WebElement getChkBoxSizeS() {
return chkBoxSizeS;
}

public WebElement getChkBoxSizeM() {
return chkBoxSizeM;
}

public WebElement getChkBoxSizeL() {
return chkBoxSizeL;
}

public WebElement getTxtCount() {
return txtCount;
}

public String getProductListSize() {
Integer size = productList.size();
return size.toString();
}

public WebElement getBtnFstPrdtAddToCart() {
return btnFstPrdtAddToCart;

}

}