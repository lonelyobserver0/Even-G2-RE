package y;

import x.C1894a;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1955a extends AbstractC1956b {

    /* renamed from: e, reason: collision with root package name */
    public int f23185e;

    /* renamed from: f, reason: collision with root package name */
    public int f23186f;

    /* renamed from: g, reason: collision with root package name */
    public C1894a f23187g;

    public int getType() {
        return this.f23185e;
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f23187g.f22503m0 = z2;
    }

    public void setType(int i3) {
        this.f23185e = i3;
        this.f23186f = i3;
        if (1 == getResources().getConfiguration().getLayoutDirection()) {
            int i10 = this.f23185e;
            if (i10 == 5) {
                this.f23186f = 1;
            } else if (i10 == 6) {
                this.f23186f = 0;
            }
        } else {
            int i11 = this.f23185e;
            if (i11 == 5) {
                this.f23186f = 0;
            } else if (i11 == 6) {
                this.f23186f = 1;
            }
        }
        this.f23187g.f22501k0 = this.f23186f;
    }
}
