package b3;

import kotlin.Unit;

/* renamed from: b3.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class RunnableC0511m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0498N f10640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X2.z f10641c;

    public /* synthetic */ RunnableC0511m(C0498N c0498n, X2.z zVar, int i3) {
        this.f10639a = i3;
        this.f10640b = c0498n;
        this.f10641c = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10639a) {
            case 0:
                C0498N c0498n = this.f10640b;
                X2.z zVar = this.f10641c;
                synchronized (c0498n.f10556L0) {
                    c0498n.f10549H0 = false;
                    Unit unit = Unit.INSTANCE;
                }
                c0498n.m(zVar);
                return;
            default:
                this.f10640b.m(this.f10641c);
                return;
        }
    }
}
