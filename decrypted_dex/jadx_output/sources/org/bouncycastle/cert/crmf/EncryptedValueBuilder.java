package org.bouncycastle.cert.crmf;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.crmf.EncryptedValue;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.KeyWrapper;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfoBuilder;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EncryptedValueBuilder {
    private OutputEncryptor encryptor;
    private EncryptedValuePadder padder;
    private KeyWrapper wrapper;

    public EncryptedValueBuilder(KeyWrapper keyWrapper, OutputEncryptor outputEncryptor) {
        this(keyWrapper, outputEncryptor, null);
    }

    private EncryptedValue encryptData(byte[] bArr) throws CRMFException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream outputStream = this.encryptor.getOutputStream(byteArrayOutputStream);
        try {
            outputStream.write(bArr);
            outputStream.close();
            AlgorithmIdentifier algorithmIdentifier = this.encryptor.getAlgorithmIdentifier();
            try {
                this.wrapper.generateWrappedKey(this.encryptor.getKey());
                return new EncryptedValue(null, algorithmIdentifier, new DERBitString(this.wrapper.generateWrappedKey(this.encryptor.getKey())), this.wrapper.getAlgorithmIdentifier(), null, new DERBitString(byteArrayOutputStream.toByteArray()));
            } catch (OperatorException e10) {
                throw new CRMFException(StubApp.getString2(28034) + e10.getMessage(), e10);
            }
        } catch (IOException e11) {
            throw new CRMFException(u.q(e11, new StringBuilder(StubApp.getString2(28035))), e11);
        }
    }

    private byte[] padData(byte[] bArr) {
        EncryptedValuePadder encryptedValuePadder = this.padder;
        return encryptedValuePadder != null ? encryptedValuePadder.getPaddedData(bArr) : bArr;
    }

    public EncryptedValue build(PrivateKeyInfo privateKeyInfo) throws CRMFException {
        try {
            return new EncryptedValue(privateKeyInfo.getPrivateKeyAlgorithm(), this.encryptor.getAlgorithmIdentifier(), new DERBitString(this.wrapper.generateWrappedKey(this.encryptor.getKey())), this.wrapper.getAlgorithmIdentifier(), null, new DERBitString(new PKCS8EncryptedPrivateKeyInfoBuilder(privateKeyInfo).build(this.encryptor).getEncryptedData()));
        } catch (IllegalStateException e10) {
            throw new CRMFException(StubApp.getString2(28036) + e10.getMessage(), e10);
        } catch (OperatorException e11) {
            throw new CRMFException(StubApp.getString2(28034) + e11.getMessage(), e11);
        }
    }

    public EncryptedValueBuilder(KeyWrapper keyWrapper, OutputEncryptor outputEncryptor, EncryptedValuePadder encryptedValuePadder) {
        this.wrapper = keyWrapper;
        this.encryptor = outputEncryptor;
        this.padder = encryptedValuePadder;
    }

    public EncryptedValue build(X509CertificateHolder x509CertificateHolder) throws CRMFException {
        try {
            return encryptData(padData(x509CertificateHolder.getEncoded()));
        } catch (IOException e10) {
            throw new CRMFException(u.q(e10, new StringBuilder(StubApp.getString2(28037))), e10);
        }
    }

    public EncryptedValue build(char[] cArr) throws CRMFException {
        return encryptData(padData(Strings.toUTF8ByteArray(cArr)));
    }
}
