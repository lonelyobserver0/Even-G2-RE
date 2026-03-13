package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BERApplicationSpecificParser extends BERTaggedObjectParser implements ASN1ApplicationSpecificParser {
    public BERApplicationSpecificParser(int i3, ASN1StreamParser aSN1StreamParser) {
        super(64, i3, aSN1StreamParser);
    }

    @Override // org.bouncycastle.asn1.ASN1ApplicationSpecificParser
    public ASN1Encodable readObject() throws IOException {
        return parseExplicitBaseObject();
    }
}
