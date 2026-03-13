package org.bouncycastle.asn1.tsp;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cms.Attributes;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ArchiveTimeStamp extends ASN1Object {
    private final Attributes attributes;
    private final AlgorithmIdentifier digestAlgorithm;
    private final ASN1Sequence reducedHashTree;
    private final ContentInfo timeStamp;

    private ArchiveTimeStamp(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 4) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(27456))));
        }
        AlgorithmIdentifier algorithmIdentifier = null;
        Attributes attributes = null;
        ASN1Sequence aSN1Sequence2 = null;
        for (int i3 = 0; i3 < aSN1Sequence.size() - 1; i3++) {
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i3);
            if (objectAt instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objectAt);
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    algorithmIdentifier = AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
                } else if (tagNo == 1) {
                    attributes = Attributes.getInstance(aSN1TaggedObject, false);
                } else {
                    if (tagNo != 2) {
                        throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(27455))));
                    }
                    aSN1Sequence2 = ASN1Sequence.getInstance(aSN1TaggedObject, false);
                }
            }
        }
        this.digestAlgorithm = algorithmIdentifier;
        this.attributes = attributes;
        this.reducedHashTree = aSN1Sequence2;
        this.timeStamp = ContentInfo.getInstance(aSN1Sequence.getObjectAt(aSN1Sequence.size() - 1));
    }

    public static ArchiveTimeStamp getInstance(Object obj) {
        if (obj instanceof ArchiveTimeStamp) {
            return (ArchiveTimeStamp) obj;
        }
        if (obj != null) {
            return new ArchiveTimeStamp(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private TSTInfo getTimeStampInfo() {
        if (!this.timeStamp.getContentType().equals((ASN1Primitive) CMSObjectIdentifiers.signedData)) {
            throw new IllegalStateException(StubApp.getString2(27458));
        }
        SignedData signedData = SignedData.getInstance(this.timeStamp.getContent());
        if (signedData.getEncapContentInfo().getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.id_ct_TSTInfo)) {
            return TSTInfo.getInstance(ASN1OctetString.getInstance(signedData.getEncapContentInfo().getContent()).getOctets());
        }
        throw new IllegalStateException(StubApp.getString2(27457));
    }

    public AlgorithmIdentifier getDigestAlgorithm() {
        return this.digestAlgorithm;
    }

    public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        AlgorithmIdentifier algorithmIdentifier = this.digestAlgorithm;
        return algorithmIdentifier != null ? algorithmIdentifier : getTimeStampInfo().getMessageImprint().getHashAlgorithm();
    }

    public PartialHashtree getHashTreeLeaf() {
        ASN1Sequence aSN1Sequence = this.reducedHashTree;
        if (aSN1Sequence == null) {
            return null;
        }
        return PartialHashtree.getInstance(aSN1Sequence.getObjectAt(0));
    }

    public PartialHashtree[] getReducedHashTree() {
        ASN1Sequence aSN1Sequence = this.reducedHashTree;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        PartialHashtree[] partialHashtreeArr = new PartialHashtree[size];
        for (int i3 = 0; i3 != size; i3++) {
            partialHashtreeArr[i3] = PartialHashtree.getInstance(this.reducedHashTree.getObjectAt(i3));
        }
        return partialHashtreeArr;
    }

    public ContentInfo getTimeStamp() {
        return this.timeStamp;
    }

    public byte[] getTimeStampDigestValue() {
        return getTimeStampInfo().getMessageImprint().getHashedMessage();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        AlgorithmIdentifier algorithmIdentifier = this.digestAlgorithm;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) algorithmIdentifier));
        }
        Attributes attributes = this.attributes;
        if (attributes != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) attributes));
        }
        ASN1Sequence aSN1Sequence = this.reducedHashTree;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, (ASN1Encodable) aSN1Sequence));
        }
        aSN1EncodableVector.add(this.timeStamp);
        return new DERSequence(aSN1EncodableVector);
    }

    public ArchiveTimeStamp(ContentInfo contentInfo) {
        this(null, null, null, contentInfo);
    }

    public ArchiveTimeStamp(AlgorithmIdentifier algorithmIdentifier, Attributes attributes, PartialHashtree[] partialHashtreeArr, ContentInfo contentInfo) {
        this.digestAlgorithm = algorithmIdentifier;
        this.attributes = attributes;
        this.reducedHashTree = partialHashtreeArr != null ? new DERSequence(partialHashtreeArr) : null;
        this.timeStamp = contentInfo;
    }

    public ArchiveTimeStamp(AlgorithmIdentifier algorithmIdentifier, PartialHashtree[] partialHashtreeArr, ContentInfo contentInfo) {
        this(algorithmIdentifier, null, partialHashtreeArr, contentInfo);
    }
}
