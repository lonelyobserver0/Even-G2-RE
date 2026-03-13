package V8;

import com.mapbox.common.location.Location;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: V8.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0350b {

    /* renamed from: a, reason: collision with root package name */
    public final Location f7807a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7808b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7809c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7810d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7811e;

    /* renamed from: f, reason: collision with root package name */
    public final N7.a f7812f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7813g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f7814h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f7815i;
    public final M7.a j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7816k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7817l;

    /* renamed from: m, reason: collision with root package name */
    public final X8.a f7818m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f7819n;

    public C0350b(Location enhancedLocation, ArrayList keyPoints, boolean z2, float f10, boolean z10, N7.a speedLimitInfo, float f11, Long l9, Integer num, M7.a road, boolean z11, boolean z12, X8.a aVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(enhancedLocation, "enhancedLocation");
        Intrinsics.checkNotNullParameter(keyPoints, "keyPoints");
        Intrinsics.checkNotNullParameter(speedLimitInfo, "speedLimitInfo");
        Intrinsics.checkNotNullParameter(road, "road");
        this.f7807a = enhancedLocation;
        this.f7808b = keyPoints;
        this.f7809c = z2;
        this.f7810d = f10;
        this.f7811e = z10;
        this.f7812f = speedLimitInfo;
        this.f7813g = f11;
        this.f7814h = l9;
        this.f7815i = num;
        this.j = road;
        this.f7816k = z11;
        this.f7817l = z12;
        this.f7818m = aVar;
        this.f7819n = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0350b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.trip.session.LocationMatcherResult");
        C0350b c0350b = (C0350b) obj;
        return Intrinsics.areEqual(this.f7807a, c0350b.f7807a) && Intrinsics.areEqual(this.f7808b, c0350b.f7808b) && this.f7809c == c0350b.f7809c && this.f7810d == c0350b.f7810d && this.f7811e == c0350b.f7811e && Intrinsics.areEqual(this.f7812f, c0350b.f7812f) && this.f7813g == c0350b.f7813g && Intrinsics.areEqual(this.f7814h, c0350b.f7814h) && Intrinsics.areEqual(this.j, c0350b.j) && this.f7816k == c0350b.f7816k && this.f7817l == c0350b.f7817l && Intrinsics.areEqual(this.f7818m, c0350b.f7818m) && Intrinsics.areEqual(this.f7819n, c0350b.f7819n);
    }

    public final int hashCode() {
        int hashCode = (Float.hashCode(this.f7813g) + ((this.f7812f.hashCode() + i2.u.e((Float.hashCode(this.f7810d) + i2.u.e((this.f7808b.hashCode() + (this.f7807a.hashCode() * 31)) * 31, 31, this.f7809c)) * 31, 31, this.f7811e)) * 31)) * 31;
        Long l9 = this.f7814h;
        int e10 = i2.u.e(i2.u.e((this.j.f4676a.hashCode() + ((hashCode + (l9 != null ? l9.hashCode() : 0)) * 31)) * 31, 31, this.f7816k), 31, this.f7817l);
        X8.a aVar = this.f7818m;
        int hashCode2 = (e10 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Boolean bool = this.f7819n;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(6652) + this.f7807a + StubApp.getString2(6653) + this.f7808b + StubApp.getString2(6654) + this.f7809c + StubApp.getString2(6655) + this.f7810d + StubApp.getString2(6656) + this.f7811e + StubApp.getString2(6657) + this.f7812f + StubApp.getString2(6658) + this.f7813g + StubApp.getString2(6659) + this.f7814h + StubApp.getString2(6660) + this.j + StubApp.getString2(6661) + this.f7816k + StubApp.getString2(4998) + this.f7817l + StubApp.getString2(6662) + this.f7818m + StubApp.getString2(6663) + this.f7819n + ')';
    }
}
