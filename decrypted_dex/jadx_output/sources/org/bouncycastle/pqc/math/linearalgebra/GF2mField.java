package org.bouncycastle.pqc.math.linearalgebra;

import E1.a;
import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GF2mField {
    private int degree;
    private int polynomial;

    public GF2mField(int i3) {
        this.degree = 0;
        if (i3 >= 32) {
            throw new IllegalArgumentException(StubApp.getString2(34838));
        }
        if (i3 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(34837));
        }
        this.degree = i3;
        this.polynomial = PolynomialRingGF2.getIrreduciblePolynomial(i3);
    }

    private static String polyToString(int i3) {
        if (i3 == 0) {
            return StubApp.getString2(824);
        }
        String string2 = ((byte) (i3 & 1)) == 1 ? StubApp.getString2(878) : "";
        int i10 = i3 >>> 1;
        int i11 = 1;
        while (i10 != 0) {
            if (((byte) (i10 & 1)) == 1) {
                string2 = string2 + StubApp.getString2(34842) + i11;
            }
            i10 >>>= 1;
            i11++;
        }
        return string2;
    }

    public int add(int i3, int i10) {
        return i3 ^ i10;
    }

    public String elementToStr(int i3) {
        String str = "";
        for (int i10 = 0; i10 < this.degree; i10++) {
            str = a.j((((byte) i3) & 1) == 0 ? StubApp.getString2(824) : StubApp.getString2(878), str);
            i3 >>>= 1;
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof GF2mField)) {
            GF2mField gF2mField = (GF2mField) obj;
            if (this.degree == gF2mField.degree && this.polynomial == gF2mField.polynomial) {
                return true;
            }
        }
        return false;
    }

    public int exp(int i3, int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i3 == 0) {
            return 0;
        }
        if (i3 == 1) {
            return 1;
        }
        if (i10 < 0) {
            i3 = inverse(i3);
            i10 = -i10;
        }
        int i11 = 1;
        while (i10 != 0) {
            if ((i10 & 1) == 1) {
                i11 = mult(i11, i3);
            }
            i3 = mult(i3, i3);
            i10 >>>= 1;
        }
        return i11;
    }

    public int getDegree() {
        return this.degree;
    }

    public byte[] getEncoded() {
        return LittleEndianConversions.I2OSP(this.polynomial);
    }

    public int getPolynomial() {
        return this.polynomial;
    }

    public int getRandomElement(SecureRandom secureRandom) {
        return RandUtils.nextInt(secureRandom, 1 << this.degree);
    }

    public int getRandomNonZeroElement() {
        return getRandomNonZeroElement(CryptoServicesRegistrar.getSecureRandom());
    }

    public int hashCode() {
        return this.polynomial;
    }

    public int inverse(int i3) {
        return exp(i3, (1 << this.degree) - 2);
    }

    public boolean isElementOfThisField(int i3) {
        int i10 = this.degree;
        return i10 == 31 ? i3 >= 0 : i3 >= 0 && i3 < (1 << i10);
    }

    public int mult(int i3, int i10) {
        return PolynomialRingGF2.modMultiply(i3, i10, this.polynomial);
    }

    public int sqRoot(int i3) {
        for (int i10 = 1; i10 < this.degree; i10++) {
            i3 = mult(i3, i3);
        }
        return i3;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(34843));
        sb2.append(this.degree);
        sb2.append(StubApp.getString2(34844));
        return AbstractC1482f.k(sb2, polyToString(this.polynomial), StubApp.getString2(34845));
    }

    public GF2mField(int i3, int i10) {
        this.degree = 0;
        if (i3 != PolynomialRingGF2.degree(i10)) {
            throw new IllegalArgumentException(StubApp.getString2(34840));
        }
        if (!PolynomialRingGF2.isIrreducible(i10)) {
            throw new IllegalArgumentException(StubApp.getString2(34839));
        }
        this.degree = i3;
        this.polynomial = i10;
    }

    public int getRandomNonZeroElement(SecureRandom secureRandom) {
        int nextInt = RandUtils.nextInt(secureRandom, 1 << this.degree);
        int i3 = 0;
        while (nextInt == 0 && i3 < 1048576) {
            nextInt = RandUtils.nextInt(secureRandom, 1 << this.degree);
            i3++;
        }
        if (i3 == 1048576) {
            return 1;
        }
        return nextInt;
    }

    public GF2mField(GF2mField gF2mField) {
        this.degree = 0;
        this.degree = gF2mField.degree;
        this.polynomial = gF2mField.polynomial;
    }

    public GF2mField(byte[] bArr) {
        this.degree = 0;
        int length = bArr.length;
        String string2 = StubApp.getString2(34841);
        if (length != 4) {
            throw new IllegalArgumentException(string2);
        }
        int OS2IP = LittleEndianConversions.OS2IP(bArr);
        this.polynomial = OS2IP;
        if (!PolynomialRingGF2.isIrreducible(OS2IP)) {
            throw new IllegalArgumentException(string2);
        }
        this.degree = PolynomialRingGF2.degree(this.polynomial);
    }
}
