package kotlin.sequences;

import X2.t;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"kotlin/sequences/SequencesKt___SequencesKt$minus$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class SequencesKt___SequencesKt$minus$1<T> implements Sequence<T> {
    final /* synthetic */ T $element;
    final /* synthetic */ Sequence<T> $this_minus;

    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$minus$1(Sequence<? extends T> sequence, T t3) {
        this.$this_minus = sequence;
        this.$element = t3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean iterator$lambda$0(Ref.BooleanRef booleanRef, Object obj, Object obj2) {
        if (booleanRef.element || !Intrinsics.areEqual(obj2, obj)) {
            return true;
        }
        booleanRef.element = true;
        return false;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return SequencesKt___SequencesKt.filter(this.$this_minus, new t(1, new Ref.BooleanRef(), this.$element)).iterator();
    }
}
