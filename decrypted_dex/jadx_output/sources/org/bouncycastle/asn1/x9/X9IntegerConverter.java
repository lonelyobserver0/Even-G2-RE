package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X9IntegerConverter {
    public int getByteLength(ECCurve eCCurve) {
        return (eCCurve.getFieldSize() + 7) / 8;
    }

    public byte[] integerToBytes(BigInteger bigInteger, int i3) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i3 < byteArray.length) {
            byte[] bArr = new byte[i3];
            System.arraycopy(byteArray, byteArray.length - i3, bArr, 0, i3);
            return bArr;
        }
        if (i3 <= byteArray.length) {
            return byteArray;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(byteArray, 0, bArr2, i3 - byteArray.length, byteArray.length);
        return bArr2;
    }

    public int getByteLength(ECFieldElement eCFieldElement) {
        return (eCFieldElement.getFieldSize() + 7) / 8;
    }
}
