package androidx.datastore.preferences.protobuf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C implements J {

    /* renamed from: a, reason: collision with root package name */
    public J[] f9703a;

    @Override // androidx.datastore.preferences.protobuf.J
    public final T a(Class cls) {
        for (J j : this.f9703a) {
            if (j.b(cls)) {
                return j.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public final boolean b(Class cls) {
        for (J j : this.f9703a) {
            if (j.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
