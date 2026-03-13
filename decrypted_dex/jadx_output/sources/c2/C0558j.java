package c2;

import com.stub.StubApp;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c2.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0558j {

    /* renamed from: a, reason: collision with root package name */
    public final List f10804a;

    public C0558j(List displayFeatures) {
        Intrinsics.checkNotNullParameter(displayFeatures, "displayFeatures");
        this.f10804a = displayFeatures;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(C0558j.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f10804a, ((C0558j) obj).f10804a);
    }

    public final int hashCode() {
        return this.f10804a.hashCode();
    }

    public final String toString() {
        String joinToString$default;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.f10804a, StubApp.getString2(81), StubApp.getString2(9400), StubApp.getString2(7603), 0, null, null, 56, null);
        return joinToString$default;
    }
}
