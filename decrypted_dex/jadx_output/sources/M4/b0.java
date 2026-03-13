package M4;

import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b0 extends M {

    /* renamed from: d, reason: collision with root package name */
    public final transient e0 f4588d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f4589e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f4590f;

    public b0(e0 e0Var, Object[] objArr, int i3) {
        this.f4588d = e0Var;
        this.f4589e = objArr;
        this.f4590f = i3;
    }

    @Override // M4.D
    public final int b(int i3, Object[] objArr) {
        return a().b(i3, objArr);
    }

    @Override // M4.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f4588d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // M4.D
    public final boolean g() {
        return true;
    }

    @Override // M4.D
    /* renamed from: i */
    public final n0 iterator() {
        return a().listIterator(0);
    }

    @Override // M4.M
    public final I n() {
        return new a0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4590f;
    }
}
