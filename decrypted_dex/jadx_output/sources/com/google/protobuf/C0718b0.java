package com.google.protobuf;

import com.stub.StubApp;

/* renamed from: com.google.protobuf.b0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0718b0 implements InterfaceC0728g0 {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0728g0[] f12141a;

    @Override // com.google.protobuf.InterfaceC0728g0
    public final t0 a(Class cls) {
        for (InterfaceC0728g0 interfaceC0728g0 : this.f12141a) {
            if (interfaceC0728g0.b(cls)) {
                return interfaceC0728g0.a(cls);
            }
        }
        throw new UnsupportedOperationException(StubApp.getString2(12321).concat(cls.getName()));
    }

    @Override // com.google.protobuf.InterfaceC0728g0
    public final boolean b(Class cls) {
        for (InterfaceC0728g0 interfaceC0728g0 : this.f12141a) {
            if (interfaceC0728g0.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
