package H5;

import android.os.Build;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: H5.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0069b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2835a;

    /* renamed from: b, reason: collision with root package name */
    public final C0068a f2836b;

    public C0069b(String appId, C0068a androidAppInfo) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        C logEnvironment = C.f2754b;
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter("2.1.2", StubApp.getString2(2622));
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        this.f2835a = appId;
        this.f2836b = androidAppInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0069b)) {
            return false;
        }
        C0069b c0069b = (C0069b) obj;
        if (!Intrinsics.areEqual(this.f2835a, c0069b.f2835a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!Intrinsics.areEqual(str, str) || !Intrinsics.areEqual("2.1.2", "2.1.2")) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return Intrinsics.areEqual(str2, str2) && Intrinsics.areEqual(this.f2836b, c0069b.f2836b);
    }

    public final int hashCode() {
        return this.f2836b.hashCode() + ((C.f2754b.hashCode() + i2.u.d((((Build.MODEL.hashCode() + (this.f2835a.hashCode() * 31)) * 31) + 47595001) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(2623) + this.f2835a + StubApp.getString2(2624) + Build.MODEL + StubApp.getString2(2625) + Build.VERSION.RELEASE + StubApp.getString2(2626) + C.f2754b + StubApp.getString2(2627) + this.f2836b + ')';
    }
}
