package org.bouncycastle.asn1;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ASN1RelativeOID extends ASN1Primitive {
    private static final long LONG_LIMIT = 72057594037927808L;
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1RelativeOID.class, 13) { // from class: org.bouncycastle.asn1.ASN1RelativeOID.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1RelativeOID.createPrimitive(dEROctetString.getOctets(), false);
        }
    };
    private byte[] contents;
    private final String identifier;

    public ASN1RelativeOID(String str) {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(26787));
        }
        if (!isValidIdentifier(str, 0)) {
            throw new IllegalArgumentException(E1.a.k(StubApp.getString2(26785), str, StubApp.getString2(26795)));
        }
        this.identifier = str;
    }

    public static ASN1RelativeOID createPrimitive(byte[] bArr, boolean z2) {
        return new ASN1RelativeOID(bArr, z2);
    }

    private void doOutput(ByteArrayOutputStream byteArrayOutputStream) {
        OIDTokenizer oIDTokenizer = new OIDTokenizer(this.identifier);
        while (oIDTokenizer.hasMoreTokens()) {
            String nextToken = oIDTokenizer.nextToken();
            if (nextToken.length() <= 18) {
                writeField(byteArrayOutputStream, Long.parseLong(nextToken));
            } else {
                writeField(byteArrayOutputStream, new BigInteger(nextToken));
            }
        }
    }

    public static ASN1RelativeOID fromContents(byte[] bArr) {
        return createPrimitive(bArr, true);
    }

    private synchronized byte[] getContents() {
        try {
            if (this.contents == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                doOutput(byteArrayOutputStream);
                this.contents = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.contents;
    }

    public static ASN1RelativeOID getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1RelativeOID)) {
            return (ASN1RelativeOID) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1RelativeOID) {
                return (ASN1RelativeOID) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1RelativeOID) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException(u.q(e10, new StringBuilder(StubApp.getString2(26796))));
            }
        }
        throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isValidIdentifier(java.lang.String r8, int r9) {
        /*
            int r0 = r8.length()
            r1 = 0
            r2 = r1
        L6:
            int r3 = r0 + (-1)
            r4 = 48
            r5 = 1
            if (r3 < r9) goto L2e
            char r6 = r8.charAt(r3)
            r7 = 46
            if (r6 != r7) goto L23
            if (r2 == 0) goto L22
            if (r2 <= r5) goto L20
            char r0 = r8.charAt(r0)
            if (r0 != r4) goto L20
            goto L22
        L20:
            r2 = r1
            goto L2b
        L22:
            return r1
        L23:
            if (r4 > r6) goto L2d
            r0 = 57
            if (r6 > r0) goto L2d
            int r2 = r2 + 1
        L2b:
            r0 = r3
            goto L6
        L2d:
            return r1
        L2e:
            if (r2 == 0) goto L3a
            if (r2 <= r5) goto L39
            char r8 = r8.charAt(r0)
            if (r8 != r4) goto L39
            goto L3a
        L39:
            return r5
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ASN1RelativeOID.isValidIdentifier(java.lang.String, int):boolean");
    }

    public static void writeField(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i3 = 8;
        bArr[8] = (byte) (((int) j) & CertificateBody.profileType);
        while (j >= 128) {
            j >>= 7;
            i3--;
            bArr[i3] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i3, 9 - i3);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (this == aSN1Primitive) {
            return true;
        }
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            return this.identifier.equals(((ASN1RelativeOID) aSN1Primitive).identifier);
        }
        return false;
    }

    public ASN1RelativeOID branch(String str) {
        return new ASN1RelativeOID(this, str);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        aSN1OutputStream.writeEncodingDL(z2, 13, getContents());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) {
        return ASN1OutputStream.getLengthOfEncodingDL(z2, getContents().length);
    }

    public String getId() {
        return this.identifier;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return this.identifier.hashCode();
    }

    public String toString() {
        return getId();
    }

    public static void writeField(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i3 = bitLength - 1;
        for (int i10 = i3; i10 >= 0; i10--) {
            bArr[i10] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i3] = (byte) (bArr[i3] & ByteCompanionObject.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    public ASN1RelativeOID(ASN1RelativeOID aSN1RelativeOID, String str) {
        if (!isValidIdentifier(str, 0)) {
            throw new IllegalArgumentException(E1.a.k(StubApp.getString2(26785), str, StubApp.getString2(26788)));
        }
        this.identifier = aSN1RelativeOID.getId() + StubApp.getString2(1) + str;
    }

    public static ASN1RelativeOID getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return (ASN1RelativeOID) TYPE.getContextInstance(aSN1TaggedObject, z2);
    }

    private ASN1RelativeOID(byte[] bArr, boolean z2) {
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z10 = true;
        BigInteger bigInteger = null;
        long j = 0;
        for (int i3 = 0; i3 != bArr2.length; i3++) {
            byte b2 = bArr2[i3];
            if (j <= LONG_LIMIT) {
                long j3 = j + (b2 & ByteCompanionObject.MAX_VALUE);
                if ((b2 & ByteCompanionObject.MIN_VALUE) == 0) {
                    if (z10) {
                        z10 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(j3);
                    j = 0;
                } else {
                    j = j3 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf(b2 & ByteCompanionObject.MAX_VALUE));
                if ((b2 & ByteCompanionObject.MIN_VALUE) == 0) {
                    if (z10) {
                        z10 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(or);
                    bigInteger = null;
                    j = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.identifier = stringBuffer.toString();
        this.contents = z2 ? Arrays.clone(bArr2) : bArr2;
    }
}
