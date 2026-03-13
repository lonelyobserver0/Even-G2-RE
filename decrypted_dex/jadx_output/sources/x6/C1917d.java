package x6;

import android.media.MediaFormat;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import t6.C1737d;
import v6.C1837c;
import v6.InterfaceC1836b;

/* renamed from: x6.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1917d extends hc.b {

    /* renamed from: c, reason: collision with root package name */
    public int f22897c;

    @Override // hc.b
    public final MediaFormat B(C1737d config) {
        Intrinsics.checkNotNullParameter(config, "config");
        int i3 = config.f21201p;
        this.f22897c = (i3 * 16) / 8;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(StubApp.getString2(5549), StubApp.getString2(76));
        mediaFormat.setInteger(StubApp.getString2(23466), config.f21189c);
        mediaFormat.setInteger(StubApp.getString2(23467), i3);
        mediaFormat.setInteger(StubApp.getString2(23862), this.f22897c);
        return mediaFormat;
    }

    @Override // hc.b
    public final String D() {
        return StubApp.getString2(76);
    }

    @Override // hc.b
    public final boolean G() {
        return true;
    }

    @Override // hc.b
    public final InterfaceC1836b w(String str) {
        if (str != null) {
            return new C1837c(str, this.f22897c);
        }
        throw new IllegalArgumentException(StubApp.getString2(24185));
    }
}
