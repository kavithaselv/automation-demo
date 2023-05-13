import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.intel.com/content/www/us/en/products/systems-devices/laptops.html')

WebUI.verifyElementPresent(findTestObject('Object Repository/publisher/Page_Shop Intel-Based Laptops - Buy a Lapto_a9065d/h1_Laptops for Performance and Portability'), 
    0)

String fontWeightHeading = WebUI.getCSSValue(findTestObject('Object Repository/publisher/Page_Shop Intel-Based Laptops - Buy a Lapto_a9065d/h1_Laptops for Performance and Portability'), 
    'font-weight')

System.out.println('font-weight' + fontWeightHeading)

assert fontWeightHeading.equals('300')

String fontSizeHeading = WebUI.getCSSValue(findTestObject('Object Repository/publisher/Page_Shop Intel-Based Laptops - Buy a Lapto_a9065d/h1_Laptops for Performance and Portability'), 
    'font-size')

System.out.println('font-size' + fontSizeHeading)

assert fontSizeHeading.equals('32px')

WebUI.verifyElementPresent(findTestObject('Object Repository/publisher/Page_Shop Intel-Based Laptops - Buy a Lapto_a9065d/p_Laptops powered by Intel deliver outstand_afbab7'), 
    0)

String fontWeightSubHeading = WebUI.getCSSValue(findTestObject('Object Repository/publisher/Page_Shop Intel-Based Laptops - Buy a Lapto_a9065d/p_Laptops powered by Intel deliver outstand_afbab7'), 
    'font-weight')

System.out.println('font-weight' + fontWeightSubHeading)

assert fontWeightSubHeading.equals('400')

String fontSizeSubHeading = WebUI.getCSSValue(findTestObject('Object Repository/publisher/Page_Shop Intel-Based Laptops - Buy a Lapto_a9065d/p_Laptops powered by Intel deliver outstand_afbab7'), 
    'font-size')

System.out.println('font-size' + fontSizeSubHeading)

assert fontSizeSubHeading.equals('14px')

WebUI.closeBrowser()

