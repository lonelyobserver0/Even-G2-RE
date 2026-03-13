package X2;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f8266a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f8267b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f8268c;

    /* renamed from: d, reason: collision with root package name */
    public final Double f8269d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f8270e;

    /* renamed from: f, reason: collision with root package name */
    public final Double f8271f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f8272g;

    /* renamed from: h, reason: collision with root package name */
    public final Double f8273h;

    /* renamed from: i, reason: collision with root package name */
    public final Double f8274i;
    public final Long j;

    public f(e eVar, Long l9, Double d8, Double d10, Double d11, Double d12, Double d13, Double d14, Double d15, Long l10) {
        this.f8266a = eVar;
        this.f8267b = l9;
        this.f8268c = d8;
        this.f8269d = d10;
        this.f8270e = d11;
        this.f8271f = d12;
        this.f8272g = d13;
        this.f8273h = d14;
        this.f8274i = d15;
        this.j = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f8266a, fVar.f8266a) && Intrinsics.areEqual(this.f8267b, fVar.f8267b) && Intrinsics.areEqual((Object) this.f8268c, (Object) fVar.f8268c) && Intrinsics.areEqual((Object) this.f8269d, (Object) fVar.f8269d) && Intrinsics.areEqual((Object) this.f8270e, (Object) fVar.f8270e) && Intrinsics.areEqual((Object) this.f8271f, (Object) fVar.f8271f) && Intrinsics.areEqual((Object) this.f8272g, (Object) fVar.f8272g) && Intrinsics.areEqual((Object) this.f8273h, (Object) fVar.f8273h) && Intrinsics.areEqual((Object) this.f8274i, (Object) fVar.f8274i) && Intrinsics.areEqual(this.j, fVar.j);
    }

    public final int hashCode() {
        e eVar = this.f8266a;
        int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        Long l9 = this.f8267b;
        int hashCode2 = (hashCode + (l9 == null ? 0 : l9.hashCode())) * 31;
        Double d8 = this.f8268c;
        int hashCode3 = (hashCode2 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d10 = this.f8269d;
        int hashCode4 = (hashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f8270e;
        int hashCode5 = (hashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f8271f;
        int hashCode6 = (hashCode5 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f8272g;
        int hashCode7 = (hashCode6 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f8273h;
        int hashCode8 = (hashCode7 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f8274i;
        int hashCode9 = (hashCode8 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Long l10 = this.j;
        return hashCode9 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(7066) + this.f8266a + StubApp.getString2(5059) + this.f8267b + StubApp.getString2(7067) + this.f8268c + StubApp.getString2(7068) + this.f8269d + StubApp.getString2(7069) + this.f8270e + StubApp.getString2(6639) + this.f8271f + StubApp.getString2(7070) + this.f8272g + StubApp.getString2(7071) + this.f8273h + StubApp.getString2(7072) + this.f8274i + StubApp.getString2(7073) + this.j + StubApp.getString2(74);
    }
}
