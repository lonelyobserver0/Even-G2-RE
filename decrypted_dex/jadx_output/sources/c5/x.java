package c5;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f10964a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10965b;

    public x(String str, String str2) {
        this.f10964a = str;
        this.f10965b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.areEqual(this.f10964a, xVar.f10964a) && Intrinsics.areEqual(this.f10965b, xVar.f10965b);
    }

    public final int hashCode() {
        String str = this.f10964a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10965b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(9597));
        sb2.append(this.f10964a);
        sb2.append(StubApp.getString2(9598));
        return Xa.h.s(sb2, this.f10965b, ')');
    }
}
