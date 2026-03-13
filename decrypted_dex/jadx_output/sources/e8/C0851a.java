package e8;

import Xa.h;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0851a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13665a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13666b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13667c;

    public C0851a(String type, String str, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f13665a = type;
        this.f13666b = str;
        this.f13667c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0851a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.reststop.Amenity");
        C0851a c0851a = (C0851a) obj;
        return Intrinsics.areEqual(this.f13665a, c0851a.f13665a) && Intrinsics.areEqual(this.f13666b, c0851a.f13666b) && Intrinsics.areEqual(this.f13667c, c0851a.f13667c);
    }

    public final int hashCode() {
        int hashCode = this.f13665a.hashCode() * 31;
        String str = this.f13666b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13667c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17380));
        sb2.append(this.f13665a);
        sb2.append(StubApp.getString2(1065));
        sb2.append(this.f13666b);
        sb2.append(StubApp.getString2(12689));
        return h.s(sb2, this.f13667c, ')');
    }
}
