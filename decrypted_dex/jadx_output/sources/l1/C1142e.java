package l1;

import T0.l;
import com.stub.StubApp;
import kotlin.UByte;

/* renamed from: l1.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1142e {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f15842d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f15843a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f15844b;

    /* renamed from: c, reason: collision with root package name */
    public int f15845c;

    public static long a(int i3, byte[] bArr, boolean z2) {
        long j = bArr[0] & 255;
        if (z2) {
            j &= ~f15842d[i3 - 1];
        }
        for (int i10 = 1; i10 < i3; i10++) {
            j = (j << 8) | (bArr[i10] & 255);
        }
        return j;
    }

    public static int b(int i3) {
        for (int i10 = 0; i10 < 8; i10++) {
            if ((f15842d[i10] & i3) != 0) {
                return i10 + 1;
            }
        }
        return -1;
    }

    public final long c(l lVar, boolean z2, boolean z10, int i3) {
        int i10 = this.f15844b;
        byte[] bArr = this.f15843a;
        if (i10 == 0) {
            if (!lVar.e(bArr, 0, 1, z2)) {
                return -1L;
            }
            int b2 = b(bArr[0] & UByte.MAX_VALUE);
            this.f15845c = b2;
            if (b2 == -1) {
                throw new IllegalStateException(StubApp.getString2(17454));
            }
            this.f15844b = 1;
        }
        int i11 = this.f15845c;
        if (i11 > i3) {
            this.f15844b = 0;
            return -2L;
        }
        if (i11 != 1) {
            lVar.e(bArr, 1, i11 - 1, false);
        }
        this.f15844b = 0;
        return a(this.f15845c, bArr, z10);
    }
}
