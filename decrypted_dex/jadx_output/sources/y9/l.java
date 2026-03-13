package y9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import x9.K;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final K f23581a;

    /* renamed from: b, reason: collision with root package name */
    public final K f23582b;

    /* renamed from: c, reason: collision with root package name */
    public final K f23583c;

    /* renamed from: d, reason: collision with root package name */
    public final K f23584d;

    /* renamed from: e, reason: collision with root package name */
    public final s f23585e;

    /* renamed from: f, reason: collision with root package name */
    public final K f23586f;

    /* renamed from: g, reason: collision with root package name */
    public final K f23587g;

    /* renamed from: h, reason: collision with root package name */
    public final K f23588h;

    public l(K k3, K k4, K k10, K k11, s sVar, K k12, K k13, K k14) {
        this.f23581a = k3;
        this.f23582b = k4;
        this.f23583c = k10;
        this.f23584d = k11;
        this.f23585e = sVar;
        this.f23586f = k12;
        this.f23587g = k13;
        this.f23588h = k14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f23581a, lVar.f23581a) && Intrinsics.areEqual(this.f23582b, lVar.f23582b) && Intrinsics.areEqual(this.f23583c, lVar.f23583c) && Intrinsics.areEqual(this.f23584d, lVar.f23584d) && Intrinsics.areEqual(this.f23585e, lVar.f23585e) && Intrinsics.areEqual(this.f23586f, lVar.f23586f) && Intrinsics.areEqual(this.f23587g, lVar.f23587g) && Intrinsics.areEqual(this.f23588h, lVar.f23588h);
    }

    public final int hashCode() {
        int hashCode = (this.f23582b.hashCode() + (this.f23581a.hashCode() * 31)) * 31;
        K k3 = this.f23583c;
        int hashCode2 = (hashCode + (k3 == null ? 0 : k3.hashCode())) * 31;
        K k4 = this.f23584d;
        int hashCode3 = (hashCode2 + (k4 == null ? 0 : k4.hashCode())) * 31;
        s sVar = this.f23585e;
        int hashCode4 = (hashCode3 + (sVar == null ? 0 : Double.hashCode(sVar.f23601a))) * 31;
        K k10 = this.f23586f;
        int hashCode5 = (hashCode4 + (k10 == null ? 0 : k10.hashCode())) * 31;
        K k11 = this.f23587g;
        int hashCode6 = (hashCode5 + (k11 == null ? 0 : k11.hashCode())) * 31;
        K k12 = this.f23588h;
        return hashCode6 + (k12 != null ? k12.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(24696) + this.f23581a + StubApp.getString2(24697) + this.f23582b + StubApp.getString2(24698) + this.f23583c + StubApp.getString2(24699) + this.f23584d + StubApp.getString2(14751) + this.f23585e + StubApp.getString2(24700) + this.f23586f + StubApp.getString2(24701) + this.f23587g + StubApp.getString2(24702) + this.f23588h + ')';
    }
}
