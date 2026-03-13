package Y;

import java.nio.ByteBuffer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f8676a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final r f8677b;

    /* renamed from: c, reason: collision with root package name */
    public r f8678c;

    /* renamed from: d, reason: collision with root package name */
    public r f8679d;

    /* renamed from: e, reason: collision with root package name */
    public int f8680e;

    /* renamed from: f, reason: collision with root package name */
    public int f8681f;

    public o(r rVar) {
        this.f8677b = rVar;
        this.f8678c = rVar;
    }

    public final void a() {
        this.f8676a = 1;
        this.f8678c = this.f8677b;
        this.f8681f = 0;
    }

    public final boolean b() {
        Z.a b2 = this.f8678c.f8692b.b();
        int a3 = b2.a(6);
        return !(a3 == 0 || ((ByteBuffer) b2.f4812d).get(a3 + b2.f4809a) == 0) || this.f8680e == 65039;
    }
}
