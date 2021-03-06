## 目的
通过练习来掌握java编译运行的命令，了解编译生成class文件的规则。了解这些规则能够更好的帮助我们理解java程序的运行流程，为我们以后更深入的学习打好基础。在练习中我们可能会遇到一些错误的提示，我们要理解产生这些错误提示的原因，如果以后遇到类似的错误能够快速的定位出问题原因。

## 练习
将示例代码`Hello.java`放到路径`$JAVASE/HelloJava`下，保证文件夹下面没有其他文件后，开始以下练习
1. 编译运行`Hello.java`，请记录打开终端开始到程序运行期间所有输入的终端命令
2. 将`HelloJava`目录下的`Hello.class`文件删除，编辑`Hello.java`将`class`后面的名称修改为`test`，然后编译`Hello.java`文件
    1. 生成的class文件名是什么
    2. 请尝试使用`java`运行编译后的文件，应该输入什么命令
3. 保持上一题的状态，编辑Hello.java将class后面的名称修改为Test，然后编译Hello.java
    1. 是否生成新的class文件
    2. 请尝试使用`java`运行编译后的文件，应该输入什么命令
    3. 将`test.class` 重命名为`test1.class`后尝试运行，是否可以运行成功，如果不成功记录错误
    4. 将`test.class` 重命名为`TEST.class`尝试运行，是否可以运行成功，如果不成功记录错误
4. 仿照`Hello.java`写一个`HelloWorld.java`, 其中class声明为`HelloWorld`，向屏幕输出`Hello World!`

## 练习提交路径

请将练习题答案以markdown格式保存在$GIT/javase-practice/HelloJava/practice.md

将HelloWorld.java保存在$GIT/javase-practice/HelloJava/HelloWorld.java

