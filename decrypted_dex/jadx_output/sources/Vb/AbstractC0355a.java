package Vb;

import Qb.AbstractC0186b0;
import Qb.AbstractC0231z;
import Qb.C0219s0;
import Qb.C0220t;
import Qb.D0;
import Qb.E;
import Qb.InterfaceC0221t0;
import Qb.N0;
import Qb.T0;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: Vb.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractC0355a {

    /* renamed from: b, reason: collision with root package name */
    public static final F5.c f7933b;

    /* renamed from: c, reason: collision with root package name */
    public static final F5.c f7934c;

    /* renamed from: a, reason: collision with root package name */
    public static final F5.c f7932a = new F5.c(StubApp.getString2(25745), 24);

    /* renamed from: d, reason: collision with root package name */
    public static final F5.c f7935d = new F5.c(StubApp.getString2(25747), 24);

    static {
        int i3 = 24;
        f7933b = new F5.c(StubApp.getString2(8640), i3);
        f7934c = new F5.c(StubApp.getString2(25746), i3);
    }

    public static final void a(int i3) {
        if (i3 < 1) {
            throw new IllegalArgumentException(i2.u.p(i3, StubApp.getString2(25748)).toString());
        }
    }

    public static final v b(Object obj) {
        if (obj == AbstractC0358d.f7938a) {
            throw new IllegalStateException(StubApp.getString2(25749));
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (v) obj;
    }

    public static final void c(CoroutineContext coroutineContext, Throwable th) {
        Throwable runtimeException;
        Iterator it = g.f7942a.iterator();
        while (it.hasNext()) {
            try {
                ((E) it.next()).handleException(coroutineContext, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException(StubApp.getString2(25468), th2);
                    ExceptionsKt.addSuppressed(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            ExceptionsKt.addSuppressed(th, new h(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean d(Object obj) {
        return obj == AbstractC0358d.f7938a;
    }

    public static final Object e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void f(Object obj, Continuation continuation) {
        if (!(continuation instanceof i)) {
            continuation.resumeWith(obj);
            return;
        }
        i iVar = (i) continuation;
        Throwable m43exceptionOrNullimpl = Result.m43exceptionOrNullimpl(obj);
        Object c0220t = m43exceptionOrNullimpl == null ? obj : new C0220t(m43exceptionOrNullimpl, false);
        Qb.C c10 = iVar.f7945d;
        Continuation continuation2 = iVar.f7946e;
        if (c10.isDispatchNeeded(continuation2.getContext())) {
            iVar.f7947f = c0220t;
            iVar.f5836c = 1;
            iVar.f7945d.dispatch(continuation2.getContext(), iVar);
            return;
        }
        AbstractC0186b0 a3 = N0.a();
        if (a3.f5848a >= 4294967296L) {
            iVar.f7947f = c0220t;
            iVar.f5836c = 1;
            ArrayDeque arrayDeque = a3.f5850c;
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque();
                a3.f5850c = arrayDeque;
            }
            arrayDeque.addLast(iVar);
            return;
        }
        a3.A(true);
        try {
            InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) continuation2.getContext().get(C0219s0.f5892a);
            if (interfaceC0221t0 == null || interfaceC0221t0.a()) {
                Object obj2 = iVar.f7948g;
                CoroutineContext context = continuation2.getContext();
                Object c11 = B.c(context, obj2);
                T0 c12 = c11 != B.f7923a ? AbstractC0231z.c(continuation2, context, c11) : null;
                try {
                    continuation2.resumeWith(obj);
                    Unit unit = Unit.INSTANCE;
                } finally {
                    if (c12 == null || c12.Z()) {
                        B.a(context, c11);
                    }
                }
            } else {
                CancellationException z2 = ((D0) interfaceC0221t0).z();
                iVar.b(c0220t, z2);
                iVar.resumeWith(Result.m40constructorimpl(ResultKt.createFailure(z2)));
            }
            while (a3.F()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final long h(String str, long j, long j3, long j10) {
        String str2;
        int i3 = x.f7974a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long longOrNull = StringsKt.toLongOrNull(str2);
        String string2 = StubApp.getString2(25750);
        if (longOrNull == null) {
            throw new IllegalStateException((string2 + str + StubApp.getString2(25753) + str2 + '\'').toString());
        }
        long longValue = longOrNull.longValue();
        if (j3 <= longValue && longValue <= j10) {
            return longValue;
        }
        throw new IllegalStateException((string2 + str + StubApp.getString2(25751) + j3 + StubApp.getString2(15721) + j10 + StubApp.getString2(25752) + longValue + '\'').toString());
    }

    public static int i(int i3, int i10, String str) {
        return (int) h(str, i3, 1, (i10 & 8) != 0 ? IntCompanionObject.MAX_VALUE : 2097150);
    }
}
