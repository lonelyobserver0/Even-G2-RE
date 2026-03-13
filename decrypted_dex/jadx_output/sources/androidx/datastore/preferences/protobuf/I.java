package androidx.datastore.preferences.protobuf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final H f9712a;

    /* renamed from: b, reason: collision with root package name */
    public static final H f9713b;

    static {
        H h2;
        Q q10 = Q.f9734c;
        try {
            h2 = (H) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            h2 = null;
        }
        f9712a = h2;
        f9713b = new H();
    }
}
