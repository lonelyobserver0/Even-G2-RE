package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.GOST3411_2012_512Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.ECGOST3410_2012Signer;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.interfaces.ECKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECGOST2012SignatureSpi512 extends SignatureSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers {
    private int size = 128;
    private int halfSize = 64;
    private Digest digest = new GOST3411_2012_512Digest();
    private DSAExt signer = new ECGOST3410_2012Signer();

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        return publicKey instanceof BCECGOST3410_2012PublicKey ? ((BCECGOST3410_2012PublicKey) publicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof ECKey)) {
            throw new InvalidKeyException(StubApp.getString2(30672));
        }
        ECKeyParameters eCKeyParameters = (ECKeyParameters) ECUtil.generatePrivateKeyParameter(privateKey);
        if (eCKeyParameters.getParameters().getN().bitLength() < 505) {
            throw new InvalidKeyException(StubApp.getString2(30671));
        }
        this.digest.reset();
        SecureRandom secureRandom = ((SignatureSpi) this).appRandom;
        if (secureRandom != null) {
            this.signer.init(true, new ParametersWithRandom(eCKeyParameters, secureRandom));
        } else {
            this.signer.init(true, eCKeyParameters);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        ECKeyParameters eCKeyParameters;
        if (publicKey instanceof ECPublicKey) {
            eCKeyParameters = (ECKeyParameters) generatePublicKeyParameter(publicKey);
        } else {
            try {
                eCKeyParameters = (ECKeyParameters) ECUtil.generatePublicKeyParameter(BouncyCastleProvider.getPublicKey(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded())));
            } catch (Exception unused) {
                throw new InvalidKeyException(StubApp.getString2(30672));
            }
        }
        if (eCKeyParameters.getParameters().getN().bitLength() < 505) {
            throw new InvalidKeyException(StubApp.getString2(30671));
        }
        this.digest.reset();
        this.signer.init(false, eCKeyParameters);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            byte[] bArr2 = new byte[this.size];
            BigInteger[] generateSignature = this.signer.generateSignature(bArr);
            byte[] byteArray = generateSignature[0].toByteArray();
            byte[] byteArray2 = generateSignature[1].toByteArray();
            if (byteArray2[0] != 0) {
                System.arraycopy(byteArray2, 0, bArr2, this.halfSize - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr2, this.halfSize - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                System.arraycopy(byteArray, 0, bArr2, this.size - byteArray.length, byteArray.length);
                return bArr2;
            }
            System.arraycopy(byteArray, 1, bArr2, this.size - (byteArray.length - 1), byteArray.length - 1);
            return bArr2;
        } catch (Exception e10) {
            throw new SignatureException(e10.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b2) throws SignatureException {
        this.digest.update(b2);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            int i3 = this.halfSize;
            byte[] bArr3 = new byte[i3];
            byte[] bArr4 = new byte[i3];
            System.arraycopy(bArr, 0, bArr4, 0, i3);
            int i10 = this.halfSize;
            System.arraycopy(bArr, i10, bArr3, 0, i10);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr3), new BigInteger(1, bArr4)};
            return this.signer.verifySignature(bArr2, bigIntegerArr[0], bigIntegerArr[1]);
        } catch (Exception unused) {
            throw new SignatureException(StubApp.getString2(30580));
        }
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i3, int i10) throws SignatureException {
        this.digest.update(bArr, i3, i10);
    }
}
