package b0;

import com.stub.StubApp;
import java.io.InputStream;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: b0.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0480g extends C0475b {
    public C0480g(byte[] bArr) {
        super(bArr);
        this.f10404a.mark(IntCompanionObject.MAX_VALUE);
    }

    public final void seek(long j) {
        int i3 = this.f10405b;
        if (i3 > j) {
            this.f10405b = 0;
            this.f10404a.reset();
        } else {
            j -= i3;
        }
        a((int) j);
    }

    public C0480g(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f10404a.mark(IntCompanionObject.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException(StubApp.getString2(8627));
    }
}
