package Z6;

import Y6.m;
import Y6.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends d {

    /* renamed from: p, reason: collision with root package name */
    public final n f9008p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m options, Function1 function1) {
        super(l.f9017b, options);
        Intrinsics.checkNotNullParameter(options, "options");
        if (function1 != null) {
            function1.invoke(this);
        }
        this.f9008p = n.f8794f;
    }

    @Override // Z6.d
    public final n l() {
        return this.f9008p;
    }
}
