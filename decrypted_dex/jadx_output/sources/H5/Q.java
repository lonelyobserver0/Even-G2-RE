package H5;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import f4.C0879c;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import r5.C1571d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f2792a = new Q();

    /* renamed from: b, reason: collision with root package name */
    public static final C0879c f2793b;

    static {
        C1571d c1571d = new C1571d();
        c1571d.a(P.class, C0074g.f2868a);
        c1571d.a(X.class, C0075h.f2873a);
        c1571d.a(C0078k.class, C0072e.f2858a);
        c1571d.a(C0069b.class, C0071d.f2848a);
        c1571d.a(C0068a.class, C0070c.f2840a);
        c1571d.a(D.class, C0073f.f2862a);
        c1571d.f20352d = true;
        C0879c c0879c = new C0879c(c1571d);
        Intrinsics.checkNotNullExpressionValue(c0879c, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f2793b = c0879c;
    }

    public static C0069b a(R4.h firebaseApp) {
        Object obj;
        String processName;
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        firebaseApp.a();
        Context context = firebaseApp.f6193a;
        Intrinsics.checkNotNullExpressionValue(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = String.valueOf(packageInfo.getLongVersionCode());
        firebaseApp.a();
        String str = firebaseApp.f6195c.f6204b;
        Intrinsics.checkNotNullExpressionValue(str, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = valueOf;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        firebaseApp.a();
        Intrinsics.checkNotNullExpressionValue(context, "firebaseApp.applicationContext");
        Intrinsics.checkNotNullParameter(context, "context");
        int myPid = Process.myPid();
        Iterator it = AbstractC0088v.a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((D) obj).f2758b == myPid) {
                break;
            }
        }
        D d8 = (D) obj;
        if (d8 == null) {
            if (Build.VERSION.SDK_INT > 33) {
                processName = Process.myProcessName();
                Intrinsics.checkNotNullExpressionValue(processName, "myProcessName()");
            } else {
                processName = Application.getProcessName();
                if (processName == null && (processName = W3.b.a()) == null) {
                    processName = "";
                }
            }
            d8 = new D(processName, myPid, 0, false);
        }
        firebaseApp.a();
        Intrinsics.checkNotNullExpressionValue(context, "firebaseApp.applicationContext");
        return new C0069b(str, new C0068a(packageName, str2, valueOf, d8, AbstractC0088v.a(context)));
    }
}
