package org.bouncycastle.asn1;

import Xa.h;
import com.stub.StubApp;
import java.io.IOException;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ASN1Util {
    public static ASN1TaggedObject checkTag(ASN1TaggedObject aSN1TaggedObject, int i3, int i10) {
        if (aSN1TaggedObject.hasTag(i3, i10)) {
            return aSN1TaggedObject;
        }
        throw new IllegalStateException(AbstractC1482f.i(StubApp.getString2(26832), getTagText(i3, i10), StubApp.getString2(26833), getTagText(aSN1TaggedObject)));
    }

    public static ASN1Primitive getBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i3, int i10, boolean z2, int i11) {
        return checkTag(aSN1TaggedObject, i3, i10).getBaseUniversal(z2, i11);
    }

    public static ASN1Primitive getContextBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i3, boolean z2, int i10) {
        return getBaseUniversal(aSN1TaggedObject, 128, i3, z2, i10);
    }

    public static ASN1Object getExplicitBaseObject(ASN1TaggedObject aSN1TaggedObject, int i3, int i10) {
        return checkTag(aSN1TaggedObject, i3, i10).getExplicitBaseObject();
    }

    public static ASN1TaggedObject getExplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i3, int i10) {
        return checkTag(aSN1TaggedObject, i3, i10).getExplicitBaseTagged();
    }

    public static ASN1Object getExplicitContextBaseObject(ASN1TaggedObject aSN1TaggedObject, int i3) {
        return getExplicitBaseObject(aSN1TaggedObject, 128, i3);
    }

    public static ASN1TaggedObject getExplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i3) {
        return getExplicitBaseTagged(aSN1TaggedObject, 128, i3);
    }

    public static ASN1TaggedObject getImplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i3, int i10, int i11, int i12) {
        return checkTag(aSN1TaggedObject, i3, i10).getImplicitBaseTagged(i11, i12);
    }

    public static ASN1TaggedObject getImplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i3, int i10, int i11) {
        return getImplicitBaseTagged(aSN1TaggedObject, 128, i3, i10, i11);
    }

    public static String getTagText(int i3, int i10) {
        return h.g(i10, i3 != 64 ? i3 != 128 ? i3 != 192 ? StubApp.getString2(26834) : StubApp.getString2(26835) : StubApp.getString2(26836) : StubApp.getString2(26837), StubApp.getString2(511));
    }

    public static ASN1Encodable parseBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3, int i10, boolean z2, int i11) throws IOException {
        return checkTag(aSN1TaggedObjectParser, i3, i10).parseBaseUniversal(z2, i11);
    }

    public static ASN1Encodable parseContextBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3, boolean z2, int i10) throws IOException {
        return parseBaseUniversal(aSN1TaggedObjectParser, 128, i3, z2, i10);
    }

    public static ASN1Encodable parseExplicitBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3, int i10) throws IOException {
        return checkTag(aSN1TaggedObjectParser, i3, i10).parseExplicitBaseObject();
    }

    public static ASN1TaggedObjectParser parseExplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3, int i10) throws IOException {
        return checkTag(aSN1TaggedObjectParser, i3, i10).parseExplicitBaseTagged();
    }

    public static ASN1Encodable parseExplicitContextBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3) throws IOException {
        return parseExplicitBaseObject(aSN1TaggedObjectParser, 128, i3);
    }

    public static ASN1TaggedObjectParser parseExplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3) throws IOException {
        return parseExplicitBaseTagged(aSN1TaggedObjectParser, 128, i3);
    }

    public static ASN1TaggedObjectParser parseImplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3, int i10, int i11, int i12) throws IOException {
        return checkTag(aSN1TaggedObjectParser, i3, i10).parseImplicitBaseTagged(i11, i12);
    }

    public static ASN1TaggedObjectParser parseImplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3, int i10, int i11) throws IOException {
        return parseImplicitBaseTagged(aSN1TaggedObjectParser, 128, i3, i10, i11);
    }

    public static ASN1Primitive tryGetBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i3, int i10, boolean z2, int i11) {
        if (aSN1TaggedObject.hasTag(i3, i10)) {
            return aSN1TaggedObject.getBaseUniversal(z2, i11);
        }
        return null;
    }

    public static ASN1Primitive tryGetContextBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i3, boolean z2, int i10) {
        return tryGetBaseUniversal(aSN1TaggedObject, 128, i3, z2, i10);
    }

    public static ASN1Object tryGetExplicitBaseObject(ASN1TaggedObject aSN1TaggedObject, int i3, int i10) {
        if (aSN1TaggedObject.hasTag(i3, i10)) {
            return aSN1TaggedObject.getExplicitBaseObject();
        }
        return null;
    }

    public static ASN1TaggedObject tryGetExplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i3, int i10) {
        if (aSN1TaggedObject.hasTag(i3, i10)) {
            return aSN1TaggedObject.getExplicitBaseTagged();
        }
        return null;
    }

    public static ASN1Object tryGetExplicitContextBaseObject(ASN1TaggedObject aSN1TaggedObject, int i3) {
        return tryGetExplicitBaseObject(aSN1TaggedObject, 128, i3);
    }

    public static ASN1TaggedObject tryGetExplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i3) {
        return tryGetExplicitBaseTagged(aSN1TaggedObject, 128, i3);
    }

    public static ASN1TaggedObject tryGetImplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i3, int i10, int i11, int i12) {
        if (aSN1TaggedObject.hasTag(i3, i10)) {
            return aSN1TaggedObject.getImplicitBaseTagged(i11, i12);
        }
        return null;
    }

    public static ASN1TaggedObject tryGetImplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i3, int i10, int i11) {
        return tryGetImplicitBaseTagged(aSN1TaggedObject, 128, i3, i10, i11);
    }

    public static ASN1Encodable tryParseBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3, int i10, boolean z2, int i11) throws IOException {
        if (aSN1TaggedObjectParser.hasTag(i3, i10)) {
            return aSN1TaggedObjectParser.parseBaseUniversal(z2, i11);
        }
        return null;
    }

    public static ASN1Encodable tryParseContextBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3, boolean z2, int i10) throws IOException {
        return tryParseBaseUniversal(aSN1TaggedObjectParser, 128, i3, z2, i10);
    }

    public static ASN1Encodable tryParseExplicitBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3, int i10) throws IOException {
        if (aSN1TaggedObjectParser.hasTag(i3, i10)) {
            return aSN1TaggedObjectParser.parseExplicitBaseObject();
        }
        return null;
    }

    public static ASN1TaggedObjectParser tryParseExplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3, int i10) throws IOException {
        if (aSN1TaggedObjectParser.hasTag(i3, i10)) {
            return aSN1TaggedObjectParser.parseExplicitBaseTagged();
        }
        return null;
    }

    public static ASN1Encodable tryParseExplicitContextBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3) throws IOException {
        return tryParseExplicitBaseObject(aSN1TaggedObjectParser, 128, i3);
    }

    public static ASN1TaggedObjectParser tryParseExplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3) throws IOException {
        return tryParseExplicitBaseTagged(aSN1TaggedObjectParser, 128, i3);
    }

    public static ASN1TaggedObjectParser tryParseImplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3, int i10, int i11, int i12) throws IOException {
        if (aSN1TaggedObjectParser.hasTag(i3, i10)) {
            return aSN1TaggedObjectParser.parseImplicitBaseTagged(i11, i12);
        }
        return null;
    }

    public static ASN1TaggedObjectParser tryParseImplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3, int i10, int i11) throws IOException {
        return tryParseImplicitBaseTagged(aSN1TaggedObjectParser, 128, i3, i10, i11);
    }

    public static String getTagText(ASN1Tag aSN1Tag) {
        return getTagText(aSN1Tag.getTagClass(), aSN1Tag.getTagNumber());
    }

    public static ASN1TaggedObjectParser checkTag(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i3, int i10) {
        if (aSN1TaggedObjectParser.hasTag(i3, i10)) {
            return aSN1TaggedObjectParser;
        }
        throw new IllegalStateException(AbstractC1482f.i(StubApp.getString2(26832), getTagText(i3, i10), StubApp.getString2(26833), getTagText(aSN1TaggedObjectParser)));
    }

    public static String getTagText(ASN1TaggedObject aSN1TaggedObject) {
        return getTagText(aSN1TaggedObject.getTagClass(), aSN1TaggedObject.getTagNo());
    }

    public static String getTagText(ASN1TaggedObjectParser aSN1TaggedObjectParser) {
        return getTagText(aSN1TaggedObjectParser.getTagClass(), aSN1TaggedObjectParser.getTagNo());
    }
}
