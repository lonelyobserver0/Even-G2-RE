package P7;

import Xa.h;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends g {

    /* renamed from: a, reason: collision with root package name */
    public final BannerInstructions f5594a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f5595b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f5596c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5597d;

    public e(BannerInstructions bannerInstructions, Double d8, Double d10, String str) {
        this.f5594a = bannerInstructions;
        this.f5595b = d8;
        this.f5596c = d10;
        this.f5597d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(e.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.TripNotificationState.TripNotificationData");
        e eVar = (e) obj;
        if (Intrinsics.areEqual(this.f5594a, eVar.f5594a) && Tc.d.s(this.f5595b, eVar.f5595b) && Tc.d.s(this.f5596c, eVar.f5596c)) {
            return Intrinsics.areEqual(this.f5597d, eVar.f5597d);
        }
        return false;
    }

    public final int hashCode() {
        BannerInstructions bannerInstructions = this.f5594a;
        int hashCode = (bannerInstructions != null ? bannerInstructions.hashCode() : 0) * 31;
        Double d8 = this.f5595b;
        int hashCode2 = (hashCode + (d8 != null ? d8.hashCode() : 0)) * 31;
        Double d10 = this.f5596c;
        int hashCode3 = (hashCode2 + (d10 != null ? d10.hashCode() : 0)) * 31;
        String str = this.f5597d;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(5019));
        sb2.append(this.f5594a);
        sb2.append(StubApp.getString2(4989));
        sb2.append(this.f5595b);
        sb2.append(StubApp.getString2(4990));
        sb2.append(this.f5596c);
        sb2.append(StubApp.getString2(1522));
        return h.s(sb2, this.f5597d, ')');
    }
}
