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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://wcmauthor-stg.intel.com/sites.html/content/www/us/en/develop')

WebUI.setText(findTestObject('Object Repository/Author/Page_Sign in to your account/input_Sign in_loginfmt'), 'kavitha.selvam@corpint.intel.com')

WebUI.click(findTestObject('Object Repository/Author/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Author/Page_Sign in to your account/input_Enter password_passwd'), 
    'Jrmts92lfjKEA6i71StzfQ==')

WebUI.click(findTestObject('Object Repository/Author/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Author/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Author/Page_develop  AEM Sites/coral-button-label_Close'))

WebUI.click(findTestObject('Object Repository/Author/Page_develop  AEM Sites/coral-button-label_Create'))

WebUI.click(findTestObject('Object Repository/Author/Page_develop  AEM Sites/coral-list-item-content_Page'))

WebUI.click(findTestObject('Object Repository/Author/Page_Navigation2023-04-11195105.286/img'))

WebUI.click(findTestObject('Object Repository/Author/Page_Navigation2023-04-11195105.286/coral-button-label_Next'))

WebUI.setText(findTestObject('Object Repository/Author/Page_Navigation2023-04-11195105.286/input_System Page Title_jcrtitle'), 
    'auto-jumplinks-test')

WebUI.click(findTestObject('Object Repository/Author/Page_Navigation2023-04-11195105.286/i_Image_coral-Icon coral-Icon--sizeS coral-_7e9c5b'))

WebUI.click(findTestObject('Object Repository/Author/Page_Navigation2023-04-11195105.286/div_icon-dsa.png'))

WebUI.click(findTestObject('Object Repository/Author/Page_Navigation2023-04-11195105.286/button_Select Path_js-coral-pathbrowser-con_d9f340'))

WebUI.setText(findTestObject('Object Repository/Author/Page_Navigation2023-04-11195105.286/input_Primary Business Owner_primaryOwner'), 
    'cory')

WebUI.click(findTestObject('Object Repository/Author/Page_Navigation2023-04-11195105.286/li_Whitney, Cory (cory.whitneyintel.com)'))

WebUI.click(findTestObject('Object Repository/Author/Page_Navigation2023-04-11195105.286/coral-button-label_Create'))

WebUI.click(findTestObject('Object Repository/Author/Page_Navigation2023-04-11195105.286/coral-button-label_Done'))

WebUI.closeBrowser()

