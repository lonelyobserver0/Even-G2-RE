package n8;

import com.mapbox.common.BillingSessionStatus;
import com.mapbox.common.SessionSKUIdentifier;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final SessionSKUIdentifier f17882a;

    /* renamed from: b, reason: collision with root package name */
    public final BillingSessionStatus f17883b;

    public d(SessionSKUIdentifier skuId, BillingSessionStatus status) {
        Intrinsics.checkNotNullParameter(skuId, "skuId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f17882a = skuId;
        this.f17883b = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f17882a == dVar.f17882a && this.f17883b == dVar.f17883b;
    }

    public final int hashCode() {
        return this.f17883b.hashCode() + (this.f17882a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(21463) + this.f17882a + StubApp.getString2(5757) + this.f17883b + ')';
    }
}
