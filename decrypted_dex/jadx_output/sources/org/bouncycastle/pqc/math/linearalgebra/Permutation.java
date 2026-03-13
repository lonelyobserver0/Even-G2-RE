package org.bouncycastle.pqc.math.linearalgebra;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Permutation {
    private int[] perm;

    public Permutation(int i3) {
        if (i3 <= 0) {
            throw new IllegalArgumentException(StubApp.getString2(34834));
        }
        this.perm = new int[i3];
        for (int i10 = i3 - 1; i10 >= 0; i10--) {
            this.perm[i10] = i10;
        }
    }

    private boolean isPermutation(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i3 : iArr) {
            if (i3 < 0 || i3 >= length || zArr[i3]) {
                return false;
            }
            zArr[i3] = true;
        }
        return true;
    }

    public Permutation computeInverse() {
        Permutation permutation = new Permutation(this.perm.length);
        for (int length = this.perm.length - 1; length >= 0; length--) {
            permutation.perm[this.perm[length]] = length;
        }
        return permutation;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Permutation) {
            return IntUtils.equals(this.perm, ((Permutation) obj).perm);
        }
        return false;
    }

    public byte[] getEncoded() {
        int length = this.perm.length;
        int ceilLog256 = IntegerFunctions.ceilLog256(length - 1);
        byte[] bArr = new byte[(length * ceilLog256) + 4];
        LittleEndianConversions.I2OSP(length, bArr, 0);
        for (int i3 = 0; i3 < length; i3++) {
            LittleEndianConversions.I2OSP(this.perm[i3], bArr, (i3 * ceilLog256) + 4, ceilLog256);
        }
        return bArr;
    }

    public int[] getVector() {
        return IntUtils.clone(this.perm);
    }

    public int hashCode() {
        return Arrays.hashCode(this.perm);
    }

    public Permutation rightMultiply(Permutation permutation) {
        int length = permutation.perm.length;
        int[] iArr = this.perm;
        if (length != iArr.length) {
            throw new IllegalArgumentException(StubApp.getString2(34809));
        }
        Permutation permutation2 = new Permutation(iArr.length);
        for (int length2 = this.perm.length - 1; length2 >= 0; length2--) {
            permutation2.perm[length2] = this.perm[permutation.perm[length2]];
        }
        return permutation2;
    }

    public String toString() {
        String str = StubApp.getString2(1557) + this.perm[0];
        for (int i3 = 1; i3 < this.perm.length; i3++) {
            StringBuilder n10 = AbstractC1482f.n(str, StubApp.getString2(81));
            n10.append(this.perm[i3]);
            str = n10.toString();
        }
        return AbstractC1482f.g(str, StubApp.getString2(511));
    }

    public Permutation(int i3, SecureRandom secureRandom) {
        if (i3 <= 0) {
            throw new IllegalArgumentException(StubApp.getString2(34834));
        }
        this.perm = new int[i3];
        int[] iArr = new int[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            iArr[i10] = i10;
        }
        int i11 = i3;
        for (int i12 = 0; i12 < i3; i12++) {
            int nextInt = RandUtils.nextInt(secureRandom, i11);
            i11--;
            this.perm[i12] = iArr[nextInt];
            iArr[nextInt] = iArr[i11];
        }
    }

    public Permutation(byte[] bArr) {
        int length = bArr.length;
        String string2 = StubApp.getString2(34873);
        if (length <= 4) {
            throw new IllegalArgumentException(string2);
        }
        int OS2IP = LittleEndianConversions.OS2IP(bArr, 0);
        int ceilLog256 = IntegerFunctions.ceilLog256(OS2IP - 1);
        if (bArr.length != (OS2IP * ceilLog256) + 4) {
            throw new IllegalArgumentException(string2);
        }
        this.perm = new int[OS2IP];
        for (int i3 = 0; i3 < OS2IP; i3++) {
            this.perm[i3] = LittleEndianConversions.OS2IP(bArr, (i3 * ceilLog256) + 4, ceilLog256);
        }
        if (!isPermutation(this.perm)) {
            throw new IllegalArgumentException(string2);
        }
    }

    public Permutation(int[] iArr) {
        if (!isPermutation(iArr)) {
            throw new IllegalArgumentException(StubApp.getString2(34874));
        }
        this.perm = IntUtils.clone(iArr);
    }
}
