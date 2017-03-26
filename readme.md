# LoadingDilog
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
	        compile 'com.github.HeYongRui:LoadingDilog:1.1'
	}
```
# 示例代码
```Java
 LoadingDialog loadingDialog = new LoadingDialog(MainActivity.this);
 loadingDialog.setColor(Color.parseColor("#FFE3AB90"));
 loadingDialog.setType(LoadingDialog.WAVE);
 loadingDialog.show();
```
