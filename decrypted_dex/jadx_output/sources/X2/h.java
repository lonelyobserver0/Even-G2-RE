package X2;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8276a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f8277b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f8278c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f8279d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f8280e;

    /* renamed from: f, reason: collision with root package name */
    public final Double f8281f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8282g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f8283h;

    /* renamed from: i, reason: collision with root package name */
    public final x f8284i;
    public final x j;

    public h(boolean z2, Long l9, Long l10, Long l11, Double d8, Double d10, String str, Long l12, x xVar, x xVar2) {
        this.f8276a = z2;
        this.f8277b = l9;
        this.f8278c = l10;
        this.f8279d = l11;
        this.f8280e = d8;
        this.f8281f = d10;
        this.f8282g = str;
        this.f8283h = l12;
        this.f8284i = xVar;
        this.j = xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f8276a == hVar.f8276a && Intrinsics.areEqual(this.f8277b, hVar.f8277b) && Intrinsics.areEqual(this.f8278c, hVar.f8278c) && Intrinsics.areEqual(this.f8279d, hVar.f8279d) && Intrinsics.areEqual((Object) this.f8280e, (Object) hVar.f8280e) && Intrinsics.areEqual((Object) this.f8281f, (Object) hVar.f8281f) && Intrinsics.areEqual(this.f8282g, hVar.f8282g) && Intrinsics.areEqual(this.f8283h, hVar.f8283h) && this.f8284i == hVar.f8284i && this.j == hVar.j;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f8276a) * 31;
        Long l9 = this.f8277b;
        int hashCode2 = (hashCode + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.f8278c;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f8279d;
        int hashCode4 = (hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Double d8 = this.f8280e;
        int hashCode5 = (hashCode4 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d10 = this.f8281f;
        int hashCode6 = (hashCode5 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str = this.f8282g;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.f8283h;
        int hashCode8 = (hashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        x xVar = this.f8284i;
        int hashCode9 = (hashCode8 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        x xVar2 = this.j;
        return hashCode9 + (xVar2 != null ? xVar2.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(7076) + this.f8276a + StubApp.getString2(4989) + this.f8277b + StubApp.getString2(4988) + this.f8278c + StubApp.getString2(4990) + this.f8279d + StubApp.getString2(4991) + this.f8280e + StubApp.getString2(6639) + this.f8281f + StubApp.getString2(7077) + this.f8282g + StubApp.getString2(7078) + this.f8283h + StubApp.getString2(7079) + this.f8284i + StubApp.getString2(7080) + this.j + StubApp.getString2(74);
    }
}
