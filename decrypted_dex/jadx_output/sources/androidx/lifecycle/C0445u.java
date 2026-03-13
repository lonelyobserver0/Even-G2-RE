package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0445u {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0439n f9921a;

    /* renamed from: b, reason: collision with root package name */
    public r f9922b;

    public final void a(InterfaceC0444t interfaceC0444t, EnumC0438m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        EnumC0439n a3 = event.a();
        EnumC0439n state1 = this.f9921a;
        Intrinsics.checkNotNullParameter(state1, "state1");
        if (a3.compareTo(state1) < 0) {
            state1 = a3;
        }
        this.f9921a = state1;
        Intrinsics.checkNotNull(interfaceC0444t);
        this.f9922b.h(interfaceC0444t, event);
        this.f9921a = a3;
    }
}
