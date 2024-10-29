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

WebUI.navigateToUrl('https://smartrecycling.natee.me/signin')

WebUI.setText(findTestObject('Object Repository/B4-T15-TC016/Page_Smart Recyling/input_Your email_email'), 'testadmin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/B4-T15-TC016/Page_Smart Recyling/input_Your password_password'), 
    '/Rw3v+Z2S+H8yM6cykkndg==')

WebUI.click(findTestObject('Object Repository/B4-T15-TC016/Page_Smart Recyling/button_Sign in your account'))

WebUI.click(findTestObject('Object Repository/B4-T15-TC016/Page_Smart Recyling/div_HomeServices Report TrashMobile AppBlog_f22b37'))

WebUI.click(findTestObject('Object Repository/B4-T15-TC016/Page_Smart Recyling/img'))

WebUI.click(findTestObject('Object Repository/B4-T15-TC016/Page_Smart Recyling/a_My Profile'))

WebUI.click(findTestObject('Object Repository/B4-T15-TC016/Page_Smart Recyling/a'))

WebUI.click(findTestObject('Object Repository/B4-T15-TC016/Page_Smart Recyling/svg'))

WebUI.click(findTestObject('Object Repository/B4-T15-TC016/Page_Smart Recyling/span_Manage Reports'))

WebUI.click(findTestObject('Object Repository/B4-T15-TC016/Page_Smart Recyling/span_Edit'))

WebUI.setText(findTestObject('Object Repository/B4-T15-TC016/Page_Smart Recyling/input_Subject_subject'), 'Test Report update ')

WebUI.click(findTestObject('Object Repository/B4-T15-TC016/Page_Smart Recyling/span_Update Report'))

WebUI.click(findTestObject('Object Repository/B4-T15-TC016/Page_Smart Recyling/div_Report updated successfully'))

WebUI.click(findTestObject('Object Repository/B4-T15-TC016/Page_Smart Recyling/svg_1'))

WebUI.closeBrowser()

