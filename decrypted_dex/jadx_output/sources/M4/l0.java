package M4;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l0 extends M {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f4636d;

    public l0(Object obj) {
        obj.getClass();
        this.f4636d = obj;
    }

    @Override // M4.M, M4.D
    public final I a() {
        return I.q(this.f4636d);
    }

    @Override // M4.D
    public final int b(int i3, Object[] objArr) {
        objArr[i3] = this.f4636d;
        return i3 + 1;
    }

    @Override // M4.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4636d.equals(obj);
    }

    @Override // M4.D
    public final boolean g() {
        return false;
    }

    @Override // M4.M, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4636d.hashCode();
    }

    @Override // M4.D
    /* renamed from: i */
    public final n0 iterator() {
        return new P(this.f4636d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return StubApp.getString2(1557) + this.f4636d.toString() + ']';
    }
}
