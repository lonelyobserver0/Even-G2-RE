package org.bouncycastle.pqc.legacy.math.linearalgebra;

import com.stub.StubApp;
import java.security.SecureRandom;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class GF2nField {
    protected GF2Polynomial fieldPolynomial;
    protected java.util.Vector fields;
    protected int mDegree;
    protected java.util.Vector matrices;
    protected final SecureRandom random;

    public GF2nField(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public abstract void computeCOBMatrix(GF2nField gF2nField);

    public abstract void computeFieldPolynomial();

    public final GF2nElement convert(GF2nElement gF2nElement, GF2nField gF2nField) throws RuntimeException {
        if (gF2nField == this || this.fieldPolynomial.equals(gF2nField.fieldPolynomial)) {
            return (GF2nElement) gF2nElement.clone();
        }
        if (this.mDegree != gF2nField.mDegree) {
            throw new RuntimeException(StubApp.getString2(34854));
        }
        int indexOf = this.fields.indexOf(gF2nField);
        if (indexOf == -1) {
            computeCOBMatrix(gF2nField);
            indexOf = this.fields.indexOf(gF2nField);
        }
        GF2Polynomial[] gF2PolynomialArr = (GF2Polynomial[]) this.matrices.elementAt(indexOf);
        GF2nElement gF2nElement2 = (GF2nElement) gF2nElement.clone();
        if (gF2nElement2 instanceof GF2nONBElement) {
            ((GF2nONBElement) gF2nElement2).reverseOrder();
        }
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree, gF2nElement2.toFlexiBigInt());
        gF2Polynomial.expandN(this.mDegree);
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree);
        for (int i3 = 0; i3 < this.mDegree; i3++) {
            if (gF2Polynomial.vectorMult(gF2PolynomialArr[i3])) {
                gF2Polynomial2.setBit((this.mDegree - 1) - i3);
            }
        }
        if (gF2nField instanceof GF2nPolynomialField) {
            return new GF2nPolynomialElement((GF2nPolynomialField) gF2nField, gF2Polynomial2);
        }
        if (!(gF2nField instanceof GF2nONBField)) {
            throw new RuntimeException(StubApp.getString2(34853));
        }
        GF2nONBElement gF2nONBElement = new GF2nONBElement((GF2nONBField) gF2nField, gF2Polynomial2.toFlexiBigInt());
        gF2nONBElement.reverseOrder();
        return gF2nONBElement;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nField)) {
            return false;
        }
        GF2nField gF2nField = (GF2nField) obj;
        if (gF2nField.mDegree != this.mDegree || !this.fieldPolynomial.equals(gF2nField.fieldPolynomial)) {
            return false;
        }
        if (!(this instanceof GF2nPolynomialField) || (gF2nField instanceof GF2nPolynomialField)) {
            return !(this instanceof GF2nONBField) || (gF2nField instanceof GF2nONBField);
        }
        return false;
    }

    public final int getDegree() {
        return this.mDegree;
    }

    public final GF2Polynomial getFieldPolynomial() {
        if (this.fieldPolynomial == null) {
            computeFieldPolynomial();
        }
        return new GF2Polynomial(this.fieldPolynomial);
    }

    public abstract GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial);

    public int hashCode() {
        return this.fieldPolynomial.hashCode() + this.mDegree;
    }

    public final GF2Polynomial[] invertMatrix(GF2Polynomial[] gF2PolynomialArr) {
        GF2Polynomial[] gF2PolynomialArr2 = new GF2Polynomial[gF2PolynomialArr.length];
        GF2Polynomial[] gF2PolynomialArr3 = new GF2Polynomial[gF2PolynomialArr.length];
        int i3 = 0;
        for (int i10 = 0; i10 < this.mDegree; i10++) {
            gF2PolynomialArr2[i10] = new GF2Polynomial(gF2PolynomialArr[i10]);
            GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree);
            gF2PolynomialArr3[i10] = gF2Polynomial;
            gF2Polynomial.setBit((this.mDegree - 1) - i10);
        }
        while (true) {
            int i11 = this.mDegree;
            if (i3 >= i11 - 1) {
                for (int i12 = i11 - 1; i12 > 0; i12--) {
                    for (int i13 = i12 - 1; i13 >= 0; i13--) {
                        if (gF2PolynomialArr2[i13].testBit((this.mDegree - 1) - i12)) {
                            gF2PolynomialArr2[i13].addToThis(gF2PolynomialArr2[i12]);
                            gF2PolynomialArr3[i13].addToThis(gF2PolynomialArr3[i12]);
                        }
                    }
                }
                return gF2PolynomialArr3;
            }
            int i14 = i3;
            while (true) {
                int i15 = this.mDegree;
                if (i14 >= i15 || gF2PolynomialArr2[i14].testBit((i15 - 1) - i3)) {
                    break;
                }
                i14++;
            }
            if (i14 >= this.mDegree) {
                throw new RuntimeException(StubApp.getString2(34855));
            }
            if (i3 != i14) {
                GF2Polynomial gF2Polynomial2 = gF2PolynomialArr2[i3];
                gF2PolynomialArr2[i3] = gF2PolynomialArr2[i14];
                gF2PolynomialArr2[i14] = gF2Polynomial2;
                GF2Polynomial gF2Polynomial3 = gF2PolynomialArr3[i3];
                gF2PolynomialArr3[i3] = gF2PolynomialArr3[i14];
                gF2PolynomialArr3[i14] = gF2Polynomial3;
            }
            int i16 = i3 + 1;
            int i17 = i16;
            while (true) {
                int i18 = this.mDegree;
                if (i17 < i18) {
                    if (gF2PolynomialArr2[i17].testBit((i18 - 1) - i3)) {
                        gF2PolynomialArr2[i17].addToThis(gF2PolynomialArr2[i3]);
                        gF2PolynomialArr3[i17].addToThis(gF2PolynomialArr3[i3]);
                    }
                    i17++;
                }
            }
            i3 = i16;
        }
    }
}
