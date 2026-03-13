package kotlin.concurrent.atomics;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\t\u001a\u0019\u0010\n\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\t\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\t\u001a-\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u0007\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\n\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u000b\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\f\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0011\u001a;\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0006\b\u0000\u0010\u0014\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00140\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a&\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00140\u0013\"\u0006\b\u0000\u0010\u0014\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b¢\u0006\u0002\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"AtomicIntArray", "Lkotlin/concurrent/atomics/AtomicIntArray;", "size", "", "init", "Lkotlin/Function1;", "(ILkotlin/jvm/functions/Function1;)Ljava/util/concurrent/atomic/AtomicIntegerArray;", "fetchAndIncrementAt", "index", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;I)I", "incrementAndFetchAt", "decrementAndFetchAt", "fetchAndDecrementAt", "AtomicLongArray", "Lkotlin/concurrent/atomics/AtomicLongArray;", "", "(ILkotlin/jvm/functions/Function1;)Ljava/util/concurrent/atomic/AtomicLongArray;", "(Ljava/util/concurrent/atomic/AtomicLongArray;I)J", "AtomicArray", "Lkotlin/concurrent/atomics/AtomicArray;", "T", "(ILkotlin/jvm/functions/Function1;)Ljava/util/concurrent/atomic/AtomicReferenceArray;", "atomicArrayOfNulls", "(I)Ljava/util/concurrent/atomic/AtomicReferenceArray;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/concurrent/atomics/AtomicArraysKt")
@SourceDebugExtension({"SMAP\nAtomicArrays.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicArrays.common.kt\nkotlin/concurrent/atomics/AtomicArraysKt__AtomicArrays_commonKt\n*L\n1#1,768:1\n666#1:769\n*S KotlinDebug\n*F\n+ 1 AtomicArrays.common.kt\nkotlin/concurrent/atomics/AtomicArraysKt__AtomicArrays_commonKt\n*L\n678#1:769\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class AtomicArraysKt__AtomicArrays_commonKt {
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final /* synthetic */ <T> AtomicReferenceArray<T> AtomicArray(int i3, Function1<? super Integer, ? extends T> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        Intrinsics.reifiedOperationMarker(0, "T");
        Object[] objArr = new Object[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            objArr[i10] = init.invoke(Integer.valueOf(i10));
        }
        return new AtomicReferenceArray<>(objArr);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final AtomicIntegerArray AtomicIntArray(int i3, Function1<? super Integer, Integer> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        int[] iArr = new int[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            iArr[i10] = init.invoke(Integer.valueOf(i10)).intValue();
        }
        return new AtomicIntegerArray(iArr);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final AtomicLongArray AtomicLongArray(int i3, Function1<? super Integer, Long> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        long[] jArr = new long[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            jArr[i10] = init.invoke(Integer.valueOf(i10)).longValue();
        }
        return new AtomicLongArray(jArr);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    public static final /* synthetic */ <T> AtomicReferenceArray<T> atomicArrayOfNulls(int i3) {
        Intrinsics.reifiedOperationMarker(0, "T?");
        Object[] objArr = new Object[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            objArr[i10] = null;
        }
        return new AtomicReferenceArray<>(objArr);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int decrementAndFetchAt(AtomicIntegerArray atomicIntegerArray, int i3) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        return atomicIntegerArray.addAndGet(i3, -1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int fetchAndDecrementAt(AtomicIntegerArray atomicIntegerArray, int i3) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        return atomicIntegerArray.getAndAdd(i3, -1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int fetchAndIncrementAt(AtomicIntegerArray atomicIntegerArray, int i3) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        return atomicIntegerArray.getAndAdd(i3, 1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int incrementAndFetchAt(AtomicIntegerArray atomicIntegerArray, int i3) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        return atomicIntegerArray.addAndGet(i3, 1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long decrementAndFetchAt(AtomicLongArray atomicLongArray, int i3) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        return atomicLongArray.addAndGet(i3, -1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long fetchAndDecrementAt(AtomicLongArray atomicLongArray, int i3) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        return atomicLongArray.getAndAdd(i3, -1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long fetchAndIncrementAt(AtomicLongArray atomicLongArray, int i3) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        return atomicLongArray.getAndAdd(i3, 1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long incrementAndFetchAt(AtomicLongArray atomicLongArray, int i3) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        return atomicLongArray.addAndGet(i3, 1L);
    }
}
