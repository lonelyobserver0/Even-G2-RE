package kotlin.collections;

import Xa.h;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import p0.AbstractC1482f;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aD\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001aH\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\r\"\u0004\b\u0000\u0010\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\b0\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000¨\u0006\u000f"}, d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedSequence", "Lkotlin/sequences/Sequence;", "", "T", "partialWindows", "", "reuseBuffer", "windowedIterator", "", "iterator", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class SlidingWindowKt {
    public static final void checkWindowSizeStep(int i3, int i10) {
        if (i3 <= 0 || i10 <= 0) {
            throw new IllegalArgumentException((i3 != i10 ? AbstractC1482f.e(i3, "Both size ", i10, " and step ", " must be greater than zero.") : h.g(i3, "size ", " must be greater than zero.")).toString());
        }
    }

    public static final <T> Iterator<List<T>> windowedIterator(Iterator<? extends T> iterator, int i3, int i10, boolean z2, boolean z10) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return !iterator.hasNext() ? EmptyIterator.INSTANCE : SequencesKt.iterator(new SlidingWindowKt$windowedIterator$1(i3, i10, iterator, z10, z2, null));
    }

    public static final <T> Sequence<List<T>> windowedSequence(final Sequence<? extends T> sequence, final int i3, final int i10, final boolean z2, final boolean z10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        checkWindowSizeStep(i3, i10);
        return new Sequence<List<? extends T>>() { // from class: kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<List<? extends T>> iterator() {
                return SlidingWindowKt.windowedIterator(Sequence.this.iterator(), i3, i10, z2, z10);
            }
        };
    }
}
