package f4;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class x extends y {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f13790c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f13791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f13792e;

    public x(y yVar, int i3, int i10) {
        this.f13792e = yVar;
        this.f13790c = i3;
        this.f13791d = i10;
    }

    @Override // f4.v
    public final Object[] a() {
        return this.f13792e.a();
    }

    @Override // f4.v
    public final int b() {
        return this.f13792e.b() + this.f13790c;
    }

    @Override // f4.v
    public final int c() {
        return this.f13792e.b() + this.f13790c + this.f13791d;
    }

    @Override // f4.v
    public final boolean d() {
        return true;
    }

    @Override // f4.y, java.util.List
    /* renamed from: g */
    public final y subList(int i3, int i10) {
        a4.f.T(i3, i10, this.f13791d);
        int i11 = this.f13790c;
        return this.f13792e.subList(i3 + i11, i10 + i11);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        a4.f.O(i3, this.f13791d);
        return this.f13792e.get(i3 + this.f13790c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13791d;
    }
}
