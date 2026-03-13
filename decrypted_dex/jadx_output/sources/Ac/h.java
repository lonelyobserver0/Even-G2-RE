package Ac;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class h extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final Object f332a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j referent, Object obj) {
        super(referent);
        Intrinsics.checkNotNullParameter(referent, "referent");
        this.f332a = obj;
    }
}
