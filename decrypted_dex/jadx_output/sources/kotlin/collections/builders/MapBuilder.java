package kotlin.collections.builders;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u0084\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00060\u0004j\u0002`\u0005:\f\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001BG\b\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0013J\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&J\b\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020!H\u0016J\u0015\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00100J\u0015\u00101\u001a\u00020!2\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00100J\u0018\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010/\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00103J\u001f\u00104\u001a\u0004\u0018\u00018\u00012\u0006\u0010/\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00105J\u001e\u00106\u001a\u00020*2\u0014\u00107\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0016J\u0017\u00108\u001a\u0004\u0018\u00018\u00012\u0006\u0010/\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00103J\b\u00109\u001a\u00020*H\u0016J\u0013\u0010E\u001a\u00020!2\b\u0010F\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010G\u001a\u00020\rH\u0016J\b\u0010H\u001a\u00020IH\u0016J\b\u0010N\u001a\u00020*H\u0002J\r\u0010O\u001a\u00020*H\u0000¢\u0006\u0002\bPJ\u0010\u0010Q\u001a\u00020*2\u0006\u0010R\u001a\u00020\rH\u0002J\u0010\u0010S\u001a\u00020!2\u0006\u0010T\u001a\u00020\rH\u0002J\u0010\u0010U\u001a\u00020*2\u0006\u0010V\u001a\u00020\rH\u0002J\u0013\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020\r2\u0006\u0010/\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010ZJ\u0010\u0010[\u001a\u00020*2\u0006\u0010\\\u001a\u00020!H\u0002J\u0010\u0010]\u001a\u00020*2\u0006\u0010^\u001a\u00020\rH\u0002J\u0010\u0010_\u001a\u00020!2\u0006\u0010`\u001a\u00020\rH\u0002J\u0015\u0010a\u001a\u00020\r2\u0006\u0010/\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010ZJ\u0015\u0010b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010ZJ\u0017\u0010c\u001a\u00020\r2\u0006\u0010/\u001a\u00028\u0000H\u0000¢\u0006\u0004\bd\u0010ZJ\u0017\u0010e\u001a\u00020!2\u0006\u0010/\u001a\u00028\u0000H\u0000¢\u0006\u0004\bf\u00100J\u0010\u0010g\u001a\u00020*2\u0006\u0010h\u001a\u00020\rH\u0002J\u0010\u0010i\u001a\u00020*2\u0006\u0010j\u001a\u00020\rH\u0002J!\u0010k\u001a\u00020!2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010mH\u0000¢\u0006\u0002\bnJ\u0018\u0010o\u001a\u00020!2\u000e\u0010F\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&H\u0002J\u0019\u0010p\u001a\u00020!2\n\u0010q\u001a\u0006\u0012\u0002\b\u00030rH\u0000¢\u0006\u0002\bsJ\u001c\u0010t\u001a\u00020!2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010mH\u0002J\"\u0010u\u001a\u00020!2\u0018\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010m0rH\u0002J!\u0010v\u001a\u00020!2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010mH\u0000¢\u0006\u0002\bwJ\u0017\u0010x\u001a\u00020!2\u0006\u0010y\u001a\u00028\u0001H\u0000¢\u0006\u0004\bz\u00100J\u0019\u0010{\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010|H\u0000¢\u0006\u0002\b}J\u001a\u0010~\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u007fH\u0000¢\u0006\u0003\b\u0080\u0001J\u001c\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0082\u0001H\u0000¢\u0006\u0003\b\u0083\u0001R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR&\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010C0;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010=R\u0014\u0010J\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u001aR\u0014\u0010L\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u001a¨\u0006\u008a\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "keysArray", "", "valuesArray", "presenceArray", "", "hashArray", "maxProbeDistance", "", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "[Ljava/lang/Object;", "hashShift", "modCount", "value", "size", "getSize", "()I", "keysView", "Lkotlin/collections/builders/MapBuilderKeys;", "valuesView", "Lkotlin/collections/builders/MapBuilderValues;", "entriesView", "Lkotlin/collections/builders/MapBuilderEntries;", "", "isReadOnly", "isReadOnly$kotlin_stdlib", "()Z", "build", "", "writeReplace", "", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "isEmpty", "containsKey", "key", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "remove", "clear", "keys", "", "getKeys", "()Ljava/util/Set;", "values", "", "getValues", "()Ljava/util/Collection;", "entries", "", "getEntries", "equals", "other", "hashCode", "toString", "", "capacity", "getCapacity$kotlin_stdlib", "hashSize", "getHashSize", "registerModification", "checkIsMutable", "checkIsMutable$kotlin_stdlib", "ensureExtraCapacity", "n", "shouldCompact", "extraCapacity", "ensureCapacity", "minCapacity", "allocateValuesArray", "()[Ljava/lang/Object;", "hash", "(Ljava/lang/Object;)I", "compact", "updateHashArray", "rehash", "newHashSize", "putRehash", "i", "findKey", "findValue", "addKey", "addKey$kotlin_stdlib", "removeKey", "removeKey$kotlin_stdlib", "removeEntryAt", "index", "removeHashAt", "removedHash", "containsEntry", "entry", "", "containsEntry$kotlin_stdlib", "contentEquals", "containsAllEntries", "m", "", "containsAllEntries$kotlin_stdlib", "putEntry", "putAllEntries", "removeEntry", "removeEntry$kotlin_stdlib", "removeValue", "element", "removeValue$kotlin_stdlib", "keysIterator", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator$kotlin_stdlib", "valuesIterator", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator$kotlin_stdlib", "entriesIterator", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator$kotlin_stdlib", "Companion", "Itr", "KeysItr", "ValuesItr", "EntriesItr", "EntryRef", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,751:1\n1#2:752\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, KMutableMap {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final MapBuilder Empty;
    private static final int INITIAL_CAPACITY = 8;
    private static final int INITIAL_MAX_PROBE_DISTANCE = 2;
    private static final int MAGIC = -1640531527;
    private static final int TOMBSTONE = -1;
    private MapBuilderEntries<K, V> entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private K[] keysArray;
    private MapBuilderKeys<K> keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;
    private int[] presenceArray;
    private int size;
    private V[] valuesArray;
    private MapBuilderValues<V> valuesView;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", "", "<init>", "()V", "MAGIC", "", "INITIAL_CAPACITY", "INITIAL_MAX_PROBE_DISTANCE", "TOMBSTONE", "Empty", "Lkotlin/collections/builders/MapBuilder;", "", "getEmpty$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "computeHashSize", "capacity", "computeShift", "hashSize", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int computeHashSize(int capacity) {
            return Integer.highestOneBit(RangesKt.coerceAtLeast(capacity, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int computeShift(int hashSize) {
            return Integer.numberOfLeadingZeros(hashSize) + 1;
        }

        public final MapBuilder getEmpty$kotlin_stdlib() {
            return MapBuilder.Empty;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000bH\u0096\u0002J\r\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0012\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013¨\u0006\u0014"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "map", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "Lkotlin/collections/builders/MapBuilder$EntryRef;", "nextHashCode", "", "nextHashCode$kotlin_stdlib", "nextAppendString", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EntriesItr<K, V> extends Itr<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EntriesItr(MapBuilder<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        public final void nextAppendString(StringBuilder sb2) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            if (getIndex() >= ((MapBuilder) getMap$kotlin_stdlib()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            setIndex$kotlin_stdlib(index + 1);
            setLastIndex$kotlin_stdlib(index);
            Object obj = ((MapBuilder) getMap$kotlin_stdlib()).keysArray[getLastIndex()];
            if (obj == getMap$kotlin_stdlib()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = ((MapBuilder) getMap$kotlin_stdlib()).valuesArray;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex()];
            if (obj2 == getMap$kotlin_stdlib()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            initNext$kotlin_stdlib();
        }

        public final int nextHashCode$kotlin_stdlib() {
            if (getIndex() >= ((MapBuilder) getMap$kotlin_stdlib()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            setIndex$kotlin_stdlib(index + 1);
            setLastIndex$kotlin_stdlib(index);
            Object obj = ((MapBuilder) getMap$kotlin_stdlib()).keysArray[getLastIndex()];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((MapBuilder) getMap$kotlin_stdlib()).valuesArray;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex()];
            int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            initNext$kotlin_stdlib();
            return hashCode2;
        }

        @Override // java.util.Iterator
        public EntryRef<K, V> next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex() >= ((MapBuilder) getMap$kotlin_stdlib()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            setIndex$kotlin_stdlib(index + 1);
            setLastIndex$kotlin_stdlib(index);
            EntryRef<K, V> entryRef = new EntryRef<>(getMap$kotlin_stdlib(), getLastIndex());
            initNext$kotlin_stdlib();
            return entryRef;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0010\u001a\u00028\u00032\u0006\u0010\u0011\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", "V", "", "map", "Lkotlin/collections/builders/MapBuilder;", "index", "", "<init>", "(Lkotlin/collections/builders/MapBuilder;I)V", "expectedModCount", "key", "getKey", "()Ljava/lang/Object;", "value", "getValue", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "equals", "", "other", "", "hashCode", "toString", "", "checkForComodification", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EntryRef<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
        private final int expectedModCount;
        private final int index;
        private final MapBuilder<K, V> map;

        public EntryRef(MapBuilder<K, V> map, int i3) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.index = i3;
            this.expectedModCount = ((MapBuilder) map).modCount;
        }

        private final void checkForComodification() {
            if (((MapBuilder) this.map).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object other) {
            if (!(other instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) other;
            return Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            checkForComodification();
            return (K) ((MapBuilder) this.map).keysArray[this.index];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            checkForComodification();
            Object[] objArr = ((MapBuilder) this.map).valuesArray;
            Intrinsics.checkNotNull(objArr);
            return (V) objArr[this.index];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            checkForComodification();
            this.map.checkIsMutable$kotlin_stdlib();
            Object[] allocateValuesArray = this.map.allocateValuesArray();
            int i3 = this.index;
            V v2 = (V) allocateValuesArray[i3];
            allocateValuesArray[i3] = newValue;
            return v2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0015J\r\u0010\u001a\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u001bR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", "V", "", "map", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "getMap$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "index", "", "getIndex$kotlin_stdlib", "()I", "setIndex$kotlin_stdlib", "(I)V", "lastIndex", "getLastIndex$kotlin_stdlib", "setLastIndex$kotlin_stdlib", "expectedModCount", "initNext", "", "initNext$kotlin_stdlib", "hasNext", "", "remove", "checkForComodification", "checkForComodification$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,751:1\n1#2:752\n*E\n"})
    public static class Itr<K, V> {
        private int expectedModCount;
        private int index;
        private int lastIndex;
        private final MapBuilder<K, V> map;

        public Itr(MapBuilder<K, V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.lastIndex = -1;
            this.expectedModCount = ((MapBuilder) map).modCount;
            initNext$kotlin_stdlib();
        }

        public final void checkForComodification$kotlin_stdlib() {
            if (((MapBuilder) this.map).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: getIndex$kotlin_stdlib, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: getLastIndex$kotlin_stdlib, reason: from getter */
        public final int getLastIndex() {
            return this.lastIndex;
        }

        public final MapBuilder<K, V> getMap$kotlin_stdlib() {
            return this.map;
        }

        public final boolean hasNext() {
            return this.index < ((MapBuilder) this.map).length;
        }

        public final void initNext$kotlin_stdlib() {
            while (this.index < ((MapBuilder) this.map).length) {
                int[] iArr = ((MapBuilder) this.map).presenceArray;
                int i3 = this.index;
                if (iArr[i3] >= 0) {
                    return;
                } else {
                    this.index = i3 + 1;
                }
            }
        }

        public final void remove() {
            checkForComodification$kotlin_stdlib();
            if (this.lastIndex == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.map.checkIsMutable$kotlin_stdlib();
            this.map.removeEntryAt(this.lastIndex);
            this.lastIndex = -1;
            this.expectedModCount = ((MapBuilder) this.map).modCount;
        }

        public final void setIndex$kotlin_stdlib(int i3) {
            this.index = i3;
        }

        public final void setLastIndex$kotlin_stdlib(int i3) {
            this.lastIndex = i3;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class KeysItr<K, V> extends Itr<K, V> implements Iterator<K>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeysItr(MapBuilder<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex() >= ((MapBuilder) getMap$kotlin_stdlib()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            setIndex$kotlin_stdlib(index + 1);
            setLastIndex$kotlin_stdlib(index);
            K k3 = (K) ((MapBuilder) getMap$kotlin_stdlib()).keysArray[getLastIndex()];
            initNext$kotlin_stdlib();
            return k3;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ValuesItr<K, V> extends Itr<K, V> implements Iterator<V>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValuesItr(MapBuilder<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex() >= ((MapBuilder) getMap$kotlin_stdlib()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            setIndex$kotlin_stdlib(index + 1);
            setLastIndex$kotlin_stdlib(index);
            Object[] objArr = ((MapBuilder) getMap$kotlin_stdlib()).valuesArray;
            Intrinsics.checkNotNull(objArr);
            V v2 = (V) objArr[getLastIndex()];
            initNext$kotlin_stdlib();
            return v2;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        Empty = mapBuilder;
    }

    private MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i3, int i10) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i3;
        this.length = i10;
        this.hashShift = INSTANCE.computeShift(getHashSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] allocateValuesArray() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) ListBuilderKt.arrayOfUninitializedElements(getCapacity$kotlin_stdlib());
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final void compact(boolean updateHashArray) {
        int i3;
        V[] vArr = this.valuesArray;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i3 = this.length;
            if (i10 >= i3) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i11] = kArr[i10];
                if (vArr != null) {
                    vArr[i11] = vArr[i10];
                }
                if (updateHashArray) {
                    iArr[i11] = i12;
                    this.hashArray[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        ListBuilderKt.resetRange(this.keysArray, i11, i3);
        if (vArr != null) {
            ListBuilderKt.resetRange(vArr, i11, this.length);
        }
        this.length = i11;
    }

    private final boolean contentEquals(Map<?, ?> other) {
        return size() == other.size() && containsAllEntries$kotlin_stdlib(other.entrySet());
    }

    private final void ensureCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        if (minCapacity > getCapacity$kotlin_stdlib()) {
            int newCapacity$kotlin_stdlib = AbstractList.INSTANCE.newCapacity$kotlin_stdlib(getCapacity$kotlin_stdlib(), minCapacity);
            this.keysArray = (K[]) ListBuilderKt.copyOfUninitializedElements(this.keysArray, newCapacity$kotlin_stdlib);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) ListBuilderKt.copyOfUninitializedElements(vArr, newCapacity$kotlin_stdlib) : null;
            int[] copyOf = Arrays.copyOf(this.presenceArray, newCapacity$kotlin_stdlib);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.presenceArray = copyOf;
            int computeHashSize = INSTANCE.computeHashSize(newCapacity$kotlin_stdlib);
            if (computeHashSize > getHashSize()) {
                rehash(computeHashSize);
            }
        }
    }

    private final void ensureExtraCapacity(int n10) {
        if (shouldCompact(n10)) {
            compact(true);
        } else {
            ensureCapacity(this.length + n10);
        }
    }

    private final int findKey(K key) {
        int hash = hash(key);
        int i3 = this.maxProbeDistance;
        while (true) {
            int i10 = this.hashArray[hash];
            if (i10 == 0) {
                return -1;
            }
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (Intrinsics.areEqual(this.keysArray[i11], key)) {
                    return i11;
                }
            }
            i3--;
            if (i3 < 0) {
                return -1;
            }
            hash = hash == 0 ? getHashSize() - 1 : hash - 1;
        }
    }

    private final int findValue(V value) {
        int i3 = this.length;
        while (true) {
            i3--;
            if (i3 < 0) {
                return -1;
            }
            if (this.presenceArray[i3] >= 0) {
                V[] vArr = this.valuesArray;
                Intrinsics.checkNotNull(vArr);
                if (Intrinsics.areEqual(vArr[i3], value)) {
                    return i3;
                }
            }
        }
    }

    private final int getHashSize() {
        return this.hashArray.length;
    }

    private final int hash(K key) {
        return ((key != null ? key.hashCode() : 0) * MAGIC) >>> this.hashShift;
    }

    private final boolean putAllEntries(Collection<? extends Map.Entry<? extends K, ? extends V>> from) {
        boolean z2 = false;
        if (from.isEmpty()) {
            return false;
        }
        ensureExtraCapacity(from.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = from.iterator();
        while (it.hasNext()) {
            if (putEntry(it.next())) {
                z2 = true;
            }
        }
        return z2;
    }

    private final boolean putEntry(Map.Entry<? extends K, ? extends V> entry) {
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        V[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib >= 0) {
            allocateValuesArray[addKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i3 = (-addKey$kotlin_stdlib) - 1;
        if (Intrinsics.areEqual(entry.getValue(), allocateValuesArray[i3])) {
            return false;
        }
        allocateValuesArray[i3] = entry.getValue();
        return true;
    }

    private final boolean putRehash(int i3) {
        int hash = hash(this.keysArray[i3]);
        int i10 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[hash] == 0) {
                iArr[hash] = i3 + 1;
                this.presenceArray[i3] = hash;
                return true;
            }
            i10--;
            if (i10 < 0) {
                return false;
            }
            hash = hash == 0 ? getHashSize() - 1 : hash - 1;
        }
    }

    private final void readObject(ObjectInputStream input) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final void registerModification() {
        this.modCount++;
    }

    private final void rehash(int newHashSize) {
        registerModification();
        int i3 = 0;
        if (this.length > size()) {
            compact(false);
        }
        this.hashArray = new int[newHashSize];
        this.hashShift = INSTANCE.computeShift(newHashSize);
        while (i3 < this.length) {
            int i10 = i3 + 1;
            if (!putRehash(i3)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i3 = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeEntryAt(int index) {
        ListBuilderKt.resetAt(this.keysArray, index);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            ListBuilderKt.resetAt(vArr, index);
        }
        removeHashAt(this.presenceArray[index]);
        this.presenceArray[index] = -1;
        this.size = size() - 1;
        registerModification();
    }

    private final void removeHashAt(int removedHash) {
        int coerceAtMost = RangesKt.coerceAtMost(this.maxProbeDistance * 2, getHashSize() / 2);
        int i3 = 0;
        int i10 = removedHash;
        do {
            removedHash = removedHash == 0 ? getHashSize() - 1 : removedHash - 1;
            i3++;
            if (i3 > this.maxProbeDistance) {
                this.hashArray[i10] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i11 = iArr[removedHash];
            if (i11 == 0) {
                iArr[i10] = 0;
                return;
            }
            if (i11 < 0) {
                iArr[i10] = -1;
            } else {
                int i12 = i11 - 1;
                if (((hash(this.keysArray[i12]) - removedHash) & (getHashSize() - 1)) >= i3) {
                    this.hashArray[i10] = i11;
                    this.presenceArray[i12] = i10;
                }
                coerceAtMost--;
            }
            i10 = removedHash;
            i3 = 0;
            coerceAtMost--;
        } while (coerceAtMost >= 0);
        this.hashArray[i10] = -1;
    }

    private final boolean shouldCompact(int extraCapacity) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i3 = this.length;
        int i10 = capacity$kotlin_stdlib - i3;
        int size = i3 - size();
        return i10 < extraCapacity && i10 + size >= extraCapacity && size >= getCapacity$kotlin_stdlib() / 4;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int addKey$kotlin_stdlib(K key) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int hash = hash(key);
            int coerceAtMost = RangesKt.coerceAtMost(this.maxProbeDistance * 2, getHashSize() / 2);
            int i3 = 0;
            while (true) {
                int i10 = this.hashArray[hash];
                if (i10 <= 0) {
                    if (this.length < getCapacity$kotlin_stdlib()) {
                        int i11 = this.length;
                        int i12 = i11 + 1;
                        this.length = i12;
                        this.keysArray[i11] = key;
                        this.presenceArray[i11] = hash;
                        this.hashArray[hash] = i12;
                        this.size = size() + 1;
                        registerModification();
                        if (i3 > this.maxProbeDistance) {
                            this.maxProbeDistance = i3;
                        }
                        return i11;
                    }
                    ensureExtraCapacity(1);
                } else {
                    if (Intrinsics.areEqual(this.keysArray[i10 - 1], key)) {
                        return -i10;
                    }
                    i3++;
                    if (i3 > coerceAtMost) {
                        rehash(getHashSize() * 2);
                        break;
                    }
                    hash = hash == 0 ? getHashSize() - 1 : hash - 1;
                }
            }
        }
    }

    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = Empty;
        Intrinsics.checkNotNull(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        int i3 = this.length - 1;
        if (i3 >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.hashArray[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i3) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        ListBuilderKt.resetRange(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            ListBuilderKt.resetRange(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        registerModification();
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection<?> m4) {
        Intrinsics.checkNotNullParameter(m4, "m");
        for (Object obj : m4) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        return Intrinsics.areEqual(vArr[findKey], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return findKey(key) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return findValue(value) >= 0;
    }

    public final EntriesItr<K, V> entriesIterator$kotlin_stdlib() {
        return new EntriesItr<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof Map) && contentEquals((Map) other);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object key) {
        int findKey = findKey(key);
        if (findKey < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        return vArr[findKey];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    public Set<Map.Entry<K, V>> getEntries() {
        MapBuilderEntries<K, V> mapBuilderEntries = this.entriesView;
        if (mapBuilderEntries != null) {
            return mapBuilderEntries;
        }
        MapBuilderEntries<K, V> mapBuilderEntries2 = new MapBuilderEntries<>(this);
        this.entriesView = mapBuilderEntries2;
        return mapBuilderEntries2;
    }

    public Set<K> getKeys() {
        MapBuilderKeys<K> mapBuilderKeys = this.keysView;
        if (mapBuilderKeys != null) {
            return mapBuilderKeys;
        }
        MapBuilderKeys<K> mapBuilderKeys2 = new MapBuilderKeys<>(this);
        this.keysView = mapBuilderKeys2;
        return mapBuilderKeys2;
    }

    public int getSize() {
        return this.size;
    }

    public Collection<V> getValues() {
        MapBuilderValues<V> mapBuilderValues = this.valuesView;
        if (mapBuilderValues != null) {
            return mapBuilderValues;
        }
        MapBuilderValues<V> mapBuilderValues2 = new MapBuilderValues<>(this);
        this.valuesView = mapBuilderValues2;
        return mapBuilderValues2;
    }

    @Override // java.util.Map
    public int hashCode() {
        EntriesItr<K, V> entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i3 = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            i3 += entriesIterator$kotlin_stdlib.nextHashCode$kotlin_stdlib();
        }
        return i3;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: isReadOnly$kotlin_stdlib, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    public final KeysItr<K, V> keysIterator$kotlin_stdlib() {
        return new KeysItr<>(this);
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        checkIsMutable$kotlin_stdlib();
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(key);
        V[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib >= 0) {
            allocateValuesArray[addKey$kotlin_stdlib] = value;
            return null;
        }
        int i3 = (-addKey$kotlin_stdlib) - 1;
        V v2 = allocateValuesArray[i3];
        allocateValuesArray[i3] = value;
        return v2;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        checkIsMutable$kotlin_stdlib();
        putAllEntries(from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object key) {
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(key);
        if (findKey < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        V v2 = vArr[findKey];
        removeEntryAt(findKey);
        return v2;
    }

    public final boolean removeEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        if (!Intrinsics.areEqual(vArr[findKey], entry.getValue())) {
            return false;
        }
        removeEntryAt(findKey);
        return true;
    }

    public final boolean removeKey$kotlin_stdlib(K key) {
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(key);
        if (findKey < 0) {
            return false;
        }
        removeEntryAt(findKey);
        return true;
    }

    public final boolean removeValue$kotlin_stdlib(V element) {
        checkIsMutable$kotlin_stdlib();
        int findValue = findValue(element);
        if (findValue < 0) {
            return false;
        }
        removeEntryAt(findValue);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        EntriesItr<K, V> entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i3 = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            if (i3 > 0) {
                sb2.append(", ");
            }
            entriesIterator$kotlin_stdlib.nextAppendString(sb2);
            i3++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public final ValuesItr<K, V> valuesIterator$kotlin_stdlib() {
        return new ValuesItr<>(this);
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i3) {
        this(ListBuilderKt.arrayOfUninitializedElements(i3), null, new int[i3], new int[INSTANCE.computeHashSize(i3)], 2, 0);
    }
}
