package L5;

import Qb.I;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f4219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f4220c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f4221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f4222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Map map, c cVar, d dVar, Continuation continuation) {
        super(2, continuation);
        this.f4219b = gVar;
        this.f4220c = map;
        this.f4221d = cVar;
        this.f4222e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f4219b, this.f4220c, this.f4221d, this.f4222e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e0, code lost:
    
        if (r2.invoke(r9, r8) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f3, code lost:
    
        if (r2.invoke(r1, r8) != r0) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f4218a
            L5.d r2 = r8.f4222e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L25
            if (r1 == r4) goto L25
            if (r1 != r3) goto L18
            kotlin.ResultKt.throwOnFailure(r9)
            goto Lf6
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r9.<init>(r0)
            throw r9
        L25:
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L2a
            goto Lf6
        L2a:
            r9 = move-exception
            goto Le3
        L2d:
            kotlin.ResultKt.throwOnFailure(r9)
            L5.g r9 = r8.f4219b     // Catch: java.lang.Exception -> L2a
            java.net.URL r9 = L5.g.a(r9)     // Catch: java.lang.Exception -> L2a
            java.net.URLConnection r9 = r9.openConnection()     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9, r1)     // Catch: java.lang.Exception -> L2a
            javax.net.ssl.HttpsURLConnection r9 = (javax.net.ssl.HttpsURLConnection) r9     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = "595"
            java.lang.String r1 = com.stub.StubApp.getString2(r1)     // Catch: java.lang.Exception -> L2a
            r9.setRequestMethod(r1)     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = "395"
            java.lang.String r1 = com.stub.StubApp.getString2(r1)     // Catch: java.lang.Exception -> L2a
            java.lang.String r6 = "3394"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Exception -> L2a
            r9.setRequestProperty(r1, r6)     // Catch: java.lang.Exception -> L2a
            java.util.Map r1 = r8.f4220c     // Catch: java.lang.Exception -> L2a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Exception -> L2a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L2a
        L63:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Exception -> L2a
            if (r6 == 0) goto L7f
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Exception -> L2a
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Exception -> L2a
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Exception -> L2a
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Exception -> L2a
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L2a
            r9.setRequestProperty(r7, r6)     // Catch: java.lang.Exception -> L2a
            goto L63
        L7f:
            int r1 = r9.getResponseCode()     // Catch: java.lang.Exception -> L2a
            r6 = 200(0xc8, float:2.8E-43)
            if (r1 != r6) goto Lc5
            java.io.InputStream r9 = r9.getInputStream()     // Catch: java.lang.Exception -> L2a
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L2a
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L2a
            r4.<init>(r9)     // Catch: java.lang.Exception -> L2a
            r1.<init>(r4)     // Catch: java.lang.Exception -> L2a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2a
            r4.<init>()     // Catch: java.lang.Exception -> L2a
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Exception -> L2a
            r6.<init>()     // Catch: java.lang.Exception -> L2a
        L9f:
            java.lang.String r7 = r1.readLine()     // Catch: java.lang.Exception -> L2a
            r6.element = r7     // Catch: java.lang.Exception -> L2a
            if (r7 == 0) goto Lab
            r4.append(r7)     // Catch: java.lang.Exception -> L2a
            goto L9f
        Lab:
            r1.close()     // Catch: java.lang.Exception -> L2a
            r9.close()     // Catch: java.lang.Exception -> L2a
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L2a
            r9.<init>(r1)     // Catch: java.lang.Exception -> L2a
            L5.c r1 = r8.f4221d     // Catch: java.lang.Exception -> L2a
            r8.f4218a = r5     // Catch: java.lang.Exception -> L2a
            java.lang.Object r9 = r1.invoke(r9, r8)     // Catch: java.lang.Exception -> L2a
            if (r9 != r0) goto Lf6
            goto Lf5
        Lc5:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2a
            r9.<init>()     // Catch: java.lang.Exception -> L2a
            java.lang.String r5 = "3395"
            java.lang.String r5 = com.stub.StubApp.getString2(r5)     // Catch: java.lang.Exception -> L2a
            r9.append(r5)     // Catch: java.lang.Exception -> L2a
            r9.append(r1)     // Catch: java.lang.Exception -> L2a
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L2a
            r8.f4218a = r4     // Catch: java.lang.Exception -> L2a
            java.lang.Object r9 = r2.invoke(r9, r8)     // Catch: java.lang.Exception -> L2a
            if (r9 != r0) goto Lf6
            goto Lf5
        Le3:
            java.lang.String r1 = r9.getMessage()
            if (r1 != 0) goto Led
            java.lang.String r1 = r9.toString()
        Led:
            r8.f4218a = r3
            java.lang.Object r9 = r2.invoke(r1, r8)
            if (r9 != r0) goto Lf6
        Lf5:
            return r0
        Lf6:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L5.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
