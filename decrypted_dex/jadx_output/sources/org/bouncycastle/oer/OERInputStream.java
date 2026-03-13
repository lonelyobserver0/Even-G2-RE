package org.bouncycastle.oer;

import Xa.h;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Iterator;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.encoders.Hex;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OERInputStream extends FilterInputStream {
    private static final int[] bits = {1, 2, 4, 8, 16, 32, 64, 128};
    private static final int[] bitsR = {128, 64, 32, 16, 8, 4, 2, 1};
    protected PrintWriter debugOutput;
    protected PrintWriter debugStream;
    private int maxByteAllocation;

    /* renamed from: org.bouncycastle.oer.OERInputStream$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType;

        static {
            int[] iArr = new int[OERDefinition.BaseType.values().length];
            $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType = iArr;
            try {
                iArr[OERDefinition.BaseType.OPAQUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.Switch.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.Supplier.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.SEQ_OF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.SEQ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.CHOICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.ENUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.INT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.OCTET_STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.IA5String.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.UTF8_STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.BIT_STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.NULL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.EXTENSION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.BOOLEAN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static class Choice extends OERInputStream {
        final int preamble;
        final int tag;
        final int tagClass;

        public Choice(InputStream inputStream) throws IOException {
            super(inputStream);
            int read;
            int read2 = read();
            this.preamble = read2;
            if (read2 < 0) {
                throw new EOFException(StubApp.getString2(33110));
            }
            this.tagClass = read2 & 192;
            int i3 = read2 & 63;
            if (i3 >= 63) {
                i3 = 0;
                do {
                    read = inputStream.read();
                    if (read < 0) {
                        throw new EOFException(StubApp.getString2(33109));
                    }
                    i3 = (i3 << 7) | (read & CertificateBody.profileType);
                } while ((read & 128) != 0);
            }
            this.tag = i3;
        }

        public int getTag() {
            return this.tag;
        }

        public int getTagClass() {
            return this.tagClass;
        }

        public boolean isApplicationTagClass() {
            return this.tagClass == 64;
        }

        public boolean isContextSpecific() {
            return this.tagClass == 128;
        }

        public boolean isPrivateTagClass() {
            return this.tagClass == 192;
        }

        public boolean isUniversalTagClass() {
            return this.tagClass == 0;
        }

        public String toString() {
            String string2;
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(33111));
            int i3 = this.tagClass;
            if (i3 == 0) {
                string2 = StubApp.getString2(33115);
            } else if (i3 == 64) {
                string2 = StubApp.getString2(33114);
            } else {
                if (i3 != 128) {
                    if (i3 == 192) {
                        string2 = StubApp.getString2(33112);
                    }
                    sb2.append(StubApp.getString2(33116) + this.tag);
                    sb2.append(StubApp.getString2(74));
                    return sb2.toString();
                }
                string2 = StubApp.getString2(33113);
            }
            sb2.append(string2);
            sb2.append(StubApp.getString2(33116) + this.tag);
            sb2.append(StubApp.getString2(74));
            return sb2.toString();
        }
    }

    public static final class LengthInfo {
        private final BigInteger length;
        private final boolean shortForm;

        public LengthInfo(BigInteger bigInteger, boolean z2) {
            this.length = bigInteger;
            this.shortForm = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int intLength() {
            return BigIntegers.intValueExact(this.length);
        }
    }

    public static class Sequence extends OERInputStream {
        private final boolean extensionFlagSet;
        private final int preamble;
        private final boolean[] valuePresent;

        public Sequence(InputStream inputStream, Element element) throws IOException {
            super(inputStream);
            int i3;
            if (!element.hasPopulatedExtension() && element.getOptionals() <= 0 && !element.hasDefaultChildren()) {
                this.preamble = 0;
                this.extensionFlagSet = false;
                this.valuePresent = null;
                return;
            }
            int read = ((FilterInputStream) this).in.read();
            this.preamble = read;
            if (read < 0) {
                throw new EOFException(StubApp.getString2(33118));
            }
            this.extensionFlagSet = element.hasPopulatedExtension() && (read & 128) == 128;
            this.valuePresent = new boolean[element.getChildren().size()];
            int i10 = element.hasPopulatedExtension() ? 6 : 7;
            int i11 = 0;
            for (Element element2 : element.getChildren()) {
                if (element2.getBaseType() != OERDefinition.BaseType.EXTENSION) {
                    if (element2.getBlock() != 0) {
                        return;
                    }
                    if (element2.isExplicit()) {
                        i3 = i11 + 1;
                        this.valuePresent[i11] = true;
                    } else {
                        if (i10 < 0) {
                            read = inputStream.read();
                            if (read < 0) {
                                throw new EOFException(StubApp.getString2(33117));
                            }
                            i10 = 7;
                        }
                        i3 = i11 + 1;
                        this.valuePresent[i11] = (OERInputStream.bits[i10] & read) > 0;
                        i10--;
                    }
                    i11 = i3;
                }
            }
        }

        public boolean hasExtension() {
            return this.extensionFlagSet;
        }

        public boolean hasOptional(int i3) {
            return this.valuePresent[i3];
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(33119));
            sb2.append(hasExtension() ? StubApp.getString2(33120) : "");
            if (this.valuePresent != null) {
                int i3 = 0;
                while (true) {
                    boolean[] zArr = this.valuePresent;
                    if (i3 >= zArr.length) {
                        break;
                    }
                    sb2.append(zArr[i3] ? StubApp.getString2(878) : StubApp.getString2(824));
                    i3++;
                }
            } else {
                sb2.append(StubApp.getString2(602));
            }
            sb2.append(StubApp.getString2(74));
            return sb2.toString();
        }
    }

    public OERInputStream(InputStream inputStream) {
        super(inputStream);
        this.debugOutput = null;
        this.maxByteAllocation = PKIFailureInfo.badCertTemplate;
        this.debugStream = null;
    }

    private ASN1Encodable absent(Element element) {
        debugPrint(element + StubApp.getString2(33121));
        return OEROptional.ABSENT;
    }

    private byte[] allocateArray(int i3) {
        if (i3 <= this.maxByteAllocation) {
            return new byte[i3];
        }
        StringBuilder u2 = h.u(i3, StubApp.getString2(33122), StubApp.getString2(33123));
        u2.append(this.maxByteAllocation);
        throw new IllegalArgumentException(u2.toString());
    }

    private int countOptionalChildTypes(Element element) {
        Iterator<Element> it = element.getChildren().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += !it.next().isExplicit() ? 1 : 0;
        }
        return i3;
    }

    public static ASN1Encodable parse(byte[] bArr, Element element) throws IOException {
        return new OERInputStream(new ByteArrayInputStream(bArr)).parse(element);
    }

    public Choice choice() throws IOException {
        return new Choice(this);
    }

    public void debugPrint(String str) {
        if (this.debugOutput == null) {
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i3 = -1;
        for (int i10 = 0; i10 != stackTrace.length; i10++) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (stackTraceElement.getMethodName().equals(StubApp.getString2(33124))) {
                i3 = 0;
            } else if (stackTraceElement.getClassName().contains(StubApp.getString2(33125))) {
                i3++;
            }
        }
        while (true) {
            PrintWriter printWriter = this.debugOutput;
            if (i3 <= 0) {
                printWriter.append((CharSequence) str).append((CharSequence) StubApp.getString2(3692));
                this.debugOutput.flush();
                return;
            } else {
                printWriter.append((CharSequence) StubApp.getString2(6147));
                i3--;
            }
        }
    }

    public BigInteger enumeration() throws IOException {
        int read = read();
        if (read == -1) {
            throw new EOFException(StubApp.getString2(33127));
        }
        if ((read & 128) != 128) {
            return BigInteger.valueOf(read);
        }
        int i3 = read & CertificateBody.profileType;
        if (i3 == 0) {
            return BigInteger.ZERO;
        }
        byte[] bArr = new byte[i3];
        if (Streams.readFully(this, bArr) == i3) {
            return new BigInteger(1, bArr);
        }
        throw new EOFException(StubApp.getString2(33126));
    }

    public BigInteger int16() throws Exception {
        return parseInt(false, 2);
    }

    public BigInteger int32() throws Exception {
        return parseInt(false, 4);
    }

    public BigInteger int64() throws Exception {
        return parseInt(false, 8);
    }

    public BigInteger int8() throws Exception {
        return parseInt(false, 1);
    }

    public BigInteger parseInt(boolean z2, int i3) throws Exception {
        byte[] bArr = new byte[i3];
        if (Streams.readFully(this, bArr) == i3) {
            return z2 ? new BigInteger(1, bArr) : new BigInteger(bArr);
        }
        throw new IllegalStateException(StubApp.getString2(33150));
    }

    public ASN1Encodable parseOpenType(Element element) throws IOException {
        byte[] allocateArray = allocateArray(readLength().intLength());
        if (Streams.readFully(((FilterInputStream) this).in, allocateArray) != allocateArray.length) {
            throw new IOException(StubApp.getString2(33151));
        }
        OERInputStream oERInputStream = null;
        try {
            OERInputStream oERInputStream2 = new OERInputStream(new ByteArrayInputStream(allocateArray));
            try {
                ASN1Object parse = oERInputStream2.parse(element);
                oERInputStream2.close();
                return parse;
            } catch (Throwable th) {
                th = th;
                oERInputStream = oERInputStream2;
                if (oERInputStream != null) {
                    oERInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public LengthInfo readLength() throws IOException {
        int read = read();
        if (read == -1) {
            throw new EOFException(StubApp.getString2(33156));
        }
        if ((read & 128) == 0) {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(33152));
            int i3 = read & CertificateBody.profileType;
            sb2.append(i3);
            debugPrint(sb2.toString());
            return new LengthInfo(BigInteger.valueOf(i3), true);
        }
        int i10 = read & CertificateBody.profileType;
        byte[] bArr = new byte[i10];
        if (Streams.readFully(this, bArr) != i10) {
            throw new EOFException(StubApp.getString2(33155));
        }
        StringBuilder u2 = h.u(i10, StubApp.getString2(33153), StubApp.getString2(33154));
        u2.append(Hex.toHexString(bArr));
        debugPrint(u2.toString());
        return new LengthInfo(BigIntegers.fromUnsignedByteArray(bArr), false);
    }

    public BigInteger uint16() throws Exception {
        return parseInt(true, 2);
    }

    public BigInteger uint32() throws Exception {
        return parseInt(true, 4);
    }

    public BigInteger uint64() throws Exception {
        return parseInt(false, 8);
    }

    public BigInteger uint8() throws Exception {
        return parseInt(true, 1);
    }

    public OERInputStream(InputStream inputStream, int i3) {
        super(inputStream);
        this.debugOutput = null;
        this.debugStream = null;
        this.maxByteAllocation = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x04ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.bouncycastle.asn1.ASN1Object parse(org.bouncycastle.oer.Element r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.oer.OERInputStream.parse(org.bouncycastle.oer.Element):org.bouncycastle.asn1.ASN1Object");
    }
}
