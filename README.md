# FabToast
[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-FabToast-green.svg?style=flat )]( https://android-arsenal.com/details/1/6589 )

[![](https://jitpack.io/v/Binary-Finery/FabToast.svg)](https://jitpack.io/#Binary-Finery/FabToast)
- min SDK 16 (Jelly Bean 4.1)<br />
- written in Java<br />

To download the demo app for this library from Google Playstore so you can see it in action, click [here](https://play.google.com/store/apps/details?id=spencerstudios.com.fabtoastlibrarydemo)


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

To display a FabToast is extremely simple, and achieved in a single line of code. For example, to display a SUCCESS FabToast at the default position (Bottom):

```java
FabToast.makeText(context, "I'm a Fab toast", FabToast.LENGTH_LONG, FabToast.SUCCESS,  FabToast.POSITION_DEFAULT).show();
```

to display a WARNING FabToast in the center of the screen:

```java
FabToast.makeText(context, "I'm a Fab toast", FabToast.LENGTH_LONG, FabToast.WARNING,  FabToast.POSITION_CENTER).show();
```

to display an ERROR FabToast at the top of the screen:

```java
FabToast.makeText(context, "I'm a Fab toast", FabToast.LENGTH_LONG, FabToast.ERROR,  FabToast.POSITION_TOP).show();
```

to display an INFORMATION FabToast at the default position:

```java
FabToast.makeText(context, "I'm a Fab toast", FabToast.LENGTH_LONG, FabToast.INFORMATION,  FabToast.POSITION_DEFAULT).show();
```







