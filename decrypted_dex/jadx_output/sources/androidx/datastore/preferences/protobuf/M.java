package androidx.datastore.preferences.protobuf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class M implements U {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0420u f9729a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f9730b;

    /* renamed from: c, reason: collision with root package name */
    public final C0414n f9731c;

    public M(c0 c0Var, C0414n c0414n, AbstractC0420u abstractC0420u) {
        this.f9730b = c0Var;
        c0414n.getClass();
        this.f9731c = c0414n;
        this.f9729a = abstractC0420u;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void a(Object obj, Object obj2) {
        V.k(this.f9730b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void b(Object obj) {
        this.f9730b.getClass();
        b0 b0Var = ((AbstractC0420u) obj).unknownFields;
        if (b0Var.f9769e) {
            b0Var.f9769e = false;
        }
        this.f9731c.getClass();
        Xa.h.x(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final boolean c(Object obj) {
        this.f9731c.getClass();
        Xa.h.x(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final AbstractC0420u d() {
        AbstractC0420u abstractC0420u = this.f9729a;
        return abstractC0420u != null ? abstractC0420u.i() : ((AbstractC0418s) abstractC0420u.c(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void e(Object obj, D d8) {
        this.f9731c.getClass();
        Xa.h.x(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void f(Object obj, Ab.g gVar, C0413m c0413m) {
        this.f9730b.getClass();
        c0.a(obj);
        this.f9731c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final int g(AbstractC0420u abstractC0420u) {
        this.f9730b.getClass();
        b0 b0Var = abstractC0420u.unknownFields;
        int i3 = b0Var.f9768d;
        if (i3 != -1) {
            return i3;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < b0Var.f9765a; i11++) {
            int i12 = b0Var.f9766b[i11] >>> 3;
            i10 += C0411k.O(3, (C0407g) b0Var.f9767c[i11]) + C0411k.R(i12) + C0411k.Q(2) + (C0411k.Q(1) * 2);
        }
        b0Var.f9768d = i10;
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final int h(AbstractC0420u abstractC0420u) {
        this.f9730b.getClass();
        return abstractC0420u.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final boolean i(AbstractC0420u abstractC0420u, AbstractC0420u abstractC0420u2) {
        this.f9730b.getClass();
        return abstractC0420u.unknownFields.equals(abstractC0420u2.unknownFields);
    }
}
