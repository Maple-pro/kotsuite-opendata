# KotSuite 使用说明

>   KotSuite Core 版本：1.2.1
>
>   KotSuite 插件版本：1.2.1
>
>   支持的 Android Studio 版本：222 ~ 232.*（即 2022.2 ~ 2023.2 版本）
>
>   作者：杨枫 (yangfeng@whu.edu.cn)

## 一、工具文件说明

```
工具
├── kotsuite-1.2.1.zip				# KotSuite Android Studio 插件（不需要解压）
├── kotsuite-core-fat-1.2.1.jar		# KotSuite Core jar 包
└── libs							# KotSuite Core 依赖 lib 文件夹
```

## 二、安装教程

### 1. 安装 KotSuite 插件

#### 方式一：在线安装

在 Android Studio 插件商店中搜索 "KotSuite"，如下图所示：

![](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20231128-1d6866-20231128213845.png)

#### 方式二：使用安装包安装

点击 "Install Plugin from Disk"，然后选择「工具」文件夹中的 "kotsuite-1.2.1.zip" 文件完成插件的安装。

![image-20231109201636996](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20231109201636996.png)

### 2. 配置 KotSuite

1.   打开 Setting，进入 KotSuite 配置界面，如下图所示：

![image-20231109201929448](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20231109201929448.png)

2.   配置 KotSuite 选项，四个选项分别配置如下：

     -   Java Home（选填）：Java Home 路径，如果不填，则默认使用系统的环境变量中的 Java Home；

     -   KotSuite Location（必填）：KotSuite Core jar 包的路径，选择「工具」文件夹中的 "kotsuite-core-fat-1.2.1.jar" 即可；

     -   Library Location（必填）：KotSuite 依赖 lib 的路径，选择「工具」文件夹中的 "libs" 文件夹即可；

     -   Generation Strategy（必填）：测试生成的策略，选择 ga 即可。

>   注意：这些选项只需要配置一次，配置后插件会将 KotSuite Core jar 包和 lib 文件夹缓存到 Android Studio 缓存文件夹中。

## 三、使用教程

>   运行前需要先对项目进行 build

1.   在 Android Studio 文件列表中对待测类/待测 package 右键，选择 "Run KotSuite"
2.   点击后会弹出一个运行确认框，其中包含一些本次算法运行的参数，用户可以进行修改，如下图所示：
     -   Selected Module Path：待测类/待测 package 所处的 module 的路径；
     -   Module Class Path：待测 module 编译后生成的 class 文件的路径；
     -   Module Source Path：待测 module 的源代码文件路径；
     -   Include Rules：本次算法运行针对哪些类做测试用例生成（匹配类的前缀），多条规则使用 `&` 连接
         -   例如：`com.simplemobiletools.calendar.pro.helpers.Formatter&com.simplemobiletools.calendar.pro.fragments.WeekFragmentsHolder` 会配置到两个类

![image-20231109203936687](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20231109203936687.png)

3.   点击 OK 后会自动生成本次算法运行的 Run Configuration，并自动运行本次算法，可以按照如下步骤查看生成的 Run Configuration：

![image-20231109204750988](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20231109204750988.png)

生成的 Run Configuration 如下所示，用户在这里可以编辑运行的参数、停止本次运行、重复运行等，其中的参数含义与上面的相同，不再赘述。

>   注：生成的 Run Configuration 以 "KotSuite-" 为前缀。

![image-20231109204824426](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20231109204824426.png)

4.   算法运行后会在下面输出运行日志，如下图所示：

![image-20231109205307957](https://maples31-blog.oss-cn-beijing.aliyuncs.com/img/image-20231109205307957.png)

算法运行期间用户可以随时终止。

5.   算法正常运行完毕：算法运行结束，同时在日志中打出 `Success!`，如：

```
04:34:53.801 [SUCCESS] org.kotsuite.client.Client - Success!
```

## 四、输出结果

### 1. 输出结果

```
kotsuite											# 算法的输出根目录
├── 20231114_193702									# 本次运行算法的输出根目录（目录名为运行算法时间的时间戳）
│   ├── final										# 最终输出结果
│   │   ├── assert			
│   │   ├── classes
│   │   ├── command
│   │   ├── decompiled								# 最终生成得到的测试用例 Java 文件
│   │   │	├── success								# 能正确执行的测试用例
│   │   │	└── failed								# 无法正确执行的测试用例（需要人工修改）
│   │   ├── exec
│   │   ├── report									# 最终生成得到的测试报告
│   │   │   ├── coverage_report_20231114_193702		# HTML 格式的测试覆盖率报告
│   │   │   ├── coverage_xml_20231114_193702.xml	# XML 格式的测试覆盖率报告
│   │   │   ├── overall_statistic.json				# 基本信息统计
│   │   │   ├── report_20231114_193702.json			# 测试报告
│   │   │   └── statistic_20231114_193702.json		# 测试数据统计
│   │   └── test
│   ├── sootOutput									# 算法运行时的中间文件
│   │   ├── com
│   │   ├── KotMain.class
│   │   └── META-INF
│	├──	kotsuite.log								# 本次算法运行的日志文件
│	├── kotsuite-arguments.txt
│	├── kotsuite-dependency-classpath.txt
│	└── kotsuite-module-information.txt
│
├── 20231114_201607
│   ├── ...
```

`$MODULE_ROOT/kotsuite.log` 为算法运行的日志文件。

>    注：用户可以将 `kotsuite/` 加入 .gitignore 中

### 2. 应用生成的测试用例

用户将 `final/decompiled/` 中的 Java 测试用例文件复制到项目的测试模块中，其中：

-   `success` 文件夹中的测试用例可以直接使用
-   `failed` 文件夹中的测试用例需要经过修改后使用

>   注：用户需要在项目 build.gradle.kts 中添加以下两个依赖：
>
>   ```kotlin
>   testImplementation("junit:junit:4.13.2")
>   testImplementation("io.github.Maple-pro:JMockK:1.4")
>   ```

### 3. 工具出错

请将 `kotsuite/kotsuite.log` 文件发送到[我的邮箱](yangfeng@whu.edu.cn)并说明具体运行情况和报错情况。
