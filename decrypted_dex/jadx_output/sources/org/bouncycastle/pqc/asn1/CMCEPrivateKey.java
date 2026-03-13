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
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMCEPrivateKey extends ASN1Object {

    /* renamed from: C, reason: collision with root package name */
    private byte[] f19331C;
    private CMCEPublicKey PublicKey;
    private byte[] alpha;
    private byte[] delta;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f19332g;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f19333s;
    private int version;

    public CMCEPrivateKey(int i3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this(i3, bArr, bArr2, bArr3, bArr4, bArr5, null);
    }

    public static CMCEPrivateKey getInstance(Object obj) {
        if (obj instanceof CMCEPrivateKey) {
            return (CMCEPrivateKey) obj;
        }
        if (obj != null) {
            return new CMCEPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getAlpha() {
        return Arrays.clone(this.alpha);
    }

    public byte[] getC() {
        return Arrays.clone(this.f19331C);
    }

    public byte[] getDelta() {
        return Arrays.clone(this.delta);
    }

    public byte[] getG() {
        return Arrays.clone(this.f19332g);
    }

    public CMCEPublicKey getPublicKey() {
        return this.PublicKey;
    }

    public byte[] getS() {
        return Arrays.clone(this.f19333s);
    }

    public int getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.delta));
        aSN1EncodableVector.add(new DEROctetString(this.f19331C));
        aSN1EncodableVector.add(new DEROctetString(this.f19332g));
        aSN1EncodableVector.add(new DEROctetString(this.alpha));
        aSN1EncodableVector.add(new DEROctetString(this.f19333s));
        CMCEPublicKey cMCEPublicKey = this.PublicKey;
        if (cMCEPublicKey != null) {
            aSN1EncodableVector.add(new CMCEPublicKey(cMCEPublicKey.getT()));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CMCEPrivateKey(int i3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, CMCEPublicKey cMCEPublicKey) {
        this.version = i3;
        if (i3 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(33945));
        }
        this.delta = Arrays.clone(bArr);
        this.f19331C = Arrays.clone(bArr2);
        this.f19332g = Arrays.clone(bArr3);
        this.alpha = Arrays.clone(bArr4);
        this.f19333s = Arrays.clone(bArr5);
        this.PublicKey = cMCEPublicKey;
    }

    private CMCEPrivateKey(ASN1Sequence aSN1Sequence) {
        int intValueExact = BigIntegers.intValueExact(ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue());
        this.version = intValueExact;
        if (intValueExact != 0) {
            throw new IllegalArgumentException(StubApp.getString2(33945));
        }
        this.delta = a.B(aSN1Sequence, 1);
        this.f19331C = a.B(aSN1Sequence, 2);
        this.f19332g = a.B(aSN1Sequence, 3);
        this.alpha = a.B(aSN1Sequence, 4);
        this.f19333s = a.B(aSN1Sequence, 5);
        if (aSN1Sequence.size() == 7) {
            this.PublicKey = CMCEPublicKey.getInstance(aSN1Sequence.getObjectAt(6));
        }
    }
}
