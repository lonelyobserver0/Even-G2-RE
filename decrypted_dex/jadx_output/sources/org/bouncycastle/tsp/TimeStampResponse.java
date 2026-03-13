package org.bouncycastle.tsp;

import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.cmp.PKIFreeText;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.tsp.TimeStampResp;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TimeStampResponse {
    TimeStampResp resp;
    TimeStampToken timeStampToken;

    public TimeStampResponse(InputStream inputStream) throws TSPException, IOException {
        this(readTimeStampResp(inputStream));
    }

    private static TimeStampResp readTimeStampResp(InputStream inputStream) throws IOException, TSPException {
        String string2 = StubApp.getString2(34901);
        try {
            return TimeStampResp.getInstance(new ASN1InputStream(inputStream).readObject());
        } catch (ClassCastException e10) {
            throw new TSPException(string2 + e10, e10);
        } catch (IllegalArgumentException e11) {
            throw new TSPException(string2 + e11, e11);
        }
    }

    public byte[] getEncoded() throws IOException {
        return this.resp.getEncoded();
    }

    public PKIFailureInfo getFailInfo() {
        if (this.resp.getStatus().getFailInfo() != null) {
            return new PKIFailureInfo(this.resp.getStatus().getFailInfo());
        }
        return null;
    }

    public int getStatus() {
        return this.resp.getStatus().getStatus().intValue();
    }

    public String getStatusString() {
        if (this.resp.getStatus().getStatusString() == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        PKIFreeText statusString = this.resp.getStatus().getStatusString();
        for (int i3 = 0; i3 != statusString.size(); i3++) {
            stringBuffer.append(statusString.getStringAtUTF8(i3).getString());
        }
        return stringBuffer.toString();
    }

    public TimeStampToken getTimeStampToken() {
        return this.timeStampToken;
    }

    public void validate(TimeStampRequest timeStampRequest) throws TSPException {
        TimeStampToken timeStampToken = getTimeStampToken();
        if (timeStampToken == null) {
            if (getStatus() == 0 || getStatus() == 1) {
                throw new TSPValidationException(StubApp.getString2(34908));
            }
            return;
        }
        TimeStampTokenInfo timeStampInfo = timeStampToken.getTimeStampInfo();
        if (timeStampRequest.getNonce() != null && !timeStampRequest.getNonce().equals(timeStampInfo.getNonce())) {
            throw new TSPValidationException(StubApp.getString2(34902));
        }
        if (getStatus() != 0 && getStatus() != 1) {
            throw new TSPValidationException(StubApp.getString2(34903));
        }
        if (!Arrays.constantTimeAreEqual(timeStampRequest.getMessageImprintDigest(), timeStampInfo.getMessageImprintDigest())) {
            throw new TSPValidationException(StubApp.getString2(34907));
        }
        if (!timeStampInfo.getMessageImprintAlgOID().equals((ASN1Primitive) timeStampRequest.getMessageImprintAlgOID())) {
            throw new TSPValidationException(StubApp.getString2(34906));
        }
        Attribute attribute = timeStampToken.getSignedAttributes().get(PKCSObjectIdentifiers.id_aa_signingCertificate);
        Attribute attribute2 = timeStampToken.getSignedAttributes().get(PKCSObjectIdentifiers.id_aa_signingCertificateV2);
        if (attribute == null && attribute2 == null) {
            throw new TSPValidationException(StubApp.getString2(34904));
        }
        if (timeStampRequest.getReqPolicy() != null && !timeStampRequest.getReqPolicy().equals((ASN1Primitive) timeStampInfo.getPolicy())) {
            throw new TSPValidationException(StubApp.getString2(34905));
        }
    }

    public TimeStampResponse(DLSequence dLSequence) throws TSPException, IOException {
        String string2 = StubApp.getString2(34901);
        try {
            this.resp = TimeStampResp.getInstance(dLSequence);
            this.timeStampToken = new TimeStampToken(ContentInfo.getInstance(dLSequence.getObjectAt(1)));
        } catch (ClassCastException e10) {
            throw new TSPException(string2 + e10, e10);
        } catch (IllegalArgumentException e11) {
            throw new TSPException(string2 + e11, e11);
        }
    }

    public byte[] getEncoded(String str) throws IOException {
        return (StubApp.getString2(21754).equals(str) ? this.timeStampToken == null ? new DLSequence(this.resp.getStatus()) : new DLSequence(new ASN1Encodable[]{this.resp.getStatus(), this.timeStampToken.toCMSSignedData().toASN1Structure()}) : this.resp).getEncoded(str);
    }

    public TimeStampResponse(TimeStampResp timeStampResp) throws TSPException, IOException {
        this.resp = timeStampResp;
        if (timeStampResp.getTimeStampToken() != null) {
            this.timeStampToken = new TimeStampToken(timeStampResp.getTimeStampToken());
        }
    }

    public TimeStampResponse(byte[] bArr) throws TSPException, IOException {
        this(new ByteArrayInputStream(bArr));
    }
}
