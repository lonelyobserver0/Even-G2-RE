package org.bouncycastle.asn1.ua;

import com.stub.StubApp;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.ASN1Encodable;
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
public class DSTU4145Params extends ASN1Object {
    private static final byte[] DEFAULT_DKE = {-87, -42, -21, 69, -15, 60, 112, -126, ByteCompanionObject.MIN_VALUE, -60, -106, 123, 35, 31, 94, -83, -10, 88, -21, -92, -64, 55, 41, 29, 56, -39, 107, -16, 37, -54, 78, 23, -8, -23, 114, 13, -58, 21, -76, 58, 40, -105, 95, 11, -63, -34, -93, 100, 56, -75, 100, -22, 44, 23, -97, -48, 18, 62, 109, -72, -6, -59, 121, 4};
    private byte[] dke;
    private DSTU4145ECBinary ecbinary;
    private ASN1ObjectIdentifier namedCurve;

    public DSTU4145Params(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.dke = DEFAULT_DKE;
        this.namedCurve = aSN1ObjectIdentifier;
    }

    public static byte[] getDefaultDKE() {
        return Arrays.clone(DEFAULT_DKE);
    }

    public static DSTU4145Params getInstance(Object obj) {
        if (obj instanceof DSTU4145Params) {
            return (DSTU4145Params) obj;
        }
        String string2 = StubApp.getString2(27469);
        if (obj == null) {
            throw new IllegalArgumentException(string2);
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        DSTU4145Params dSTU4145Params = aSN1Sequence.getObjectAt(0) instanceof ASN1ObjectIdentifier ? new DSTU4145Params(ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0))) : new DSTU4145Params(DSTU4145ECBinary.getInstance(aSN1Sequence.getObjectAt(0)));
        if (aSN1Sequence.size() == 2) {
            byte[] D6 = a.D(aSN1Sequence, 1);
            dSTU4145Params.dke = D6;
            if (D6.length != DEFAULT_DKE.length) {
                throw new IllegalArgumentException(string2);
            }
        }
        return dSTU4145Params;
    }

    public byte[] getDKE() {
        return Arrays.clone(this.dke);
    }

    public DSTU4145ECBinary getECBinary() {
        return this.ecbinary;
    }

    public ASN1ObjectIdentifier getNamedCurve() {
        return this.namedCurve;
    }

    public boolean isNamedCurve() {
        return this.namedCurve != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ASN1Encodable aSN1Encodable = this.namedCurve;
        if (aSN1Encodable == null) {
            aSN1Encodable = this.ecbinary;
        }
        aSN1EncodableVector.add(aSN1Encodable);
        if (!Arrays.areEqual(this.dke, DEFAULT_DKE)) {
            aSN1EncodableVector.add(new DEROctetString(this.dke));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DSTU4145Params(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        this.dke = DEFAULT_DKE;
        this.namedCurve = aSN1ObjectIdentifier;
        this.dke = Arrays.clone(bArr);
    }

    public DSTU4145Params(DSTU4145ECBinary dSTU4145ECBinary) {
        this.dke = DEFAULT_DKE;
        this.ecbinary = dSTU4145ECBinary;
    }
}
