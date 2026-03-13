package i;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.stub.StubApp;
import java.lang.ref.WeakReference;
import t.C1688a;
import t.C1693f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final J1.A f14609a = new J1.A(new T4.d(3));

    /* renamed from: b, reason: collision with root package name */
    public static final int f14610b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static J.e f14611c = null;

    /* renamed from: d, reason: collision with root package name */
    public static J.e f14612d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f14613e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f14614f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final C1693f f14615g = new C1693f(0);

    /* renamed from: h, reason: collision with root package name */
    public static final Object f14616h = new Object();
    public static final Object j = new Object();

    public static boolean c(Context context) {
        if (f14613e == null) {
            try {
                int i3 = AbstractServiceC1017A.f14501a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC1017A.class), z.a() | 128).metaData;
                if (bundle != null) {
                    f14613e = Boolean.valueOf(bundle.getBoolean(StubApp.getString2("18391")));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d(StubApp.getString2(18392), StubApp.getString2(18393));
                f14613e = Boolean.FALSE;
            }
        }
        return f14613e.booleanValue();
    }

    public static void f(v vVar) {
        synchronized (f14616h) {
            try {
                C1693f c1693f = f14615g;
                c1693f.getClass();
                C1688a c1688a = new C1688a(c1693f);
                while (c1688a.hasNext()) {
                    l lVar = (l) ((WeakReference) c1688a.next()).get();
                    if (lVar == vVar || lVar == null) {
                        c1688a.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i3);

    public abstract void i(int i3);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
