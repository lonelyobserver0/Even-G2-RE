package com.google.protobuf;

import com.stub.StubApp;

/* renamed from: com.google.protobuf.z, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0755z implements InterfaceC0728g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0755z f12250b = new C0755z(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12251a;

    public /* synthetic */ C0755z(int i3) {
        this.f12251a = i3;
    }

    @Override // com.google.protobuf.InterfaceC0728g0
    public final t0 a(Class cls) {
        switch (this.f12251a) {
            case 0:
                if (!F.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException(StubApp.getString2(12097).concat(cls.getName()));
                }
                try {
                    return (t0) F.getDefaultInstance(cls.asSubclass(F.class)).buildMessageInfo();
                } catch (Exception e10) {
                    throw new RuntimeException(StubApp.getString2(12096).concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException(StubApp.getString2(12095));
        }
    }

    @Override // com.google.protobuf.InterfaceC0728g0
    public final boolean b(Class cls) {
        switch (this.f12251a) {
            case 0:
                return F.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
