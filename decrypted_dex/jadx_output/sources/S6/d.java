package S6;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final d f6595a = new d();

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        ((d) obj).getClass();
        return Intrinsics.areEqual("round", "round");
    }

    @Override // S6.c
    public final String getValue() {
        return StubApp.getString2(6017);
    }

    public final int hashCode() {
        return 108704142;
    }

    public final String toString() {
        return StubApp.getString2(6018);
    }
}
