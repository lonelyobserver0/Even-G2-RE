package Y6;

import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f8786a;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f8787b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8788c;

    public m(Object[] objArr, Serializable serializable, String str) {
        this.f8786a = objArr;
        this.f8787b = serializable;
        this.f8788c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(m.class, obj.getClass())) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(mVar.f8788c, this.f8788c) && Arrays.equals(mVar.f8786a, this.f8786a) && Intrinsics.areEqual(mVar.f8787b, this.f8787b);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f8786a) * 31;
        String str = this.f8788c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Serializable serializable = this.f8787b;
        return hashCode2 + (serializable != null ? serializable.hashCode() : 0);
    }
}
