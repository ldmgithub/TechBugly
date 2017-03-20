package bugly.ecar.com.ecarbugly;

import android.app.Application;
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
        BuglyUtil.init(this, BuildConfig.buglyId, true); // appid初始化
        BuglyUtil.setVersion(this,BuildConfig.VERSION_NAME); //版本号
    }
}
