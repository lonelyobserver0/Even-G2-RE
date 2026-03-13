package org.bouncycastle.tsp.cms;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfoParser;
import org.bouncycastle.asn1.cms.TimeStampedDataParser;
import org.bouncycastle.cms.CMSContentInfoParser;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.tsp.TimeStampToken;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSTimeStampedDataParser extends CMSContentInfoParser {
    private TimeStampedDataParser timeStampedData;
    private TimeStampDataUtil util;

    public CMSTimeStampedDataParser(InputStream inputStream) throws CMSException {
        super(inputStream);
        initialize(this._contentInfo);
    }

    private void initialize(ContentInfoParser contentInfoParser) throws CMSException {
        String string2 = StubApp.getString2(34933);
        try {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = CMSObjectIdentifiers.timestampedData;
            if (aSN1ObjectIdentifier.equals((ASN1Primitive) contentInfoParser.getContentType())) {
                this.timeStampedData = TimeStampedDataParser.getInstance(contentInfoParser.getContent(16));
            } else {
                throw new IllegalArgumentException(string2 + aSN1ObjectIdentifier.getId());
            }
        } catch (IOException e10) {
            throw new CMSException(u.q(e10, new StringBuilder(StubApp.getString2(34935))), e10);
        }
    }

    private void parseTimeStamps() throws CMSException {
        try {
            if (this.util == null) {
                InputStream content = getContent();
                if (content != null) {
                    Streams.drain(content);
                }
                this.util = new TimeStampDataUtil(this.timeStampedData);
            }
        } catch (IOException e10) {
            throw new CMSException(u.q(e10, new StringBuilder(StubApp.getString2(34936))), e10);
        }
    }

    public byte[] calculateNextHash(DigestCalculator digestCalculator) throws CMSException {
        return this.util.calculateNextHash(digestCalculator);
    }

    public InputStream getContent() {
        if (this.timeStampedData.getContent() != null) {
            return this.timeStampedData.getContent().getOctetStream();
        }
        return null;
    }

    public URI getDataUri() throws URISyntaxException {
        DERIA5String dataUri = this.timeStampedData.getDataUri();
        if (dataUri != null) {
            return new URI(dataUri.getString());
        }
        return null;
    }

    public String getFileName() {
        return this.util.getFileName();
    }

    public String getMediaType() {
        return this.util.getMediaType();
    }

    public DigestCalculator getMessageImprintDigestCalculator(DigestCalculatorProvider digestCalculatorProvider) throws OperatorCreationException {
        try {
            parseTimeStamps();
            return this.util.getMessageImprintDigestCalculator(digestCalculatorProvider);
        } catch (CMSException e10) {
            throw new OperatorCreationException(StubApp.getString2(34937) + e10.getMessage(), e10);
        }
    }

    public AttributeTable getOtherMetaData() {
        return this.util.getOtherMetaData();
    }

    public TimeStampToken[] getTimeStampTokens() throws CMSException {
        parseTimeStamps();
        return this.util.getTimeStampTokens();
    }

    public void initialiseMessageImprintDigestCalculator(DigestCalculator digestCalculator) throws CMSException {
        this.util.initialiseMessageImprintDigestCalculator(digestCalculator);
    }

    public void validate(DigestCalculatorProvider digestCalculatorProvider, byte[] bArr) throws ImprintDigestInvalidException, CMSException {
        parseTimeStamps();
        this.util.validate(digestCalculatorProvider, bArr);
    }

    public CMSTimeStampedDataParser(byte[] bArr) throws CMSException {
        this(new ByteArrayInputStream(bArr));
    }

    public void validate(DigestCalculatorProvider digestCalculatorProvider, byte[] bArr, TimeStampToken timeStampToken) throws ImprintDigestInvalidException, CMSException {
        parseTimeStamps();
        this.util.validate(digestCalculatorProvider, bArr, timeStampToken);
    }
}
