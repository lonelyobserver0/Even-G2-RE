package Q3;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.common.d f5729a;

    public n(com.google.android.gms.common.d dVar) {
        this.f5729a = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return StubApp.getString2(5164).concat(String.valueOf(this.f5729a));
    }
}
