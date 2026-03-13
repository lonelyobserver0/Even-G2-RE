package l4;

import android.os.Bundle;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import w.AbstractC1856e;

/* renamed from: l4.O, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1159O {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f16199b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f16200c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f16201d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final C1170d0 f16202a;

    public C1159O(C1170d0 c1170d0) {
        this.f16202a = c1170d0;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        S3.D.h(atomicReference);
        S3.D.b(strArr.length == strArr2.length);
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (Objects.equals(str, strArr[i3])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i3];
                        if (str2 == null) {
                            str2 = strArr2[i3] + StubApp.getString2("2830") + strArr[i3] + StubApp.getString2("74");
                            strArr3[i3] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f16202a.a() ? str : g(str, A0.f15901c, A0.f15899a, f16199b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f16202a.a() ? str : g(str, A0.f15904f, A0.f15903e, f16200c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f16202a.a() ? str : str.startsWith(StubApp.getString2(20052)) ? E1.a.k(StubApp.getString2(20053), str, StubApp.getString2(74)) : g(str, A0.j, A0.f15907i, f16201d);
    }

    public final String d(C1215v c1215v) {
        C1170d0 c1170d0 = this.f16202a;
        if (!c1170d0.a()) {
            return c1215v.toString();
        }
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(20054));
        sb2.append(c1215v.f16640c);
        sb2.append(StubApp.getString2(17735));
        sb2.append(a(c1215v.f16638a));
        sb2.append(StubApp.getString2(20055));
        C1213u c1213u = c1215v.f16639b;
        sb2.append(c1213u == null ? null : !c1170d0.a() ? c1213u.f16633a.toString() : e(c1213u.i()));
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f16202a.a()) {
            return bundle.toString();
        }
        StringBuilder b2 = AbstractC1856e.b(StubApp.getString2(20056));
        for (String str : bundle.keySet()) {
            if (b2.length() != 8) {
                b2.append(StubApp.getString2(81));
            }
            b2.append(b(str));
            b2.append(StubApp.getString2(2359));
            Object obj = bundle.get(str);
            b2.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        b2.append(StubApp.getString2(4985));
        return b2.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return StubApp.getString2(11096);
        }
        StringBuilder b2 = AbstractC1856e.b(StubApp.getString2(1557));
        for (Object obj : objArr) {
            String e10 = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (e10 != null) {
                if (b2.length() != 1) {
                    b2.append(StubApp.getString2(81));
                }
                b2.append(e10);
            }
        }
        b2.append(StubApp.getString2(511));
        return b2.toString();
    }
}
