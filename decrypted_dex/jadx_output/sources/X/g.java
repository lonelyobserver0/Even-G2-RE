package X;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f8230a;

    public g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f8230a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return Intrinsics.areEqual(this.f8230a, ((g) obj).f8230a);
    }

    public final int hashCode() {
        return this.f8230a.hashCode();
    }

    public final String toString() {
        return this.f8230a;
    }
}
