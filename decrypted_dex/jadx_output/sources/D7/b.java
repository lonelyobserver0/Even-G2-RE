package D7;

import Xa.h;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1493a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1494b;

    public b(String str, String str2) {
        this.f1493a = str;
        this.f1494b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f1493a, bVar.f1493a) && Intrinsics.areEqual(this.f1494b, bVar.f1494b);
    }

    public final int hashCode() {
        String str = this.f1493a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1494b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1525));
        sb2.append(this.f1493a);
        sb2.append(StubApp.getString2(1526));
        return h.s(sb2, this.f1494b, ')');
    }
}
