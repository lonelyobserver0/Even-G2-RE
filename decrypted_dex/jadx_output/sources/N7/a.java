package N7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f4931a;

    /* renamed from: b, reason: collision with root package name */
    public final c f4932b;

    /* renamed from: c, reason: collision with root package name */
    public final b f4933c;

    public a(Integer num, c unit, b sign) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(sign, "sign");
        this.f4931a = num;
        this.f4932b = unit;
        this.f4933c = sign;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.speed.model.SpeedLimitInfo");
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f4931a, aVar.f4931a) && this.f4932b == aVar.f4932b && this.f4933c == aVar.f4933c;
    }

    public final int hashCode() {
        Integer num = this.f4931a;
        return this.f4933c.hashCode() + ((this.f4932b.hashCode() + ((num != null ? num.intValue() : 0) * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(3780) + this.f4931a + StubApp.getString2(3781) + this.f4932b + StubApp.getString2(3782) + this.f4933c + ')';
    }
}
