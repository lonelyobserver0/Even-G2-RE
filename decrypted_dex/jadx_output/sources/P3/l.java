package P3;

import D5.A;
import android.os.Bundle;
import android.util.Log;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f5521a;

    /* renamed from: b, reason: collision with root package name */
    public final q4.k f5522b = new q4.k();

    /* renamed from: c, reason: collision with root package name */
    public final int f5523c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f5524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5525e;

    public l(int i3, int i10, Bundle bundle, int i11) {
        this.f5525e = i11;
        this.f5521a = i3;
        this.f5523c = i10;
        this.f5524d = bundle;
    }

    public final boolean a() {
        switch (this.f5525e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(A a3) {
        String string2 = StubApp.getString2(3016);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, StubApp.getString2(4889) + toString() + StubApp.getString2(52) + a3.toString());
        }
        this.f5522b.a(a3);
    }

    public final void c(Bundle bundle) {
        String string2 = StubApp.getString2(3016);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, StubApp.getString2(4890) + toString() + StubApp.getString2(52) + String.valueOf(bundle));
        }
        this.f5522b.b(bundle);
    }

    public final String toString() {
        return StubApp.getString2(4891) + this.f5523c + StubApp.getString2(4892) + this.f5521a + StubApp.getString2(4893) + a() + StubApp.getString2(265);
    }
}
