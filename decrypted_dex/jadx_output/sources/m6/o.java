package m6;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o extends i {

    /* renamed from: c, reason: collision with root package name */
    public boolean f17118c;

    @Override // m6.i
    public final N5.b b(N5.j jVar) {
        if (this.f17118c) {
            this.f17118c = false;
            return new N5.b(new T5.e(new N5.f(jVar)));
        }
        this.f17118c = true;
        return new N5.b(new T5.e(jVar));
    }
}
