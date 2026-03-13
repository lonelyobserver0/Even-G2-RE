package M4;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a0 extends I {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f4586c;

    public a0(b0 b0Var) {
        this.f4586c = b0Var;
    }

    @Override // M4.D
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        b0 b0Var = this.f4586c;
        hc.b.i(i3, b0Var.f4590f);
        int i10 = i3 * 2;
        Object[] objArr = b0Var.f4589e;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4586c.f4590f;
    }
}
