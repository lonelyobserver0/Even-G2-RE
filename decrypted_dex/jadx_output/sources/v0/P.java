package v0;

import android.util.Pair;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class P implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f21633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f21634c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I0.g f21635d;

    public /* synthetic */ P(T t3, Pair pair, I0.g gVar, int i3) {
        this.f21632a = i3;
        this.f21633b = t3;
        this.f21634c = pair;
        this.f21635d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21632a) {
            case 0:
                w0.c cVar = (w0.c) this.f21633b.f21648b.f5636i;
                Pair pair = this.f21634c;
                int intValue = ((Integer) pair.first).intValue();
                L0.B b2 = (L0.B) pair.second;
                b2.getClass();
                cVar.o(intValue, b2, this.f21635d);
                break;
            default:
                w0.c cVar2 = (w0.c) this.f21633b.f21648b.f5636i;
                Pair pair2 = this.f21634c;
                cVar2.n(((Integer) pair2.first).intValue(), (L0.B) pair2.second, this.f21635d);
                break;
        }
    }
}
