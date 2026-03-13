package T1;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import t.C1692e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7143a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f7144b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f7145c = new ArrayList();

    public static C1692e a() {
        C1692e c1692e;
        ThreadLocal threadLocal = f7144b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c1692e = (C1692e) weakReference.get()) != null) {
            return c1692e;
        }
        C1692e c1692e2 = new C1692e(0);
        threadLocal.set(new WeakReference(c1692e2));
        return c1692e2;
    }
}
