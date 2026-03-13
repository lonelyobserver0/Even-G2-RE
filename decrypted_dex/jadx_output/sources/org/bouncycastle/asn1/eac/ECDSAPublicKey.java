package org.bouncycastle.asn1.eac;

import com.stub.StubApp;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECDSAPublicKey extends PublicKeyDataObject {

    /* renamed from: A, reason: collision with root package name */
    private static final int f18671A = 2;

    /* renamed from: B, reason: collision with root package name */
    private static final int f18672B = 4;

    /* renamed from: F, reason: collision with root package name */
    private static final int f18673F = 64;

    /* renamed from: G, reason: collision with root package name */
    private static final int f18674G = 8;

    /* renamed from: P, reason: collision with root package name */
    private static final int f18675P = 1;

    /* renamed from: R, reason: collision with root package name */
    private static final int f18676R = 16;

    /* renamed from: Y, reason: collision with root package name */
    private static final int f18677Y = 32;
    private byte[] basePointG;
    private BigInteger cofactorF;
    private BigInteger firstCoefA;
    private int options;
    private BigInteger orderOfBasePointR;
    private BigInteger primeModulusP;
    private byte[] publicPointY;
    private BigInteger secondCoefB;
    private ASN1ObjectIdentifier usage;

    public ECDSAPublicKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte[] bArr, BigInteger bigInteger4, byte[] bArr2, int i3) {
        this.usage = aSN1ObjectIdentifier;
        setPrimeModulusP(bigInteger);
        setFirstCoefA(bigInteger2);
        setSecondCoefB(bigInteger3);
        setBasePointG(new DEROctetString(bArr));
        setOrderOfBasePointR(bigInteger4);
        setPublicPointY(new DEROctetString(bArr2));
        setCofactorF(BigInteger.valueOf(i3));
    }

    private void setBasePointG(ASN1OctetString aSN1OctetString) throws IllegalArgumentException {
        int i3 = this.options;
        if ((i3 & 8) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(27087));
        }
        this.options = i3 | 8;
        this.basePointG = aSN1OctetString.getOctets();
    }

    private void setCofactorF(BigInteger bigInteger) throws IllegalArgumentException {
        int i3 = this.options;
        if ((i3 & 64) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(27088));
        }
        this.options = i3 | 64;
        this.cofactorF = bigInteger;
    }

    private void setFirstCoefA(BigInteger bigInteger) throws IllegalArgumentException {
        int i3 = this.options;
        if ((i3 & 2) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(27089));
        }
        this.options = i3 | 2;
        this.firstCoefA = bigInteger;
    }

    private void setOrderOfBasePointR(BigInteger bigInteger) throws IllegalArgumentException {
        int i3 = this.options;
        if ((i3 & 16) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(27090));
        }
        this.options = i3 | 16;
        this.orderOfBasePointR = bigInteger;
    }

    private void setPrimeModulusP(BigInteger bigInteger) {
        int i3 = this.options;
        if ((i3 & 1) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(27091));
        }
        this.options = i3 | 1;
        this.primeModulusP = bigInteger;
    }

    private void setPublicPointY(ASN1OctetString aSN1OctetString) throws IllegalArgumentException {
        int i3 = this.options;
        if ((i3 & 32) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(27092));
        }
        this.options = i3 | 32;
        this.publicPointY = aSN1OctetString.getOctets();
    }

    private void setSecondCoefB(BigInteger bigInteger) throws IllegalArgumentException {
        int i3 = this.options;
        if ((i3 & 4) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(27093));
        }
        this.options = i3 | 4;
        this.secondCoefB = bigInteger;
    }

    public ASN1EncodableVector getASN1EncodableVector(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(8);
        aSN1EncodableVector.add(aSN1ObjectIdentifier);
        if (!z2) {
            aSN1EncodableVector.add(new UnsignedInteger(1, getPrimeModulusP()));
            aSN1EncodableVector.add(new UnsignedInteger(2, getFirstCoefA()));
            aSN1EncodableVector.add(new UnsignedInteger(3, getSecondCoefB()));
            aSN1EncodableVector.add(new DERTaggedObject(false, 4, (ASN1Encodable) new DEROctetString(getBasePointG())));
            aSN1EncodableVector.add(new UnsignedInteger(5, getOrderOfBasePointR()));
        }
        aSN1EncodableVector.add(new DERTaggedObject(false, 6, (ASN1Encodable) new DEROctetString(getPublicPointY())));
        if (!z2) {
            aSN1EncodableVector.add(new UnsignedInteger(7, getCofactorF()));
        }
        return aSN1EncodableVector;
    }

    public byte[] getBasePointG() {
        if ((this.options & 8) != 0) {
            return Arrays.clone(this.basePointG);
        }
        return null;
    }

    public BigInteger getCofactorF() {
        if ((this.options & 64) != 0) {
            return this.cofactorF;
        }
        return null;
    }

    public BigInteger getFirstCoefA() {
        if ((this.options & 2) != 0) {
            return this.firstCoefA;
        }
        return null;
    }

    public BigInteger getOrderOfBasePointR() {
        if ((this.options & 16) != 0) {
            return this.orderOfBasePointR;
        }
        return null;
    }

    public BigInteger getPrimeModulusP() {
        if ((this.options & 1) != 0) {
            return this.primeModulusP;
        }
        return null;
    }

    public byte[] getPublicPointY() {
        if ((this.options & 32) != 0) {
            return Arrays.clone(this.publicPointY);
        }
        return null;
    }

    public BigInteger getSecondCoefB() {
        if ((this.options & 4) != 0) {
            return this.secondCoefB;
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.eac.PublicKeyDataObject
    public ASN1ObjectIdentifier getUsage() {
        return this.usage;
    }

    public boolean hasParameters() {
        return this.primeModulusP != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(getASN1EncodableVector(this.usage, !hasParameters()));
    }

    public ECDSAPublicKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) throws IllegalArgumentException {
        this.usage = aSN1ObjectIdentifier;
        setPublicPointY(new DEROctetString(bArr));
    }

    public ECDSAPublicKey(ASN1Sequence aSN1Sequence) throws IllegalArgumentException {
        Enumeration objects = aSN1Sequence.getObjects();
        this.usage = ASN1ObjectIdentifier.getInstance(objects.nextElement());
        this.options = 0;
        while (objects.hasMoreElements()) {
            Object nextElement = objects.nextElement();
            boolean z2 = nextElement instanceof ASN1TaggedObject;
            String string2 = StubApp.getString2(27085);
            if (!z2) {
                throw new IllegalArgumentException(string2);
            }
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) nextElement;
            switch (aSN1TaggedObject.getTagNo()) {
                case 1:
                    setPrimeModulusP(UnsignedInteger.getInstance(aSN1TaggedObject).getValue());
                    break;
                case 2:
                    setFirstCoefA(UnsignedInteger.getInstance(aSN1TaggedObject).getValue());
                    break;
                case 3:
                    setSecondCoefB(UnsignedInteger.getInstance(aSN1TaggedObject).getValue());
                    break;
                case 4:
                    setBasePointG(ASN1OctetString.getInstance(aSN1TaggedObject, false));
                    break;
                case 5:
                    setOrderOfBasePointR(UnsignedInteger.getInstance(aSN1TaggedObject).getValue());
                    break;
                case 6:
                    setPublicPointY(ASN1OctetString.getInstance(aSN1TaggedObject, false));
                    break;
                case 7:
                    setCofactorF(UnsignedInteger.getInstance(aSN1TaggedObject).getValue());
                    break;
                default:
                    this.options = 0;
                    throw new IllegalArgumentException(string2);
            }
        }
        int i3 = this.options;
        if (i3 != 32 && i3 != 127) {
            throw new IllegalArgumentException(StubApp.getString2(27086));
        }
    }
}
