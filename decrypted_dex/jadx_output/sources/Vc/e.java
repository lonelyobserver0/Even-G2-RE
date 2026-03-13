package Vc;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.SystemClock;
import com.stub.StubApp;
import java.util.ArrayList;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class e extends Ec.d {

    /* renamed from: f, reason: collision with root package name */
    public final int f8002f;

    /* renamed from: i, reason: collision with root package name */
    public b f8005i;
    public AudioRecord j;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f8000d = {1, 10, 0, 0, 9, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 22, 0, 0, 0, 22};

    /* renamed from: e, reason: collision with root package name */
    public AudioTrack f8001e = null;

    /* renamed from: g, reason: collision with root package name */
    public long f8003g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f8004h = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8006k = false;

    public e(b bVar) {
        this.f8002f = 0;
        this.f8005i = bVar;
        this.f8002f = ((AudioManager) AbstractC1526a.f20083a.getSystemService(StubApp.getString2(643))).generateAudioSessionId();
    }

    @Override // Ec.d
    public final long b() {
        return 0L;
    }

    @Override // Ec.d
    public final long c() {
        return 0L;
    }

    @Override // Ec.d
    public final boolean d() {
        return this.f8001e.getPlayState() == 3;
    }

    @Override // Ec.d
    public final void e() {
        this.f8003g = SystemClock.elapsedRealtime();
        this.f8001e.pause();
    }

    @Override // Ec.d
    public final void f() {
        this.f8001e.play();
    }

    @Override // Ec.d
    public final void g() {
        if (this.f8003g >= 0) {
            SystemClock.elapsedRealtime();
        }
        this.f8003g = -1L;
        this.f8001e.play();
    }

    @Override // Ec.d
    public final void h(long j) {
        this.f8005i.d(StubApp.getString2(25795));
    }

    @Override // Ec.d
    public final void i(double d8) {
        this.f8005i.d(StubApp.getString2(25796));
    }

    @Override // Ec.d
    public final void j(double d8) {
        this.f8005i.d(StubApp.getString2(25797));
    }

    @Override // Ec.d
    public final void k(double d8, double d10) {
        this.f8005i.d(StubApp.getString2(25798));
    }

    @Override // Ec.d
    public final void l(int i3, String str, int i10, int i11, int i12, b bVar) {
        this.f8001e = new AudioTrack(new AudioAttributes.Builder().setLegacyStreamType(3).setUsage(1).setContentType(2).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i10).setChannelMask(i11 == 1 ? 4 : 12).build(), i12, 1, this.f8002f);
        this.f8003g = -1L;
        SystemClock.elapsedRealtime();
        b bVar2 = this.f8005i;
        bVar2.f7986f.f(2, StubApp.getString2(25793));
        bVar2.f7984d.post(new a(bVar2, 1));
        if (D.a.a(AbstractC1526a.f20083a, StubApp.getString2(1831)) != 0) {
            throw new Exception(StubApp.getString2(19959));
        }
        int i13 = i11 == 1 ? 16 : 12;
        int i14 = this.f8000d[6];
        int minBufferSize = AudioRecord.getMinBufferSize(i10, i13, i14);
        this.f8004h = minBufferSize;
        this.f8004h = Math.max(minBufferSize, i12);
        AudioRecord audioRecord = new AudioRecord(1, i10, i13, i14, this.f8004h);
        this.j = audioRecord;
        if (audioRecord.getState() != 1) {
            throw new Exception(StubApp.getString2(25799));
        }
        this.j.startRecording();
        this.f8006k = true;
        new M3.b(this, 1).start();
        this.f8005i = bVar;
    }

    @Override // Ec.d
    public final void m() {
        AudioRecord audioRecord = this.j;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (Exception unused) {
            }
            try {
                this.f8006k = false;
                this.j.release();
            } catch (Exception unused2) {
            }
            this.j = null;
        }
        AudioTrack audioTrack = this.f8001e;
        if (audioTrack != null) {
            audioTrack.stop();
            this.f8001e.release();
            this.f8001e = null;
        }
    }

    @Override // Ec.d
    public final int u(byte[] bArr) {
        this.f8005i.d(StubApp.getString2(25800));
        return -1;
    }

    @Override // Ec.d
    public final int v(ArrayList arrayList) {
        this.f8005i.d(StubApp.getString2(25800));
        return -1;
    }

    @Override // Ec.d
    public final int w(ArrayList arrayList) {
        this.f8005i.d(StubApp.getString2(25801));
        return -1;
    }
}
