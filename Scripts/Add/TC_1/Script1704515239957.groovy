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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver

WebUI.navigateToUrl('https://www.youtube.com/watch?v=UdUD__GrBpQ&ab_channel=EmSuy')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://vshopee.vercel.app/')

WebUI.click(findTestObject('Object Repository/Page_Trang Shopee/login'))

WebUI.setText(findTestObject('Object Repository/Page_LoginShopee/input_email'), 'nguyenvannhat0511@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LoginShopee/input_password'), '37Bc/9dN+iJXYsSAphaHmg==')

WebUI.click(findTestObject('Object Repository/Page_LoginShopee/button_ng Nhp'))

WebUI.setText(findTestObject('Object Repository/Page_LoginShopee/input_email'), 'nguyenvannhat05112003@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_LoginShopee/button_ng Nhp'))

WebUI.setText(findTestObject('Object Repository/Page_Trang Shopee/input_Shopee_name'), 'điện thoại')

WebUI.click(findTestObject('Object Repository/Page_Trang Shopee/button_Shopee_cursor-pointer rounded-sm bg-_8d114d'))

WebUI.click(findTestObject('Object Repository/Page_Trang Shopee/img_1_absolute left-0 top-0 h-full w-full o_e43faf'))

WebUI.click(findTestObject('Object Repository/Page_Vsmart Active 3 6GB64GB/button_add'))

