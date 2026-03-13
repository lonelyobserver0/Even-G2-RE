package kotlin.concurrent.atomics;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\u0004\u001a\u00020\u0006*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\nH\u0007¢\u0006\u0002\u0010\u000b\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\t0\n\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\bH\u0007¢\u0006\u0002\u0010\u000b\u001a>\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0012\u001a>\u0010\u0013\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0014\u001a>\u0010\u0015\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0014\u001a>\u0010\f\u001a\u00020\r*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0017\u001a>\u0010\u0013\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0018\u001a>\u0010\u0015\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0018\u001aJ\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0019\u001aJ\u0010\u0013\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u001a\u001aJ\u0010\u0015\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"asJavaAtomicArray", "Ljava/util/concurrent/atomic/AtomicIntegerArray;", "Lkotlin/concurrent/atomics/AtomicIntArray;", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;)Ljava/util/concurrent/atomic/AtomicIntegerArray;", "asKotlinAtomicArray", "Ljava/util/concurrent/atomic/AtomicLongArray;", "Lkotlin/concurrent/atomics/AtomicLongArray;", "(Ljava/util/concurrent/atomic/AtomicLongArray;)Ljava/util/concurrent/atomic/AtomicLongArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "T", "Lkotlin/concurrent/atomics/AtomicArray;", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;)Ljava/util/concurrent/atomic/AtomicReferenceArray;", "updateAt", "", "index", "", "transform", "Lkotlin/Function1;", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;ILkotlin/jvm/functions/Function1;)V", "updateAndFetchAt", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;ILkotlin/jvm/functions/Function1;)I", "fetchAndUpdateAt", "", "(Ljava/util/concurrent/atomic/AtomicLongArray;ILkotlin/jvm/functions/Function1;)V", "(Ljava/util/concurrent/atomic/AtomicLongArray;ILkotlin/jvm/functions/Function1;)J", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILkotlin/jvm/functions/Function1;)V", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/concurrent/atomics/AtomicArraysKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class AtomicArraysKt__AtomicArrays_jvmKt extends AtomicArraysKt__AtomicArrays_commonKt {
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final AtomicIntegerArray asJavaAtomicArray(AtomicIntegerArray atomicIntegerArray) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        return atomicIntegerArray;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final AtomicIntegerArray asKotlinAtomicArray(AtomicIntegerArray atomicIntegerArray) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        return atomicIntegerArray;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final int fetchAndUpdateAt(AtomicIntegerArray atomicIntegerArray, int i3, Function1<? super Integer, Integer> transform) {
        int i10;
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            i10 = atomicIntegerArray.get(i3);
        } while (!atomicIntegerArray.compareAndSet(i3, i10, transform.invoke(Integer.valueOf(i10)).intValue()));
        return i10;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final int updateAndFetchAt(AtomicIntegerArray atomicIntegerArray, int i3, Function1<? super Integer, Integer> transform) {
        int i10;
        int intValue;
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            i10 = atomicIntegerArray.get(i3);
            intValue = transform.invoke(Integer.valueOf(i10)).intValue();
        } while (!atomicIntegerArray.compareAndSet(i3, i10, intValue));
        return intValue;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final void updateAt(AtomicIntegerArray atomicIntegerArray, int i3, Function1<? super Integer, Integer> transform) {
        int i10;
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            i10 = atomicIntegerArray.get(i3);
        } while (!atomicIntegerArray.compareAndSet(i3, i10, transform.invoke(Integer.valueOf(i10)).intValue()));
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final AtomicLongArray asJavaAtomicArray(AtomicLongArray atomicLongArray) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        return atomicLongArray;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final AtomicLongArray asKotlinAtomicArray(AtomicLongArray atomicLongArray) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        return atomicLongArray;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final void updateAt(AtomicLongArray atomicLongArray, int i3, Function1<? super Long, Long> transform) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        while (true) {
            long j = atomicLongArray.get(i3);
            AtomicLongArray atomicLongArray2 = atomicLongArray;
            int i10 = i3;
            if (atomicLongArray2.compareAndSet(i10, j, transform.invoke(Long.valueOf(j)).longValue())) {
                return;
            }
            atomicLongArray = atomicLongArray2;
            i3 = i10;
        }
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final <T> AtomicReferenceArray<T> asJavaAtomicArray(AtomicReferenceArray<T> atomicReferenceArray) {
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        return atomicReferenceArray;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final <T> AtomicReferenceArray<T> asKotlinAtomicArray(AtomicReferenceArray<T> atomicReferenceArray) {
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        return atomicReferenceArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final <T> void updateAt(AtomicReferenceArray<T> atomicReferenceArray, int i3, Function1<? super T, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        while (true) {
            Object obj = atomicReferenceArray.get(i3);
            T invoke = transform.invoke(obj);
            while (!atomicReferenceArray.compareAndSet(i3, obj, invoke)) {
                if (atomicReferenceArray.get(i3) != obj) {
                    break;
                }
            }
            return;
        }
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final long fetchAndUpdateAt(AtomicLongArray atomicLongArray, int i3, Function1<? super Long, Long> transform) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        while (true) {
            long j = atomicLongArray.get(i3);
            AtomicLongArray atomicLongArray2 = atomicLongArray;
            int i10 = i3;
            if (atomicLongArray2.compareAndSet(i10, j, transform.invoke(Long.valueOf(j)).longValue())) {
                return j;
            }
            atomicLongArray = atomicLongArray2;
            i3 = i10;
        }
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final long updateAndFetchAt(AtomicLongArray atomicLongArray, int i3, Function1<? super Long, Long> transform) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        while (true) {
            long j = atomicLongArray.get(i3);
            long longValue = transform.invoke(Long.valueOf(j)).longValue();
            AtomicLongArray atomicLongArray2 = atomicLongArray;
            int i10 = i3;
            if (atomicLongArray2.compareAndSet(i10, j, longValue)) {
                return longValue;
            }
            atomicLongArray = atomicLongArray2;
            i3 = i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final <T> T fetchAndUpdateAt(AtomicReferenceArray<T> atomicReferenceArray, int i3, Function1<? super T, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        while (true) {
            ?? r02 = (Object) atomicReferenceArray.get(i3);
            T invoke = transform.invoke(r02);
            while (!atomicReferenceArray.compareAndSet(i3, r02, invoke)) {
                if (atomicReferenceArray.get(i3) != r02) {
                    break;
                }
            }
            return r02;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final <T> T updateAndFetchAt(AtomicReferenceArray<T> atomicReferenceArray, int i3, Function1<? super T, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        while (true) {
            Object obj = atomicReferenceArray.get(i3);
            T invoke = transform.invoke(obj);
            while (!atomicReferenceArray.compareAndSet(i3, obj, invoke)) {
                if (atomicReferenceArray.get(i3) != obj) {
                    break;
                }
            }
            return invoke;
        }
    }
}
