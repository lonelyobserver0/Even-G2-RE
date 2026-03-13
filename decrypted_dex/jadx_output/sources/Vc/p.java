package Vc;

import android.media.MediaRecorder;
import com.stub.StubApp;
import q8.AbstractC1526a;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class p implements o {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f8051c = {0, 3, 7, 0, 0, 6, 7, 0, 0, 0, 0, 3, 1, 2, 0, 0, 0, 7, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f8052d = {0, 6, 11, 0, 0, 11, 0, 0, 0, 0, 0, 2, 3, 4, 0, 0, 9, 9, 9};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f8053e = {StubApp.getString2(25823), StubApp.getString2(25824), StubApp.getString2(25821), StubApp.getString2(25825), StubApp.getString2(25826), StubApp.getString2(25827), StubApp.getString2(25828), StubApp.getString2(25829), StubApp.getString2(25830), StubApp.getString2(25831), StubApp.getString2(25832), StubApp.getString2(25833), StubApp.getString2(25834), StubApp.getString2(25834), StubApp.getString2(25828), StubApp.getString2(25828), StubApp.getString2(25835), StubApp.getString2(25821), StubApp.getString2(25822)};

    /* renamed from: a, reason: collision with root package name */
    public Wc.d f8054a;

    /* renamed from: b, reason: collision with root package name */
    public MediaRecorder f8055b;

    @Override // Vc.o
    public final double a() {
        return this.f8055b.getMaxAmplitude();
    }

    @Override // Vc.o
    public final void b(Integer num, Boolean bool, Integer num2, Integer num3, Integer num4, int i3, String str, int i10, boolean z2, boolean z10, j jVar) {
        MediaRecorder mediaRecorder = this.f8055b;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
        } else {
            this.f8055b = new MediaRecorder();
        }
        if (D.a.a(AbstractC1526a.f20083a, StubApp.getString2(1831)) != 0) {
            throw new Exception(StubApp.getString2(25836));
        }
        try {
            this.f8055b.reset();
            this.f8055b.setAudioSource(i10);
            int i11 = f8051c[AbstractC1856e.c(i3)];
            this.f8055b.setOutputFormat(f8052d[AbstractC1856e.c(i3)]);
            if (str == null) {
                str = f8053e[AbstractC1856e.c(i3)];
            }
            this.f8055b.setOutputFile(str);
            this.f8055b.setAudioEncoder(i11);
            if (num != null) {
                this.f8055b.setAudioChannels(num.intValue());
            }
            if (num2 != null) {
                this.f8055b.setAudioSamplingRate(num2.intValue());
            }
            if (num3 != null) {
                this.f8055b.setAudioEncodingBitRate(num3.intValue());
            }
            this.f8055b.prepare();
            this.f8055b.start();
        } catch (Exception e10) {
            this.f8054a.f(5, StubApp.getString2(3465));
            try {
                c();
            } catch (Exception unused) {
            }
            throw e10;
        }
    }

    @Override // Vc.o
    public final void c() {
        MediaRecorder mediaRecorder = this.f8055b;
        Wc.d dVar = this.f8054a;
        if (mediaRecorder == null) {
            dVar.f(2, StubApp.getString2(25837));
            return;
        }
        try {
            mediaRecorder.resume();
        } catch (Exception unused) {
        }
        try {
            this.f8055b.stop();
            this.f8055b.reset();
            this.f8055b.release();
            this.f8055b = null;
        } catch (Exception unused2) {
            dVar.f(5, StubApp.getString2(25838));
        }
    }

    @Override // Vc.o
    public final boolean d() {
        MediaRecorder mediaRecorder = this.f8055b;
        if (mediaRecorder != null) {
            mediaRecorder.resume();
            return true;
        }
        this.f8054a.f(2, StubApp.getString2(25837));
        return false;
    }

    @Override // Vc.o
    public final boolean e() {
        MediaRecorder mediaRecorder = this.f8055b;
        if (mediaRecorder != null) {
            mediaRecorder.pause();
            return true;
        }
        this.f8054a.f(2, StubApp.getString2(25837));
        return false;
    }
}
