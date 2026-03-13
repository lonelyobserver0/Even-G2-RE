package E7;

import com.mapbox.common.b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1927a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArraySet f1928b = new CopyOnWriteArraySet();

    public static boolean a() {
        return !f1928b.isEmpty();
    }

    public static void b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator it = f1928b.iterator();
        if (it.hasNext()) {
            throw b.e(it);
        }
    }

    public static void c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator it = f1928b.iterator();
        if (it.hasNext()) {
            throw b.e(it);
        }
    }
}
