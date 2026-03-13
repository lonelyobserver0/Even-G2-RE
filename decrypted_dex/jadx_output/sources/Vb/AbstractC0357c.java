package Vb;

import com.stub.StubApp;
import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: Vb.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractC0357c {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f7937a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod(StubApp.getString2("25755"), Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f7937a = method;
    }
}
