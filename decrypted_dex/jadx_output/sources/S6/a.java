package S6;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6593a = new a();

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        ((a) obj).getClass();
        return Intrinsics.areEqual("center", "center");
    }

    @Override // S6.c
    public final String getValue() {
        return StubApp.getString2(6013);
    }

    public final int hashCode() {
        return -1364013995;
    }

    public final String toString() {
        return StubApp.getString2(6014);
    }
}
