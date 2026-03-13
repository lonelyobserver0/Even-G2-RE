package androidx.datastore.preferences.protobuf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class H {
    public static G a(Object obj, Object obj2) {
        G g10 = (G) obj;
        G g11 = (G) obj2;
        if (!g11.isEmpty()) {
            if (!g10.f9711a) {
                g10 = g10.b();
            }
            g10.a();
            if (!g11.isEmpty()) {
                g10.putAll(g11);
            }
        }
        return g10;
    }
}
