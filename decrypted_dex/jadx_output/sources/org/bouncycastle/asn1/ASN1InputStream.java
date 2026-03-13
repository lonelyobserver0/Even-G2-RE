package org.bouncycastle.asn1;

import Xa.h;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ASN1InputStream extends FilterInputStream implements BERTags {
    private final boolean lazyEvaluate;
    private final int limit;
    private final byte[][] tmpBuffers;

    public ASN1InputStream(InputStream inputStream) {
        this(inputStream, StreamUtil.findLimit(inputStream));
    }

    public static ASN1Primitive createPrimitiveDERObject(int i3, DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) throws IOException {
        switch (i3) {
            case 1:
                return ASN1Boolean.createPrimitive(getBuffer(definiteLengthInputStream, bArr));
            case 2:
                return ASN1Integer.createPrimitive(definiteLengthInputStream.toByteArray());
            case 3:
                return ASN1BitString.createPrimitive(definiteLengthInputStream.toByteArray());
            case 4:
                return ASN1OctetString.createPrimitive(definiteLengthInputStream.toByteArray());
            case 5:
                return ASN1Null.createPrimitive(definiteLengthInputStream.toByteArray());
            case 6:
                return ASN1ObjectIdentifier.createPrimitive(getBuffer(definiteLengthInputStream, bArr), true);
            case 7:
                return ASN1ObjectDescriptor.createPrimitive(definiteLengthInputStream.toByteArray());
            case 8:
            case 9:
            case 11:
            case 14:
            case 15:
            case 16:
            case 17:
            case 29:
            default:
                throw new IOException(h.g(i3, StubApp.getString2(26756), StubApp.getString2(26757)));
            case 10:
                return ASN1Enumerated.createPrimitive(getBuffer(definiteLengthInputStream, bArr), true);
            case 12:
                return ASN1UTF8String.createPrimitive(definiteLengthInputStream.toByteArray());
            case 13:
                return ASN1RelativeOID.createPrimitive(definiteLengthInputStream.toByteArray(), false);
            case 18:
                return ASN1NumericString.createPrimitive(definiteLengthInputStream.toByteArray());
            case 19:
                return ASN1PrintableString.createPrimitive(definiteLengthInputStream.toByteArray());
            case 20:
                return ASN1T61String.createPrimitive(definiteLengthInputStream.toByteArray());
            case 21:
                return ASN1VideotexString.createPrimitive(definiteLengthInputStream.toByteArray());
            case 22:
                return ASN1IA5String.createPrimitive(definiteLengthInputStream.toByteArray());
            case 23:
                return ASN1UTCTime.createPrimitive(definiteLengthInputStream.toByteArray());
            case 24:
                return ASN1GeneralizedTime.createPrimitive(definiteLengthInputStream.toByteArray());
            case 25:
                return ASN1GraphicString.createPrimitive(definiteLengthInputStream.toByteArray());
            case 26:
                return ASN1VisibleString.createPrimitive(definiteLengthInputStream.toByteArray());
            case 27:
                return ASN1GeneralString.createPrimitive(definiteLengthInputStream.toByteArray());
            case 28:
                return ASN1UniversalString.createPrimitive(definiteLengthInputStream.toByteArray());
            case 30:
                return ASN1BMPString.createPrimitive(getBMPCharBuffer(definiteLengthInputStream));
        }
    }

    private static char[] getBMPCharBuffer(DefiniteLengthInputStream definiteLengthInputStream) throws IOException {
        int remaining = definiteLengthInputStream.getRemaining();
        if ((remaining & 1) != 0) {
            throw new IOException(StubApp.getString2(26706));
        }
        int i3 = remaining / 2;
        char[] cArr = new char[i3];
        byte[] bArr = new byte[8];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String string2 = StubApp.getString2(26758);
            if (remaining < 8) {
                if (remaining > 0) {
                    if (Streams.readFully(definiteLengthInputStream, bArr, 0, remaining) != remaining) {
                        throw new EOFException(string2);
                    }
                    do {
                        int i12 = i10 + 1;
                        int i13 = bArr[i10] << 8;
                        i10 += 2;
                        cArr[i11] = (char) ((bArr[i12] & UByte.MAX_VALUE) | i13);
                        i11++;
                    } while (i10 < remaining);
                }
                if (definiteLengthInputStream.getRemaining() == 0 && i3 == i11) {
                    return cArr;
                }
                throw new IllegalStateException();
            }
            if (Streams.readFully(definiteLengthInputStream, bArr, 0, 8) != 8) {
                throw new EOFException(string2);
            }
            cArr[i11] = (char) ((bArr[0] << 8) | (bArr[1] & UByte.MAX_VALUE));
            cArr[i11 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & UByte.MAX_VALUE));
            cArr[i11 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & UByte.MAX_VALUE));
            cArr[i11 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & UByte.MAX_VALUE));
            i11 += 4;
            remaining -= 8;
        }
    }

    private static byte[] getBuffer(DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) throws IOException {
        int remaining = definiteLengthInputStream.getRemaining();
        if (remaining >= bArr.length) {
            return definiteLengthInputStream.toByteArray();
        }
        byte[] bArr2 = bArr[remaining];
        if (bArr2 == null) {
            bArr2 = new byte[remaining];
            bArr[remaining] = bArr2;
        }
        definiteLengthInputStream.readAllIntoByteArray(bArr2);
        return bArr2;
    }

    public static int readTagNumber(InputStream inputStream, int i3) throws IOException {
        int i10 = i3 & 31;
        if (i10 != 31) {
            return i10;
        }
        int read = inputStream.read();
        String string2 = StubApp.getString2(26764);
        if (read < 31) {
            if (read < 0) {
                throw new EOFException(string2);
            }
            throw new IOException(StubApp.getString2(26765));
        }
        int i11 = read & CertificateBody.profileType;
        if (i11 == 0) {
            throw new IOException(StubApp.getString2(26767));
        }
        while ((read & 128) != 0) {
            if ((i11 >>> 24) != 0) {
                throw new IOException(StubApp.getString2(26766));
            }
            int i12 = i11 << 7;
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException(string2);
            }
            i11 = i12 | (read2 & CertificateBody.profileType);
            read = read2;
        }
        return i11;
    }

    public ASN1BitString buildConstructedBitString(ASN1EncodableVector aSN1EncodableVector) throws IOException {
        int size = aSN1EncodableVector.size();
        ASN1BitString[] aSN1BitStringArr = new ASN1BitString[size];
        for (int i3 = 0; i3 != size; i3++) {
            ASN1Encodable aSN1Encodable = aSN1EncodableVector.get(i3);
            if (!(aSN1Encodable instanceof ASN1BitString)) {
                throw new ASN1Exception(StubApp.getString2(26768) + aSN1Encodable.getClass());
            }
            aSN1BitStringArr[i3] = (ASN1BitString) aSN1Encodable;
        }
        return new BERBitString(aSN1BitStringArr);
    }

    public ASN1OctetString buildConstructedOctetString(ASN1EncodableVector aSN1EncodableVector) throws IOException {
        int size = aSN1EncodableVector.size();
        ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[size];
        for (int i3 = 0; i3 != size; i3++) {
            ASN1Encodable aSN1Encodable = aSN1EncodableVector.get(i3);
            if (!(aSN1Encodable instanceof ASN1OctetString)) {
                throw new ASN1Exception(StubApp.getString2(26769) + aSN1Encodable.getClass());
            }
            aSN1OctetStringArr[i3] = (ASN1OctetString) aSN1Encodable;
        }
        return new BEROctetString(aSN1OctetStringArr);
    }

    public ASN1Primitive buildObject(int i3, int i10, int i11) throws IOException {
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this, i11, this.limit);
        if ((i3 & BERTags.FLAGS) == 0) {
            return createPrimitiveDERObject(i10, definiteLengthInputStream, this.tmpBuffers);
        }
        int i12 = i3 & 192;
        if (i12 != 0) {
            return readTaggedObjectDL(i12, i10, (i3 & 32) != 0, definiteLengthInputStream);
        }
        if (i10 == 3) {
            return buildConstructedBitString(readVector(definiteLengthInputStream));
        }
        if (i10 == 4) {
            return buildConstructedOctetString(readVector(definiteLengthInputStream));
        }
        if (i10 == 8) {
            return DLFactory.createSequence(readVector(definiteLengthInputStream)).toASN1External();
        }
        if (i10 == 16) {
            return definiteLengthInputStream.getRemaining() < 1 ? DLFactory.EMPTY_SEQUENCE : this.lazyEvaluate ? new LazyEncodedSequence(definiteLengthInputStream.toByteArray()) : DLFactory.createSequence(readVector(definiteLengthInputStream));
        }
        if (i10 == 17) {
            return DLFactory.createSet(readVector(definiteLengthInputStream));
        }
        throw new IOException(h.g(i10, StubApp.getString2(26756), StubApp.getString2(26757)));
    }

    public int getLimit() {
        return this.limit;
    }

    public void readFully(byte[] bArr) throws IOException {
        if (Streams.readFully(this, bArr, 0, bArr.length) != bArr.length) {
            throw new EOFException(StubApp.getString2(26770));
        }
    }

    public int readLength() throws IOException {
        return readLength(this, this.limit, false);
    }

    public ASN1Primitive readObject() throws IOException {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException(StubApp.getString2(26771));
        }
        int readTagNumber = readTagNumber(this, read);
        int readLength = readLength();
        if (readLength >= 0) {
            try {
                return buildObject(read, readTagNumber, readLength);
            } catch (IllegalArgumentException e10) {
                throw new ASN1Exception(StubApp.getString2(26772), e10);
            }
        }
        if ((read & 32) == 0) {
            throw new IOException(StubApp.getString2(26774));
        }
        ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this, this.limit), this.limit, this.tmpBuffers);
        int i3 = read & 192;
        if (i3 != 0) {
            return aSN1StreamParser.loadTaggedIL(i3, readTagNumber);
        }
        if (readTagNumber == 3) {
            return BERBitStringParser.parse(aSN1StreamParser);
        }
        if (readTagNumber == 4) {
            return BEROctetStringParser.parse(aSN1StreamParser);
        }
        if (readTagNumber == 8) {
            return DERExternalParser.parse(aSN1StreamParser);
        }
        if (readTagNumber == 16) {
            return BERSequenceParser.parse(aSN1StreamParser);
        }
        if (readTagNumber == 17) {
            return BERSetParser.parse(aSN1StreamParser);
        }
        throw new IOException(StubApp.getString2(26773));
    }

    public ASN1Primitive readTaggedObjectDL(int i3, int i10, boolean z2, DefiniteLengthInputStream definiteLengthInputStream) throws IOException {
        return !z2 ? ASN1TaggedObject.createPrimitive(i3, i10, definiteLengthInputStream.toByteArray()) : ASN1TaggedObject.createConstructedDL(i3, i10, readVector(definiteLengthInputStream));
    }

    public ASN1EncodableVector readVector() throws IOException {
        ASN1Primitive readObject = readObject();
        if (readObject == null) {
            return new ASN1EncodableVector(0);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        do {
            aSN1EncodableVector.add(readObject);
            readObject = readObject();
        } while (readObject != null);
        return aSN1EncodableVector;
    }

    public ASN1InputStream(InputStream inputStream, int i3) {
        this(inputStream, i3, false);
    }

    public static int readLength(InputStream inputStream, int i3, boolean z2) throws IOException {
        int read = inputStream.read();
        if ((read >>> 7) == 0) {
            return read;
        }
        if (128 == read) {
            return -1;
        }
        if (read < 0) {
            throw new EOFException(StubApp.getString2(26763));
        }
        if (255 == read) {
            throw new IOException(StubApp.getString2(26762));
        }
        int i10 = read & CertificateBody.profileType;
        int i11 = 0;
        int i12 = 0;
        do {
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException(StubApp.getString2(26761));
            }
            if ((i11 >>> 23) != 0) {
                throw new IOException(StubApp.getString2(26760));
            }
            i11 = (i11 << 8) + read2;
            i12++;
        } while (i12 < i10);
        if (i11 < i3 || z2) {
            return i11;
        }
        throw new IOException(h.o(StubApp.getString2(26759), i11, i3, StubApp.getString2(22132)));
    }

    public ASN1EncodableVector readVector(DefiniteLengthInputStream definiteLengthInputStream) throws IOException {
        int remaining = definiteLengthInputStream.getRemaining();
        return remaining < 1 ? new ASN1EncodableVector(0) : new ASN1InputStream(definiteLengthInputStream, remaining, this.lazyEvaluate, this.tmpBuffers).readVector();
    }

    public ASN1InputStream(InputStream inputStream, int i3, boolean z2) {
        this(inputStream, i3, z2, new byte[11][]);
    }

    private ASN1InputStream(InputStream inputStream, int i3, boolean z2, byte[][] bArr) {
        super(inputStream);
        this.limit = i3;
        this.lazyEvaluate = z2;
        this.tmpBuffers = bArr;
    }

    public ASN1InputStream(InputStream inputStream, boolean z2) {
        this(inputStream, StreamUtil.findLimit(inputStream), z2);
    }

    public ASN1InputStream(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public ASN1InputStream(byte[] bArr, boolean z2) {
        this(new ByteArrayInputStream(bArr), bArr.length, z2);
    }
}
