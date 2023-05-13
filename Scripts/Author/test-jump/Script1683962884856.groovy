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

WebUI.navigateToUrl('https://wcmauthor-stg.intel.com/editor.html/content/www/us/en/develop/test-jump.html')

WebUI.setText(findTestObject('Page_Sign in to your account/input_Sign in_loginfmt'), 'kavitha.selvam@corpint.intel.com')

WebUI.click(findTestObject('Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Page_Sign in to your account/input_Enter password_passwd'), 'Jrmts92lfjKEA6i71StzfQ==')

WebUI.click(findTestObject('Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Page_/div_Paragraph System Root_cq-Overlay cq-Ove_b79e5c'))

WebUI.click(findTestObject('Page_/coral-icon_Next_coral3-Icon coral3-Icon--si_2c4032'))

WebUI.click(findTestObject('Page_/coral-selectlist-item_Article Paragraph'))

WebUI.click(findTestObject('Page_/div_Article Paragraph'))

WebUI.click(findTestObject('Page_/coral-icon_Article Paragraph_coral3-Icon co_f12185'))

WebUI.setText(findTestObject('Page_/input_Jump Link Text_jumplinktext'), 'laptop')

WebUI.click(findTestObject('Page_/html_Rich Text Editor'))

WebUI.click(findTestObject('Object Repository/Page_/coral-icon_Article Paragraph_coral3-Icon co_f12185'))

WebUI.closeBrowser()

