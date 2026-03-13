package f5;

import android.os.Build;
import com.stub.StubApp;

/* renamed from: f5.o0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0916o0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14099a;

    public C0916o0(boolean z2) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(17689));
        }
        if (str2 == null) {
            throw new NullPointerException(StubApp.getString2(17688));
        }
        this.f14099a = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0916o0)) {
            return false;
        }
        C0916o0 c0916o0 = (C0916o0) obj;
        c0916o0.getClass();
        String str = Build.VERSION.RELEASE;
        if (!str.equals(str)) {
            return false;
        }
        String str2 = Build.VERSION.CODENAME;
        return str2.equals(str2) && this.f14099a == c0916o0.f14099a;
    }

    public final int hashCode() {
        return ((((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003) ^ (this.f14099a ? 1231 : 1237);
    }

    public final String toString() {
        return StubApp.getString2(17690) + Build.VERSION.RELEASE + StubApp.getString2(17691) + Build.VERSION.CODENAME + StubApp.getString2(17692) + this.f14099a + StubApp.getString2(265);
    }
}
