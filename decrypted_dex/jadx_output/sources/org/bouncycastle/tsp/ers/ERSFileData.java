package org.bouncycastle.tsp.ers;

import com.stub.StubApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ERSFileData extends ERSCachingData {
    private final File content;

    public ERSFileData(File file) throws FileNotFoundException {
        if (file.isDirectory()) {
            throw new IllegalArgumentException(StubApp.getString2(34963));
        }
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath() + StubApp.getString2(2939));
        }
        if (file.canRead()) {
            this.content = file;
            return;
        }
        throw new FileNotFoundException(file.getAbsolutePath() + StubApp.getString2(34962));
    }

    @Override // org.bouncycastle.tsp.ers.ERSCachingData
    public byte[] calculateHash(DigestCalculator digestCalculator, byte[] bArr) {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.content);
            byte[] calculateDigest = ERSUtil.calculateDigest(digestCalculator, fileInputStream);
            fileInputStream.close();
            return bArr != null ? ERSUtil.concatPreviousHashes(digestCalculator, bArr, calculateDigest) : calculateDigest;
        } catch (IOException unused) {
            throw new IllegalStateException(StubApp.getString2(34964) + this.content.getAbsolutePath());
        }
    }
}
