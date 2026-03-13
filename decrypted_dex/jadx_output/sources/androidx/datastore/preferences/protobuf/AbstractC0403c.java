package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0403c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f9770a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f9771b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f9770a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f9771b = cls2 != null;
    }

    public static boolean a() {
        return (f9770a == null || f9771b) ? false : true;
    }
}
