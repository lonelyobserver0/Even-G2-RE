package kotlin.sequences;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"kotlin/sequences/SequencesKt___SequencesKt$minus$4", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class SequencesKt___SequencesKt$minus$4<T> implements Sequence<T> {
    final /* synthetic */ Sequence<T> $elements;
    final /* synthetic */ Sequence<T> $this_minus;

    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$minus$4(Sequence<? extends T> sequence, Sequence<? extends T> sequence2) {
        this.$elements = sequence;
        this.$this_minus = sequence2;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        List list = SequencesKt___SequencesKt.toList(this.$elements);
        return list.isEmpty() ? this.$this_minus.iterator() : SequencesKt___SequencesKt.filterNot(this.$this_minus, new b(list, 7)).iterator();
    }
}
