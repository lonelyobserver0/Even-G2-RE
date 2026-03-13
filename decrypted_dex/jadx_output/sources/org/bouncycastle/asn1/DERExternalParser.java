package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DERExternalParser implements ASN1ExternalParser {
    private ASN1StreamParser _parser;

    public DERExternalParser(ASN1StreamParser aSN1StreamParser) {
        this._parser = aSN1StreamParser;
    }

    public static DLExternal parse(ASN1StreamParser aSN1StreamParser) throws IOException {
        try {
            return new DLExternal(aSN1StreamParser.readVector());
        } catch (IllegalArgumentException e10) {
            throw new ASN1Exception(e10.getMessage(), e10);
        }
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        return parse(this._parser);
    }

    @Override // org.bouncycastle.asn1.ASN1ExternalParser
    public ASN1Encodable readObject() throws IOException {
        return this._parser.readObject();
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        String string2 = StubApp.getString2(26842);
        try {
            return getLoadedObject();
        } catch (IOException e10) {
            throw new ASN1ParsingException(string2, e10);
        } catch (IllegalArgumentException e11) {
            throw new ASN1ParsingException(string2, e11);
        }
    }
}
