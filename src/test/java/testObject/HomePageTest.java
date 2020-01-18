package testObject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {

HomePageObject homePage;

public HomePageTest() {
homePage = new HomePageObject12();
}

@Test
public void verifyWomenTab() {
Assert.assertTrue(homePage.elementFound(homePage.getLnkTxtWomen()), "Failed: women tab not found");
}

@Test
public void verifyDressesTab() {
Assert.assertTrue(homePage.elementFound(homePage.getLnkTxtDresses()),"Failed: Dresses tab not found");
}

@Test
public void verifyTShirtsTab() {
Assert.assertTrue(homePage.elementFound(homePage.getlnkTxtTShirts()),"Failed: T-Shirts tab not found");
}

@Test
public void verifyNaviagteToWomenTab() {
homePage.getLnkTxtWomen().click();
Assert.assertTrue(homePage.getTitle().contains("Women"), "Failed: Did not navigate to women tab");
}

@Test
public void verifyNaviagteToDressesTab() {
homePage.getLnkTxtDresses().click();
Assert.assertTrue(homePage.getTitle().contains("Dresses"), "Failed: Did not navigate to Dresses tab");
}

@Test
public void verifyNaviagteToTShirtsTab() {
homePage.getlnkTxtTShirts().click();
Assert.assertTrue(homePage.getTitle().contains("shirts"), "Failed: Did not navigate to T-Shirts tab");
}

}