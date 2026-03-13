package x0;

import T0.C0313d;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import o0.C1428c;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f22792a = new t();

    /* renamed from: b, reason: collision with root package name */
    public static final t f22793b = new t();

    public static AudioAttributes b(C1428c c1428c, boolean z2) {
        return z2 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) c1428c.a().f9233b;
    }

    public static int c(int i3) {
        if (i3 == 20) {
            return 63750;
        }
        if (i3 == 30) {
            return 2250000;
        }
        switch (i3) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i3) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public AudioTrack a(C0313d c0313d, C1428c c1428c, int i3) {
        int i10 = AbstractC1560u.f20190a;
        boolean z2 = c0313d.f6989d;
        int i11 = c0313d.f6986a;
        int i12 = c0313d.f6988c;
        int i13 = c0313d.f6987b;
        if (i10 < 23) {
            return new AudioTrack(b(c1428c, z2), AbstractC1560u.p(i13, i12, i11), c0313d.f6991f, 1, i3);
        }
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b(c1428c, z2)).setAudioFormat(AbstractC1560u.p(i13, i12, i11)).setTransferMode(1).setBufferSizeInBytes(c0313d.f6991f).setSessionId(i3);
        if (i10 >= 29) {
            sessionId.setOffloadedPlayback(c0313d.f6990e);
        }
        return sessionId.build();
    }
}
