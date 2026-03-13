package l4;

import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class L0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1224z0 f16147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f16148c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f16149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P0 f16150e;

    public L0(P0 p02, C1224z0 c1224z0, long j, boolean z2, int i3) {
        this.f16146a = i3;
        switch (i3) {
            case 1:
                this.f16147b = c1224z0;
                this.f16148c = j;
                this.f16149d = z2;
                Objects.requireNonNull(p02);
                this.f16150e = p02;
                break;
            default:
                this.f16147b = c1224z0;
                this.f16148c = j;
                this.f16149d = z2;
                Objects.requireNonNull(p02);
                this.f16150e = p02;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16146a) {
            case 0:
                C1224z0 c1224z0 = this.f16147b;
                P0 p02 = this.f16150e;
                p02.o(c1224z0);
                p02.z(c1224z0, this.f16148c, this.f16149d);
                break;
            default:
                C1224z0 c1224z02 = this.f16147b;
                P0 p03 = this.f16150e;
                p03.o(c1224z02);
                p03.z(c1224z02, this.f16148c, this.f16149d);
                break;
        }
    }
}
