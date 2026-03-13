package org.bouncycastle.cms;

import E1.a;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.AuthenticatedDataParser;
import org.bouncycastle.asn1.cms.CMSAttributes;
import org.bouncycastle.asn1.cms.ContentInfoParser;
import org.bouncycastle.asn1.cms.OriginatorInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSEnvelopedHelper;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSAuthenticatedDataParser extends CMSContentInfoParser {
    private boolean authAttrNotRead;
    private ASN1Set authAttrSet;
    private AttributeTable authAttrs;
    AuthenticatedDataParser authData;
    private byte[] mac;
    private AlgorithmIdentifier macAlg;
    private OriginatorInformation originatorInfo;
    RecipientInformationStore recipientInfoStore;
    private boolean unauthAttrNotRead;
    private AttributeTable unauthAttrs;

    public CMSAuthenticatedDataParser(InputStream inputStream) throws CMSException, IOException {
        this(inputStream, (DigestCalculatorProvider) null);
    }

    private byte[] encodeObj(ASN1Encodable aSN1Encodable) throws IOException {
        if (aSN1Encodable != null) {
            return aSN1Encodable.toASN1Primitive().getEncoded();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ASN1Set getAuthAttrSet() throws IOException {
        if (this.authAttrs == null && this.authAttrNotRead) {
            ASN1SetParser authAttrs = this.authData.getAuthAttrs();
            if (authAttrs != null) {
                this.authAttrSet = (ASN1Set) authAttrs.toASN1Primitive();
            }
            this.authAttrNotRead = false;
        }
        return this.authAttrSet;
    }

    public AttributeTable getAuthAttrs() throws IOException {
        ASN1Set authAttrSet;
        if (this.authAttrs == null && this.authAttrNotRead && (authAttrSet = getAuthAttrSet()) != null) {
            this.authAttrs = new AttributeTable(authAttrSet);
        }
        return this.authAttrs;
    }

    public byte[] getContentDigest() {
        AttributeTable attributeTable = this.authAttrs;
        if (attributeTable != null) {
            return ASN1OctetString.getInstance(attributeTable.get(CMSAttributes.messageDigest).getAttrValues().getObjectAt(0)).getOctets();
        }
        return null;
    }

    public byte[] getMac() throws IOException {
        if (this.mac == null) {
            getAuthAttrs();
            this.mac = this.authData.getMac().getOctets();
        }
        return Arrays.clone(this.mac);
    }

    public String getMacAlgOID() {
        return this.macAlg.getAlgorithm().toString();
    }

    public byte[] getMacAlgParams() {
        try {
            return encodeObj(this.macAlg.getParameters());
        } catch (Exception e10) {
            throw new RuntimeException(a.i(StubApp.getString2(28137), e10));
        }
    }

    public AlgorithmIdentifier getMacAlgorithm() {
        return this.macAlg;
    }

    public OriginatorInformation getOriginatorInfo() {
        return this.originatorInfo;
    }

    public RecipientInformationStore getRecipientInfos() {
        return this.recipientInfoStore;
    }

    public AttributeTable getUnauthAttrs() throws IOException {
        if (this.unauthAttrs == null && this.unauthAttrNotRead) {
            ASN1SetParser unauthAttrs = this.authData.getUnauthAttrs();
            this.unauthAttrNotRead = false;
            if (unauthAttrs != null) {
                ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                while (true) {
                    ASN1Encodable readObject = unauthAttrs.readObject();
                    if (readObject == null) {
                        break;
                    }
                    aSN1EncodableVector.add(((ASN1SequenceParser) readObject).toASN1Primitive());
                }
                this.unauthAttrs = new AttributeTable(new DERSet(aSN1EncodableVector));
            }
        }
        return this.unauthAttrs;
    }

    public CMSAuthenticatedDataParser(InputStream inputStream, DigestCalculatorProvider digestCalculatorProvider) throws CMSException, IOException {
        super(inputStream);
        this.authAttrNotRead = true;
        AuthenticatedDataParser authenticatedDataParser = new AuthenticatedDataParser((ASN1SequenceParser) this._contentInfo.getContent(16));
        this.authData = authenticatedDataParser;
        OriginatorInfo originatorInfo = authenticatedDataParser.getOriginatorInfo();
        if (originatorInfo != null) {
            this.originatorInfo = new OriginatorInformation(originatorInfo);
        }
        ASN1Set aSN1Set = ASN1Set.getInstance(this.authData.getRecipientInfos().toASN1Primitive());
        this.macAlg = this.authData.getMacAlgorithm();
        AlgorithmIdentifier digestAlgorithm = this.authData.getDigestAlgorithm();
        if (digestAlgorithm == null) {
            ContentInfoParser encapsulatedContentInfo = this.authData.getEncapsulatedContentInfo();
            this.recipientInfoStore = CMSEnvelopedHelper.buildRecipientInformationStore(aSN1Set, this.macAlg, new CMSEnvelopedHelper.CMSAuthenticatedSecureReadable(this.macAlg, encapsulatedContentInfo.getContentType(), new CMSProcessableInputStream(((ASN1OctetStringParser) encapsulatedContentInfo.getContent(4)).getOctetStream())));
            return;
        }
        if (digestCalculatorProvider == null) {
            throw new CMSException(StubApp.getString2(28136));
        }
        ContentInfoParser encapsulatedContentInfo2 = this.authData.getEncapsulatedContentInfo();
        try {
            this.recipientInfoStore = CMSEnvelopedHelper.buildRecipientInformationStore(aSN1Set, this.macAlg, new CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable(digestCalculatorProvider.get(digestAlgorithm), encapsulatedContentInfo2.getContentType(), new CMSProcessableInputStream(((ASN1OctetStringParser) encapsulatedContentInfo2.getContent(4)).getOctetStream())), new AuthAttributesProvider() { // from class: org.bouncycastle.cms.CMSAuthenticatedDataParser.1
                @Override // org.bouncycastle.cms.AuthAttributesProvider
                public ASN1Set getAuthAttributes() {
                    try {
                        return CMSAuthenticatedDataParser.this.getAuthAttrSet();
                    } catch (IOException unused) {
                        throw new IllegalStateException(StubApp.getString2(28140));
                    }
                }

                @Override // org.bouncycastle.cms.AuthAttributesProvider
                public boolean isAead() {
                    return false;
                }
            });
        } catch (OperatorCreationException e10) {
            throw new CMSException(StubApp.getString2(28101) + e10.getMessage(), e10);
        }
    }

    public CMSAuthenticatedDataParser(byte[] bArr) throws CMSException, IOException {
        this(new ByteArrayInputStream(bArr));
    }

    public CMSAuthenticatedDataParser(byte[] bArr, DigestCalculatorProvider digestCalculatorProvider) throws CMSException, IOException {
        this(new ByteArrayInputStream(bArr), digestCalculatorProvider);
    }
}
