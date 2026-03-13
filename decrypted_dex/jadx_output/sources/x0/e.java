package x0;

import o0.C1438m;
import r0.AbstractC1560u;
import sb.C1674t0;
import v0.C1803F;
import v0.C1812g;
import v0.C1830z;
import v0.SurfaceHolderCallbackC1827w;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1803F f22654b;

    public /* synthetic */ e(C1803F c1803f, int i3, long j, long j3) {
        this.f22653a = 9;
        this.f22654b = c1803f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = 22;
        C1803F c1803f = this.f22654b;
        int i10 = this.f22653a;
        c1803f.getClass();
        switch (i10) {
            case 0:
                int i11 = AbstractC1560u.f20190a;
                C1830z c1830z = ((SurfaceHolderCallbackC1827w) c1803f.f21582b).f21810a;
                c1830z.getClass();
                w0.c cVar = c1830z.f21857t;
                cVar.J(cVar.I(), 1007, new w0.b(i3));
                break;
            case 1:
                int i12 = AbstractC1560u.f20190a;
                w0.c cVar2 = ((SurfaceHolderCallbackC1827w) c1803f.f21582b).f21810a.f21857t;
                cVar2.J(cVar2.I(), 1031, new w0.b(20));
                break;
            case 2:
                int i13 = AbstractC1560u.f20190a;
                w0.c cVar3 = ((SurfaceHolderCallbackC1827w) c1803f.f21582b).f21810a.f21857t;
                cVar3.J(cVar3.I(), 1032, new w0.b(21));
                break;
            case 3:
                int i14 = AbstractC1560u.f20190a;
                w0.c cVar4 = ((SurfaceHolderCallbackC1827w) c1803f.f21582b).f21810a.f21857t;
                cVar4.J(cVar4.I(), 1029, new w0.b(9));
                break;
            case 4:
                int i15 = AbstractC1560u.f20190a;
                w0.c cVar5 = ((SurfaceHolderCallbackC1827w) c1803f.f21582b).f21810a.f21857t;
                cVar5.J(cVar5.I(), 1014, new w0.b(11));
                break;
            case 5:
                int i16 = AbstractC1560u.f20190a;
                C1830z c1830z2 = ((SurfaceHolderCallbackC1827w) c1803f.f21582b).f21810a;
                c1830z2.getClass();
                w0.c cVar6 = c1830z2.f21857t;
                cVar6.J(cVar6.I(), 1009, new w0.b(5));
                break;
            case 6:
                int i17 = AbstractC1560u.f20190a;
                w0.c cVar7 = ((SurfaceHolderCallbackC1827w) c1803f.f21582b).f21810a.f21857t;
                cVar7.J(cVar7.I(), 1008, new C1674t0(i3));
                break;
            case 7:
                int i18 = AbstractC1560u.f20190a;
                w0.c cVar8 = ((SurfaceHolderCallbackC1827w) c1803f.f21582b).f21810a.f21857t;
                cVar8.J(cVar8.I(), 1012, new w0.b(24));
                break;
            case 8:
                int i19 = AbstractC1560u.f20190a;
                w0.c cVar9 = ((SurfaceHolderCallbackC1827w) c1803f.f21582b).f21810a.f21857t;
                cVar9.J(cVar9.I(), 1010, new C1674t0(19));
                break;
            default:
                int i20 = AbstractC1560u.f20190a;
                w0.c cVar10 = ((SurfaceHolderCallbackC1827w) c1803f.f21582b).f21810a.f21857t;
                cVar10.J(cVar10.I(), 1011, new w0.b(14));
                break;
        }
    }

    public /* synthetic */ e(C1803F c1803f, long j) {
        this.f22653a = 8;
        this.f22654b = c1803f;
    }

    public /* synthetic */ e(C1803F c1803f, Object obj, int i3) {
        this.f22653a = i3;
        this.f22654b = c1803f;
    }

    public /* synthetic */ e(C1803F c1803f, String str, long j, long j3) {
        this.f22653a = 6;
        this.f22654b = c1803f;
    }

    public /* synthetic */ e(C1803F c1803f, C1438m c1438m, C1812g c1812g) {
        this.f22653a = 5;
        this.f22654b = c1803f;
    }
}
