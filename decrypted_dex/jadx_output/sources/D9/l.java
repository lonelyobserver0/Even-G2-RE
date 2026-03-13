package D9;

import Qb.C0219s0;
import Qb.C0227w0;
import Qb.InterfaceC0221t0;
import Sb.p;
import Sb.q;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.NativeLoggerWrapper;
import com.stub.StubApp;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f1528a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final boolean a(LoggingLevel loggingLevel, LoggingLevel loggingLevel2) {
        Intrinsics.checkNotNullParameter(loggingLevel2, "loggingLevel");
        return j(loggingLevel2) >= j(loggingLevel);
    }

    public static final String b(String str, String str2) {
        return AbstractC1482f.k(new StringBuilder(), str2 != null ? E1.a.k(StubApp.getString2(1557), str2, StubApp.getString2(1558)) : "", str);
    }

    public static final void c(Exception exc, Function0 action) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(exc instanceof CancellationException ? true : exc instanceof q ? true : exc instanceof p)) {
            throw exc;
        }
        action.invoke();
    }

    public static final void d(String msg, String str) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(msg, "msg");
        NativeLoggerWrapper.INSTANCE.debug(b(msg, str), StubApp.getString2(1559));
    }

    public static final void e(String msg, String str) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(msg, "msg");
        NativeLoggerWrapper.INSTANCE.error(b(msg, str), StubApp.getString2(1559));
    }

    public static final void f(String msg, String str) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(msg, "msg");
        NativeLoggerWrapper.INSTANCE.info(b(msg, str), StubApp.getString2(1559));
    }

    public static final LoggingLevel g() {
        return NativeLoggerWrapper.INSTANCE.getLogLevel(StubApp.getString2(1559));
    }

    public static final void h(String msg, String str) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(msg, "msg");
        NativeLoggerWrapper.INSTANCE.warning(b(msg, str), StubApp.getString2(1559));
    }

    public static final Vb.f i(Vb.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new Vb.f(fVar.f7941a.plus(new C0227w0((InterfaceC0221t0) fVar.f7941a.get(C0219s0.f5892a))));
    }

    public static final int j(LoggingLevel loggingLevel) {
        int i3 = loggingLevel == null ? -1 : g.f1514a[loggingLevel.ordinal()];
        if (i3 == -1) {
            return 0;
        }
        int i10 = 1;
        if (i3 != 1) {
            i10 = 2;
            if (i3 != 2) {
                i10 = 3;
                if (i3 != 3) {
                    if (i3 == 4) {
                        return 4;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return i10;
    }
}
