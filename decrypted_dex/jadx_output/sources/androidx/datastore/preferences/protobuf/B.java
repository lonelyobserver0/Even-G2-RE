package androidx.datastore.preferences.protobuf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final A f9701a;

    /* renamed from: b, reason: collision with root package name */
    public static final A f9702b;

    static {
        A a3;
        Q q10 = Q.f9734c;
        try {
            a3 = (A) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            a3 = null;
        }
        f9701a = a3;
        f9702b = new A();
    }
}
