package org.bouncycastle.util;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Vector;
import kotlin.UByte;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.util.encoders.UTF8;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Strings {
    private static String LINE_SEPARATOR;

    public static class StringListImpl extends ArrayList<String> implements StringList {
        private StringListImpl() {
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List, org.bouncycastle.util.StringList
        public /* bridge */ /* synthetic */ String get(int i3) {
            return (String) super.get(i3);
        }

        @Override // org.bouncycastle.util.StringList
        public String[] toStringArray() {
            int size = size();
            String[] strArr = new String[size];
            for (int i3 = 0; i3 != size; i3++) {
                strArr[i3] = get(i3);
            }
            return strArr;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public void add(int i3, String str) {
            super.add(i3, (int) str);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public String set(int i3, String str) {
            return (String) super.set(i3, (int) str);
        }

        @Override // org.bouncycastle.util.StringList
        public String[] toStringArray(int i3, int i10) {
            String[] strArr = new String[i10 - i3];
            for (int i11 = i3; i11 != size() && i11 != i10; i11++) {
                strArr[i11 - i3] = get(i11);
            }
            return strArr;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(String str) {
            return super.add((StringListImpl) str);
        }
    }

    static {
        try {
            try {
                LINE_SEPARATOR = (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: org.bouncycastle.util.Strings.1
                    @Override // java.security.PrivilegedAction
                    public String run() {
                        return System.getProperty(StubApp.getString2(2731));
                    }
                });
            } catch (Exception unused) {
                LINE_SEPARATOR = StubApp.getString2(3692);
            }
        } catch (Exception unused2) {
            LINE_SEPARATOR = String.format(StubApp.getString2("4901"), new Object[0]);
        }
    }

    public static char[] asCharArray(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i3 = 0; i3 != length; i3++) {
            cArr[i3] = (char) (bArr[i3] & UByte.MAX_VALUE);
        }
        return cArr;
    }

    public static boolean constantTimeAreEqual(String str, String str2) {
        boolean z2 = str.length() == str2.length();
        int length = str.length();
        if (z2) {
            for (int i3 = 0; i3 != length; i3++) {
                z2 &= str.charAt(i3) == str2.charAt(i3);
            }
            return z2;
        }
        for (int i10 = 0; i10 != length; i10++) {
            z2 &= str.charAt(i10) == ' ';
        }
        return z2;
    }

    public static String fromByteArray(byte[] bArr) {
        return new String(asCharArray(bArr));
    }

    public static String fromUTF8ByteArray(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int transcodeToUTF16 = UTF8.transcodeToUTF16(bArr, cArr);
        if (transcodeToUTF16 >= 0) {
            return new String(cArr, 0, transcodeToUTF16);
        }
        throw new IllegalArgumentException(StubApp.getString2(34984));
    }

    public static String lineSeparator() {
        return LINE_SEPARATOR;
    }

    public static StringList newList() {
        return new StringListImpl();
    }

    public static String[] split(String str, char c10) {
        int i3;
        Vector vector = new Vector();
        boolean z2 = true;
        while (true) {
            if (!z2) {
                break;
            }
            int indexOf = str.indexOf(c10);
            if (indexOf > 0) {
                vector.addElement(str.substring(0, indexOf));
                str = str.substring(indexOf + 1);
            } else {
                vector.addElement(str);
                z2 = false;
            }
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (i3 = 0; i3 != size; i3++) {
            strArr[i3] = (String) vector.elementAt(i3);
        }
        return strArr;
    }

    public static int toByteArray(String str, byte[] bArr, int i3) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i3 + i10] = (byte) str.charAt(i10);
        }
        return length;
    }

    public static String toLowerCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z2 = false;
        for (int i3 = 0; i3 != charArray.length; i3++) {
            char c10 = charArray[i3];
            if ('A' <= c10 && 'Z' >= c10) {
                charArray[i3] = (char) (c10 + ' ');
                z2 = true;
            }
        }
        return z2 ? new String(charArray) : str;
    }

    public static void toUTF8ByteArray(char[] cArr, OutputStream outputStream) throws IOException {
        int i3;
        int i10;
        int i11 = 0;
        while (i11 < cArr.length) {
            char c10 = cArr[i11];
            int i12 = c10;
            if (c10 >= 128) {
                if (c10 < 2048) {
                    i3 = (c10 >> 6) | 192;
                } else if (c10 < 55296 || c10 > 57343) {
                    outputStream.write((c10 >> '\f') | BERTags.FLAGS);
                    i3 = ((c10 >> 6) & 63) | 128;
                } else {
                    i11++;
                    int length = cArr.length;
                    String string2 = StubApp.getString2(34985);
                    if (i11 >= length) {
                        throw new IllegalStateException(string2);
                    }
                    char c11 = cArr[i11];
                    if (c10 > 56319) {
                        throw new IllegalStateException(string2);
                    }
                    int i13 = (((c10 & 1023) << 10) | (c11 & 1023)) + PKIFailureInfo.notAuthorized;
                    outputStream.write((i13 >> 18) | 240);
                    outputStream.write(((i13 >> 12) & 63) | 128);
                    outputStream.write(((i13 >> 6) & 63) | 128);
                    i10 = i13;
                    i12 = (i10 & 63) | 128;
                }
                outputStream.write(i3);
                i10 = c10;
                i12 = (i10 & 63) | 128;
            }
            outputStream.write(i12);
            i11++;
        }
    }

    public static String toUpperCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z2 = false;
        for (int i3 = 0; i3 != charArray.length; i3++) {
            char c10 = charArray[i3];
            if ('a' <= c10 && 'z' >= c10) {
                charArray[i3] = (char) (c10 - ' ');
                z2 = true;
            }
        }
        return z2 ? new String(charArray) : str;
    }

    public static String fromUTF8ByteArray(byte[] bArr, int i3, int i10) {
        char[] cArr = new char[i10];
        int transcodeToUTF16 = UTF8.transcodeToUTF16(bArr, i3, i10, cArr);
        if (transcodeToUTF16 >= 0) {
            return new String(cArr, 0, transcodeToUTF16);
        }
        throw new IllegalArgumentException(StubApp.getString2(34984));
    }

    public static byte[] toByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 != length; i3++) {
            bArr[i3] = (byte) str.charAt(i3);
        }
        return bArr;
    }

    public static byte[] toUTF8ByteArray(String str) {
        return toUTF8ByteArray(str.toCharArray());
    }

    public static byte[] toByteArray(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 != length; i3++) {
            bArr[i3] = (byte) cArr[i3];
        }
        return bArr;
    }

    public static byte[] toUTF8ByteArray(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            toUTF8ByteArray(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException(StubApp.getString2(34986));
        }
    }
}
