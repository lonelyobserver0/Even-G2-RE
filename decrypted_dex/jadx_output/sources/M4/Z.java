package M4;

import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Z extends I {

    /* renamed from: e, reason: collision with root package name */
    public static final Z f4578e = new Z(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f4579c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f4580d;

    public Z(Object[] objArr, int i3) {
        this.f4579c = objArr;
        this.f4580d = i3;
    }

    @Override // M4.I, M4.D
    public final int b(int i3, Object[] objArr) {
        Object[] objArr2 = this.f4579c;
        int i10 = this.f4580d;
        System.arraycopy(objArr2, 0, objArr, i3, i10);
        return i3 + i10;
    }

    @Override // M4.D
    public final Object[] c() {
        return this.f4579c;
    }

    @Override // M4.D
    public final int d() {
        return this.f4580d;
    }

    @Override // M4.D
    public final int f() {
        return 0;
    }

    @Override // M4.D
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        hc.b.i(i3, this.f4580d);
        Object obj = this.f4579c[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4580d;
    }
}
