package org.bouncycastle.cms;

import E1.a;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.AuthenticatedData;
import org.bouncycastle.asn1.cms.CMSAlgorithmProtection;
import org.bouncycastle.asn1.cms.CMSAttributes;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSEnvelopedHelper;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSAuthenticatedData implements Encodable {
    private ASN1Set authAttrs;
    ContentInfo contentInfo;
    private byte[] mac;
    private AlgorithmIdentifier macAlg;
    private OriginatorInformation originatorInfo;
    RecipientInformationStore recipientInfoStore;
    private ASN1Set unauthAttrs;

    public CMSAuthenticatedData(InputStream inputStream) throws CMSException {
        this(CMSUtils.readContentInfo(inputStream));
    }

    private byte[] encodeObj(ASN1Encodable aSN1Encodable) throws IOException {
        if (aSN1Encodable != null) {
            return aSN1Encodable.toASN1Primitive().getEncoded();
        }
        return null;
    }

    public AttributeTable getAuthAttrs() {
        ASN1Set aSN1Set = this.authAttrs;
        if (aSN1Set == null) {
            return null;
        }
        return new AttributeTable(aSN1Set);
    }

    public byte[] getContentDigest() {
        if (this.authAttrs != null) {
            return ASN1OctetString.getInstance(getAuthAttrs().get(CMSAttributes.messageDigest).getAttrValues().getObjectAt(0)).getOctets();
        }
        return null;
    }

    public ContentInfo getContentInfo() {
        return this.contentInfo;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return this.contentInfo.getEncoded();
    }

    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    public String getMacAlgOID() {
        return this.macAlg.getAlgorithm().getId();
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

    public AttributeTable getUnauthAttrs() {
        ASN1Set aSN1Set = this.unauthAttrs;
        if (aSN1Set == null) {
            return null;
        }
        return new AttributeTable(aSN1Set);
    }

    public ContentInfo toASN1Structure() {
        return this.contentInfo;
    }

    public CMSAuthenticatedData(InputStream inputStream, DigestCalculatorProvider digestCalculatorProvider) throws CMSException {
        this(CMSUtils.readContentInfo(inputStream), digestCalculatorProvider);
    }

    public CMSAuthenticatedData(ContentInfo contentInfo) throws CMSException {
        this(contentInfo, (DigestCalculatorProvider) null);
    }

    public CMSAuthenticatedData(ContentInfo contentInfo, DigestCalculatorProvider digestCalculatorProvider) throws CMSException {
        this.contentInfo = contentInfo;
        AuthenticatedData authenticatedData = AuthenticatedData.getInstance(contentInfo.getContent());
        if (authenticatedData.getOriginatorInfo() != null) {
            this.originatorInfo = new OriginatorInformation(authenticatedData.getOriginatorInfo());
        }
        ASN1Set recipientInfos = authenticatedData.getRecipientInfos();
        this.macAlg = authenticatedData.getMacAlgorithm();
        this.authAttrs = authenticatedData.getAuthAttrs();
        this.mac = authenticatedData.getMac().getOctets();
        this.unauthAttrs = authenticatedData.getUnauthAttrs();
        ContentInfo encapsulatedContentInfo = authenticatedData.getEncapsulatedContentInfo();
        CMSProcessableByteArray cMSProcessableByteArray = new CMSProcessableByteArray(encapsulatedContentInfo.getContentType(), ASN1OctetString.getInstance(encapsulatedContentInfo.getContent()).getOctets());
        ASN1Set aSN1Set = this.authAttrs;
        if (aSN1Set == null) {
            this.recipientInfoStore = CMSEnvelopedHelper.buildRecipientInformationStore(recipientInfos, this.macAlg, new CMSEnvelopedHelper.CMSAuthenticatedSecureReadable(this.macAlg, encapsulatedContentInfo.getContentType(), cMSProcessableByteArray));
            return;
        }
        if (digestCalculatorProvider == null) {
            throw new CMSException(StubApp.getString2(28136));
        }
        ASN1EncodableVector all = new AttributeTable(aSN1Set).getAll(CMSAttributes.cmsAlgorithmProtect);
        if (all.size() > 1) {
            throw new CMSException(StubApp.getString2(28135));
        }
        if (all.size() > 0) {
            Attribute attribute = Attribute.getInstance(all.get(0));
            if (attribute.getAttrValues().size() != 1) {
                throw new CMSException(StubApp.getString2(28134));
            }
            CMSAlgorithmProtection cMSAlgorithmProtection = CMSAlgorithmProtection.getInstance(attribute.getAttributeValues()[0]);
            if (!CMSUtils.isEquivalent(cMSAlgorithmProtection.getDigestAlgorithm(), authenticatedData.getDigestAlgorithm())) {
                throw new CMSException(StubApp.getString2(28133));
            }
            if (!CMSUtils.isEquivalent(cMSAlgorithmProtection.getMacAlgorithm(), this.macAlg)) {
                throw new CMSException(StubApp.getString2(28132));
            }
        }
        try {
            this.recipientInfoStore = CMSEnvelopedHelper.buildRecipientInformationStore(recipientInfos, this.macAlg, new CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable(digestCalculatorProvider.get(authenticatedData.getDigestAlgorithm()), encapsulatedContentInfo.getContentType(), cMSProcessableByteArray), new AuthAttributesProvider() { // from class: org.bouncycastle.cms.CMSAuthenticatedData.1
                @Override // org.bouncycastle.cms.AuthAttributesProvider
                public ASN1Set getAuthAttributes() {
                    return CMSAuthenticatedData.this.authAttrs;
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

    public CMSAuthenticatedData(byte[] bArr) throws CMSException {
        this(CMSUtils.readContentInfo(bArr));
    }

    public CMSAuthenticatedData(byte[] bArr, DigestCalculatorProvider digestCalculatorProvider) throws CMSException {
        this(CMSUtils.readContentInfo(bArr), digestCalculatorProvider);
    }
}
