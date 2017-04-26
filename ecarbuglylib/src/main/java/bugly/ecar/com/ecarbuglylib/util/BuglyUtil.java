package bugly.ecar.com.ecarbuglylib.util;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.crashreport.CrashReport;

/*************************************
 * 功能： BuglyUtil
 * 创建者： kim_tony
 * 创建日期：2017/2/27
 * 版权所有：深圳市亿车科技有限公司
 *************************************/

public class BuglyUtil {
    private static boolean isDebug;

    /****************************************
     方法描述：  Bugly初始化--需要tinker
     @param  app 当前的application对象  申请到的appid: 申请到的appid      isTest:true 测试模式   version 当前版本
     @return
     ****************************************/
    public static void init(Application app, String appid, boolean isTest, String version) {
        init(app, appid, isTest, version, true);
    }

    /****************************************
     方法描述：  Bugly初始化--不需要tinker
     @param  app 当前的application对象  申请到的appid: 申请到的appid      isTest:true 测试模式   version 当前版本
     @return
     ****************************************/
    public static void init(Application app, String appid, boolean isTest, String version, boolean isNeedTinker) {
        if (isNeedTinker) {
            // you must install multiDex whatever tinker is installed!
            MultiDex.install(app);
            // 安装tinker
            Beta.installTinker();
        }
        Bugly.init(app, appid, isTest);

        CrashReport.initCrashReport(app, appid, isTest);

        setVersion(app, version); //版本号--用于异常捕获
    }

    /****************************************
     方法描述：  Bugly版本号
     @param     appVersion：app版本号
     @return
     ****************************************/
    public static void setVersion(Context context, String appVersion) {
        if (isDebug)
            appVersion = appVersion.concat("-DeBug");
        CrashReport.setAppVersion(context, appVersion);
    }

    /****************************************
     方法描述：  Bugly启用/禁止
     @param     isEnable 启用
     @return
     ****************************************/
    public static void setEnable(boolean isEnable) {
        CrashReport.enableBugly(isEnable);
    }
}
