package org.bouncycastle.cert.cmp;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmp.CMPCertificate;
import org.bouncycastle.asn1.cmp.InfoTypeAndValue;
import org.bouncycastle.asn1.cmp.PKIBody;
import org.bouncycastle.asn1.cmp.PKIFreeText;
import org.bouncycastle.asn1.cmp.PKIHeader;
import org.bouncycastle.asn1.cmp.PKIHeaderBuilder;
import org.bouncycastle.asn1.cmp.PKIMessage;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.MacCalculator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ProtectedPKIMessageBuilder {
    private PKIBody body;
    private List extraCerts;
    private List generalInfos;
    private PKIHeaderBuilder hdrBuilder;

    public ProtectedPKIMessageBuilder(int i3, GeneralName generalName, GeneralName generalName2) {
        this.generalInfos = new ArrayList();
        this.extraCerts = new ArrayList();
        this.hdrBuilder = new PKIHeaderBuilder(i3, generalName, generalName2);
    }

    private byte[] calculateMac(MacCalculator macCalculator, PKIHeader pKIHeader, PKIBody pKIBody) throws IOException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(pKIHeader);
        aSN1EncodableVector.add(pKIBody);
        OutputStream outputStream = macCalculator.getOutputStream();
        outputStream.write(new DERSequence(aSN1EncodableVector).getEncoded(StubApp.getString2(26791)));
        outputStream.close();
        return macCalculator.getMac();
    }

    private byte[] calculateSignature(ContentSigner contentSigner, PKIHeader pKIHeader, PKIBody pKIBody) throws IOException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(pKIHeader);
        aSN1EncodableVector.add(pKIBody);
        OutputStream outputStream = contentSigner.getOutputStream();
        outputStream.write(new DERSequence(aSN1EncodableVector).getEncoded(StubApp.getString2(26791)));
        outputStream.close();
        return contentSigner.getSignature();
    }

    private void finaliseHeader(AlgorithmIdentifier algorithmIdentifier) {
        this.hdrBuilder.setProtectionAlg(algorithmIdentifier);
        if (this.generalInfos.isEmpty()) {
            return;
        }
        this.hdrBuilder.setGeneralInfo((InfoTypeAndValue[]) this.generalInfos.toArray(new InfoTypeAndValue[this.generalInfos.size()]));
    }

    private ProtectedPKIMessage finaliseMessage(PKIHeader pKIHeader, DERBitString dERBitString) {
        if (this.extraCerts.isEmpty()) {
            return new ProtectedPKIMessage(new PKIMessage(pKIHeader, this.body, dERBitString));
        }
        int size = this.extraCerts.size();
        CMPCertificate[] cMPCertificateArr = new CMPCertificate[size];
        for (int i3 = 0; i3 != size; i3++) {
            cMPCertificateArr[i3] = new CMPCertificate(((X509CertificateHolder) this.extraCerts.get(i3)).toASN1Structure());
        }
        return new ProtectedPKIMessage(new PKIMessage(pKIHeader, this.body, dERBitString, cMPCertificateArr));
    }

    public ProtectedPKIMessageBuilder addCMPCertificate(X509CertificateHolder x509CertificateHolder) {
        this.extraCerts.add(x509CertificateHolder);
        return this;
    }

    public ProtectedPKIMessageBuilder addGeneralInfo(InfoTypeAndValue infoTypeAndValue) {
        this.generalInfos.add(infoTypeAndValue);
        return this;
    }

    public ProtectedPKIMessage build(ContentSigner contentSigner) throws CMPException {
        if (this.body == null) {
            throw new IllegalStateException(StubApp.getString2(28026));
        }
        finaliseHeader(contentSigner.getAlgorithmIdentifier());
        PKIHeader build = this.hdrBuilder.build();
        try {
            return finaliseMessage(build, new DERBitString(calculateSignature(contentSigner, build, this.body)));
        } catch (IOException e10) {
            throw new CMPException(u.q(e10, new StringBuilder(StubApp.getString2(28025))), e10);
        }
    }

    public ProtectedPKIMessageBuilder setBody(PKIBody pKIBody) {
        this.body = pKIBody;
        return this;
    }

    public ProtectedPKIMessageBuilder setFreeText(PKIFreeText pKIFreeText) {
        this.hdrBuilder.setFreeText(pKIFreeText);
        return this;
    }

    public ProtectedPKIMessageBuilder setMessageTime(Date date) {
        this.hdrBuilder.setMessageTime(new ASN1GeneralizedTime(date));
        return this;
    }

    public ProtectedPKIMessageBuilder setRecipKID(byte[] bArr) {
        this.hdrBuilder.setRecipKID(bArr);
        return this;
    }

    public ProtectedPKIMessageBuilder setRecipNonce(byte[] bArr) {
        this.hdrBuilder.setRecipNonce(bArr);
        return this;
    }

    public ProtectedPKIMessageBuilder setSenderKID(byte[] bArr) {
        this.hdrBuilder.setSenderKID(bArr);
        return this;
    }

    public ProtectedPKIMessageBuilder setSenderNonce(byte[] bArr) {
        this.hdrBuilder.setSenderNonce(bArr);
        return this;
    }

    public ProtectedPKIMessageBuilder setTransactionID(byte[] bArr) {
        this.hdrBuilder.setTransactionID(bArr);
        return this;
    }

    public ProtectedPKIMessageBuilder(GeneralName generalName, GeneralName generalName2) {
        this(2, generalName, generalName2);
    }

    public ProtectedPKIMessage build(MacCalculator macCalculator) throws CMPException {
        if (this.body == null) {
            throw new IllegalStateException(StubApp.getString2(28026));
        }
        finaliseHeader(macCalculator.getAlgorithmIdentifier());
        PKIHeader build = this.hdrBuilder.build();
        try {
            return finaliseMessage(build, new DERBitString(calculateMac(macCalculator, build, this.body)));
        } catch (IOException e10) {
            throw new CMPException(u.q(e10, new StringBuilder(StubApp.getString2(28027))), e10);
        }
    }
}
