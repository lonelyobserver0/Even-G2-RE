package org.bouncycastle.asn1.tsp;

import com.stub.StubApp;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PartialHashtree extends ASN1Object {
    private final ASN1Sequence values;

    private PartialHashtree(ASN1Sequence aSN1Sequence) {
        for (int i3 = 0; i3 != aSN1Sequence.size(); i3++) {
            if (!(aSN1Sequence.getObjectAt(i3) instanceof DEROctetString)) {
                throw new IllegalArgumentException(StubApp.getString2(27465).concat(aSN1Sequence.getObjectAt(i3).getClass().getName()));
            }
        }
        this.values = aSN1Sequence;
    }

    public static PartialHashtree getInstance(Object obj) {
        if (obj instanceof PartialHashtree) {
            return (PartialHashtree) obj;
        }
        if (obj != null) {
            return new PartialHashtree(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public boolean containsHash(byte[] bArr) {
        Enumeration objects = this.values.getObjects();
        while (objects.hasMoreElements()) {
            if (Arrays.constantTimeAreEqual(bArr, ASN1OctetString.getInstance(objects.nextElement()).getOctets())) {
                return true;
            }
        }
        return false;
    }

    public int getValueCount() {
        return this.values.size();
    }

    public byte[][] getValues() {
        int size = this.values.size();
        byte[][] bArr = new byte[size][];
        for (int i3 = 0; i3 != size; i3++) {
            bArr[i3] = a.B(this.values, i3);
        }
        return bArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.values;
    }

    public PartialHashtree(byte[] bArr) {
        this(new byte[][]{bArr});
    }

    public PartialHashtree(byte[][] bArr) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(bArr.length);
        for (int i3 = 0; i3 != bArr.length; i3++) {
            aSN1EncodableVector.add(new DEROctetString(Arrays.clone(bArr[i3])));
        }
        this.values = new DERSequence(aSN1EncodableVector);
    }
}
