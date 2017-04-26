package bugly.ecar.com.ecarbugly;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;
import com.tencent.tinker.loader.app.TinkerApplication;

import bugly.ecar.com.ecarbuglylib.util.BuglyUtil;

/*************************************
 * 功能：
 * 创建者： kim_tony
 * 创建日期：2017/2/27
 * 版权所有：深圳市亿车科技有限公司
 *************************************/

public class app extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        BuglyUtil.init(this, BuildConfig.buglyId, BuildConfig.IS_DEBUG,BuildConfig.VERSION_NAME);      //初始化（需要tinker）
//      BuglyUtil.init(this, BuildConfig.buglyId, BuildConfig.IS_DEBUG,BuildConfig.VERSION_NAME,false);        //初始化（不需要tinker）


    }
}
