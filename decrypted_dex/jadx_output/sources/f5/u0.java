package f5;

import D5.C0040d;
import D5.C0043g;
import Qb.C0203k;
import Qb.C0206l0;
import Qb.C0208m0;
import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import com.even.even_core.utils.room.EvDatabase_Impl;
import com.mapbox.navigator.RouteState;
import com.stub.StubApp;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class u0 implements ga.b {

    /* renamed from: a, reason: collision with root package name */
    public static long f14131a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f14132b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f14133c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f14134d;

    public static String A(String str) {
        return str.length() <= 127 ? str : str.substring(0, CertificateBody.profileType);
    }

    public static void B(StringBuilder sb2, int i3) {
        sb2.append((char) (((i3 / 10) % 10) + 48));
        sb2.append((char) ((i3 % 10) + 48));
    }

    public static boolean C(byte b2) {
        return b2 > -65;
    }

    public static final boolean a(Z8.i iVar) {
        return iVar.f9067b.getRouteState() == RouteState.OFF_ROUTE;
    }

    public static byte[] c(ArrayDeque arrayDeque, int i3) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i3) {
            return bArr;
        }
        int length = i3 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i3);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i3 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static int d(androidx.recyclerview.widget.b0 b0Var, Y.e eVar, View view, View view2, androidx.recyclerview.widget.M m4, boolean z2) {
        if (m4.v() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(androidx.recyclerview.widget.M.C(view) - androidx.recyclerview.widget.M.C(view2)) + 1;
        }
        return Math.min(eVar.l(), eVar.b(view2) - eVar.e(view));
    }

    public static int e(androidx.recyclerview.widget.b0 b0Var, Y.e eVar, View view, View view2, androidx.recyclerview.widget.M m4, boolean z2, boolean z10) {
        if (m4.v() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z10 ? Math.max(0, (b0Var.b() - Math.max(androidx.recyclerview.widget.M.C(view), androidx.recyclerview.widget.M.C(view2))) - 1) : Math.max(0, Math.min(androidx.recyclerview.widget.M.C(view), androidx.recyclerview.widget.M.C(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(eVar.b(view2) - eVar.e(view)) / (Math.abs(androidx.recyclerview.widget.M.C(view) - androidx.recyclerview.widget.M.C(view2)) + 1))) + (eVar.k() - eVar.e(view)));
        }
        return max;
    }

    public static int f(androidx.recyclerview.widget.b0 b0Var, Y.e eVar, View view, View view2, androidx.recyclerview.widget.M m4, boolean z2) {
        if (m4.v() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return b0Var.b();
        }
        return (int) (((eVar.b(view2) - eVar.e(view)) / (Math.abs(androidx.recyclerview.widget.M.C(view) - androidx.recyclerview.widget.M.C(view2)) + 1)) * b0Var.b());
    }

    public static W4.b g(String str, String str2) {
        F5.a aVar = new F5.a(str, str2);
        U9.h b2 = W4.b.b(F5.a.class);
        b2.f7524e = 1;
        b2.f7525f = new W4.a(aVar);
        return b2.e();
    }

    public static P0.i h(O0.s sVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i3 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (sVar.a(i10, elapsedRealtime)) {
                i3++;
            }
        }
        return new P0.i(1, 0, length, i3);
    }

    public static int i(long j) {
        return ((int) ((j & 266338304) >>> 21)) - 64;
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final Object k(EvDatabase_Impl evDatabase_Impl, CancellationSignal cancellationSignal, Callable callable, SuspendLambda suspendLambda) {
        if (evDatabase_Impl.l() && evDatabase_Impl.g().s().v()) {
            return callable.call();
        }
        if (suspendLambda.get$context().get(J1.z.f3395a) != null) {
            throw new ClassCastException();
        }
        Map map = evDatabase_Impl.f3373k;
        String string2 = StubApp.getString2(17700);
        Object obj = map.get(string2);
        if (obj == null) {
            Executor executor = evDatabase_Impl.f3365b;
            if (executor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
                executor = null;
            }
            obj = new C0206l0(executor);
            map.put(string2, obj);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(suspendLambda));
        c0203k.s();
        c0203k.u(new E1.b(2, cancellationSignal, Qb.L.j(C0208m0.f5881a, (Qb.C) obj, new J1.c(callable, c0203k, null), 2)));
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(suspendLambda);
        }
        return r8;
    }

    public static final Object l(EvDatabase_Impl evDatabase_Impl, Callable callable, SuspendLambda suspendLambda) {
        if (evDatabase_Impl.l() && evDatabase_Impl.g().s().v()) {
            return callable.call();
        }
        if (suspendLambda.get$context().get(J1.z.f3395a) != null) {
            throw new ClassCastException();
        }
        Map map = evDatabase_Impl.f3373k;
        String string2 = StubApp.getString2(17701);
        Object obj = map.get(string2);
        if (obj == null) {
            J1.A a3 = evDatabase_Impl.f3366c;
            if (a3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
                a3 = null;
            }
            obj = new C0206l0(a3);
            map.put(string2, obj);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return Qb.L.n((Qb.C) obj, new J1.b(callable, null), suspendLambda);
    }

    public static int m(float f10) {
        return ((int) (f10 + 16384.0d)) - 16384;
    }

    public static W4.b n(String str, F5.d dVar) {
        U9.h b2 = W4.b.b(F5.a.class);
        b2.f7524e = 1;
        b2.b(W4.i.b(Context.class));
        b2.f7525f = new C0043g(4, str, dVar);
        return b2.e();
    }

    public static void p(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v(StubApp.getString2(17704), StubApp.getString2(17702) + str + StubApp.getString2(17703), exc);
    }

    public static boolean q() {
        if (Build.VERSION.SDK_INT >= 29) {
            return S1.a.c();
        }
        String string2 = StubApp.getString2(2892);
        try {
            if (f14132b == null) {
                f14131a = Trace.class.getField(StubApp.getString2("2891")).getLong(null);
                f14132b = Trace.class.getMethod(string2, Long.TYPE);
            }
            return ((Boolean) f14132b.invoke(null, Long.valueOf(f14131a))).booleanValue();
        } catch (Exception e10) {
            p(string2, e10);
            return false;
        }
    }

    public static long r(int i3, int i10, int i11, int i12, int i13, int i14) {
        return (i10 << 28) | (i3 << 36) | ((i11 + 64) << 21) | (i12 << 16) | (i13 << 10) | (i14 << 4);
    }

    public static String u(int i3) {
        switch (i3) {
            case 514:
                return StubApp.getString2(17711);
            case 515:
                return StubApp.getString2(17710);
            case 516:
                return StubApp.getString2(17709);
            case 517:
                return StubApp.getString2(17708);
            case 518:
            case 521:
            default:
                return Xa.h.g(i3, StubApp.getString2(3049), StubApp.getString2(74));
            case 519:
                return StubApp.getString2(17707);
            case 520:
                return StubApp.getString2(17706);
            case 522:
                return StubApp.getString2(12086);
            case 523:
                return StubApp.getString2(17705);
        }
    }

    public static String v(int i3) {
        return i3 != 2050 ? i3 != 2052 ? Xa.h.g(i3, StubApp.getString2(3049), StubApp.getString2(74)) : StubApp.getString2(12086) : StubApp.getString2(17711);
    }

    public static String w(int i3) {
        switch (i3) {
            case 1026:
                return StubApp.getString2(17724);
            case 1027:
                return StubApp.getString2(17723);
            case 1028:
                return StubApp.getString2(17722);
            case 1029:
                return StubApp.getString2(17721);
            case 1030:
                return StubApp.getString2(17720);
            case 1031:
                return StubApp.getString2(17719);
            case 1032:
                return StubApp.getString2(17718);
            case 1033:
                return StubApp.getString2(17717);
            case 1034:
                return StubApp.getString2(17716);
            case 1035:
                return StubApp.getString2(17715);
            case 1036:
                return StubApp.getString2(17714);
            case 1037:
                return StubApp.getString2(17713);
            default:
                return StubApp.getString2(17712);
        }
    }

    public static byte[] z(C0040d c0040d) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i3 = 0;
        while (i3 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i3);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < min2) {
                int read = c0040d.read(bArr, i10, min2 - i10);
                if (read == -1) {
                    return c(arrayDeque, i3);
                }
                i10 += read;
                i3 += read;
            }
            long j = min * (min < 4096 ? 4 : 2);
            min = j > 2147483647L ? IntCompanionObject.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (c0040d.read() == -1) {
            return c(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError(StubApp.getString2(3732));
    }

    @Override // ga.b
    public ArrayList b() {
        ArrayList arrayList = new ArrayList();
        for (String str : o()) {
            File file = new File(str);
            try {
                if (file.exists() && file.canRead()) {
                    arrayList.add(file);
                }
            } catch (SecurityException unused) {
            }
        }
        return arrayList;
    }

    public abstract String[] o();

    public abstract void s(Throwable th);

    public abstract void t(p2.h hVar);

    public abstract void x(Runnable runnable);

    public abstract void y(Runnable runnable, long j);
}
