package org.bouncycastle.asn1;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ASN1OctetString extends ASN1Primitive implements ASN1OctetStringParser {
    byte[] string;
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1OctetString.class, 4) { // from class: org.bouncycastle.asn1.ASN1OctetString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.toASN1OctetString();
        }

        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return dEROctetString;
        }
    };
    static final byte[] EMPTY_OCTETS = new byte[0];

    public ASN1OctetString(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(26705));
        }
        this.string = bArr;
    }

    public static ASN1OctetString createPrimitive(byte[] bArr) {
        return new DEROctetString(bArr);
    }

    public static ASN1OctetString getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1OctetString)) {
            return (ASN1OctetString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1OctetString) {
                return (ASN1OctetString) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1OctetString) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException(u.q(e10, new StringBuilder(StubApp.getString2(26790))));
            }
        }
        throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1OctetString) {
            return Arrays.areEqual(this.string, ((ASN1OctetString) aSN1Primitive).string);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // org.bouncycastle.asn1.ASN1OctetStringParser
    public InputStream getOctetStream() {
        return new ByteArrayInputStream(this.string);
    }

    public byte[] getOctets() {
        return this.string;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(getOctets());
    }

    public ASN1OctetStringParser parser() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DEROctetString(this.string);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DEROctetString(this.string);
    }

    public String toString() {
        return StubApp.getString2(919) + Strings.fromByteArray(Hex.encode(this.string));
    }

    public static ASN1OctetString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return (ASN1OctetString) TYPE.getContextInstance(aSN1TaggedObject, z2);
    }
}
