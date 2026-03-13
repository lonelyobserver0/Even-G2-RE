package kotlin.collections;

import Xa.h;
import i2.u;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\n\u0010\rJ\u0016\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0002J'\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\u0004\b\u0001\u0010\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0014¢\u0006\u0002\u0010\u001dJ\u0015\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0014¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010 \u001a\u00020\tJ\u0013\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00028\u0000¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\tJ\u0015\u0010'\u001a\u00020\t*\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0082\bR\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "buffer", "", "", "filledSize", "", "<init>", "([Ljava/lang/Object;I)V", "capacity", "(I)V", "[Ljava/lang/Object;", "startIndex", "value", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "isFull", "", "iterator", "", "toArray", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "expanded", "maxCapacity", "add", "", "element", "(Ljava/lang/Object;)V", "removeFirst", "n", "forward", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n204#1:208\n204#1:209\n204#1:210\n1#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:208\n175#1:209\n188#1:210\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {
    private final Object[] buffer;
    private final int capacity;
    private int size;
    private int startIndex;

    public RingBuffer(Object[] buffer, int i3) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        if (i3 < 0) {
            throw new IllegalArgumentException(u.p(i3, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i3 <= buffer.length) {
            this.capacity = buffer.length;
            this.size = i3;
        } else {
            StringBuilder u2 = h.u(i3, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            u2.append(buffer.length);
            throw new IllegalArgumentException(u2.toString().toString());
        }
    }

    private final int forward(int i3, int i10) {
        return (i3 + i10) % this.capacity;
    }

    @Override // java.util.Collection, java.util.List
    public final void add(T element) {
        if (isFull()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.buffer[(size() + this.startIndex) % this.capacity] = element;
        this.size = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RingBuffer<T> expanded(int maxCapacity) {
        Object[] array;
        int i3 = this.capacity;
        int coerceAtMost = RangesKt.coerceAtMost(i3 + (i3 >> 1) + 1, maxCapacity);
        if (this.startIndex == 0) {
            array = Arrays.copyOf(this.buffer, coerceAtMost);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        } else {
            array = toArray(new Object[coerceAtMost]);
        }
        return new RingBuffer<>(array, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int index) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        return (T) this.buffer[(this.startIndex + index) % this.capacity];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    public final boolean isFull() {
        return size() == this.capacity;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.collections.RingBuffer$iterator$1
            private int count;
            private int index;
            final /* synthetic */ RingBuffer<T> this$0;

            {
                int i3;
                this.this$0 = this;
                this.count = this.size();
                i3 = ((RingBuffer) this).startIndex;
                this.index = i3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            public void computeNext() {
                Object[] objArr;
                if (this.count == 0) {
                    done();
                    return;
                }
                objArr = ((RingBuffer) this.this$0).buffer;
                setNext(objArr[this.index]);
                this.index = (this.index + 1) % ((RingBuffer) this.this$0).capacity;
                this.count--;
            }
        };
    }

    public final void removeFirst(int n10) {
        if (n10 < 0) {
            throw new IllegalArgumentException(u.p(n10, "n shouldn't be negative but it is ").toString());
        }
        if (n10 > size()) {
            StringBuilder u2 = h.u(n10, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            u2.append(size());
            throw new IllegalArgumentException(u2.toString().toString());
        }
        if (n10 > 0) {
            int i3 = this.startIndex;
            int i10 = (i3 + n10) % this.capacity;
            if (i3 > i10) {
                ArraysKt___ArraysJvmKt.fill(this.buffer, (Object) null, i3, this.capacity);
                ArraysKt___ArraysJvmKt.fill(this.buffer, (Object) null, 0, i10);
            } else {
                ArraysKt___ArraysJvmKt.fill(this.buffer, (Object) null, i3, i10);
            }
            this.startIndex = i10;
            this.size = size() - n10;
        }
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        Object[] objArr = array;
        if (length < size()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(array, size());
            Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(...)");
            objArr = objArr2;
        }
        int size = size();
        int i3 = 0;
        int i10 = 0;
        for (int i11 = this.startIndex; i10 < size && i11 < this.capacity; i11++) {
            objArr[i10] = this.buffer[i11];
            i10++;
        }
        while (i10 < size) {
            objArr[i10] = this.buffer[i3];
            i10++;
            i3++;
        }
        return (T[]) CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(size, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public RingBuffer(int i3) {
        this(new Object[i3], 0);
    }
}
