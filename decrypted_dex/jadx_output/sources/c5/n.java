package c5;

import e5.InterfaceC0845d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f10915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10916c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10917d;

    public /* synthetic */ n(r rVar, long j, String str, int i3) {
        this.f10914a = i3;
        this.f10915b = rVar;
        this.f10916c = j;
        this.f10917d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10914a) {
            case 0:
                l lVar = this.f10915b.f10932h;
                t tVar = lVar.f10905n;
                if (tVar == null || !tVar.f10951e.get()) {
                    ((InterfaceC0845d) lVar.f10901i.f13615b).d(this.f10916c, this.f10917d);
                    break;
                }
                break;
            default:
                r rVar = this.f10915b;
                rVar.f10939p.f13423b.a(new n(rVar, this.f10916c, this.f10917d, 0));
                break;
        }
    }
}
