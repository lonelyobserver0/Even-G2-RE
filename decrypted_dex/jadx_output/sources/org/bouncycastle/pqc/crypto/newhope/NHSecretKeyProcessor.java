package org.bouncycastle.pqc.crypto.newhope;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.ExchangePair;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NHSecretKeyProcessor {
    private final Xof xof;

    /* renamed from: org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class PartyUBuilder {
        private final AsymmetricCipherKeyPair aKp;
        private final NHAgreement agreement;
        private byte[] sharedInfo;
        private boolean used;

        public PartyUBuilder(SecureRandom secureRandom) {
            NHAgreement nHAgreement = new NHAgreement();
            this.agreement = nHAgreement;
            this.sharedInfo = null;
            this.used = false;
            NHKeyPairGenerator nHKeyPairGenerator = new NHKeyPairGenerator();
            nHKeyPairGenerator.init(new KeyGenerationParameters(secureRandom, 2048));
            AsymmetricCipherKeyPair generateKeyPair = nHKeyPairGenerator.generateKeyPair();
            this.aKp = generateKeyPair;
            nHAgreement.init(generateKeyPair.getPrivate());
        }

        public NHSecretKeyProcessor build(byte[] bArr) {
            if (this.used) {
                throw new IllegalStateException(StubApp.getString2(34048));
            }
            this.used = true;
            return new NHSecretKeyProcessor(this.agreement.calculateAgreement(new NHPublicKeyParameters(bArr)), this.sharedInfo, null);
        }

        public byte[] getPartA() {
            return ((NHPublicKeyParameters) this.aKp.getPublic()).getPubData();
        }

        public PartyUBuilder withSharedInfo(byte[] bArr) {
            this.sharedInfo = Arrays.clone(bArr);
            return this;
        }
    }

    public static class PartyVBuilder {
        protected final SecureRandom random;
        private byte[] sharedInfo = null;
        private byte[] sharedSecret = null;
        private boolean used = false;

        public PartyVBuilder(SecureRandom secureRandom) {
            this.random = secureRandom;
        }

        public NHSecretKeyProcessor build() {
            if (this.used) {
                throw new IllegalStateException(StubApp.getString2(34048));
            }
            this.used = true;
            return new NHSecretKeyProcessor(this.sharedSecret, this.sharedInfo, null);
        }

        public byte[] getPartB(byte[] bArr) {
            ExchangePair generateExchange = new NHExchangePairGenerator(this.random).generateExchange(new NHPublicKeyParameters(bArr));
            this.sharedSecret = generateExchange.getSharedValue();
            return ((NHPublicKeyParameters) generateExchange.getPublicKey()).getPubData();
        }

        public PartyVBuilder withSharedInfo(byte[] bArr) {
            this.sharedInfo = Arrays.clone(bArr);
            return this;
        }
    }

    private NHSecretKeyProcessor(byte[] bArr, byte[] bArr2) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        this.xof = sHAKEDigest;
        sHAKEDigest.update(bArr, 0, bArr.length);
        if (bArr2 != null) {
            sHAKEDigest.update(bArr2, 0, bArr2.length);
        }
        Arrays.fill(bArr, (byte) 0);
    }

    private static void xor(byte[] bArr, byte[] bArr2) {
        for (int i3 = 0; i3 != bArr.length; i3++) {
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
        }
    }

    public byte[] processKey(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.xof.doFinal(bArr2, 0, length);
        xor(bArr, bArr2);
        Arrays.fill(bArr2, (byte) 0);
        return bArr;
    }

    public /* synthetic */ NHSecretKeyProcessor(byte[] bArr, byte[] bArr2, AnonymousClass1 anonymousClass1) {
        this(bArr, bArr2);
    }
}
