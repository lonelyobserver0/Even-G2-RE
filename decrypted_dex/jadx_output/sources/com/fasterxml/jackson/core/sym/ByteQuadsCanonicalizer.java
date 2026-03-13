package com.fasterxml.jackson.core.sym;

import Xa.h;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ByteQuadsCanonicalizer {
    protected int _count;
    protected final boolean _failOnDoS;
    protected int[] _hashArea;
    protected boolean _hashShared;
    protected int _hashSize;
    protected final boolean _intern;
    protected int _longNameOffset;
    protected String[] _names;
    protected final ByteQuadsCanonicalizer _parent;
    protected int _secondaryStart;
    protected final int _seed;
    protected int _spilloverEnd;
    protected final AtomicReference<TableInfo> _tableInfo;
    protected int _tertiaryShift;
    protected int _tertiaryStart;

    private ByteQuadsCanonicalizer(int i3, int i10) {
        this._parent = null;
        this._count = 0;
        this._hashShared = true;
        this._seed = i10;
        this._intern = false;
        this._failOnDoS = true;
        int i11 = 16;
        if (i3 >= 16) {
            if (((i3 - 1) & i3) != 0) {
                while (i11 < i3) {
                    i11 += i11;
                }
            }
            this._tableInfo = new AtomicReference<>(TableInfo.createInitial(i3));
        }
        i3 = i11;
        this._tableInfo = new AtomicReference<>(TableInfo.createInitial(i3));
    }

    private int _appendLongName(int[] iArr, int i3) {
        int i10 = this._longNameOffset;
        int i11 = i10 + i3;
        int[] iArr2 = this._hashArea;
        if (i11 > iArr2.length) {
            this._hashArea = Arrays.copyOf(this._hashArea, Math.max(i11 - iArr2.length, Math.min(4096, this._hashSize)) + this._hashArea.length);
        }
        System.arraycopy(iArr, 0, this._hashArea, i10, i3);
        this._longNameOffset += i3;
        return i10;
    }

    private final int _calcOffset(int i3) {
        return (i3 & (this._hashSize - 1)) << 2;
    }

    public static int _calcTertiaryShift(int i3) {
        int i10 = i3 >> 2;
        if (i10 < 64) {
            return 4;
        }
        if (i10 <= 256) {
            return 5;
        }
        return i10 <= 1024 ? 6 : 7;
    }

    private boolean _checkNeedForRehash() {
        if (this._count <= (this._hashSize >> 1)) {
            return false;
        }
        int _spilloverStart = (this._spilloverEnd - _spilloverStart()) >> 2;
        int i3 = this._count;
        return _spilloverStart > ((i3 + 1) >> 7) || ((double) i3) > ((double) this._hashSize) * 0.8d;
    }

    private int _findOffsetForAdd(int i3) {
        int _calcOffset = _calcOffset(i3);
        int[] iArr = this._hashArea;
        if (iArr[_calcOffset + 3] == 0) {
            return _calcOffset;
        }
        if (_checkNeedForRehash()) {
            return _resizeAndFindOffsetForAdd(i3);
        }
        int i10 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        if (iArr[i10 + 3] == 0) {
            return i10;
        }
        int i11 = this._tertiaryStart;
        int i12 = this._tertiaryShift;
        int i13 = i11 + ((_calcOffset >> (i12 + 2)) << i12);
        int i14 = (1 << i12) + i13;
        while (i13 < i14) {
            if (iArr[i13 + 3] == 0) {
                return i13;
            }
            i13 += 4;
        }
        int i15 = this._spilloverEnd;
        int i16 = i15 + 4;
        this._spilloverEnd = i16;
        if (i16 < (this._hashSize << 3)) {
            return i15;
        }
        if (this._failOnDoS) {
            _reportTooManyCollisions();
        }
        return _resizeAndFindOffsetForAdd(i3);
    }

    private String _findSecondary(int i3, int i10) {
        int i11 = this._tertiaryStart;
        int i12 = this._tertiaryShift;
        int i13 = i11 + ((i3 >> (i12 + 2)) << i12);
        int[] iArr = this._hashArea;
        int i14 = (1 << i12) + i13;
        while (i13 < i14) {
            int i15 = iArr[i13 + 3];
            if (i10 == iArr[i13] && 1 == i15) {
                return this._names[i13 >> 2];
            }
            if (i15 == 0) {
                return null;
            }
            i13 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i10 == iArr[_spilloverStart] && 1 == iArr[_spilloverStart + 3]) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    private int _resizeAndFindOffsetForAdd(int i3) {
        rehash();
        int _calcOffset = _calcOffset(i3);
        int[] iArr = this._hashArea;
        if (iArr[_calcOffset + 3] == 0) {
            return _calcOffset;
        }
        int i10 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        if (iArr[i10 + 3] == 0) {
            return i10;
        }
        int i11 = this._tertiaryStart;
        int i12 = this._tertiaryShift;
        int i13 = i11 + ((_calcOffset >> (i12 + 2)) << i12);
        int i14 = (1 << i12) + i13;
        while (i13 < i14) {
            if (iArr[i13 + 3] == 0) {
                return i13;
            }
            i13 += 4;
        }
        int i15 = this._spilloverEnd;
        this._spilloverEnd = i15 + 4;
        return i15;
    }

    private final int _spilloverStart() {
        int i3 = this._hashSize;
        return (i3 << 3) - i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean _verifyLongName(int[] r8, int r9, int r10) {
        /*
            r7 = this;
            int[] r0 = r7._hashArea
            r1 = 1
            r2 = 0
            switch(r9) {
                case 4: goto L42;
                case 5: goto L34;
                case 6: goto L26;
                case 7: goto L18;
                case 8: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r8 = r7._verifyLongName2(r8, r9, r10)
            return r8
        Lc:
            r9 = r8[r2]
            int r3 = r10 + 1
            r10 = r0[r10]
            if (r9 == r10) goto L15
            return r2
        L15:
            r9 = r1
            r10 = r3
            goto L19
        L18:
            r9 = r2
        L19:
            int r3 = r9 + 1
            r9 = r8[r9]
            int r4 = r10 + 1
            r10 = r0[r10]
            if (r9 == r10) goto L24
            return r2
        L24:
            r10 = r4
            goto L27
        L26:
            r3 = r2
        L27:
            int r9 = r3 + 1
            r3 = r8[r3]
            int r4 = r10 + 1
            r10 = r0[r10]
            if (r3 == r10) goto L32
            return r2
        L32:
            r10 = r4
            goto L35
        L34:
            r9 = r2
        L35:
            int r3 = r9 + 1
            r9 = r8[r9]
            int r4 = r10 + 1
            r10 = r0[r10]
            if (r9 == r10) goto L40
            return r2
        L40:
            r10 = r4
            goto L43
        L42:
            r3 = r2
        L43:
            int r9 = r3 + 1
            r4 = r8[r3]
            int r5 = r10 + 1
            r6 = r0[r10]
            if (r4 == r6) goto L4e
            return r2
        L4e:
            int r4 = r3 + 2
            r9 = r8[r9]
            int r6 = r10 + 2
            r5 = r0[r5]
            if (r9 == r5) goto L59
            return r2
        L59:
            int r3 = r3 + 3
            r9 = r8[r4]
            int r10 = r10 + 3
            r4 = r0[r6]
            if (r9 == r4) goto L64
            return r2
        L64:
            r8 = r8[r3]
            r9 = r0[r10]
            if (r8 == r9) goto L6b
            return r2
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._verifyLongName(int[], int, int):boolean");
    }

    private boolean _verifyLongName2(int[] iArr, int i3, int i10) {
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            int i13 = i10 + 1;
            if (iArr[i11] != this._hashArea[i10]) {
                return false;
            }
            if (i12 >= i3) {
                return true;
            }
            i11 = i12;
            i10 = i13;
        }
    }

    private void _verifySharing() {
        if (this._hashShared) {
            if (this._parent == null) {
                if (this._count != 0) {
                    throw new IllegalStateException(StubApp.getString2(10476));
                }
                throw new IllegalStateException(StubApp.getString2(10475));
            }
            int[] iArr = this._hashArea;
            this._hashArea = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this._names;
            this._names = (String[]) Arrays.copyOf(strArr, strArr.length);
            this._hashShared = false;
        }
    }

    public static ByteQuadsCanonicalizer createRoot() {
        long currentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    private void mergeChild(TableInfo tableInfo) {
        int i3 = tableInfo.count;
        TableInfo tableInfo2 = this._tableInfo.get();
        if (i3 == tableInfo2.count) {
            return;
        }
        if (i3 > 6000) {
            tableInfo = TableInfo.createInitial(64);
        }
        AtomicReference<TableInfo> atomicReference = this._tableInfo;
        while (!atomicReference.compareAndSet(tableInfo2, tableInfo) && atomicReference.get() == tableInfo2) {
        }
    }

    private void nukeSymbols(boolean z2) {
        this._count = 0;
        this._spilloverEnd = _spilloverStart();
        this._longNameOffset = this._hashSize << 3;
        if (z2) {
            Arrays.fill(this._hashArea, 0);
            Arrays.fill(this._names, (Object) null);
        }
    }

    private void rehash() {
        this._hashShared = false;
        int[] iArr = this._hashArea;
        String[] strArr = this._names;
        int i3 = this._hashSize;
        int i10 = this._count;
        int i11 = i3 + i3;
        int i12 = this._spilloverEnd;
        if (i11 > 65536) {
            nukeSymbols(true);
            return;
        }
        this._hashArea = new int[iArr.length + (i3 << 3)];
        this._hashSize = i11;
        int i13 = i11 << 2;
        this._secondaryStart = i13;
        this._tertiaryStart = i13 + (i13 >> 1);
        this._tertiaryShift = _calcTertiaryShift(i11);
        this._names = new String[strArr.length << 1];
        nukeSymbols(false);
        int[] iArr2 = new int[16];
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15 += 4) {
            int i16 = iArr[i15 + 3];
            if (i16 != 0) {
                i14++;
                String str = strArr[i15 >> 2];
                if (i16 == 1) {
                    iArr2[0] = iArr[i15];
                    addName(str, iArr2, 1);
                } else if (i16 == 2) {
                    iArr2[0] = iArr[i15];
                    iArr2[1] = iArr[i15 + 1];
                    addName(str, iArr2, 2);
                } else if (i16 != 3) {
                    if (i16 > iArr2.length) {
                        iArr2 = new int[i16];
                    }
                    System.arraycopy(iArr, iArr[i15 + 1], iArr2, 0, i16);
                    addName(str, iArr2, i16);
                } else {
                    iArr2[0] = iArr[i15];
                    iArr2[1] = iArr[i15 + 1];
                    iArr2[2] = iArr[i15 + 2];
                    addName(str, iArr2, 3);
                }
            }
        }
        if (i14 != i10) {
            throw new IllegalStateException(h.o(StubApp.getString2(10477), i10, i14, StubApp.getString2(10478)));
        }
    }

    public void _reportTooManyCollisions() {
        if (this._hashSize <= 1024) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(10479));
        sb2.append(this._count);
        sb2.append(StubApp.getString2(10480));
        sb2.append(this._hashSize);
        sb2.append(StubApp.getString2(10481));
        throw new IllegalStateException(AbstractC1482f.f(this._hashSize >> 3, StubApp.getString2(10482), sb2));
    }

    public String addName(String str, int i3) {
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int _findOffsetForAdd = _findOffsetForAdd(calcHash(i3));
        int[] iArr = this._hashArea;
        iArr[_findOffsetForAdd] = i3;
        iArr[_findOffsetForAdd + 3] = 1;
        this._names[_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public int calcHash(int i3) {
        int i10 = i3 ^ this._seed;
        int i11 = i10 + (i10 >>> 16);
        int i12 = i11 ^ (i11 << 3);
        return i12 + (i12 >>> 12);
    }

    public String findName(int i3) {
        int _calcOffset = _calcOffset(calcHash(i3));
        int[] iArr = this._hashArea;
        int i10 = iArr[_calcOffset + 3];
        if (i10 == 1) {
            if (iArr[_calcOffset] == i3) {
                return this._names[_calcOffset >> 2];
            }
        } else if (i10 == 0) {
            return null;
        }
        int i11 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i12 = iArr[i11 + 3];
        if (i12 == 1) {
            if (iArr[i11] == i3) {
                return this._names[i11 >> 2];
            }
        } else if (i12 == 0) {
            return null;
        }
        return _findSecondary(_calcOffset, i3);
    }

    public boolean isCanonicalizing() {
        return this._parent != null;
    }

    public ByteQuadsCanonicalizer makeChild(int i3) {
        return new ByteQuadsCanonicalizer(this, this._seed, this._tableInfo.get(), JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i3), JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i3));
    }

    public ByteQuadsCanonicalizer makeChildOrPlaceholder(int i3) {
        return JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i3) ? new ByteQuadsCanonicalizer(this, this._seed, this._tableInfo.get(), JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i3), JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i3)) : new ByteQuadsCanonicalizer(this._tableInfo.get());
    }

    public boolean maybeDirty() {
        return !this._hashShared;
    }

    public int primaryCount() {
        int i3 = this._secondaryStart;
        int i10 = 0;
        for (int i11 = 3; i11 < i3; i11 += 4) {
            if (this._hashArea[i11] != 0) {
                i10++;
            }
        }
        return i10;
    }

    public void release() {
        if (this._parent == null || !maybeDirty()) {
            return;
        }
        this._parent.mergeChild(new TableInfo(this));
        this._hashShared = true;
    }

    public int secondaryCount() {
        int i3 = this._tertiaryStart;
        int i10 = 0;
        for (int i11 = this._secondaryStart + 3; i11 < i3; i11 += 4) {
            if (this._hashArea[i11] != 0) {
                i10++;
            }
        }
        return i10;
    }

    public int spilloverCount() {
        return (this._spilloverEnd - _spilloverStart()) >> 2;
    }

    public int tertiaryCount() {
        int i3 = this._tertiaryStart + 3;
        int i10 = this._hashSize + i3;
        int i11 = 0;
        while (i3 < i10) {
            if (this._hashArea[i3] != 0) {
                i11++;
            }
            i3 += 4;
        }
        return i11;
    }

    public String toString() {
        int primaryCount = primaryCount();
        int secondaryCount = secondaryCount();
        int tertiaryCount = tertiaryCount();
        int spilloverCount = spilloverCount();
        return String.format(StubApp.getString2(10483), ByteQuadsCanonicalizer.class.getName(), Integer.valueOf(this._count), Integer.valueOf(this._hashSize), Integer.valueOf(primaryCount), Integer.valueOf(secondaryCount), Integer.valueOf(tertiaryCount), Integer.valueOf(spilloverCount), Integer.valueOf(primaryCount + secondaryCount + tertiaryCount + spilloverCount), Integer.valueOf(totalCount()));
    }

    public int totalCount() {
        int i3 = this._hashSize << 3;
        int i10 = 0;
        for (int i11 = 3; i11 < i3; i11 += 4) {
            if (this._hashArea[i11] != 0) {
                i10++;
            }
        }
        return i10;
    }

    public int calcHash(int i3, int i10) {
        int i11 = i3 + (i3 >>> 15);
        int i12 = this._seed ^ ((i10 * 33) + (i11 ^ (i11 >>> 9)));
        int i13 = i12 + (i12 >>> 16);
        int i14 = i13 ^ (i13 >>> 4);
        return i14 + (i14 << 3);
    }

    public static ByteQuadsCanonicalizer createRoot(int i3) {
        return new ByteQuadsCanonicalizer(64, i3);
    }

    public int calcHash(int i3, int i10, int i11) {
        int i12 = i3 ^ this._seed;
        int i13 = (((i12 + (i12 >>> 9)) * 31) + i10) * 33;
        int i14 = (i13 + (i13 >>> 15)) ^ i11;
        int i15 = i14 + (i14 >>> 4);
        int i16 = i15 + (i15 >>> 15);
        return i16 ^ (i16 << 9);
    }

    public int calcHash(int[] iArr, int i3) {
        if (i3 >= 4) {
            int i10 = iArr[0] ^ this._seed;
            int i11 = i10 + (i10 >>> 9) + iArr[1];
            int i12 = ((i11 + (i11 >>> 15)) * 33) ^ iArr[2];
            int i13 = i12 + (i12 >>> 4);
            for (int i14 = 3; i14 < i3; i14++) {
                int i15 = iArr[i14];
                i13 += i15 ^ (i15 >> 21);
            }
            int i16 = i13 * 65599;
            int i17 = i16 + (i16 >>> 19);
            return (i17 << 5) ^ i17;
        }
        throw new IllegalArgumentException();
    }

    public static final class TableInfo {
        public final int count;
        public final int longNameOffset;
        public final int[] mainHash;
        public final String[] names;
        public final int size;
        public final int spilloverEnd;
        public final int tertiaryShift;

        public TableInfo(int i3, int i10, int i11, int[] iArr, String[] strArr, int i12, int i13) {
            this.size = i3;
            this.count = i10;
            this.tertiaryShift = i11;
            this.mainHash = iArr;
            this.names = strArr;
            this.spilloverEnd = i12;
            this.longNameOffset = i13;
        }

        public static TableInfo createInitial(int i3) {
            int i10 = i3 << 3;
            return new TableInfo(i3, 0, ByteQuadsCanonicalizer._calcTertiaryShift(i3), new int[i10], new String[i3 << 1], i10 - i3, i10);
        }

        public TableInfo(ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
            this.size = byteQuadsCanonicalizer._hashSize;
            this.count = byteQuadsCanonicalizer._count;
            this.tertiaryShift = byteQuadsCanonicalizer._tertiaryShift;
            this.mainHash = byteQuadsCanonicalizer._hashArea;
            this.names = byteQuadsCanonicalizer._names;
            this.spilloverEnd = byteQuadsCanonicalizer._spilloverEnd;
            this.longNameOffset = byteQuadsCanonicalizer._longNameOffset;
        }
    }

    private ByteQuadsCanonicalizer(ByteQuadsCanonicalizer byteQuadsCanonicalizer, int i3, TableInfo tableInfo, boolean z2, boolean z10) {
        this._parent = byteQuadsCanonicalizer;
        this._seed = i3;
        this._intern = z2;
        this._failOnDoS = z10;
        this._tableInfo = null;
        this._count = tableInfo.count;
        int i10 = tableInfo.size;
        this._hashSize = i10;
        int i11 = i10 << 2;
        this._secondaryStart = i11;
        this._tertiaryStart = i11 + (i11 >> 1);
        this._tertiaryShift = tableInfo.tertiaryShift;
        this._hashArea = tableInfo.mainHash;
        this._names = tableInfo.names;
        this._spilloverEnd = tableInfo.spilloverEnd;
        this._longNameOffset = tableInfo.longNameOffset;
        this._hashShared = true;
    }

    private String _findSecondary(int i3, int i10, int i11) {
        int i12 = this._tertiaryStart;
        int i13 = this._tertiaryShift;
        int i14 = i12 + ((i3 >> (i13 + 2)) << i13);
        int[] iArr = this._hashArea;
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            int i16 = iArr[i14 + 3];
            if (i10 == iArr[i14] && i11 == iArr[i14 + 1] && 2 == i16) {
                return this._names[i14 >> 2];
            }
            if (i16 == 0) {
                return null;
            }
            i14 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i10 == iArr[_spilloverStart] && i11 == iArr[_spilloverStart + 1] && 2 == iArr[_spilloverStart + 3]) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String addName(String str, int i3, int i10) {
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int _findOffsetForAdd = _findOffsetForAdd(calcHash(i3, i10));
        int[] iArr = this._hashArea;
        iArr[_findOffsetForAdd] = i3;
        iArr[_findOffsetForAdd + 1] = i10;
        iArr[_findOffsetForAdd + 3] = 2;
        this._names[_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public String findName(int i3, int i10) {
        int _calcOffset = _calcOffset(calcHash(i3, i10));
        int[] iArr = this._hashArea;
        int i11 = iArr[_calcOffset + 3];
        if (i11 == 2) {
            if (i3 == iArr[_calcOffset] && i10 == iArr[_calcOffset + 1]) {
                return this._names[_calcOffset >> 2];
            }
        } else if (i11 == 0) {
            return null;
        }
        int i12 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i13 = iArr[i12 + 3];
        if (i13 == 2) {
            if (i3 == iArr[i12] && i10 == iArr[i12 + 1]) {
                return this._names[i12 >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        return _findSecondary(_calcOffset, i3, i10);
    }

    private String _findSecondary(int i3, int i10, int i11, int i12) {
        int i13 = this._tertiaryStart;
        int i14 = this._tertiaryShift;
        int i15 = i13 + ((i3 >> (i14 + 2)) << i14);
        int[] iArr = this._hashArea;
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            int i17 = iArr[i15 + 3];
            if (i10 == iArr[i15] && i11 == iArr[i15 + 1] && i12 == iArr[i15 + 2] && 3 == i17) {
                return this._names[i15 >> 2];
            }
            if (i17 == 0) {
                return null;
            }
            i15 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i10 == iArr[_spilloverStart] && i11 == iArr[_spilloverStart + 1] && i12 == iArr[_spilloverStart + 2] && 3 == iArr[_spilloverStart + 3]) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String addName(String str, int i3, int i10, int i11) {
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int _findOffsetForAdd = _findOffsetForAdd(calcHash(i3, i10, i11));
        int[] iArr = this._hashArea;
        iArr[_findOffsetForAdd] = i3;
        iArr[_findOffsetForAdd + 1] = i10;
        iArr[_findOffsetForAdd + 2] = i11;
        iArr[_findOffsetForAdd + 3] = 3;
        this._names[_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public String findName(int i3, int i10, int i11) {
        int _calcOffset = _calcOffset(calcHash(i3, i10, i11));
        int[] iArr = this._hashArea;
        int i12 = iArr[_calcOffset + 3];
        if (i12 == 3) {
            if (i3 == iArr[_calcOffset] && iArr[_calcOffset + 1] == i10 && iArr[_calcOffset + 2] == i11) {
                return this._names[_calcOffset >> 2];
            }
        } else if (i12 == 0) {
            return null;
        }
        int i13 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i14 = iArr[i13 + 3];
        if (i14 == 3) {
            if (i3 == iArr[i13] && iArr[i13 + 1] == i10 && iArr[i13 + 2] == i11) {
                return this._names[i13 >> 2];
            }
        } else if (i14 == 0) {
            return null;
        }
        return _findSecondary(_calcOffset, i3, i10, i11);
    }

    private ByteQuadsCanonicalizer(TableInfo tableInfo) {
        this._parent = null;
        this._seed = 0;
        this._intern = false;
        this._failOnDoS = true;
        this._tableInfo = null;
        this._count = -1;
        int[] iArr = tableInfo.mainHash;
        this._hashArea = iArr;
        this._names = tableInfo.names;
        this._hashSize = tableInfo.size;
        int length = iArr.length;
        this._secondaryStart = length;
        this._tertiaryStart = length;
        this._tertiaryShift = 1;
        this._spilloverEnd = length;
        this._longNameOffset = length;
        this._hashShared = true;
    }

    private String _findSecondary(int i3, int i10, int[] iArr, int i11) {
        int i12 = this._tertiaryStart;
        int i13 = this._tertiaryShift;
        int i14 = i12 + ((i3 >> (i13 + 2)) << i13);
        int[] iArr2 = this._hashArea;
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            int i16 = iArr2[i14 + 3];
            if (i10 == iArr2[i14] && i11 == i16 && _verifyLongName(iArr, i11, iArr2[i14 + 1])) {
                return this._names[i14 >> 2];
            }
            if (i16 == 0) {
                return null;
            }
            i14 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i10 == iArr2[_spilloverStart] && i11 == iArr2[_spilloverStart + 3] && _verifyLongName(iArr, i11, iArr2[_spilloverStart + 1])) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String addName(String str, int[] iArr, int i3) {
        int _findOffsetForAdd;
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        if (i3 == 1) {
            _findOffsetForAdd = _findOffsetForAdd(calcHash(iArr[0]));
            int[] iArr2 = this._hashArea;
            iArr2[_findOffsetForAdd] = iArr[0];
            iArr2[_findOffsetForAdd + 3] = 1;
        } else if (i3 == 2) {
            _findOffsetForAdd = _findOffsetForAdd(calcHash(iArr[0], iArr[1]));
            int[] iArr3 = this._hashArea;
            iArr3[_findOffsetForAdd] = iArr[0];
            iArr3[_findOffsetForAdd + 1] = iArr[1];
            iArr3[_findOffsetForAdd + 3] = 2;
        } else if (i3 != 3) {
            int calcHash = calcHash(iArr, i3);
            _findOffsetForAdd = _findOffsetForAdd(calcHash);
            this._hashArea[_findOffsetForAdd] = calcHash;
            int _appendLongName = _appendLongName(iArr, i3);
            int[] iArr4 = this._hashArea;
            iArr4[_findOffsetForAdd + 1] = _appendLongName;
            iArr4[_findOffsetForAdd + 3] = i3;
        } else {
            int _findOffsetForAdd2 = _findOffsetForAdd(calcHash(iArr[0], iArr[1], iArr[2]));
            int[] iArr5 = this._hashArea;
            iArr5[_findOffsetForAdd2] = iArr[0];
            iArr5[_findOffsetForAdd2 + 1] = iArr[1];
            iArr5[_findOffsetForAdd2 + 2] = iArr[2];
            iArr5[_findOffsetForAdd2 + 3] = 3;
            _findOffsetForAdd = _findOffsetForAdd2;
        }
        this._names[_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public String findName(int[] iArr, int i3) {
        if (i3 < 4) {
            if (i3 == 1) {
                return findName(iArr[0]);
            }
            if (i3 == 2) {
                return findName(iArr[0], iArr[1]);
            }
            if (i3 != 3) {
                return "";
            }
            return findName(iArr[0], iArr[1], iArr[2]);
        }
        int calcHash = calcHash(iArr, i3);
        int _calcOffset = _calcOffset(calcHash);
        int[] iArr2 = this._hashArea;
        int i10 = iArr2[_calcOffset + 3];
        if (calcHash == iArr2[_calcOffset] && i10 == i3 && _verifyLongName(iArr, i3, iArr2[_calcOffset + 1])) {
            return this._names[_calcOffset >> 2];
        }
        if (i10 == 0) {
            return null;
        }
        int i11 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i12 = iArr2[i11 + 3];
        if (calcHash == iArr2[i11] && i12 == i3 && _verifyLongName(iArr, i3, iArr2[i11 + 1])) {
            return this._names[i11 >> 2];
        }
        return _findSecondary(_calcOffset, calcHash, iArr, i3);
    }
}
