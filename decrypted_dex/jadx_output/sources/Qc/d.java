package Qc;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class d extends a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5908a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5909b;

    public d(String str, boolean z2) {
        this.f5908a = str;
        this.f5909b = z2;
    }

    @Override // Qc.a
    public final g a(Pc.b bVar) {
        return new e(bVar, this.f5909b);
    }

    public final String toString() {
        return this.f5908a;
    }
}
