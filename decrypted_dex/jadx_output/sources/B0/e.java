package B0;

import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends M0.e {

    /* renamed from: k, reason: collision with root package name */
    public byte[] f414k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f415l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f416m;

    @Override // P0.l
    public final void l() {
        try {
            this.j.n(this.f4456b);
            int i3 = 0;
            int i10 = 0;
            while (i3 != -1 && !this.f415l) {
                byte[] bArr = this.f414k;
                if (bArr.length < i10 + 16384) {
                    this.f414k = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i3 = this.j.read(this.f414k, i10, 16384);
                if (i3 != -1) {
                    i10 += i3;
                }
            }
            if (!this.f415l) {
                this.f416m = Arrays.copyOf(this.f414k, i10);
            }
            W.a.a(this.j);
        } catch (Throwable th) {
            W.a.a(this.j);
            throw th;
        }
    }

    @Override // P0.l
    public final void o() {
        this.f415l = true;
    }
}
