package V;

import Kc.o;
import Kc.y;
import T.d0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f7639a = new c(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        y path = (y) obj;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter((o) obj2, "<anonymous parameter 1>");
        Intrinsics.checkNotNullParameter(path, "path");
        String filePath = C2.i.v(path.f3859a.s(), true).f3859a.s();
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new d0(filePath);
    }
}
