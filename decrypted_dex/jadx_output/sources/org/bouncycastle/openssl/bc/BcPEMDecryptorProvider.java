package org.bouncycastle.openssl.bc;

import com.stub.StubApp;
import org.bouncycastle.openssl.PEMDecryptor;
import org.bouncycastle.openssl.PEMDecryptorProvider;
import org.bouncycastle.openssl.PEMException;
import org.bouncycastle.openssl.PasswordException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BcPEMDecryptorProvider implements PEMDecryptorProvider {
    private final char[] password;

    public BcPEMDecryptorProvider(char[] cArr) {
        this.password = cArr;
    }

    @Override // org.bouncycastle.openssl.PEMDecryptorProvider
    public PEMDecryptor get(final String str) {
        return new PEMDecryptor() { // from class: org.bouncycastle.openssl.bc.BcPEMDecryptorProvider.1
            @Override // org.bouncycastle.openssl.PEMDecryptor
            public byte[] decrypt(byte[] bArr, byte[] bArr2) throws PEMException {
                if (BcPEMDecryptorProvider.this.password != null) {
                    return PEMUtilities.crypt(false, bArr, BcPEMDecryptorProvider.this.password, str, bArr2);
                }
                throw new PasswordException(StubApp.getString2(33653));
            }
        };
    }
}
