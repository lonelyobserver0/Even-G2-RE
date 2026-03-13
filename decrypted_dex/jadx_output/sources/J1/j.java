package J1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f3324a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f3325b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f3326c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3327d;

    public j(int i3) {
        this.f3324a = new long[i3];
        this.f3325b = new boolean[i3];
        this.f3326c = new int[i3];
    }

    public final int[] a() {
        synchronized (this) {
            try {
                if (!this.f3327d) {
                    return null;
                }
                long[] jArr = this.f3324a;
                int length = jArr.length;
                int i3 = 0;
                int i10 = 0;
                while (i3 < length) {
                    int i11 = i10 + 1;
                    int i12 = 1;
                    boolean z2 = jArr[i3] > 0;
                    boolean[] zArr = this.f3325b;
                    if (z2 != zArr[i10]) {
                        int[] iArr = this.f3326c;
                        if (!z2) {
                            i12 = 2;
                        }
                        iArr[i10] = i12;
                    } else {
                        this.f3326c[i10] = 0;
                    }
                    zArr[i10] = z2;
                    i3++;
                    i10 = i11;
                }
                this.f3327d = false;
                return (int[]) this.f3326c.clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
