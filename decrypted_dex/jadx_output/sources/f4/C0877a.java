package f4;

import java.util.Objects;

/* renamed from: f4.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0877a implements q4.d, q4.g {

    /* renamed from: a, reason: collision with root package name */
    public final q4.k f13740a;

    public /* synthetic */ C0877a(q4.k kVar) {
        this.f13740a = kVar;
    }

    @Override // q4.g
    public void c() {
        this.f13740a.f20051a.c();
    }

    @Override // q4.d
    public /* synthetic */ void j(q4.j jVar) {
        if (jVar.isSuccessful()) {
            return;
        }
        Exception exception = jVar.getException();
        Objects.requireNonNull(exception);
        this.f13740a.c(exception);
    }
}
