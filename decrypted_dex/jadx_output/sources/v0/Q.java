package v0;

import L0.C0123t;
import android.util.Pair;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class Q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f21637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f21638c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0123t f21639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ I0.g f21640e;

    public /* synthetic */ Q(T t3, Pair pair, C0123t c0123t, I0.g gVar, int i3) {
        this.f21636a = i3;
        this.f21637b = t3;
        this.f21638c = pair;
        this.f21639d = c0123t;
        this.f21640e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21636a) {
            case 0:
                w0.c cVar = (w0.c) this.f21637b.f21648b.f5636i;
                Pair pair = this.f21638c;
                cVar.m(((Integer) pair.first).intValue(), (L0.B) pair.second, this.f21639d, this.f21640e);
                break;
            case 1:
                w0.c cVar2 = (w0.c) this.f21637b.f21648b.f5636i;
                Pair pair2 = this.f21638c;
                cVar2.C(((Integer) pair2.first).intValue(), (L0.B) pair2.second, this.f21639d, this.f21640e);
                break;
            default:
                w0.c cVar3 = (w0.c) this.f21637b.f21648b.f5636i;
                Pair pair3 = this.f21638c;
                cVar3.B(((Integer) pair3.first).intValue(), (L0.B) pair3.second, this.f21639d, this.f21640e);
                break;
        }
    }
}
