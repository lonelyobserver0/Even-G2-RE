package b3;

/* renamed from: b3.n, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class RunnableC0512n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0498N f10643b;

    public /* synthetic */ RunnableC0512n(C0498N c0498n, int i3) {
        this.f10642a = i3;
        this.f10643b = c0498n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10642a) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                C0498N c0498n = this.f10643b;
                if (currentTimeMillis - c0498n.f10534A >= c0498n.f10536B) {
                    c0498n.f10604z = false;
                    break;
                }
                break;
            default:
                C0498N c0498n2 = this.f10643b;
                c0498n2.f10538C = 0L;
                c0498n2.B(true);
                break;
        }
    }
}
