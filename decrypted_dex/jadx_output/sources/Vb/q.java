package Vb;

import android.os.Looper;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.sequences.SequencesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Rb.d f7968a;

    static {
        String str;
        String string2 = StubApp.getString2(25770);
        int i3 = x.f7974a;
        Object obj = null;
        try {
            str = System.getProperty(string2);
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = SequencesKt.toList(SequencesKt.asSequence(Arrays.asList(new Rb.a()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((Rb.a) obj).getClass();
                    do {
                        ((Rb.a) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((Rb.a) obj) == null) {
                throw new IllegalStateException(StubApp.getString2(25772));
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException(StubApp.getString2(25771));
            }
            f7968a = new Rb.d(Rb.f.a(mainLooper), false);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
