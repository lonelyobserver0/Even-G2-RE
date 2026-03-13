package Jc;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3507a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f3508b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3509c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f3510d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3511e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3512f;

    public g(boolean z2, Integer num, boolean z10, Integer num2, boolean z11, boolean z12) {
        this.f3507a = z2;
        this.f3508b = num;
        this.f3509c = z10;
        this.f3510d = num2;
        this.f3511e = z11;
        this.f3512f = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f3507a == gVar.f3507a && Intrinsics.areEqual(this.f3508b, gVar.f3508b) && this.f3509c == gVar.f3509c && Intrinsics.areEqual(this.f3510d, gVar.f3510d) && this.f3511e == gVar.f3511e && this.f3512f == gVar.f3512f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z2 = this.f3507a;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i10 = i3 * 31;
        Integer num = this.f3508b;
        int hashCode = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z10 = this.f3509c;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        Integer num2 = this.f3510d;
        int hashCode2 = (i12 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z11 = this.f3511e;
        int i13 = z11;
        if (z11 != 0) {
            i13 = 1;
        }
        int i14 = (hashCode2 + i13) * 31;
        boolean z12 = this.f3512f;
        return i14 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final String toString() {
        return StubApp.getString2(25302) + this.f3507a + StubApp.getString2(25303) + this.f3508b + StubApp.getString2(25304) + this.f3509c + StubApp.getString2(25305) + this.f3510d + StubApp.getString2(25306) + this.f3511e + StubApp.getString2(25307) + this.f3512f + ')';
    }
}
