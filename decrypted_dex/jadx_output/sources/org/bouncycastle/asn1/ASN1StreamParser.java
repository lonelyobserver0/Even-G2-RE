package org.bouncycastle.asn1;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ASN1StreamParser {
    private final InputStream _in;
    private final int _limit;
    private final byte[][] tmpBuffers;

    public ASN1StreamParser(InputStream inputStream) {
        this(inputStream, StreamUtil.findLimit(inputStream));
    }

    private void set00Check(boolean z2) {
        InputStream inputStream = this._in;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream) inputStream).setEofOn00(z2);
        }
    }

    public ASN1Encodable implParseObject(int i3) throws IOException {
        set00Check(false);
        int readTagNumber = ASN1InputStream.readTagNumber(this._in, i3);
        int readLength = ASN1InputStream.readLength(this._in, this._limit, readTagNumber == 3 || readTagNumber == 4 || readTagNumber == 16 || readTagNumber == 17 || readTagNumber == 8);
        if (readLength < 0) {
            if ((i3 & 32) == 0) {
                throw new IOException(StubApp.getString2(26774));
            }
            ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this._in, this._limit), this._limit, this.tmpBuffers);
            int i10 = i3 & 192;
            return i10 != 0 ? 64 == i10 ? new BERApplicationSpecificParser(readTagNumber, aSN1StreamParser) : new BERTaggedObjectParser(i10, readTagNumber, aSN1StreamParser) : aSN1StreamParser.parseImplicitConstructedIL(readTagNumber);
        }
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this._in, readLength, this._limit);
        if ((i3 & BERTags.FLAGS) == 0) {
            return parseImplicitPrimitive(readTagNumber, definiteLengthInputStream);
        }
        ASN1StreamParser aSN1StreamParser2 = new ASN1StreamParser(definiteLengthInputStream, definiteLengthInputStream.getLimit(), this.tmpBuffers);
        int i11 = i3 & 192;
        if (i11 == 0) {
            return aSN1StreamParser2.parseImplicitConstructedDL(readTagNumber);
        }
        boolean z2 = (i3 & 32) != 0;
        return 64 == i11 ? (DLApplicationSpecific) aSN1StreamParser2.loadTaggedDL(i11, readTagNumber, z2) : new DLTaggedObjectParser(i11, readTagNumber, z2, aSN1StreamParser2);
    }

    public ASN1Primitive loadTaggedDL(int i3, int i10, boolean z2) throws IOException {
        return !z2 ? ASN1TaggedObject.createPrimitive(i3, i10, ((DefiniteLengthInputStream) this._in).toByteArray()) : ASN1TaggedObject.createConstructedDL(i3, i10, readVector());
    }

    public ASN1Primitive loadTaggedIL(int i3, int i10) throws IOException {
        return ASN1TaggedObject.createConstructedIL(i3, i10, readVector());
    }

    public ASN1Encodable parseImplicitConstructedDL(int i3) throws IOException {
        if (i3 == 3) {
            return new BERBitStringParser(this);
        }
        if (i3 == 4) {
            return new BEROctetStringParser(this);
        }
        if (i3 == 8) {
            return new DERExternalParser(this);
        }
        if (i3 == 16) {
            return new DLSequenceParser(this);
        }
        if (i3 == 17) {
            return new DLSetParser(this);
        }
        throw new ASN1Exception(StubApp.getString2(26802) + Integer.toHexString(i3));
    }

    public ASN1Encodable parseImplicitConstructedIL(int i3) throws IOException {
        if (i3 == 3) {
            return new BERBitStringParser(this);
        }
        if (i3 == 4) {
            return new BEROctetStringParser(this);
        }
        if (i3 == 8) {
            return new DERExternalParser(this);
        }
        if (i3 == 16) {
            return new BERSequenceParser(this);
        }
        if (i3 == 17) {
            return new BERSetParser(this);
        }
        throw new ASN1Exception(StubApp.getString2(26803) + Integer.toHexString(i3));
    }

    public ASN1Encodable parseImplicitPrimitive(int i3) throws IOException {
        return parseImplicitPrimitive(i3, (DefiniteLengthInputStream) this._in);
    }

    public ASN1Encodable parseObject(int i3) throws IOException {
        if (i3 < 0 || i3 > 30) {
            throw new IllegalArgumentException(u.p(i3, StubApp.getString2(26808)));
        }
        int read = this._in.read();
        if (read < 0) {
            return null;
        }
        if ((read & (-33)) == i3) {
            return implParseObject(read);
        }
        throw new IOException(u.p(read, StubApp.getString2(26807)));
    }

    public ASN1TaggedObjectParser parseTaggedObject() throws IOException {
        int read = this._in.read();
        if (read < 0) {
            return null;
        }
        if ((read & 192) != 0) {
            return (ASN1TaggedObjectParser) implParseObject(read);
        }
        throw new ASN1Exception(StubApp.getString2(26809));
    }

    public ASN1Encodable readObject() throws IOException {
        int read = this._in.read();
        if (read < 0) {
            return null;
        }
        return implParseObject(read);
    }

    public ASN1EncodableVector readVector() throws IOException {
        int read = this._in.read();
        if (read < 0) {
            return new ASN1EncodableVector(0);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        do {
            ASN1Encodable implParseObject = implParseObject(read);
            aSN1EncodableVector.add(implParseObject instanceof InMemoryRepresentable ? ((InMemoryRepresentable) implParseObject).getLoadedObject() : implParseObject.toASN1Primitive());
            read = this._in.read();
        } while (read >= 0);
        return aSN1EncodableVector;
    }

    public ASN1StreamParser(InputStream inputStream, int i3) {
        this(inputStream, i3, new byte[11][]);
    }

    public ASN1Encodable parseImplicitPrimitive(int i3, DefiniteLengthInputStream definiteLengthInputStream) throws IOException {
        if (i3 == 3) {
            return new DLBitStringParser(definiteLengthInputStream);
        }
        if (i3 == 4) {
            return new DEROctetStringParser(definiteLengthInputStream);
        }
        if (i3 == 8) {
            throw new ASN1Exception(StubApp.getString2(26806));
        }
        if (i3 == 16) {
            throw new ASN1Exception(StubApp.getString2(26805));
        }
        if (i3 == 17) {
            throw new ASN1Exception(StubApp.getString2(26804));
        }
        try {
            return ASN1InputStream.createPrimitiveDERObject(i3, definiteLengthInputStream, this.tmpBuffers);
        } catch (IllegalArgumentException e10) {
            throw new ASN1Exception(StubApp.getString2(26772), e10);
        }
    }

    public ASN1StreamParser(InputStream inputStream, int i3, byte[][] bArr) {
        this._in = inputStream;
        this._limit = i3;
        this.tmpBuffers = bArr;
    }

    public ASN1StreamParser(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }
}
