package org.bouncycastle.crypto.generators;

import E1.a;
import Xa.h;
import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.Set;
import kotlin.UByte;
import kotlin.text.Typography;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OpenBSDBCrypt {
    private static final Set<String> allowedVersions;
    private static final String defaultVersion = StubApp.getString2(28955);
    private static final byte[] encodingTable = {46, 47, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
    private static final byte[] decodingTable = new byte[128];

    static {
        HashSet hashSet = new HashSet();
        allowedVersions = hashSet;
        hashSet.add(StubApp.getString2(4967));
        hashSet.add(StubApp.getString2(28953));
        hashSet.add(StubApp.getString2(28954));
        hashSet.add(StubApp.getString2(28955));
        hashSet.add(StubApp.getString2(28956));
        int i3 = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = decodingTable;
            if (i10 >= bArr.length) {
                break;
            }
            bArr[i10] = -1;
            i10++;
        }
        while (true) {
            byte[] bArr2 = encodingTable;
            if (i3 >= bArr2.length) {
                return;
            }
            decodingTable[bArr2[i3]] = (byte) i3;
            i3++;
        }
    }

    private OpenBSDBCrypt() {
    }

    public static boolean checkPassword(String str, byte[] bArr) {
        if (bArr != null) {
            return doCheckPassword(str, Arrays.clone(bArr));
        }
        throw new IllegalArgumentException(StubApp.getString2(28957));
    }

    private static String createBcryptString(String str, byte[] bArr, byte[] bArr2, int i3) {
        if (!allowedVersions.contains(str)) {
            throw new IllegalArgumentException(a.k(StubApp.getString2(28958), str, StubApp.getString2(28959)));
        }
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append(Typography.dollar);
        sb2.append(str);
        sb2.append(Typography.dollar);
        sb2.append(i3 < 10 ? u.p(i3, StubApp.getString2(824)) : Integer.toString(i3));
        sb2.append(Typography.dollar);
        encodeData(sb2, bArr2);
        encodeData(sb2, BCrypt.generate(bArr, bArr2, i3));
        return sb2.toString();
    }

    private static byte[] decodeSaltString(String str) {
        char[] charArray = str.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16);
        if (charArray.length != 22) {
            throw new DataLengthException(AbstractC1482f.f(charArray.length, StubApp.getString2(28962), new StringBuilder(StubApp.getString2(28961))));
        }
        for (char c10 : charArray) {
            if (c10 > 'z' || c10 < '.' || (c10 > '9' && c10 < 'A')) {
                throw new IllegalArgumentException(u.p(c10, StubApp.getString2(28960)));
            }
        }
        char[] cArr = new char[24];
        System.arraycopy(charArray, 0, cArr, 0, charArray.length);
        for (int i3 = 0; i3 < 24; i3 += 4) {
            byte[] bArr = decodingTable;
            byte b2 = bArr[cArr[i3]];
            byte b10 = bArr[cArr[i3 + 1]];
            byte b11 = bArr[cArr[i3 + 2]];
            byte b12 = bArr[cArr[i3 + 3]];
            byteArrayOutputStream.write((b2 << 2) | (b10 >> 4));
            byteArrayOutputStream.write((b10 << 4) | (b11 >> 2));
            byteArrayOutputStream.write(b12 | (b11 << 6));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr2 = new byte[16];
        System.arraycopy(byteArray, 0, bArr2, 0, 16);
        return bArr2;
    }

    private static boolean doCheckPassword(String str, byte[] bArr) {
        String substring;
        String string2 = StubApp.getString2(28963);
        if (str == null) {
            throw new IllegalArgumentException(StubApp.getString2(28971));
        }
        if (str.charAt(1) != '2') {
            throw new IllegalArgumentException(StubApp.getString2(28970));
        }
        int length = str.length();
        if (length != 60 && (length != 59 || str.charAt(2) != '$')) {
            throw new DataLengthException(h.g(length, StubApp.getString2(28964), StubApp.getString2(28965)));
        }
        char charAt = str.charAt(2);
        String string22 = StubApp.getString2(28966);
        int i3 = 3;
        if (charAt == '$') {
            if (str.charAt(0) != '$' || str.charAt(5) != '$') {
                throw new IllegalArgumentException(string22);
            }
        } else if (str.charAt(0) != '$' || str.charAt(3) != '$' || str.charAt(6) != '$') {
            throw new IllegalArgumentException(string22);
        }
        if (str.charAt(2) == '$') {
            substring = str.substring(1, 2);
        } else {
            substring = str.substring(1, 3);
            i3 = 4;
        }
        if (!allowedVersions.contains(substring)) {
            throw new IllegalArgumentException(a.k(StubApp.getString2(28968), substring, StubApp.getString2(28969)));
        }
        String substring2 = str.substring(i3, i3 + 2);
        try {
            int parseInt = Integer.parseInt(substring2);
            if (parseInt < 4 || parseInt > 31) {
                throw new IllegalArgumentException(h.g(parseInt, string2, StubApp.getString2(28967)));
            }
            return Strings.constantTimeAreEqual(str, doGenerate(substring, bArr, decodeSaltString(str.substring(str.lastIndexOf(36) + 1, length - 31)), parseInt));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(a.j(string2, substring2));
        }
    }

    private static String doGenerate(String str, byte[] bArr, byte[] bArr2, int i3) {
        if (!allowedVersions.contains(str)) {
            throw new IllegalArgumentException(a.k(StubApp.getString2(28958), str, StubApp.getString2(28959)));
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException(StubApp.getString2(28974));
        }
        if (bArr2.length != 16) {
            throw new DataLengthException(StubApp.getString2(28973) + bArr2.length);
        }
        if (i3 < 4 || i3 > 31) {
            throw new IllegalArgumentException(StubApp.getString2(28972));
        }
        int length = bArr.length < 72 ? bArr.length + 1 : 72;
        byte[] bArr3 = new byte[length];
        if (length > bArr.length) {
            length = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr3, 0, length);
        Arrays.fill(bArr, (byte) 0);
        String createBcryptString = createBcryptString(str, bArr3, bArr2, i3);
        Arrays.fill(bArr3, (byte) 0);
        return createBcryptString;
    }

    private static void encodeData(StringBuilder sb2, byte[] bArr) {
        boolean z2;
        if (bArr.length != 24 && bArr.length != 16) {
            throw new DataLengthException(AbstractC1482f.f(bArr.length, StubApp.getString2(28976), new StringBuilder(StubApp.getString2(28975))));
        }
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[18];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
            z2 = true;
        } else {
            bArr[bArr.length - 1] = 0;
            z2 = false;
        }
        int length = bArr.length;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int i10 = bArr[i3] & UByte.MAX_VALUE;
            int i11 = bArr[i3 + 1] & UByte.MAX_VALUE;
            byte b2 = bArr[i3 + 2];
            int i12 = b2 & UByte.MAX_VALUE;
            byte[] bArr3 = encodingTable;
            sb2.append((char) bArr3[(i10 >>> 2) & 63]);
            sb2.append((char) bArr3[((i10 << 4) | (i11 >>> 4)) & 63]);
            sb2.append((char) bArr3[((i11 << 2) | (i12 >>> 6)) & 63]);
            sb2.append((char) bArr3[b2 & 63]);
        }
        int length2 = sb2.length();
        sb2.setLength(z2 ? length2 - 2 : length2 - 1);
    }

    public static String generate(String str, byte[] bArr, byte[] bArr2, int i3) {
        if (bArr != null) {
            return doGenerate(str, Arrays.clone(bArr), bArr2, i3);
        }
        throw new IllegalArgumentException(StubApp.getString2(28977));
    }

    public static boolean checkPassword(String str, char[] cArr) {
        if (cArr != null) {
            return doCheckPassword(str, Strings.toUTF8ByteArray(cArr));
        }
        throw new IllegalArgumentException(StubApp.getString2(28957));
    }

    public static String generate(String str, char[] cArr, byte[] bArr, int i3) {
        if (cArr != null) {
            return doGenerate(str, Strings.toUTF8ByteArray(cArr), bArr, i3);
        }
        throw new IllegalArgumentException(StubApp.getString2(28977));
    }

    public static String generate(byte[] bArr, byte[] bArr2, int i3) {
        return generate(StubApp.getString2(28955), bArr, bArr2, i3);
    }

    public static String generate(char[] cArr, byte[] bArr, int i3) {
        return generate(StubApp.getString2(28955), cArr, bArr, i3);
    }
}
