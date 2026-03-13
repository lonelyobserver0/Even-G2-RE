package org.bouncycastle.cms;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.SignerIdentifier;
import org.bouncycastle.asn1.cms.SignerInfo;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.TeeOutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SignerInfoGenerator {
    private byte[] calculatedDigest;
    private X509CertificateHolder certHolder;
    private final AlgorithmIdentifier digestAlgorithm;
    private final DigestCalculator digester;
    private final CMSAttributeTableGenerator sAttrGen;
    private final CMSSignatureEncryptionAlgorithmFinder sigEncAlgFinder;
    private final ContentSigner signer;
    private final SignerIdentifier signerIdentifier;
    private final CMSAttributeTableGenerator unsAttrGen;

    public SignerInfoGenerator(SignerIdentifier signerIdentifier, ContentSigner contentSigner, AlgorithmIdentifier algorithmIdentifier, CMSSignatureEncryptionAlgorithmFinder cMSSignatureEncryptionAlgorithmFinder) {
        this.calculatedDigest = null;
        this.signerIdentifier = signerIdentifier;
        this.signer = contentSigner;
        this.digestAlgorithm = algorithmIdentifier;
        this.digester = null;
        this.sAttrGen = null;
        this.unsAttrGen = null;
        this.sigEncAlgFinder = cMSSignatureEncryptionAlgorithmFinder;
    }

    private ASN1Set getAttributeSet(AttributeTable attributeTable) {
        if (attributeTable != null) {
            return new DERSet(attributeTable.toASN1EncodableVector());
        }
        return null;
    }

    private Map getBaseParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        HashMap hashMap = new HashMap();
        if (aSN1ObjectIdentifier != null) {
            hashMap.put(StubApp.getString2(677), aSN1ObjectIdentifier);
        }
        hashMap.put(StubApp.getString2(28142), algorithmIdentifier);
        hashMap.put(StubApp.getString2(28204), algorithmIdentifier2);
        hashMap.put(StubApp.getString2(13292), Arrays.clone(bArr));
        return hashMap;
    }

    public SignerInfo generate(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        AlgorithmIdentifier algorithmIdentifier;
        ASN1Set aSN1Set;
        try {
            AlgorithmIdentifier findEncryptionAlgorithm = this.sigEncAlgFinder.findEncryptionAlgorithm(this.signer.getAlgorithmIdentifier());
            ASN1Set aSN1Set2 = null;
            if (this.sAttrGen != null) {
                algorithmIdentifier = this.digester.getAlgorithmIdentifier();
                this.calculatedDigest = this.digester.getDigest();
                ASN1Set attributeSet = getAttributeSet(this.sAttrGen.getAttributes(Collections.unmodifiableMap(getBaseParameters(aSN1ObjectIdentifier, this.digester.getAlgorithmIdentifier(), findEncryptionAlgorithm, this.calculatedDigest))));
                OutputStream outputStream = this.signer.getOutputStream();
                outputStream.write(attributeSet.getEncoded(StubApp.getString2("26791")));
                outputStream.close();
                aSN1Set = attributeSet;
            } else {
                algorithmIdentifier = this.digestAlgorithm;
                DigestCalculator digestCalculator = this.digester;
                if (digestCalculator != null) {
                    this.calculatedDigest = digestCalculator.getDigest();
                } else {
                    this.calculatedDigest = null;
                }
                aSN1Set = null;
            }
            byte[] signature = this.signer.getSignature();
            if (this.unsAttrGen != null) {
                Map baseParameters = getBaseParameters(aSN1ObjectIdentifier, algorithmIdentifier, findEncryptionAlgorithm, this.calculatedDigest);
                baseParameters.put(StubApp.getString2("28215"), Arrays.clone(signature));
                aSN1Set2 = getAttributeSet(this.unsAttrGen.getAttributes(Collections.unmodifiableMap(baseParameters)));
            }
            ASN1Set aSN1Set3 = aSN1Set2;
            if (this.sAttrGen == null && EdECObjectIdentifiers.id_Ed448.equals((ASN1Primitive) findEncryptionAlgorithm.getAlgorithm())) {
                algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_shake256);
            }
            return new SignerInfo(this.signerIdentifier, algorithmIdentifier, aSN1Set, findEncryptionAlgorithm, new DEROctetString(signature), aSN1Set3);
        } catch (IOException e10) {
            throw new CMSException(StubApp.getString2(28216), e10);
        }
    }

    public X509CertificateHolder getAssociatedCertificate() {
        return this.certHolder;
    }

    public byte[] getCalculatedDigest() {
        byte[] bArr = this.calculatedDigest;
        if (bArr != null) {
            return Arrays.clone(bArr);
        }
        return null;
    }

    public OutputStream getCalculatingOutputStream() {
        DigestCalculator digestCalculator = this.digester;
        return digestCalculator != null ? this.sAttrGen == null ? new TeeOutputStream(this.digester.getOutputStream(), this.signer.getOutputStream()) : digestCalculator.getOutputStream() : this.signer.getOutputStream();
    }

    public AlgorithmIdentifier getDigestAlgorithm() {
        return this.digestAlgorithm;
    }

    public int getGeneratedVersion() {
        return this.signerIdentifier.isTagged() ? 3 : 1;
    }

    public SignerIdentifier getSID() {
        return this.signerIdentifier;
    }

    public CMSAttributeTableGenerator getSignedAttributeTableGenerator() {
        return this.sAttrGen;
    }

    public CMSAttributeTableGenerator getUnsignedAttributeTableGenerator() {
        return this.unsAttrGen;
    }

    public boolean hasAssociatedCertificate() {
        return this.certHolder != null;
    }

    public void setAssociatedCertificate(X509CertificateHolder x509CertificateHolder) {
        this.certHolder = x509CertificateHolder;
    }

    public SignerInfoGenerator(SignerIdentifier signerIdentifier, ContentSigner contentSigner, DigestCalculator digestCalculator, CMSSignatureEncryptionAlgorithmFinder cMSSignatureEncryptionAlgorithmFinder, CMSAttributeTableGenerator cMSAttributeTableGenerator, CMSAttributeTableGenerator cMSAttributeTableGenerator2) {
        this.calculatedDigest = null;
        this.signerIdentifier = signerIdentifier;
        this.signer = contentSigner;
        this.digestAlgorithm = digestCalculator.getAlgorithmIdentifier();
        this.digester = digestCalculator;
        this.sAttrGen = cMSAttributeTableGenerator;
        this.unsAttrGen = cMSAttributeTableGenerator2;
        this.sigEncAlgFinder = cMSSignatureEncryptionAlgorithmFinder;
    }

    public SignerInfoGenerator(SignerInfoGenerator signerInfoGenerator, CMSAttributeTableGenerator cMSAttributeTableGenerator, CMSAttributeTableGenerator cMSAttributeTableGenerator2) {
        this.calculatedDigest = null;
        this.signerIdentifier = signerInfoGenerator.signerIdentifier;
        this.signer = signerInfoGenerator.signer;
        this.digestAlgorithm = signerInfoGenerator.digestAlgorithm;
        this.digester = signerInfoGenerator.digester;
        this.sigEncAlgFinder = signerInfoGenerator.sigEncAlgFinder;
        this.sAttrGen = cMSAttributeTableGenerator;
        this.unsAttrGen = cMSAttributeTableGenerator2;
    }
}
