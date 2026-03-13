package Xb;

import Vb.AbstractC0355a;
import Vb.x;
import com.stub.StubApp;
import i2.o;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8636a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f8637b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8638c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8639d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f8640e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f8641f;

    /* renamed from: g, reason: collision with root package name */
    public static final o f8642g;

    /* renamed from: h, reason: collision with root package name */
    public static final o f8643h;

    static {
        String str;
        String string2 = StubApp.getString2(25941);
        int i3 = x.f7974a;
        try {
            str = System.getProperty(string2);
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = StubApp.getString2(25942);
        }
        f8636a = str;
        f8637b = AbstractC0355a.h(StubApp.getString2(25943), 100000L, 1L, LongCompanionObject.MAX_VALUE);
        f8638c = AbstractC0355a.i(RangesKt.coerceAtLeast(x.f7974a, 2), 8, StubApp.getString2(25944));
        f8639d = AbstractC0355a.i(2097150, 4, StubApp.getString2(25945));
        f8640e = TimeUnit.SECONDS.toNanos(AbstractC0355a.h(StubApp.getString2(25946), 60L, 1L, LongCompanionObject.MAX_VALUE));
        f8641f = f.f8631a;
        f8642g = new o(0);
        f8643h = new o(1);
    }
}
