package L0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class L implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f3919b;

    public /* synthetic */ L(Q q10, int i3) {
        this.f3918a = i3;
        this.f3919b = q10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3918a) {
            case 0:
                this.f3919b.f3949O = true;
                break;
            case 1:
                this.f3919b.y();
                break;
            default:
                Q q10 = this.f3919b;
                if (!q10.f3955Z) {
                    InterfaceC0128y interfaceC0128y = q10.f3972t;
                    interfaceC0128y.getClass();
                    interfaceC0128y.h(q10);
                    break;
                }
                break;
        }
    }
}
