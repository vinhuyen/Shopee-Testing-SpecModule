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

WebUI.navigateToUrl('https://vshopee.vercel.app/login')

WebUI.setText(findTestObject('Object Repository/Page_ng Nhp  Shopee Clone/input_ng Nhp_email'), 'hothitai2000@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/UpdateProfile/password'), 'p8JITmOmKejiKS3xpjD7eQ==')

WebUI.click(findTestObject('Object Repository/UpdateProfile/Button_submit'))

WebUI.click(findTestObject('Object Repository/UpdateProfile/email_link'))

WebUI.click(findTestObject('Object Repository/UpdateProfile/account'))

WebUI.setText(findTestObject('Object Repository/UpdateProfile/input_name'),'Hồ Thị Tài')

WebUI.setText(findTestObject('Object Repository/UpdateProfile/input_phone'),'0362271203')

WebUI.click(findTestObject('Object Repository/UpdateProfile/day'))

WebUI.click(findTestObject('Object Repository/UpdateProfile/image'))

//WebUI.uploadFile(findTestObject('Object Repository/UpdateProfile/image'), 'E:\\xoan.png')

WebUI.click(findTestObject('Object Repository/UpdateProfile/button_save'))

WebUI.delay(5)

WebUI.closeBrowser()