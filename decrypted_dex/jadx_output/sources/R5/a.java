package R5;

import android.os.Handler;
import o0.InterfaceC1410G;
import r0.AbstractC1560u;
import r0.InterfaceC1546g;
import v0.C1803F;
import v0.C1830z;
import v0.SurfaceHolderCallbackC1827w;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6210a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6211b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6212c;

    public /* synthetic */ a(int i3, Object obj, boolean z2) {
        this.f6210a = i3;
        this.f6212c = obj;
        this.f6211b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final boolean z2 = this.f6211b;
        Object obj = this.f6212c;
        switch (this.f6210a) {
            case 0:
                ((b) obj).f6213a.e(z2);
                break;
            case 1:
                Mb.a aVar = (Mb.a) ((f) obj).f6219b;
                aVar.f4723b = z2;
                if (aVar.f4722a) {
                    ((Handler) aVar.f4726e).removeCallbacksAndMessages(null);
                    if (aVar.f4723b) {
                        ((Handler) aVar.f4726e).postDelayed((m6.f) aVar.f4727f, 300000L);
                        break;
                    }
                }
                break;
            case 2:
                ((n6.f) obj).f17822c.e(z2);
                break;
            default:
                C1803F c1803f = (C1803F) obj;
                c1803f.getClass();
                int i3 = AbstractC1560u.f20190a;
                C1830z c1830z = ((SurfaceHolderCallbackC1827w) c1803f.f21582b).f21810a;
                if (c1830z.f21848o0 != z2) {
                    c1830z.f21848o0 = z2;
                    c1830z.f21844m.e(23, new InterfaceC1546g() { // from class: v0.v
                        @Override // r0.InterfaceC1546g
                        /* renamed from: invoke */
                        public final void mo0invoke(Object obj2) {
                            ((InterfaceC1410G) obj2).t(z2);
                        }
                    });
                    break;
                }
                break;
        }
    }
}
