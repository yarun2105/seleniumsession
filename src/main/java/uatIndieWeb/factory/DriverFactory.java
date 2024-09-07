package uatIndieWeb.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Properties;

import javax.print.DocFlavor.URL;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import uatIndieWeb.Exception.FrameworkException;
import uatIndieWeb.apperror.AppError;

public class DriverFactory {

	public   WebDriver driver;
	

	public WebDriver initDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://uatweb.np.indie.indusind.com/");

		return driver;

	}

	/*
	 * public WebDriver initDriver() throws FrameworkException,
	 * MalformedURLException { String browserName =
	 * prop.getProperty("browser").toLowerCase();
	 * 
	 * System.out.println("browser name is : " + browserName);
	 * LOG.info("browser name is : " + browserName);
	 * 
	 * highlight = prop.getProperty("highlight").trim(); optionsManager = new
	 * OptionsManager(prop);
	 * 
	 * if (browserName.equals("chrome")) {
	 * 
	 * if (Boolean.parseBoolean(prop.getProperty("remote"))) { // remote run:
	 * init_remoteDriver("chrome"); } else { // local run:
	 * WebDriverManager.chromedriver().setup(); tlDriver.set(new
	 * ChromeDriver(optionsManager.getChromeOptions())); } } else if
	 * (browserName.equals("firefox")) {
	 * 
	 * if (Boolean.parseBoolean(prop.getProperty("remote"))) { // remote run:
	 * init_remoteDriver("firefox"); } else { // local run:
	 * WebDriverManager.firefoxdriver().setup(); tlDriver.set(new
	 * FirefoxDriver(optionsManager.getFirefoxOptions())); }
	 * 
	 * }
	 * 
	 * else if (browserName.equals("edge")) {
	 * 
	 * if (Boolean.parseBoolean(prop.getProperty("remote"))) { // remote run:
	 * init_remoteDriver("edge"); } else { // local run:
	 * WebDriverManager.edgedriver().setup(); tlDriver.set(new
	 * EdgeDriver(optionsManager.getEdgeOptions())); }
	 * 
	 * }
	 * 
	 * else if (browserName.equals("safari")) { //only local execution---docker does
	 * not support safari tlDriver.set(new SafariDriver()); }
	 * 
	 * else { System.out.println("Please pass the right browser name: " +
	 * browserName); LOG.error("Please pass the right browser name : " +
	 * browserName); throw new FrameworkException(); }
	 * 
	 * getDriver().manage().deleteAllCookies();
	 * getDriver().manage().window().maximize();
	 * getDriver().get(prop.getProperty("url"));
	 * 
	 * return getDriver();
	 * 
	 * }
	 */

	/*
	 * remote execution
	 */
	/*
	 * private void init_remoteDriver(String browser) throws MalformedURLException {
	 * 
	 * System.out.
	 * println("Running test cases on remote GRID machine....with browser: " +
	 * browser);
	 * 
	 * if (browser.equals("chrome")) { tlDriver.set( new
	 * RemoteWebDriver(optionsManager.getChromeOptions())); }
	 * 
	 * else if (browser.equals("firefox")) { tlDriver.set( new
	 * RemoteWebDriver(optionsManager.getFirefoxOptions())); }
	 * 
	 * else if (browser.equals("edge")) { tlDriver.set(new
	 * RemoteWebDriver(optionsManager.getEdgeOptions())); } else {
	 * System.out.println("Please pass the right browser for remote exution...." +
	 * browser); }
	 * 
	 * }
	 */

	/**
	 * this method is used to init the config properties
	 * 
	 * @return
	 * @throws FrameworkException
	 */
	/*
	 * public Properties initProp() throws FrameworkException { prop = new
	 * Properties(); FileInputStream ip = null;
	 * 
	 * // mvn clean install -Denv="dev" // mvn clean install
	 * 
	 * // String envName = System.getenv("env");// stage/uat/qa/dev String envName =
	 * System.getProperty("env");
	 * System.out.println("-----> Running test cases on environment: ----->" +
	 * envName); LOG.info("-----> Running test cases on environment: ----->" +
	 * envName); if (envName == null) {
	 * System.out.println("No env is given..hence running it on QA env....."); try {
	 * ip = new FileInputStream("./src/test/resources/config/qa.config.properties");
	 * } catch (FileNotFoundException e) { e.printStackTrace(); } }
	 * 
	 * else { try { switch (envName) { case "qa": ip = new
	 * FileInputStream("./src/test/resources/config/qa.config.properties"); break;
	 * case "dev": ip = new
	 * FileInputStream("./src/test/resources/config/dev.config.properties"); break;
	 * case "stage": ip = new
	 * FileInputStream("./src/test/resources/config/stage.config.properties");
	 * break; case "uat": ip = new
	 * FileInputStream("./src/test/resources/config/uat.config.properties"); break;
	 * case "prod": ip = new
	 * FileInputStream("./src/test/resources/config/config.properties"); break;
	 * 
	 * default: System.out.println("please pass the right env name...." + envName);
	 * throw new FrameworkException(); // break; }
	 * 
	 * } catch (FileNotFoundException e) { e.printStackTrace(); }
	 * 
	 * }
	 * 
	 * try { prop.load(ip); } catch (IOException e) { e.printStackTrace(); }
	 * 
	 * return prop; }
	 */

	/**
	 * take screenshot
	 * 
	 */

	/*
	 * public String getScreenshot() {
	 * 
	 * 
	 * File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 * 
	 * String path = System.getProperty("user.dir") + "/screenshot/" +
	 * System.currentTimeMillis() + ".png"; File destination = new File(path);
	 * 
	 * return path;
	 * 
	 * }
	 */


}