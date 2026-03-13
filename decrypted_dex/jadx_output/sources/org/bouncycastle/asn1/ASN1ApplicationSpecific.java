package org.bouncycastle.asn1;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ASN1ApplicationSpecific extends ASN1TaggedObject implements ASN1ApplicationSpecificParser {
    final ASN1TaggedObject taggedObject;

    public ASN1ApplicationSpecific(ASN1TaggedObject aSN1TaggedObject) {
        super(aSN1TaggedObject.explicitness, checkTagClass(aSN1TaggedObject.tagClass), aSN1TaggedObject.tagNo, aSN1TaggedObject.obj);
        this.taggedObject = aSN1TaggedObject;
    }

    private static int checkTagClass(int i3) {
        if (64 == i3) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    public static ASN1ApplicationSpecific getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1ApplicationSpecific)) {
            return (ASN1ApplicationSpecific) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26703)));
        }
        try {
            return getInstance((Object) ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (IOException e10) {
            throw new IllegalArgumentException(u.q(e10, new StringBuilder(StubApp.getString2(26702))));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        this.taggedObject.encode(aSN1OutputStream, z2);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return this.taggedObject.encodeConstructed();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) throws IOException {
        return this.taggedObject.encodedLength(z2);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public String getASN1Encoding() {
        return this.taggedObject.getASN1Encoding();
    }

    public int getApplicationTag() {
        return this.taggedObject.getTagNo();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public byte[] getContents() {
        return this.taggedObject.getContents();
    }

    public ASN1Primitive getEnclosedObject() throws IOException {
        return this.taggedObject.getBaseObject().toASN1Primitive();
    }

    public ASN1Primitive getObject(int i3) throws IOException {
        return this.taggedObject.getBaseUniversal(false, i3);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable getObjectParser(int i3, boolean z2) throws IOException {
        throw new ASN1Exception(StubApp.getString2(26704));
    }

    public ASN1TaggedObject getTaggedObject() {
        return this.taggedObject;
    }

    public boolean hasApplicationTag(int i3) {
        return this.tagNo == i3;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasContextTag(int i3) {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public boolean isConstructed() {
        return this.taggedObject.isConstructed();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseBaseUniversal(boolean z2, int i3) throws IOException {
        return this.taggedObject.parseBaseUniversal(z2, i3);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseExplicitBaseObject() throws IOException {
        return this.taggedObject.parseExplicitBaseObject();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseExplicitBaseTagged() throws IOException {
        return this.taggedObject.parseExplicitBaseTagged();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseImplicitBaseTagged(int i3, int i10) throws IOException {
        return this.taggedObject.parseImplicitBaseTagged(i3, i10);
    }

    @Override // org.bouncycastle.asn1.ASN1ApplicationSpecificParser
    public ASN1Encodable readObject() throws IOException {
        return parseExplicitBaseObject();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public ASN1Sequence rebuildConstructed(ASN1Primitive aSN1Primitive) {
        return this.taggedObject.rebuildConstructed(aSN1Primitive);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public ASN1TaggedObject replaceTag(int i3, int i10) {
        return this.taggedObject.replaceTag(i3, i10);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERApplicationSpecific((ASN1TaggedObject) this.taggedObject.toDERObject());
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLApplicationSpecific((ASN1TaggedObject) this.taggedObject.toDLObject());
    }
}
