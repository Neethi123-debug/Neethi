package testObject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dresspagetest extends BaseClass{

DresspageObject dressPage;
HomePageObject homePage;

public Dresspagetest() {
homePage = new HomePageObject();
dressPage = new DresspageObject();
}

@Test
public void verifyChkBoxSizeS() {
Assert.assertTrue(dressPage.elementFound(dressPage.getChkBoxSizeS()), "Failed: size S not found");
}

@Test
public void verifyChkBoxSizeM() {
Assert.assertTrue(dressPage.elementFound(dressPage.getChkBoxSizeM()), "Failed: size M not found");
}

@Test
public void verifyChkBoxSizeL() {
Assert.assertTrue(dressPage.elementFound(dressPage.getChkBoxSizeL()), "Failed: size L not found");
}

@Test
public void verifyMatchingResult() {
Assert.assertTrue(dressPage.getTxtCount().getText().contains(dressPage.getProductListSize()), "Failed: Count Mismatch");
}

}