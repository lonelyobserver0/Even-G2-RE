package Ec;

import J1.p;
import R8.C0250h;
import Xa.AbstractActivityC0364d;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import bc.AbstractC0539c;
import bc.C0538b;
import bc.C0540d;
import bc.C0541e;
import bc.C0542f;
import bc.EnumC0537a;
import c5.C;
import c5.r;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewDataError;
import com.stub.StubApp;
import dc.AbstractC0826a;
import i5.C1059c;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import o0.C1406C;
import p0.AbstractC1482f;
import q4.s;
import r0.AbstractC1550k;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static AbstractActivityC0364d f2142a;

    /* renamed from: b, reason: collision with root package name */
    public static eb.b f2143b;

    /* renamed from: c, reason: collision with root package name */
    public static wa.h f2144c;

    public static wa.e A() {
        if (f2144c == null) {
            f2144c = wa.i.f22206a;
        }
        return f2144c;
    }

    public static L4.k B(L4.k kVar) {
        return ((kVar instanceof L4.n) || (kVar instanceof L4.l)) ? kVar : kVar instanceof Serializable ? new L4.l(kVar) : new L4.n(kVar);
    }

    public static void C(FlutterError flutterError) {
        Y4.b a3 = Y4.b.a();
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(25221));
        r rVar = a3.f8743a;
        V6.b bVar = rVar.f10927c;
        sb2.append(((AtomicInteger) bVar.f7761b).get());
        String sb3 = sb2.toString();
        String string2 = StubApp.getString2(280);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, sb3, null);
        }
        String str = StubApp.getString2(25222) + ((AtomicInteger) bVar.f7762c).get();
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, str, null);
        }
        rVar.f10939p.f13422a.a(new Ab.b(27, rVar, flutterError));
    }

    public static long D(long j, long j3) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j3;
        }
        long j10 = ((j ^ j3) >>> 63) + LongCompanionObject.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j3 == Long.MIN_VALUE) & (j < 0)))) {
            long j11 = j * j3;
            if (j == 0 || j11 / j == j3) {
                return j11;
            }
        }
        return j10;
    }

    public static void E(final Context context, C0250h c0250h, final boolean z2) {
        s l9;
        int i3;
        if (Build.VERSION.SDK_INT >= 29) {
            SharedPreferences z10 = z(context);
            String string2 = StubApp.getString2(1494);
            if (z10.contains(string2) && z10.getBoolean(string2, false) == z2) {
                return;
            }
            P3.b bVar = (P3.b) c0250h.f6298c;
            if (bVar.f5493c.j() >= 241100000) {
                Bundle bundle = new Bundle();
                bundle.putBoolean(string2, z2);
                P3.m d8 = P3.m.d(bVar.f5492b);
                synchronized (d8) {
                    i3 = d8.f5528b;
                    d8.f5528b = i3 + 1;
                }
                l9 = d8.e(new P3.l(i3, 4, bundle, 0));
            } else {
                l9 = a4.f.l(new IOException(StubApp.getString2(964)));
            }
            l9.addOnSuccessListener(new G1.c(0), new q4.f() { // from class: D5.x
                @Override // q4.f
                public final void i(Object obj) {
                    SharedPreferences.Editor edit = Ec.d.z(context).edit();
                    edit.putBoolean(StubApp.getString2(1494), z2);
                    edit.apply();
                }
            });
        }
    }

    public static A1.g F(int i3, T0.l lVar, C1553n c1553n) {
        A1.g b2 = A1.g.b(lVar, c1553n);
        while (true) {
            int i10 = b2.f72a;
            if (i10 == i3) {
                return b2;
            }
            AbstractC1482f.p(i10, StubApp.getString2(25223), StubApp.getString2(25224));
            long j = b2.f73b;
            long j3 = 8 + j;
            if (j % 2 != 0) {
                j3 = 9 + j;
            }
            if (j3 > 2147483647L) {
                throw C1406C.c(StubApp.getString2(25225) + i10);
            }
            lVar.u((int) j3);
            b2 = A1.g.b(lVar, c1553n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(y9.j r5, kotlin.coroutines.CoroutineContext r6, com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof r9.s
            if (r0 == 0) goto L13
            r0 = r8
            r9.s r0 = (r9.s) r0
            int r1 = r0.f20479c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20479c = r1
            goto L18
        L13:
            r9.s r0 = new r9.s
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f20478b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f20479c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2b
            com.mapbox.geojson.FeatureCollection r5 = r0.f20477a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r6 = 275(0x113, float:3.85E-43)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.ResultKt.throwOnFailure(r8)
            com.mapbox.geojson.FeatureCollection r8 = r5.f23577a
            y9.l r5 = r5.f23578b
            if (r5 == 0) goto L52
            r0.f20477a = r8
            r0.f20479c = r3
            java.lang.Object r5 = H(r5, r6, r7, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r4 = r8
            r8 = r5
            r5 = r4
        L4f:
            com.mapbox.navigation.ui.maps.internal.route.line.RouteLineDynamicEventData r8 = (com.mapbox.navigation.ui.maps.internal.route.line.RouteLineDynamicEventData) r8
            goto L56
        L52:
            r5 = 0
            r4 = r8
            r8 = r5
            r5 = r4
        L56:
            com.mapbox.navigation.ui.maps.internal.route.line.RouteLineEventData r6 = new com.mapbox.navigation.ui.maps.internal.route.line.RouteLineEventData
            r6.<init>(r5, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ec.d.G(y9.j, kotlin.coroutines.CoroutineContext, com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x01c5, code lost:
    
        if (r3 == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x018f, code lost:
    
        if (r3 == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015f, code lost:
    
        if (r3 == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0135, code lost:
    
        if (r3 == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fd, code lost:
    
        if (r3 == r5) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(y9.l r19, kotlin.coroutines.CoroutineContext r20, com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ec.d.H(y9.l, kotlin.coroutines.CoroutineContext, com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if (r12 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c2 -> B:19:0x00c6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(y9.t r9, kotlin.coroutines.CoroutineContext r10, com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ec.d.I(y9.t, kotlin.coroutines.CoroutineContext, com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Object J(Expected expected, Function2 function2, SuspendLambda suspendLambda) {
        if (expected.isError()) {
            Object error = expected.getError();
            Intrinsics.checkNotNull(error);
            return new RouteLineViewDataError(((y9.m) error).f23589a);
        }
        Object value = expected.getValue();
        Intrinsics.checkNotNull(value);
        return function2.invoke(value, suspendLambda);
    }

    public static int K(int i3) {
        if ((i3 & (-128)) == 0) {
            return 1;
        }
        if ((i3 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i3) == 0) {
            return 3;
        }
        return (i3 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int L(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static void a(Function1 builderAction) {
        String string2;
        String string22;
        KClass kClass;
        Iterator it;
        C0538b json = AbstractC0539c.f10752c;
        Intrinsics.checkNotNullParameter(json, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Intrinsics.checkNotNullParameter(json, "json");
        C0540d c0540d = new C0540d();
        C0541e c0541e = json.f10753a;
        c0540d.f10755a = c0541e.f10763a;
        c0540d.f10756b = c0541e.f10765c;
        c0540d.f10757c = c0541e.f10764b;
        String str = c0541e.f10766d;
        c0540d.f10758d = str;
        c0540d.f10759e = c0541e.f10767e;
        c0540d.f10760f = c0541e.f10769g;
        c0540d.f10761g = c0541e.f10768f;
        c0540d.f10762h = json.f10754b;
        builderAction.invoke(c0540d);
        if (!Intrinsics.areEqual(str, "    ")) {
            throw new IllegalArgumentException(StubApp.getString2(25229));
        }
        boolean z2 = c0540d.f10755a;
        boolean z10 = c0540d.f10757c;
        EnumC0537a enumC0537a = c0540d.f10760f;
        boolean z11 = c0540d.f10756b;
        String str2 = c0540d.f10758d;
        String discriminator = c0540d.f10759e;
        C0541e configuration = new C0541e(z2, z10, z11, str2, discriminator, c0540d.f10761g, enumC0537a);
        B3.s module = c0540d.f10762h;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        new C0542f(configuration, module);
        if (Intrinsics.areEqual(module, AbstractC0826a.f13558a)) {
            return;
        }
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        C collector = new C(1);
        module.getClass();
        Intrinsics.checkNotNullParameter(collector, "collector");
        Iterator it2 = ((Map) module.f651c).entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            throw new NoWhenBranchMatchedException();
        }
        Iterator it3 = ((Map) module.f650b).entrySet().iterator();
        do {
            boolean hasNext = it3.hasNext();
            string2 = StubApp.getString2(25226);
            string22 = StubApp.getString2(25227);
            if (!hasNext) {
                for (Map.Entry entry2 : ((Map) module.f652d).entrySet()) {
                    KClass kClass2 = (KClass) entry2.getKey();
                    Function1 function1 = (Function1) entry2.getValue();
                    Intrinsics.checkNotNull(kClass2, string22);
                    Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
                    Function1 defaultSerializerProvider = (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1);
                    Intrinsics.checkNotNullParameter(kClass2, string2);
                    Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
                }
                for (Map.Entry entry3 : ((Map) module.f654f).entrySet()) {
                    KClass kClass3 = (KClass) entry3.getKey();
                    Function1 function12 = (Function1) entry3.getValue();
                    Intrinsics.checkNotNull(kClass3, string22);
                    Intrinsics.checkNotNull(function12, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
                    Function1 defaultDeserializerProvider = (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function12, 1);
                    Intrinsics.checkNotNullParameter(kClass3, string2);
                    Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
                }
                return;
            }
            Map.Entry entry4 = (Map.Entry) it3.next();
            kClass = (KClass) entry4.getKey();
            it = ((Map) entry4.getValue()).entrySet().iterator();
        } while (!it.hasNext());
        Map.Entry entry5 = (Map.Entry) it.next();
        KClass actualClass = (KClass) entry5.getKey();
        if (entry5.getValue() != null) {
            throw new ClassCastException();
        }
        Intrinsics.checkNotNull(kClass, string22);
        Intrinsics.checkNotNull(actualClass, string22);
        Intrinsics.checkNotNull(null, StubApp.getString2(25228));
        Intrinsics.checkNotNullParameter(kClass, string2);
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(null, "actualSerializer");
        throw null;
    }

    public static boolean p(T0.l lVar) {
        C1553n c1553n = new C1553n(8);
        int i3 = A1.g.b(lVar, c1553n).f72a;
        if (i3 != 1380533830 && i3 != 1380333108) {
            return false;
        }
        lVar.i(c1553n.f20176a, 0, 4, false);
        c1553n.G(0);
        int h2 = c1553n.h();
        if (h2 == 1463899717) {
            return true;
        }
        AbstractC1550k.k(StubApp.getString2(25224), StubApp.getString2(25230) + h2);
        return false;
    }

    public static long q(long j, long j3) {
        long j10 = j + j3;
        if (((j ^ j3) < 0) || ((j ^ j10) >= 0)) {
            return j10;
        }
        throw new ArithmeticException(Xa.h.q(AbstractC1482f.m(j, StubApp.getString2(22262), StubApp.getString2(81)), j3, StubApp.getString2(74)));
    }

    public static final p r(Context context, Class klass, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (StringsKt.isBlank(str)) {
            throw new IllegalArgumentException(StubApp.getString2(25231));
        }
        return new p(context, klass, str);
    }

    public static boolean s(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length != objArr2.length) {
                return false;
            }
            Iterable indices = ArraysKt.getIndices(objArr);
            if ((indices instanceof Collection) && ((Collection) indices).isEmpty()) {
                return true;
            }
            Iterator it = indices.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                if (!s(objArr[nextInt], objArr2[nextInt])) {
                    return false;
                }
            }
            return true;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                return false;
            }
            Iterable indices2 = CollectionsKt.getIndices((Collection) obj);
            if ((indices2 instanceof Collection) && ((Collection) indices2).isEmpty()) {
                return true;
            }
            Iterator it2 = indices2.iterator();
            while (it2.hasNext()) {
                int nextInt2 = ((IntIterator) it2).nextInt();
                if (!s(list.get(nextInt2), list2.get(nextInt2))) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return Intrinsics.areEqual(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() != map2.size()) {
            return false;
        }
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !s(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long t(long r8, long r10, java.math.RoundingMode r12) {
        /*
            r12.getClass()
            long r0 = r8 / r10
            long r2 = r10 * r0
            long r2 = r8 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L53
        L10:
            long r8 = r8 ^ r10
            r7 = 63
            long r8 = r8 >> r7
            int r8 = (int) r8
            r8 = r8 | 1
            int[] r9 = O4.e.f5208a
            int r7 = r12.ordinal()
            r9 = r9[r7]
            switch(r9) {
                case 1: goto L51;
                case 2: goto L53;
                case 3: goto L4c;
                case 4: goto L4e;
                case 5: goto L49;
                case 6: goto L28;
                case 7: goto L28;
                case 8: goto L28;
                default: goto L22;
            }
        L22:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L28:
            long r2 = java.lang.Math.abs(r2)
            long r9 = java.lang.Math.abs(r10)
            long r9 = r9 - r2
            long r2 = r2 - r9
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L46
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            if (r12 == r9) goto L4e
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r9) goto L53
            r9 = 1
            long r9 = r9 & r0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L53
            goto L4e
        L46:
            if (r9 <= 0) goto L53
            goto L4e
        L49:
            if (r8 <= 0) goto L53
            goto L4e
        L4c:
            if (r8 >= 0) goto L53
        L4e:
            long r8 = (long) r8
            long r0 = r0 + r8
            return r0
        L51:
            if (r6 != 0) goto L54
        L53:
            return r0
        L54:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            r9 = 4401(0x1131, float:6.167E-42)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Ec.d.t(long, long, java.math.RoundingMode):long");
    }

    public static long x(long j, long j3) {
        l.c(j, StubApp.getString2(2378));
        l.c(j3, StubApp.getString2(2377));
        if (j == 0) {
            return j3;
        }
        if (j3 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j10 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j3);
        long j11 = j3 >> numberOfTrailingZeros2;
        while (j10 != j11) {
            long j12 = j10 - j11;
            long j13 = (j12 >> 63) & j12;
            long j14 = (j12 - j13) - j13;
            j11 += j13;
            j10 = j14 >> Long.numberOfTrailingZeros(j14);
        }
        return j10 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static SharedPreferences z(Context context) {
        Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
        if (origApplicationContext != null) {
            context = origApplicationContext;
        }
        return context.getSharedPreferences(StubApp.getString2(1466), 0);
    }

    public abstract void M(int i3, int i10, byte[] bArr);

    public abstract long b();

    public abstract long c();

    public abstract boolean d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h(long j);

    public abstract void i(double d8);

    public abstract void j(double d8);

    public abstract void k(double d8, double d10);

    public abstract void l(int i3, String str, int i10, int i11, int i12, Vc.b bVar);

    public abstract void m();

    public Q3.c n(Context context, Looper looper, C1059c c1059c, Object obj, Q3.i iVar, Q3.j jVar) {
        return o(context, looper, c1059c, obj, (R3.r) iVar, (R3.r) jVar);
    }

    public Q3.c o(Context context, Looper looper, C1059c c1059c, Object obj, R3.r rVar, R3.r rVar2) {
        throw new UnsupportedOperationException(StubApp.getString2(25232));
    }

    public abstract int u(byte[] bArr);

    public abstract int v(ArrayList arrayList);

    public abstract int w(ArrayList arrayList);

    public abstract Object y(CoroutineContext coroutineContext, Object obj, ContinuationImpl continuationImpl);
}
