package org.bouncycastle.pqc.asn1;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SABERPrivateKey extends ASN1Object {
    private SABERPublicKey PublicKey;
    private byte[] hpk;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f19350s;
    private int version;

    /* renamed from: z, reason: collision with root package name */
    private byte[] f19351z;

    public SABERPrivateKey(int i3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.version = i3;
        if (i3 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(33945));
        }
        this.f19351z = bArr;
        this.f19350s = bArr2;
        this.hpk = bArr3;
    }

    public static SABERPrivateKey getInstance(Object obj) {
        if (obj instanceof SABERPrivateKey) {
            return (SABERPrivateKey) obj;
        }
        if (obj != null) {
            return new SABERPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getHpk() {
        return this.hpk;
    }

    public SABERPublicKey getPublicKey() {
        return this.PublicKey;
    }

    public byte[] getS() {
        return this.f19350s;
    }

    public int getVersion() {
        return this.version;
    }

    public byte[] getZ() {
        return this.f19351z;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.f19351z));
        aSN1EncodableVector.add(new DEROctetString(this.f19350s));
        aSN1EncodableVector.add(new DEROctetString(this.hpk));
        return new DERSequence(aSN1EncodableVector);
    }

    public SABERPrivateKey(int i3, byte[] bArr, byte[] bArr2, byte[] bArr3, SABERPublicKey sABERPublicKey) {
        this.version = i3;
        if (i3 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(33945));
        }
        this.f19351z = bArr;
        this.f19350s = bArr2;
        this.hpk = bArr3;
        this.PublicKey = sABERPublicKey;
    }

    private SABERPrivateKey(ASN1Sequence aSN1Sequence) {
        int intValueExact = BigIntegers.intValueExact(ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue());
        this.version = intValueExact;
        if (intValueExact != 0) {
            throw new IllegalArgumentException(StubApp.getString2(33945));
        }
        this.f19351z = a.B(aSN1Sequence, 1);
        this.f19350s = a.B(aSN1Sequence, 2);
        this.PublicKey = SABERPublicKey.getInstance(aSN1Sequence.getObjectAt(3));
        this.hpk = a.B(aSN1Sequence, 4);
    }
}
