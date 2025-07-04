package sistemadetestes.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest{
	
	protected static WebDriver driver;
	//Por favor URL_BASE alterar baseado na localizção na do arquivo sistema/produtos.html na maquina local
	private static final String URL_BASE = "file:///C:/Users/36129382023.2n/Downloads/selenium-lab-main/sistema/produtos.html";
	private static final String PATH_DRIVE = "src/main/resources/chromedriver.exe";
	
	@BeforeClass
	public static void iniciar() {
		System.setProperty("webdriver.chrome.driver", PATH_DRIVE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL_BASE);
	}
	
	@AfterClass
	public static void finalizar() {
		driver.quit();
	}
	
}