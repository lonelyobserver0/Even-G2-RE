package M4;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c0 extends M {

    /* renamed from: d, reason: collision with root package name */
    public final transient e0 f4595d;

    /* renamed from: e, reason: collision with root package name */
    public final transient d0 f4596e;

    public c0(e0 e0Var, d0 d0Var) {
        this.f4595d = e0Var;
        this.f4596e = d0Var;
    }

    @Override // M4.M, M4.D
    public final I a() {
        return this.f4596e;
    }

    @Override // M4.D
    public final int b(int i3, Object[] objArr) {
        return this.f4596e.b(i3, objArr);
    }

    @Override // M4.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4595d.get(obj) != null;
    }

    @Override // M4.D
    public final boolean g() {
        return true;
    }

    @Override // M4.D
    /* renamed from: i */
    public final n0 iterator() {
        return this.f4596e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4595d.f4612f;
    }
}
