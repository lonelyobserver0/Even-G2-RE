package x6;

import android.media.MediaFormat;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import t6.C1737d;
import t6.EnumC1734a;
import v6.C1837c;
import v6.InterfaceC1836b;

/* renamed from: x6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1914a extends hc.b {

    /* renamed from: c, reason: collision with root package name */
    public int f22892c;

    /* renamed from: d, reason: collision with root package name */
    public int f22893d;

    /* renamed from: e, reason: collision with root package name */
    public int f22894e;

    @Override // hc.b
    public final MediaFormat B(C1737d config) {
        Intrinsics.checkNotNullParameter(config, "config");
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(StubApp.getString2(5549), StubApp.getString2(468));
        String string2 = StubApp.getString2(23466);
        mediaFormat.setInteger(string2, config.f21189c);
        int i3 = config.f21201p;
        String string22 = StubApp.getString2(23467);
        mediaFormat.setInteger(string22, i3);
        mediaFormat.setInteger(StubApp.getString2(24180), config.f21188b);
        EnumC1734a enumC1734a = EnumC1734a.f21166a;
        String string23 = StubApp.getString2(24181);
        EnumC1734a enumC1734a2 = config.f21203r;
        if (enumC1734a2 == enumC1734a) {
            mediaFormat.setInteger(string23, 2);
        } else if (enumC1734a2 == EnumC1734a.f21167b) {
            mediaFormat.setInteger(string23, 39);
        } else if (enumC1734a2 == EnumC1734a.f21168c) {
            mediaFormat.setInteger(string23, 5);
        }
        this.f22892c = mediaFormat.getInteger(string2);
        this.f22893d = mediaFormat.getInteger(string22);
        this.f22894e = mediaFormat.getInteger(string23);
        return mediaFormat;
    }

    @Override // hc.b
    public final String D() {
        return StubApp.getString2(468);
    }

    @Override // hc.b
    public final boolean G() {
        return false;
    }

    @Override // hc.b
    public final void b(MediaFormat format, int i3) {
        Intrinsics.checkNotNullParameter(format, "format");
        super.b(format, i3);
        this.f22893d = i3;
    }

    @Override // hc.b
    public final void c(MediaFormat format, int i3) {
        Intrinsics.checkNotNullParameter(format, "format");
        super.c(format, i3);
        this.f22892c = i3;
    }

    @Override // hc.b
    public final InterfaceC1836b w(String str) {
        if (str != null) {
            return new E0.d(str, true, 0);
        }
        int i3 = this.f22894e;
        if (i3 == 2) {
            return new C1837c(this.f22892c, this.f22893d, i3);
        }
        throw new IllegalArgumentException(StubApp.getString2(24182));
    }
}
