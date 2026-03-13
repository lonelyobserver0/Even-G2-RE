package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Q {

    /* renamed from: c, reason: collision with root package name */
    public static final Q f9734c = new Q();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f9736b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final D f9735a = new D();

    public final U a(Class cls) {
        U x7;
        Class cls2;
        AbstractC0422w.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f9736b;
        U u2 = (U) concurrentHashMap.get(cls);
        if (u2 != null) {
            return u2;
        }
        D d8 = this.f9735a;
        d8.getClass();
        Class cls3 = V.f9744a;
        if (!AbstractC0420u.class.isAssignableFrom(cls) && (cls2 = V.f9744a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        T a3 = ((C) d8.f9705a).a(cls);
        if ((a3.f9743d & 2) == 2) {
            boolean isAssignableFrom = AbstractC0420u.class.isAssignableFrom(cls);
            AbstractC0420u abstractC0420u = a3.f9740a;
            if (isAssignableFrom) {
                x7 = new M(V.f9746c, AbstractC0415o.f9821a, abstractC0420u);
            } else {
                c0 c0Var = V.f9745b;
                C0414n c0414n = AbstractC0415o.f9822b;
                if (c0414n == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                x7 = new M(c0Var, c0414n, abstractC0420u);
            }
        } else if (AbstractC0420u.class.isAssignableFrom(cls)) {
            C0414n c0414n2 = null;
            N n10 = O.f9733b;
            A a9 = B.f9702b;
            c0 c0Var2 = V.f9746c;
            if (AbstractC1856e.c(a3.a()) != 1) {
                c0414n2 = AbstractC0415o.f9821a;
            }
            C0414n c0414n3 = c0414n2;
            H h2 = I.f9713b;
            int[] iArr = L.f9715n;
            if (!(a3 instanceof T)) {
                a3.getClass();
                throw new ClassCastException();
            }
            x7 = L.x(a3, n10, a9, c0Var2, c0414n3, h2);
        } else {
            C0414n c0414n4 = null;
            N n11 = O.f9732a;
            A a10 = B.f9701a;
            c0 c0Var3 = V.f9745b;
            if (AbstractC1856e.c(a3.a()) != 1 && (c0414n4 = AbstractC0415o.f9822b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C0414n c0414n5 = c0414n4;
            H h4 = I.f9712a;
            int[] iArr2 = L.f9715n;
            if (!(a3 instanceof T)) {
                a3.getClass();
                throw new ClassCastException();
            }
            x7 = L.x(a3, n11, a10, c0Var3, c0414n5, h4);
        }
        U u10 = (U) concurrentHashMap.putIfAbsent(cls, x7);
        return u10 != null ? u10 : x7;
    }
}
