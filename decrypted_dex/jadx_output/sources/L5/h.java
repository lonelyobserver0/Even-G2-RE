package L5;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f4225a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f4226b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f4227c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f4228d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f4229e;

    public h(Boolean bool, Double d8, Integer num, Integer num2, Long l9) {
        this.f4225a = bool;
        this.f4226b = d8;
        this.f4227c = num;
        this.f4228d = num2;
        this.f4229e = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f4225a, hVar.f4225a) && Intrinsics.areEqual((Object) this.f4226b, (Object) hVar.f4226b) && Intrinsics.areEqual(this.f4227c, hVar.f4227c) && Intrinsics.areEqual(this.f4228d, hVar.f4228d) && Intrinsics.areEqual(this.f4229e, hVar.f4229e);
    }

    public final int hashCode() {
        Boolean bool = this.f4225a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d8 = this.f4226b;
        int hashCode2 = (hashCode + (d8 == null ? 0 : d8.hashCode())) * 31;
        Integer num = this.f4227c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f4228d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l9 = this.f4229e;
        return hashCode4 + (l9 != null ? l9.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(3405) + this.f4225a + StubApp.getString2(2664) + this.f4226b + StubApp.getString2(3406) + this.f4227c + StubApp.getString2(3407) + this.f4228d + StubApp.getString2(3408) + this.f4229e + ')';
    }
}
