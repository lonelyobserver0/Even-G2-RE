package Nb;

import Tb.P;
import Tb.Q;
import com.stub.StubApp;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.LoggerFactory;
import vb.EnumC1848e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4973a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4974b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4975c;

    /* renamed from: d, reason: collision with root package name */
    public int f4976d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC1848e f4977e;

    /* renamed from: f, reason: collision with root package name */
    public final org.slf4j.a f4978f;

    /* renamed from: g, reason: collision with root package name */
    public final P f4979g;

    /* renamed from: h, reason: collision with root package name */
    public int f4980h;

    /* renamed from: i, reason: collision with root package name */
    public final P f4981i;
    public final Zb.j j;

    /* renamed from: k, reason: collision with root package name */
    public final Gb.c f4982k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4983l;

    public c(Gb.c imageManager, byte[] data, int i3, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(data, "imageData");
        synchronized (imageManager) {
            i12 = imageManager.f21911c;
        }
        EnumC1848e protocol = EnumC1848e.f21933a;
        Intrinsics.checkNotNullExpressionValue(protocol, "getScheme(...)");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.f4973a = data;
        this.f4974b = i10;
        this.f4975c = i11;
        this.f4976d = i12;
        this.f4977e = protocol;
        this.f4978f = LoggerFactory.getLogger(StubApp.getString2(2539));
        P a3 = Q.a(2, 2, 2);
        this.f4979g = a3;
        this.f4981i = a3;
        int i13 = Zb.k.f9218a;
        this.j = new Zb.j(1, 0);
        this.f4982k = imageManager;
        this.f4983l = i3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(1:11)(2:15|16))(2:17|18))(4:19|20|(1:22)(1:25)|(1:24))|12|13))|32|6|7|(0)(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        r6.f4976d = r7.f1530a;
        r0.f5038a = null;
        r0.f5041d = 2;
        r6 = Qb.J.c(new Nb.q(r6, null), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r6 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        r6 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (r6 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(Nb.c r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof Nb.v
            if (r0 == 0) goto L13
            r0 = r7
            Nb.v r0 = (Nb.v) r0
            int r1 = r0.f5041d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5041d = r1
            goto L18
        L13:
            Nb.v r0 = new Nb.v
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f5039b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5041d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L2d
            kotlin.ResultKt.throwOnFailure(r7)
            goto L7b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r7 = 275(0x113, float:3.85E-43)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r6.<init>(r7)
            throw r6
        L3a:
            Nb.c r6 = r0.f5038a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: Db.a -> L40
            goto L7b
        L40:
            r7 = move-exception
            goto L5e
        L42:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f5038a = r6     // Catch: Db.a -> L40
            r0.f5041d = r5     // Catch: Db.a -> L40
            Nb.q r7 = new Nb.q     // Catch: Db.a -> L40
            r7.<init>(r6, r3)     // Catch: Db.a -> L40
            java.lang.Object r7 = Qb.J.c(r7, r0)     // Catch: Db.a -> L40
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: Db.a -> L40
            if (r7 != r2) goto L59
            goto L5b
        L59:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: Db.a -> L40
        L5b:
            if (r7 != r1) goto L7b
            goto L7d
        L5e:
            int r7 = r7.f1530a
            r6.f4976d = r7
            r0.f5038a = r3
            r0.f5041d = r4
            Nb.q r7 = new Nb.q
            r7.<init>(r6, r3)
            java.lang.Object r6 = Qb.J.c(r7, r0)
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r7) goto L76
            goto L78
        L76:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L78:
            if (r6 != r1) goto L7b
            goto L7d
        L7b:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Nb.c.a(Nb.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Type inference failed for: r0v22, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r0v27, types: [kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(Nb.c r22, Nb.a r23, boolean r24, Qb.I r25, Nb.p r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Nb.c.b(Nb.c, Nb.a, boolean, Qb.I, Nb.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final a c(int i3) {
        int i10 = l.f4998a[this.f4977e.ordinal()] == 1 ? 8 : 12;
        int a3 = Ob.a.a(StubApp.getString2(1485));
        int b2 = Ob.a.b(i3) + Ob.a.a(StubApp.getString2(1484));
        byte[] bArr = this.f4973a;
        int b10 = i3 == 0 ? Ob.a.b(bArr.length) + Ob.a.a(StubApp.getString2(1482)) : 0;
        if (i3 == 0) {
            int b11 = Ob.a.b(32) + Ob.a.a(StubApp.getString2(1481)) + 32;
            int i11 = this.f4983l;
            r4 = (i11 > 0 ? Ob.a.a(StubApp.getString2(1483)) + Ob.a.b(i11) : 0) + b11;
        }
        int i12 = i10 + 2 + b2 + b10 + r4 + a3;
        int min = Math.min((this.f4976d - i12) - Ob.a.b(this.f4976d - i12), bArr.length - i3);
        if (i3 + min < bArr.length) {
            int i13 = this.f4975c;
            min = (min / i13) * i13;
        }
        return new a(ArraysKt.copyOfRange(bArr, i3, min + i3), i3);
    }
}
