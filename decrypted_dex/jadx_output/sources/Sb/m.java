package Sb;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final l f6715b = new l();

    /* renamed from: a, reason: collision with root package name */
    public final Object f6716a;

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return Intrinsics.areEqual(this.f6716a, ((m) obj).f6716a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f6716a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f6716a;
        if (obj instanceof k) {
            return ((k) obj).toString();
        }
        return StubApp.getString2(25654) + obj + ')';
    }
}
