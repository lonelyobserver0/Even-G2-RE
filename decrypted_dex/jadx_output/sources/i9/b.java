package i9;

import R8.C0250h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b implements k9.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f14942a;

    public b(d dVar) {
        this.f14942a = dVar;
    }

    @Override // k9.d
    public final void a(C0250h animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        d dVar = this.f14942a;
        if (dVar.f14954e == animation) {
            dVar.f14954e = null;
        }
    }
}
