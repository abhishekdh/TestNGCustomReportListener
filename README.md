<p align="left"> <img src="https://komarev.com/ghpvc/?username=abhishekdh&label=Profile%20views&color=0e75b6&style=flat" alt="abhishekdh" /> </p>

# Custom Reporting with TestNG

## TestNGCustomReportListener:
    private String reportTitle = "Test Report";
    private String reportFileName = "custom-report.html";
    private String companyLogoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8z-gZd4L7PPp0a-GCm2CZfXgfTv77meUz4Q&usqp=CAU";
    private String baseURL =  "https://www.google.com";


### Method added:
	createResultTable(passed, failed, skipped);
	createChartGraph(passed, failed, skipped);
	createBrowserInfo();
	String url = getBaseUrl();
	getIPAddress(url);
	public String getBaseUrl():
#### This getBaseUrl method will try to pick the baseUrl from getEnv if found null it will then check the CONFIG.properties file for url else fill move to the hardcoded url set on top of TestNGCustomReportListener.java
		
		
		baseURL = config.getProperty("testSiteURL");
Make sure you have testSiteURL in your config file.


### Listener: Add this to TestNG.xml
	<listeners>
		<listener
			class-name="{your-package-name}.TestNGCustomReportListener" />
	</listeners>

Company logo can be set on the top of the TestNGCustomReportListener:

### Prerequisite Dependencies:
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.4.0</version>
            <scope>compile</scope>
        </dependency>

        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>4.4.1</version>
        </dependency>

       
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>LATEST</version>
        </dependency>

### Screenshot:
<p><img src='https://github.com/abhishekdh/TestNGCustomReportListener/blob/master/doc/image/screenshot.png'></p>
