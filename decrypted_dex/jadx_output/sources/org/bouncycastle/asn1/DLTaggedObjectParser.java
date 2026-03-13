package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DLTaggedObjectParser extends BERTaggedObjectParser {
    private final boolean _constructed;

    public DLTaggedObjectParser(int i3, int i10, boolean z2, ASN1StreamParser aSN1StreamParser) {
        super(i3, i10, aSN1StreamParser);
        this._constructed = z2;
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        return this._parser.loadTaggedDL(this._tagClass, this._tagNo, this._constructed);
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser
    public boolean isConstructed() {
        return this._constructed;
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseBaseUniversal(boolean z2, int i3) throws IOException {
        if (!z2) {
            return this._constructed ? this._parser.parseImplicitConstructedDL(i3) : this._parser.parseImplicitPrimitive(i3);
        }
        if (this._constructed) {
            return this._parser.parseObject(i3);
        }
        throw new IOException(StubApp.getString2(26847));
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseExplicitBaseObject() throws IOException {
        if (this._constructed) {
            return this._parser.readObject();
        }
        throw new IOException(StubApp.getString2(26847));
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseExplicitBaseTagged() throws IOException {
        if (this._constructed) {
            return this._parser.parseTaggedObject();
        }
        throw new IOException(StubApp.getString2(26847));
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseImplicitBaseTagged(int i3, int i10) throws IOException {
        return 64 == i3 ? (DLApplicationSpecific) this._parser.loadTaggedDL(i3, i10, this._constructed) : new DLTaggedObjectParser(i3, i10, this._constructed, this._parser);
    }
}
