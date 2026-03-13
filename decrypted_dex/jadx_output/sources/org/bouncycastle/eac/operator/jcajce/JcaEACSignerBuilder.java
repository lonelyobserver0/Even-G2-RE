package org.bouncycastle.eac.operator.jcajce;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.eac.operator.EACSigner;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.OperatorStreamException;
import org.bouncycastle.operator.RuntimeOperatorException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaEACSignerBuilder {
    private static final Hashtable sigNames;
    private EACHelper helper = new DefaultEACHelper();

    public static class SignatureOutputStream extends OutputStream {
        private Signature sig;

        public SignatureOutputStream(Signature signature) {
            this.sig = signature;
        }

        public byte[] getSignature() throws SignatureException {
            return this.sig.sign();
        }

        @Override // java.io.OutputStream
        public void write(int i3) throws IOException {
            try {
                this.sig.update((byte) i3);
            } catch (SignatureException e10) {
                throw new OperatorStreamException(StubApp.getString2(29436) + e10.getMessage(), e10);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            try {
                this.sig.update(bArr);
            } catch (SignatureException e10) {
                throw new OperatorStreamException(StubApp.getString2(29436) + e10.getMessage(), e10);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i3, int i10) throws IOException {
            try {
                this.sig.update(bArr, i3, i10);
            } catch (SignatureException e10) {
                throw new OperatorStreamException(StubApp.getString2(29436) + e10.getMessage(), e10);
            }
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        sigNames = hashtable;
        hashtable.put(StubApp.getString2(29424), EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1);
        hashtable.put(StubApp.getString2(29425), EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256);
        hashtable.put(StubApp.getString2(29426), EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1);
        hashtable.put(StubApp.getString2(29427), EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256);
        hashtable.put(StubApp.getString2(29428), EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_512);
        hashtable.put(StubApp.getString2(29429), EACObjectIdentifiers.id_TA_RSA_PSS_SHA_512);
        hashtable.put(StubApp.getString2(29430), EACObjectIdentifiers.id_TA_ECDSA_SHA_1);
        hashtable.put(StubApp.getString2(29431), EACObjectIdentifiers.id_TA_ECDSA_SHA_224);
        hashtable.put(StubApp.getString2(29432), EACObjectIdentifiers.id_TA_ECDSA_SHA_256);
        hashtable.put(StubApp.getString2(29433), EACObjectIdentifiers.id_TA_ECDSA_SHA_384);
        hashtable.put(StubApp.getString2(29434), EACObjectIdentifiers.id_TA_ECDSA_SHA_512);
    }

    private static void copyUnsignedInt(byte[] bArr, byte[] bArr2, int i3) {
        int length = bArr.length;
        int i10 = 0;
        if (bArr[0] == 0) {
            length--;
            i10 = 1;
        }
        System.arraycopy(bArr, i10, bArr2, i3, length);
    }

    public static int max(int i3, int i10) {
        return i3 > i10 ? i3 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] reencode(byte[] bArr) {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
        BigInteger value = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue();
        BigInteger value2 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue();
        byte[] byteArray = value.toByteArray();
        byte[] byteArray2 = value2.toByteArray();
        int unsignedIntLength = unsignedIntLength(byteArray);
        int unsignedIntLength2 = unsignedIntLength(byteArray2);
        int max = max(unsignedIntLength, unsignedIntLength2);
        int i3 = max * 2;
        byte[] bArr2 = new byte[i3];
        Arrays.fill(bArr2, (byte) 0);
        copyUnsignedInt(byteArray, bArr2, max - unsignedIntLength);
        copyUnsignedInt(byteArray2, bArr2, i3 - unsignedIntLength2);
        return bArr2;
    }

    private static int unsignedIntLength(byte[] bArr) {
        int length = bArr.length;
        return bArr[0] == 0 ? length - 1 : length;
    }

    public EACSigner build(String str, PrivateKey privateKey) throws OperatorCreationException {
        return build((ASN1ObjectIdentifier) sigNames.get(str), privateKey);
    }

    public JcaEACSignerBuilder setProvider(String str) {
        this.helper = new NamedEACHelper(str);
        return this;
    }

    public EACSigner build(final ASN1ObjectIdentifier aSN1ObjectIdentifier, PrivateKey privateKey) throws OperatorCreationException {
        try {
            Signature signature = this.helper.getSignature(aSN1ObjectIdentifier);
            signature.initSign(privateKey);
            final SignatureOutputStream signatureOutputStream = new SignatureOutputStream(signature);
            return new EACSigner() { // from class: org.bouncycastle.eac.operator.jcajce.JcaEACSignerBuilder.1
                @Override // org.bouncycastle.eac.operator.EACSigner
                public OutputStream getOutputStream() {
                    return signatureOutputStream;
                }

                @Override // org.bouncycastle.eac.operator.EACSigner
                public byte[] getSignature() {
                    try {
                        byte[] signature2 = signatureOutputStream.getSignature();
                        return aSN1ObjectIdentifier.on(EACObjectIdentifiers.id_TA_ECDSA) ? JcaEACSignerBuilder.reencode(signature2) : signature2;
                    } catch (SignatureException e10) {
                        throw new RuntimeOperatorException(StubApp.getString2(29435) + e10.getMessage(), e10);
                    }
                }

                @Override // org.bouncycastle.eac.operator.EACSigner
                public ASN1ObjectIdentifier getUsageIdentifier() {
                    return aSN1ObjectIdentifier;
                }
            };
        } catch (InvalidKeyException e10) {
            throw new OperatorCreationException(StubApp.getString2(28073) + e10.getMessage(), e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new OperatorCreationException(StubApp.getString2(29438) + e11.getMessage(), e11);
        } catch (NoSuchProviderException e12) {
            throw new OperatorCreationException(StubApp.getString2(29437) + e12.getMessage(), e12);
        }
    }

    public JcaEACSignerBuilder setProvider(Provider provider) {
        this.helper = new ProviderEACHelper(provider);
        return this;
    }
}
