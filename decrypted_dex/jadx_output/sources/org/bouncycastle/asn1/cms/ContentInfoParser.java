package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.ASN1Util;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ContentInfoParser {
    private ASN1TaggedObjectParser content;
    private ASN1ObjectIdentifier contentType;

    public ContentInfoParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
        this.contentType = (ASN1ObjectIdentifier) aSN1SequenceParser.readObject();
        this.content = (ASN1TaggedObjectParser) aSN1SequenceParser.readObject();
    }

    public ASN1Encodable getContent(int i3) throws IOException {
        ASN1TaggedObjectParser aSN1TaggedObjectParser = this.content;
        if (aSN1TaggedObjectParser != null) {
            return ASN1Util.parseExplicitContextBaseObject(aSN1TaggedObjectParser, 0);
        }
        return null;
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.contentType;
    }
}
