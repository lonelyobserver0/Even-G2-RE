package n1;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final o f17787a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17788b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f17789c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f17790d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17791e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f17792f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f17793g;

    /* renamed from: h, reason: collision with root package name */
    public final long f17794h;

    public r(o oVar, long[] jArr, int[] iArr, int i3, long[] jArr2, int[] iArr2, long j) {
        AbstractC1550k.c(iArr.length == jArr2.length);
        AbstractC1550k.c(jArr.length == jArr2.length);
        AbstractC1550k.c(iArr2.length == jArr2.length);
        this.f17787a = oVar;
        this.f17789c = jArr;
        this.f17790d = iArr;
        this.f17791e = i3;
        this.f17792f = jArr2;
        this.f17793g = iArr2;
        this.f17794h = j;
        this.f17788b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | PKIFailureInfo.duplicateCertReq;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f17792f;
        for (int a3 = AbstractC1560u.a(jArr, j, true); a3 < jArr.length; a3++) {
            if ((this.f17793g[a3] & 1) != 0) {
                return a3;
            }
        }
        return -1;
    }
}
