package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.spec.TLSKeyMaterialSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TLSKDF {

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = TLSKDF.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(a.n(a.n(a.n(a.n(sb2, str, StubApp.getString2(32264), configurableProvider, StubApp.getString2(32265)), str, StubApp.getString2(32266), configurableProvider, StubApp.getString2(32267)), str, StubApp.getString2(32268), configurableProvider, StubApp.getString2(32269)), str, StubApp.getString2(32270), configurableProvider, StubApp.getString2(32271)), str, StubApp.getString2(32272), configurableProvider, StubApp.getString2(32273));
        }
    }

    public static final class TLS10 extends TLSKeyMaterialFactory {
        public TLS10() {
            super(StubApp.getString2(32274));
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof TLSKeyMaterialSpec) {
                return new SecretKeySpec(TLSKDF.PRF_legacy((TLSKeyMaterialSpec) keySpec), this.algName);
            }
            throw new InvalidKeySpecException(StubApp.getString2(31733));
        }
    }

    public static final class TLS11 extends TLSKeyMaterialFactory {
        public TLS11() {
            super(StubApp.getString2(32275));
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof TLSKeyMaterialSpec) {
                return new SecretKeySpec(TLSKDF.PRF_legacy((TLSKeyMaterialSpec) keySpec), this.algName);
            }
            throw new InvalidKeySpecException(StubApp.getString2(31733));
        }
    }

    public static class TLS12 extends TLSKeyMaterialFactory {
        private final Mac prf;

        public TLS12(String str, Mac mac) {
            super(str);
            this.prf = mac;
        }

        private byte[] PRF(TLSKeyMaterialSpec tLSKeyMaterialSpec, Mac mac) {
            byte[] concatenate = Arrays.concatenate(Strings.toByteArray(tLSKeyMaterialSpec.getLabel()), tLSKeyMaterialSpec.getSeed());
            byte[] secret = tLSKeyMaterialSpec.getSecret();
            byte[] bArr = new byte[tLSKeyMaterialSpec.getLength()];
            TLSKDF.hmac_hash(mac, secret, concatenate, bArr);
            return bArr;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof TLSKeyMaterialSpec) {
                return new SecretKeySpec(PRF((TLSKeyMaterialSpec) keySpec, this.prf), this.algName);
            }
            throw new InvalidKeySpecException(StubApp.getString2(31733));
        }
    }

    public static final class TLS12withSHA256 extends TLS12 {
        public TLS12withSHA256() {
            super(StubApp.getString2(32276), new HMac(new SHA256Digest()));
        }
    }

    public static final class TLS12withSHA384 extends TLS12 {
        public TLS12withSHA384() {
            super(StubApp.getString2(32277), new HMac(new SHA384Digest()));
        }
    }

    public static final class TLS12withSHA512 extends TLS12 {
        public TLS12withSHA512() {
            super(StubApp.getString2(32278), new HMac(new SHA512Digest()));
        }
    }

    public static class TLSKeyMaterialFactory extends BaseSecretKeyFactory {
        public TLSKeyMaterialFactory(String str) {
            super(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] PRF_legacy(TLSKeyMaterialSpec tLSKeyMaterialSpec) {
        HMac hMac = new HMac(DigestFactory.createMD5());
        HMac hMac2 = new HMac(DigestFactory.createSHA1());
        byte[] concatenate = Arrays.concatenate(Strings.toByteArray(tLSKeyMaterialSpec.getLabel()), tLSKeyMaterialSpec.getSeed());
        byte[] secret = tLSKeyMaterialSpec.getSecret();
        int length = (secret.length + 1) / 2;
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        System.arraycopy(secret, 0, bArr, 0, length);
        System.arraycopy(secret, secret.length - length, bArr2, 0, length);
        int length2 = tLSKeyMaterialSpec.getLength();
        byte[] bArr3 = new byte[length2];
        byte[] bArr4 = new byte[length2];
        hmac_hash(hMac, bArr, concatenate, bArr3);
        hmac_hash(hMac2, bArr2, concatenate, bArr4);
        for (int i3 = 0; i3 < length2; i3++) {
            bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i3]);
        }
        return bArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hmac_hash(Mac mac, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        mac.init(new KeyParameter(bArr));
        int macSize = mac.getMacSize();
        int v2 = AbstractC1482f.v(bArr3.length, macSize, 1, macSize);
        int macSize2 = mac.getMacSize();
        byte[] bArr4 = new byte[macSize2];
        byte[] bArr5 = new byte[mac.getMacSize()];
        byte[] bArr6 = bArr2;
        int i3 = 0;
        while (i3 < v2) {
            mac.update(bArr6, 0, bArr6.length);
            mac.doFinal(bArr4, 0);
            mac.update(bArr4, 0, macSize2);
            mac.update(bArr2, 0, bArr2.length);
            mac.doFinal(bArr5, 0);
            int i10 = macSize * i3;
            System.arraycopy(bArr5, 0, bArr3, i10, Math.min(macSize, bArr3.length - i10));
            i3++;
            bArr6 = bArr4;
        }
    }
}
