package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CharsToNameCanonicalizer {
    protected Bucket[] _buckets;
    protected boolean _canonicalize;
    protected final int _flags;
    protected boolean _hashShared;
    protected int _indexMask;
    protected int _longestCollisionList;
    protected BitSet _overflows;
    protected final CharsToNameCanonicalizer _parent;
    protected final int _seed;
    protected int _size;
    protected int _sizeThreshold;
    protected String[] _symbols;
    protected final AtomicReference<TableInfo> _tableInfo;

    public static final class Bucket {
        public final int length;
        public final Bucket next;
        public final String symbol;

        public Bucket(String str, Bucket bucket) {
            this.symbol = str;
            this.next = bucket;
            this.length = bucket != null ? 1 + bucket.length : 1;
        }

        public String has(char[] cArr, int i3, int i10) {
            if (this.symbol.length() != i10) {
                return null;
            }
            int i11 = 0;
            while (this.symbol.charAt(i11) == cArr[i3 + i11]) {
                i11++;
                if (i11 >= i10) {
                    return this.symbol;
                }
            }
            return null;
        }
    }

    private CharsToNameCanonicalizer(int i3) {
        this._parent = null;
        this._seed = i3;
        this._canonicalize = true;
        this._flags = -1;
        this._hashShared = false;
        this._longestCollisionList = 0;
        this._tableInfo = new AtomicReference<>(TableInfo.createInitial(64));
    }

    private String _addSymbol(char[] cArr, int i3, int i10, int i11, int i12) {
        if (this._hashShared) {
            copyArrays();
            this._hashShared = false;
        } else if (this._size >= this._sizeThreshold) {
            rehash();
            i12 = _hashToIndex(calcHash(cArr, i3, i10));
        }
        String str = new String(cArr, i3, i10);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this._flags)) {
            str = InternCache.instance.intern(str);
        }
        this._size++;
        String[] strArr = this._symbols;
        if (strArr[i12] == null) {
            strArr[i12] = str;
            return str;
        }
        int i13 = i12 >> 1;
        Bucket bucket = new Bucket(str, this._buckets[i13]);
        int i14 = bucket.length;
        if (i14 > 150) {
            _handleSpillOverflow(i13, bucket, i12);
            return str;
        }
        this._buckets[i13] = bucket;
        this._longestCollisionList = Math.max(i14, this._longestCollisionList);
        return str;
    }

    private String _findSymbol2(char[] cArr, int i3, int i10, Bucket bucket) {
        while (bucket != null) {
            String has = bucket.has(cArr, i3, i10);
            if (has != null) {
                return has;
            }
            bucket = bucket.next;
        }
        return null;
    }

    private void _handleSpillOverflow(int i3, Bucket bucket, int i10) {
        BitSet bitSet = this._overflows;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this._overflows = bitSet2;
            bitSet2.set(i3);
        } else if (bitSet.get(i3)) {
            if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this._flags)) {
                _reportTooManyCollisions(150);
            }
            this._canonicalize = false;
        } else {
            this._overflows.set(i3);
        }
        this._symbols[i10] = bucket.symbol;
        this._buckets[i3] = null;
        this._size -= bucket.length;
        this._longestCollisionList = -1;
    }

    private static int _thresholdSize(int i3) {
        return i3 - (i3 >> 2);
    }

    private void copyArrays() {
        String[] strArr = this._symbols;
        this._symbols = (String[]) Arrays.copyOf(strArr, strArr.length);
        Bucket[] bucketArr = this._buckets;
        this._buckets = (Bucket[]) Arrays.copyOf(bucketArr, bucketArr.length);
    }

    public static CharsToNameCanonicalizer createRoot() {
        long currentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    private void mergeChild(TableInfo tableInfo) {
        int i3 = tableInfo.size;
        TableInfo tableInfo2 = this._tableInfo.get();
        if (i3 == tableInfo2.size) {
            return;
        }
        if (i3 > 12000) {
            tableInfo = TableInfo.createInitial(64);
        }
        AtomicReference<TableInfo> atomicReference = this._tableInfo;
        while (!atomicReference.compareAndSet(tableInfo2, tableInfo) && atomicReference.get() == tableInfo2) {
        }
    }

    private void rehash() {
        String[] strArr = this._symbols;
        int length = strArr.length;
        int i3 = length + length;
        if (i3 > 65536) {
            this._size = 0;
            this._canonicalize = false;
            this._symbols = new String[64];
            this._buckets = new Bucket[32];
            this._indexMask = 63;
            this._hashShared = false;
            return;
        }
        Bucket[] bucketArr = this._buckets;
        this._symbols = new String[i3];
        this._buckets = new Bucket[i3 >> 1];
        this._indexMask = i3 - 1;
        this._sizeThreshold = _thresholdSize(i3);
        int i10 = 0;
        int i11 = 0;
        for (String str : strArr) {
            if (str != null) {
                i10++;
                int _hashToIndex = _hashToIndex(calcHash(str));
                String[] strArr2 = this._symbols;
                if (strArr2[_hashToIndex] == null) {
                    strArr2[_hashToIndex] = str;
                } else {
                    int i12 = _hashToIndex >> 1;
                    Bucket bucket = new Bucket(str, this._buckets[i12]);
                    this._buckets[i12] = bucket;
                    i11 = Math.max(i11, bucket.length);
                }
            }
        }
        int i13 = length >> 1;
        for (int i14 = 0; i14 < i13; i14++) {
            for (Bucket bucket2 = bucketArr[i14]; bucket2 != null; bucket2 = bucket2.next) {
                i10++;
                String str2 = bucket2.symbol;
                int _hashToIndex2 = _hashToIndex(calcHash(str2));
                String[] strArr3 = this._symbols;
                if (strArr3[_hashToIndex2] == null) {
                    strArr3[_hashToIndex2] = str2;
                } else {
                    int i15 = _hashToIndex2 >> 1;
                    Bucket bucket3 = new Bucket(str2, this._buckets[i15]);
                    this._buckets[i15] = bucket3;
                    i11 = Math.max(i11, bucket3.length);
                }
            }
        }
        this._longestCollisionList = i11;
        this._overflows = null;
        if (i10 == this._size) {
            return;
        }
        throw new IllegalStateException(String.format(StubApp.getString2(10484), Integer.valueOf(this._size), Integer.valueOf(i10)));
    }

    public int _hashToIndex(int i3) {
        int i10 = i3 + (i3 >>> 15);
        int i11 = i10 ^ (i10 << 7);
        return (i11 + (i11 >>> 3)) & this._indexMask;
    }

    public void _reportTooManyCollisions(int i3) {
        throw new IllegalStateException(StubApp.getString2(10485) + this._size + StubApp.getString2(10486) + i3 + StubApp.getString2(10487));
    }

    public int calcHash(char[] cArr, int i3, int i10) {
        int i11 = this._seed;
        int i12 = i10 + i3;
        while (i3 < i12) {
            i11 = (i11 * 33) + cArr[i3];
            i3++;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public String findSymbol(char[] cArr, int i3, int i10, int i11) {
        if (i10 < 1) {
            return "";
        }
        if (!this._canonicalize) {
            return new String(cArr, i3, i10);
        }
        int _hashToIndex = _hashToIndex(i11);
        String str = this._symbols[_hashToIndex];
        if (str != null) {
            if (str.length() == i10) {
                int i12 = 0;
                while (str.charAt(i12) == cArr[i3 + i12]) {
                    i12++;
                    if (i12 == i10) {
                        return str;
                    }
                }
            }
            Bucket bucket = this._buckets[_hashToIndex >> 1];
            if (bucket != null) {
                String has = bucket.has(cArr, i3, i10);
                if (has != null) {
                    return has;
                }
                String _findSymbol2 = _findSymbol2(cArr, i3, i10, bucket.next);
                if (_findSymbol2 != null) {
                    return _findSymbol2;
                }
            }
        }
        return _addSymbol(cArr, i3, i10, i11, _hashToIndex);
    }

    public int hashSeed() {
        return this._seed;
    }

    public CharsToNameCanonicalizer makeChild(int i3) {
        return new CharsToNameCanonicalizer(this, i3, this._seed, this._tableInfo.get());
    }

    public boolean maybeDirty() {
        return !this._hashShared;
    }

    public void release() {
        CharsToNameCanonicalizer charsToNameCanonicalizer;
        if (maybeDirty() && (charsToNameCanonicalizer = this._parent) != null && this._canonicalize) {
            charsToNameCanonicalizer.mergeChild(new TableInfo(this));
            this._hashShared = true;
        }
    }

    public static CharsToNameCanonicalizer createRoot(int i3) {
        return new CharsToNameCanonicalizer(i3);
    }

    public int calcHash(String str) {
        int length = str.length();
        int i3 = this._seed;
        for (int i10 = 0; i10 < length; i10++) {
            i3 = (i3 * 33) + str.charAt(i10);
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public static final class TableInfo {
        final Bucket[] buckets;
        final int longestCollisionList;
        final int size;
        final String[] symbols;

        public TableInfo(int i3, int i10, String[] strArr, Bucket[] bucketArr) {
            this.size = i3;
            this.longestCollisionList = i10;
            this.symbols = strArr;
            this.buckets = bucketArr;
        }

        public static TableInfo createInitial(int i3) {
            return new TableInfo(0, 0, new String[i3], new Bucket[i3 >> 1]);
        }

        public TableInfo(CharsToNameCanonicalizer charsToNameCanonicalizer) {
            this.size = charsToNameCanonicalizer._size;
            this.longestCollisionList = charsToNameCanonicalizer._longestCollisionList;
            this.symbols = charsToNameCanonicalizer._symbols;
            this.buckets = charsToNameCanonicalizer._buckets;
        }
    }

    private CharsToNameCanonicalizer(CharsToNameCanonicalizer charsToNameCanonicalizer, int i3, int i10, TableInfo tableInfo) {
        this._parent = charsToNameCanonicalizer;
        this._seed = i10;
        this._tableInfo = null;
        this._flags = i3;
        this._canonicalize = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i3);
        String[] strArr = tableInfo.symbols;
        this._symbols = strArr;
        this._buckets = tableInfo.buckets;
        this._size = tableInfo.size;
        this._longestCollisionList = tableInfo.longestCollisionList;
        int length = strArr.length;
        this._sizeThreshold = _thresholdSize(length);
        this._indexMask = length - 1;
        this._hashShared = true;
    }
}
