package com.fasterxml.jackson.core.io;

import com.stub.StubApp;
import java.util.Arrays;
import org.bouncycastle.asn1.BERTags;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class CharTypes {
    protected static final byte[] HB;
    protected static final byte[] HBlower;
    protected static final char[] HC;
    protected static final char[] HClower;
    protected static final int[] sHexValues;
    protected static final int[] sInputCodes;
    protected static final int[] sInputCodesComment;
    protected static final int[] sInputCodesJsNames;
    protected static final int[] sInputCodesUTF8;
    protected static final int[] sInputCodesUtf8JsNames;
    protected static final int[] sInputCodesWS;
    protected static final int[] sOutputEscapes128;

    public static class AltEscapes {
        public static final AltEscapes instance = new AltEscapes();
        private int[][] _altEscapes = new int[128][];

        private AltEscapes() {
        }

        public int[] escapesFor(int i3) {
            int[] iArr = this._altEscapes[i3];
            if (iArr == null) {
                iArr = Arrays.copyOf(CharTypes.sOutputEscapes128, 128);
                if (iArr[i3] == 0) {
                    iArr[i3] = -1;
                }
                this._altEscapes[i3] = iArr;
            }
            return iArr;
        }
    }

    static {
        char[] charArray = StubApp.getString2(3365).toCharArray();
        HC = charArray;
        HClower = StubApp.getString2(10372).toCharArray();
        int length = charArray.length;
        HB = new byte[length];
        HBlower = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            HB[i3] = (byte) HC[i3];
            HBlower[i3] = (byte) HClower[i3];
        }
        int[] iArr = new int[256];
        for (int i10 = 0; i10 < 32; i10++) {
            iArr[i10] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        sInputCodes = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i11 = 128; i11 < 256; i11++) {
            iArr2[i11] = (i11 & BERTags.FLAGS) == 192 ? 2 : (i11 & 240) == 224 ? 3 : (i11 & 248) == 240 ? 4 : -1;
        }
        sInputCodesUTF8 = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i12 = 33; i12 < 256; i12++) {
            if (Character.isJavaIdentifierPart((char) i12)) {
                iArr3[i12] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        sInputCodesJsNames = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        sInputCodesUtf8JsNames = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = sInputCodesUTF8;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        sInputCodesComment = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        sInputCodesWS = iArr7;
        int[] iArr8 = new int[128];
        for (int i13 = 0; i13 < 32; i13++) {
            iArr8[i13] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        sOutputEscapes128 = iArr8;
        int[] iArr9 = new int[256];
        sHexValues = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i14 = 0; i14 < 10; i14++) {
            sHexValues[i14 + 48] = i14;
        }
        for (int i15 = 0; i15 < 6; i15++) {
            int[] iArr10 = sHexValues;
            int i16 = i15 + 10;
            iArr10[i15 + 97] = i16;
            iArr10[i15 + 65] = i16;
        }
    }

    public static void appendQuoted(StringBuilder sb2, String str) {
        int[] iArr = sOutputEscapes128;
        int length = iArr.length;
        int length2 = str.length();
        for (int i3 = 0; i3 < length2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt >= length || iArr[charAt] == 0) {
                sb2.append(charAt);
            } else {
                sb2.append('\\');
                int i10 = iArr[charAt];
                if (i10 < 0) {
                    sb2.append('u');
                    sb2.append('0');
                    sb2.append('0');
                    char[] cArr = HC;
                    sb2.append(cArr[charAt >> 4]);
                    sb2.append(cArr[charAt & 15]);
                } else {
                    sb2.append((char) i10);
                }
            }
        }
    }

    public static int charToHex(int i3) {
        return sHexValues[i3 & 255];
    }

    public static byte[] copyHexBytes(boolean z2) {
        return (byte[]) (z2 ? HB.clone() : HBlower.clone());
    }

    public static char[] copyHexChars(boolean z2) {
        return (char[]) (z2 ? HC.clone() : HClower.clone());
    }

    public static int[] get7BitOutputEscapes() {
        return sOutputEscapes128;
    }

    public static int[] getInputCodeComment() {
        return sInputCodesComment;
    }

    public static int[] getInputCodeLatin1() {
        return sInputCodes;
    }

    public static int[] getInputCodeLatin1JsNames() {
        return sInputCodesJsNames;
    }

    public static int[] getInputCodeUtf8() {
        return sInputCodesUTF8;
    }

    public static int[] getInputCodeUtf8JsNames() {
        return sInputCodesUtf8JsNames;
    }

    public static char hexToChar(int i3) {
        return HC[i3];
    }

    public static int[] get7BitOutputEscapes(int i3) {
        return i3 == 34 ? sOutputEscapes128 : AltEscapes.instance.escapesFor(i3);
    }
}
