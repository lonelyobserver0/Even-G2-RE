package org.bouncycastle.oer;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OEROutputStream extends OutputStream {
    private static final int[] bits = {1, 2, 4, 8, 16, 32, 64, 128};
    protected PrintWriter debugOutput = null;
    private final OutputStream out;

    /* renamed from: org.bouncycastle.oer.OEROutputStream$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType;

        static {
            int[] iArr = new int[OERDefinition.BaseType.values().length];
            $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType = iArr;
            try {
                iArr[OERDefinition.BaseType.Supplier.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.SEQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.SEQ_OF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.CHOICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.ENUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.INT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.OCTET_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.IA5String.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.UTF8_STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.BIT_STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.EXTENSION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.ENUM_ITEM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.BOOLEAN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public OEROutputStream(OutputStream outputStream) {
        this.out = outputStream;
    }

    public static int byteLength(long j) {
        int i3 = 8;
        while (i3 > 0 && ((-72057594037927936L) & j) == 0) {
            j <<= 8;
            i3--;
        }
        return i3;
    }

    private void encodeLength(long j) throws IOException {
        if (j <= 127) {
            this.out.write((int) j);
            return;
        }
        byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(BigInteger.valueOf(j));
        this.out.write(asUnsignedByteArray.length | 128);
        this.out.write(asUnsignedByteArray);
    }

    private void encodeQuantity(long j) throws IOException {
        byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(BigInteger.valueOf(j));
        this.out.write(asUnsignedByteArray.length);
        this.out.write(asUnsignedByteArray);
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

    @Override // java.io.OutputStream
    public void write(int i3) throws IOException {
        this.out.write(i3);
    }

    public void writePlainType(ASN1Encodable aSN1Encodable, Element element) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OEROutputStream oEROutputStream = new OEROutputStream(byteArrayOutputStream);
        oEROutputStream.write(aSN1Encodable, element);
        oEROutputStream.flush();
        oEROutputStream.close();
        encodeLength(byteArrayOutputStream.size());
        write(byteArrayOutputStream.toByteArray());
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(org.bouncycastle.asn1.ASN1Encodable r13, org.bouncycastle.oer.Element r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.oer.OEROutputStream.write(org.bouncycastle.asn1.ASN1Encodable, org.bouncycastle.oer.Element):void");
    }
}
