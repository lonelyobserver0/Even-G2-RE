package b0;

import com.stub.StubApp;

/* renamed from: b0.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0479f {

    /* renamed from: a, reason: collision with root package name */
    public final long f10419a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10420b;

    public C0479f(long j, long j3) {
        if (j3 == 0) {
            this.f10419a = 0L;
            this.f10420b = 1L;
        } else {
            this.f10419a = j;
            this.f10420b = j3;
        }
    }

    public final String toString() {
        return this.f10419a + StubApp.getString2(601) + this.f10420b;
    }
}
