package R0;

import o0.C1425W;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f5987b;

    public /* synthetic */ i(j jVar, u uVar, int i3) {
        this.f5986a = i3;
        this.f5987b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5986a) {
            case 0:
                this.f5987b.getClass();
                break;
            case 1:
                this.f5987b.e();
                break;
            default:
                this.f5987b.m();
                break;
        }
    }

    public /* synthetic */ i(j jVar, u uVar, C1425W c1425w) {
        this.f5986a = 0;
        this.f5987b = uVar;
    }
}
