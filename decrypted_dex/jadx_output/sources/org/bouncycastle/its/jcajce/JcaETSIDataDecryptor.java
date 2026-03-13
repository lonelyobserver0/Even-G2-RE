package org.bouncycastle.its.jcajce;

import com.stub.StubApp;
import java.security.PrivateKey;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.bouncycastle.its.operator.ETSIDataDecryptor;
import org.bouncycastle.jcajce.spec.IESKEMParameterSpec;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaETSIDataDecryptor implements ETSIDataDecryptor {
    private final JcaJceHelper helper;
    private final PrivateKey privateKey;
    private final byte[] recipientHash;
    private SecretKey secretKey = null;

    public static class Builder {
        private final PrivateKey key;
        private JcaJceHelper provider;
        private final byte[] recipientHash;

        public Builder(PrivateKey privateKey, byte[] bArr) {
            this.key = privateKey;
            this.recipientHash = Arrays.clone(bArr);
        }

        public JcaETSIDataDecryptor build() {
            return new JcaETSIDataDecryptor(this.key, this.recipientHash, this.provider);
        }

        public Builder provider(String str) {
            this.provider = new NamedJcaJceHelper(str);
            return this;
        }

        public Builder provider(Provider provider) {
            this.provider = new ProviderJcaJceHelper(provider);
            return this;
        }
    }

    public JcaETSIDataDecryptor(PrivateKey privateKey, byte[] bArr, JcaJceHelper jcaJceHelper) {
        this.privateKey = privateKey;
        this.helper = jcaJceHelper;
        this.recipientHash = bArr;
    }

    public static Builder builder(PrivateKey privateKey, byte[] bArr) {
        return new Builder(privateKey, bArr);
    }

    @Override // org.bouncycastle.its.operator.ETSIDataDecryptor
    public byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            Cipher createCipher = this.helper.createCipher(StubApp.getString2("29618"));
            createCipher.init(4, this.privateKey, new IESKEMParameterSpec(this.recipientHash));
            this.secretKey = (SecretKey) createCipher.unwrap(bArr, StubApp.getString2("461"), 3);
            Cipher createCipher2 = this.helper.createCipher(StubApp.getString2("29619"));
            createCipher2.init(2, this.secretKey, ClassUtil.getGCMSpec(bArr3, 128));
            return createCipher2.doFinal(bArr2);
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    @Override // org.bouncycastle.its.operator.ETSIDataDecryptor
    public byte[] getKey() {
        SecretKey secretKey = this.secretKey;
        if (secretKey != null) {
            return secretKey.getEncoded();
        }
        throw new IllegalStateException(StubApp.getString2(29620));
    }
}
