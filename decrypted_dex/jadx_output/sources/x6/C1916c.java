package x6;

import android.media.MediaFormat;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import t6.C1737d;
import v6.InterfaceC1836b;

/* renamed from: x6.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1916c extends hc.b {
    @Override // hc.b
    public final MediaFormat B(C1737d config) {
        Intrinsics.checkNotNullParameter(config, "config");
        int i3 = config.f21201p;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(StubApp.getString2(5549), StubApp.getString2(76));
        mediaFormat.setInteger(StubApp.getString2(23466), config.f21189c);
        mediaFormat.setInteger(StubApp.getString2(23467), i3);
        mediaFormat.setInteger(StubApp.getString2(23862), (i3 * 16) / 8);
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
        Fb.a aVar = new Fb.a();
        aVar.f2347c = str;
        aVar.f2346b = -1;
        if (str != null) {
            aVar.f2348d = F1.k(str);
        }
        return aVar;
    }
}
