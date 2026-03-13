package org.bouncycastle.its.jcajce;

import com.stub.StubApp;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.its.operator.ETSIDataEncryptor;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JceETSIDataEncryptor implements ETSIDataEncryptor {
    private final JcaJceHelper helper;
    private byte[] key;
    private byte[] nonce;
    private final SecureRandom random;

    /* renamed from: org.bouncycastle.its.jcajce.JceETSIDataEncryptor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private JcaJceHelper helper = new DefaultJcaJceHelper();
        private SecureRandom random;

        public JceETSIDataEncryptor build() {
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            return new JceETSIDataEncryptor(this.random, this.helper, null);
        }

        public Builder setProvider(String str) {
            this.helper = new NamedJcaJceHelper(str);
            return this;
        }

        public Builder setRandom(SecureRandom secureRandom) {
            this.random = secureRandom;
            return this;
        }

        public Builder setProvider(Provider provider) {
            this.helper = new ProviderJcaJceHelper(provider);
            return this;
        }
    }

    private JceETSIDataEncryptor(SecureRandom secureRandom, JcaJceHelper jcaJceHelper) {
        this.random = secureRandom;
        this.helper = jcaJceHelper;
    }

    @Override // org.bouncycastle.its.operator.ETSIDataEncryptor
    public byte[] encrypt(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        this.key = bArr2;
        this.random.nextBytes(bArr2);
        byte[] bArr3 = new byte[12];
        this.nonce = bArr3;
        this.random.nextBytes(bArr3);
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.key, StubApp.getString2("461"));
            Cipher createCipher = this.helper.createCipher(StubApp.getString2("29619"));
            createCipher.init(1, secretKeySpec, ClassUtil.getGCMSpec(this.nonce, 128));
            return createCipher.doFinal(bArr);
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    @Override // org.bouncycastle.its.operator.ETSIDataEncryptor
    public byte[] getKey() {
        return this.key;
    }

    @Override // org.bouncycastle.its.operator.ETSIDataEncryptor
    public byte[] getNonce() {
        return this.nonce;
    }

    public /* synthetic */ JceETSIDataEncryptor(SecureRandom secureRandom, JcaJceHelper jcaJceHelper, AnonymousClass1 anonymousClass1) {
        this(secureRandom, jcaJceHelper);
    }
}
