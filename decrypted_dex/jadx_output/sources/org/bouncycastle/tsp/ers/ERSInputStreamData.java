package org.bouncycastle.tsp.ers;

import com.stub.StubApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ERSInputStreamData extends ERSCachingData {
    private final InputStream content;

    public ERSInputStreamData(File file) throws FileNotFoundException {
        if (file.isDirectory()) {
            throw new IllegalArgumentException(StubApp.getString2(34965));
        }
        this.content = new FileInputStream(file);
    }

    @Override // org.bouncycastle.tsp.ers.ERSCachingData
    public byte[] calculateHash(DigestCalculator digestCalculator, byte[] bArr) {
        byte[] calculateDigest = ERSUtil.calculateDigest(digestCalculator, this.content);
        return bArr != null ? ERSUtil.concatPreviousHashes(digestCalculator, bArr, calculateDigest) : calculateDigest;
    }

    public ERSInputStreamData(InputStream inputStream) {
        this.content = inputStream;
    }
}
