package org.bouncycastle.crypto.agreement;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithID;
import org.bouncycastle.crypto.params.SM2KeyExchangePrivateParameters;
import org.bouncycastle.crypto.params.SM2KeyExchangePublicParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SM2KeyExchange {
    private final Digest digest;
    private ECDomainParameters ecParams;
    private ECPrivateKeyParameters ephemeralKey;
    private ECPoint ephemeralPubPoint;
    private boolean initiator;
    private ECPrivateKeyParameters staticKey;
    private ECPoint staticPubPoint;
    private byte[] userID;

    /* renamed from: w, reason: collision with root package name */
    private int f18736w;

    public SM2KeyExchange() {
        this(new SM3Digest());
    }

    private byte[] S1(Digest digest, ECPoint eCPoint, byte[] bArr) {
        digest.update((byte) 2);
        addFieldElement(digest, eCPoint.getAffineYCoord());
        digest.update(bArr, 0, bArr.length);
        return digestDoFinal();
    }

    private byte[] S2(Digest digest, ECPoint eCPoint, byte[] bArr) {
        digest.update((byte) 3);
        addFieldElement(digest, eCPoint.getAffineYCoord());
        digest.update(bArr, 0, bArr.length);
        return digestDoFinal();
    }

    private void addFieldElement(Digest digest, ECFieldElement eCFieldElement) {
        byte[] encoded = eCFieldElement.getEncoded();
        digest.update(encoded, 0, encoded.length);
    }

    private void addUserID(Digest digest, byte[] bArr) {
        int length = bArr.length * 8;
        digest.update((byte) (length >>> 8));
        digest.update((byte) length);
        digest.update(bArr, 0, bArr.length);
    }

    private byte[] calculateInnerHash(Digest digest, ECPoint eCPoint, byte[] bArr, byte[] bArr2, ECPoint eCPoint2, ECPoint eCPoint3) {
        addFieldElement(digest, eCPoint.getAffineXCoord());
        digest.update(bArr, 0, bArr.length);
        digest.update(bArr2, 0, bArr2.length);
        addFieldElement(digest, eCPoint2.getAffineXCoord());
        addFieldElement(digest, eCPoint2.getAffineYCoord());
        addFieldElement(digest, eCPoint3.getAffineXCoord());
        addFieldElement(digest, eCPoint3.getAffineYCoord());
        return digestDoFinal();
    }

    private ECPoint calculateU(SM2KeyExchangePublicParameters sM2KeyExchangePublicParameters) {
        ECDomainParameters parameters = this.staticKey.getParameters();
        ECPoint cleanPoint = ECAlgorithms.cleanPoint(parameters.getCurve(), sM2KeyExchangePublicParameters.getStaticPublicKey().getQ());
        ECPoint cleanPoint2 = ECAlgorithms.cleanPoint(parameters.getCurve(), sM2KeyExchangePublicParameters.getEphemeralPublicKey().getQ());
        BigInteger reduce = reduce(this.ephemeralPubPoint.getAffineXCoord().toBigInteger());
        BigInteger reduce2 = reduce(cleanPoint2.getAffineXCoord().toBigInteger());
        BigInteger mod = this.ecParams.getH().multiply(this.staticKey.getD().add(reduce.multiply(this.ephemeralKey.getD()))).mod(this.ecParams.getN());
        return ECAlgorithms.sumOfTwoMultiplies(cleanPoint, mod, cleanPoint2, mod.multiply(reduce2).mod(this.ecParams.getN())).normalize();
    }

    private byte[] digestDoFinal() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        return bArr;
    }

    private byte[] getZ(Digest digest, byte[] bArr, ECPoint eCPoint) {
        addUserID(digest, bArr);
        addFieldElement(digest, this.ecParams.getCurve().getA());
        addFieldElement(digest, this.ecParams.getCurve().getB());
        addFieldElement(digest, this.ecParams.getG().getAffineXCoord());
        addFieldElement(digest, this.ecParams.getG().getAffineYCoord());
        addFieldElement(digest, eCPoint.getAffineXCoord());
        addFieldElement(digest, eCPoint.getAffineYCoord());
        return digestDoFinal();
    }

    private byte[] kdf(ECPoint eCPoint, byte[] bArr, byte[] bArr2, int i3) {
        Memoable memoable;
        Memoable memoable2;
        int digestSize = this.digest.getDigestSize();
        byte[] bArr3 = new byte[Math.max(4, digestSize)];
        int i10 = (i3 + 7) / 8;
        byte[] bArr4 = new byte[i10];
        Digest digest = this.digest;
        if (digest instanceof Memoable) {
            addFieldElement(digest, eCPoint.getAffineXCoord());
            addFieldElement(this.digest, eCPoint.getAffineYCoord());
            this.digest.update(bArr, 0, bArr.length);
            this.digest.update(bArr2, 0, bArr2.length);
            memoable = (Memoable) this.digest;
            memoable2 = memoable.copy();
        } else {
            memoable = null;
            memoable2 = null;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            if (memoable != null) {
                memoable.reset(memoable2);
            } else {
                addFieldElement(this.digest, eCPoint.getAffineXCoord());
                addFieldElement(this.digest, eCPoint.getAffineYCoord());
                this.digest.update(bArr, 0, bArr.length);
                this.digest.update(bArr2, 0, bArr2.length);
            }
            i12++;
            Pack.intToBigEndian(i12, bArr3, 0);
            this.digest.update(bArr3, 0, 4);
            this.digest.doFinal(bArr3, 0);
            int min = Math.min(digestSize, i10 - i11);
            System.arraycopy(bArr3, 0, bArr4, i11, min);
            i11 += min;
        }
        return bArr4;
    }

    private BigInteger reduce(BigInteger bigInteger) {
        return bigInteger.and(BigInteger.valueOf(1L).shiftLeft(this.f18736w).subtract(BigInteger.valueOf(1L))).setBit(this.f18736w);
    }

    public byte[] calculateKey(int i3, CipherParameters cipherParameters) {
        SM2KeyExchangePublicParameters sM2KeyExchangePublicParameters;
        byte[] bArr;
        if (cipherParameters instanceof ParametersWithID) {
            ParametersWithID parametersWithID = (ParametersWithID) cipherParameters;
            sM2KeyExchangePublicParameters = (SM2KeyExchangePublicParameters) parametersWithID.getParameters();
            bArr = parametersWithID.getID();
        } else {
            sM2KeyExchangePublicParameters = (SM2KeyExchangePublicParameters) cipherParameters;
            bArr = new byte[0];
        }
        byte[] z2 = getZ(this.digest, this.userID, this.staticPubPoint);
        byte[] z10 = getZ(this.digest, bArr, sM2KeyExchangePublicParameters.getStaticPublicKey().getQ());
        ECPoint calculateU = calculateU(sM2KeyExchangePublicParameters);
        return this.initiator ? kdf(calculateU, z2, z10, i3) : kdf(calculateU, z10, z2, i3);
    }

    public byte[][] calculateKeyWithConfirmation(int i3, byte[] bArr, CipherParameters cipherParameters) {
        SM2KeyExchangePublicParameters sM2KeyExchangePublicParameters;
        byte[] bArr2;
        if (cipherParameters instanceof ParametersWithID) {
            ParametersWithID parametersWithID = (ParametersWithID) cipherParameters;
            sM2KeyExchangePublicParameters = (SM2KeyExchangePublicParameters) parametersWithID.getParameters();
            bArr2 = parametersWithID.getID();
        } else {
            sM2KeyExchangePublicParameters = (SM2KeyExchangePublicParameters) cipherParameters;
            bArr2 = new byte[0];
        }
        if (this.initiator && bArr == null) {
            throw new IllegalArgumentException(StubApp.getString2(28386));
        }
        byte[] z2 = getZ(this.digest, this.userID, this.staticPubPoint);
        byte[] z10 = getZ(this.digest, bArr2, sM2KeyExchangePublicParameters.getStaticPublicKey().getQ());
        ECPoint calculateU = calculateU(sM2KeyExchangePublicParameters);
        if (!this.initiator) {
            byte[] kdf = kdf(calculateU, z10, z2, i3);
            byte[] calculateInnerHash = calculateInnerHash(this.digest, calculateU, z10, z2, sM2KeyExchangePublicParameters.getEphemeralPublicKey().getQ(), this.ephemeralPubPoint);
            return new byte[][]{kdf, S1(this.digest, calculateU, calculateInnerHash), S2(this.digest, calculateU, calculateInnerHash)};
        }
        byte[] kdf2 = kdf(calculateU, z2, z10, i3);
        byte[] calculateInnerHash2 = calculateInnerHash(this.digest, calculateU, z2, z10, this.ephemeralPubPoint, sM2KeyExchangePublicParameters.getEphemeralPublicKey().getQ());
        if (Arrays.constantTimeAreEqual(S1(this.digest, calculateU, calculateInnerHash2), bArr)) {
            return new byte[][]{kdf2, S2(this.digest, calculateU, calculateInnerHash2)};
        }
        throw new IllegalStateException(StubApp.getString2(28387));
    }

    public void init(CipherParameters cipherParameters) {
        SM2KeyExchangePrivateParameters sM2KeyExchangePrivateParameters;
        if (cipherParameters instanceof ParametersWithID) {
            ParametersWithID parametersWithID = (ParametersWithID) cipherParameters;
            sM2KeyExchangePrivateParameters = (SM2KeyExchangePrivateParameters) parametersWithID.getParameters();
            this.userID = parametersWithID.getID();
        } else {
            sM2KeyExchangePrivateParameters = (SM2KeyExchangePrivateParameters) cipherParameters;
            this.userID = new byte[0];
        }
        this.initiator = sM2KeyExchangePrivateParameters.isInitiator();
        this.staticKey = sM2KeyExchangePrivateParameters.getStaticPrivateKey();
        this.ephemeralKey = sM2KeyExchangePrivateParameters.getEphemeralPrivateKey();
        this.ecParams = this.staticKey.getParameters();
        this.staticPubPoint = sM2KeyExchangePrivateParameters.getStaticPublicPoint();
        this.ephemeralPubPoint = sM2KeyExchangePrivateParameters.getEphemeralPublicPoint();
        this.f18736w = (this.ecParams.getCurve().getFieldSize() / 2) - 1;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(28388), this.staticKey));
    }

    public SM2KeyExchange(Digest digest) {
        this.digest = digest;
    }
}
