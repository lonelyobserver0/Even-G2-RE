package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BERTaggedObjectParser implements ASN1TaggedObjectParser {
    final ASN1StreamParser _parser;
    final int _tagClass;
    final int _tagNo;

    public BERTaggedObjectParser(int i3, int i10, ASN1StreamParser aSN1StreamParser) {
        this._tagClass = i3;
        this._tagNo = i10;
        this._parser = aSN1StreamParser;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        return this._parser.loadTaggedIL(this._tagClass, this._tagNo);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable getObjectParser(int i3, boolean z2) throws IOException {
        if (128 == getTagClass()) {
            return parseBaseUniversal(z2, i3);
        }
        throw new ASN1Exception(StubApp.getString2(26704));
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagClass() {
        return this._tagClass;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagNo() {
        return this._tagNo;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasContextTag(int i3) {
        return this._tagClass == 128 && this._tagNo == i3;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasTag(int i3, int i10) {
        return this._tagClass == i3 && this._tagNo == i10;
    }

    public boolean isConstructed() {
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseBaseUniversal(boolean z2, int i3) throws IOException {
        return z2 ? this._parser.parseObject(i3) : this._parser.parseImplicitConstructedIL(i3);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseExplicitBaseObject() throws IOException {
        return this._parser.readObject();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseExplicitBaseTagged() throws IOException {
        return this._parser.parseTaggedObject();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseImplicitBaseTagged(int i3, int i10) throws IOException {
        return 64 == i3 ? new BERApplicationSpecificParser(i10, this._parser) : new BERTaggedObjectParser(i3, i10, this._parser);
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e10) {
            throw new ASN1ParsingException(e10.getMessage());
        }
    }
}
