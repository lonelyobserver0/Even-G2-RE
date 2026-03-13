package org.bouncycastle.tsp;

import com.stub.StubApp;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.cmp.PKIFreeText;
import org.bouncycastle.asn1.cmp.PKIStatusInfo;
import org.bouncycastle.asn1.tsp.TimeStampResp;
import org.bouncycastle.asn1.x509.Extensions;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TimeStampResponseGenerator {
    private Set acceptedAlgorithms;
    private Set acceptedExtensions;
    private Set acceptedPolicies;
    int failInfo;
    int status;
    ASN1EncodableVector statusStrings;
    private TimeStampTokenGenerator tokenGenerator;

    public static class FailInfo extends DERBitString {
        public FailInfo(int i3) {
            super(ASN1BitString.getBytes(i3), ASN1BitString.getPadBits(i3));
        }
    }

    public TimeStampResponseGenerator(TimeStampTokenGenerator timeStampTokenGenerator, Set set) {
        this(timeStampTokenGenerator, set, null, null);
    }

    private void addStatusString(String str) {
        this.statusStrings.add(new DERUTF8String(str));
    }

    private Set convert(Set set) {
        if (set == null) {
            return set;
        }
        HashSet hashSet = new HashSet(set.size());
        for (Object obj : set) {
            if (obj instanceof String) {
                hashSet.add(new ASN1ObjectIdentifier((String) obj));
            } else {
                hashSet.add(obj);
            }
        }
        return hashSet;
    }

    private PKIStatusInfo getPKIStatusInfo() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.status));
        if (this.statusStrings.size() > 0) {
            aSN1EncodableVector.add(PKIFreeText.getInstance(new DERSequence(this.statusStrings)));
        }
        if (this.failInfo != 0) {
            aSN1EncodableVector.add(new FailInfo(this.failInfo));
        }
        return PKIStatusInfo.getInstance(new DERSequence(aSN1EncodableVector));
    }

    private void setFailInfoField(int i3) {
        this.failInfo = i3 | this.failInfo;
    }

    public TimeStampResponse generate(TimeStampRequest timeStampRequest, BigInteger bigInteger, Date date) throws TSPException {
        try {
            return generateGrantedResponse(timeStampRequest, bigInteger, date, StubApp.getString2("34909"));
        } catch (Exception e10) {
            return generateRejectedResponse(e10);
        }
    }

    public TimeStampResponse generateFailResponse(int i3, int i10, String str) throws TSPException {
        this.status = i3;
        this.statusStrings = new ASN1EncodableVector();
        setFailInfoField(i10);
        if (str != null) {
            addStatusString(str);
        }
        try {
            return new TimeStampResponse(new TimeStampResp(getPKIStatusInfo(), null));
        } catch (IOException unused) {
            throw new TSPException(StubApp.getString2(34910));
        }
    }

    public TimeStampResponse generateGrantedResponse(TimeStampRequest timeStampRequest, BigInteger bigInteger, Date date) throws TSPException {
        return generateGrantedResponse(timeStampRequest, bigInteger, date, null);
    }

    public TimeStampResponse generateRejectedResponse(Exception exc) throws TSPException {
        return generateFailResponse(2, exc instanceof TSPValidationException ? ((TSPValidationException) exc).getFailureCode() : 1073741824, exc.getMessage());
    }

    public TimeStampResponseGenerator(TimeStampTokenGenerator timeStampTokenGenerator, Set set, Set set2) {
        this(timeStampTokenGenerator, set, set2, null);
    }

    public TimeStampResponse generateGrantedResponse(TimeStampRequest timeStampRequest, BigInteger bigInteger, Date date, String str) throws TSPException {
        return generateGrantedResponse(timeStampRequest, bigInteger, date, str, null);
    }

    public TimeStampResponseGenerator(TimeStampTokenGenerator timeStampTokenGenerator, Set set, Set set2, Set set3) {
        this.tokenGenerator = timeStampTokenGenerator;
        this.acceptedAlgorithms = convert(set);
        this.acceptedPolicies = convert(set2);
        this.acceptedExtensions = convert(set3);
        this.statusStrings = new ASN1EncodableVector();
    }

    public TimeStampResponse generateGrantedResponse(TimeStampRequest timeStampRequest, BigInteger bigInteger, Date date, String str, Extensions extensions) throws TSPException {
        if (date == null) {
            throw new TSPValidationException(StubApp.getString2(34912), 512);
        }
        timeStampRequest.validate(this.acceptedAlgorithms, this.acceptedPolicies, this.acceptedExtensions);
        this.status = 0;
        this.statusStrings = new ASN1EncodableVector();
        if (str != null) {
            addStatusString(str);
        }
        try {
            try {
                return new TimeStampResponse(new DLSequence(new ASN1Encodable[]{getPKIStatusInfo().toASN1Primitive(), this.tokenGenerator.generate(timeStampRequest, bigInteger, date, extensions).toCMSSignedData().toASN1Structure().toASN1Primitive()}));
            } catch (IOException unused) {
                throw new TSPException(StubApp.getString2(34910));
            }
        } catch (TSPException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new TSPException(StubApp.getString2(34911), e11);
        }
    }
}
