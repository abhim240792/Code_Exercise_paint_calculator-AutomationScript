# Paint_Calculator_Automation 

I have created a Automation Framework using Java, Maven ,TestNG, Selenuim Webdriver, & Extent Report. 

## Table of Contents
There are a few things we need before running the tests. These are:

1. [Java Installation / Update](#installation)
1. [Setting up Eclipse](#eclipse-setup)
    
    *  [Installing TestNG](#eclipse-testng-installation)
    *  [Setting up Maven](#setting-up-maven)
1. [Running the Project](#running-the-project)
    
    * [From Eclipse](#from-eclipse)
    * [From Terminal](#from-command-line)
1. [Special Notes](#special-notes)


## <a id="eclipse-setup"></a>Java Installation / Update

Check your system to see if you have the latest Java version installed.
 
 Command:
 ```shell
$ java -version
```

If you do not have the latest Java installed, find out how to install Java [here](https://www.java.com/en/download/help/download_options.xml).

Ensure your `JAVA_HOME` environment to the location of the installed JDK. Find out how to do that [here](https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/).

##  <a id="installation"></a> Setting up Eclipse

Navigate to the [Eclipse download page](https://eclipse.org/downloads/) and download eclipse for Java EE developers.

### <a id="eclipse-testng-installation"></a> Installing TestNG

1. Installing a Plugin:
    * Inside Eclipse, click on the **Help** menu  
    * Select **Install New Software**.


1. Locating the Plugin:
    * Click the **Add** button
    * Enter **http://beust.com/eclipse** in the **Location** field


1. Selecting the Plugin:
    * Ensure the **TestNG** checkbox is selected
    * Click the "Next" button to the right bottom


1. Finishing up:
    * Accept the terms of the license agreement
    * Click on the Finish button


### <a id="setting-up-maven"></a>Setting up Maven

1. Download Maven [here](https://maven.apache.org/download.cgi).

    

1. Unzip the distribution archive to the directory you wish to install Maven. 
  
1. Add Maven to the `PATH`.

    * Here's an example of how I added Maven to my `PATH` on MacOS.
    I added the folowing to the `~/.bash_profile`.

    ```shell
    $ export PATH=/Users/admin/Documents/Software/apache-maven-3.5.0/bin:$PATH

    ```
    * Then `source`d (execute) the content of the `~/.bash_profile`
      
    ``` shell 
    $ source ~/.bash_profile
    ```

1. Verify Maven was correctly installed

    * Command:

    ```shell
    $ mvn –version
    ```

    Maven dependencies are crucial to running any Maven project.
    
    Maven dependencies contains key references to libraries that a Maven project needs to execute. The `pom.xml` in the root of a Maven project file stores the dependencies for a project.

## <a id="running-the-project"></a> Running the Project

### <a id="from-eclipse"></a> From Eclipse

  1. Import this project into Eclispe
  1. Right click the project then select **Run As** --> **TestNG Tests**
  
     or
    
  1. Import this project into Eclispe
  1. In Package Explorer view, right click "testng.xml" and select **Run As** --> **TestNG Suite**.
  
 ### <a id="from-eclipse"></a> Report Generation in Eclipse(Extent Report)
 
  1. After running the tests ,Right Click on the Project and slect **Refresh**
  2. Go to directory : **test-output/Extent.html**
  3. Right click on **Extent.html** and go to **Properties** and Copy the path from **location**.
  4. Open that Path in your browser.
  
  
  ### <a id="from-command-line"></a> From the Command Line

  Navigate to the location of project then execute:
 1. `mvn clean`. 
 2. `mvn test`.

### <a id="special-notes"></a> Special Notes

* My Automation Script is pointing to local host :http://127.0.0.1:5000/. I have run my whole automation test against Localhost.

