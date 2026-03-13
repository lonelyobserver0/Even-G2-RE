package org.bouncycastle.crypto.prng.drbg;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DualECSP800DRBG implements SP80090DRBG {
    private static final int MAX_ADDITIONAL_INPUT = 4096;
    private static final int MAX_ENTROPY_LENGTH = 4096;
    private static final int MAX_PERSONALIZATION_STRING = 4096;
    private static final long RESEED_MAX = 2147483648L;
    private static final DualECPoints[] nistPoints;
    private static final BigInteger p256_Px;
    private static final BigInteger p256_Py;
    private static final BigInteger p256_Qx;
    private static final BigInteger p256_Qy;
    private static final BigInteger p384_Px;
    private static final BigInteger p384_Py;
    private static final BigInteger p384_Qx;
    private static final BigInteger p384_Qy;
    private static final BigInteger p521_Px;
    private static final BigInteger p521_Py;
    private static final BigInteger p521_Qx;
    private static final BigInteger p521_Qy;
    private ECPoint _P;
    private ECPoint _Q;
    private ECCurve.Fp _curve;
    private Digest _digest;
    private EntropySource _entropySource;
    private ECMultiplier _fixedPointMultiplier;
    private int _outlen;
    private long _reseedCounter;
    private byte[] _s;
    private int _sLength;
    private int _securityStrength;
    private int _seedlen;

    static {
        BigInteger bigInteger = new BigInteger(StubApp.getString2(29266), 16);
        p256_Px = bigInteger;
        BigInteger bigInteger2 = new BigInteger(StubApp.getString2(29267), 16);
        p256_Py = bigInteger2;
        BigInteger bigInteger3 = new BigInteger(StubApp.getString2(29268), 16);
        p256_Qx = bigInteger3;
        BigInteger bigInteger4 = new BigInteger(StubApp.getString2(29269), 16);
        p256_Qy = bigInteger4;
        BigInteger bigInteger5 = new BigInteger(StubApp.getString2(29270), 16);
        p384_Px = bigInteger5;
        BigInteger bigInteger6 = new BigInteger(StubApp.getString2(29271), 16);
        p384_Py = bigInteger6;
        BigInteger bigInteger7 = new BigInteger(StubApp.getString2(29272), 16);
        p384_Qx = bigInteger7;
        BigInteger bigInteger8 = new BigInteger(StubApp.getString2(29273), 16);
        p384_Qy = bigInteger8;
        BigInteger bigInteger9 = new BigInteger(StubApp.getString2(29274), 16);
        p521_Px = bigInteger9;
        BigInteger bigInteger10 = new BigInteger(StubApp.getString2(29275), 16);
        p521_Py = bigInteger10;
        BigInteger bigInteger11 = new BigInteger(StubApp.getString2(29276), 16);
        p521_Qx = bigInteger11;
        BigInteger bigInteger12 = new BigInteger(StubApp.getString2(29277), 16);
        p521_Qy = bigInteger12;
        nistPoints = new DualECPoints[]{new DualECPoints(128, r13.createPoint(bigInteger, bigInteger2), r13.createPoint(bigInteger3, bigInteger4), 1), new DualECPoints(192, r0.createPoint(bigInteger5, bigInteger6), r0.createPoint(bigInteger7, bigInteger8), 1), new DualECPoints(256, r0.createPoint(bigInteger9, bigInteger10), r0.createPoint(bigInteger11, bigInteger12), 1)};
        ECCurve.Fp fp = (ECCurve.Fp) NISTNamedCurves.getByNameLazy(StubApp.getString2(27161)).getCurve();
        ECCurve.Fp fp2 = (ECCurve.Fp) NISTNamedCurves.getByNameLazy(StubApp.getString2(27160)).getCurve();
        ECCurve.Fp fp3 = (ECCurve.Fp) NISTNamedCurves.getByNameLazy(StubApp.getString2(27159)).getCurve();
    }

    public DualECSP800DRBG(Digest digest, int i3, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this(nistPoints, digest, i3, entropySource, bArr, bArr2);
    }

    private byte[] getEntropy() {
        byte[] entropy = this._entropySource.getEntropy();
        if (entropy.length >= (this._securityStrength + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException(StubApp.getString2(29263));
    }

    private BigInteger getScalarMultipleXCoord(ECPoint eCPoint, BigInteger bigInteger) {
        return this._fixedPointMultiplier.multiply(eCPoint, bigInteger).normalize().getAffineXCoord().toBigInteger();
    }

    private byte[] pad8(byte[] bArr, int i3) {
        int i10 = i3 % 8;
        if (i10 == 0) {
            return bArr;
        }
        int i11 = 8 - i10;
        int length = bArr.length - 1;
        int i12 = 0;
        while (length >= 0) {
            int i13 = bArr[length] & 255;
            bArr[length] = (byte) ((i12 >> (8 - i11)) | (i13 << i11));
            length--;
            i12 = i13;
        }
        return bArr;
    }

    private byte[] xor(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            return bArr;
        }
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i3 = 0; i3 != length; i3++) {
            bArr3[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
        }
        return bArr3;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z2) {
        int length = bArr.length * 8;
        int length2 = bArr.length / this._outlen;
        if (Utils.isTooLarge(bArr2, 512)) {
            throw new IllegalArgumentException(StubApp.getString2(29283));
        }
        if (this._reseedCounter + length2 > RESEED_MAX) {
            return -1;
        }
        if (z2) {
            reseed(bArr2);
            bArr2 = null;
        }
        BigInteger bigInteger = bArr2 != null ? new BigInteger(1, xor(this._s, Utils.hash_df(this._digest, bArr2, this._seedlen))) : new BigInteger(1, this._s);
        Arrays.fill(bArr, (byte) 0);
        int i3 = 0;
        for (int i10 = 0; i10 < length2; i10++) {
            bigInteger = getScalarMultipleXCoord(this._P, bigInteger);
            byte[] byteArray = getScalarMultipleXCoord(this._Q, bigInteger).toByteArray();
            int length3 = byteArray.length;
            int i11 = this._outlen;
            if (length3 > i11) {
                System.arraycopy(byteArray, byteArray.length - i11, bArr, i3, i11);
            } else {
                System.arraycopy(byteArray, 0, bArr, (i11 - byteArray.length) + i3, byteArray.length);
            }
            i3 += this._outlen;
            this._reseedCounter++;
        }
        if (i3 < bArr.length) {
            bigInteger = getScalarMultipleXCoord(this._P, bigInteger);
            byte[] byteArray2 = getScalarMultipleXCoord(this._Q, bigInteger).toByteArray();
            int length4 = bArr.length - i3;
            int length5 = byteArray2.length;
            int i12 = this._outlen;
            if (length5 > i12) {
                System.arraycopy(byteArray2, byteArray2.length - i12, bArr, i3, length4);
            } else {
                System.arraycopy(byteArray2, 0, bArr, (i12 - byteArray2.length) + i3, length4);
            }
            this._reseedCounter++;
        }
        this._s = BigIntegers.asUnsignedByteArray(this._sLength, getScalarMultipleXCoord(this._P, bigInteger));
        return length;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this._outlen * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        if (Utils.isTooLarge(bArr, 512)) {
            throw new IllegalArgumentException(StubApp.getString2(29284));
        }
        this._s = Utils.hash_df(this._digest, Arrays.concatenate(pad8(this._s, this._seedlen), getEntropy(), bArr), this._seedlen);
        this._reseedCounter = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if (r1._P == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        r2 = org.bouncycastle.crypto.prng.drbg.Utils.hash_df(r1._digest, r5, r1._seedlen);
        r1._s = r2;
        r1._sLength = r2.length;
        r1._reseedCounter = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        throw new java.lang.IllegalArgumentException(com.stub.StubApp.getString2(29279));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DualECSP800DRBG(org.bouncycastle.crypto.prng.drbg.DualECPoints[] r2, org.bouncycastle.crypto.Digest r3, int r4, org.bouncycastle.crypto.prng.EntropySource r5, byte[] r6, byte[] r7) {
        /*
            r1 = this;
            r1.<init>()
            org.bouncycastle.math.ec.FixedPointCombMultiplier r0 = new org.bouncycastle.math.ec.FixedPointCombMultiplier
            r0.<init>()
            r1._fixedPointMultiplier = r0
            r1._digest = r3
            r1._entropySource = r5
            r1._securityStrength = r4
            r0 = 512(0x200, float:7.17E-43)
            boolean r0 = org.bouncycastle.crypto.prng.drbg.Utils.isTooLarge(r6, r0)
            if (r0 != 0) goto Lb4
            int r0 = r5.entropySize()
            if (r0 < r4) goto L9c
            int r5 = r5.entropySize()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r5 > r0) goto L9c
            byte[] r5 = r1.getEntropy()
            byte[] r5 = org.bouncycastle.util.Arrays.concatenate(r5, r7, r6)
            r6 = 0
        L2f:
            int r7 = r2.length
            if (r6 == r7) goto L79
            r7 = r2[r6]
            int r7 = r7.getSecurityStrength()
            if (r4 > r7) goto L76
            int r3 = org.bouncycastle.crypto.prng.drbg.Utils.getMaxSecurityStrength(r3)
            r4 = r2[r6]
            int r4 = r4.getSecurityStrength()
            if (r3 < r4) goto L69
            r3 = r2[r6]
            int r3 = r3.getSeedLen()
            r1._seedlen = r3
            r3 = r2[r6]
            int r3 = r3.getMaxOutlen()
            int r3 = r3 / 8
            r1._outlen = r3
            r3 = r2[r6]
            org.bouncycastle.math.ec.ECPoint r3 = r3.getP()
            r1._P = r3
            r2 = r2[r6]
            org.bouncycastle.math.ec.ECPoint r2 = r2.getQ()
            r1._Q = r2
            goto L79
        L69:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r3 = 29278(0x725e, float:4.1027E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r2.<init>(r3)
            throw r2
        L76:
            int r6 = r6 + 1
            goto L2f
        L79:
            org.bouncycastle.math.ec.ECPoint r2 = r1._P
            if (r2 == 0) goto L8f
            org.bouncycastle.crypto.Digest r2 = r1._digest
            int r3 = r1._seedlen
            byte[] r2 = org.bouncycastle.crypto.prng.drbg.Utils.hash_df(r2, r5, r3)
            r1._s = r2
            int r2 = r2.length
            r1._sLength = r2
            r2 = 0
            r1._reseedCounter = r2
            return
        L8f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r3 = 29279(0x725f, float:4.1029E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r2.<init>(r3)
            throw r2
        L9c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r3 = 29280(0x7260, float:4.103E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r5 = 29281(0x7261, float:4.1031E-41)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            java.lang.String r3 = Xa.h.g(r4, r3, r5)
            r2.<init>(r3)
            throw r2
        Lb4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r3 = 29282(0x7262, float:4.1033E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.prng.drbg.DualECSP800DRBG.<init>(org.bouncycastle.crypto.prng.drbg.DualECPoints[], org.bouncycastle.crypto.Digest, int, org.bouncycastle.crypto.prng.EntropySource, byte[], byte[]):void");
    }
}
