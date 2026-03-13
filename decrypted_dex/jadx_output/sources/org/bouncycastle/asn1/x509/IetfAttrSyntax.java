package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IetfAttrSyntax extends ASN1Object {
    public static final int VALUE_OCTETS = 1;
    public static final int VALUE_OID = 2;
    public static final int VALUE_UTF8 = 3;
    GeneralNames policyAuthority;
    int valueChoice;
    Vector values = new Vector();

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private IetfAttrSyntax(org.bouncycastle.asn1.ASN1Sequence r6) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.policyAuthority = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r5.values = r0
            r0 = -1
            r5.valueChoice = r0
            r0 = 0
            org.bouncycastle.asn1.ASN1Encodable r1 = r6.getObjectAt(r0)
            boolean r1 = r1 instanceof org.bouncycastle.asn1.ASN1TaggedObject
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L29
            org.bouncycastle.asn1.ASN1Encodable r1 = r6.getObjectAt(r0)
            org.bouncycastle.asn1.ASN1TaggedObject r1 = (org.bouncycastle.asn1.ASN1TaggedObject) r1
            org.bouncycastle.asn1.x509.GeneralNames r0 = org.bouncycastle.asn1.x509.GeneralNames.getInstance(r1, r0)
        L25:
            r5.policyAuthority = r0
            r0 = r3
            goto L38
        L29:
            int r1 = r6.size()
            if (r1 != r2) goto L38
            org.bouncycastle.asn1.ASN1Encodable r0 = r6.getObjectAt(r0)
            org.bouncycastle.asn1.x509.GeneralNames r0 = org.bouncycastle.asn1.x509.GeneralNames.getInstance(r0)
            goto L25
        L38:
            org.bouncycastle.asn1.ASN1Encodable r1 = r6.getObjectAt(r0)
            boolean r1 = r1 instanceof org.bouncycastle.asn1.ASN1Sequence
            if (r1 == 0) goto L92
            org.bouncycastle.asn1.ASN1Encodable r6 = r6.getObjectAt(r0)
            org.bouncycastle.asn1.ASN1Sequence r6 = (org.bouncycastle.asn1.ASN1Sequence) r6
            java.util.Enumeration r6 = r6.getObjects()
        L4a:
            boolean r0 = r6.hasMoreElements()
            if (r0 == 0) goto L91
            java.lang.Object r0 = r6.nextElement()
            org.bouncycastle.asn1.ASN1Primitive r0 = (org.bouncycastle.asn1.ASN1Primitive) r0
            boolean r1 = r0 instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier
            if (r1 == 0) goto L5c
            r1 = r2
            goto L67
        L5c:
            boolean r1 = r0 instanceof org.bouncycastle.asn1.ASN1UTF8String
            if (r1 == 0) goto L62
            r1 = 3
            goto L67
        L62:
            boolean r1 = r0 instanceof org.bouncycastle.asn1.DEROctetString
            if (r1 == 0) goto L84
            r1 = r3
        L67:
            int r4 = r5.valueChoice
            if (r4 >= 0) goto L6d
            r5.valueChoice = r1
        L6d:
            int r4 = r5.valueChoice
            if (r1 != r4) goto L77
            java.util.Vector r1 = r5.values
            r1.addElement(r0)
            goto L4a
        L77:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r0 = 27793(0x6c91, float:3.8946E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r6.<init>(r0)
            throw r6
        L84:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r0 = 27794(0x6c92, float:3.8948E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r6.<init>(r0)
            throw r6
        L91:
            return
        L92:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r0 = 27795(0x6c93, float:3.8949E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.x509.IetfAttrSyntax.<init>(org.bouncycastle.asn1.ASN1Sequence):void");
    }

    public static IetfAttrSyntax getInstance(Object obj) {
        if (obj instanceof IetfAttrSyntax) {
            return (IetfAttrSyntax) obj;
        }
        if (obj != null) {
            return new IetfAttrSyntax(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GeneralNames getPolicyAuthority() {
        return this.policyAuthority;
    }

    public int getValueType() {
        return this.valueChoice;
    }

    public Object[] getValues() {
        int i3 = 0;
        if (getValueType() == 1) {
            int size = this.values.size();
            ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[size];
            while (i3 != size) {
                aSN1OctetStringArr[i3] = (ASN1OctetString) this.values.elementAt(i3);
                i3++;
            }
            return aSN1OctetStringArr;
        }
        if (getValueType() == 2) {
            int size2 = this.values.size();
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size2];
            while (i3 != size2) {
                aSN1ObjectIdentifierArr[i3] = (ASN1ObjectIdentifier) this.values.elementAt(i3);
                i3++;
            }
            return aSN1ObjectIdentifierArr;
        }
        int size3 = this.values.size();
        ASN1UTF8String[] aSN1UTF8StringArr = new ASN1UTF8String[size3];
        while (i3 != size3) {
            aSN1UTF8StringArr[i3] = (ASN1UTF8String) this.values.elementAt(i3);
            i3++;
        }
        return aSN1UTF8StringArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        GeneralNames generalNames = this.policyAuthority;
        if (generalNames != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, generalNames));
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(this.values.size());
        Enumeration elements = this.values.elements();
        while (elements.hasMoreElements()) {
            aSN1EncodableVector2.add((ASN1Encodable) elements.nextElement());
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        return new DERSequence(aSN1EncodableVector);
    }
}
