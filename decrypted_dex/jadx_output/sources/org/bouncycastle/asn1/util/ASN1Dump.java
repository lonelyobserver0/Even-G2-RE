package org.bouncycastle.asn1.util;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1External;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1GraphicString;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1NumericString;
import org.bouncycastle.asn1.ASN1ObjectDescriptor;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1T61String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.ASN1VideotexString;
import org.bouncycastle.asn1.ASN1VisibleString;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLBitString;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ASN1Dump {
    private static final int SAMPLE_SIZE = 32;
    private static final String TAB = StubApp.getString2(6147);

    public static void _dumpAsString(String str, boolean z2, ASN1Primitive aSN1Primitive, StringBuffer stringBuffer) {
        StringBuilder n10;
        int length;
        String lineSeparator = Strings.lineSeparator();
        if (aSN1Primitive instanceof ASN1Null) {
            stringBuffer.append(str);
            stringBuffer.append(StubApp.getString2(3796));
            stringBuffer.append(lineSeparator);
            return;
        }
        boolean z10 = aSN1Primitive instanceof ASN1Sequence;
        int i3 = 0;
        String string2 = StubApp.getString2(6147);
        if (z10) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERSequence ? StubApp.getString2(27514) : aSN1Primitive instanceof DERSequence ? StubApp.getString2(27515) : StubApp.getString2(27516));
            stringBuffer.append(lineSeparator);
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
            String g10 = AbstractC1482f.g(str, string2);
            int size = aSN1Sequence.size();
            while (i3 < size) {
                _dumpAsString(g10, z2, aSN1Sequence.getObjectAt(i3).toASN1Primitive(), stringBuffer);
                i3++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1Set) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERSet ? StubApp.getString2(27517) : aSN1Primitive instanceof DERSet ? StubApp.getString2(27518) : StubApp.getString2(10689));
            stringBuffer.append(lineSeparator);
            ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
            String g11 = AbstractC1482f.g(str, string2);
            int size2 = aSN1Set.size();
            while (i3 < size2) {
                _dumpAsString(g11, z2, aSN1Set.getObjectAt(i3).toASN1Primitive(), stringBuffer);
                i3++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1ApplicationSpecific) {
            _dumpAsString(str, z2, ((ASN1ApplicationSpecific) aSN1Primitive).getTaggedObject(), stringBuffer);
            return;
        }
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERTaggedObject ? StubApp.getString2(27519) : aSN1Primitive instanceof DERTaggedObject ? StubApp.getString2(27520) : StubApp.getString2(27521));
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
            stringBuffer.append(ASN1Util.getTagText(aSN1TaggedObject));
            if (!aSN1TaggedObject.isExplicit()) {
                stringBuffer.append(StubApp.getString2(27522));
            }
            stringBuffer.append(lineSeparator);
            _dumpAsString(str + string2, z2, aSN1TaggedObject.getBaseObject().toASN1Primitive(), stringBuffer);
            return;
        }
        boolean z11 = aSN1Primitive instanceof ASN1OctetString;
        String string22 = StubApp.getString2(1558);
        if (z11) {
            ASN1OctetString aSN1OctetString = (ASN1OctetString) aSN1Primitive;
            if (aSN1Primitive instanceof BEROctetString) {
                n10 = AbstractC1482f.n(str, StubApp.getString2(27523));
                length = aSN1OctetString.getOctets().length;
            } else {
                n10 = AbstractC1482f.n(str, StubApp.getString2(27524));
                length = aSN1OctetString.getOctets().length;
            }
            n10.append(length);
            n10.append(string22);
            stringBuffer.append(n10.toString());
            if (z2) {
                stringBuffer.append(dumpBinaryDataAsString(str, aSN1OctetString.getOctets()));
                return;
            } else {
                stringBuffer.append(lineSeparator);
                return;
            }
        }
        boolean z12 = aSN1Primitive instanceof ASN1ObjectIdentifier;
        String string23 = StubApp.getString2(74);
        if (z12) {
            StringBuilder n11 = AbstractC1482f.n(str, StubApp.getString2(27525));
            n11.append(((ASN1ObjectIdentifier) aSN1Primitive).getId());
            n11.append(string23);
            n11.append(lineSeparator);
            stringBuffer.append(n11.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            StringBuilder n12 = AbstractC1482f.n(str, StubApp.getString2(27526));
            n12.append(((ASN1RelativeOID) aSN1Primitive).getId());
            n12.append(string23);
            n12.append(lineSeparator);
            stringBuffer.append(n12.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1Boolean) {
            StringBuilder n13 = AbstractC1482f.n(str, StubApp.getString2(27527));
            n13.append(((ASN1Boolean) aSN1Primitive).isTrue());
            n13.append(string23);
            n13.append(lineSeparator);
            stringBuffer.append(n13.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1Integer) {
            StringBuilder n14 = AbstractC1482f.n(str, StubApp.getString2(27528));
            n14.append(((ASN1Integer) aSN1Primitive).getValue());
            n14.append(string23);
            n14.append(lineSeparator);
            stringBuffer.append(n14.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1BitString) {
            ASN1BitString aSN1BitString = (ASN1BitString) aSN1Primitive;
            byte[] bytes = aSN1BitString.getBytes();
            int padBits = aSN1BitString.getPadBits();
            boolean z13 = aSN1BitString instanceof DERBitString;
            String string24 = StubApp.getString2(81);
            StringBuilder n15 = AbstractC1482f.n(str, z13 ? StubApp.getString2(27529) : aSN1BitString instanceof DLBitString ? StubApp.getString2(27530) : StubApp.getString2(27531));
            n15.append(bytes.length);
            n15.append(string24);
            n15.append(padBits);
            n15.append(string22);
            stringBuffer.append(n15.toString());
            if (z2) {
                stringBuffer.append(dumpBinaryDataAsString(str, bytes));
                return;
            } else {
                stringBuffer.append(lineSeparator);
                return;
            }
        }
        boolean z14 = aSN1Primitive instanceof ASN1IA5String;
        String string25 = StubApp.getString2(3046);
        if (z14) {
            StringBuilder n16 = AbstractC1482f.n(str, StubApp.getString2(27532));
            n16.append(((ASN1IA5String) aSN1Primitive).getString());
            n16.append(string25);
            n16.append(lineSeparator);
            stringBuffer.append(n16.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1UTF8String) {
            StringBuilder n17 = AbstractC1482f.n(str, StubApp.getString2(27533));
            n17.append(((ASN1UTF8String) aSN1Primitive).getString());
            n17.append(string25);
            n17.append(lineSeparator);
            stringBuffer.append(n17.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1NumericString) {
            StringBuilder n18 = AbstractC1482f.n(str, StubApp.getString2(27534));
            n18.append(((ASN1NumericString) aSN1Primitive).getString());
            n18.append(string25);
            n18.append(lineSeparator);
            stringBuffer.append(n18.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1PrintableString) {
            StringBuilder n19 = AbstractC1482f.n(str, StubApp.getString2(27535));
            n19.append(((ASN1PrintableString) aSN1Primitive).getString());
            n19.append(string25);
            n19.append(lineSeparator);
            stringBuffer.append(n19.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1VisibleString) {
            StringBuilder n20 = AbstractC1482f.n(str, StubApp.getString2(27536));
            n20.append(((ASN1VisibleString) aSN1Primitive).getString());
            n20.append(string25);
            n20.append(lineSeparator);
            stringBuffer.append(n20.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1BMPString) {
            StringBuilder n21 = AbstractC1482f.n(str, StubApp.getString2(27537));
            n21.append(((ASN1BMPString) aSN1Primitive).getString());
            n21.append(string25);
            n21.append(lineSeparator);
            stringBuffer.append(n21.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1T61String) {
            StringBuilder n22 = AbstractC1482f.n(str, StubApp.getString2(27538));
            n22.append(((ASN1T61String) aSN1Primitive).getString());
            n22.append(string25);
            n22.append(lineSeparator);
            stringBuffer.append(n22.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1GraphicString) {
            StringBuilder n23 = AbstractC1482f.n(str, StubApp.getString2(27539));
            n23.append(((ASN1GraphicString) aSN1Primitive).getString());
            n23.append(string25);
            n23.append(lineSeparator);
            stringBuffer.append(n23.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1VideotexString) {
            StringBuilder n24 = AbstractC1482f.n(str, StubApp.getString2(27540));
            n24.append(((ASN1VideotexString) aSN1Primitive).getString());
            n24.append(string25);
            n24.append(lineSeparator);
            stringBuffer.append(n24.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1UTCTime) {
            StringBuilder n25 = AbstractC1482f.n(str, StubApp.getString2(27541));
            n25.append(((ASN1UTCTime) aSN1Primitive).getTime());
            n25.append(string25);
            n25.append(lineSeparator);
            stringBuffer.append(n25.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            StringBuilder n26 = AbstractC1482f.n(str, StubApp.getString2(27542));
            n26.append(((ASN1GeneralizedTime) aSN1Primitive).getTime());
            n26.append(string25);
            n26.append(lineSeparator);
            stringBuffer.append(n26.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1Enumerated) {
            StringBuilder n27 = AbstractC1482f.n(str, StubApp.getString2(27543));
            n27.append(((ASN1Enumerated) aSN1Primitive).getValue());
            n27.append(string23);
            n27.append(lineSeparator);
            stringBuffer.append(n27.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1ObjectDescriptor) {
            StringBuilder n28 = AbstractC1482f.n(str, StubApp.getString2(27544));
            n28.append(((ASN1ObjectDescriptor) aSN1Primitive).getBaseGraphicString().getString());
            n28.append(string25);
            n28.append(lineSeparator);
            stringBuffer.append(n28.toString());
            return;
        }
        if (!(aSN1Primitive instanceof ASN1External)) {
            StringBuilder b2 = AbstractC1856e.b(str);
            b2.append(aSN1Primitive.toString());
            b2.append(lineSeparator);
            stringBuffer.append(b2.toString());
            return;
        }
        ASN1External aSN1External = (ASN1External) aSN1Primitive;
        stringBuffer.append(str + StubApp.getString2(27545) + lineSeparator);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(string2);
        String sb3 = sb2.toString();
        if (aSN1External.getDirectReference() != null) {
            StringBuilder n29 = AbstractC1482f.n(sb3, StubApp.getString2(27546));
            n29.append(aSN1External.getDirectReference().getId());
            n29.append(lineSeparator);
            stringBuffer.append(n29.toString());
        }
        if (aSN1External.getIndirectReference() != null) {
            StringBuilder n30 = AbstractC1482f.n(sb3, StubApp.getString2(27547));
            n30.append(aSN1External.getIndirectReference().toString());
            n30.append(lineSeparator);
            stringBuffer.append(n30.toString());
        }
        if (aSN1External.getDataValueDescriptor() != null) {
            _dumpAsString(sb3, z2, aSN1External.getDataValueDescriptor(), stringBuffer);
        }
        StringBuilder n31 = AbstractC1482f.n(sb3, StubApp.getString2(27548));
        n31.append(aSN1External.getEncoding());
        n31.append(lineSeparator);
        stringBuffer.append(n31.toString());
        _dumpAsString(sb3, z2, aSN1External.getExternalContent(), stringBuffer);
    }

    private static String calculateAscString(byte[] bArr, int i3, int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = i3; i11 != i3 + i10; i11++) {
            byte b2 = bArr[i11];
            if (b2 >= 32 && b2 <= 126) {
                stringBuffer.append((char) b2);
            }
        }
        return stringBuffer.toString();
    }

    public static String dumpAsString(Object obj) {
        return dumpAsString(obj, false);
    }

    private static String dumpBinaryDataAsString(String str, byte[] bArr) {
        String calculateAscString;
        String lineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String string2 = StubApp.getString2(6147);
        sb2.append(string2);
        String sb3 = sb2.toString();
        stringBuffer.append(lineSeparator);
        for (int i3 = 0; i3 < bArr.length; i3 += 32) {
            int length = bArr.length - i3;
            stringBuffer.append(sb3);
            if (length > 32) {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i3, 32)));
                stringBuffer.append(string2);
                calculateAscString = calculateAscString(bArr, i3, 32);
            } else {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i3, bArr.length - i3)));
                for (int length2 = bArr.length - i3; length2 != 32; length2++) {
                    stringBuffer.append(StubApp.getString2(6127));
                }
                stringBuffer.append(string2);
                calculateAscString = calculateAscString(bArr, i3, bArr.length - i3);
            }
            stringBuffer.append(calculateAscString);
            stringBuffer.append(lineSeparator);
        }
        return stringBuffer.toString();
    }

    public static String dumpAsString(Object obj, boolean z2) {
        ASN1Primitive aSN1Primitive;
        if (obj instanceof ASN1Primitive) {
            aSN1Primitive = (ASN1Primitive) obj;
        } else {
            if (!(obj instanceof ASN1Encodable)) {
                return StubApp.getString2(27549) + obj.toString();
            }
            aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
        }
        StringBuffer stringBuffer = new StringBuffer();
        _dumpAsString("", z2, aSN1Primitive, stringBuffer);
        return stringBuffer.toString();
    }
}
