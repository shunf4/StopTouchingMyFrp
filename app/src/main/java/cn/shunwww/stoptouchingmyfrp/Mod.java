package cn.shunwww.stoptouchingmyfrp;

import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XSharedPreferences;
import de.robv.android.xposed.XposedBridge;
import android.content.res.XResources;

public class Mod implements IXposedHookZygoteInit
{
    @Override
    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) throws Throwable {

        try{
            XResources.setSystemWideReplacement("android", "string", "config_persistentDataPackageName", "");
        } catch (Throwable t) {
            XposedBridge.log(t);
        }
    }
}
