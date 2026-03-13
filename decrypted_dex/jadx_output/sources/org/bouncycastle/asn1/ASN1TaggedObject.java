package org.bouncycastle.asn1;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ASN1TaggedObject extends ASN1Primitive implements ASN1TaggedObjectParser {
    private static final int DECLARED_EXPLICIT = 1;
    private static final int DECLARED_IMPLICIT = 2;
    private static final int PARSED_EXPLICIT = 3;
    private static final int PARSED_IMPLICIT = 4;
    final int explicitness;
    final ASN1Encodable obj;
    final int tagClass;
    final int tagNo;

    public ASN1TaggedObject(int i3, int i10, int i11, ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new NullPointerException(StubApp.getString2(26811));
        }
        if (i10 == 0 || (i10 & 192) != i10) {
            throw new IllegalArgumentException(u.p(i10, StubApp.getString2(26810)));
        }
        this.explicitness = aSN1Encodable instanceof ASN1Choice ? 1 : i3;
        this.tagClass = i10;
        this.tagNo = i11;
        this.obj = aSN1Encodable;
    }

    private static ASN1TaggedObject checkedCast(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            return (ASN1TaggedObject) aSN1Primitive;
        }
        throw new IllegalStateException(StubApp.getString2(26812).concat(aSN1Primitive.getClass().getName()));
    }

    public static ASN1Primitive createConstructedDL(int i3, int i10, ASN1EncodableVector aSN1EncodableVector) {
        DLTaggedObject dLTaggedObject = aSN1EncodableVector.size() == 1 ? new DLTaggedObject(3, i3, i10, aSN1EncodableVector.get(0)) : new DLTaggedObject(4, i3, i10, DLFactory.createSequence(aSN1EncodableVector));
        return i3 != 64 ? dLTaggedObject : new DLApplicationSpecific(dLTaggedObject);
    }

    public static ASN1Primitive createConstructedIL(int i3, int i10, ASN1EncodableVector aSN1EncodableVector) {
        BERTaggedObject bERTaggedObject = aSN1EncodableVector.size() == 1 ? new BERTaggedObject(3, i3, i10, aSN1EncodableVector.get(0)) : new BERTaggedObject(4, i3, i10, BERFactory.createSequence(aSN1EncodableVector));
        return i3 != 64 ? bERTaggedObject : new BERApplicationSpecific(bERTaggedObject);
    }

    public static ASN1Primitive createPrimitive(int i3, int i10, byte[] bArr) {
        DLTaggedObject dLTaggedObject = new DLTaggedObject(4, i3, i10, new DEROctetString(bArr));
        return i3 != 64 ? dLTaggedObject : new DLApplicationSpecific(dLTaggedObject);
    }

    public static ASN1TaggedObject getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1TaggedObject)) {
            return (ASN1TaggedObject) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1TaggedObject) {
                return (ASN1TaggedObject) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return checkedCast(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException e10) {
                throw new IllegalArgumentException(u.q(e10, new StringBuilder(StubApp.getString2(26813))));
            }
        }
        throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26703)));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1TaggedObject)) {
            return false;
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
        if (this.tagNo != aSN1TaggedObject.tagNo || this.tagClass != aSN1TaggedObject.tagClass) {
            return false;
        }
        if (this.explicitness != aSN1TaggedObject.explicitness && isExplicit() != aSN1TaggedObject.isExplicit()) {
            return false;
        }
        ASN1Primitive aSN1Primitive2 = this.obj.toASN1Primitive();
        ASN1Primitive aSN1Primitive3 = aSN1TaggedObject.obj.toASN1Primitive();
        if (aSN1Primitive2 == aSN1Primitive3) {
            return true;
        }
        if (isExplicit()) {
            return aSN1Primitive2.asn1Equals(aSN1Primitive3);
        }
        try {
            return Arrays.areEqual(getEncoded(), aSN1TaggedObject.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    public abstract String getASN1Encoding();

    public ASN1Object getBaseObject() {
        ASN1Encodable aSN1Encodable = this.obj;
        return aSN1Encodable instanceof ASN1Object ? (ASN1Object) aSN1Encodable : aSN1Encodable.toASN1Primitive();
    }

    public ASN1Primitive getBaseUniversal(boolean z2, int i3) {
        ASN1UniversalType aSN1UniversalType = ASN1UniversalTypes.get(i3);
        if (aSN1UniversalType != null) {
            return getBaseUniversal(z2, aSN1UniversalType);
        }
        throw new IllegalArgumentException(u.p(i3, StubApp.getString2(26816)));
    }

    public byte[] getContents() {
        String string2 = StubApp.getString2(26818);
        try {
            byte[] encoded = this.obj.toASN1Primitive().getEncoded(getASN1Encoding());
            if (isExplicit()) {
                return encoded;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(encoded);
            ASN1InputStream.readTagNumber(byteArrayInputStream, byteArrayInputStream.read());
            int readLength = ASN1InputStream.readLength(byteArrayInputStream, byteArrayInputStream.available(), false);
            int available = byteArrayInputStream.available();
            int i3 = readLength < 0 ? available - 2 : available;
            if (i3 < 0) {
                throw new ASN1ParsingException(string2);
            }
            byte[] bArr = new byte[i3];
            System.arraycopy(encoded, encoded.length - available, bArr, 0, i3);
            return bArr;
        } catch (IOException e10) {
            throw new ASN1ParsingException(string2, e10);
        }
    }

    public ASN1Object getExplicitBaseObject() {
        if (!isExplicit()) {
            throw new IllegalStateException(StubApp.getString2(26819));
        }
        ASN1Encodable aSN1Encodable = this.obj;
        return aSN1Encodable instanceof ASN1Object ? (ASN1Object) aSN1Encodable : aSN1Encodable.toASN1Primitive();
    }

    public ASN1TaggedObject getExplicitBaseTagged() {
        if (isExplicit()) {
            return checkedCast(this.obj.toASN1Primitive());
        }
        throw new IllegalStateException(StubApp.getString2(26819));
    }

    public ASN1TaggedObject getImplicitBaseTagged(int i3, int i10) {
        if (i3 == 0 || (i3 & 192) != i3) {
            throw new IllegalArgumentException(u.p(i3, StubApp.getString2(26820)));
        }
        int i11 = this.explicitness;
        if (i11 != 1) {
            return i11 != 2 ? replaceTag(i3, i10) : ASN1Util.checkTag(checkedCast(this.obj.toASN1Primitive()), i3, i10);
        }
        throw new IllegalStateException(StubApp.getString2(26817));
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public final ASN1Primitive getLoadedObject() {
        return this;
    }

    public ASN1Primitive getObject() {
        if (128 == getTagClass()) {
            return this.obj.toASN1Primitive();
        }
        throw new IllegalStateException(StubApp.getString2(26704));
    }

    public ASN1Encodable getObjectParser(int i3, boolean z2) throws IOException {
        if (128 == getTagClass()) {
            return parseBaseUniversal(z2, i3);
        }
        throw new ASN1Exception(StubApp.getString2(26704));
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagClass() {
        return this.tagClass;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagNo() {
        return this.tagNo;
    }

    public boolean hasContextTag(int i3) {
        return this.tagClass == 128 && this.tagNo == i3;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasTag(int i3, int i10) {
        return this.tagClass == i3 && this.tagNo == i10;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return (((this.tagClass * 7919) ^ this.tagNo) ^ (isExplicit() ? 15 : 240)) ^ this.obj.toASN1Primitive().hashCode();
    }

    public boolean isConstructed() {
        return encodeConstructed();
    }

    public boolean isExplicit() {
        int i3 = this.explicitness;
        return i3 == 1 || i3 == 3;
    }

    public boolean isParsed() {
        int i3 = this.explicitness;
        return i3 == 3 || i3 == 4;
    }

    public ASN1Encodable parseBaseUniversal(boolean z2, int i3) throws IOException {
        ASN1Primitive baseUniversal = getBaseUniversal(z2, i3);
        return i3 != 3 ? i3 != 4 ? i3 != 16 ? i3 != 17 ? baseUniversal : ((ASN1Set) baseUniversal).parser() : ((ASN1Sequence) baseUniversal).parser() : ((ASN1OctetString) baseUniversal).parser() : ((ASN1BitString) baseUniversal).parser();
    }

    public ASN1Encodable parseExplicitBaseObject() throws IOException {
        return getExplicitBaseObject();
    }

    public ASN1TaggedObjectParser parseExplicitBaseTagged() throws IOException {
        return getExplicitBaseTagged();
    }

    public ASN1TaggedObjectParser parseImplicitBaseTagged(int i3, int i10) throws IOException {
        return getImplicitBaseTagged(i3, i10);
    }

    public abstract ASN1Sequence rebuildConstructed(ASN1Primitive aSN1Primitive);

    public abstract ASN1TaggedObject replaceTag(int i3, int i10);

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERTaggedObject(this.explicitness, this.tagClass, this.tagNo, this.obj);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLTaggedObject(this.explicitness, this.tagClass, this.tagNo, this.obj);
    }

    public String toString() {
        return ASN1Util.getTagText(this.tagClass, this.tagNo) + this.obj;
    }

    public ASN1TaggedObject(boolean z2, int i3, int i10, ASN1Encodable aSN1Encodable) {
        this(z2 ? 1 : 2, i3, i10, aSN1Encodable);
    }

    public ASN1Primitive getBaseUniversal(boolean z2, ASN1UniversalType aSN1UniversalType) {
        String string2 = StubApp.getString2(26817);
        if (z2) {
            if (isExplicit()) {
                return aSN1UniversalType.checkedCast(this.obj.toASN1Primitive());
            }
            throw new IllegalStateException(string2);
        }
        if (1 == this.explicitness) {
            throw new IllegalStateException(string2);
        }
        ASN1Primitive aSN1Primitive = this.obj.toASN1Primitive();
        int i3 = this.explicitness;
        return i3 != 3 ? i3 != 4 ? aSN1UniversalType.checkedCast(aSN1Primitive) : aSN1Primitive instanceof ASN1Sequence ? aSN1UniversalType.fromImplicitConstructed((ASN1Sequence) aSN1Primitive) : aSN1UniversalType.fromImplicitPrimitive((DEROctetString) aSN1Primitive) : aSN1UniversalType.fromImplicitConstructed(rebuildConstructed(aSN1Primitive));
    }

    public ASN1TaggedObject(boolean z2, int i3, ASN1Encodable aSN1Encodable) {
        this(z2, 128, i3, aSN1Encodable);
    }

    public static ASN1TaggedObject getInstance(Object obj, int i3) {
        if (obj == null) {
            throw new NullPointerException(StubApp.getString2(26811));
        }
        ASN1TaggedObject aSN1TaggedObject = getInstance(obj);
        if (i3 == aSN1TaggedObject.getTagClass()) {
            return aSN1TaggedObject;
        }
        throw new IllegalArgumentException(StubApp.getString2(26814) + ASN1Util.getTagText(aSN1TaggedObject));
    }

    public static ASN1TaggedObject getInstance(Object obj, int i3, int i10) {
        if (obj == null) {
            throw new NullPointerException(StubApp.getString2(26811));
        }
        ASN1TaggedObject aSN1TaggedObject = getInstance(obj);
        if (aSN1TaggedObject.hasTag(i3, i10)) {
            return aSN1TaggedObject;
        }
        throw new IllegalArgumentException(StubApp.getString2(26814) + ASN1Util.getTagText(aSN1TaggedObject));
    }

    public static ASN1TaggedObject getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        if (128 != aSN1TaggedObject.getTagClass()) {
            throw new IllegalStateException(StubApp.getString2(26704));
        }
        if (z2) {
            return aSN1TaggedObject.getExplicitBaseTagged();
        }
        throw new IllegalArgumentException(StubApp.getString2(26815));
    }
}
