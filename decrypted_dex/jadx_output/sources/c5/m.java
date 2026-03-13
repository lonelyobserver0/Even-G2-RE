package c5;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f10912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A3.s f10913c;

    public /* synthetic */ m(r rVar, A3.s sVar, int i3) {
        this.f10911a = i3;
        this.f10912b = rVar;
        this.f10913c = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10911a) {
            case 0:
                this.f10912b.a(this.f10913c);
                break;
            default:
                this.f10912b.a(this.f10913c);
                break;
        }
    }
}
