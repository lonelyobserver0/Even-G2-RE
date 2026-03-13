package l4;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16226a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f16227b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16228c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16229d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f16230e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16231f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f16232g;

    public /* synthetic */ Q(String str, U u2, int i3, IOException iOException, byte[] bArr, Map map) {
        S3.D.h(u2);
        this.f16229d = u2;
        this.f16227b = i3;
        this.f16230e = iOException;
        this.f16231f = bArr;
        this.f16228c = str;
        this.f16232g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16226a) {
            case 0:
                T t3 = (T) this.f16232g;
                C1164b0 c1164b0 = ((C1200n0) t3.f4728a).f16540e;
                C1200n0.j(c1164b0);
                if (!c1164b0.f16634b) {
                    Log.println(6, t3.u(), StubApp.getString2(20148));
                    return;
                }
                if (t3.f16239c == 0) {
                    C1178g c1178g = ((C1200n0) t3.f4728a).f16539d;
                    if (c1178g.f16432e == null) {
                        synchronized (c1178g) {
                            try {
                                if (c1178g.f16432e == null) {
                                    C1200n0 c1200n0 = (C1200n0) c1178g.f4728a;
                                    ApplicationInfo applicationInfo = c1200n0.f16536a.getApplicationInfo();
                                    String a3 = W3.b.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        c1178g.f16432e = Boolean.valueOf(str != null && str.equals(a3));
                                    }
                                    if (c1178g.f16432e == null) {
                                        c1178g.f16432e = Boolean.TRUE;
                                        T t10 = c1200n0.f16541f;
                                        C1200n0.l(t10);
                                        t10.f16242f.b(StubApp.getString2("20146"));
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (c1178g.f16432e.booleanValue()) {
                        t3.f16239c = 'C';
                    } else {
                        t3.f16239c = 'c';
                    }
                }
                if (t3.f16240d < 0) {
                    ((C1200n0) t3.f4728a).f16539d.p();
                    t3.f16240d = 130000L;
                }
                int i3 = this.f16227b;
                char c10 = t3.f16239c;
                long j = t3.f16240d;
                String str2 = this.f16228c;
                Object obj = this.f16229d;
                Object obj2 = this.f16230e;
                Object obj3 = this.f16231f;
                char charAt = StubApp.getString2(20147).charAt(i3);
                String v2 = T.v(true, str2, obj, obj2, obj3);
                StringBuilder sb2 = new StringBuilder(i2.u.C(String.valueOf(charAt).length() + 1, String.valueOf(c10).length(), String.valueOf(j).length(), 1) + v2.length());
                sb2.append(StubApp.getString2(4967));
                sb2.append(charAt);
                sb2.append(c10);
                sb2.append(j);
                sb2.append(StubApp.getString2(478));
                sb2.append(v2);
                String sb3 = sb2.toString();
                if (sb3.length() > 1024) {
                    sb3 = str2.substring(0, 1024);
                }
                R8.B b2 = c1164b0.f16370e;
                if (b2 != null) {
                    C1164b0 c1164b02 = (C1164b0) b2.f6255e;
                    c1164b02.k();
                    if (((C1164b0) b2.f6255e).o().getLong((String) b2.f6252b, 0L) == 0) {
                        b2.c();
                    }
                    if (sb3 == null) {
                        sb3 = "";
                    }
                    SharedPreferences o5 = c1164b02.o();
                    String str3 = (String) b2.f6253c;
                    long j3 = o5.getLong(str3, 0L);
                    String str4 = (String) b2.f6254d;
                    if (j3 <= 0) {
                        SharedPreferences.Editor edit = c1164b02.o().edit();
                        edit.putString(str4, sb3);
                        edit.putLong(str3, 1L);
                        edit.apply();
                        return;
                    }
                    K1 k12 = ((C1200n0) c1164b02.f4728a).j;
                    C1200n0.j(k12);
                    long nextLong = k12.h0().nextLong() & LongCompanionObject.MAX_VALUE;
                    long j10 = j3 + 1;
                    long j11 = LongCompanionObject.MAX_VALUE / j10;
                    SharedPreferences.Editor edit2 = c1164b02.o().edit();
                    if (nextLong < j11) {
                        edit2.putString(str4, sb3);
                    }
                    edit2.putLong(str3, j10);
                    edit2.apply();
                    return;
                }
                return;
            default:
                ((U) this.f16229d).d(this.f16228c, this.f16227b, (IOException) this.f16230e, (byte[]) this.f16231f, (Map) this.f16232g);
                return;
        }
    }

    public Q(T t3, int i3, String str, Object obj, Object obj2, Object obj3) {
        this.f16227b = i3;
        this.f16228c = str;
        this.f16229d = obj;
        this.f16230e = obj2;
        this.f16231f = obj3;
        Objects.requireNonNull(t3);
        this.f16232g = t3;
    }
}
