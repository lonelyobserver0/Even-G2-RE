package Vc;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.SystemClock;
import com.stub.StubApp;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class d extends Ec.d {

    /* renamed from: d, reason: collision with root package name */
    public AudioTrack f7994d;

    /* renamed from: e, reason: collision with root package name */
    public int f7995e;

    /* renamed from: f, reason: collision with root package name */
    public long f7996f;

    /* renamed from: g, reason: collision with root package name */
    public long f7997g;

    /* renamed from: h, reason: collision with root package name */
    public long f7998h;

    /* renamed from: i, reason: collision with root package name */
    public b f7999i;
    public int j;

    @Override // Ec.d
    public final long b() {
        long elapsedRealtime;
        long j;
        long j3 = this.f7997g;
        if (j3 >= 0) {
            elapsedRealtime = j3 - this.f7998h;
            j = this.f7996f;
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime() - this.f7998h;
            j = this.f7996f;
        }
        return elapsedRealtime - j;
    }

    @Override // Ec.d
    public final long c() {
        return b();
    }

    @Override // Ec.d
    public final boolean d() {
        AudioTrack audioTrack = this.f7994d;
        return audioTrack != null && audioTrack.getPlayState() == 3;
    }

    @Override // Ec.d
    public final void e() {
        this.f7997g = SystemClock.elapsedRealtime();
        this.f7994d.pause();
    }

    @Override // Ec.d
    public final void f() {
        this.f7994d.play();
    }

    @Override // Ec.d
    public final void g() {
        if (this.f7997g >= 0) {
            this.f7996f = (SystemClock.elapsedRealtime() - this.f7997g) + this.f7996f;
        }
        this.f7997g = -1L;
        this.f7994d.play();
    }

    @Override // Ec.d
    public final void h(long j) {
    }

    @Override // Ec.d
    public final void i(double d8) {
        float f10 = (float) d8;
        try {
            PlaybackParams playbackParams = this.f7994d.getPlaybackParams();
            playbackParams.setSpeed(f10);
            this.f7994d.setPlaybackParams(playbackParams);
        } catch (Exception e10) {
            this.f7999i.d(StubApp.getString2(25791) + e10.getMessage());
            this.f7999i.d(StubApp.getString2(25792));
        }
    }

    @Override // Ec.d
    public final void j(double d8) {
        this.f7994d.setVolume((float) d8);
    }

    @Override // Ec.d
    public final void k(double d8, double d10) {
        float f10;
        float f11;
        double max = Math.max(-1.0f, Math.min(1.0f, (float) d10));
        if (max < 0.0d) {
            float f12 = (float) d8;
            f10 = f12 * 1.0f;
            f11 = (((float) max) + 1.0f) * f12;
        } else if (max > 0.0d) {
            float f13 = (float) d8;
            f10 = (1.0f - ((float) max)) * f13;
            f11 = f13 * 1.0f;
        } else {
            f10 = ((float) d8) * 1.0f;
            f11 = f10;
        }
        this.f7994d.setStereoVolume(f10, f11);
    }

    @Override // Ec.d
    public final void l(int i3, String str, int i10, int i11, int i12, b bVar) {
        AudioFormat build;
        if (Build.VERSION.SDK_INT < 29) {
            throw new Exception(StubApp.getString2(25794));
        }
        this.j = i3;
        this.f7999i = bVar;
        AudioAttributes build2 = new AudioAttributes.Builder().setLegacyStreamType(3).setUsage(1).setContentType(2).build();
        if (i3 == 16) {
            build = new AudioFormat.Builder().setEncoding(4).setSampleRate(i10).setChannelMask(i11 == 1 ? 4 : 12).build();
        } else {
            build = new AudioFormat.Builder().setEncoding(2).setSampleRate(i10).setChannelMask(i11 == 1 ? 4 : 12).build();
        }
        this.f7994d = new AudioTrack(build2, build, i12, 1, this.f7995e);
        this.f7996f = 0L;
        this.f7997g = -1L;
        this.f7998h = SystemClock.elapsedRealtime();
        bVar.f7986f.f(2, StubApp.getString2(25793));
        bVar.f7984d.post(new a(bVar, 1));
    }

    @Override // Ec.d
    public final void m() {
        AudioTrack audioTrack = this.f7994d;
        if (audioTrack != null) {
            audioTrack.stop();
            this.f7994d.release();
            this.f7994d = null;
        }
    }

    @Override // Ec.d
    public final int u(byte[] bArr) {
        new c(this, bArr, 2).start();
        return 0;
    }

    @Override // Ec.d
    public final int v(ArrayList arrayList) {
        new c(this, arrayList, 0).start();
        return 0;
    }

    @Override // Ec.d
    public final int w(ArrayList arrayList) {
        new c(this, arrayList, 1).start();
        return 0;
    }
}
