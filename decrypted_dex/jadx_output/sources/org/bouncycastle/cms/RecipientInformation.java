package org.bouncycastle.cms;

import E1.a;
import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSEnvelopedHelper;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class RecipientInformation {
    private AuthAttributesProvider additionalData;
    protected AlgorithmIdentifier keyEncAlg;
    protected AlgorithmIdentifier messageAlgorithm;
    private RecipientOperator operator;
    private byte[] resultMac;
    protected RecipientId rid;
    protected CMSSecureReadable secureReadable;

    public RecipientInformation(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, CMSSecureReadable cMSSecureReadable, AuthAttributesProvider authAttributesProvider) {
        this.keyEncAlg = algorithmIdentifier;
        this.messageAlgorithm = algorithmIdentifier2;
        this.secureReadable = cMSSecureReadable;
        this.additionalData = authAttributesProvider;
    }

    private byte[] encodeObj(ASN1Encodable aSN1Encodable) throws IOException {
        if (aSN1Encodable != null) {
            return aSN1Encodable.toASN1Primitive().getEncoded();
        }
        return null;
    }

    public byte[] getContent(Recipient recipient) throws CMSException {
        try {
            return CMSUtils.streamToByteArray(getContentStream(recipient).getContentStream());
        } catch (IOException e10) {
            throw new CMSException(u.q(e10, new StringBuilder(StubApp.getString2(28154))), e10);
        }
    }

    public byte[] getContentDigest() {
        CMSSecureReadable cMSSecureReadable = this.secureReadable;
        if (cMSSecureReadable instanceof CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable) {
            return ((CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable) cMSSecureReadable).getDigest();
        }
        return null;
    }

    public CMSTypedStream getContentStream(Recipient recipient) throws CMSException, IOException {
        this.operator = getRecipientOperator(recipient);
        AuthAttributesProvider authAttributesProvider = this.additionalData;
        if (authAttributesProvider == null) {
            return new CMSTypedStream(this.secureReadable.getContentType(), this.operator.getInputStream(this.secureReadable.getInputStream()));
        }
        if (!authAttributesProvider.isAead()) {
            return new CMSTypedStream(this.secureReadable.getContentType(), this.secureReadable.getInputStream());
        }
        this.operator.getAADStream().write(this.additionalData.getAuthAttributes().getEncoded(StubApp.getString2(26791)));
        return new CMSTypedStream(this.secureReadable.getContentType(), this.operator.getInputStream(this.secureReadable.getInputStream()));
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.secureReadable.getContentType();
    }

    public String getKeyEncryptionAlgOID() {
        return this.keyEncAlg.getAlgorithm().getId();
    }

    public byte[] getKeyEncryptionAlgParams() {
        try {
            return encodeObj(this.keyEncAlg.getParameters());
        } catch (Exception e10) {
            throw new RuntimeException(a.i(StubApp.getString2(28137), e10));
        }
    }

    public AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return this.keyEncAlg;
    }

    public byte[] getMac() {
        if (this.resultMac == null && this.operator.isMacBased()) {
            if (this.additionalData != null) {
                try {
                    Streams.drain(this.operator.getInputStream(new ByteArrayInputStream(this.additionalData.getAuthAttributes().getEncoded(StubApp.getString2("26791")))));
                } catch (IOException e10) {
                    throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(28214))));
                }
            }
            this.resultMac = this.operator.getMac();
        }
        return this.resultMac;
    }

    public RecipientId getRID() {
        return this.rid;
    }

    public abstract RecipientOperator getRecipientOperator(Recipient recipient) throws CMSException, IOException;
}
