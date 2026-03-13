package Za;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f9187b;

    public /* synthetic */ l(m mVar, int i3) {
        this.f9186a = i3;
        this.f9187b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9186a) {
            case 0:
                this.f9187b.b();
                break;
            default:
                this.f9187b.b();
                break;
        }
    }
}
