package com.mapbox.maps;

import Qb.C;
import Qb.C0203k;
import Qb.W;
import Vb.q;
import android.content.Context;
import android.util.TypedValue;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.stub.StubApp;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.dfu.DfuServiceInitiator;

@Metadata(d1 = {"\u0000T\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a>\u0010\u0006\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aW\u0010\u000e\u001a\u00028\u0002\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0016\b\u0002\u0010\u0000\u0018\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\u001a\b\u0004\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0003H\u0080Hø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0010*\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a]\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00028\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u001c\u0010\u001d\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a{\u0010#\u001a\u00020!\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00028\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001a2\u001c\u0010\u001d\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00032\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020!0\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"T", "R", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "method", "call", "(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "E", "V", "Lcom/mapbox/bindgen/Expected;", "Lkotlin/coroutines/Continuation;", "Lcom/mapbox/common/Cancelable;", "block", "suspendMapboxCancellableCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Landroid/content/Context;", "context", "toDP", "(Ljava/lang/Number;Landroid/content/Context;)Ljava/lang/Number;", "", "timeoutMs", "fallback", "", "logTag", "LQb/C;", "dispatcher", "", "operation", "safeSystemCall", "(JLjava/lang/Object;Ljava/lang/String;LQb/C;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mainDispatcher", "", "onResult", "safeSystemCallWithCallback", "(JLjava/lang/Object;Ljava/lang/String;LQb/C;LQb/C;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class UtilsKt {
    public static final <T, R> R call(WeakReference<T> weakReference, Function1<? super T, ? extends R> method) {
        Intrinsics.checkNotNullParameter(weakReference, "<this>");
        Intrinsics.checkNotNullParameter(method, "method");
        T t3 = weakReference.get();
        if (t3 != null) {
            return method.invoke(t3);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062 A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #0 {Exception -> 0x0039, blocks: (B:11:0x0035, B:13:0x0062, B:21:0x004b), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object safeSystemCall(long r5, T r7, java.lang.String r8, Qb.C r9, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r10, kotlin.coroutines.Continuation<? super T> r11) {
        /*
            r0 = 14311(0x37e7, float:2.0054E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            boolean r1 = r11 instanceof com.mapbox.maps.UtilsKt$safeSystemCall$1
            if (r1 == 0) goto L1a
            r1 = r11
            com.mapbox.maps.UtilsKt$safeSystemCall$1 r1 = (com.mapbox.maps.UtilsKt$safeSystemCall$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1a
            int r2 = r2 - r3
            r1.label = r2
            goto L1f
        L1a:
            com.mapbox.maps.UtilsKt$safeSystemCall$1 r1 = new com.mapbox.maps.UtilsKt$safeSystemCall$1
            r1.<init>(r11)
        L1f:
            java.lang.Object r11 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L48
            if (r3 != r4) goto L3b
            long r5 = r1.J$0
            java.lang.Object r7 = r1.L$1
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r1.L$0
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Exception -> L39
            goto L60
        L39:
            r5 = move-exception
            goto L7c
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r6 = 275(0x113, float:3.85E-43)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            throw r5
        L48:
            kotlin.ResultKt.throwOnFailure(r11)
            com.mapbox.maps.UtilsKt$safeSystemCall$2 r11 = new com.mapbox.maps.UtilsKt$safeSystemCall$2     // Catch: java.lang.Exception -> L39
            r3 = 0
            r11.<init>(r9, r10, r3)     // Catch: java.lang.Exception -> L39
            r1.L$0 = r7     // Catch: java.lang.Exception -> L39
            r1.L$1 = r8     // Catch: java.lang.Exception -> L39
            r1.J$0 = r5     // Catch: java.lang.Exception -> L39
            r1.label = r4     // Catch: java.lang.Exception -> L39
            java.lang.Object r11 = Qb.R0.b(r5, r11, r1)     // Catch: java.lang.Exception -> L39
            if (r11 != r2) goto L60
            return r2
        L60:
            if (r11 != 0) goto L7b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L39
            r9.<init>(r0)     // Catch: java.lang.Exception -> L39
            r9.append(r5)     // Catch: java.lang.Exception -> L39
            java.lang.String r5 = "14312"
            java.lang.String r5 = com.stub.StubApp.getString2(r5)     // Catch: java.lang.Exception -> L39
            r9.append(r5)     // Catch: java.lang.Exception -> L39
            java.lang.String r5 = r9.toString()     // Catch: java.lang.Exception -> L39
            com.mapbox.maps.MapboxLogger.logW(r8, r5)     // Catch: java.lang.Exception -> L39
            return r7
        L7b:
            return r11
        L7c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r9 = 14313(0x37e9, float:2.0057E-41)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            r6.<init>(r9)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            r5 = 14314(0x37ea, float:2.0058E-41)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.mapbox.maps.MapboxLogger.logE(r8, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.UtilsKt.safeSystemCall(long, java.lang.Object, java.lang.String, Qb.C, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Object safeSystemCall$default(long j, Object obj, String str, C c10, Function1 function1, Continuation continuation, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            j = DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT;
        }
        if ((i3 & 4) != 0) {
            str = StubApp.getString2(14315);
        }
        if ((i3 & 8) != 0) {
            c10 = W.f5838a;
        }
        return safeSystemCall(j, obj, str, c10, function1, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (Qb.L.n(r12, r13, r8) != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object safeSystemCallWithCallback(long r11, T r13, java.lang.String r14, Qb.C r15, Qb.C r16, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r17, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) {
        /*
            r0 = r19
            boolean r1 = r0 instanceof com.mapbox.maps.UtilsKt$safeSystemCallWithCallback$1
            if (r1 == 0) goto L16
            r1 = r0
            com.mapbox.maps.UtilsKt$safeSystemCallWithCallback$1 r1 = (com.mapbox.maps.UtilsKt$safeSystemCallWithCallback$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            com.mapbox.maps.UtilsKt$safeSystemCallWithCallback$1 r1 = new com.mapbox.maps.UtilsKt$safeSystemCallWithCallback$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r8.label
            r9 = 2
            r3 = 1
            if (r2 == 0) goto L49
            if (r2 == r3) goto L3d
            if (r2 != r9) goto L30
            kotlin.ResultKt.throwOnFailure(r0)
            goto L79
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r12 = 275(0x113, float:3.85E-43)
            java.lang.String r12 = com.stub.StubApp.getString2(r12)
            r11.<init>(r12)
            throw r11
        L3d:
            java.lang.Object r11 = r8.L$1
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            java.lang.Object r12 = r8.L$0
            Qb.C r12 = (Qb.C) r12
            kotlin.ResultKt.throwOnFailure(r0)
            goto L66
        L49:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r16
            r8.L$0 = r0
            r10 = r18
            r8.L$1 = r10
            r8.label = r3
            r2 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r17
            java.lang.Object r11 = safeSystemCall(r2, r4, r5, r6, r7, r8)
            if (r11 != r1) goto L63
            goto L78
        L63:
            r12 = r0
            r0 = r11
            r11 = r10
        L66:
            com.mapbox.maps.UtilsKt$safeSystemCallWithCallback$2 r13 = new com.mapbox.maps.UtilsKt$safeSystemCallWithCallback$2
            r14 = 0
            r13.<init>(r11, r0, r14)
            r8.L$0 = r14
            r8.L$1 = r14
            r8.label = r9
            java.lang.Object r11 = Qb.L.n(r12, r13, r8)
            if (r11 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.UtilsKt.safeSystemCallWithCallback(long, java.lang.Object, java.lang.String, Qb.C, Qb.C, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Object safeSystemCallWithCallback$default(long j, Object obj, String str, C c10, C c11, Function1 function1, Function1 function12, Continuation continuation, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            j = DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT;
        }
        if ((i3 & 4) != 0) {
            str = StubApp.getString2(14315);
        }
        if ((i3 & 8) != 0) {
            c10 = W.f5838a;
        }
        if ((i3 & 16) != 0) {
            Xb.d dVar = W.f5838a;
            c11 = q.f7968a;
        }
        return safeSystemCallWithCallback(j, obj, str, c10, c11, function1, function12, continuation);
    }

    public static final /* synthetic */ <E, V, T extends Expected<E, V>> Object suspendMapboxCancellableCoroutine(Function1<? super Continuation<? super T>, ? extends Cancelable> function1, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuation));
        c0203k.s();
        c0203k.u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(function1.invoke(c0203k)));
        Unit unit = Unit.INSTANCE;
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        InlineMarker.mark(1);
        return r8;
    }

    public static final <T extends Number> T toDP(T t3, Context context) {
        Intrinsics.checkNotNullParameter(t3, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return Float.valueOf(TypedValue.applyDimension(1, t3.floatValue(), context.getResources().getDisplayMetrics()));
    }
}
