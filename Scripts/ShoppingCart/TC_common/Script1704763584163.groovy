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



//WebUI.openBrowser('')

def profilePath = 'C:\\Users\\admin\\AppData\\Local\\Google\\Chrome\\User Data'

def profiledir = 'Profile 131'

System.setProperty('webdriver.chrome.driver', 'C:\\Users\\Admin\\Downloads\\Katalon_Studio_Engine_Windows_64-9.2.0\\Katalon_Studio_Engine_Windows_64-9.2.0\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe')

ChromeOptions options = new ChromeOptions()

options.addArguments('user-data-dir=' + profilePath)

options.addArguments('profile-directory=' + profiledir)

WebDriver driver = new ChromeDriver(options)

DriverFactory.changeWebDriver(driver)

//WebUI.openBrowser('')


WebUI.navigateToUrl('https://vshopee.vercel.app/')
WebUI.click(findTestObject('Object Repository/Page_ShopingCartManagement/IconCart'))