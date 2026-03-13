package j0;

import c5.C;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1071a {

    /* renamed from: a, reason: collision with root package name */
    public final C f15220a = new C(7);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f15221b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f15222c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f15223d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }
}
