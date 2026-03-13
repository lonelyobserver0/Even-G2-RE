package W3;

import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.h;
import com.google.android.gms.common.i;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f8100a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f8101b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f8102c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f8103d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f8104e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f8105f;

    /* renamed from: g, reason: collision with root package name */
    public static String f8106g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f8107h;

    public static String a() {
        if (f8106g == null) {
            f8106g = Application.getProcessName();
        }
        return f8106g;
    }

    public static boolean b(Context context, int i3) {
        String string2 = StubApp.getString2(0);
        if (d(context, i3, string2)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(string2, 64);
                i a3 = i.a(context);
                a3.getClass();
                if (packageInfo != null) {
                    if (!i.d(packageInfo, false)) {
                        if (i.d(packageInfo, true)) {
                            if (!h.a((Context) a3.f11191a)) {
                                Log.w(StubApp.getString2(6880), StubApp.getString2(6881));
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                String string22 = StubApp.getString2(6882);
                if (Log.isLoggable(string22, 3)) {
                    Log.d(string22, StubApp.getString2(6883));
                }
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f8102c == null) {
            f8102c = Boolean.valueOf(packageManager.hasSystemFeature(StubApp.getString2(5692)));
        }
        f8102c.booleanValue();
        if (f8103d == null) {
            f8103d = Boolean.valueOf(context.getPackageManager().hasSystemFeature(StubApp.getString2(6884)));
        }
        return f8103d.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static boolean d(Context context, int i3, String str) {
        Y3.b a3 = Y3.c.a(context);
        a3.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a3.f8739a.getSystemService(StubApp.getString2("6885"));
            if (appOpsManager == null) {
                throw new NullPointerException(StubApp.getString2("6886"));
            }
            appOpsManager.checkPackage(i3, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
