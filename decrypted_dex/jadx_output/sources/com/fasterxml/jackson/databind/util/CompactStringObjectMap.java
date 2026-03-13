package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CompactStringObjectMap implements Serializable {
    private static final CompactStringObjectMap EMPTY = new CompactStringObjectMap(1, 0, new Object[4]);
    private final Object[] _hashArea;
    private final int _hashMask;
    private final int _spillCount;

    private CompactStringObjectMap(int i3, int i10, Object[] objArr) {
        this._hashMask = i3;
        this._spillCount = i10;
        this._hashArea = objArr;
    }

    private final Object _find2(String str, int i3, Object obj) {
        if (obj == null) {
            return null;
        }
        int i10 = this._hashMask + 1;
        int i11 = ((i3 >> 1) + i10) << 1;
        Object obj2 = this._hashArea[i11];
        if (str.equals(obj2)) {
            return this._hashArea[i11 + 1];
        }
        if (obj2 != null) {
            int i12 = (i10 + (i10 >> 1)) << 1;
            int i13 = this._spillCount + i12;
            while (i12 < i13) {
                Object obj3 = this._hashArea[i12];
                if (obj3 == str || str.equals(obj3)) {
                    return this._hashArea[i12 + 1];
                }
                i12 += 2;
            }
        }
        return null;
    }

    public static <T> CompactStringObjectMap construct(Map<String, T> map) {
        if (map.isEmpty()) {
            return EMPTY;
        }
        int findSize = findSize(map.size());
        int i3 = findSize - 1;
        int i10 = (findSize >> 1) + findSize;
        Object[] objArr = new Object[i10 * 2];
        int i11 = 0;
        for (Map.Entry<String, T> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                int hashCode = key.hashCode() & i3;
                int i12 = hashCode + hashCode;
                if (objArr[i12] != null) {
                    i12 = ((hashCode >> 1) + findSize) << 1;
                    if (objArr[i12] != null) {
                        i12 = (i10 << 1) + i11;
                        i11 += 2;
                        if (i12 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i12] = key;
                objArr[i12 + 1] = entry.getValue();
            }
        }
        return new CompactStringObjectMap(i3, i11, objArr);
    }

    private static final int findSize(int i3) {
        if (i3 <= 5) {
            return 8;
        }
        if (i3 <= 12) {
            return 16;
        }
        int i10 = 32;
        while (i10 < i3 + (i3 >> 2)) {
            i10 += i10;
        }
        return i10;
    }

    public Object find(String str) {
        int hashCode = str.hashCode() & this._hashMask;
        int i3 = hashCode << 1;
        Object obj = this._hashArea[i3];
        return (obj == str || str.equals(obj)) ? this._hashArea[i3 + 1] : _find2(str, hashCode, obj);
    }

    public Object findCaseInsensitive(String str) {
        int length = this._hashArea.length;
        for (int i3 = 0; i3 < length; i3 += 2) {
            Object obj = this._hashArea[i3];
            if (obj != null && ((String) obj).equalsIgnoreCase(str)) {
                return this._hashArea[i3 + 1];
            }
        }
        return null;
    }

    public List<String> keys() {
        int length = this._hashArea.length;
        ArrayList arrayList = new ArrayList(length >> 2);
        for (int i3 = 0; i3 < length; i3 += 2) {
            Object obj = this._hashArea[i3];
            if (obj != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }
}
