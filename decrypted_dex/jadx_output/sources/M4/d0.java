package M4;

import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d0 extends I {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f4601c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f4602d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f4603e;

    public d0(Object[] objArr, int i3, int i10) {
        this.f4601c = objArr;
        this.f4602d = i3;
        this.f4603e = i10;
    }

    @Override // M4.D
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        hc.b.i(i3, this.f4603e);
        Object obj = this.f4601c[(i3 * 2) + this.f4602d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4603e;
    }
}
