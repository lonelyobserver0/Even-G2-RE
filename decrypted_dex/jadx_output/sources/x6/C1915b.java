package x6;

import android.media.MediaFormat;
import android.os.Build;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import t6.C1737d;
import v6.C1835a;
import v6.InterfaceC1836b;

/* renamed from: x6.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1915b extends hc.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22895c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f22896d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1915b(int i3) {
        super(17);
        this.f22895c = i3;
        switch (i3) {
            case 1:
                super(17);
                this.f22896d = new int[]{6600, 8850, 12650, 14250, 15850, 18250, 19850, 23050, 23850};
                break;
            case 2:
                super(17);
                this.f22896d = new int[]{8000, 11025, 22050, 44100, 48000};
                break;
            case 3:
                super(17);
                this.f22896d = new int[]{8000, 12000, 16000, 24000, 48000};
                break;
            default:
                this.f22896d = new int[]{4750, 5150, 5900, 6700, 7400, 7950, 10200, 12200};
                break;
        }
    }

    @Override // hc.b
    public final MediaFormat B(C1737d config) {
        switch (this.f22895c) {
            case 0:
                Intrinsics.checkNotNullParameter(config, "config");
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString(StubApp.getString2(5549), StubApp.getString2(1624));
                mediaFormat.setInteger(StubApp.getString2(23466), 8000);
                mediaFormat.setInteger(StubApp.getString2(23467), 1);
                mediaFormat.setInteger(StubApp.getString2(24180), hc.b.R(config.f21188b, this.f22896d));
                return mediaFormat;
            case 1:
                Intrinsics.checkNotNullParameter(config, "config");
                MediaFormat mediaFormat2 = new MediaFormat();
                mediaFormat2.setString(StubApp.getString2(5549), StubApp.getString2(1625));
                mediaFormat2.setInteger(StubApp.getString2(23466), 16000);
                mediaFormat2.setInteger(StubApp.getString2(23467), 1);
                mediaFormat2.setInteger(StubApp.getString2(24180), hc.b.R(config.f21188b, this.f22896d));
                return mediaFormat2;
            case 2:
                Intrinsics.checkNotNullParameter(config, "config");
                MediaFormat mediaFormat3 = new MediaFormat();
                mediaFormat3.setString(StubApp.getString2(5549), StubApp.getString2(1627));
                mediaFormat3.setInteger(StubApp.getString2(23466), hc.b.R(config.f21189c, this.f22896d));
                mediaFormat3.setInteger(StubApp.getString2(23467), config.f21201p);
                mediaFormat3.setInteger(StubApp.getString2(24180), 0);
                mediaFormat3.setInteger(StubApp.getString2(24183), 8);
                return mediaFormat3;
            default:
                Intrinsics.checkNotNullParameter(config, "config");
                MediaFormat mediaFormat4 = new MediaFormat();
                mediaFormat4.setString(StubApp.getString2(5549), StubApp.getString2(1609));
                mediaFormat4.setInteger(StubApp.getString2(23466), hc.b.R(config.f21189c, this.f22896d));
                mediaFormat4.setInteger(StubApp.getString2(23467), config.f21201p);
                mediaFormat4.setInteger(StubApp.getString2(24180), config.f21188b);
                return mediaFormat4;
        }
    }

    @Override // hc.b
    public final String D() {
        switch (this.f22895c) {
            case 0:
                return StubApp.getString2(1624);
            case 1:
                return StubApp.getString2(1625);
            case 2:
                return StubApp.getString2(1627);
            default:
                return StubApp.getString2(1609);
        }
    }

    @Override // hc.b
    public final boolean G() {
        switch (this.f22895c) {
        }
        return false;
    }

    @Override // hc.b
    public final InterfaceC1836b w(String str) {
        switch (this.f22895c) {
            case 0:
                if (str != null) {
                    return new E0.d(str, false, 2);
                }
                throw new IllegalArgumentException(StubApp.getString2(24185));
            case 1:
                if (str != null) {
                    return new E0.d(str, false, 2);
                }
                throw new IllegalArgumentException(StubApp.getString2(24185));
            case 2:
                if (str != null) {
                    return new C1835a(str);
                }
                throw new IllegalArgumentException(StubApp.getString2(24185));
            default:
                if (str == null) {
                    throw new IllegalArgumentException(StubApp.getString2(24185));
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    return new E0.d(str, false, 4);
                }
                throw new IllegalAccessException(StubApp.getString2(24184));
        }
    }
}
