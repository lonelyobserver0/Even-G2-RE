package org.bouncycastle.asn1.cryptopro;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Gost2814789KeyWrapParameters extends ASN1Object {
    private final ASN1ObjectIdentifier encryptionParamSet;
    private final byte[] ukm;

    public Gost2814789KeyWrapParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this(aSN1ObjectIdentifier, null);
    }

    public static Gost2814789KeyWrapParameters getInstance(Object obj) {
        if (obj instanceof Gost2814789KeyWrapParameters) {
            return (Gost2814789KeyWrapParameters) obj;
        }
        if (obj != null) {
            return new Gost2814789KeyWrapParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1ObjectIdentifier getEncryptionParamSet() {
        return this.encryptionParamSet;
    }

    public byte[] getUkm() {
        return Arrays.clone(this.ukm);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.encryptionParamSet);
        if (this.ukm != null) {
            aSN1EncodableVector.add(new DEROctetString(this.ukm));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public Gost2814789KeyWrapParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        this.encryptionParamSet = aSN1ObjectIdentifier;
        this.ukm = Arrays.clone(bArr);
    }

    private Gost2814789KeyWrapParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.encryptionParamSet = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.ukm = a.D(aSN1Sequence, 1);
        } else {
            if (aSN1Sequence.size() != 1) {
                throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(27005))));
            }
            this.encryptionParamSet = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.ukm = null;
        }
    }
}
