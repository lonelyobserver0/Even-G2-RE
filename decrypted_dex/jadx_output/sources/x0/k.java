package x0;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.stub.StubApp;
import f4.C0882f;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import org.bouncycastle.asn1.cmc.BodyPartID;
import r0.AbstractC1560u;
import r0.C1555p;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k {

    /* renamed from: A, reason: collision with root package name */
    public long f22674A;

    /* renamed from: B, reason: collision with root package name */
    public long f22675B;

    /* renamed from: C, reason: collision with root package name */
    public long f22676C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f22677D;

    /* renamed from: E, reason: collision with root package name */
    public long f22678E;

    /* renamed from: F, reason: collision with root package name */
    public long f22679F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f22680G;

    /* renamed from: H, reason: collision with root package name */
    public long f22681H;

    /* renamed from: I, reason: collision with root package name */
    public C1555p f22682I;

    /* renamed from: a, reason: collision with root package name */
    public final C0882f f22683a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f22684b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f22685c;

    /* renamed from: d, reason: collision with root package name */
    public int f22686d;

    /* renamed from: e, reason: collision with root package name */
    public j f22687e;

    /* renamed from: f, reason: collision with root package name */
    public int f22688f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22689g;

    /* renamed from: h, reason: collision with root package name */
    public long f22690h;

    /* renamed from: i, reason: collision with root package name */
    public float f22691i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f22692k;

    /* renamed from: l, reason: collision with root package name */
    public long f22693l;

    /* renamed from: m, reason: collision with root package name */
    public Method f22694m;

    /* renamed from: n, reason: collision with root package name */
    public long f22695n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f22696o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f22697p;

    /* renamed from: q, reason: collision with root package name */
    public long f22698q;

    /* renamed from: r, reason: collision with root package name */
    public long f22699r;

    /* renamed from: s, reason: collision with root package name */
    public long f22700s;

    /* renamed from: t, reason: collision with root package name */
    public long f22701t;

    /* renamed from: u, reason: collision with root package name */
    public long f22702u;

    /* renamed from: v, reason: collision with root package name */
    public int f22703v;

    /* renamed from: w, reason: collision with root package name */
    public int f22704w;

    /* renamed from: x, reason: collision with root package name */
    public long f22705x;

    /* renamed from: y, reason: collision with root package name */
    public long f22706y;

    /* renamed from: z, reason: collision with root package name */
    public long f22707z;

    public k(C0882f c0882f) {
        this.f22683a = c0882f;
        try {
            this.f22694m = AudioTrack.class.getMethod(StubApp.getString2("24115"), null);
        } catch (NoSuchMethodException unused) {
        }
        this.f22684b = new long[10];
        this.f22682I = C1555p.f20182a;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0238 A[Catch: Exception -> 0x0252, TRY_LEAVE, TryCatch #0 {Exception -> 0x0252, blocks: (B:33:0x0211, B:35:0x0238), top: B:32:0x0211 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r26) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.k.a(boolean):long");
    }

    public final long b() {
        this.f22682I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f22705x != -9223372036854775807L) {
            AudioTrack audioTrack = this.f22685c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.f22707z;
            }
            return Math.min(this.f22674A, this.f22707z + AbstractC1560u.R(AbstractC1560u.w(this.f22691i, AbstractC1560u.J(elapsedRealtime) - this.f22705x), this.f22688f, 1000000L, RoundingMode.UP));
        }
        if (elapsedRealtime - this.f22699r >= 5) {
            AudioTrack audioTrack2 = this.f22685c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & BodyPartID.bodyIdMax;
                if (this.f22689g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f22702u = this.f22700s;
                    }
                    playbackHeadPosition += this.f22702u;
                }
                if (AbstractC1560u.f20190a <= 29) {
                    if (playbackHeadPosition != 0 || this.f22700s <= 0 || playState != 3) {
                        this.f22706y = -9223372036854775807L;
                    } else if (this.f22706y == -9223372036854775807L) {
                        this.f22706y = elapsedRealtime;
                    }
                }
                long j = this.f22700s;
                if (j > playbackHeadPosition) {
                    if (this.f22680G) {
                        this.f22681H += j;
                        this.f22680G = false;
                    } else {
                        this.f22701t++;
                    }
                }
                this.f22700s = playbackHeadPosition;
            }
            this.f22699r = elapsedRealtime;
        }
        return this.f22700s + this.f22681H + (this.f22701t << 32);
    }

    public final boolean c(long j) {
        long a3 = a(false);
        int i3 = this.f22688f;
        int i10 = AbstractC1560u.f20190a;
        if (j > AbstractC1560u.R(a3, i3, 1000000L, RoundingMode.UP)) {
            return true;
        }
        if (this.f22689g) {
            AudioTrack audioTrack = this.f22685c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && b() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        this.f22692k = 0L;
        this.f22704w = 0;
        this.f22703v = 0;
        this.f22693l = 0L;
        this.f22676C = 0L;
        this.f22679F = 0L;
        this.j = false;
    }
}
