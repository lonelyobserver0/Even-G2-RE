package Z6;

import Y6.m;
import Y6.n;
import com.mapbox.maps.EdgeInsets;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends d {

    /* renamed from: p, reason: collision with root package name */
    public final n f9009p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m options, Function1 function1) {
        super(k.f9011b, options);
        Intrinsics.checkNotNullParameter(options, "options");
        EdgeInsets edgeInsets = l.f9016a;
        if (function1 != null) {
            function1.invoke(this);
        }
        this.f9009p = n.f8792d;
    }

    @Override // Z6.d
    public final n l() {
        return this.f9009p;
    }
}
