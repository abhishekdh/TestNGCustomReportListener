
# Custom Reporting with TestNG

#TestNGCustomReportListener:
    private String reportTitle = "Test Report";
    private String reportFileName = "custom-report.html";
    private String companyLogoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8z-gZd4L7PPp0a-GCm2CZfXgfTv77meUz4Q&usqp=CAU";
    private String baseURL =  "";


### Method added:
createResultTable(passed, failed, skipped);
createChartGraph(passed, failed, skipped);
createBrowserInfo();
String url = getBaseUrl();
getIPAddress(url);
public String getBaseUrl():
//This getBaseUrl method will try to pick the baseUrl from getEnv
if found null it will then check the CONFIG.properties file for
baseURL = config.getProperty("testSiteURL");
Make sure you have testSiteURL in your config file.

Company logo can be set on the top of the TestNGCustomReportListener:



<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.1//EN' 'http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd'>
<html xmlns='http://www.w3.org/1999/xhtml'>
<head>
<title>TestNG Report</title>
<style type='text/css'>
table {margin-bottom:10px;border-collapse:collapse;empty-cells:show}
td,th {border:1px solid #e5e5e5;padding:.25em .5em}
.result th {vertical-align:bottom}
.param th {padding-left:1em;padding-right:1em}
.param td {padding-left:.5em;padding-right:2em}
.stripe td,.stripe th {background-color: #E6EBF9}
.numi,.numi_attn {text-align:right}
.total td {font-weight:bold}
.passedodd td {background-color: #32CD32}
.passedeven td {background-color: #3F3}
.skippedodd td {background-color: #FFFF66}
.skippedeven td {background-color: #FFFF66}
.failedodd td,.numi_attn {background-color: #FA8072}
.failedeven td,.stripe .numi_attn {background-color: #FA8072}
.stacktrace {white-space:pre-wrap;font-family:monospace;background: #efebeb;border:1px dotted}
.totop {font-size:85%;text-align:center;border-bottom:2px solid #000}
a {text-decoration: none;}
body{font-family: calibri;}

</style>
</head>
<body>
<table align='center' cellpadding='0' cellspacing='0' border='0' width='100%' style='border-radius: 9px;box-shadow: 2px 4px 75px #bdbdbd;max-width:600px;font-size:15px;background-color:#fff;'  class='testOverview'>
<tr> <td bgcolor=#82BD1A width=16.6%></td><td bgcolor=#00C0E4 width=16.6%></td><td bgcolor=#EAC14D width=16.6%></td><td bgcolor=#E6567A width=16.6%></td><td bgcolor=#5BD999 width=16.6%></td><td bgcolor=#7658F8 width=16.6%></td><td bgcolor=#82BD1A width=16.6%></td><td bgcolor=#00C0E4 width=16.6%></td></tr><tr><td colspan='8' style='background-color:white !important;padding:10px 25px;'> <table width='100%' border='0' cellspacing='0' cellpadding='0'> <tbody> <tr> <td align='left' width='15%' style='border:0px !important;'><a href='#m_-5457254916091177664_'><img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8z-gZd4L7PPp0a-GCm2CZfXgfTv77meUz4Q&usqp=CAU' style='width:100px' class='CToWUd'></a></td><td align='left' style='border:0px !important;color:black;font-size:18px;padding-left:15px'><b>Test Report - 24 May 2021 03:55:03 PM</b></td></tr></tbody></table> </td></tr><tr><td colspan=2 align=center style='font-size:26px; color:#002d66;'>14<br>Total</td><td colspan=2 align=center style='font-size:26px; color:#33ff33;'>4<br>PASSED</td><td colspan=2 align=center style='font-size:26px; color:salmon;'>10<br>FAILED</td><td colspan=2 align=center style='font-size:26px; color: #ffce01;'>0<br>SKIPPED</td></tr><tr>
<td colspan="8"><br>
<img src="https://image-charts.com/chart?cht=bvg&chd=t:100,28,71,0&chco=76A4FB|dff4b6|fbc7a0|ffff00&chxt=x,y&chxl=0:|Total|Passed|Failed|Skipped&chs=700x200">
    </td>
</tr><tr style='background:#f36622;'><td colspan=2 align=center style='font-size:14px; color:white;'> <b>OS</b> <br><b>Mac OS X - X64</b></td><td colspan=3 align=center style='font-size:14px; color:white;'><b>Browser Name</b><br><b>CHROME</b></td><td colspan=3 align=center style='font-size:14px; color:white;'><b>Browser Version</b> <br><b>90.0.4430.212</b></td></tr><tr style='background:#00c0e4;'><td colspan=2 align=center style='font-size:14px; color:white;'>172.217.166.206<br><b>IP Address</b></td><td colspan=6 align=center style='font-size:14px; color:white;'>del03s13-in-f14.1e100.net<br><b>Host Name</b></td></tr><tr><th>Test Case</th><th>Passed</th><th>Skipped</th><th>Failed</th><th>Browser</th><th>Start Time<br/>(hh:mm:ss)</th><th>End Time<br/>(hh:mm:ss)</th><th>Total Time</br> (hh:mm:ss)</th></tr>
<tr><th colspan='10'>MIC Suite</th></tr>
<tr><td style='text-align:left;padding-right:2em'><a href='#t1'><b>Test Custom Listener</b></a></td><td class='numi'>2</td><td class='numi_attn' style='background:#feff65;'>1</td><td class='numi_attn' style='background:#fa8072;'>2</td><td class='numi'>Chrome</td></td>
<td class='numi'>03:55:03</td></td>
<td class='numi'>03:55:03</td></td>
<td class='numi'>00:00:00</td></tr>
<tr class='stripe'><td style='text-align:left;padding-right:2em'><a href='#t2'><b>Test Custom Listener 2</b></a></td><td class='numi'>1</td><td class='numi' style='background:#feff65;'>0</td><td class='numi_attn' style='background:#fa8072;'>1</td><td class='numi'>Chrome</td></td>
<td class='numi'>03:55:03</td></td>
<td class='numi'>03:55:03</td></td>
<td class='numi'>00:00:00</td></tr>
<tr class='total'><td>Total</td>
<td class='numi'>3</td><td class='numi_attn'>1</td><td class='numi_attn'>3</td><td class='numi'> </td><td class='numi'> </td><td class='numi'> </td><td class='numi'>00:00:00</td></tr>
<tr><td colspan='8'> <h4>Result Analysis:</h4><div class='cases passed' style='margin-bottom:6px;background: #27ae60;color:white;text-align:center;font-weight: 400;display: inline-block;width:43%;'><b>43%</b></div><br><div class='cases failed' style='margin-bottom: 6px; background: #FA8072;color: white;text-align:center;font-weight: 400;display: inline-block;width:43%;'><b>43%</b></div><br><div class='cases skipped' style='margin-bottom: 6px; background: #f1c40f;color: white;text-align:center;font-weight: 400;display: inline-block;width:14%;'><b>14%</b></div><br></td></tr></table>
<table align='center' cellpadding='0' cellspacing='0' border='0' width='100%' style='border-radius: 9px;box-shadow: 2px 4px 75px #bdbdbd;max-width:600px;font-size:15px;background-color:#fff;'  class='methodOverview' id='summary'>
<tr><th>Class</th><th>Method</th><th>Exception Info</th><th>Start Time </th><th>Execution Time<br/>(hh:mm:ss)</th></tr>
<tr><th colspan='5'>MIC Suite</th></tr>
<tr id='t1'><th colspan='5'>Test Custom Listener &#8212;  2 Test failed Summary</th></tr>
<tr class='failedodd'><td rowspan='2'>com.abhishek.tests.Test_TestNGCustomListener</td><td><a href='#m1'><b>testDataProvider</b>  </a></td><td class='numi' style='text-align:left;padding-right:2em'>java.lang.AssertionError: expected [Test data 1] but found [Test data 2]<br/></td><td style='text-align:right'>03:55:03</td><td class='numi'>00:00:00</td></tr><tr class='failedodd'><td><a href='#m2'><b>testFailed</b>  </a></td><td class='numi' style='text-align:left;padding-right:2em'>java.lang.AssertionError: expected [Failed] but found [Pass]<br/></td><td style='text-align:right'>03:55:03</td><td class='numi'>00:00:00</td></tr>
<tr><th colspan='5'>Test Custom Listener &#8212;  1 Test skipped Summary</th></tr>
<tr class='skippedodd'><td>com.abhishek.tests.Test_TestNGCustomListener</td><td><a href='#m3'><b>testSkipped</b>  </a></td><td class='numi' style='text-align:left;padding-right:2em'>org.testng.SkipException: Skipping test case<br/></td><td style='text-align:right'>03:55:03</td><td class='numi'>00:00:00</td></tr>
<tr><th colspan='5'>Test Custom Listener &#8212;  2 Test passed Summary</th></tr>
<tr class='passedodd'><td rowspan='2'>com.abhishek.tests.Test_TestNGCustomListener</td><td><a href='#m4'><b>testDataProvider</b>  </a></td><td class='numi' style='text-align:left;padding-right:2em'><br/></td><td style='text-align:right'>03:55:03</td><td class='numi'>00:00:00</td></tr><tr class='passedodd'><td><a href='#m5'><b>testPass</b>  </a></td><td class='numi' style='text-align:left;padding-right:2em'><br/></td><td style='text-align:right'>03:55:03</td><td class='numi'>00:00:00</td></tr>
<tr id='t2'><th colspan='5'>Test Custom Listener 2 &#8212;  1 Test failed Summary</th></tr>
<tr class='failedodd'><td>com.abhishek.tests.Test_TestNGCustomListener2</td><td><a href='#m6'><b>testDataProvider</b>  </a></td><td class='numi' style='text-align:left;padding-right:2em'>java.lang.AssertionError: expected [Test data 1] but found [Test data 2]<br/></td><td style='text-align:right'>03:55:03</td><td class='numi'>00:00:00</td></tr>
<tr><th colspan='5'>Test Custom Listener 2 &#8212;  1 Test passed Summary</th></tr>
<tr class='passedodd'><td>com.abhishek.tests.Test_TestNGCustomListener2</td><td><a href='#m7'><b>testDataProvider</b>  </a></td><td class='numi' style='text-align:left;padding-right:2em'><br/></td><td style='text-align:right'>03:55:03</td><td class='numi'>00:00:00</td></tr>
</table>
<h1>Test Custom Listener</h1>
<h2 id='m1'>com.abhishek.tests.Test_TestNGCustomListener:testDataProvider</h2>
<table align='center' cellpadding='0' cellspacing='0' border='0' width='100%' style='border-radius: 9px;box-shadow: 2px 4px 75px #bdbdbd;max-width:600px;font-size:15px;background-color:#fff;'  class='result'>
<tr class='param'><th>Param.1</th></tr>
<tr class='param stripe'><td>Test data 3</td>
</tr>
<tr><td>
<div class='stacktrace'>java.lang.AssertionError: expected [Test data 1] but found [Test data 3]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:629)
	at org.testng.Assert.assertEquals(Assert.java:639)
	at com.abhishek.tests.Test_TestNGCustomListener.testDataProvider(Test_TestNGCustomListener.java:30)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:598)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:173)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:824)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:146)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
	at org.testng.TestRunner.privateRun(TestRunner.java:794)
	at org.testng.TestRunner.run(TestRunner.java:596)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:377)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:371)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:332)
	at org.testng.SuiteRunner.run(SuiteRunner.java:276)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1212)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1134)
	at org.testng.TestNG.runSuites(TestNG.java:1063)
	at org.testng.TestNG.run(TestNG.java:1031)
	at com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)
	at com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)
</div>
</td></tr>
</table>
<p class='totop'><a href='#summary'>back to summary</a></p>
<h2 id='m2'>com.abhishek.tests.Test_TestNGCustomListener:testDataProvider</h2>
<table align='center' cellpadding='0' cellspacing='0' border='0' width='100%' style='border-radius: 9px;box-shadow: 2px 4px 75px #bdbdbd;max-width:600px;font-size:15px;background-color:#fff;'  class='result'>
<tr class='param'><th>Param.1</th></tr>
<tr class='param stripe'><td>Test data 2</td>
</tr>
<tr><td>
<div class='stacktrace'>java.lang.AssertionError: expected [Test data 1] but found [Test data 2]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:629)
	at org.testng.Assert.assertEquals(Assert.java:639)
	at com.abhishek.tests.Test_TestNGCustomListener.testDataProvider(Test_TestNGCustomListener.java:30)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:598)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:173)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:824)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:146)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
	at org.testng.TestRunner.privateRun(TestRunner.java:794)
	at org.testng.TestRunner.run(TestRunner.java:596)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:377)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:371)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:332)
	at org.testng.SuiteRunner.run(SuiteRunner.java:276)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1212)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1134)
	at org.testng.TestNG.runSuites(TestNG.java:1063)
	at org.testng.TestNG.run(TestNG.java:1031)
	at com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)
	at com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)
</div>
</td></tr>
</table>
<p class='totop'><a href='#summary'>back to summary</a></p>
<h2 id='m3'>com.abhishek.tests.Test_TestNGCustomListener:testFailed</h2>
<div>
<div class='stacktrace'>java.lang.AssertionError: expected [Failed] but found [Pass]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:629)
	at org.testng.Assert.assertEquals(Assert.java:639)
	at com.abhishek.tests.Test_TestNGCustomListener.testFailed(Test_TestNGCustomListener.java:19)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:598)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:173)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:824)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:146)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
	at org.testng.TestRunner.privateRun(TestRunner.java:794)
	at org.testng.TestRunner.run(TestRunner.java:596)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:377)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:371)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:332)
	at org.testng.SuiteRunner.run(SuiteRunner.java:276)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1212)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1134)
	at org.testng.TestNG.runSuites(TestNG.java:1063)
	at org.testng.TestNG.run(TestNG.java:1031)
	at com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)
	at com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)
</div>
</div>
<p class='totop'><a href='#summary'>back to summary</a></p>
<h2 id='m4'>com.abhishek.tests.Test_TestNGCustomListener:testSkipped</h2>
<div>
<div class='stacktrace'>org.testng.SkipException: Skipping test case
	at com.abhishek.tests.Test_TestNGCustomListener.testSkipped(Test_TestNGCustomListener.java:25)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:598)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:173)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:824)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:146)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
	at org.testng.TestRunner.privateRun(TestRunner.java:794)
	at org.testng.TestRunner.run(TestRunner.java:596)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:377)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:371)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:332)
	at org.testng.SuiteRunner.run(SuiteRunner.java:276)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1212)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1134)
	at org.testng.TestNG.runSuites(TestNG.java:1063)
	at org.testng.TestNG.run(TestNG.java:1031)
	at com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)
	at com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)
</div>
</div>
<p class='totop'><a href='#summary'>back to summary</a></p>
<h2 id='m5'>com.abhishek.tests.Test_TestNGCustomListener:testDataProvider</h2>
<table align='center' cellpadding='0' cellspacing='0' border='0' width='100%' style='border-radius: 9px;box-shadow: 2px 4px 75px #bdbdbd;max-width:600px;font-size:15px;background-color:#fff;'  class='result'>
<tr class='param'><th>Param.1</th></tr>
<tr class='param stripe'><td>Test data 1</td>
</tr>
</table>
<p class='totop'><a href='#summary'>back to summary</a></p>
<h2 id='m6'>com.abhishek.tests.Test_TestNGCustomListener:testPass</h2>
<p class='totop'><a href='#summary'>back to summary</a></p>
<h1>Test Custom Listener 2</h1>
<h2 id='m7'>com.abhishek.tests.Test_TestNGCustomListener2:testDataProvider</h2>
<table align='center' cellpadding='0' cellspacing='0' border='0' width='100%' style='border-radius: 9px;box-shadow: 2px 4px 75px #bdbdbd;max-width:600px;font-size:15px;background-color:#fff;'  class='result'>
<tr class='param'><th>Param.1</th></tr>
<tr class='param stripe'><td>Test data 3</td>
</tr>
<tr><td>
<div class='stacktrace'>java.lang.AssertionError: expected [Test data 1] but found [Test data 3]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:629)
	at org.testng.Assert.assertEquals(Assert.java:639)
	at com.abhishek.tests.Test_TestNGCustomListener2.testDataProvider(Test_TestNGCustomListener2.java:15)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:598)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:173)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:824)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:146)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
	at org.testng.TestRunner.privateRun(TestRunner.java:794)
	at org.testng.TestRunner.run(TestRunner.java:596)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:377)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:371)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:332)
	at org.testng.SuiteRunner.run(SuiteRunner.java:276)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1212)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1134)
	at org.testng.TestNG.runSuites(TestNG.java:1063)
	at org.testng.TestNG.run(TestNG.java:1031)
	at com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)
	at com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)
</div>
</td></tr>
</table>
<p class='totop'><a href='#summary'>back to summary</a></p>
<h2 id='m8'>com.abhishek.tests.Test_TestNGCustomListener2:testDataProvider</h2>
<table align='center' cellpadding='0' cellspacing='0' border='0' width='100%' style='border-radius: 9px;box-shadow: 2px 4px 75px #bdbdbd;max-width:600px;font-size:15px;background-color:#fff;'  class='result'>
<tr class='param'><th>Param.1</th></tr>
<tr class='param stripe'><td>Test data 2</td>
</tr>
<tr><td>
<div class='stacktrace'>java.lang.AssertionError: expected [Test data 1] but found [Test data 2]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:629)
	at org.testng.Assert.assertEquals(Assert.java:639)
	at com.abhishek.tests.Test_TestNGCustomListener2.testDataProvider(Test_TestNGCustomListener2.java:15)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:598)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:173)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:824)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:146)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
	at org.testng.TestRunner.privateRun(TestRunner.java:794)
	at org.testng.TestRunner.run(TestRunner.java:596)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:377)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:371)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:332)
	at org.testng.SuiteRunner.run(SuiteRunner.java:276)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1212)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1134)
	at org.testng.TestNG.runSuites(TestNG.java:1063)
	at org.testng.TestNG.run(TestNG.java:1031)
	at com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)
	at com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)
</div>
</td></tr>
</table>
<p class='totop'><a href='#summary'>back to summary</a></p>
<h2 id='m9'>com.abhishek.tests.Test_TestNGCustomListener2:testDataProvider</h2>
<table align='center' cellpadding='0' cellspacing='0' border='0' width='100%' style='border-radius: 9px;box-shadow: 2px 4px 75px #bdbdbd;max-width:600px;font-size:15px;background-color:#fff;'  class='result'>
<tr class='param'><th>Param.1</th></tr>
<tr class='param stripe'><td>Test data 1</td>
</tr>
</table>
<p class='totop'><a href='#summary'>back to summary</a></p>
<h2 id='m10'>com.abhishek.tests.Test_TestNGCustomListener2:testDataProvider</h2>
<table align='center' cellpadding='0' cellspacing='0' border='0' width='100%' style='border-radius: 9px;box-shadow: 2px 4px 75px #bdbdbd;max-width:600px;font-size:15px;background-color:#fff;'  class='result'>
<tr class='param'><th>Param.1</th></tr>
<tr class='param stripe'><td>Test data 1</td>
</tr>
</table>
<p class='totop'><a href='#summary'>back to summary</a></p>
<center> TestNG Report </center>
</body></html>
