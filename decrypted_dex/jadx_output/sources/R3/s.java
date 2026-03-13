package R3;

import com.stub.StubApp;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final C0233b f6160a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.d f6161b;

    public /* synthetic */ s(C0233b c0233b, com.google.android.gms.common.d dVar) {
        this.f6160a = c0233b;
        this.f6161b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof s)) {
            s sVar = (s) obj;
            if (S3.D.k(this.f6160a, sVar.f6160a) && S3.D.k(this.f6161b, sVar.f6161b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6160a, this.f6161b});
    }

    public final String toString() {
        Z9.C c10 = new Z9.C(this);
        c10.a(this.f6160a, StubApp.getString2(728));
        c10.a(this.f6161b, StubApp.getString2(5657));
        return c10.toString();
    }
}
