package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class I2 {

    /* renamed from: c, reason: collision with root package name */
    public static final I2 f11287c = new I2();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11289b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C0708y2 f11288a = new C0708y2(0);

    public final L2 a(Class cls) {
        L2 u2;
        Charset charset = AbstractC0673r2.f11652a;
        if (cls == null) {
            throw new NullPointerException(StubApp.getString2(1413));
        }
        ConcurrentHashMap concurrentHashMap = this.f11289b;
        L2 l22 = (L2) concurrentHashMap.get(cls);
        if (l22 != null) {
            return l22;
        }
        C0708y2 c0708y2 = this.f11288a;
        c0708y2.getClass();
        C0629i2 c0629i2 = M2.f11311a;
        AbstractC0639k2.class.isAssignableFrom(cls);
        K2 b2 = ((C0708y2) c0708y2.f11771a).b(cls);
        if ((b2.f11304d & 2) == 2) {
            C0629i2 c0629i22 = M2.f11311a;
            C0629i2 c0629i23 = AbstractC0609e2.f11482a;
            u2 = new F2(c0629i22, b2.f11301a);
        } else {
            int i3 = G2.f11274a;
            int i10 = AbstractC0693v2.f11681a;
            C0629i2 c0629i24 = M2.f11311a;
            C0629i2 c0629i25 = b2.a() + (-1) != 1 ? AbstractC0609e2.f11482a : null;
            int i11 = B2.f11235a;
            u2 = E2.u(b2, c0629i24, c0629i25);
        }
        L2 l23 = (L2) concurrentHashMap.putIfAbsent(cls, u2);
        return l23 != null ? l23 : u2;
    }
}
