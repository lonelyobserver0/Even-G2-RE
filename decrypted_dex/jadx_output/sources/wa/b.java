package wa;

import aa.C0395b;
import aa.C0398e;
import java.io.BufferedInputStream;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f22187a = new ConcurrentHashMap();

    public static C0395b a(String str) {
        BufferedInputStream bufferedInputStream;
        ConcurrentHashMap concurrentHashMap = f22187a;
        C0395b c0395b = (C0395b) concurrentHashMap.get(str);
        if (c0395b != null) {
            return c0395b;
        }
        C0398e c0398e = new C0398e(0, false);
        try {
            bufferedInputStream = C0398e.i(str);
            try {
                c0398e.f9343a = false;
                C0395b p8 = c0398e.p(bufferedInputStream);
                bufferedInputStream.close();
                concurrentHashMap.put(p8.f9331b, p8);
                return p8;
            } catch (Throwable th) {
                th = th;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
        }
    }
}
