# FabToast
## Installation
Add this into your root build.gradle file:

```java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Add the dependency to your module build.gradle:

```java
dependencies {
	        compile 'com.github.Binary-Finery:FabToast:1.0'
	}
```

## Usage

FabToast has 4 different types:

- SUCCESS
- INFORMATION
- ERROR
- WARNING

And can be displayed in 3 difference positions on-screen:

- DEFAULT (bottom)
- CENTER
- TOP

To display a FabToast is extremely simple, and achieved in a single line of code. For example, to display a SUCCESS toast:

```java
FabToast.makeText(context, "I'm a Fab toast", FabToast.SUCCESS, FabToast.LENGTH_LONG, FabToast.POSITION_DEFAULT).show();
```



