package kotlin.collections;

import i2.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@SinceKotlin(version = "1.4")
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \\*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\\B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0005\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0016\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0011\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0083\bJ\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u000b\u0010#\u001a\u00028\u0000¢\u0006\u0002\u0010$J\r\u0010%\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010$J\u000b\u0010&\u001a\u00028\u0000¢\u0006\u0002\u0010$J\r\u0010'\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010$J\u0013\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u00152\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0002\u0010*J\u000b\u0010,\u001a\u00028\u0000¢\u0006\u0002\u0010$J\r\u0010-\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010$J\u000b\u0010.\u001a\u00028\u0000¢\u0006\u0002\u0010$J\r\u0010/\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010$J\u0015\u00100\u001a\u00020\"2\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u001d\u00100\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00102J\u001e\u00103\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002J\u0016\u00104\u001a\u00020\"2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001e\u00104\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0016\u00105\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\u001e\u00106\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010)\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00107J\u0016\u00108\u001a\u00020\"2\u0006\u0010)\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00101J\u0015\u00109\u001a\u00020\u00042\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010:J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010:J\u0015\u0010<\u001a\u00020\"2\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u0015\u0010=\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u001bJ\u0016\u0010>\u001a\u00020\"2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0016\u0010?\u001a\u00020\"2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001d\u0010@\u001a\u00020\"2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\"0BH\u0082\bJ\b\u0010C\u001a\u00020\u0015H\u0016J'\u0010D\u001a\b\u0012\u0004\u0012\u0002HE0\r\"\u0004\b\u0001\u0010E2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002HE0\rH\u0016¢\u0006\u0002\u0010GJ\u0015\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016¢\u0006\u0002\u0010HJ\u0018\u0010I\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0004H\u0014J\u0018\u0010L\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0004H\u0002J\u0018\u0010M\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0004H\u0002J\u0018\u0010N\u001a\u00020\u00152\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u0004H\u0002J\b\u0010Q\u001a\u00020\u0015H\u0002J)\u0010R\u001a\b\u0012\u0004\u0012\u0002HE0\r\"\u0004\b\u0001\u0010E2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002HE0\rH\u0000¢\u0006\u0004\bS\u0010GJ\u0017\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0000¢\u0006\u0004\bS\u0010HJ\u001d\u0010T\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0004H\u0000¢\u0006\u0002\bUJM\u0010V\u001a\u00020\u00152>\u0010W\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(\u000b\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00150XH\u0000¢\u0006\u0002\b[R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006]"}, d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "initialCapacity", "", "<init>", "(I)V", "()V", "elements", "", "(Ljava/util/Collection;)V", "head", "elementData", "", "", "[Ljava/lang/Object;", "value", "size", "getSize", "()I", "ensureCapacity", "", "minCapacity", "copyElements", "newCapacity", "internalGet", "internalIndex", "(I)Ljava/lang/Object;", "positiveMod", "index", "negativeMod", "incremented", "decremented", "isEmpty", "", "first", "()Ljava/lang/Object;", "firstOrNull", "last", "lastOrNull", "addFirst", "element", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "copyCollectionElements", "addAll", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "removeAt", "removeAll", "retainAll", "filterInPlace", "predicate", "Lkotlin/Function1;", "clear", "toArray", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "removeRange", "fromIndex", "toIndex", "removeRangeShiftPreceding", "removeRangeShiftSucceeding", "nullifyNonEmpty", "internalFromIndex", "internalToIndex", "registerModification", "testToArray", "testToArray$kotlin_stdlib", "testRemoveRange", "testRemoveRange$kotlin_stdlib", "internalStructure", "structure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "internalStructure$kotlin_stdlib", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,660:1\n476#1,53:663\n476#1,53:716\n37#2,2:661\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n471#1:663,53\n473#1:716,53\n46#1:661,2\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    private static final int defaultMinCapacity = 10;
    private Object[] elementData;
    private int head;
    private int size;
    private static final Object[] emptyElementData = new Object[0];

    public ArrayDeque(int i3) {
        Object[] objArr;
        if (i3 == 0) {
            objArr = emptyElementData;
        } else {
            if (i3 <= 0) {
                throw new IllegalArgumentException(u.p(i3, "Illegal Capacity: "));
            }
            objArr = new Object[i3];
        }
        this.elementData = objArr;
    }

    private final void copyCollectionElements(int internalIndex, Collection<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        int length = this.elementData.length;
        while (internalIndex < length && it.hasNext()) {
            this.elementData[internalIndex] = it.next();
            internalIndex++;
        }
        int i3 = this.head;
        for (int i10 = 0; i10 < i3 && it.hasNext(); i10++) {
            this.elementData[i10] = it.next();
        }
        this.size = elements.size() + size();
    }

    private final void copyElements(int newCapacity) {
        Object[] objArr = new Object[newCapacity];
        Object[] objArr2 = this.elementData;
        ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i3 = this.head;
        ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr, length - i3, 0, i3);
        this.head = 0;
        this.elementData = objArr;
    }

    private final int decremented(int index) {
        return index == 0 ? ArraysKt___ArraysKt.getLastIndex(this.elementData) : index - 1;
    }

    private final void ensureCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (minCapacity <= objArr.length) {
            return;
        }
        if (objArr == emptyElementData) {
            this.elementData = new Object[RangesKt.coerceAtLeast(minCapacity, 10)];
        } else {
            copyElements(AbstractList.INSTANCE.newCapacity$kotlin_stdlib(objArr.length, minCapacity));
        }
    }

    private final boolean filterInPlace(Function1<? super E, Boolean> predicate) {
        int positiveMod;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int positiveMod2 = positiveMod(size() + this.head);
            int i3 = this.head;
            if (i3 < positiveMod2) {
                positiveMod = i3;
                while (i3 < positiveMod2) {
                    Object obj = this.elementData[i3];
                    if (predicate.invoke(obj).booleanValue()) {
                        this.elementData[positiveMod] = obj;
                        positiveMod++;
                    } else {
                        z2 = true;
                    }
                    i3++;
                }
                ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, positiveMod, positiveMod2);
            } else {
                int length = this.elementData.length;
                boolean z10 = false;
                int i10 = i3;
                while (i3 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (predicate.invoke(obj2).booleanValue()) {
                        this.elementData[i10] = obj2;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i3++;
                }
                positiveMod = positiveMod(i10);
                for (int i11 = 0; i11 < positiveMod2; i11++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (predicate.invoke(obj3).booleanValue()) {
                        this.elementData[positiveMod] = obj3;
                        positiveMod = incremented(positiveMod);
                    } else {
                        z10 = true;
                    }
                }
                z2 = z10;
            }
            if (z2) {
                registerModification();
                this.size = negativeMod(positiveMod - this.head);
            }
        }
        return z2;
    }

    private final int incremented(int index) {
        if (index == ArraysKt___ArraysKt.getLastIndex(this.elementData)) {
            return 0;
        }
        return index + 1;
    }

    @InlineOnly
    private final E internalGet(int internalIndex) {
        return (E) this.elementData[internalIndex];
    }

    @InlineOnly
    private final int internalIndex(int index) {
        return positiveMod(this.head + index);
    }

    private final int negativeMod(int index) {
        return index < 0 ? index + this.elementData.length : index;
    }

    private final void nullifyNonEmpty(int internalFromIndex, int internalToIndex) {
        if (internalFromIndex < internalToIndex) {
            ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, internalFromIndex, internalToIndex);
            return;
        }
        Object[] objArr = this.elementData;
        ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, internalFromIndex, objArr.length);
        ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, 0, internalToIndex);
    }

    private final int positiveMod(int index) {
        Object[] objArr = this.elementData;
        return index >= objArr.length ? index - objArr.length : index;
    }

    private final void registerModification() {
        ((java.util.AbstractList) this).modCount++;
    }

    private final void removeRangeShiftPreceding(int fromIndex, int toIndex) {
        int positiveMod = positiveMod(this.head + (fromIndex - 1));
        int positiveMod2 = positiveMod(this.head + (toIndex - 1));
        while (fromIndex > 0) {
            int i3 = positiveMod + 1;
            int min = Math.min(fromIndex, Math.min(i3, positiveMod2 + 1));
            Object[] objArr = this.elementData;
            int i10 = positiveMod2 - min;
            int i11 = positiveMod - min;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i10 + 1, i11 + 1, i3);
            positiveMod = negativeMod(i11);
            positiveMod2 = negativeMod(i10);
            fromIndex -= min;
        }
    }

    private final void removeRangeShiftSucceeding(int fromIndex, int toIndex) {
        int positiveMod = positiveMod(this.head + toIndex);
        int positiveMod2 = positiveMod(this.head + fromIndex);
        int size = size();
        while (true) {
            size -= toIndex;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.elementData;
            toIndex = Math.min(size, Math.min(objArr.length - positiveMod, objArr.length - positiveMod2));
            Object[] objArr2 = this.elementData;
            int i3 = positiveMod + toIndex;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, positiveMod2, positiveMod, i3);
            positiveMod = positiveMod(i3);
            positiveMod2 = positiveMod(positiveMod2 + toIndex);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        registerModification();
        ensureCapacity(elements.size() + size());
        copyCollectionElements(positiveMod(size() + this.head), elements);
        return true;
    }

    public final void addFirst(E element) {
        registerModification();
        ensureCapacity(size() + 1);
        int decremented = decremented(this.head);
        this.head = decremented;
        this.elementData[decremented] = element;
        this.size = size() + 1;
    }

    public final void addLast(E element) {
        registerModification();
        ensureCapacity(size() + 1);
        this.elementData[positiveMod(size() + this.head)] = element;
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            registerModification();
            nullifyNonEmpty(this.head, positiveMod(size() + this.head));
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        return (E) this.elementData[positiveMod(this.head + index)];
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: getSize, reason: from getter */
    public int getLength() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        int i3;
        int positiveMod = positiveMod(size() + this.head);
        int i10 = this.head;
        if (i10 < positiveMod) {
            while (i10 < positiveMod) {
                if (Intrinsics.areEqual(element, this.elementData[i10])) {
                    i3 = this.head;
                } else {
                    i10++;
                }
            }
            return -1;
        }
        if (i10 < positiveMod) {
            return -1;
        }
        int length = this.elementData.length;
        while (true) {
            if (i10 >= length) {
                for (int i11 = 0; i11 < positiveMod; i11++) {
                    if (Intrinsics.areEqual(element, this.elementData[i11])) {
                        i10 = i11 + this.elementData.length;
                        i3 = this.head;
                    }
                }
                return -1;
            }
            if (Intrinsics.areEqual(element, this.elementData[i10])) {
                i3 = this.head;
                break;
            }
            i10++;
        }
        return i10 - i3;
    }

    public final void internalStructure$kotlin_stdlib(Function2<? super Integer, ? super Object[], Unit> structure) {
        int i3;
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || (i3 = this.head) < positiveMod(size() + this.head)) ? this.head : i3 - this.elementData.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        int lastIndex;
        int i3;
        int positiveMod = positiveMod(size() + this.head);
        int i10 = this.head;
        if (i10 < positiveMod) {
            lastIndex = positiveMod - 1;
            if (i10 <= lastIndex) {
                while (!Intrinsics.areEqual(element, this.elementData[lastIndex])) {
                    if (lastIndex != i10) {
                        lastIndex--;
                    }
                }
                i3 = this.head;
                return lastIndex - i3;
            }
            return -1;
        }
        if (i10 > positiveMod) {
            int i11 = positiveMod - 1;
            while (true) {
                if (-1 >= i11) {
                    lastIndex = ArraysKt___ArraysKt.getLastIndex(this.elementData);
                    int i12 = this.head;
                    if (i12 <= lastIndex) {
                        while (!Intrinsics.areEqual(element, this.elementData[lastIndex])) {
                            if (lastIndex != i12) {
                                lastIndex--;
                            }
                        }
                        i3 = this.head;
                    }
                } else {
                    if (Intrinsics.areEqual(element, this.elementData[i11])) {
                        lastIndex = i11 + this.elementData.length;
                        i3 = this.head;
                        break;
                    }
                    i11--;
                }
            }
        }
        return -1;
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        int indexOf = indexOf(element);
        if (indexOf == -1) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> elements) {
        int positiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int positiveMod2 = positiveMod(size() + this.head);
            int i3 = this.head;
            if (i3 < positiveMod2) {
                positiveMod = i3;
                while (i3 < positiveMod2) {
                    Object obj = this.elementData[i3];
                    if (elements.contains(obj)) {
                        z2 = true;
                    } else {
                        this.elementData[positiveMod] = obj;
                        positiveMod++;
                    }
                    i3++;
                }
                ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, positiveMod, positiveMod2);
            } else {
                int length = this.elementData.length;
                boolean z10 = false;
                int i10 = i3;
                while (i3 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (elements.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.elementData[i10] = obj2;
                        i10++;
                    }
                    i3++;
                }
                positiveMod = positiveMod(i10);
                for (int i11 = 0; i11 < positiveMod2; i11++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.elementData[positiveMod] = obj3;
                        positiveMod = incremented(positiveMod);
                    }
                }
                z2 = z10;
            }
            if (z2) {
                registerModification();
                this.size = negativeMod(positiveMod - this.head);
            }
        }
        return z2;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int index) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        if (index == CollectionsKt__CollectionsKt.getLastIndex(this)) {
            return removeLast();
        }
        if (index == 0) {
            return removeFirst();
        }
        registerModification();
        int positiveMod = positiveMod(this.head + index);
        E e10 = (E) this.elementData[positiveMod];
        if (index < (size() >> 1)) {
            int i3 = this.head;
            if (positiveMod >= i3) {
                Object[] objArr = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i3 + 1, i3, positiveMod);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, 1, 0, positiveMod);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i10 = this.head;
                ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, i10 + 1, i10, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i11 = this.head;
            objArr4[i11] = null;
            this.head = incremented(i11);
        } else {
            int positiveMod2 = positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this));
            if (positiveMod <= positiveMod2) {
                Object[] objArr5 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, positiveMod, positiveMod + 1, positiveMod2 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, positiveMod, positiveMod + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt___ArraysJvmKt.copyInto(objArr7, objArr7, 0, 1, positiveMod2 + 1);
            }
            this.elementData[positiveMod2] = null;
        }
        this.size = size() - 1;
        return e10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        Object[] objArr = this.elementData;
        int i3 = this.head;
        E e10 = (E) objArr[i3];
        objArr[i3] = null;
        this.head = incremented(i3);
        this.size = size() - 1;
        return e10;
    }

    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        int positiveMod = positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this));
        Object[] objArr = this.elementData;
        E e10 = (E) objArr[positiveMod];
        objArr[positiveMod] = null;
        this.size = size() - 1;
        return e10;
    }

    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList
    public void removeRange(int fromIndex, int toIndex) {
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, size());
        int i3 = toIndex - fromIndex;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            removeAt(fromIndex);
            return;
        }
        registerModification();
        if (fromIndex < size() - toIndex) {
            removeRangeShiftPreceding(fromIndex, toIndex);
            int positiveMod = positiveMod(this.head + i3);
            nullifyNonEmpty(this.head, positiveMod);
            this.head = positiveMod;
        } else {
            removeRangeShiftSucceeding(fromIndex, toIndex);
            int positiveMod2 = positiveMod(size() + this.head);
            nullifyNonEmpty(negativeMod(positiveMod2 - i3), positiveMod2);
        }
        this.size = size() - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> elements) {
        int positiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int positiveMod2 = positiveMod(size() + this.head);
            int i3 = this.head;
            if (i3 < positiveMod2) {
                positiveMod = i3;
                while (i3 < positiveMod2) {
                    Object obj = this.elementData[i3];
                    if (elements.contains(obj)) {
                        this.elementData[positiveMod] = obj;
                        positiveMod++;
                    } else {
                        z2 = true;
                    }
                    i3++;
                }
                ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, positiveMod, positiveMod2);
            } else {
                int length = this.elementData.length;
                boolean z10 = false;
                int i10 = i3;
                while (i3 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (elements.contains(obj2)) {
                        this.elementData[i10] = obj2;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i3++;
                }
                positiveMod = positiveMod(i10);
                for (int i11 = 0; i11 < positiveMod2; i11++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        this.elementData[positiveMod] = obj3;
                        positiveMod = incremented(positiveMod);
                    } else {
                        z10 = true;
                    }
                }
                z2 = z10;
            }
            if (z2) {
                registerModification();
                this.size = negativeMod(positiveMod - this.head);
            }
        }
        return z2;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        int positiveMod = positiveMod(this.head + index);
        Object[] objArr = this.elementData;
        E e10 = (E) objArr[positiveMod];
        objArr[positiveMod] = element;
        return e10;
    }

    public final void testRemoveRange$kotlin_stdlib(int fromIndex, int toIndex) {
        removeRange(fromIndex, toIndex);
    }

    public final <T> T[] testToArray$kotlin_stdlib(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) ArraysKt__ArraysJVMKt.arrayOfNulls(array, size());
        }
        T[] tArr = array;
        int positiveMod = positiveMod(size() + this.head);
        int i3 = this.head;
        if (i3 < positiveMod) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.elementData, tArr, 0, i3, positiveMod, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt___ArraysJvmKt.copyInto(objArr, tArr, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, tArr, objArr2.length - this.head, 0, positiveMod);
        }
        return (T[]) CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(size(), tArr);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, size());
        if (index == size()) {
            addLast(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        registerModification();
        ensureCapacity(size() + 1);
        int positiveMod = positiveMod(this.head + index);
        if (index < ((size() + 1) >> 1)) {
            int decremented = decremented(positiveMod);
            int decremented2 = decremented(this.head);
            int i3 = this.head;
            if (decremented >= i3) {
                Object[] objArr = this.elementData;
                objArr[decremented2] = objArr[i3];
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i3, i3 + 1, decremented + 1);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i3 - 1, i3, objArr2.length);
                Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, 0, 1, decremented + 1);
            }
            this.elementData[decremented] = element;
            this.head = decremented2;
        } else {
            int positiveMod2 = positiveMod(size() + this.head);
            if (positiveMod < positiveMod2) {
                Object[] objArr4 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, positiveMod + 1, positiveMod, positiveMod2);
            } else {
                Object[] objArr5 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, 1, 0, positiveMod2);
                Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, positiveMod + 1, positiveMod, objArr6.length - 1);
            }
            this.elementData[positiveMod] = element;
        }
        this.size = size() + 1;
    }

    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == size()) {
            return addAll(elements);
        }
        registerModification();
        ensureCapacity(elements.size() + size());
        int positiveMod = positiveMod(size() + this.head);
        int positiveMod2 = positiveMod(this.head + index);
        int size = elements.size();
        if (index < ((size() + 1) >> 1)) {
            int i3 = this.head;
            int i10 = i3 - size;
            if (positiveMod2 < i3) {
                Object[] objArr = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i10, i3, objArr.length);
                if (size >= positiveMod2) {
                    Object[] objArr2 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, positiveMod2);
                } else {
                    Object[] objArr3 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, 0, size, positiveMod2);
                }
            } else if (i10 >= 0) {
                Object[] objArr5 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, i10, i3, positiveMod2);
            } else {
                Object[] objArr6 = this.elementData;
                i10 += objArr6.length;
                int i11 = positiveMod2 - i3;
                int length = objArr6.length - i10;
                if (length >= i11) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, i10, i3, positiveMod2);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, i10, i3, i3 + length);
                    Object[] objArr7 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr7, objArr7, 0, this.head + length, positiveMod2);
                }
            }
            this.head = i10;
            copyCollectionElements(negativeMod(positiveMod2 - size), elements);
        } else {
            int i12 = positiveMod2 + size;
            if (positiveMod2 < positiveMod) {
                int i13 = size + positiveMod;
                Object[] objArr8 = this.elementData;
                if (i13 <= objArr8.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, i12, positiveMod2, positiveMod);
                } else if (i12 >= objArr8.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, i12 - objArr8.length, positiveMod2, positiveMod);
                } else {
                    int length2 = positiveMod - (i13 - objArr8.length);
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, 0, length2, positiveMod);
                    Object[] objArr9 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr9, objArr9, i12, positiveMod2, length2);
                }
            } else {
                Object[] objArr10 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr10, objArr10, size, 0, positiveMod);
                Object[] objArr11 = this.elementData;
                if (i12 >= objArr11.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr11, objArr11, i12 - objArr11.length, positiveMod2, objArr11.length);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr12, objArr12, i12, positiveMod2, objArr12.length - size);
                }
            }
            copyCollectionElements(positiveMod2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    public ArrayDeque(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.elementData = array;
        this.size = array.length;
        if (array.length == 0) {
            this.elementData = emptyElementData;
        }
    }
}
