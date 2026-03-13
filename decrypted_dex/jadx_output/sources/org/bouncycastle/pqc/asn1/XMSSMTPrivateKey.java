package org.bouncycastle.pqc.asn1;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XMSSMTPrivateKey extends ASN1Object {
    private final byte[] bdsState;
    private final long index;
    private final long maxIndex;
    private final byte[] publicSeed;
    private final byte[] root;
    private final byte[] secretKeyPRF;
    private final byte[] secretKeySeed;
    private final int version;

    public XMSSMTPrivateKey(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.version = 0;
        this.index = j;
        this.secretKeySeed = Arrays.clone(bArr);
        this.secretKeyPRF = Arrays.clone(bArr2);
        this.publicSeed = Arrays.clone(bArr3);
        this.root = Arrays.clone(bArr4);
        this.bdsState = Arrays.clone(bArr5);
        this.maxIndex = -1L;
    }

    public static XMSSMTPrivateKey getInstance(Object obj) {
        if (obj instanceof XMSSMTPrivateKey) {
            return (XMSSMTPrivateKey) obj;
        }
        if (obj != null) {
            return new XMSSMTPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getBdsState() {
        return Arrays.clone(this.bdsState);
    }

    public long getIndex() {
        return this.index;
    }

    public long getMaxIndex() {
        return this.maxIndex;
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.publicSeed);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.root);
    }

    public byte[] getSecretKeyPRF() {
        return Arrays.clone(this.secretKeyPRF);
    }

    public byte[] getSecretKeySeed() {
        return Arrays.clone(this.secretKeySeed);
    }

    public int getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.maxIndex >= 0 ? new ASN1Integer(1L) : new ASN1Integer(0L));
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        aSN1EncodableVector2.add(new ASN1Integer(this.index));
        aSN1EncodableVector2.add(new DEROctetString(this.secretKeySeed));
        aSN1EncodableVector2.add(new DEROctetString(this.secretKeyPRF));
        aSN1EncodableVector2.add(new DEROctetString(this.publicSeed));
        aSN1EncodableVector2.add(new DEROctetString(this.root));
        if (this.maxIndex >= 0) {
            aSN1EncodableVector2.add(new DERTaggedObject(false, 0, (ASN1Encodable) new ASN1Integer(this.maxIndex)));
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) new DEROctetString(this.bdsState)));
        return new DERSequence(aSN1EncodableVector);
    }

    public XMSSMTPrivateKey(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j3) {
        this.version = 1;
        this.index = j;
        this.secretKeySeed = Arrays.clone(bArr);
        this.secretKeyPRF = Arrays.clone(bArr2);
        this.publicSeed = Arrays.clone(bArr3);
        this.root = Arrays.clone(bArr4);
        this.bdsState = Arrays.clone(bArr5);
        this.maxIndex = j3;
    }

    private XMSSMTPrivateKey(ASN1Sequence aSN1Sequence) {
        long j;
        ASN1Integer aSN1Integer = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        if (!aSN1Integer.hasValue(0) && !aSN1Integer.hasValue(1)) {
            throw new IllegalArgumentException(StubApp.getString2(33950));
        }
        this.version = aSN1Integer.intValueExact();
        if (aSN1Sequence.size() != 2 && aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException(StubApp.getString2(33951));
        }
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        this.index = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).longValueExact();
        this.secretKeySeed = a.B(aSN1Sequence2, 1);
        this.secretKeyPRF = a.B(aSN1Sequence2, 2);
        this.publicSeed = a.B(aSN1Sequence2, 3);
        this.root = a.B(aSN1Sequence2, 4);
        if (aSN1Sequence2.size() == 6) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence2.getObjectAt(5));
            if (aSN1TaggedObject.getTagNo() != 0) {
                throw new IllegalArgumentException(StubApp.getString2(33952));
            }
            j = ASN1Integer.getInstance(aSN1TaggedObject, false).longValueExact();
        } else {
            if (aSN1Sequence2.size() != 5) {
                throw new IllegalArgumentException(StubApp.getString2(33953));
            }
            j = -1;
        }
        this.maxIndex = j;
        if (aSN1Sequence.size() == 3) {
            this.bdsState = Arrays.clone(ASN1OctetString.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(2)), true).getOctets());
        } else {
            this.bdsState = null;
        }
    }
}
