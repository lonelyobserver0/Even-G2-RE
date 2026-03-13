package O9;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5311c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f5312d;

    public g(i iVar, String str, String str2, Object obj) {
        this.f5312d = iVar;
        this.f5309a = str;
        this.f5310b = str2;
        this.f5311c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5312d.f5314a.error(this.f5309a, this.f5310b, this.f5311c);
    }
}
