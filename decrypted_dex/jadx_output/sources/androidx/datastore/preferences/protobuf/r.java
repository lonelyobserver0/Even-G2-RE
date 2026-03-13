package androidx.datastore.preferences.protobuf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r implements J {

    /* renamed from: b, reason: collision with root package name */
    public static final r f9848b = new r(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9849a;

    public /* synthetic */ r(int i3) {
        this.f9849a = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public final T a(Class cls) {
        switch (this.f9849a) {
            case 0:
                if (!AbstractC0420u.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (T) AbstractC0420u.d(cls.asSubclass(AbstractC0420u.class)).c(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public final boolean b(Class cls) {
        switch (this.f9849a) {
            case 0:
                return AbstractC0420u.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
