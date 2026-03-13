package c5;

import android.util.Log;
import com.stub.StubApp;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final A0.c f10947a;

    /* renamed from: b, reason: collision with root package name */
    public final A3.s f10948b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f10949c;

    /* renamed from: d, reason: collision with root package name */
    public final Z4.a f10950d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f10951e = new AtomicBoolean(false);

    public t(A0.c cVar, A3.s sVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Z4.a aVar) {
        this.f10947a = cVar;
        this.f10948b = sVar;
        this.f10949c = uncaughtExceptionHandler;
        this.f10950d = aVar;
    }

    public final boolean a(Thread thread, Throwable th) {
        String string2 = StubApp.getString2(280);
        if (thread == null) {
            Log.e(string2, StubApp.getString2(9581), null);
            return false;
        }
        if (th == null) {
            Log.e(string2, StubApp.getString2(9582), null);
            return false;
        }
        if (!this.f10950d.b()) {
            return true;
        }
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, StubApp.getString2(9583), null);
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        String string2 = StubApp.getString2(9584);
        String string22 = StubApp.getString2(9585);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f10949c;
        String string23 = StubApp.getString2(280);
        AtomicBoolean atomicBoolean = this.f10951e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th)) {
                    A0.c cVar = this.f10947a;
                    ((l) cVar.f29a).g(this.f10948b, thread, th, false);
                } else {
                    String string24 = StubApp.getString2("9586");
                    if (Log.isLoggable(string23, 3)) {
                        Log.d(string23, string24, null);
                    }
                }
                if (uncaughtExceptionHandler != null) {
                    if (Log.isLoggable(string23, 3)) {
                        Log.d(string23, string22, null);
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    if (Log.isLoggable(string23, 3)) {
                        Log.d(string23, string2, null);
                    }
                    System.exit(1);
                }
                atomicBoolean.set(false);
            } catch (Exception e10) {
                Z4.c cVar2 = Z4.c.f8980a;
                String string25 = StubApp.getString2("9587");
                if (cVar2.b(6)) {
                    Log.e(string23, string25, e10);
                }
                if (uncaughtExceptionHandler != null) {
                    cVar2.c(string22);
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    cVar2.c(string2);
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable(string23, 3)) {
                    Log.d(string23, string22, null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                if (Log.isLoggable(string23, 3)) {
                    Log.d(string23, string2, null);
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th2;
        }
    }
}
