package org.bouncycastle.asn1;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import org.bouncycastle.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ASN1External extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1External.class, 8) { // from class: org.bouncycastle.asn1.ASN1External.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.toASN1External();
        }
    };
    ASN1Primitive dataValueDescriptor;
    ASN1ObjectIdentifier directReference;
    int encoding;
    ASN1Primitive externalContent;
    ASN1Integer indirectReference;

    public ASN1External(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Integer aSN1Integer, ASN1Primitive aSN1Primitive, int i3, ASN1Primitive aSN1Primitive2) {
        this.directReference = aSN1ObjectIdentifier;
        this.indirectReference = aSN1Integer;
        this.dataValueDescriptor = aSN1Primitive;
        this.encoding = checkEncoding(i3);
        this.externalContent = checkExternalContent(i3, aSN1Primitive2);
    }

    private static int checkEncoding(int i3) {
        if (i3 < 0 || i3 > 2) {
            throw new IllegalArgumentException(u.p(i3, StubApp.getString2(26734)));
        }
        return i3;
    }

    private static ASN1Primitive checkExternalContent(int i3, ASN1Primitive aSN1Primitive) {
        ASN1UniversalType aSN1UniversalType;
        if (i3 == 1) {
            aSN1UniversalType = ASN1OctetString.TYPE;
        } else {
            if (i3 != 2) {
                return aSN1Primitive;
            }
            aSN1UniversalType = ASN1BitString.TYPE;
        }
        return aSN1UniversalType.checkedCast(aSN1Primitive);
    }

    public static ASN1External getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1External)) {
            return (ASN1External) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1External) {
                return (ASN1External) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1External) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException(u.q(e10, new StringBuilder(StubApp.getString2(26736))));
            }
        }
        throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
    }

    private static ASN1Primitive getObjFromSequence(ASN1Sequence aSN1Sequence, int i3) {
        if (aSN1Sequence.size() > i3) {
            return aSN1Sequence.getObjectAt(i3).toASN1Primitive();
        }
        throw new IllegalArgumentException(StubApp.getString2(26737));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (this == aSN1Primitive) {
            return true;
        }
        if (!(aSN1Primitive instanceof ASN1External)) {
            return false;
        }
        ASN1External aSN1External = (ASN1External) aSN1Primitive;
        return Objects.areEqual(this.directReference, aSN1External.directReference) && Objects.areEqual(this.indirectReference, aSN1External.indirectReference) && Objects.areEqual(this.dataValueDescriptor, aSN1External.dataValueDescriptor) && this.encoding == aSN1External.encoding && this.externalContent.equals(aSN1External.externalContent);
    }

    public abstract ASN1Sequence buildSequence();

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        aSN1OutputStream.writeIdentifier(z2, 40);
        buildSequence().encode(aSN1OutputStream, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) throws IOException {
        return buildSequence().encodedLength(z2);
    }

    public ASN1Primitive getDataValueDescriptor() {
        return this.dataValueDescriptor;
    }

    public ASN1ObjectIdentifier getDirectReference() {
        return this.directReference;
    }

    public int getEncoding() {
        return this.encoding;
    }

    public ASN1Primitive getExternalContent() {
        return this.externalContent;
    }

    public ASN1Integer getIndirectReference() {
        return this.indirectReference;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return (((Objects.hashCode(this.directReference) ^ Objects.hashCode(this.indirectReference)) ^ Objects.hashCode(this.dataValueDescriptor)) ^ this.encoding) ^ this.externalContent.hashCode();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERExternal(this.directReference, this.indirectReference, this.dataValueDescriptor, this.encoding, this.externalContent);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLExternal(this.directReference, this.indirectReference, this.dataValueDescriptor, this.encoding, this.externalContent);
    }

    public ASN1External(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Integer aSN1Integer, ASN1Primitive aSN1Primitive, DERTaggedObject dERTaggedObject) {
        this.directReference = aSN1ObjectIdentifier;
        this.indirectReference = aSN1Integer;
        this.dataValueDescriptor = aSN1Primitive;
        this.encoding = checkEncoding(dERTaggedObject.getTagNo());
        this.externalContent = getExternalContent(dERTaggedObject);
    }

    private static ASN1Primitive getExternalContent(ASN1TaggedObject aSN1TaggedObject) {
        int tagClass = aSN1TaggedObject.getTagClass();
        int tagNo = aSN1TaggedObject.getTagNo();
        String string2 = StubApp.getString2(26735);
        if (128 != tagClass) {
            throw new IllegalArgumentException(string2 + ASN1Util.getTagText(tagClass, tagNo));
        }
        if (tagNo == 0) {
            return aSN1TaggedObject.getExplicitBaseObject().toASN1Primitive();
        }
        if (tagNo == 1) {
            return ASN1OctetString.getInstance(aSN1TaggedObject, false);
        }
        if (tagNo == 2) {
            return ASN1BitString.getInstance(aSN1TaggedObject, false);
        }
        throw new IllegalArgumentException(string2 + ASN1Util.getTagText(tagClass, tagNo));
    }

    public ASN1External(ASN1Sequence aSN1Sequence) {
        int i3 = 0;
        ASN1Primitive objFromSequence = getObjFromSequence(aSN1Sequence, 0);
        if (objFromSequence instanceof ASN1ObjectIdentifier) {
            this.directReference = (ASN1ObjectIdentifier) objFromSequence;
            objFromSequence = getObjFromSequence(aSN1Sequence, 1);
            i3 = 1;
        }
        if (objFromSequence instanceof ASN1Integer) {
            this.indirectReference = (ASN1Integer) objFromSequence;
            i3++;
            objFromSequence = getObjFromSequence(aSN1Sequence, i3);
        }
        if (!(objFromSequence instanceof ASN1TaggedObject)) {
            this.dataValueDescriptor = objFromSequence;
            i3++;
            objFromSequence = getObjFromSequence(aSN1Sequence, i3);
        }
        if (aSN1Sequence.size() != i3 + 1) {
            throw new IllegalArgumentException(StubApp.getString2(26733));
        }
        if (!(objFromSequence instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException(StubApp.getString2(26732));
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objFromSequence;
        this.encoding = checkEncoding(aSN1TaggedObject.getTagNo());
        this.externalContent = getExternalContent(aSN1TaggedObject);
    }

    public static ASN1External getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return (ASN1External) TYPE.getContextInstance(aSN1TaggedObject, z2);
    }
}
