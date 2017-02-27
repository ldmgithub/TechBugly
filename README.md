# 使用方法
##集成步骤
1. **build.gradle**添加</br>
```
 compile 'com.github.goEcar:EcarBugly:1.0.1'
```
2. **appliction的oncreate**添加</br>
```
   BuglyUtil.init(this, BuildConfig.buglyId, false); // appid初始化
                                                     //BuildConfig.buglyId: 当前appid  false 正式环境  true 测试环境
   BuglyUtil.setVersion(this,BuildConfig.VERSION_NAME); //当前APP版本号
```
3. **混淆**(不报错可不加)</br>
```
  #-dontwarn com.tencent.bugly.**
  #-keep public class com.tencent.bugly.**{*;}
```
