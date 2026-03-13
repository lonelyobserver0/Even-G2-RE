package S3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.stub.StubApp;
import java.util.Locale;
import t.C1697j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final C1697j f6558a = new C1697j(0);

    /* renamed from: b, reason: collision with root package name */
    public static Locale f6559b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = Y3.c.a(context).f8739a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i3) {
        Resources resources = context.getResources();
        String a3 = a(context);
        if (i3 == 1) {
            return resources.getString(2131755058, a3);
        }
        if (i3 == 2) {
            return W3.b.c(context) ? resources.getString(2131755068) : resources.getString(2131755065, a3);
        }
        if (i3 == 3) {
            return resources.getString(2131755055, a3);
        }
        if (i3 == 5) {
            return d(context, StubApp.getString2(5986), a3);
        }
        if (i3 == 7) {
            return d(context, StubApp.getString2(5985), a3);
        }
        if (i3 == 9) {
            return resources.getString(2131755063, a3);
        }
        if (i3 == 20) {
            return d(context, StubApp.getString2(5984), a3);
        }
        switch (i3) {
            case 16:
                return d(context, StubApp.getString2(5983), a3);
            case 17:
                return d(context, StubApp.getString2(5982), a3);
            case 18:
                return resources.getString(2131755067, a3);
            default:
                return resources.getString(2131755062, a3);
        }
    }

    public static String c(Context context, int i3) {
        Resources resources = context.getResources();
        String string2 = StubApp.getString2(5987);
        switch (i3) {
            case 1:
                return resources.getString(2131755059);
            case 2:
                return resources.getString(2131755066);
            case 3:
                return resources.getString(2131755056);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e(string2, StubApp.getString2(6000));
                return e(context, StubApp.getString2(6001));
            case 7:
                Log.e(string2, StubApp.getString2(5998));
                return e(context, StubApp.getString2(5999));
            case 8:
                Log.e(string2, StubApp.getString2(5997));
                return null;
            case 9:
                Log.e(string2, StubApp.getString2(5996));
                return null;
            case 10:
                Log.e(string2, StubApp.getString2(5995));
                return null;
            case 11:
                Log.e(string2, StubApp.getString2(5994));
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Xa.h.B(i3, StubApp.getString2(5988), string2);
                return null;
            case 16:
                Log.e(string2, StubApp.getString2(5993));
                return null;
            case 17:
                Log.e(string2, StubApp.getString2(5991));
                return e(context, StubApp.getString2(5992));
            case 20:
                Log.e(string2, StubApp.getString2(5989));
                return e(context, StubApp.getString2(5990));
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e10 = e(context, str);
        if (e10 == null) {
            e10 = resources.getString(2131755062);
        }
        return String.format(resources.getConfiguration().locale, e10, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        String string2 = StubApp.getString2(6002);
        String string22 = StubApp.getString2(6003);
        C1697j c1697j = f6558a;
        synchronized (c1697j) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(f6559b)) {
                    c1697j.clear();
                    f6559b = locale;
                }
                String str2 = (String) c1697j.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i3 = com.google.android.gms.common.h.f11189e;
                try {
                    resources = context.getPackageManager().getResourcesForApplication(StubApp.getString2("0"));
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, StubApp.getString2("983"), StubApp.getString2("0"));
                    if (identifier == 0) {
                        Log.w(StubApp.getString2("5987"), string22.concat(str));
                    } else {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            f6558a.put(str, string);
                            return string;
                        }
                        Log.w(StubApp.getString2("5987"), string2.concat(str));
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
