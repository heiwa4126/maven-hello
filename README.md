# maven-hello

Maven で executable な fat JARを作るテスト。GitHub Actions付き。

# 最初は

```bash
mvn -B archetype:generate \
 -DarchetypeArtifactId=maven-archetype-quickstart \
 -DinteractiveMode=false \
 -DarchetypeVersion=1.4 \
 -DgroupId=com.sample \
 -DartifactId=hello
```

# 実行

```bash
mvn compile exec:java
```

# JARの作成

```bash
mvn
# または
mvn clean prepare-package assembly:single
```


# 実行出力

```
$ java -jar target/hello-1.0-SNAPSHOT-jar-with-dependencies.jar
Hello World!
7f83b1657ff1fc53b92dc18148a1d65dfc2d4b1fa3d677284addd200126d9069
```

# GitHub Actions

タグとして 'v1.0.0' みたいのをつけたときに実行される(はず)。



# 環境

テストした環境のJDKとmavenのバージョンは以下の通り。

```
$ java -version
openjdk version "18.0.2-ea" 2022-07-19
OpenJDK Runtime Environment (build 18.0.2-ea+9-Ubuntu-222.04)
OpenJDK 64-Bit Server VM (build 18.0.2-ea+9-Ubuntu-222.04, mixed mode, sharing)

$ javac -version
javac 18.0.2-ea

$ mvn -version
Apache Maven 3.6.3
Maven home: /usr/share/maven
Java version: 18.0.2-ea, vendor: Private Build, runtime: /usr/lib/jvm/java-18-openjdk-amd64
Default locale: ja_JP, platform encoding: UTF-8
OS name: "linux", version: "5.15.0-1022-aws", arch: "amd64", family: "unix"
```
