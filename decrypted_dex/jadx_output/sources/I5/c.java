package I5;

import com.stub.StubApp;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f3228a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3229b = Collections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map dependencies = f3229b;
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        Object obj = dependencies.get(dVar);
        if (obj != null) {
            Intrinsics.checkNotNullExpressionValue(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (a) obj;
        }
        throw new IllegalStateException(StubApp.getString2(2869) + dVar + StubApp.getString2(2870));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0 A[Catch: all -> 0x00d1, TRY_ENTER, TryCatch #0 {all -> 0x00d1, blocks: (B:12:0x0099, B:23:0x00b0, B:24:0x00d0), top: B:11:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0097 -> B:10:0x0098). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof I5.b
            if (r0 == 0) goto L13
            r0 = r11
            I5.b r0 = (I5.b) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            I5.b r0 = new I5.b
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f3226g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L35
            java.lang.Object r2 = r0.f3225f
            java.util.Map r4 = r0.f3224e
            Zb.a r5 = r0.f3223d
            I5.d r6 = r0.f3222c
            java.util.Iterator r7 = r0.f3221b
            java.util.Map r8 = r0.f3220a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L98
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r11.<init>(r0)
            throw r11
        L42:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.Map r11 = I5.c.f3229b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r11.size()
            int r4 = kotlin.collections.MapsKt.mapCapacity(r4)
            r2.<init>(r4)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r7 = r11
            r4 = r2
        L63:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Ld8
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            I5.d r6 = (I5.d) r6
            java.lang.Object r11 = r11.getValue()
            I5.a r11 = (I5.a) r11
            Zb.e r5 = r11.f3218a
            r0.f3220a = r4
            r0.f3221b = r7
            r0.f3222c = r6
            r0.f3223d = r5
            r0.f3224e = r4
            r0.f3225f = r2
            r0.j = r3
            java.lang.Object r11 = r5.e(r0)
            if (r11 != r1) goto L97
            return r1
        L97:
            r8 = r4
        L98:
            r11 = 0
            java.lang.String r9 = "subscriberName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r9)     // Catch: java.lang.Throwable -> Ld1
            I5.a r9 = a(r6)     // Catch: java.lang.Throwable -> Ld1
            c5.i r9 = r9.f3219b     // Catch: java.lang.Throwable -> Ld1
            if (r9 == 0) goto Lb0
            Zb.e r5 = (Zb.e) r5
            r5.g(r11)
            r4.put(r2, r9)
            r4 = r8
            goto L63
        Lb0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r2 = "978"
            java.lang.String r2 = com.stub.StubApp.getString2(r2)     // Catch: java.lang.Throwable -> Ld1
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Ld1
            r1.append(r6)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r2 = "2871"
            java.lang.String r2 = com.stub.StubApp.getString2(r2)     // Catch: java.lang.Throwable -> Ld1
            r1.append(r2)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld1
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld1
            throw r0     // Catch: java.lang.Throwable -> Ld1
        Ld1:
            r0 = move-exception
            Zb.e r5 = (Zb.e) r5
            r5.g(r11)
            throw r0
        Ld8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.c.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
