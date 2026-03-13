package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.stub.StubApp;
import java.util.Arrays;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class JsonStringEncoder {
    private static final char[] HC = CharTypes.copyHexChars(true);
    private static final byte[] HB = CharTypes.copyHexBytes(true);
    private static final JsonStringEncoder instance = new JsonStringEncoder();

    private int _appendByte(int i3, int i10, ByteArrayBuilder byteArrayBuilder, int i11) {
        byteArrayBuilder.setCurrentSegmentLength(i11);
        byteArrayBuilder.append(92);
        if (i10 < 0) {
            byteArrayBuilder.append(117);
            if (i3 > 255) {
                byte[] bArr = HB;
                byteArrayBuilder.append(bArr[i3 >> 12]);
                byteArrayBuilder.append(bArr[(i3 >> 8) & 15]);
                i3 &= 255;
            } else {
                byteArrayBuilder.append(48);
                byteArrayBuilder.append(48);
            }
            byte[] bArr2 = HB;
            byteArrayBuilder.append(bArr2[i3 >> 4]);
            byteArrayBuilder.append(bArr2[i3 & 15]);
        } else {
            byteArrayBuilder.append((byte) i10);
        }
        return byteArrayBuilder.getCurrentSegmentLength();
    }

    private int _appendNamed(int i3, char[] cArr) {
        cArr[1] = (char) i3;
        return 2;
    }

    private int _appendNumeric(int i3, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = HC;
        cArr[4] = cArr2[i3 >> 4];
        cArr[5] = cArr2[i3 & 15];
        return 6;
    }

    private static int _convert(int i3, int i10) {
        if (i10 >= 56320 && i10 <= 57343) {
            return (i10 - 56320) + ((i3 - 55296) << 10) + PKIFailureInfo.notAuthorized;
        }
        throw new IllegalArgumentException(StubApp.getString2(10375) + Integer.toHexString(i3) + StubApp.getString2(10376) + Integer.toHexString(i10) + StubApp.getString2(10377));
    }

    private static void _illegal(int i3) {
        throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(i3));
    }

    public static int _initialByteBufSize(int i3) {
        return Math.min(Math.max(24, i3 + 6 + (i3 >> 1)), 32000);
    }

    public static int _initialCharBufSize(int i3) {
        return Math.min(Math.max(16, Math.min((i3 >> 3) + 6, 1000) + i3), 32000);
    }

    private char[] _qbuf() {
        return new char[]{'\\', 0, '0', '0', 0, 0};
    }

    public static JsonStringEncoder getInstance() {
        return instance;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] encodeAsUTF8(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.encodeAsUTF8(java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        r9 = r7 + 1;
        r7 = r13.charAt(r7);
        r10 = r2[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r10 >= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r7 = _appendNumeric(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r10 = r8 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r10 <= r1.length) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r10 = r1.length - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r10 <= 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        java.lang.System.arraycopy(r6, 0, r1, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r5 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r5 = com.fasterxml.jackson.core.util.TextBuffer.fromInitial(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        r1 = r5.finishCurrentSegment();
        r7 = r7 - r10;
        java.lang.System.arraycopy(r6, r10, r1, 0, r7);
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        java.lang.System.arraycopy(r6, 0, r1, r8, r7);
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
    
        r7 = _appendNamed(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r6 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r6 = _qbuf();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public char[] quoteAsString(java.lang.String r13) {
        /*
            r12 = this;
            int r0 = r13.length()
            int r1 = _initialCharBufSize(r0)
            char[] r1 = new char[r1]
            int[] r2 = com.fasterxml.jackson.core.io.CharTypes.get7BitOutputEscapes()
            int r3 = r2.length
            r4 = 0
            r5 = 0
            r7 = r4
            r8 = r7
            r6 = r5
        L14:
            if (r7 >= r0) goto L75
        L16:
            char r9 = r13.charAt(r7)
            if (r9 >= r3) goto L5b
            r10 = r2[r9]
            if (r10 == 0) goto L5b
            if (r6 != 0) goto L26
            char[] r6 = r12._qbuf()
        L26:
            int r9 = r7 + 1
            char r7 = r13.charAt(r7)
            r10 = r2[r7]
            if (r10 >= 0) goto L35
            int r7 = r12._appendNumeric(r7, r6)
            goto L39
        L35:
            int r7 = r12._appendNamed(r10, r6)
        L39:
            int r10 = r8 + r7
            int r11 = r1.length
            if (r10 <= r11) goto L55
            int r10 = r1.length
            int r10 = r10 - r8
            if (r10 <= 0) goto L45
            java.lang.System.arraycopy(r6, r4, r1, r8, r10)
        L45:
            if (r5 != 0) goto L4b
            com.fasterxml.jackson.core.util.TextBuffer r5 = com.fasterxml.jackson.core.util.TextBuffer.fromInitial(r1)
        L4b:
            char[] r1 = r5.finishCurrentSegment()
            int r7 = r7 - r10
            java.lang.System.arraycopy(r6, r10, r1, r4, r7)
            r8 = r7
            goto L59
        L55:
            java.lang.System.arraycopy(r6, r4, r1, r8, r7)
            r8 = r10
        L59:
            r7 = r9
            goto L14
        L5b:
            int r10 = r1.length
            if (r8 < r10) goto L69
            if (r5 != 0) goto L64
            com.fasterxml.jackson.core.util.TextBuffer r5 = com.fasterxml.jackson.core.util.TextBuffer.fromInitial(r1)
        L64:
            char[] r1 = r5.finishCurrentSegment()
            r8 = r4
        L69:
            int r10 = r8 + 1
            r1[r8] = r9
            int r7 = r7 + 1
            if (r7 < r0) goto L73
            r8 = r10
            goto L75
        L73:
            r8 = r10
            goto L16
        L75:
            if (r5 != 0) goto L7c
            char[] r13 = java.util.Arrays.copyOfRange(r1, r4, r8)
            return r13
        L7c:
            r5.setCurrentLength(r8)
            char[] r13 = r5.contentsAsArray()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.quoteAsString(java.lang.String):char[]");
    }

    public byte[] quoteAsUTF8(String str) {
        int i3;
        int i10;
        int i11;
        int length = str.length();
        byte[] bArr = new byte[_initialByteBufSize(length)];
        ByteArrayBuilder byteArrayBuilder = null;
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            if (i12 >= length) {
                break;
            }
            int[] iArr = CharTypes.get7BitOutputEscapes();
            while (true) {
                char charAt = str.charAt(i12);
                if (charAt > 127 || iArr[charAt] != 0) {
                    break;
                }
                if (i13 >= bArr.length) {
                    if (byteArrayBuilder == null) {
                        byteArrayBuilder = ByteArrayBuilder.fromInitial(bArr, i13);
                    }
                    bArr = byteArrayBuilder.finishCurrentSegment();
                    i13 = 0;
                }
                int i14 = i13 + 1;
                bArr[i13] = (byte) charAt;
                i12++;
                if (i12 >= length) {
                    i13 = i14;
                    break loop0;
                }
                i13 = i14;
            }
            if (byteArrayBuilder == null) {
                byteArrayBuilder = ByteArrayBuilder.fromInitial(bArr, i13);
            }
            if (i13 >= bArr.length) {
                bArr = byteArrayBuilder.finishCurrentSegment();
                i13 = 0;
            }
            int i15 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 <= 127) {
                i13 = _appendByte(charAt2, iArr[charAt2], byteArrayBuilder, i13);
                bArr = byteArrayBuilder.getCurrentSegment();
            } else {
                if (charAt2 <= 2047) {
                    i11 = i13 + 1;
                    bArr[i13] = (byte) ((charAt2 >> 6) | 192);
                    i10 = (charAt2 & '?') | 128;
                } else {
                    if (charAt2 < 55296 || charAt2 > 57343) {
                        int i16 = i13 + 1;
                        bArr[i13] = (byte) ((charAt2 >> '\f') | BERTags.FLAGS);
                        if (i16 >= bArr.length) {
                            bArr = byteArrayBuilder.finishCurrentSegment();
                            i16 = 0;
                        }
                        bArr[i16] = (byte) (((charAt2 >> 6) & 63) | 128);
                        i3 = i16 + 1;
                        i10 = (charAt2 & '?') | 128;
                    } else {
                        if (charAt2 > 56319) {
                            _illegal(charAt2);
                        }
                        if (i15 >= length) {
                            _illegal(charAt2);
                        }
                        int i17 = i12 + 2;
                        int _convert = _convert(charAt2, str.charAt(i15));
                        if (_convert > 1114111) {
                            _illegal(_convert);
                        }
                        int i18 = i13 + 1;
                        bArr[i13] = (byte) ((_convert >> 18) | 240);
                        if (i18 >= bArr.length) {
                            bArr = byteArrayBuilder.finishCurrentSegment();
                            i18 = 0;
                        }
                        int i19 = i18 + 1;
                        bArr[i18] = (byte) (((_convert >> 12) & 63) | 128);
                        if (i19 >= bArr.length) {
                            bArr = byteArrayBuilder.finishCurrentSegment();
                            i19 = 0;
                        }
                        int i20 = i19 + 1;
                        bArr[i19] = (byte) (((_convert >> 6) & 63) | 128);
                        i10 = (_convert & 63) | 128;
                        i3 = i20;
                        i15 = i17;
                    }
                    i11 = i3;
                }
                if (i11 >= bArr.length) {
                    bArr = byteArrayBuilder.finishCurrentSegment();
                    i11 = 0;
                }
                bArr[i11] = (byte) i10;
                i13 = i11 + 1;
            }
            i12 = i15;
        }
        return byteArrayBuilder == null ? Arrays.copyOfRange(bArr, 0, i13) : byteArrayBuilder.completeAndCoalesce(i13);
    }
}
