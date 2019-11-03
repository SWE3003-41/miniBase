# miniBase 3003-41
database project homework code repository

### If You Have Question
- Leave your question here: [ISSUE](https://github.com/SWE3003-41/miniBase/issues)
- [FAQ](https://github.com/SWE3003-41/miniBase/issues/3)

# SWE3033-41 MiniBase 

## 1. Introduction 

### Development Environment 
- Linux 

### Prerequisite
#### java
```bash
sudo apt-get install openjdk-[version]-jdk
```

#### ant 
what is ant? [link](http://ant.apache.org/) 
```bash
$ sudo apt-get install ant 
```

### Download code 

- If you want to keep project in your own repository and follow [this](https://github.com/SWE3003-41/ClassMaterial#work-on-your-own-account) guide.  

- If not clone this repository 
```bash
$ git clone https://github.com/SWE3003-41/miniBase
```

- **Do not commit your project before all the projects finish!!!!!!**

### Build Project

|command|description|
|----------|-----------------------------------------|
|ant|Build miniBase|
|ant test|Run all the unit test provided|
|ant runtest -Dtest=testname|Run the specific unit test|
|ant clean|Remove binary files|
|and handin|Make tarball|

Let's build project!
```bash
$ ant
Buildfile:/Path/of/your/minibase/project/build.xml

compile:
  [mkdir] Created dir: /Path/of/your/minibase/project/bin/src
  [javac] Compiling 30 source files to /Path/of/your/minibase/project/bin/src
  [javac] warning --
  [javac] warning --
  [javac] warning --
  [javac] 3 warnings
  
dist:
  [mkdir] Created dir: /Path/of/your/minibase/project/dist
    [jar] Building jar: /Path/of/yout/minibase/project/dist/minibase.jar
    
BUILD SUCCESSFUL
Total time: 0 seconds
```

If minibase is built successfully you can see `BUILD SUCCESSFUL` message!
> If not please check if prerequisites are satisfied and search for the error message.

Let's run test code! 

Test codes are in `test` directory. 
```bash
$ ant test
```
Then you can see `BUILD FAILED`.   
Why? Because the database code is incomplete!
**Our goal is to solve this problem and see `BUILD SUCCESSFUL` message.**
