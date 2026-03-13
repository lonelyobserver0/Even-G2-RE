package L5;

import Qb.L;
import T.InterfaceC0294j;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final X.g f4246c;

    /* renamed from: d, reason: collision with root package name */
    public static final X.g f4247d;

    /* renamed from: e, reason: collision with root package name */
    public static final X.g f4248e;

    /* renamed from: f, reason: collision with root package name */
    public static final X.g f4249f;

    /* renamed from: g, reason: collision with root package name */
    public static final X.g f4250g;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0294j f4251a;

    /* renamed from: b, reason: collision with root package name */
    public h f4252b;

    static {
        String name = StubApp.getString2(3373);
        Intrinsics.checkNotNullParameter(name, "name");
        f4246c = new X.g(name);
        Intrinsics.checkNotNullParameter("firebase_sessions_sampling_rate", "name");
        f4247d = new X.g("firebase_sessions_sampling_rate");
        Intrinsics.checkNotNullParameter("firebase_sessions_restart_timeout", "name");
        f4248e = new X.g("firebase_sessions_restart_timeout");
        Intrinsics.checkNotNullParameter("firebase_sessions_cache_duration", "name");
        f4249f = new X.g("firebase_sessions_cache_duration");
        Intrinsics.checkNotNullParameter("firebase_sessions_cache_updated_time", "name");
        f4250g = new X.g("firebase_sessions_cache_updated_time");
    }

    public n(InterfaceC0294j dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f4251a = dataStore;
        L.k(new k(this, null));
    }

    public static final void a(n nVar, X.b bVar) {
        nVar.getClass();
        nVar.f4252b = new h((Boolean) bVar.c(f4246c), (Double) bVar.c(f4247d), (Integer) bVar.c(f4248e), (Integer) bVar.c(f4249f), (Long) bVar.c(f4250g));
    }

    public final boolean b() {
        h hVar = this.f4252b;
        h hVar2 = null;
        String string2 = StubApp.getString2(3409);
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            hVar = null;
        }
        Long l9 = hVar.f4229e;
        h hVar3 = this.f4252b;
        if (hVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            hVar2 = hVar3;
        }
        Integer num = hVar2.f4228d;
        return l9 == null || num == null || (System.currentTimeMillis() - l9.longValue()) / ((long) 1000) >= ((long) num.intValue());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        android.util.Log.w(com.stub.StubApp.getString2(3411), com.stub.StubApp.getString2(3410) + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(X.g r6, java.lang.Object r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof L5.l
            if (r0 == 0) goto L13
            r0 = r8
            L5.l r0 = (L5.l) r0
            int r1 = r0.f4241c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4241c = r1
            goto L18
        L13:
            L5.l r0 = new L5.l
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f4239a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f4241c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2b
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.io.IOException -> L29
            goto L6e
        L29:
            r6 = move-exception
            goto L51
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r7 = 275(0x113, float:3.85E-43)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.ResultKt.throwOnFailure(r8)
            T.j r8 = r5.f4251a     // Catch: java.io.IOException -> L29
            L5.m r2 = new L5.m     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.f4241c = r3     // Catch: java.io.IOException -> L29
            X.i r6 = new X.i     // Catch: java.io.IOException -> L29
            r6.<init>(r2, r4)     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = r8.a(r6, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L6e
            return r1
        L51:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 3410(0xd52, float:4.778E-42)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r7 = 3411(0xd53, float:4.78E-42)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            android.util.Log.w(r7, r6)
        L6e:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L5.n.c(X.g, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
