package Zb;

import Qb.L;
import i8.C1064b;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import x9.t;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class d extends Lambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9206b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, int i3) {
        super(3);
        this.f9205a = i3;
        this.f9206b = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f9205a) {
            case 0:
                return new E1.b(5, (e) this.f9206b, obj2);
            default:
                int intValue = ((Number) obj).intValue();
                List segments = (List) obj2;
                y9.d colors = (y9.d) obj3;
                Intrinsics.checkNotNullParameter(segments, "segments");
                Intrinsics.checkNotNullParameter(colors, "colors");
                C1064b f10 = new C1064b(intValue, colors);
                Vb.f scope = ((t) this.f9206b).f23064b;
                Intrinsics.checkNotNullParameter(segments, "<this>");
                Intrinsics.checkNotNullParameter(f10, "f");
                Intrinsics.checkNotNullParameter(scope, "scope");
                return (List) L.k(new D9.b(segments, scope, f10, null));
        }
    }
}
