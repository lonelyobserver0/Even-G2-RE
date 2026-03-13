package H5;

import android.os.Build;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: H5.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0068a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2827a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2828b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2829c;

    /* renamed from: d, reason: collision with root package name */
    public final D f2830d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2831e;

    public C0068a(String packageName, String versionName, String appBuildVersion, D currentProcessDetails, ArrayList appProcessDetails) {
        String deviceManufacturer = Build.MANUFACTURER;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        this.f2827a = packageName;
        this.f2828b = versionName;
        this.f2829c = appBuildVersion;
        this.f2830d = currentProcessDetails;
        this.f2831e = appProcessDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0068a)) {
            return false;
        }
        C0068a c0068a = (C0068a) obj;
        if (!Intrinsics.areEqual(this.f2827a, c0068a.f2827a) || !Intrinsics.areEqual(this.f2828b, c0068a.f2828b) || !Intrinsics.areEqual(this.f2829c, c0068a.f2829c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return Intrinsics.areEqual(str, str) && Intrinsics.areEqual(this.f2830d, c0068a.f2830d) && Intrinsics.areEqual(this.f2831e, c0068a.f2831e);
    }

    public final int hashCode() {
        return this.f2831e.hashCode() + ((this.f2830d.hashCode() + i2.u.d(i2.u.d(i2.u.d(this.f2827a.hashCode() * 31, 31, this.f2828b), 31, this.f2829c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(2598) + this.f2827a + StubApp.getString2(2599) + this.f2828b + StubApp.getString2(2600) + this.f2829c + StubApp.getString2(2601) + Build.MANUFACTURER + StubApp.getString2(2602) + this.f2830d + StubApp.getString2(2603) + this.f2831e + ')';
    }
}
