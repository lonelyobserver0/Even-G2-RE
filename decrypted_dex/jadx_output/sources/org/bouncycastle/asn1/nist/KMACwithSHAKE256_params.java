package org.bouncycastle.asn1.nist;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KMACwithSHAKE256_params extends ASN1Object {
    private static final int DEF_LENGTH = 512;
    private static final byte[] EMPTY_STRING = new byte[0];
    private final byte[] customizationString;
    private final int outputLength;

    public KMACwithSHAKE256_params(int i3) {
        this.outputLength = i3;
        this.customizationString = EMPTY_STRING;
    }

    public static KMACwithSHAKE256_params getInstance(Object obj) {
        if (obj instanceof KMACwithSHAKE256_params) {
            return (KMACwithSHAKE256_params) obj;
        }
        if (obj != null) {
            return new KMACwithSHAKE256_params(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getCustomizationString() {
        return Arrays.clone(this.customizationString);
    }

    public int getOutputLength() {
        return this.outputLength;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.outputLength != 512) {
            aSN1EncodableVector.add(new ASN1Integer(this.outputLength));
        }
        if (this.customizationString.length != 0) {
            aSN1EncodableVector.add(new DEROctetString(getCustomizationString()));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public KMACwithSHAKE256_params(int i3, byte[] bArr) {
        this.outputLength = i3;
        this.customizationString = Arrays.clone(bArr);
    }

    private KMACwithSHAKE256_params(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() > 2) {
            throw new IllegalArgumentException(StubApp.getString2(27148));
        }
        if (aSN1Sequence.size() == 2) {
            this.outputLength = a.a(aSN1Sequence, 0);
            this.customizationString = a.B(aSN1Sequence, 1);
        } else if (aSN1Sequence.size() != 1) {
            this.outputLength = 512;
            this.customizationString = EMPTY_STRING;
        } else if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
            this.outputLength = a.a(aSN1Sequence, 0);
            this.customizationString = EMPTY_STRING;
        } else {
            this.outputLength = 512;
            this.customizationString = a.B(aSN1Sequence, 0);
        }
    }
}
