package org.bouncycastle.asn1.cmp;

import com.stub.StubApp;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIFreeText extends ASN1Object {
    ASN1Sequence strings;

    public PKIFreeText(String str) {
        this(new DERUTF8String(str));
    }

    public static PKIFreeText getInstance(Object obj) {
        if (obj instanceof PKIFreeText) {
            return (PKIFreeText) obj;
        }
        if (obj != null) {
            return new PKIFreeText(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public DERUTF8String getStringAt(int i3) {
        ASN1UTF8String stringAtUTF8 = getStringAtUTF8(i3);
        return (stringAtUTF8 == null || (stringAtUTF8 instanceof DERUTF8String)) ? (DERUTF8String) stringAtUTF8 : new DERUTF8String(stringAtUTF8.getString());
    }

    public ASN1UTF8String getStringAtUTF8(int i3) {
        return (ASN1UTF8String) this.strings.getObjectAt(i3);
    }

    public int size() {
        return this.strings.size();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.strings;
    }

    private PKIFreeText(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            if (!(objects.nextElement() instanceof ASN1UTF8String)) {
                throw new IllegalArgumentException(StubApp.getString2(26899));
            }
        }
        this.strings = aSN1Sequence;
    }

    public static PKIFreeText getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }

    public PKIFreeText(ASN1UTF8String aSN1UTF8String) {
        this.strings = new DERSequence(aSN1UTF8String);
    }

    public PKIFreeText(String[] strArr) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(strArr.length);
        for (String str : strArr) {
            aSN1EncodableVector.add(new DERUTF8String(str));
        }
        this.strings = new DERSequence(aSN1EncodableVector);
    }

    public PKIFreeText(ASN1UTF8String[] aSN1UTF8StringArr) {
        this.strings = new DERSequence(aSN1UTF8StringArr);
    }
}
