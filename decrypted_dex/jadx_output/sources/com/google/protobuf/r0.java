package com.google.protobuf;

import com.stub.StubApp;
import java.util.concurrent.ConcurrentHashMap;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r0 {

    /* renamed from: c, reason: collision with root package name */
    public static final r0 f12216c = new r0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f12218b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C0720c0 f12217a = new C0720c0();

    public final u0 a(Class cls) {
        u0 B7;
        Class cls2;
        Q.a(cls, StubApp.getString2(1413));
        ConcurrentHashMap concurrentHashMap = this.f12218b;
        u0 u0Var = (u0) concurrentHashMap.get(cls);
        if (u0Var != null) {
            return u0Var;
        }
        C0720c0 c0720c0 = this.f12217a;
        c0720c0.getClass();
        Class cls3 = v0.f12230a;
        if (!F.class.isAssignableFrom(cls) && (cls2 = v0.f12230a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(StubApp.getString2(12658));
        }
        t0 a3 = ((C0718b0) c0720c0.f12143a).a(cls);
        int i3 = a3.f12226d & 2;
        String string2 = StubApp.getString2(12659);
        if (i3 == 2) {
            boolean isAssignableFrom = F.class.isAssignableFrom(cls);
            InterfaceC0732i0 interfaceC0732i0 = a3.f12223a;
            if (isAssignableFrom) {
                B7 = new C0740m0(v0.f12232c, AbstractC0752w.f12233a, interfaceC0732i0);
            } else {
                y0 y0Var = v0.f12231b;
                C0751v c0751v = AbstractC0752w.f12234b;
                if (c0751v == null) {
                    throw new IllegalStateException(string2);
                }
                B7 = new C0740m0(y0Var, c0751v, interfaceC0732i0);
            }
        } else if (F.class.isAssignableFrom(cls)) {
            B7 = AbstractC1856e.c(a3.a()) != 1 ? C0738l0.B(a3, AbstractC0744o0.f12206b, Z.f12136b, v0.f12232c, AbstractC0752w.f12233a, AbstractC0726f0.f12153b) : C0738l0.B(a3, AbstractC0744o0.f12206b, Z.f12136b, v0.f12232c, null, AbstractC0726f0.f12153b);
        } else if (AbstractC1856e.c(a3.a()) != 1) {
            C0742n0 c0742n0 = AbstractC0744o0.f12205a;
            X x7 = Z.f12135a;
            y0 y0Var2 = v0.f12231b;
            C0751v c0751v2 = AbstractC0752w.f12234b;
            if (c0751v2 == null) {
                throw new IllegalStateException(string2);
            }
            B7 = C0738l0.B(a3, c0742n0, x7, y0Var2, c0751v2, AbstractC0726f0.f12152a);
        } else {
            B7 = C0738l0.B(a3, AbstractC0744o0.f12205a, Z.f12135a, v0.f12231b, null, AbstractC0726f0.f12152a);
        }
        u0 u0Var2 = (u0) concurrentHashMap.putIfAbsent(cls, B7);
        return u0Var2 != null ? u0Var2 : B7;
    }

    public final u0 b(Object obj) {
        return a(obj.getClass());
    }
}
