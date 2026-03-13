package org.bouncycastle.asn1.tsp;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Extensions;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TimeStampReq extends ASN1Object {
    ASN1Boolean certReq;
    Extensions extensions;
    MessageImprint messageImprint;
    ASN1Integer nonce;
    ASN1ObjectIdentifier tsaPolicy;
    ASN1Integer version;

    private TimeStampReq(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        this.version = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.messageImprint = MessageImprint.getInstance(aSN1Sequence.getObjectAt(1));
        for (int i3 = 2; i3 < size; i3++) {
            if (aSN1Sequence.getObjectAt(i3) instanceof ASN1ObjectIdentifier) {
                checkOption(this.tsaPolicy, i3, 2);
                this.tsaPolicy = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(i3));
            } else if (aSN1Sequence.getObjectAt(i3) instanceof ASN1Integer) {
                checkOption(this.nonce, i3, 3);
                this.nonce = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i3));
            } else if (aSN1Sequence.getObjectAt(i3) instanceof ASN1Boolean) {
                checkOption(this.certReq, i3, 4);
                this.certReq = ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(i3));
            } else {
                if (!(aSN1Sequence.getObjectAt(i3) instanceof ASN1TaggedObject)) {
                    throw new IllegalArgumentException(StubApp.getString2(27467));
                }
                checkOption(this.extensions, i3, 5);
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(i3);
                if (aSN1TaggedObject.getTagNo() == 0) {
                    this.extensions = Extensions.getInstance(aSN1TaggedObject, false);
                }
            }
        }
    }

    private void checkOption(Object obj, int i3, int i10) {
        if (obj != null || i3 > i10) {
            throw new IllegalArgumentException(StubApp.getString2(27468));
        }
    }

    public static TimeStampReq getInstance(Object obj) {
        if (obj instanceof TimeStampReq) {
            return (TimeStampReq) obj;
        }
        if (obj != null) {
            return new TimeStampReq(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Boolean getCertReq() {
        ASN1Boolean aSN1Boolean = this.certReq;
        return aSN1Boolean == null ? ASN1Boolean.FALSE : aSN1Boolean;
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public MessageImprint getMessageImprint() {
        return this.messageImprint;
    }

    public ASN1Integer getNonce() {
        return this.nonce;
    }

    public ASN1ObjectIdentifier getReqPolicy() {
        return this.tsaPolicy;
    }

    public ASN1Integer getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.version);
        aSN1EncodableVector.add(this.messageImprint);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.tsaPolicy;
        if (aSN1ObjectIdentifier != null) {
            aSN1EncodableVector.add(aSN1ObjectIdentifier);
        }
        ASN1Integer aSN1Integer = this.nonce;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        ASN1Boolean aSN1Boolean = this.certReq;
        if (aSN1Boolean != null && aSN1Boolean.isTrue()) {
            aSN1EncodableVector.add(this.certReq);
        }
        Extensions extensions = this.extensions;
        if (extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) extensions));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public TimeStampReq(MessageImprint messageImprint, ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Integer aSN1Integer, ASN1Boolean aSN1Boolean, Extensions extensions) {
        this.version = new ASN1Integer(1L);
        this.messageImprint = messageImprint;
        this.tsaPolicy = aSN1ObjectIdentifier;
        this.nonce = aSN1Integer;
        this.certReq = aSN1Boolean;
        this.extensions = extensions;
    }
}
