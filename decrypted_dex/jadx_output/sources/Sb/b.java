package Sb;

import com.stub.StubApp;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class b extends FunctionReferenceImpl implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6680a = new b(3, e.class, StubApp.getString2(25599), StubApp.getString2(25598), 0);

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            r0 = r9
            Sb.e r0 = (Sb.e) r0
            r5 = r10
            Yb.d r5 = (Yb.d) r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = Sb.e.f6682b
            r0.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = Sb.e.f6687g
            java.lang.Object r9 = r9.get(r0)
            Sb.n r9 = (Sb.n) r9
        L13:
            boolean r10 = r0.v()
            if (r10 == 0) goto L20
            F5.c r9 = Sb.g.f6702l
            Yb.c r5 = (Yb.c) r5
            r5.f8911e = r9
            goto L73
        L20:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = Sb.e.f6683c
            long r3 = r10.getAndIncrement(r0)
            int r10 = Sb.g.f6693b
            long r10 = (long) r10
            long r1 = r3 / r10
            long r10 = r3 % r10
            int r10 = (int) r10
            long r6 = r9.f7972c
            int r11 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r11 == 0) goto L3e
            Sb.n r11 = r0.o(r1, r9)
            if (r11 != 0) goto L3b
            goto L13
        L3b:
            r1 = r11
        L3c:
            r2 = r10
            goto L40
        L3e:
            r1 = r9
            goto L3c
        L40:
            java.lang.Object r9 = r0.E(r1, r2, r3, r5)
            r11 = r1
            F5.c r10 = Sb.g.f6703m
            if (r9 != r10) goto L57
            boolean r9 = r5 instanceof Qb.V0
            if (r9 == 0) goto L50
            Qb.V0 r5 = (Qb.V0) r5
            goto L51
        L50:
            r5 = 0
        L51:
            if (r5 == 0) goto L73
            r5.a(r11, r2)
            goto L73
        L57:
            F5.c r10 = Sb.g.f6705o
            if (r9 != r10) goto L68
            long r9 = r0.s()
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r9 >= 0) goto L66
            r11.a()
        L66:
            r9 = r11
            goto L13
        L68:
            F5.c r10 = Sb.g.f6704n
            if (r9 == r10) goto L76
            r11.a()
            Yb.c r5 = (Yb.c) r5
            r5.f8911e = r9
        L73:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L76:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r10 = 6086(0x17c6, float:8.528E-42)
            java.lang.String r10 = com.stub.StubApp.getString2(r10)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Sb.b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
