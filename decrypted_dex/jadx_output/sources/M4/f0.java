package M4;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f0 extends M {
    public static final Object[] j;

    /* renamed from: k, reason: collision with root package name */
    public static final f0 f4614k;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f4615d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f4616e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f4617f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f4618g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f4619h;

    static {
        Object[] objArr = new Object[0];
        j = objArr;
        f4614k = new f0(objArr, objArr, 0, 0, 0);
    }

    public f0(Object[] objArr, Object[] objArr2, int i3, int i10, int i11) {
        this.f4615d = objArr;
        this.f4616e = i3;
        this.f4617f = objArr2;
        this.f4618g = i10;
        this.f4619h = i11;
    }

    @Override // M4.D
    public final int b(int i3, Object[] objArr) {
        Object[] objArr2 = this.f4615d;
        int i10 = this.f4619h;
        System.arraycopy(objArr2, 0, objArr, i3, i10);
        return i3 + i10;
    }

    @Override // M4.D
    public final Object[] c() {
        return this.f4615d;
    }

    @Override // M4.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f4617f;
            if (objArr.length != 0) {
                int r8 = r.r(obj);
                while (true) {
                    int i3 = r8 & this.f4618g;
                    Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    r8 = i3 + 1;
                }
            }
        }
        return false;
    }

    @Override // M4.D
    public final int d() {
        return this.f4619h;
    }

    @Override // M4.D
    public final int f() {
        return 0;
    }

    @Override // M4.D
    public final boolean g() {
        return false;
    }

    @Override // M4.M, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4616e;
    }

    @Override // M4.D
    /* renamed from: i */
    public final n0 iterator() {
        return a().listIterator(0);
    }

    @Override // M4.M
    public final I n() {
        return I.j(this.f4619h, this.f4615d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4619h;
    }
}
