package org.bouncycastle.asn1.dvcs;

import com.stub.StubApp;
import i2.u;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.PolicyInformation;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DVCSRequestInformation extends ASN1Object {
    private static final int DEFAULT_VERSION = 1;
    private static final int TAG_DATA_LOCATIONS = 3;
    private static final int TAG_DVCS = 2;
    private static final int TAG_EXTENSIONS = 4;
    private static final int TAG_REQUESTER = 0;
    private static final int TAG_REQUEST_POLICY = 1;
    private GeneralNames dataLocations;
    private GeneralNames dvcs;
    private Extensions extensions;
    private BigInteger nonce;
    private PolicyInformation requestPolicy;
    private DVCSTime requestTime;
    private GeneralNames requester;
    private ServiceType service;
    private int version;

    private DVCSRequestInformation(ASN1Sequence aSN1Sequence) {
        int i3;
        this.version = 1;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
            this.version = a.a(aSN1Sequence, 0);
            i3 = 1;
        } else {
            this.version = 1;
            i3 = 0;
        }
        this.service = ServiceType.getInstance(aSN1Sequence.getObjectAt(i3));
        for (int i10 = i3 + 1; i10 < aSN1Sequence.size(); i10++) {
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i10);
            if (objectAt instanceof ASN1Integer) {
                this.nonce = ASN1Integer.getInstance(objectAt).getValue();
            } else if (!(objectAt instanceof ASN1GeneralizedTime) && (objectAt instanceof ASN1TaggedObject)) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objectAt);
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    this.requester = GeneralNames.getInstance(aSN1TaggedObject, false);
                } else if (tagNo == 1) {
                    this.requestPolicy = PolicyInformation.getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, false));
                } else if (tagNo == 2) {
                    this.dvcs = GeneralNames.getInstance(aSN1TaggedObject, false);
                } else if (tagNo == 3) {
                    this.dataLocations = GeneralNames.getInstance(aSN1TaggedObject, false);
                } else {
                    if (tagNo != 4) {
                        throw new IllegalArgumentException(u.p(tagNo, StubApp.getString2(27023)));
                    }
                    this.extensions = Extensions.getInstance(aSN1TaggedObject, false);
                }
            } else {
                this.requestTime = DVCSTime.getInstance(objectAt);
            }
        }
    }

    public static DVCSRequestInformation getInstance(Object obj) {
        if (obj instanceof DVCSRequestInformation) {
            return (DVCSRequestInformation) obj;
        }
        if (obj != null) {
            return new DVCSRequestInformation(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GeneralNames getDVCS() {
        return this.dvcs;
    }

    public GeneralNames getDataLocations() {
        return this.dataLocations;
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public BigInteger getNonce() {
        return this.nonce;
    }

    public PolicyInformation getRequestPolicy() {
        return this.requestPolicy;
    }

    public DVCSTime getRequestTime() {
        return this.requestTime;
    }

    public GeneralNames getRequester() {
        return this.requester;
    }

    public ServiceType getService() {
        return this.service;
    }

    public int getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(9);
        if (this.version != 1) {
            aSN1EncodableVector.add(new ASN1Integer(this.version));
        }
        aSN1EncodableVector.add(this.service);
        if (this.nonce != null) {
            aSN1EncodableVector.add(new ASN1Integer(this.nonce));
        }
        DVCSTime dVCSTime = this.requestTime;
        if (dVCSTime != null) {
            aSN1EncodableVector.add(dVCSTime);
        }
        int[] iArr = {0, 1, 2, 3, 4};
        ASN1Encodable[] aSN1EncodableArr = {this.requester, this.requestPolicy, this.dvcs, this.dataLocations, this.extensions};
        for (int i3 = 0; i3 < 5; i3++) {
            int i10 = iArr[i3];
            ASN1Encodable aSN1Encodable = aSN1EncodableArr[i3];
            if (aSN1Encodable != null) {
                aSN1EncodableVector.add(new DERTaggedObject(false, i10, aSN1Encodable));
            }
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(StubApp.getString2(27024));
        int i3 = this.version;
        String string2 = StubApp.getString2(3692);
        if (i3 != 1) {
            stringBuffer.append(StubApp.getString2(27009) + this.version + string2);
        }
        stringBuffer.append(StubApp.getString2(27025) + this.service + string2);
        if (this.nonce != null) {
            stringBuffer.append(StubApp.getString2(27026) + this.nonce + string2);
        }
        if (this.requestTime != null) {
            stringBuffer.append(StubApp.getString2(27027) + this.requestTime + string2);
        }
        if (this.requester != null) {
            stringBuffer.append(StubApp.getString2(27028) + this.requester + string2);
        }
        if (this.requestPolicy != null) {
            stringBuffer.append(StubApp.getString2(27029) + this.requestPolicy + string2);
        }
        if (this.dvcs != null) {
            stringBuffer.append(StubApp.getString2(27030) + this.dvcs + string2);
        }
        if (this.dataLocations != null) {
            stringBuffer.append(StubApp.getString2(27031) + this.dataLocations + string2);
        }
        if (this.extensions != null) {
            stringBuffer.append(StubApp.getString2(27018) + this.extensions + string2);
        }
        stringBuffer.append(StubApp.getString2(20170));
        return stringBuffer.toString();
    }

    public static DVCSRequestInformation getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }
}
