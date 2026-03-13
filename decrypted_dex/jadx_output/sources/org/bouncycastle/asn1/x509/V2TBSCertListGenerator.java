package org.bouncycastle.asn1.x509;

import com.mapbox.common.b;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class V2TBSCertListGenerator {
    private static final ASN1Sequence[] reasons = {createReasonExtension(0), createReasonExtension(1), createReasonExtension(2), createReasonExtension(3), createReasonExtension(4), createReasonExtension(5), createReasonExtension(6), createReasonExtension(7), createReasonExtension(8), createReasonExtension(9), createReasonExtension(10)};
    private X500Name issuer;
    private AlgorithmIdentifier signature;
    private Time thisUpdate;
    private ASN1Integer version = new ASN1Integer(1);
    private Time nextUpdate = null;
    private Extensions extensions = null;
    private ASN1EncodableVector crlentries = new ASN1EncodableVector();

    private static ASN1Sequence createInvalidityDateExtension(ASN1GeneralizedTime aSN1GeneralizedTime) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        try {
            aSN1EncodableVector.add(Extension.invalidityDate);
            aSN1EncodableVector.add(new DEROctetString(aSN1GeneralizedTime.getEncoded()));
            return new DERSequence(aSN1EncodableVector);
        } catch (IOException e10) {
            throw new IllegalArgumentException(b.h(StubApp.getString2(27852), e10));
        }
    }

    private static ASN1Sequence createReasonExtension(int i3) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        CRLReason lookup = CRLReason.lookup(i3);
        try {
            aSN1EncodableVector.add(Extension.reasonCode);
            aSN1EncodableVector.add(new DEROctetString(lookup.getEncoded()));
            return new DERSequence(aSN1EncodableVector);
        } catch (IOException e10) {
            throw new IllegalArgumentException(b.h(StubApp.getString2(27852), e10));
        }
    }

    private void internalAddCRLEntry(ASN1Integer aSN1Integer, Time time, ASN1Sequence aSN1Sequence) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(aSN1Integer);
        aSN1EncodableVector.add(time);
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        addCRLEntry(new DERSequence(aSN1EncodableVector));
    }

    public void addCRLEntry(ASN1Integer aSN1Integer, ASN1UTCTime aSN1UTCTime, int i3) {
        addCRLEntry(aSN1Integer, new Time(aSN1UTCTime), i3);
    }

    public TBSCertList generateTBSCertList() {
        if (this.signature == null || this.issuer == null || this.thisUpdate == null) {
            throw new IllegalStateException(StubApp.getString2(27854));
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(7);
        aSN1EncodableVector.add(this.version);
        aSN1EncodableVector.add(this.signature);
        aSN1EncodableVector.add(this.issuer);
        aSN1EncodableVector.add(this.thisUpdate);
        Time time = this.nextUpdate;
        if (time != null) {
            aSN1EncodableVector.add(time);
        }
        if (this.crlentries.size() != 0) {
            aSN1EncodableVector.add(new DERSequence(this.crlentries));
        }
        Extensions extensions = this.extensions;
        if (extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, extensions));
        }
        return new TBSCertList(new DERSequence(aSN1EncodableVector));
    }

    public void setExtensions(Extensions extensions) {
        this.extensions = extensions;
    }

    public void setIssuer(X500Name x500Name) {
        this.issuer = x500Name;
    }

    public void setNextUpdate(ASN1UTCTime aSN1UTCTime) {
        this.nextUpdate = new Time(aSN1UTCTime);
    }

    public void setSignature(AlgorithmIdentifier algorithmIdentifier) {
        this.signature = algorithmIdentifier;
    }

    public void setThisUpdate(ASN1UTCTime aSN1UTCTime) {
        this.thisUpdate = new Time(aSN1UTCTime);
    }

    public void addCRLEntry(ASN1Integer aSN1Integer, Time time, int i3) {
        addCRLEntry(aSN1Integer, time, i3, null);
    }

    public void setExtensions(X509Extensions x509Extensions) {
        setExtensions(Extensions.getInstance(x509Extensions));
    }

    public void setIssuer(X509Name x509Name) {
        this.issuer = X500Name.getInstance(x509Name.toASN1Primitive());
    }

    public void setNextUpdate(Time time) {
        this.nextUpdate = time;
    }

    public void setThisUpdate(Time time) {
        this.thisUpdate = time;
    }

    public void addCRLEntry(ASN1Integer aSN1Integer, Time time, int i3, ASN1GeneralizedTime aSN1GeneralizedTime) {
        if (i3 == 0) {
            if (aSN1GeneralizedTime != null) {
                internalAddCRLEntry(aSN1Integer, time, new DERSequence(createInvalidityDateExtension(aSN1GeneralizedTime)));
                return;
            } else {
                addCRLEntry(aSN1Integer, time, (Extensions) null);
                return;
            }
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ASN1Sequence[] aSN1SequenceArr = reasons;
        if (i3 >= aSN1SequenceArr.length) {
            aSN1EncodableVector.add(createReasonExtension(i3));
        } else {
            if (i3 < 0) {
                throw new IllegalArgumentException(u.p(i3, StubApp.getString2(27853)));
            }
            aSN1EncodableVector.add(aSN1SequenceArr[i3]);
        }
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(createInvalidityDateExtension(aSN1GeneralizedTime));
        }
        internalAddCRLEntry(aSN1Integer, time, new DERSequence(aSN1EncodableVector));
    }

    public void addCRLEntry(ASN1Integer aSN1Integer, Time time, Extensions extensions) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(aSN1Integer);
        aSN1EncodableVector.add(time);
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        addCRLEntry(new DERSequence(aSN1EncodableVector));
    }

    public void addCRLEntry(ASN1Sequence aSN1Sequence) {
        this.crlentries.add(aSN1Sequence);
    }
}
