package o0;

import com.stub.StubApp;
import java.util.HashSet;

/* renamed from: o0.w, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1448w {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f18254a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f18255b = StubApp.getString2(21599);

    public static synchronized void a(String str) {
        synchronized (AbstractC1448w.class) {
            if (f18254a.add(str)) {
                f18255b += StubApp.getString2("81") + str;
            }
        }
    }
}
