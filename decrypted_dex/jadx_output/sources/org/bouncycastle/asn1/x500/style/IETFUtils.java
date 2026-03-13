package org.bouncycastle.asn1.x500.style;

import E1.a;
import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1UniversalString;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500NameBuilder;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IETFUtils {
    public static void appendRDN(StringBuffer stringBuffer, RDN rdn, Hashtable hashtable) {
        if (!rdn.isMultiValued()) {
            if (rdn.getFirst() != null) {
                appendTypeAndValue(stringBuffer, rdn.getFirst(), hashtable);
                return;
            }
            return;
        }
        AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
        boolean z2 = true;
        for (int i3 = 0; i3 != typesAndValues.length; i3++) {
            if (z2) {
                z2 = false;
            } else {
                stringBuffer.append('+');
            }
            appendTypeAndValue(stringBuffer, typesAndValues[i3], hashtable);
        }
    }

    public static void appendTypeAndValue(StringBuffer stringBuffer, AttributeTypeAndValue attributeTypeAndValue, Hashtable hashtable) {
        String str = (String) hashtable.get(attributeTypeAndValue.getType());
        if (str == null) {
            str = attributeTypeAndValue.getType().getId();
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(valueToString(attributeTypeAndValue.getValue()));
    }

    private static boolean atvAreEqual(AttributeTypeAndValue attributeTypeAndValue, AttributeTypeAndValue attributeTypeAndValue2) {
        if (attributeTypeAndValue == attributeTypeAndValue2) {
            return true;
        }
        return attributeTypeAndValue != null && attributeTypeAndValue2 != null && attributeTypeAndValue.getType().equals((ASN1Primitive) attributeTypeAndValue2.getType()) && canonicalString(attributeTypeAndValue.getValue()).equals(canonicalString(attributeTypeAndValue2.getValue()));
    }

    public static String canonicalString(ASN1Encodable aSN1Encodable) {
        return canonicalize(valueToString(aSN1Encodable));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r5 >= r0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String canonicalize(java.lang.String r7) {
        /*
            int r0 = r7.length()
            r1 = 0
            if (r0 <= 0) goto L1d
            char r0 = r7.charAt(r1)
            r2 = 35
            if (r0 != r2) goto L1d
            org.bouncycastle.asn1.ASN1Primitive r0 = decodeObject(r7)
            boolean r2 = r0 instanceof org.bouncycastle.asn1.ASN1String
            if (r2 == 0) goto L1d
            org.bouncycastle.asn1.ASN1String r0 = (org.bouncycastle.asn1.ASN1String) r0
            java.lang.String r7 = r0.getString()
        L1d:
            java.lang.String r7 = org.bouncycastle.util.Strings.toLowerCase(r7)
            int r0 = r7.length()
            r2 = 2
            if (r0 >= r2) goto L29
            return r7
        L29:
            int r0 = r0 + (-1)
        L2b:
            r2 = 32
            r3 = 92
            if (r1 >= r0) goto L42
            char r4 = r7.charAt(r1)
            if (r4 != r3) goto L42
            int r4 = r1 + 1
            char r4 = r7.charAt(r4)
            if (r4 != r2) goto L42
            int r1 = r1 + 2
            goto L2b
        L42:
            int r4 = r1 + 1
            r5 = r0
        L45:
            if (r5 <= r4) goto L58
            int r6 = r5 + (-1)
            char r6 = r7.charAt(r6)
            if (r6 != r3) goto L58
            char r6 = r7.charAt(r5)
            if (r6 != r2) goto L58
            int r5 = r5 + (-2)
            goto L45
        L58:
            if (r1 > 0) goto L5c
            if (r5 >= r0) goto L62
        L5c:
            int r5 = r5 + 1
            java.lang.String r7 = r7.substring(r1, r5)
        L62:
            java.lang.String r7 = stripInternalSpaces(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.x500.style.IETFUtils.canonicalize(java.lang.String):java.lang.String");
    }

    private static int convertHex(char c10) {
        return ('0' > c10 || c10 > '9') ? ('a' > c10 || c10 > 'f') ? c10 - '7' : c10 - 'W' : c10 - '0';
    }

    public static ASN1ObjectIdentifier decodeAttrName(String str, Hashtable hashtable) {
        if (Strings.toUpperCase(str).startsWith(StubApp.getString2(27634))) {
            return new ASN1ObjectIdentifier(str.substring(4));
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return new ASN1ObjectIdentifier(str);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) hashtable.get(Strings.toLowerCase(str));
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        throw new IllegalArgumentException(a.k(StubApp.getString2(27635), str, StubApp.getString2(27636)));
    }

    private static ASN1Primitive decodeObject(String str) {
        try {
            return ASN1Primitive.fromByteArray(Hex.decodeStrict(str, 1, str.length() - 1));
        } catch (IOException e10) {
            throw new IllegalStateException(b.h(StubApp.getString2(27637), e10));
        }
    }

    public static String[] findAttrNamesForOID(ASN1ObjectIdentifier aSN1ObjectIdentifier, Hashtable hashtable) {
        Enumeration elements = hashtable.elements();
        int i3 = 0;
        int i10 = 0;
        while (elements.hasMoreElements()) {
            if (aSN1ObjectIdentifier.equals(elements.nextElement())) {
                i10++;
            }
        }
        String[] strArr = new String[i10];
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            if (aSN1ObjectIdentifier.equals(hashtable.get(str))) {
                strArr[i3] = str;
                i3++;
            }
        }
        return strArr;
    }

    private static boolean isHexDigit(char c10) {
        if ('0' <= c10 && c10 <= '9') {
            return true;
        }
        if ('a' > c10 || c10 > 'f') {
            return 'A' <= c10 && c10 <= 'F';
        }
        return true;
    }

    public static boolean rDNAreEqual(RDN rdn, RDN rdn2) {
        if (rdn.size() != rdn2.size()) {
            return false;
        }
        AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
        AttributeTypeAndValue[] typesAndValues2 = rdn2.getTypesAndValues();
        if (typesAndValues.length != typesAndValues2.length) {
            return false;
        }
        for (int i3 = 0; i3 != typesAndValues.length; i3++) {
            if (!atvAreEqual(typesAndValues[i3], typesAndValues2[i3])) {
                return false;
            }
        }
        return true;
    }

    public static RDN[] rDNsFromString(String str, X500NameStyle x500NameStyle) {
        X500NameTokenizer x500NameTokenizer = new X500NameTokenizer(str);
        X500NameBuilder x500NameBuilder = new X500NameBuilder(x500NameStyle);
        while (x500NameTokenizer.hasMoreTokens()) {
            String nextToken = x500NameTokenizer.nextToken();
            int indexOf = nextToken.indexOf(43);
            String string2 = StubApp.getString2(27638);
            if (indexOf > 0) {
                X500NameTokenizer x500NameTokenizer2 = new X500NameTokenizer(nextToken, '+');
                X500NameTokenizer x500NameTokenizer3 = new X500NameTokenizer(x500NameTokenizer2.nextToken(), '=');
                String nextToken2 = x500NameTokenizer3.nextToken();
                if (!x500NameTokenizer3.hasMoreTokens()) {
                    throw new IllegalArgumentException(string2);
                }
                String nextToken3 = x500NameTokenizer3.nextToken();
                ASN1ObjectIdentifier attrNameToOID = x500NameStyle.attrNameToOID(nextToken2.trim());
                if (x500NameTokenizer2.hasMoreTokens()) {
                    Vector vector = new Vector();
                    Vector vector2 = new Vector();
                    while (true) {
                        vector.addElement(attrNameToOID);
                        vector2.addElement(unescape(nextToken3));
                        if (!x500NameTokenizer2.hasMoreTokens()) {
                            x500NameBuilder.addMultiValuedRDN(toOIDArray(vector), toValueArray(vector2));
                            break;
                        }
                        X500NameTokenizer x500NameTokenizer4 = new X500NameTokenizer(x500NameTokenizer2.nextToken(), '=');
                        String nextToken4 = x500NameTokenizer4.nextToken();
                        if (!x500NameTokenizer4.hasMoreTokens()) {
                            throw new IllegalArgumentException(string2);
                        }
                        nextToken3 = x500NameTokenizer4.nextToken();
                        attrNameToOID = x500NameStyle.attrNameToOID(nextToken4.trim());
                    }
                } else {
                    x500NameBuilder.addRDN(attrNameToOID, unescape(nextToken3));
                }
            } else {
                X500NameTokenizer x500NameTokenizer5 = new X500NameTokenizer(nextToken, '=');
                String nextToken5 = x500NameTokenizer5.nextToken();
                if (!x500NameTokenizer5.hasMoreTokens()) {
                    throw new IllegalArgumentException(string2);
                }
                x500NameBuilder.addRDN(x500NameStyle.attrNameToOID(nextToken5.trim()), unescape(x500NameTokenizer5.nextToken()));
            }
        }
        return x500NameBuilder.build().getRDNs();
    }

    public static String stripInternalSpaces(String str) {
        if (str.indexOf(StubApp.getString2(6127)) < 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char charAt = str.charAt(0);
        stringBuffer.append(charAt);
        for (int i3 = 1; i3 < str.length(); i3++) {
            char charAt2 = str.charAt(i3);
            if (charAt != ' ' || charAt2 != ' ') {
                stringBuffer.append(charAt2);
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    private static ASN1ObjectIdentifier[] toOIDArray(Vector vector) {
        int size = vector.size();
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
        for (int i3 = 0; i3 != size; i3++) {
            aSN1ObjectIdentifierArr[i3] = (ASN1ObjectIdentifier) vector.elementAt(i3);
        }
        return aSN1ObjectIdentifierArr;
    }

    private static String[] toValueArray(Vector vector) {
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i3 = 0; i3 != size; i3++) {
            strArr[i3] = (String) vector.elementAt(i3);
        }
        return strArr;
    }

    private static String unescape(String str) {
        int i3;
        if (str.length() == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (charArray[0] == '\\' && charArray[1] == '#') {
            stringBuffer.append(StubApp.getString2(27639));
            i3 = 2;
        } else {
            i3 = 0;
        }
        boolean z2 = false;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        char c10 = 0;
        while (i3 != charArray.length) {
            char c11 = charArray[i3];
            if (c11 != ' ') {
                z11 = true;
            }
            if (c11 != '\"') {
                if (c11 == '\\' && !z2 && !z10) {
                    i10 = stringBuffer.length();
                    z2 = true;
                } else if (c11 != ' ' || z2 || z11) {
                    if (z2 && isHexDigit(c11)) {
                        if (c10 != 0) {
                            stringBuffer.append((char) ((convertHex(c10) * 16) + convertHex(c11)));
                            z2 = false;
                            c10 = 0;
                        } else {
                            c10 = c11;
                        }
                    }
                }
                i3++;
            } else if (!z2) {
                z10 = !z10;
                z2 = false;
                i3++;
            }
            stringBuffer.append(c11);
            z2 = false;
            i3++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i10 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public static ASN1Encodable valueFromHexString(String str, int i3) throws IOException {
        int length = (str.length() - i3) / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 != length; i10++) {
            int i11 = (i10 * 2) + i3;
            char charAt = str.charAt(i11);
            char charAt2 = str.charAt(i11 + 1);
            bArr[i10] = (byte) (convertHex(charAt2) | (convertHex(charAt) << 4));
        }
        return ASN1Primitive.fromByteArray(bArr);
    }

    public static String valueToString(ASN1Encodable aSN1Encodable) {
        StringBuffer stringBuffer = new StringBuffer();
        int i3 = 0;
        if (!(aSN1Encodable instanceof ASN1String) || (aSN1Encodable instanceof ASN1UniversalString)) {
            try {
                stringBuffer.append('#');
                stringBuffer.append(Hex.toHexString(aSN1Encodable.toASN1Primitive().getEncoded(StubApp.getString2("26791"))));
            } catch (IOException unused) {
                throw new IllegalArgumentException(StubApp.getString2(27640));
            }
        } else {
            String string = ((ASN1String) aSN1Encodable).getString();
            if (string.length() > 0 && string.charAt(0) == '#') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(string);
        }
        int length = stringBuffer.length();
        int i10 = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (true) {
            String string2 = StubApp.getString2(639);
            if (i10 == length) {
                if (stringBuffer.length() > 0) {
                    while (stringBuffer.length() > i3 && stringBuffer.charAt(i3) == ' ') {
                        stringBuffer.insert(i3, string2);
                        i3 += 2;
                    }
                }
                for (int length2 = stringBuffer.length() - 1; length2 >= i3 && stringBuffer.charAt(length2) == ' '; length2--) {
                    stringBuffer.insert(length2, '\\');
                }
                return stringBuffer.toString();
            }
            char charAt = stringBuffer.charAt(i10);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i10++;
                        break;
                }
            }
            stringBuffer.insert(i10, string2);
            i10 += 2;
            length++;
        }
    }
}
