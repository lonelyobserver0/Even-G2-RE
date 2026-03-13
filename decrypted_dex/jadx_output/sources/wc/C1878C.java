package wc;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: wc.C, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1878C {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static wc.C1877B a(java.lang.String r10, wc.v r11) {
        /*
            r0 = 2
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
            r3 = 0
            if (r11 == 0) goto L6a
            java.util.regex.Pattern r2 = wc.v.f22427c
            r2 = 7718(0x1e26, float:1.0815E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            java.lang.String r4 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String[] r4 = r11.f22430b
            int r5 = r4.length
            int r5 = r5 + (-1)
            int r5 = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(r3, r5, r0)
            r6 = 0
            if (r5 < 0) goto L3a
            r7 = r3
        L26:
            int r8 = r7 + 2
            r9 = r4[r7]
            boolean r9 = kotlin.text.StringsKt.v(r9, r2)
            if (r9 == 0) goto L35
            int r7 = r7 + 1
            r0 = r4[r7]
            goto L3b
        L35:
            if (r7 != r5) goto L38
            goto L3a
        L38:
            r7 = r8
            goto L26
        L3a:
            r0 = r6
        L3b:
            if (r0 != 0) goto L3e
            goto L44
        L3e:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> L44
            r2 = r0
            goto L45
        L44:
            r2 = r6
        L45:
            if (r2 != 0) goto L6a
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
            java.util.regex.Pattern r0 = wc.v.f22427c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r11 = 35405(0x8a4d, float:4.9613E-41)
            java.lang.String r11 = com.stub.StubApp.getString2(r11)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            wc.v r11 = com.google.android.gms.internal.measurement.D1.i(r11)     // Catch: java.lang.IllegalArgumentException -> L69
            goto L6a
        L69:
            r11 = r6
        L6a:
            byte[] r10 = r10.getBytes(r2)
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            int r0 = r10.length
            wc.B r10 = b(r11, r10, r3, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.C1878C.a(java.lang.String, wc.v):wc.B");
    }

    public static C1877B b(v vVar, byte[] bArr, int i3, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        long length = bArr.length;
        long j = i3;
        long j3 = i10;
        byte[] bArr2 = xc.b.f23179a;
        if ((j | j3) < 0 || j > length || length - j < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new C1877B(vVar, bArr, i10, i3);
    }

    public static /* synthetic */ C1877B c(C1878C c1878c, byte[] bArr, v vVar, int i3, int i10) {
        if ((i10 & 1) != 0) {
            vVar = null;
        }
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        int length = bArr.length;
        c1878c.getClass();
        return b(vVar, bArr, i3, length);
    }
}
