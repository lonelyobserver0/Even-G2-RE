package org.bouncycastle.pkcs;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.operator.OutputEncryptor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKCS8EncryptedPrivateKeyInfoBuilder {
    private PrivateKeyInfo privateKeyInfo;

    public PKCS8EncryptedPrivateKeyInfoBuilder(PrivateKeyInfo privateKeyInfo) {
        this.privateKeyInfo = privateKeyInfo;
    }

    public PKCS8EncryptedPrivateKeyInfo build(OutputEncryptor outputEncryptor) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            OutputStream outputStream = outputEncryptor.getOutputStream(byteArrayOutputStream);
            outputStream.write(this.privateKeyInfo.getEncoded());
            outputStream.close();
            return new PKCS8EncryptedPrivateKeyInfo(new EncryptedPrivateKeyInfo(outputEncryptor.getAlgorithmIdentifier(), byteArrayOutputStream.toByteArray()));
        } catch (IOException unused) {
            throw new IllegalStateException(StubApp.getString2(33900));
        }
    }

    public PKCS8EncryptedPrivateKeyInfoBuilder(byte[] bArr) {
        this(PrivateKeyInfo.getInstance(bArr));
    }
}
