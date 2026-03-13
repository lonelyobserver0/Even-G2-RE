package i;

import N.I;
import N.L;
import android.view.ViewGroup;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f14618b;

    public /* synthetic */ m(v vVar, int i3) {
        this.f14617a = i3;
        this.f14618b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f14617a) {
            case 0:
                v vVar = this.f14618b;
                if ((vVar.f14685t0 & 1) != 0) {
                    vVar.v(0);
                }
                if ((vVar.f14685t0 & 4096) != 0) {
                    vVar.v(108);
                }
                vVar.f14683s0 = false;
                vVar.f14685t0 = 0;
                break;
            default:
                v vVar2 = this.f14618b;
                vVar2.f14695z.showAtLocation(vVar2.f14693y, 55, 0, 0);
                L l9 = vVar2.f14650B;
                if (l9 != null) {
                    l9.b();
                }
                if (!(vVar2.f14651C && (viewGroup = vVar2.f14652D) != null && viewGroup.isLaidOut())) {
                    vVar2.f14693y.setAlpha(1.0f);
                    vVar2.f14693y.setVisibility(0);
                    break;
                } else {
                    vVar2.f14693y.setAlpha(0.0f);
                    L a3 = I.a(vVar2.f14693y);
                    a3.a(1.0f);
                    vVar2.f14650B = a3;
                    a3.d(new n(this, 0));
                    break;
                }
        }
    }
}
