package Qb;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Qb.w0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class C0227w0 extends D0 implements r {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0227w0(InterfaceC0221t0 interfaceC0221t0) {
        super(true);
        D0 i3;
        boolean z2 = true;
        H(interfaceC0221t0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D0.f5810b;
        InterfaceC0209n interfaceC0209n = (InterfaceC0209n) atomicReferenceFieldUpdater.get(this);
        C0211o c0211o = interfaceC0209n instanceof C0211o ? (C0211o) interfaceC0209n : null;
        if (c0211o != null && (i3 = c0211o.i()) != null) {
            while (!i3.B()) {
                InterfaceC0209n interfaceC0209n2 = (InterfaceC0209n) atomicReferenceFieldUpdater.get(i3);
                C0211o c0211o2 = interfaceC0209n2 instanceof C0211o ? (C0211o) interfaceC0209n2 : null;
                if (c0211o2 != null && (i3 = c0211o2.i()) != null) {
                }
            }
            this.f5897c = z2;
        }
        z2 = false;
        this.f5897c = z2;
    }

    @Override // Qb.D0
    public final boolean B() {
        return this.f5897c;
    }

    @Override // Qb.D0
    public final boolean C() {
        return true;
    }
}
