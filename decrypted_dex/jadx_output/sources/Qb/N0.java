package Qb;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class N0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f5826a = new ThreadLocal();

    public static AbstractC0186b0 a() {
        ThreadLocal threadLocal = f5826a;
        AbstractC0186b0 abstractC0186b0 = (AbstractC0186b0) threadLocal.get();
        if (abstractC0186b0 != null) {
            return abstractC0186b0;
        }
        C0195g c0195g = new C0195g(Thread.currentThread());
        threadLocal.set(c0195g);
        return c0195g;
    }
}
