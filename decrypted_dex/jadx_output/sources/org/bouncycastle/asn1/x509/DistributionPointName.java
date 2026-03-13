package org.bouncycastle.asn1.x509;

import E1.a;
import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DistributionPointName extends ASN1Object implements ASN1Choice {
    public static final int FULL_NAME = 0;
    public static final int NAME_RELATIVE_TO_CRL_ISSUER = 1;
    ASN1Encodable name;
    int type;

    public DistributionPointName(int i3, ASN1Encodable aSN1Encodable) {
        this.type = i3;
        this.name = aSN1Encodable;
    }

    private void appendObject(StringBuffer stringBuffer, String str, String str2, String str3) {
        String string2 = StubApp.getString2(6147);
        stringBuffer.append(string2);
        stringBuffer.append(str2);
        stringBuffer.append(StubApp.getString2(478));
        stringBuffer.append(str);
        stringBuffer.append(string2);
        stringBuffer.append(string2);
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public static DistributionPointName getInstance(Object obj) {
        if (obj == null || (obj instanceof DistributionPointName)) {
            return (DistributionPointName) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            return new DistributionPointName((ASN1TaggedObject) obj);
        }
        throw new IllegalArgumentException(a.h(obj, StubApp.getString2(26925)));
    }

    public ASN1Encodable getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(false, this.type, this.name);
    }

    public String toString() {
        String obj;
        String string2;
        String lineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(StubApp.getString2(27744));
        stringBuffer.append(lineSeparator);
        if (this.type == 0) {
            obj = this.name.toString();
            string2 = StubApp.getString2(27745);
        } else {
            obj = this.name.toString();
            string2 = StubApp.getString2(27746);
        }
        appendObject(stringBuffer, lineSeparator, string2, obj);
        stringBuffer.append(StubApp.getString2(511));
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }

    public DistributionPointName(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.type = tagNo;
        this.name = tagNo == 0 ? GeneralNames.getInstance(aSN1TaggedObject, false) : ASN1Set.getInstance(aSN1TaggedObject, false);
    }

    public DistributionPointName(GeneralNames generalNames) {
        this(0, generalNames);
    }

    public static DistributionPointName getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1TaggedObject.getInstance(aSN1TaggedObject, true));
    }
}
