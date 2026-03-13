package J6;

import Xa.h;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3412a;

    public b(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f3412a = tag;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f3412a, ((b) obj).f3412a);
    }

    public final int hashCode() {
        return this.f3412a.hashCode();
    }

    public final String toString() {
        return h.s(new StringBuilder(StubApp.getString2(3023)), this.f3412a, ')');
    }
}
