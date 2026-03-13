package Z6;

import Y6.m;
import Y6.n;
import Y6.q;
import com.mapbox.maps.EdgeInsets;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends d {

    /* renamed from: p, reason: collision with root package name */
    public final n f9010p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m options, Function1 function1) {
        super(k.f9011b, options);
        Intrinsics.checkNotNullParameter(options, "options");
        EdgeInsets edgeInsets = l.f9016a;
        this.f9010p = n.f8790b;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    @Override // Z6.d
    public final n l() {
        return this.f9010p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q evaluator, m options, Function1 function1) {
        super(evaluator, options);
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f9010p = n.f8790b;
        if (function1 != null) {
            function1.invoke(this);
        }
    }
}
