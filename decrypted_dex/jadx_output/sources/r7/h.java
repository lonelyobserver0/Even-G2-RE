package r7;

import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public float f20402a;

    /* renamed from: b, reason: collision with root package name */
    public float f20403b;

    /* renamed from: c, reason: collision with root package name */
    public int f20404c;

    /* renamed from: d, reason: collision with root package name */
    public List f20405d;

    /* renamed from: e, reason: collision with root package name */
    public List f20406e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f20402a, hVar.f20402a) == 0 && Float.compare(this.f20403b, hVar.f20403b) == 0 && this.f20404c == hVar.f20404c && Intrinsics.areEqual(this.f20405d, hVar.f20405d) && Intrinsics.areEqual(this.f20406e, hVar.f20406e);
    }

    public final int hashCode() {
        return this.f20406e.hashCode() + E1.a.g(E1.a.e(this.f20404c, (Float.hashCode(this.f20403b) + (Float.hashCode(this.f20402a) * 31)) * 31, 31), 31, this.f20405d);
    }

    public final String toString() {
        return StubApp.getString2(22741) + this.f20402a + StubApp.getString2(22742) + this.f20403b + StubApp.getString2(22743) + this.f20404c + StubApp.getString2(22744) + this.f20405d + StubApp.getString2(22745) + this.f20406e + ')';
    }
}
