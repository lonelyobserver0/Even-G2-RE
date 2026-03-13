package androidx.profileinstaller;

import G1.c;
import H1.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            d.t(context, new c(0), new F5.c(this, 8), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                F5.c cVar = new F5.c(this, 8);
                try {
                    d.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    cVar.c(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e10) {
                    cVar.c(7, e10);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            F5.c cVar2 = new F5.c(this, 8);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                cVar2.c(16, null);
                return;
            }
            if (d.c(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                cVar2.c(14, null);
            } else {
                cVar2.c(15, null);
            }
        }
    }
}
