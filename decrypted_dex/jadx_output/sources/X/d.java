package X;

import T.InterfaceC0294j;
import Tb.InterfaceC0327h;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements InterfaceC0294j {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0294j f8226a;

    public d(InterfaceC0294j delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f8226a = delegate;
    }

    @Override // T.InterfaceC0294j
    public final Object a(Function2 function2, ContinuationImpl continuationImpl) {
        return this.f8226a.a(new c(function2, null), continuationImpl);
    }

    @Override // T.InterfaceC0294j
    public final InterfaceC0327h getData() {
        return this.f8226a.getData();
    }
}
