package S3;

import android.accounts.Account;
import java.util.Collections;
import java.util.Set;

/* renamed from: S3.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0275i extends AbstractC0271e implements Q3.c {

    /* renamed from: B, reason: collision with root package name */
    public final Set f6536B;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC0275i(android.content.Context r10, android.os.Looper r11, int r12, i5.C1059c r13, Q3.i r14, Q3.j r15) {
        /*
            r9 = this;
            S3.O r3 = S3.O.a(r10)
            com.google.android.gms.common.GoogleApiAvailability r4 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            S3.D.h(r14)
            S3.D.h(r15)
            S3.n r6 = new S3.n
            r6.<init>(r14)
            S3.n r7 = new S3.n
            r7.<init>(r15)
            java.lang.Object r14 = r13.f14846e
            r8 = r14
            java.lang.String r8 = (java.lang.String) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r10 = r13.f14844c
            java.util.Set r10 = (java.util.Set) r10
            java.util.Iterator r11 = r10.iterator()
        L2c:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L4c
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L3f
            goto L2c
        L3f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r11 = 5981(0x175d, float:8.381E-42)
            java.lang.String r11 = com.stub.StubApp.getString2(r11)
            r10.<init>(r11)
            throw r10
        L4c:
            r0.f6536B = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.AbstractC0275i.<init>(android.content.Context, android.os.Looper, int, i5.c, Q3.i, Q3.j):void");
    }

    @Override // Q3.c
    public final Set b() {
        return m() ? this.f6536B : Collections.EMPTY_SET;
    }

    @Override // S3.AbstractC0271e
    public final Account p() {
        return null;
    }

    @Override // S3.AbstractC0271e
    public final Set s() {
        return this.f6536B;
    }
}
