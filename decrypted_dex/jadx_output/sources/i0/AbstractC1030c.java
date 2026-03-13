package i0;

import com.stub.StubApp;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i0.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1030c {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f14703a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC1030c) && Intrinsics.areEqual(this.f14703a, ((AbstractC1030c) obj).f14703a);
    }

    public final int hashCode() {
        return this.f14703a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(18449) + this.f14703a + ')';
    }
}
