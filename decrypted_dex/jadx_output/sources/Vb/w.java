package Vb;

import a.AbstractC0378a;
import com.stub.StubApp;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7973a = 0;

    static {
        Object m40constructorimpl;
        Object m40constructorimpl2;
        Exception exc = new Exception();
        String simpleName = AbstractC0378a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement(StubApp.getString2(25775).concat(simpleName), StubApp.getString2(4956), stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            Result.Companion companion = Result.INSTANCE;
            m40constructorimpl = Result.m40constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m40constructorimpl = Result.m40constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m43exceptionOrNullimpl(m40constructorimpl) != null) {
            m40constructorimpl = StubApp.getString2(25776);
        }
        try {
            m40constructorimpl2 = Result.m40constructorimpl(w.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m40constructorimpl2 = Result.m40constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m43exceptionOrNullimpl(m40constructorimpl2) != null) {
            m40constructorimpl2 = StubApp.getString2(25777);
        }
    }
}
