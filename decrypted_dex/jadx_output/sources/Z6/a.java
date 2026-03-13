package Z6;

import Y6.m;
import Y6.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends d {

    /* renamed from: q, reason: collision with root package name */
    public static final k f8984q = new k(4);

    /* renamed from: p, reason: collision with root package name */
    public final n f8985p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m options, Function1 function1) {
        super(f8984q, options);
        Intrinsics.checkNotNullParameter(options, "options");
        if (function1 != null) {
            function1.invoke(this);
        }
        this.f8985p = n.f8793e;
    }

    @Override // Z6.d
    public final n l() {
        return this.f8985p;
    }
}
