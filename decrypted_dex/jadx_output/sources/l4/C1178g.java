package l4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.stub.StubApp;
import java.lang.reflect.InvocationTargetException;

/* renamed from: l4.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1178g extends Mb.b {

    /* renamed from: b, reason: collision with root package name */
    public Boolean f16429b;

    /* renamed from: c, reason: collision with root package name */
    public String f16430c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1175f f16431d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f16432e;

    public final boolean l(String str) {
        return StubApp.getString2(878).equals(this.f16431d.d(str, StubApp.getString2(20446)));
    }

    public final boolean m(String str) {
        return StubApp.getString2(878).equals(this.f16431d.d(str, StubApp.getString2(20447)));
    }

    public final boolean n() {
        if (this.f16429b == null) {
            Boolean w10 = w(StubApp.getString2(20448));
            this.f16429b = w10;
            if (w10 == null) {
                this.f16429b = Boolean.FALSE;
            }
        }
        return this.f16429b.booleanValue() || !((C1200n0) this.f4728a).f16537b;
    }

    public final String o(String str) {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        try {
            String str2 = (String) Class.forName(StubApp.getString2("20449")).getMethod(StubApp.getString2("6443"), String.class, String.class).invoke(null, str, "");
            S3.D.h(str2);
            return str2;
        } catch (ClassNotFoundException e10) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16242f.c(e10, StubApp.getString2(20453));
            return "";
        } catch (IllegalAccessException e11) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16242f.c(e11, StubApp.getString2(20451));
            return "";
        } catch (NoSuchMethodException e12) {
            T t11 = c1200n0.f16541f;
            C1200n0.l(t11);
            t11.f16242f.c(e12, StubApp.getString2(20452));
            return "";
        } catch (InvocationTargetException e13) {
            T t12 = c1200n0.f16541f;
            C1200n0.l(t12);
            t12.f16242f.c(e13, StubApp.getString2(20450));
            return "";
        }
    }

    public final void p() {
        ((C1200n0) this.f4728a).getClass();
    }

    public final String q(String str, C1147C c1147c) {
        return TextUtils.isEmpty(str) ? (String) c1147c.a(null) : (String) c1147c.a(this.f16431d.d(str, c1147c.f15915a));
    }

    public final long r(String str, C1147C c1147c) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c1147c.a(null)).longValue();
        }
        String d8 = this.f16431d.d(str, c1147c.f15915a);
        if (TextUtils.isEmpty(d8)) {
            return ((Long) c1147c.a(null)).longValue();
        }
        try {
            return ((Long) c1147c.a(Long.valueOf(Long.parseLong(d8)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c1147c.a(null)).longValue();
        }
    }

    public final int s(String str, C1147C c1147c) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c1147c.a(null)).intValue();
        }
        String d8 = this.f16431d.d(str, c1147c.f15915a);
        if (TextUtils.isEmpty(d8)) {
            return ((Integer) c1147c.a(null)).intValue();
        }
        try {
            return ((Integer) c1147c.a(Integer.valueOf(Integer.parseInt(d8)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c1147c.a(null)).intValue();
        }
    }

    public final double t(String str, C1147C c1147c) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c1147c.a(null)).doubleValue();
        }
        String d8 = this.f16431d.d(str, c1147c.f15915a);
        if (TextUtils.isEmpty(d8)) {
            return ((Double) c1147c.a(null)).doubleValue();
        }
        try {
            return ((Double) c1147c.a(Double.valueOf(Double.parseDouble(d8)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c1147c.a(null)).doubleValue();
        }
    }

    public final boolean u(String str, C1147C c1147c) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c1147c.a(null)).booleanValue();
        }
        String d8 = this.f16431d.d(str, c1147c.f15915a);
        return TextUtils.isEmpty(d8) ? ((Boolean) c1147c.a(null)).booleanValue() : ((Boolean) c1147c.a(Boolean.valueOf(StubApp.getString2(878).equals(d8)))).booleanValue();
    }

    public final Bundle v() {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        try {
            Context context = c1200n0.f16536a;
            Context context2 = c1200n0.f16536a;
            PackageManager packageManager = context.getPackageManager();
            T t3 = c1200n0.f16541f;
            if (packageManager == null) {
                C1200n0.l(t3);
                t3.f16242f.b(StubApp.getString2("20454"));
                return null;
            }
            ApplicationInfo a3 = Y3.c.a(context2).a(128, context2.getPackageName());
            if (a3 != null) {
                return a3.metaData;
            }
            C1200n0.l(t3);
            t3.f16242f.b(StubApp.getString2("20455"));
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16242f.c(e10, StubApp.getString2(20456));
            return null;
        }
    }

    public final Boolean w(String str) {
        S3.D.e(str);
        Bundle v2 = v();
        if (v2 != null) {
            if (v2.containsKey(str)) {
                return Boolean.valueOf(v2.getBoolean(str));
            }
            return null;
        }
        T t3 = ((C1200n0) this.f4728a).f16541f;
        C1200n0.l(t3);
        t3.f16242f.b(StubApp.getString2(5191));
        return null;
    }

    public final boolean x() {
        ((C1200n0) this.f4728a).getClass();
        Boolean w10 = w(StubApp.getString2(20457));
        return w10 != null && w10.booleanValue();
    }

    public final boolean y() {
        Boolean w10 = w(StubApp.getString2(20458));
        return w10 == null || w10.booleanValue();
    }

    public final EnumC1218w0 z(String str, boolean z2) {
        Object obj;
        S3.D.e(str);
        Bundle v2 = v();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (v2 == null) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16242f.b(StubApp.getString2(5191));
            obj = null;
        } else {
            obj = v2.get(str);
        }
        EnumC1218w0 enumC1218w0 = EnumC1218w0.f16645b;
        if (obj == null) {
            return enumC1218w0;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC1218w0.f16648e;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC1218w0.f16647d;
        }
        if (z2 && StubApp.getString2(20459).equals(obj)) {
            return EnumC1218w0.f16646c;
        }
        T t10 = c1200n0.f16541f;
        C1200n0.l(t10);
        t10.j.c(str, StubApp.getString2(20460));
        return enumC1218w0;
    }
}
