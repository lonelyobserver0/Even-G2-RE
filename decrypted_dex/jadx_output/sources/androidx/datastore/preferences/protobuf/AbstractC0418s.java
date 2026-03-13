package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0418s implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0420u f9850a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0420u f9851b;

    public AbstractC0418s(AbstractC0420u abstractC0420u) {
        this.f9850a = abstractC0420u;
        if (abstractC0420u.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f9851b = abstractC0420u.i();
    }

    public final AbstractC0420u a() {
        AbstractC0420u b2 = b();
        b2.getClass();
        if (AbstractC0420u.f(b2, true)) {
            return b2;
        }
        throw new a0();
    }

    public final AbstractC0420u b() {
        if (!this.f9851b.g()) {
            return this.f9851b;
        }
        AbstractC0420u abstractC0420u = this.f9851b;
        abstractC0420u.getClass();
        Q q10 = Q.f9734c;
        q10.getClass();
        q10.a(abstractC0420u.getClass()).b(abstractC0420u);
        abstractC0420u.h();
        return this.f9851b;
    }

    public final void c() {
        if (this.f9851b.g()) {
            return;
        }
        AbstractC0420u i3 = this.f9850a.i();
        AbstractC0420u abstractC0420u = this.f9851b;
        Q q10 = Q.f9734c;
        q10.getClass();
        q10.a(i3.getClass()).a(i3, abstractC0420u);
        this.f9851b = i3;
    }

    public final Object clone() {
        AbstractC0418s abstractC0418s = (AbstractC0418s) this.f9850a.c(5);
        abstractC0418s.f9851b = b();
        return abstractC0418s;
    }
}
