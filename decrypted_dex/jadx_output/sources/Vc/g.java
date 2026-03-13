package Vc;

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class g extends Ec.d {

    /* renamed from: d, reason: collision with root package name */
    public MediaPlayer f8008d;

    /* renamed from: e, reason: collision with root package name */
    public b f8009e;

    @Override // Ec.d
    public final long b() {
        return this.f8008d.getCurrentPosition();
    }

    @Override // Ec.d
    public final long c() {
        return this.f8008d.getDuration();
    }

    @Override // Ec.d
    public final boolean d() {
        return this.f8008d.isPlaying();
    }

    @Override // Ec.d
    public final void e() {
        MediaPlayer mediaPlayer = this.f8008d;
        if (mediaPlayer == null) {
            throw new Exception(StubApp.getString2(25802));
        }
        mediaPlayer.pause();
    }

    @Override // Ec.d
    public final void f() {
        this.f8008d.start();
    }

    @Override // Ec.d
    public final void g() {
        MediaPlayer mediaPlayer = this.f8008d;
        String string2 = StubApp.getString2(25803);
        if (mediaPlayer == null) {
            throw new Exception(string2);
        }
        if (mediaPlayer.isPlaying()) {
            throw new Exception(string2);
        }
        this.f8008d.start();
    }

    @Override // Ec.d
    public final void h(long j) {
        this.f8008d.seekTo((int) j);
    }

    @Override // Ec.d
    public final void i(double d8) {
        float f10 = (float) d8;
        try {
            PlaybackParams playbackParams = this.f8008d.getPlaybackParams();
            playbackParams.setSpeed(f10);
            this.f8008d.setPlaybackParams(playbackParams);
        } catch (Exception e10) {
            Log.e(StubApp.getString2(25804), StubApp.getString2(25805), e10);
        }
    }

    @Override // Ec.d
    public final void j(double d8) {
        float f10 = (float) d8;
        this.f8008d.setVolume(f10, f10);
    }

    @Override // Ec.d
    public final void k(double d8, double d10) {
        double max = Math.max(0.0d, Math.min(d8, 1.0d));
        double max2 = Math.max(-1.0d, Math.min(d10, 1.0d));
        this.f8008d.setVolume((float) ((max2 <= 0.0d ? 1.0d : 1.0d - max2) * max), (float) (max * (max2 < 0.0d ? 1.0d + max2 : 1.0d)));
    }

    @Override // Ec.d
    public final void l(int i3, String str, int i10, int i11, int i12, b bVar) {
        this.f8009e = bVar;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f8008d = mediaPlayer;
        if (str == null) {
            throw new Exception(StubApp.getString2(25806));
        }
        mediaPlayer.setDataSource(str);
        this.f8008d.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: Vc.f
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                g gVar = g.this;
                gVar.f8009e.g();
                b bVar2 = gVar.f8009e;
                bVar2.f7986f.f(2, StubApp.getString2(25793));
                bVar2.f7984d.post(new a(bVar2, 1));
            }
        });
        this.f8008d.setOnCompletionListener(new E9.o(this, 1));
        this.f8008d.setOnErrorListener(this.f8009e);
        this.f8008d.prepareAsync();
    }

    @Override // Ec.d
    public final void m() {
        MediaPlayer mediaPlayer = this.f8008d;
        if (mediaPlayer == null) {
            return;
        }
        try {
            mediaPlayer.stop();
        } catch (Exception unused) {
        }
        try {
            this.f8008d.reset();
        } catch (Exception unused2) {
        }
        try {
            this.f8008d.release();
        } catch (Exception unused3) {
        }
        this.f8008d = null;
    }

    @Override // Ec.d
    public final int u(byte[] bArr) {
        throw new Exception(StubApp.getString2(25807));
    }

    @Override // Ec.d
    public final int v(ArrayList arrayList) {
        throw new Exception(StubApp.getString2(25807));
    }

    @Override // Ec.d
    public final int w(ArrayList arrayList) {
        throw new Exception(StubApp.getString2(25807));
    }
}
