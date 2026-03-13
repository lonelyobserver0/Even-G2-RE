package P0;

import java.util.Arrays;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public int f5387c;

    /* renamed from: d, reason: collision with root package name */
    public int f5388d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5385a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f5386b = PKIFailureInfo.notAuthorized;

    /* renamed from: e, reason: collision with root package name */
    public int f5389e = 0;

    /* renamed from: f, reason: collision with root package name */
    public a[] f5390f = new a[100];

    public final synchronized void a(int i3) {
        boolean z2 = i3 < this.f5387c;
        this.f5387c = i3;
        if (z2) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, AbstractC1560u.f(this.f5387c, this.f5386b) - this.f5388d);
        int i3 = this.f5389e;
        if (max >= i3) {
            return;
        }
        Arrays.fill(this.f5390f, max, i3, (Object) null);
        this.f5389e = max;
    }
}
