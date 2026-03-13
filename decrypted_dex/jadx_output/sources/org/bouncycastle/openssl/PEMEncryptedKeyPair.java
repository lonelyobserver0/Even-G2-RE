package org.bouncycastle.openssl;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import org.bouncycastle.operator.OperatorCreationException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PEMEncryptedKeyPair {
    private final String dekAlgName;
    private final byte[] iv;
    private final byte[] keyBytes;
    private final PEMKeyPairParser parser;

    public PEMEncryptedKeyPair(String str, byte[] bArr, byte[] bArr2, PEMKeyPairParser pEMKeyPairParser) {
        this.dekAlgName = str;
        this.iv = bArr;
        this.keyBytes = bArr2;
        this.parser = pEMKeyPairParser;
    }

    public PEMKeyPair decryptKeyPair(PEMDecryptorProvider pEMDecryptorProvider) throws IOException {
        try {
            return this.parser.parse(pEMDecryptorProvider.get(this.dekAlgName).decrypt(this.keyBytes, this.iv));
        } catch (IOException e10) {
            throw e10;
        } catch (OperatorCreationException e11) {
            throw new PEMException(StubApp.getString2(33632) + e11.getMessage(), e11);
        } catch (Exception e12) {
            throw new PEMException(u.r(e12, new StringBuilder(StubApp.getString2(33631))), e12);
        }
    }

    public String getDekAlgName() {
        return this.dekAlgName;
    }
}
