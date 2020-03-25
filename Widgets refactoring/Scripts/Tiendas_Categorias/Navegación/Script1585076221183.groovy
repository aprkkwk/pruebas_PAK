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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://parquearauco.modyo.be/parque-arauco-kennedy/tiendas#/')

WebUI.click(findTestObject('Page_Todas nuestras tiendas - Parque Arauco/div_banco falabella'))

WebUI.click(findTestObject('Page_Tienda Parque Arauco-/button_Ver mapa'))

WebUI.click(findTestObject('Page_Tienda Parque Arauco-/div_UBICACIN DE LA TIENDA               Pis_39caeb'))

WebUI.click(findTestObject('Page_Tienda Parque Arauco-/button_Ver mapa'))

WebUI.click(findTestObject('Page_Tienda Parque Arauco-/span_'))

WebUI.back()

WebUI.setText(findTestObject('Page_Bienvenido a Parque Arauco - Mucho ms _ace27f/input_Categoras_search-input filter-store-input'), 
    'falabella')

WebUI.sendKeys(findTestObject('Page_Bienvenido a Parque Arauco - Mucho ms _ace27f/input_Categoras_search-input filter-store-input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Todas nuestras tiendas - Parque Arauco/div_falabella'))

WebUI.delay(5)

WebUI.back()

WebUI.delay(3)

WebUI.click(findTestObject('Refactorizado/Page_Todas nuestras tiendas - Parque Arauco/a_Categoras'))

WebUI.click(findTestObject('Page_Todas nuestras tiendas - Parque Arauco/u_Ver todas'))

WebUI.click(findTestObject('Page_Todas nuestras tiendas - Parque Arauco/a_Volver a buscador de categora'))

WebUI.setText(findTestObject('Object Repository/Page_Bienvenido a Parque Arauco - Mucho ms _ace27f/input_Categoras_search-input filter-store-input_1'), 
    'vestuario')

WebUI.sendKeys(findTestObject('Object Repository/Page_Bienvenido a Parque Arauco - Mucho ms _ace27f/input_Categoras_search-input filter-store-input_1'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Todas nuestras tiendas - Parque Arauco/div_Vestuario Femenino (58 tiendas encontradas) Ver todas'))

WebUI.click(findTestObject('Page_Todas nuestras tiendas - Parque Arauco/a_Volver a buscador de categora'))

