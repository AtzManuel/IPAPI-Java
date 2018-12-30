# IPAPI-Java
Unofficial api for ipapi.co

How to include IPAPI-Java API in your project:

## Maven

```xml
  <repository>
	  <id>jitpack.io</id>
	  <url>https://jitpack.io</url>
  </repository>
  <dependency>
	    <groupId>com.github.AtzManuel</groupId>
	    <artifactId>IPAPI-Java</artifactId>
	    <version>457c76149e</version>
	</dependency>
```

## Gradle
```groovy
  	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  dependencies {
	        implementation 'com.github.AtzManuel:IPAPI-Java:457c76149e'
	}
```
