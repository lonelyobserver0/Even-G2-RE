package org.bouncycastle.asn1;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BERBitStringParser implements ASN1BitStringParser {
    private ConstructedBitStream _bitStream;
    private ASN1StreamParser _parser;

    public BERBitStringParser(ASN1StreamParser aSN1StreamParser) {
        this._parser = aSN1StreamParser;
    }

    public static BERBitString parse(ASN1StreamParser aSN1StreamParser) throws IOException {
        ConstructedBitStream constructedBitStream = new ConstructedBitStream(aSN1StreamParser, false);
        return new BERBitString(Streams.readAll(constructedBitStream), constructedBitStream.getPadBits());
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getBitStream() throws IOException {
        ConstructedBitStream constructedBitStream = new ConstructedBitStream(this._parser, false);
        this._bitStream = constructedBitStream;
        return constructedBitStream;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        return parse(this._parser);
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getOctetStream() throws IOException {
        ConstructedBitStream constructedBitStream = new ConstructedBitStream(this._parser, true);
        this._bitStream = constructedBitStream;
        return constructedBitStream;
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public int getPadBits() {
        return this._bitStream.getPadBits();
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e10) {
            throw new ASN1ParsingException(u.q(e10, new StringBuilder(StubApp.getString2(26839))), e10);
        }
    }
}
