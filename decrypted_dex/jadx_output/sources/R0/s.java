package R0;

import L0.B;
import Z9.C;
import r0.AbstractC1560u;
import sb.C1674t0;
import v0.C1830z;
import v0.SurfaceHolderCallbackC1827w;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f6060b;

    public /* synthetic */ s(C c10, int i3, long j) {
        this.f6059a = 1;
        this.f6060b = c10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C c10 = this.f6060b;
        int i3 = this.f6059a;
        c10.getClass();
        switch (i3) {
            case 0:
                int i10 = AbstractC1560u.f20190a;
                w0.c cVar = ((SurfaceHolderCallbackC1827w) c10.f9078c).f21810a.f21857t;
                cVar.J(cVar.I(), 1016, new w0.b(10));
                break;
            case 1:
                int i11 = AbstractC1560u.f20190a;
                w0.c cVar2 = ((SurfaceHolderCallbackC1827w) c10.f9078c).f21810a.f21857t;
                cVar2.J(cVar2.F((B) cVar2.f21992d.f6300e), 1018, new C1674t0(25));
                break;
            case 2:
                int i12 = AbstractC1560u.f20190a;
                w0.c cVar3 = ((SurfaceHolderCallbackC1827w) c10.f9078c).f21810a.f21857t;
                cVar3.J(cVar3.F((B) cVar3.f21992d.f6300e), 1021, new w0.b(0));
                break;
            case 3:
                int i13 = AbstractC1560u.f20190a;
                w0.c cVar4 = ((SurfaceHolderCallbackC1827w) c10.f9078c).f21810a.f21857t;
                cVar4.J(cVar4.I(), 1030, new C1674t0(15));
                break;
            case 4:
                int i14 = AbstractC1560u.f20190a;
                C1830z c1830z = ((SurfaceHolderCallbackC1827w) c10.f9078c).f21810a;
                c1830z.getClass();
                w0.c cVar5 = c1830z.f21857t;
                cVar5.J(cVar5.I(), 1015, new w0.b(6));
                break;
            default:
                int i15 = AbstractC1560u.f20190a;
                w0.c cVar6 = ((SurfaceHolderCallbackC1827w) c10.f9078c).f21810a.f21857t;
                cVar6.J(cVar6.I(), 1019, new C1674t0(24));
                break;
        }
    }

    public /* synthetic */ s(C c10, long j, int i3) {
        this.f6059a = 2;
        this.f6060b = c10;
    }

    public /* synthetic */ s(C c10, Object obj, int i3) {
        this.f6059a = i3;
        this.f6060b = c10;
    }

    public /* synthetic */ s(C c10, String str, long j, long j3) {
        this.f6059a = 0;
        this.f6060b = c10;
    }
}
