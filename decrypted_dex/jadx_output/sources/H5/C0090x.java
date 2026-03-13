package H5;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: H5.x, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0090x {

    /* renamed from: a, reason: collision with root package name */
    public final String f2923a;

    public C0090x(String str) {
        this.f2923a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0090x) && Intrinsics.areEqual(this.f2923a, ((C0090x) obj).f2923a);
    }

    public final int hashCode() {
        String str = this.f2923a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return Xa.h.s(new StringBuilder(StubApp.getString2(2684)), this.f2923a, ')');
    }
}
