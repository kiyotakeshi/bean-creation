# Run

```shell
export JAVA_HOME=~/Library/Java/JavaVirtualMachines/adopt-openjdk-11.0.8/Contents/Home
```

```shell
./mvnw spring-boot:run
```

## Custom Main class execution

```shell
./mvnw clean package

cd target

java -cp non-web-0.0.1-SNAPSHOT.jar -Dloader.main=com.kiyotakeshi.non.web.Runner3 org.springframework.boot.loader.PropertiesLauncher
```

or

[rewrite pom.xml](pom.xml)

```xml
		<spring.boot.mainClass>here</spring.boot.mainClass>
```