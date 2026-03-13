package org.bouncycastle.cms.bc;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.CipherFactory;
import org.bouncycastle.operator.DefaultSecretKeySizeProvider;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.MacCaptureStream;
import org.bouncycastle.operator.OutputAEADEncryptor;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.operator.SecretKeySizeProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BcCMSContentEncryptorBuilder {
    private static final SecretKeySizeProvider KEY_SIZE_PROVIDER = DefaultSecretKeySizeProvider.INSTANCE;
    private final ASN1ObjectIdentifier encryptionOID;
    private EnvelopedDataHelper helper;
    private final int keySize;
    private SecureRandom random;

    public static class AADStream extends OutputStream {
        private AEADBlockCipher cipher;

        public AADStream(AEADBlockCipher aEADBlockCipher) {
            this.cipher = aEADBlockCipher;
        }

        @Override // java.io.OutputStream
        public void write(int i3) throws IOException {
            this.cipher.processAADByte((byte) i3);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i3, int i10) throws IOException {
            this.cipher.processAADBytes(bArr, i3, i10);
        }
    }

    public class CMSAuthOutputEncryptor extends CMSOutputEncryptor implements OutputAEADEncryptor {
        private AEADBlockCipher aeadCipher;
        private MacCaptureStream macOut;

        public CMSAuthOutputEncryptor(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i3, SecureRandom secureRandom) throws CMSException {
            super(aSN1ObjectIdentifier, i3, secureRandom);
            this.aeadCipher = getCipher();
        }

        private AEADBlockCipher getCipher() {
            Object obj = this.cipher;
            if (obj instanceof AEADBlockCipher) {
                return (AEADBlockCipher) obj;
            }
            throw new IllegalArgumentException(StubApp.getString2(28244));
        }

        @Override // org.bouncycastle.operator.AADProcessor
        public OutputStream getAADStream() {
            return new AADStream(this.aeadCipher);
        }

        @Override // org.bouncycastle.operator.AADProcessor
        public byte[] getMAC() {
            return this.macOut.getMac();
        }

        @Override // org.bouncycastle.cms.bc.BcCMSContentEncryptorBuilder.CMSOutputEncryptor, org.bouncycastle.operator.OutputEncryptor
        public OutputStream getOutputStream(OutputStream outputStream) {
            MacCaptureStream macCaptureStream = new MacCaptureStream(outputStream, this.aeadCipher.getMac().length);
            this.macOut = macCaptureStream;
            return CipherFactory.createOutputStream(macCaptureStream, this.cipher);
        }
    }

    public class CMSOutputEncryptor implements OutputEncryptor {
        private AlgorithmIdentifier algorithmIdentifier;
        protected Object cipher;
        private KeyParameter encKey;

        public CMSOutputEncryptor(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i3, SecureRandom secureRandom) throws CMSException {
            secureRandom = secureRandom == null ? new SecureRandom() : secureRandom;
            this.encKey = new KeyParameter(BcCMSContentEncryptorBuilder.this.helper.createKeyGenerator(aSN1ObjectIdentifier, i3, secureRandom).generateKey());
            AlgorithmIdentifier generateEncryptionAlgID = BcCMSContentEncryptorBuilder.this.helper.generateEncryptionAlgID(aSN1ObjectIdentifier, this.encKey, secureRandom);
            this.algorithmIdentifier = generateEncryptionAlgID;
            this.cipher = EnvelopedDataHelper.createContentCipher(true, this.encKey, generateEncryptionAlgID);
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.algorithmIdentifier;
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public GenericKey getKey() {
            return new GenericKey(this.algorithmIdentifier, this.encKey.getKey());
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public OutputStream getOutputStream(OutputStream outputStream) {
            return CipherFactory.createOutputStream(outputStream, this.cipher);
        }
    }

    public BcCMSContentEncryptorBuilder(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this(aSN1ObjectIdentifier, KEY_SIZE_PROVIDER.getKeySize(aSN1ObjectIdentifier));
    }

    public OutputEncryptor build() throws CMSException {
        return this.helper.isAuthEnveloped(this.encryptionOID) ? new CMSAuthOutputEncryptor(this.encryptionOID, this.keySize, this.random) : new CMSOutputEncryptor(this.encryptionOID, this.keySize, this.random);
    }

    public BcCMSContentEncryptorBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public BcCMSContentEncryptorBuilder(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i3) {
        this.helper = new EnvelopedDataHelper();
        this.encryptionOID = aSN1ObjectIdentifier;
        int keySize = KEY_SIZE_PROVIDER.getKeySize(aSN1ObjectIdentifier);
        boolean equals = aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.des_EDE3_CBC);
        String string2 = StubApp.getString2(28245);
        if (equals) {
            if (i3 != 168 && i3 != keySize) {
                throw new IllegalArgumentException(string2);
            }
            this.keySize = 168;
            return;
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) OIWObjectIdentifiers.desCBC)) {
            if (i3 != 56 && i3 != keySize) {
                throw new IllegalArgumentException(string2);
            }
            this.keySize = 56;
            return;
        }
        if (keySize > 0 && keySize != i3) {
            throw new IllegalArgumentException(string2);
        }
        this.keySize = i3;
    }
}
