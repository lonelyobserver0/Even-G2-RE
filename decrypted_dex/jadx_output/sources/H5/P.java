package H5;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final X f2790a;

    /* renamed from: b, reason: collision with root package name */
    public final C0069b f2791b;

    public P(X sessionData, C0069b applicationInfo) {
        EnumC0081n eventType = EnumC0081n.f2904b;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.f2790a = sessionData;
        this.f2791b = applicationInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p8 = (P) obj;
        p8.getClass();
        return Intrinsics.areEqual(this.f2790a, p8.f2790a) && Intrinsics.areEqual(this.f2791b, p8.f2791b);
    }

    public final int hashCode() {
        return this.f2791b.hashCode() + ((this.f2790a.hashCode() + (EnumC0081n.f2904b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(2576) + EnumC0081n.f2904b + StubApp.getString2(2577) + this.f2790a + StubApp.getString2(2578) + this.f2791b + ')';
    }
}
