package org.bouncycastle.crypto.util;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import kotlin.UByte;
import org.bouncycastle.crypto.AlphabetMapper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BasicAlphabetMapper implements AlphabetMapper {
    private Map<Integer, Character> charMap;
    private Map<Character, Integer> indexMap;

    public BasicAlphabetMapper(String str) {
        this(str.toCharArray());
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public char[] convertToChars(byte[] bArr) {
        int i3 = 0;
        if (this.charMap.size() <= 256) {
            char[] cArr = new char[bArr.length];
            while (i3 != bArr.length) {
                cArr[i3] = this.charMap.get(Integer.valueOf(bArr[i3] & UByte.MAX_VALUE)).charValue();
                i3++;
            }
            return cArr;
        }
        if ((bArr.length & 1) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(29336));
        }
        char[] cArr2 = new char[bArr.length / 2];
        while (i3 != bArr.length) {
            cArr2[i3 / 2] = this.charMap.get(Integer.valueOf(((bArr[i3] << 8) & 65280) | (bArr[i3 + 1] & UByte.MAX_VALUE))).charValue();
            i3 += 2;
        }
        return cArr2;
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public byte[] convertToIndexes(char[] cArr) {
        int i3 = 0;
        if (this.indexMap.size() <= 256) {
            byte[] bArr = new byte[cArr.length];
            while (i3 != cArr.length) {
                bArr[i3] = this.indexMap.get(Character.valueOf(cArr[i3])).byteValue();
                i3++;
            }
            return bArr;
        }
        byte[] bArr2 = new byte[cArr.length * 2];
        while (i3 != cArr.length) {
            int intValue = this.indexMap.get(Character.valueOf(cArr[i3])).intValue();
            int i10 = i3 * 2;
            bArr2[i10] = (byte) ((intValue >> 8) & 255);
            bArr2[i10 + 1] = (byte) (intValue & 255);
            i3++;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public int getRadix() {
        return this.indexMap.size();
    }

    public BasicAlphabetMapper(char[] cArr) {
        this.indexMap = new HashMap();
        this.charMap = new HashMap();
        for (int i3 = 0; i3 != cArr.length; i3++) {
            if (this.indexMap.containsKey(Character.valueOf(cArr[i3]))) {
                throw new IllegalArgumentException(StubApp.getString2(29335) + cArr[i3]);
            }
            this.indexMap.put(Character.valueOf(cArr[i3]), Integer.valueOf(i3));
            this.charMap.put(Integer.valueOf(i3), Character.valueOf(cArr[i3]));
        }
    }
}
