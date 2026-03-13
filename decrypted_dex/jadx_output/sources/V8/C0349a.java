package V8;

import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: V8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0349a {

    /* renamed from: a, reason: collision with root package name */
    public final int f7805a;

    /* renamed from: b, reason: collision with root package name */
    public final BannerInstructions f7806b;

    public C0349a(int i3, BannerInstructions latestBannerInstructions) {
        Intrinsics.checkNotNullParameter(latestBannerInstructions, "latestBannerInstructions");
        this.f7805a = i3;
        this.f7806b = latestBannerInstructions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0349a)) {
            return false;
        }
        C0349a c0349a = (C0349a) obj;
        return this.f7805a == c0349a.f7805a && Intrinsics.areEqual(this.f7806b, c0349a.f7806b);
    }

    public final int hashCode() {
        return this.f7806b.hashCode() + (Integer.hashCode(this.f7805a) * 31);
    }

    public final String toString() {
        return StubApp.getString2(6650) + this.f7805a + StubApp.getString2(6651) + this.f7806b + ')';
    }
}
