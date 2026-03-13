package org.bouncycastle.asn1.x500;

import com.stub.StubApp;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.style.BCStyle;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X500Name extends ASN1Object implements ASN1Choice {
    private static X500NameStyle defaultStyle = BCStyle.INSTANCE;
    private int hashCodeValue;
    private boolean isHashCodeCalculated;
    private DERSequence rdnSeq;
    private RDN[] rdns;
    private X500NameStyle style;

    public X500Name(String str) {
        this(defaultStyle, str);
    }

    public static X500NameStyle getDefaultStyle() {
        return defaultStyle;
    }

    public static X500Name getInstance(Object obj) {
        if (obj instanceof X500Name) {
            return (X500Name) obj;
        }
        if (obj != null) {
            return new X500Name(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static void setDefaultStyle(X500NameStyle x500NameStyle) {
        if (x500NameStyle == null) {
            throw new NullPointerException(StubApp.getString2(27553));
        }
        defaultStyle = x500NameStyle;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X500Name) && !(obj instanceof ASN1Sequence)) {
            return false;
        }
        if (toASN1Primitive().equals(((ASN1Encodable) obj).toASN1Primitive())) {
            return true;
        }
        try {
            return this.style.areEqual(this, new X500Name(ASN1Sequence.getInstance(((ASN1Encodable) obj).toASN1Primitive())));
        } catch (Exception unused) {
            return false;
        }
    }

    public ASN1ObjectIdentifier[] getAttributeTypes() {
        int length = this.rdns.length;
        int i3 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            i3 += this.rdns[i10].size();
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[i3];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i11 += this.rdns[i12].collectAttributeTypes(aSN1ObjectIdentifierArr, i11);
        }
        return aSN1ObjectIdentifierArr;
    }

    public RDN[] getRDNs() {
        return (RDN[]) this.rdns.clone();
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        if (this.isHashCodeCalculated) {
            return this.hashCodeValue;
        }
        this.isHashCodeCalculated = true;
        int calculateHashCode = this.style.calculateHashCode(this);
        this.hashCodeValue = calculateHashCode;
        return calculateHashCode;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.rdnSeq;
    }

    public String toString() {
        return this.style.toString(this);
    }

    private X500Name(ASN1Sequence aSN1Sequence) {
        this(defaultStyle, aSN1Sequence);
    }

    public static X500Name getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, true));
    }

    public RDN[] getRDNs(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int length = this.rdns.length;
        RDN[] rdnArr = new RDN[length];
        int i3 = 0;
        int i10 = 0;
        while (true) {
            RDN[] rdnArr2 = this.rdns;
            if (i3 == rdnArr2.length) {
                break;
            }
            RDN rdn = rdnArr2[i3];
            if (rdn.containsAttributeType(aSN1ObjectIdentifier)) {
                rdnArr[i10] = rdn;
                i10++;
            }
            i3++;
        }
        if (i10 >= length) {
            return rdnArr;
        }
        RDN[] rdnArr3 = new RDN[i10];
        System.arraycopy(rdnArr, 0, rdnArr3, 0, i10);
        return rdnArr3;
    }

    public X500Name(X500NameStyle x500NameStyle, String str) {
        this(x500NameStyle.fromString(str));
        this.style = x500NameStyle;
    }

    public static X500Name getInstance(X500NameStyle x500NameStyle, Object obj) {
        if (obj instanceof X500Name) {
            return new X500Name(x500NameStyle, (X500Name) obj);
        }
        if (obj != null) {
            return new X500Name(x500NameStyle, ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private X500Name(X500NameStyle x500NameStyle, ASN1Sequence aSN1Sequence) {
        this.style = x500NameStyle;
        this.rdns = new RDN[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        boolean z2 = true;
        int i3 = 0;
        while (objects.hasMoreElements()) {
            Object nextElement = objects.nextElement();
            RDN rdn = RDN.getInstance(nextElement);
            z2 &= rdn == nextElement;
            this.rdns[i3] = rdn;
            i3++;
        }
        this.rdnSeq = z2 ? DERSequence.convert(aSN1Sequence) : new DERSequence(this.rdns);
    }

    public X500Name(X500NameStyle x500NameStyle, X500Name x500Name) {
        this.style = x500NameStyle;
        this.rdns = x500Name.rdns;
        this.rdnSeq = x500Name.rdnSeq;
    }

    public X500Name(X500NameStyle x500NameStyle, RDN[] rdnArr) {
        this.style = x500NameStyle;
        this.rdns = (RDN[]) rdnArr.clone();
        this.rdnSeq = new DERSequence(this.rdns);
    }

    public X500Name(RDN[] rdnArr) {
        this(defaultStyle, rdnArr);
    }
}
