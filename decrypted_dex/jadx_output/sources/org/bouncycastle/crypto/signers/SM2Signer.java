package org.bouncycastle.crypto.signers;

import com.stub.StubApp;
import i2.u;
import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithID;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SM2Signer implements Signer, ECConstants {
    private final Digest digest;
    private ECKeyParameters ecKey;
    private ECDomainParameters ecParams;
    private final DSAEncoding encoding;
    private final DSAKCalculator kCalculator;
    private ECPoint pubPoint;

    /* renamed from: z, reason: collision with root package name */
    private byte[] f19121z;

    public SM2Signer() {
        this(StandardDSAEncoding.INSTANCE, new SM3Digest());
    }

    private void addFieldElement(Digest digest, ECFieldElement eCFieldElement) {
        byte[] encoded = eCFieldElement.getEncoded();
        digest.update(encoded, 0, encoded.length);
    }

    private void addUserID(Digest digest, byte[] bArr) {
        int length = bArr.length * 8;
        digest.update((byte) ((length >> 8) & 255));
        digest.update((byte) (length & 255));
        digest.update(bArr, 0, bArr.length);
    }

    private byte[] digestDoFinal() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        reset();
        return bArr;
    }

    private byte[] getZ(byte[] bArr) {
        this.digest.reset();
        addUserID(this.digest, bArr);
        addFieldElement(this.digest, this.ecParams.getCurve().getA());
        addFieldElement(this.digest, this.ecParams.getCurve().getB());
        addFieldElement(this.digest, this.ecParams.getG().getAffineXCoord());
        addFieldElement(this.digest, this.ecParams.getG().getAffineYCoord());
        addFieldElement(this.digest, this.pubPoint.getAffineXCoord());
        addFieldElement(this.digest, this.pubPoint.getAffineYCoord());
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        return bArr2;
    }

    private boolean verifySignature(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger n10 = this.ecParams.getN();
        BigInteger bigInteger3 = ECConstants.ONE;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(n10) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(n10) >= 0) {
            return false;
        }
        BigInteger calculateE = calculateE(n10, digestDoFinal());
        BigInteger mod = bigInteger.add(bigInteger2).mod(n10);
        if (mod.equals(ECConstants.ZERO)) {
            return false;
        }
        ECPoint normalize = ECAlgorithms.sumOfTwoMultiplies(this.ecParams.getG(), bigInteger2, ((ECPublicKeyParameters) this.ecKey).getQ(), mod).normalize();
        if (normalize.isInfinity()) {
            return false;
        }
        return calculateE.add(normalize.getAffineXCoord().toBigInteger()).mod(n10).equals(bigInteger);
    }

    public BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        byte[] digestDoFinal = digestDoFinal();
        BigInteger n10 = this.ecParams.getN();
        BigInteger calculateE = calculateE(n10, digestDoFinal);
        BigInteger d8 = ((ECPrivateKeyParameters) this.ecKey).getD();
        ECMultiplier createBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger nextK = this.kCalculator.nextK();
            BigInteger mod = calculateE.add(createBasePointMultiplier.multiply(this.ecParams.getG(), nextK).normalize().getAffineXCoord().toBigInteger()).mod(n10);
            BigInteger bigInteger = ECConstants.ZERO;
            if (!mod.equals(bigInteger) && !mod.add(nextK).equals(n10)) {
                BigInteger mod2 = BigIntegers.modOddInverse(n10, d8.add(ECConstants.ONE)).multiply(nextK.subtract(mod.multiply(d8)).mod(n10)).mod(n10);
                if (!mod2.equals(bigInteger)) {
                    try {
                        return this.encoding.encode(this.ecParams.getN(), mod, mod2);
                    } catch (Exception e10) {
                        throw new CryptoException(u.r(e10, new StringBuilder(StubApp.getString2(29327))), e10);
                    }
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z2, CipherParameters cipherParameters) {
        byte[] decodeStrict;
        ECPoint q10;
        if (cipherParameters instanceof ParametersWithID) {
            ParametersWithID parametersWithID = (ParametersWithID) cipherParameters;
            CipherParameters parameters = parametersWithID.getParameters();
            byte[] id = parametersWithID.getID();
            if (id.length >= 8192) {
                throw new IllegalArgumentException(StubApp.getString2(29331));
            }
            decodeStrict = id;
            cipherParameters = parameters;
        } else {
            decodeStrict = Hex.decodeStrict(StubApp.getString2(29332));
        }
        if (z2) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                ECKeyParameters eCKeyParameters = (ECKeyParameters) parametersWithRandom.getParameters();
                this.ecKey = eCKeyParameters;
                ECDomainParameters parameters2 = eCKeyParameters.getParameters();
                this.ecParams = parameters2;
                this.kCalculator.init(parameters2.getN(), parametersWithRandom.getRandom());
            } else {
                ECKeyParameters eCKeyParameters2 = (ECKeyParameters) cipherParameters;
                this.ecKey = eCKeyParameters2;
                ECDomainParameters parameters3 = eCKeyParameters2.getParameters();
                this.ecParams = parameters3;
                this.kCalculator.init(parameters3.getN(), CryptoServicesRegistrar.getSecureRandom());
            }
            q10 = createBasePointMultiplier().multiply(this.ecParams.getG(), ((ECPrivateKeyParameters) this.ecKey).getD()).normalize();
        } else {
            ECKeyParameters eCKeyParameters3 = (ECKeyParameters) cipherParameters;
            this.ecKey = eCKeyParameters3;
            this.ecParams = eCKeyParameters3.getParameters();
            q10 = ((ECPublicKeyParameters) this.ecKey).getQ();
        }
        this.pubPoint = q10;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(29297), this.ecKey, z2));
        byte[] z10 = getZ(decodeStrict);
        this.f19121z = z10;
        this.digest.update(z10, 0, z10.length);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
        byte[] bArr = this.f19121z;
        if (bArr != null) {
            this.digest.update(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b2) {
        this.digest.update(b2);
    }

    public SM2Signer(Digest digest) {
        this(StandardDSAEncoding.INSTANCE, digest);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i3, int i10) {
        this.digest.update(bArr, i3, i10);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        try {
            BigInteger[] decode = this.encoding.decode(this.ecParams.getN(), bArr);
            return verifySignature(decode[0], decode[1]);
        } catch (Exception unused) {
            return false;
        }
    }

    public SM2Signer(DSAEncoding dSAEncoding) {
        this.kCalculator = new RandomDSAKCalculator();
        this.encoding = dSAEncoding;
        this.digest = new SM3Digest();
    }

    public SM2Signer(DSAEncoding dSAEncoding, Digest digest) {
        this.kCalculator = new RandomDSAKCalculator();
        this.encoding = dSAEncoding;
        this.digest = digest;
    }
}
