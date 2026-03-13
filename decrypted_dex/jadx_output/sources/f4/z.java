package f4;

import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class z extends y {

    /* renamed from: e, reason: collision with root package name */
    public static final z f13794e = new z(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f13795c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f13796d;

    public z(Object[] objArr, int i3) {
        this.f13795c = objArr;
        this.f13796d = i3;
    }

    @Override // f4.v
    public final Object[] a() {
        return this.f13795c;
    }

    @Override // f4.v
    public final int b() {
        return 0;
    }

    @Override // f4.v
    public final int c() {
        return this.f13796d;
    }

    @Override // f4.v
    public final boolean d() {
        return false;
    }

    @Override // f4.y, f4.v
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f13795c;
        int i3 = this.f13796d;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        a4.f.O(i3, this.f13796d);
        Object obj = this.f13795c[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13796d;
    }
}
