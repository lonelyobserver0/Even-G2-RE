package kotlin.concurrent.atomics;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\u0004\u001a\u00020\u0006*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\u0000\u001a\u00020\b*\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\u0011\u0010\u0004\u001a\u00020\t*\u00020\bH\u0007¢\u0006\u0002\u0010\n\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\rH\u0007¢\u0006\u0002\u0010\u000e\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\f0\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u000bH\u0007¢\u0006\u0002\u0010\u000e\u001a6\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u0014\u001a6\u0010\u0015\u001a\u00020\u0013*\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u0016\u001a6\u0010\u0017\u001a\u00020\u0013*\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u0016\u001a6\u0010\u000f\u001a\u00020\u0010*\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u0019\u001a6\u0010\u0015\u001a\u00020\u0018*\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u001a\u001a6\u0010\u0017\u001a\u00020\u0018*\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u001a\u001aB\u0010\u000f\u001a\u00020\u0010\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\f0\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u001b\u001aB\u0010\u0015\u001a\u0002H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\f0\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u001c\u001aB\u0010\u0017\u001a\u0002H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\f0\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0002\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"asJavaAtomic", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lkotlin/concurrent/atomics/AtomicInt;", "(Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/concurrent/atomic/AtomicInteger;", "asKotlinAtomic", "Ljava/util/concurrent/atomic/AtomicLong;", "Lkotlin/concurrent/atomics/AtomicLong;", "(Ljava/util/concurrent/atomic/AtomicLong;)Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/concurrent/atomics/AtomicBoolean;", "(Ljava/util/concurrent/atomic/AtomicBoolean;)Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicReference;", "T", "Lkotlin/concurrent/atomics/AtomicReference;", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;", "update", "", "transform", "Lkotlin/Function1;", "", "(Ljava/util/concurrent/atomic/AtomicInteger;Lkotlin/jvm/functions/Function1;)V", "fetchAndUpdate", "(Ljava/util/concurrent/atomic/AtomicInteger;Lkotlin/jvm/functions/Function1;)I", "updateAndFetch", "", "(Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;)V", "(Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;)J", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;)V", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/concurrent/atomics/AtomicsKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class AtomicsKt__Atomics_jvmKt extends AtomicsKt__Atomics_commonKt {
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final AtomicBoolean asJavaAtomic(AtomicBoolean atomicBoolean) {
        Intrinsics.checkNotNullParameter(atomicBoolean, "<this>");
        return atomicBoolean;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final AtomicBoolean asKotlinAtomic(AtomicBoolean atomicBoolean) {
        Intrinsics.checkNotNullParameter(atomicBoolean, "<this>");
        return atomicBoolean;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final int fetchAndUpdate(AtomicInteger atomicInteger, Function1<? super Integer, Integer> transform) {
        int i3;
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            i3 = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i3, transform.invoke(Integer.valueOf(i3)).intValue()));
        return i3;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final void update(AtomicInteger atomicInteger, Function1<? super Integer, Integer> transform) {
        int i3;
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            i3 = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i3, transform.invoke(Integer.valueOf(i3)).intValue()));
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final int updateAndFetch(AtomicInteger atomicInteger, Function1<? super Integer, Integer> transform) {
        int i3;
        int intValue;
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            i3 = atomicInteger.get();
            intValue = transform.invoke(Integer.valueOf(i3)).intValue();
        } while (!atomicInteger.compareAndSet(i3, intValue));
        return intValue;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final AtomicInteger asJavaAtomic(AtomicInteger atomicInteger) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        return atomicInteger;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final AtomicInteger asKotlinAtomic(AtomicInteger atomicInteger) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        return atomicInteger;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final void update(AtomicLong atomicLong, Function1<? super Long, Long> transform) {
        long j;
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, transform.invoke(Long.valueOf(j)).longValue()));
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final AtomicLong asJavaAtomic(AtomicLong atomicLong) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        return atomicLong;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final AtomicLong asKotlinAtomic(AtomicLong atomicLong) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        return atomicLong;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final <T> void update(AtomicReference<T> atomicReference, Function1<? super T, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(atomicReference, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        while (true) {
            Object obj = atomicReference.get();
            T invoke = transform.invoke(obj);
            while (!atomicReference.compareAndSet(obj, invoke)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            return;
        }
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final <T> AtomicReference<T> asJavaAtomic(AtomicReference<T> atomicReference) {
        Intrinsics.checkNotNullParameter(atomicReference, "<this>");
        return atomicReference;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final <T> AtomicReference<T> asKotlinAtomic(AtomicReference<T> atomicReference) {
        Intrinsics.checkNotNullParameter(atomicReference, "<this>");
        return atomicReference;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final long fetchAndUpdate(AtomicLong atomicLong, Function1<? super Long, Long> transform) {
        long j;
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, transform.invoke(Long.valueOf(j)).longValue()));
        return j;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final long updateAndFetch(AtomicLong atomicLong, Function1<? super Long, Long> transform) {
        long j;
        long longValue;
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            j = atomicLong.get();
            longValue = transform.invoke(Long.valueOf(j)).longValue();
        } while (!atomicLong.compareAndSet(j, longValue));
        return longValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final <T> T fetchAndUpdate(AtomicReference<T> atomicReference, Function1<? super T, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(atomicReference, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        while (true) {
            ?? r02 = (Object) atomicReference.get();
            T invoke = transform.invoke(r02);
            while (!atomicReference.compareAndSet(r02, invoke)) {
                if (atomicReference.get() != r02) {
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
    private static final <T> T updateAndFetch(AtomicReference<T> atomicReference, Function1<? super T, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(atomicReference, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        while (true) {
            Object obj = atomicReference.get();
            T invoke = transform.invoke(obj);
            while (!atomicReference.compareAndSet(obj, invoke)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            return invoke;
        }
    }
}
