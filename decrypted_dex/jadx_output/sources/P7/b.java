package P7;

import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import com.stub.StubApp;
import i2.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.mapbox.navigation.base.route.g f5562a;

    /* renamed from: b, reason: collision with root package name */
    public final BannerInstructions f5563b;

    /* renamed from: c, reason: collision with root package name */
    public final VoiceInstructions f5564c;

    /* renamed from: d, reason: collision with root package name */
    public final c f5565d;

    /* renamed from: e, reason: collision with root package name */
    public final a f5566e;

    /* renamed from: f, reason: collision with root package name */
    public final List f5567f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5568g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5569h;

    /* renamed from: i, reason: collision with root package name */
    public final float f5570i;
    public final double j;

    /* renamed from: k, reason: collision with root package name */
    public final float f5571k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5572l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f5573m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f5574n;

    /* renamed from: o, reason: collision with root package name */
    public final String f5575o;

    /* renamed from: p, reason: collision with root package name */
    public final int f5576p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f5577q;

    /* renamed from: r, reason: collision with root package name */
    public final LinkedHashMap f5578r;

    public b(com.mapbox.navigation.base.route.g navigationRoute, BannerInstructions bannerInstructions, VoiceInstructions voiceInstructions, c currentState, a aVar, List list, boolean z2, float f10, float f11, double d8, float f12, int i3, ArrayList upcomingRoadObjects, boolean z10, String str, int i10, boolean z11, LinkedHashMap alternativeRoutesIndices) {
        Intrinsics.checkNotNullParameter(navigationRoute, "navigationRoute");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(upcomingRoadObjects, "upcomingRoadObjects");
        Intrinsics.checkNotNullParameter(alternativeRoutesIndices, "alternativeRoutesIndices");
        this.f5562a = navigationRoute;
        this.f5563b = bannerInstructions;
        this.f5564c = voiceInstructions;
        this.f5565d = currentState;
        this.f5566e = aVar;
        this.f5567f = list;
        this.f5568g = z2;
        this.f5569h = f10;
        this.f5570i = f11;
        this.j = d8;
        this.f5571k = f12;
        this.f5572l = i3;
        this.f5573m = upcomingRoadObjects;
        this.f5574n = z10;
        this.f5575o = str;
        this.f5576p = i10;
        this.f5577q = z11;
        this.f5578r = alternativeRoutesIndices;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.RouteProgress");
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f5562a, bVar.f5562a) && Intrinsics.areEqual(this.f5563b, bVar.f5563b) && Intrinsics.areEqual(this.f5564c, bVar.f5564c) && this.f5565d == bVar.f5565d && Intrinsics.areEqual(this.f5566e, bVar.f5566e) && Intrinsics.areEqual(this.f5567f, bVar.f5567f) && this.f5568g == bVar.f5568g && this.f5569h == bVar.f5569h && this.f5570i == bVar.f5570i && this.j == bVar.j && this.f5571k == bVar.f5571k && this.f5572l == bVar.f5572l && Intrinsics.areEqual(this.f5573m, bVar.f5573m) && this.f5574n == bVar.f5574n && Intrinsics.areEqual(this.f5575o, bVar.f5575o) && this.f5576p == bVar.f5576p && this.f5577q == bVar.f5577q && Intrinsics.areEqual(this.f5578r, bVar.f5578r);
    }

    public final int hashCode() {
        int hashCode = this.f5562a.hashCode() * 31;
        BannerInstructions bannerInstructions = this.f5563b;
        int hashCode2 = (hashCode + (bannerInstructions != null ? bannerInstructions.hashCode() : 0)) * 31;
        VoiceInstructions voiceInstructions = this.f5564c;
        int hashCode3 = (this.f5566e.hashCode() + ((this.f5565d.hashCode() + ((hashCode2 + (voiceInstructions != null ? voiceInstructions.hashCode() : 0)) * 31)) * 31)) * 31;
        List list = this.f5567f;
        int e10 = u.e((this.f5573m.hashCode() + ((((Float.hashCode(this.f5571k) + E1.a.d(this.j, (Float.hashCode(this.f5570i) + ((Float.hashCode(this.f5569h) + u.e((hashCode3 + (list != null ? list.hashCode() : 0)) * 31, 31, this.f5568g)) * 31)) * 31, 31)) * 31) + this.f5572l) * 31)) * 31, 31, this.f5574n);
        String str = this.f5575o;
        return this.f5578r.hashCode() + u.e(E1.a.e(this.f5576p, (e10 + (str != null ? str.hashCode() : 0)) * 31, 31), 31, this.f5577q);
    }

    public final String toString() {
        return StubApp.getString2(4996) + this.f5562a + StubApp.getString2(4997) + this.f5565d + StubApp.getString2(4998) + this.f5568g + StubApp.getString2(4989) + this.f5569h + StubApp.getString2(4988) + this.f5570i + StubApp.getString2(4990) + this.j + StubApp.getString2(4991) + this.f5571k + StubApp.getString2(4999) + this.f5574n + StubApp.getString2(5000) + this.f5575o + StubApp.getString2(5001) + this.f5576p + StubApp.getString2(5002) + this.f5566e + StubApp.getString2(5003) + this.f5563b + StubApp.getString2(5004) + this.f5564c + StubApp.getString2(5005) + this.f5567f + StubApp.getString2(5006) + this.f5572l + StubApp.getString2(5007) + this.f5573m + StubApp.getString2(5008) + this.f5577q + StubApp.getString2(5009) + this.f5578r + ')';
    }
}
