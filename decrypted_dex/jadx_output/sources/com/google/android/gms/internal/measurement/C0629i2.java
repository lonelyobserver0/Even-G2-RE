package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* renamed from: com.google.android.gms.internal.measurement.i2, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0629i2 implements C2 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0629i2 f11586b = new C0629i2(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11587a;

    public /* synthetic */ C0629i2(int i3) {
        this.f11587a = i3;
    }

    public static final A2 c(Object obj, Object obj2) {
        A2 a22 = (A2) obj;
        A2 a23 = (A2) obj2;
        if (!a23.isEmpty()) {
            if (!a22.f11231a) {
                a22 = a22.a();
            }
            a22.c();
            if (!a23.isEmpty()) {
                a22.putAll(a23);
            }
        }
        return a22;
    }

    @Override // com.google.android.gms.internal.measurement.C2
    public boolean a(Class cls) {
        switch (this.f11587a) {
            case 0:
                return AbstractC0639k2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.C2
    public K2 b(Class cls) {
        switch (this.f11587a) {
            case 0:
                if (!AbstractC0639k2.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException(StubApp.getString2(12097).concat(cls.getName()));
                }
                try {
                    return (K2) AbstractC0639k2.l(cls.asSubclass(AbstractC0639k2.class)).o(3);
                } catch (Exception e10) {
                    throw new RuntimeException(StubApp.getString2(12096).concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException(StubApp.getString2(12095));
        }
    }
}
