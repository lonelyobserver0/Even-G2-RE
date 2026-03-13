package Rb;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.stub.StubApp;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class f {
    private static volatile Choreographer choreographer;

    static {
        Object m40constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m40constructorimpl = Result.m40constructorimpl(new d(a(Looper.getMainLooper()), false));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m40constructorimpl = Result.m40constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m46isFailureimpl(m40constructorimpl)) {
            m40constructorimpl = null;
        }
    }

    public static final Handler a(Looper looper) {
        Object invoke = Handler.class.getDeclaredMethod(StubApp.getString2(25544), Looper.class).invoke(null, looper);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
