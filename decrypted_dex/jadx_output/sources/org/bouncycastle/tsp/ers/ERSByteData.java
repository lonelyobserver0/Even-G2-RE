package org.bouncycastle.tsp.ers;

import org.bouncycastle.operator.DigestCalculator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ERSByteData extends ERSCachingData {
    private final byte[] content;

    public ERSByteData(byte[] bArr) {
        this.content = bArr;
    }

    @Override // org.bouncycastle.tsp.ers.ERSCachingData
    public byte[] calculateHash(DigestCalculator digestCalculator, byte[] bArr) {
        byte[] calculateDigest = ERSUtil.calculateDigest(digestCalculator, this.content);
        return bArr != null ? ERSUtil.concatPreviousHashes(digestCalculator, bArr, calculateDigest) : calculateDigest;
    }
}
