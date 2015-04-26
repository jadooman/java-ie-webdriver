# Introduction #

This driver now is a drop in replacement for the IEDriverServer.exe from selenium.  It supports all the command line options and the exact same protocol as the standard IEDriverServer.exe.  This driver can now also be used with selenium grid2.

# Details #

First, download the latest package for your windows from the download page:
http://code.google.com/p/java-ie-webdriver/downloads/list

Next, unpack this into a directory, for example c:\iedriver.

Add this directory to your PATH variable.

Edit the configuration file IEDriverServer.ini.  Be sure to set:
  * **working.directory** -> should point to the directory that has IEDriverServer.exe.
  * **vm.location** -> should point to the location of the jvm.dll for your JVM.

Once that is complete, you should be able to specify _ie_ as the browser type and it should work.  If not, check the IEDriverServer.log for any errors.

# Tips and Tricks #
If you get a COM4J error when trying to run the driver, try running the driver with elevated UAC privileges.  (Select 'Run as Administrator' when you launch the command window when running the driver)