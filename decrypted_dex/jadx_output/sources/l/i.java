package l;

import n.Z0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i extends Tc.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15701c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15702d;

    /* renamed from: e, reason: collision with root package name */
    public int f15703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15704f;

    public i(j jVar) {
        this.f15701c = 0;
        this.f15704f = jVar;
        this.f15702d = false;
        this.f15703e = 0;
    }

    @Override // Tc.d, N.M
    public void a() {
        switch (this.f15701c) {
            case 1:
                this.f15702d = true;
                break;
        }
    }

    @Override // Tc.d, N.M
    public final void b() {
        switch (this.f15701c) {
            case 0:
                if (!this.f15702d) {
                    this.f15702d = true;
                    Tc.d dVar = ((j) this.f15704f).f15708d;
                    if (dVar != null) {
                        dVar.b();
                        break;
                    }
                }
                break;
            default:
                ((Z0) this.f15704f).f17488a.setVisibility(0);
                break;
        }
    }

    @Override // N.M
    public final void c() {
        switch (this.f15701c) {
            case 0:
                int i3 = this.f15703e + 1;
                this.f15703e = i3;
                j jVar = (j) this.f15704f;
                if (i3 == jVar.f15705a.size()) {
                    Tc.d dVar = jVar.f15708d;
                    if (dVar != null) {
                        dVar.c();
                    }
                    this.f15703e = 0;
                    this.f15702d = false;
                    jVar.f15709e = false;
                    break;
                }
                break;
            default:
                if (!this.f15702d) {
                    ((Z0) this.f15704f).f17488a.setVisibility(this.f15703e);
                    break;
                }
                break;
        }
    }

    public i(Z0 z02, int i3) {
        this.f15701c = 1;
        this.f15704f = z02;
        this.f15703e = i3;
        this.f15702d = false;
    }
}
