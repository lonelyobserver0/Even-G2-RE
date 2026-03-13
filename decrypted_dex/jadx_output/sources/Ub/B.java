package Ub;

import Tb.P;
import Tb.Q;
import Tb.Z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class B extends P implements Z {
    public final void w(int i3) {
        synchronized (this) {
            Object[] objArr = this.f7306h;
            Intrinsics.checkNotNull(objArr);
            o(Integer.valueOf(((Number) Q.b(objArr, (this.j + ((int) ((m() + this.f7308l) - this.j))) - 1)).intValue() + i3));
        }
    }
}
