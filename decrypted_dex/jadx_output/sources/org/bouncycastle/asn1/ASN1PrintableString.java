package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ASN1PrintableString extends ASN1Primitive implements ASN1String {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1PrintableString.class, 19) { // from class: org.bouncycastle.asn1.ASN1PrintableString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1PrintableString.createPrimitive(dEROctetString.getOctets());
        }
    };
    final byte[] contents;

    public ASN1PrintableString(String str, boolean z2) {
        if (z2 && !isPrintableString(str)) {
            throw new IllegalArgumentException(StubApp.getString2(26782));
        }
        this.contents = Strings.toByteArray(str);
    }

    public static ASN1PrintableString createPrimitive(byte[] bArr) {
        return new DERPrintableString(bArr, false);
    }

    public static ASN1PrintableString getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1PrintableString)) {
            return (ASN1PrintableString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1PrintableString) {
                return (ASN1PrintableString) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
        }
        try {
            return (ASN1PrintableString) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.b(e10, new StringBuilder(StubApp.getString2(26707))));
        }
    }

    public static boolean isPrintableString(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            char charAt = str.charAt(length);
            if (charAt > 127) {
                return false;
            }
            if (('a' > charAt || charAt > 'z') && (('A' > charAt || charAt > 'Z') && (('0' > charAt || charAt > '9') && charAt != ' ' && charAt != ':' && charAt != '=' && charAt != '?'))) {
                switch (charAt) {
                    case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    case '(':
                    case EACTags.INTERCHANGE_PROFILE /* 41 */:
                        continue;
                    default:
                        switch (charAt) {
                            case EACTags.DATE_OF_BIRTH /* 43 */:
                            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                            case '.':
                            case EACTags.PIN_USAGE_POLICY /* 47 */:
                                break;
                            default:
                                return false;
                        }
                }
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1PrintableString) {
            return Arrays.areEqual(this.contents, ((ASN1PrintableString) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        aSN1OutputStream.writeEncodingDL(z2, 19, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int encodedLength(boolean z2) {
        return ASN1OutputStream.getLengthOfEncodingDL(z2, this.contents.length);
    }

    public final byte[] getOctets() {
        return Arrays.clone(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String getString() {
        return Strings.fromByteArray(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public String toString() {
        return getString();
    }

    public ASN1PrintableString(byte[] bArr, boolean z2) {
        this.contents = z2 ? Arrays.clone(bArr) : bArr;
    }

    public static ASN1PrintableString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return (ASN1PrintableString) TYPE.getContextInstance(aSN1TaggedObject, z2);
    }
}
