package org.bouncycastle.asn1.cms;

import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.ASN1Util;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AuthEnvelopedDataParser {
    private boolean isData;
    private ASN1Encodable nextObject;
    private boolean originatorInfoCalled;
    private ASN1SequenceParser seq;
    private ASN1Integer version;

    public AuthEnvelopedDataParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
        this.seq = aSN1SequenceParser;
        ASN1Integer aSN1Integer = ASN1Integer.getInstance(aSN1SequenceParser.readObject());
        this.version = aSN1Integer;
        if (!aSN1Integer.hasValue(0)) {
            throw new ASN1ParsingException(StubApp.getString2(26905));
        }
    }

    public ASN1SetParser getAuthAttrs() throws IOException {
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1Encodable aSN1Encodable = this.nextObject;
        if (aSN1Encodable instanceof ASN1TaggedObjectParser) {
            this.nextObject = null;
            return (ASN1SetParser) ASN1Util.parseContextBaseUniversal((ASN1TaggedObjectParser) aSN1Encodable, 1, false, 17);
        }
        if (this.isData) {
            return null;
        }
        throw new ASN1ParsingException(StubApp.getString2(26903));
    }

    public EncryptedContentInfoParser getAuthEncryptedContentInfo() throws IOException {
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1Encodable aSN1Encodable = this.nextObject;
        if (aSN1Encodable == null) {
            return null;
        }
        this.nextObject = null;
        EncryptedContentInfoParser encryptedContentInfoParser = new EncryptedContentInfoParser((ASN1SequenceParser) aSN1Encodable);
        this.isData = CMSObjectIdentifiers.data.equals((ASN1Primitive) encryptedContentInfoParser.getContentType());
        return encryptedContentInfoParser;
    }

    public ASN1OctetString getMac() throws IOException {
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1Encodable aSN1Encodable = this.nextObject;
        this.nextObject = null;
        return ASN1OctetString.getInstance(aSN1Encodable.toASN1Primitive());
    }

    public OriginatorInfo getOriginatorInfo() throws IOException {
        this.originatorInfoCalled = true;
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1Encodable aSN1Encodable = this.nextObject;
        if (aSN1Encodable instanceof ASN1TaggedObjectParser) {
            ASN1TaggedObjectParser aSN1TaggedObjectParser = (ASN1TaggedObjectParser) aSN1Encodable;
            if (aSN1TaggedObjectParser.hasContextTag(0)) {
                ASN1SequenceParser aSN1SequenceParser = (ASN1SequenceParser) aSN1TaggedObjectParser.parseBaseUniversal(false, 16);
                this.nextObject = null;
                return OriginatorInfo.getInstance(aSN1SequenceParser.getLoadedObject());
            }
        }
        return null;
    }

    public ASN1SetParser getRecipientInfos() throws IOException {
        if (!this.originatorInfoCalled) {
            getOriginatorInfo();
        }
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1SetParser aSN1SetParser = (ASN1SetParser) this.nextObject;
        this.nextObject = null;
        return aSN1SetParser;
    }

    public ASN1SetParser getUnauthAttrs() throws IOException {
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1Encodable aSN1Encodable = this.nextObject;
        if (aSN1Encodable == null) {
            return null;
        }
        this.nextObject = null;
        return (ASN1SetParser) ASN1Util.parseContextBaseUniversal((ASN1TaggedObjectParser) aSN1Encodable, 2, false, 17);
    }

    public ASN1Integer getVersion() {
        return this.version;
    }
}
