package Dc;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public int f1546a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1547b = new int[10];

    public final int a() {
        return (this.f1546a & 128) != 0 ? this.f1547b[7] : Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    public final void b(E other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i3 = 0;
        while (i3 < 10) {
            int i10 = i3 + 1;
            if (((1 << i3) & other.f1546a) != 0) {
                c(i3, other.f1547b[i3]);
            }
            i3 = i10;
        }
    }

    public final void c(int i3, int i10) {
        if (i3 >= 0) {
            int[] iArr = this.f1547b;
            if (i3 >= iArr.length) {
                return;
            }
            this.f1546a = (1 << i3) | this.f1546a;
            iArr[i3] = i10;
        }
    }
}
