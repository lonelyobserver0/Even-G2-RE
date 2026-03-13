package Qb;

import com.stub.StubApp;

/* renamed from: Qb.a0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0184a0 implements InterfaceC0212o0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5845a;

    public C0184a0(boolean z2) {
        this.f5845a = z2;
    }

    @Override // Qb.InterfaceC0212o0
    public final boolean a() {
        return this.f5845a;
    }

    @Override // Qb.InterfaceC0212o0
    public final G0 c() {
        return null;
    }

    public final String toString() {
        return Xa.h.s(new StringBuilder(StubApp.getString2(25496)), this.f5845a ? StubApp.getString2(25454) : StubApp.getString2(25455), '}');
    }
}
