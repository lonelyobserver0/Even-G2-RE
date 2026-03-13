package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;
import java.math.BigInteger;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ASN1Enumerated extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Enumerated.class, 10) { // from class: org.bouncycastle.asn1.ASN1Enumerated.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1Enumerated.createPrimitive(dEROctetString.getOctets(), false);
        }
    };
    private static final ASN1Enumerated[] cache = new ASN1Enumerated[12];
    private final byte[] contents;
    private final int start;

    public ASN1Enumerated(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(26728));
        }
        this.contents = BigInteger.valueOf(i3).toByteArray();
        this.start = 0;
    }

    public static ASN1Enumerated createPrimitive(byte[] bArr, boolean z2) {
        if (bArr.length > 1) {
            return new ASN1Enumerated(bArr, z2);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException(StubApp.getString2(26730));
        }
        int i3 = bArr[0] & UByte.MAX_VALUE;
        ASN1Enumerated[] aSN1EnumeratedArr = cache;
        if (i3 >= aSN1EnumeratedArr.length) {
            return new ASN1Enumerated(bArr, z2);
        }
        ASN1Enumerated aSN1Enumerated = aSN1EnumeratedArr[i3];
        if (aSN1Enumerated != null) {
            return aSN1Enumerated;
        }
        ASN1Enumerated aSN1Enumerated2 = new ASN1Enumerated(bArr, z2);
        aSN1EnumeratedArr[i3] = aSN1Enumerated2;
        return aSN1Enumerated2;
    }

    public static ASN1Enumerated getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Enumerated)) {
            return (ASN1Enumerated) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
        }
        try {
            return (ASN1Enumerated) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.b(e10, new StringBuilder(StubApp.getString2(26707))));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1Enumerated) {
            return Arrays.areEqual(this.contents, ((ASN1Enumerated) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        aSN1OutputStream.writeEncodingDL(z2, 10, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) {
        return ASN1OutputStream.getLengthOfEncodingDL(z2, this.contents.length);
    }

    public BigInteger getValue() {
        return new BigInteger(this.contents);
    }

    public boolean hasValue(int i3) {
        byte[] bArr = this.contents;
        int length = bArr.length;
        int i10 = this.start;
        return length - i10 <= 4 && ASN1Integer.intValue(bArr, i10, -1) == i3;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public int intValueExact() {
        byte[] bArr = this.contents;
        int length = bArr.length;
        int i3 = this.start;
        if (length - i3 <= 4) {
            return ASN1Integer.intValue(bArr, i3, -1);
        }
        throw new ArithmeticException(StubApp.getString2(26731));
    }

    public ASN1Enumerated(BigInteger bigInteger) {
        if (bigInteger.signum() < 0) {
            throw new IllegalArgumentException(StubApp.getString2(26728));
        }
        this.contents = bigInteger.toByteArray();
        this.start = 0;
    }

    public boolean hasValue(BigInteger bigInteger) {
        return bigInteger != null && ASN1Integer.intValue(this.contents, this.start, -1) == bigInteger.intValue() && getValue().equals(bigInteger);
    }

    public ASN1Enumerated(byte[] bArr) {
        this(bArr, true);
    }

    public ASN1Enumerated(byte[] bArr, boolean z2) {
        if (ASN1Integer.isMalformed(bArr)) {
            throw new IllegalArgumentException(StubApp.getString2(26729));
        }
        if ((bArr[0] & ByteCompanionObject.MIN_VALUE) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(26728));
        }
        this.contents = z2 ? Arrays.clone(bArr) : bArr;
        this.start = ASN1Integer.signBytesToSkip(bArr);
    }

    public static ASN1Enumerated getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return (ASN1Enumerated) TYPE.getContextInstance(aSN1TaggedObject, z2);
    }
}
