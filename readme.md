# LoadingDialog
## 这是一个loading的加载框，可以定义多种样式，可以自定义设置颜色、透明度、是否可以取消等属性。使用非常简单，仅几行代码就可实现。
![baidu](https://raw.githubusercontent.com/HeYongRui/LoadingDilog/master/app/src/main/res/gif.gif "效果图")
## 使用方法
* 项目build.gradle配置：
```Java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
* 工程build.gradle配置：
```Java
	dependencies {
	         compile 'com.github.HeYongRui:LoadingDialog:1.1'
	}
```
## 示例代码
```Java
LoadingDialog loadingDialog = new LoadingDialog(MainActivity.this,true,0.8f,LoadingDialog.ROTATINGPLANE,Color.BLUE);
loadingDialog.show();
```
或者
```Java
 LoadingDialog loadingDialog = new LoadingDialog(MainActivity.this);
 loadingDialog.setColor(Color.parseColor("#FFE3AB90"));
 loadingDialog.setType(LoadingDialog.WAVE);
 loadingDialog.setAlpha(0.8f);
 loadingDialog.setCancelable(true);
 loadingDialog.show();
```
## 感谢
## 这里用到了ybq的[SpinKitView](https://github.com/ybq/Android-SpinKit)，写的非常好，我这里只是封装了一下成了一个dialog，感兴趣的可以去看一下。
