package org.bouncycastle.pqc.legacy.crypto.gmss.util;

import kotlin.UByte;
import org.bouncycastle.crypto.Digest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GMSSRandom {
    private Digest messDigestTree;

    public GMSSRandom(Digest digest) {
        this.messDigestTree = digest;
    }

    private void addByteArrays(byte[] bArr, byte[] bArr2) {
        byte b2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            int i10 = (bArr[i3] & UByte.MAX_VALUE) + (bArr2[i3] & UByte.MAX_VALUE) + b2;
            bArr[i3] = (byte) i10;
            b2 = (byte) (i10 >> 8);
        }
    }

    private void addOne(byte[] bArr) {
        byte b2 = 1;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            int i10 = (bArr[i3] & UByte.MAX_VALUE) + b2;
            bArr[i3] = (byte) i10;
            b2 = (byte) (i10 >> 8);
        }
    }

    public byte[] nextSeed(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        this.messDigestTree.update(bArr, 0, bArr.length);
        byte[] bArr3 = new byte[this.messDigestTree.getDigestSize()];
        this.messDigestTree.doFinal(bArr3, 0);
        addByteArrays(bArr, bArr3);
        addOne(bArr);
        return bArr3;
    }
}
