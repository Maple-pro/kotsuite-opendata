# kotsuite-opendata

KotSuite is an automated tool of unit test generation of Kotlin programs in Android projects. This site provides a prototype of the tool, along with a user guide and some experimental data.

## 1. KotSuite Tool

### 1.1 Demo Video

<!-- <video controls>
    <source src="./assets/demo_video.mkv" type="video/mp4">
</video> -->

https://github.com/user-attachments/assets/e343ef8f-daa6-470d-aaee-128a1deec489


### 1.2 Toolkit

The binary version of the tool is provided in the [`kotsuite-toolkit`](./kotsuite-toolkit/) directory.

## 2. User Guide

### 2.1 Files in the toolkit

```
Toolkit
├── kotsuite-1.2.1.zip              # KotSuite Android Studio plugin (no need to unzip)
├── kotsuite-core-fat-1.2.1.jar     # KotSuite Core jar package
└── libs                            # KotSuite Core dependencies lib folder
```

### 2.2 Installation Guide

#### 2.2.1 Installing the KotSuite Plugin

##### Method 1: Online Installation

Search for "KotSuite" in the Android Studio plugin marketplace, as shown below:

![](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20231128-1d6866-20231128213845.png)

##### Method 2: Install from Disk

Click "Install Plugin from Disk" and select "kotsuite-1.2.1.zip" from the "Toolkit" folder to complete the installation.

![image-20231109201636996](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20231109201636996.png)

#### 2.2.2 Configuring KotSuite

1.   Open Settings and go to the KotSuite configuration page, as shown below:

![image-20231109201929448](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20231109201929448.png)

2.   Configure the KotSuite options as follows:

     -   Java Home (optional): Path to Java Home. If left empty, it defaults to the system's Java Home environment variable.
     -   KotSuite Location (required): Path to the KotSuite Core jar package. Choose "kotsuite-core-fat-1.2.1.jar" from the "Toolkit" folder.
     -   Library Location (required): Path to KotSuite dependencies lib. Select the "libs" folder from the "Toolkit" folder.
     -   Generation Strategy (required): Strategy for test generation; select `ga`.

> Note: These options only need to be configured once. After configuration, the plugin will cache the KotSuite Core jar and lib folder in Android Studio's cache directory.

### 2.3 Usage Guide

> Note: Build the project before running.

1.   In Android Studio's file list, right-click on the class or package to be tested and select "Run KotSuite."
2.   A confirmation dialog will appear with parameters for the algorithm run. Users can modify these parameters as needed, as shown below:
     -   Selected Module Path: Path to the module containing the class or package to be tested.
     -   Module Class Path: Path to the compiled class files for the tested module.
     -   Module Source Path: Path to the source files for the tested module.
     -   Include Rules: Specifies which classes to generate test cases for (prefix match). Use `&` to separate multiple rules.
         -   For example, `com.simplemobiletools.calendar.pro.helpers.Formatter&com.simplemobiletools.calendar.pro.fragments.WeekFragmentsHolder` will target two classes.

![image-20231109203936687](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20231109203936687.png)

3.   After clicking OK, a Run Configuration for this algorithm run will be generated and automatically executed. You can view the Run Configuration as follows:

![image-20231109204750988](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20231109204750988.png)

The Run Configuration allows users to edit parameters, stop, or rerun. The parameters have the same meanings as above.

> Note: Generated Run Configurations are prefixed with "KotSuite-."

![image-20231109204824426](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20231109204824426.png)

4.   Logs will be output during the algorithm's execution, as shown below:

![image-20231109205307957](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20231109205307957.png)

Users can stop the algorithm at any time.

5.   Successful Completion: The algorithm completes with a `Success!` log entry, such as:

```
04:34:53.801 [SUCCESS] org.kotsuite.client.Client - Success!
```

### 2.4 Output Results

#### 2.4.1 Output Structure

```
kotsuite                                          # Root directory for algorithm output
├── 20231114_193702                               # Directory for the current run (timestamp)
│   ├── final                                     # Final output results
│   │   ├── assert           
│   │   ├── classes
│   │   ├── command
│   │   ├── decompiled                            # Generated Java test case files
│   │   │   ├── success                           # Test cases that run successfully
│   │   │   └── failed                            # Test cases needing manual revision
│   │   ├── exec
│   │   ├── report                                # Generated test report
│   │   │   ├── coverage_report_20231114_193702   # HTML format test coverage report
│   │   │   ├── coverage_xml_20231114_193702.xml  # XML format test coverage report
│   │   │   ├── overall_statistic.json            # General statistics
│   │   │   ├── report_20231114_193702.json       # Test report
│   │   │   └── statistic_20231114_193702.json    # Test data statistics
│   │   └── test
│   ├── sootOutput                                # Intermediate files for the algorithm
│   │   ├── com
│   │   ├── KotMain.class
│   │   └── META-INF
│   ├── kotsuite.log                              # Log file for the current run
│   ├── kotsuite-arguments.txt
│   ├── kotsuite-dependency-classpath.txt
│   └── kotsuite-module-information.txt
│
├── 20231114_201607
│   ├── ...
```

`$MODULE_ROOT/kotsuite.log` contains the log file for the algorithm run.

> Note: You may add `kotsuite/` to `.gitignore`.

#### 2.4.2 Using Generated Test Cases

Copy Java test case files from `final/decompiled/` into the project’s test module:

-   Test cases in the `success` folder can be used directly.
-   Test cases in the `failed` folder require modification.

> Note: Add the following dependencies to `build.gradle.kts` in your project:
>
> ```kotlin
> testImplementation("junit:junit:4.13.2")
> testImplementation("io.github.Maple-pro:JMockK:1.4")
> ```

#### 2.4.3 Tool Errors

If the tool encounters an error, please send the `kotsuite/kotsuite.log` file to [my email](yangfeng@whu.edu.cn) with a description of the issue.

## 3. Sample Experimental Data

[Download Open Source Experimental Data](./assets/open_source_experimental_data.zip)

### 3.1 Data Description

The tool was tested on three real projects from OPPO and one open-source project from GitHub. Only open-source project data is provided for now.

| Project Name                                  | Source | Stars   | Methods Tested |
| --------------------------------------------- | ------ | ------- | -------------- |
| SystemUi                                      | OPPO   | -       | 223            |
| OppoGallery3D                                 | OPPO   | -       | 3840           |
| OppoLauncher                                  | OPPO   | -       | 8051           |
| [GPSTest](https://github.com/barbeau/gpstest) | GitHub | 1.8K    | 696            |

An `analyzer.py` script is included for analyzing the raw JSON data.

### 3.2 Experimental Results

#### 3.2.1 SystemUi Coverage Report

![image-20241017145650770](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20241017145650770.png)

#### 3.2.2 OppoGallery3D Coverage Report

![image-20241017145802766](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20241017145802766.png)

#### 3.2.3 OppoLauncher Coverage Report

![image-20241017145842410](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20241017145842410.png)

### 3.3 Example Generated Test Cases

![image-20241017144956167](https://map

les31-blog.oss-cn-beijing.aliyuncs.com/img/image-20241017144956167.png)

![image-20241017145021017](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20241017145021017.png)