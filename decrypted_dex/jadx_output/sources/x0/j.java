package x0;

import android.media.AudioTrack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final i f22668a;

    /* renamed from: b, reason: collision with root package name */
    public int f22669b;

    /* renamed from: c, reason: collision with root package name */
    public long f22670c;

    /* renamed from: d, reason: collision with root package name */
    public long f22671d;

    /* renamed from: e, reason: collision with root package name */
    public long f22672e;

    /* renamed from: f, reason: collision with root package name */
    public long f22673f;

    public j(AudioTrack audioTrack) {
        this.f22668a = new i(audioTrack);
        a();
    }

    public final void a() {
        if (this.f22668a != null) {
            b(0);
        }
    }

    public final void b(int i3) {
        this.f22669b = i3;
        if (i3 == 0) {
            this.f22672e = 0L;
            this.f22673f = -1L;
            this.f22670c = System.nanoTime() / 1000;
            this.f22671d = 10000L;
            return;
        }
        if (i3 == 1) {
            this.f22671d = 10000L;
            return;
        }
        if (i3 == 2 || i3 == 3) {
            this.f22671d = 10000000L;
        } else {
            if (i3 != 4) {
                throw new IllegalStateException();
            }
            this.f22671d = 500000L;
        }
    }
}
