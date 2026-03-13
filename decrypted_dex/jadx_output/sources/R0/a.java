package R0;

import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f5921a;

    /* renamed from: b, reason: collision with root package name */
    public long f5922b;

    /* renamed from: c, reason: collision with root package name */
    public long f5923c;

    /* renamed from: d, reason: collision with root package name */
    public long f5924d;

    /* renamed from: e, reason: collision with root package name */
    public long f5925e;

    /* renamed from: f, reason: collision with root package name */
    public long f5926f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f5927g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f5928h;

    public final boolean a() {
        return this.f5924d > 15 && this.f5928h == 0;
    }

    public final void b(long j) {
        long j3 = this.f5924d;
        if (j3 == 0) {
            this.f5921a = j;
        } else if (j3 == 1) {
            long j10 = j - this.f5921a;
            this.f5922b = j10;
            this.f5926f = j10;
            this.f5925e = 1L;
        } else {
            long j11 = j - this.f5923c;
            int i3 = (int) (j3 % 15);
            long abs = Math.abs(j11 - this.f5922b);
            boolean[] zArr = this.f5927g;
            if (abs <= 1000000) {
                this.f5925e++;
                this.f5926f += j11;
                if (zArr[i3]) {
                    zArr[i3] = false;
                    this.f5928h--;
                }
            } else if (!zArr[i3]) {
                zArr[i3] = true;
                this.f5928h++;
            }
        }
        this.f5924d++;
        this.f5923c = j;
    }

    public final void c() {
        this.f5924d = 0L;
        this.f5925e = 0L;
        this.f5926f = 0L;
        this.f5928h = 0;
        Arrays.fill(this.f5927g, false);
    }
}
