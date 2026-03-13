package Lc;

import Kc.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f4406a = new f(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h entry = (h) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        y yVar = g.f4407e;
        return Boolean.valueOf(C2.i.s(entry.f4411a));
    }
}
