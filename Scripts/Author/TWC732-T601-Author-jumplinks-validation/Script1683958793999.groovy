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

WebUI.navigateToUrl('https://wcmauthor-stg.intel.com/editor.html/content/www/us/en/develop/auto-test-jumplinks-1.html')

WebUI.setText(findTestObject('Object Repository/Author/Page_Sign in to your account/input_Sign in_loginfmt'), 'kavitha.selvam@corpint.intel.com')

WebUI.click(findTestObject('Object Repository/Author/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Author/Page_Sign in to your account/input_Enter password_passwd'), 
    'Jrmts92lfjKEA6i71StzfQ==')

WebUI.click(findTestObject('Object Repository/Author/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Author/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/div_Paragraph System Root_cq-Overlay cq-Ove_b79e5c'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/button_Next_coral3-Button coral3-Button--qu_15c00e'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/coral-selectlist-item_Article Paragraph'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/div_Article Paragraph'))

WebUI.setText(findTestObject('Object Repository/Author/Page_test/input_Jump Link Text_jumplinktext'), 'laptop')

WebUI.click(findTestObject('Object Repository/Author/Page_test/p'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/span_Normal_cke_combo_arrow'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/h2_Heading 2'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/coral-icon_Article Paragraph_coral3-Icon co_f12185'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/div_Paragraph System Root_cq-Overlay cq-Ove_b79e5c'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/coral-icon_Next_coral3-Icon coral3-Icon--si_2c4032'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/coral-selectlist-item_Article Paragraph'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/div_Article Paragraph'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/coral-icon_Next_coral3-Icon coral3-Icon--si_0df680'))

WebUI.setText(findTestObject('Object Repository/Author/Page_test/input_Jump Link Text_jumplinktext'), 'desktop')

WebUI.click(findTestObject('Object Repository/Author/Page_test/p'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/a_Normal'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/h2_Heading 2'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/coral-icon_Article Paragraph_coral3-Icon co_f12185_1'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/coral-icon_test_coral3-Icon coral3-Icon--si_f3b805'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/coral-button-label_Open Properties'))

WebUI.click(findTestObject('Object Repository/Author/Page_auto-test-jumplinks-1  AEM Sites  Page_5d6a96/a_Layout'))

WebUI.click(findTestObject('Object Repository/Author/Page_auto-test-jumplinks-1  AEM Sites  Page_5d6a96/button_No'))

WebUI.click(findTestObject('Object Repository/Author/Page_auto-test-jumplinks-1  AEM Sites  Page_5d6a96/coral-selectlist-item_Yes'))

WebUI.click(findTestObject('Object Repository/Author/Page_auto-test-jumplinks-1  AEM Sites  Page_5d6a96/coral-button-label_Save  Close'))

WebUI.click(findTestObject('Object Repository/Author/Page_test/coral-button-label_Preview'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Author/Page_test/h2_paragraph1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Author/Page_test/h2_paragraph2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Author/Page_test/span_paragraph1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Author/Page_test/span_paragraph2'), 0)

WebUI.closeBrowser()

