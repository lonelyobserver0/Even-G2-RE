package org.bouncycastle.crypto.signers;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PlainDSAEncoding implements DSAEncoding {
    public static final PlainDSAEncoding INSTANCE = new PlainDSAEncoding();

    private void encodeValue(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i3, int i10) {
        byte[] byteArray = checkValue(bigInteger, bigInteger2).toByteArray();
        int max = Math.max(0, byteArray.length - i10);
        int length = byteArray.length - max;
        int i11 = (i10 - length) + i3;
        Arrays.fill(bArr, i3, i11, (byte) 0);
        System.arraycopy(byteArray, max, bArr, i11, length);
    }

    public BigInteger checkValue(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException(StubApp.getString2(29324));
        }
        return bigInteger2;
    }

    @Override // org.bouncycastle.crypto.signers.DSAEncoding
    public BigInteger[] decode(BigInteger bigInteger, byte[] bArr) {
        int unsignedByteLength = BigIntegers.getUnsignedByteLength(bigInteger);
        if (bArr.length == unsignedByteLength * 2) {
            return new BigInteger[]{decodeValue(bigInteger, bArr, 0, unsignedByteLength), decodeValue(bigInteger, bArr, unsignedByteLength, unsignedByteLength)};
        }
        throw new IllegalArgumentException(StubApp.getString2(29325));
    }

    public BigInteger decodeValue(BigInteger bigInteger, byte[] bArr, int i3, int i10) {
        return checkValue(bigInteger, new BigInteger(1, Arrays.copyOfRange(bArr, i3, i10 + i3)));
    }

    @Override // org.bouncycastle.crypto.signers.DSAEncoding
    public byte[] encode(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int unsignedByteLength = BigIntegers.getUnsignedByteLength(bigInteger);
        byte[] bArr = new byte[unsignedByteLength * 2];
        encodeValue(bigInteger, bigInteger2, bArr, 0, unsignedByteLength);
        encodeValue(bigInteger, bigInteger3, bArr, unsignedByteLength, unsignedByteLength);
        return bArr;
    }
}
