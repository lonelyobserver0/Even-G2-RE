package U;

import T.C0286b;
import T.InterfaceC0287c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements InterfaceC0287c {

    /* renamed from: a, reason: collision with root package name */
    public final Lambda f7426a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Function1 produceNewData) {
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.f7426a = (Lambda) produceNewData;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // T.InterfaceC0287c
    public final Object j(C0286b c0286b) {
        return this.f7426a.invoke(c0286b);
    }
}
