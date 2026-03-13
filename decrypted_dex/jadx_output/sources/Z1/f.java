package Z1;

import D5.A;
import Ec.l;
import android.util.Log;
import com.stub.StubApp;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8954a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8955b;

    /* renamed from: c, reason: collision with root package name */
    public final a f8956c;

    /* renamed from: d, reason: collision with root package name */
    public final h f8957d;

    /* renamed from: e, reason: collision with root package name */
    public final A f8958e;

    public f(Object value, String message, a logger, h verificationMode) {
        List drop;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter("f", StubApp.getString2(3514));
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.f8954a = value;
        this.f8955b = message;
        this.f8956c = logger;
        this.f8957d = verificationMode;
        String message2 = l.g(value, message);
        Intrinsics.checkNotNullParameter(message2, "message");
        A a3 = new A(message2, 3);
        StackTraceElement[] stackTrace = a3.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        drop = ArraysKt___ArraysKt.drop(stackTrace, 2);
        a3.setStackTrace((StackTraceElement[]) drop.toArray(new StackTraceElement[0]));
        this.f8958e = a3;
    }

    @Override // Ec.l
    public final Object d() {
        int ordinal = this.f8957d.ordinal();
        if (ordinal == 0) {
            throw this.f8958e;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String message = l.g(this.f8954a, this.f8955b);
        this.f8956c.getClass();
        String tag = StubApp.getString2(4931);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d(tag, message);
        return null;
    }

    @Override // Ec.l
    public final l t(String message, Function1 condition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return this;
    }
}
