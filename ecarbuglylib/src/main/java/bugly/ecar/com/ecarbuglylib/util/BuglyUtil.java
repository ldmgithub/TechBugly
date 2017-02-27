package bugly.ecar.com.ecarbuglylib.util;

import android.app.Application;
import android.content.Context;

import com.tencent.bugly.crashreport.CrashReport;

/*************************************
 * 功能： BuglyUtil
 * 创建者： kim_tony
 * 创建日期：2017/2/27
 * 版权所有：深圳市亿车科技有限公司
 *************************************/

public  class BuglyUtil {

    /****************************************
     方法描述：  Bugly初始化
     @param  app 当前的application对象  申请到的appid: 申请到的appid      isTest:true 测试模式
     @return
     ****************************************/
    public static void init(Application app,String appid,boolean isTest){
        CrashReport.initCrashReport(app, appid, isTest);
    }
    /****************************************
     方法描述：  Bugly版本号
     @param     appVersion：app版本号
     @return
     ****************************************/
    public static void setVersion(Context context,String appVersion){
        CrashReport.setAppVersion(context,appVersion);
    }
    /****************************************
     方法描述：  Bugly启用/禁止
     @param     isEnable 启用
     @return
     ****************************************/
    public static void setEnable(boolean isEnable){
        CrashReport.enableBugly(isEnable);
    }
}
