package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15626a;

    public /* synthetic */ c(int i3) {
        this.f15626a = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Iterator flatten$lambda$0$SequencesKt__SequencesKt;
        Iterator flatten$lambda$1$SequencesKt__SequencesKt;
        Object flatten$lambda$2$SequencesKt__SequencesKt;
        Object filterIndexed$lambda$1$SequencesKt___SequencesKt;
        boolean filterNotNull$lambda$0$SequencesKt___SequencesKt;
        Object distinct$lambda$0$SequencesKt___SequencesKt;
        switch (this.f15626a) {
            case 0:
                flatten$lambda$0$SequencesKt__SequencesKt = SequencesKt__SequencesKt.flatten$lambda$0$SequencesKt__SequencesKt((Sequence) obj);
                return flatten$lambda$0$SequencesKt__SequencesKt;
            case 1:
                flatten$lambda$1$SequencesKt__SequencesKt = SequencesKt__SequencesKt.flatten$lambda$1$SequencesKt__SequencesKt((Iterable) obj);
                return flatten$lambda$1$SequencesKt__SequencesKt;
            case 2:
                flatten$lambda$2$SequencesKt__SequencesKt = SequencesKt__SequencesKt.flatten$lambda$2$SequencesKt__SequencesKt(obj);
                return flatten$lambda$2$SequencesKt__SequencesKt;
            case 3:
                filterIndexed$lambda$1$SequencesKt___SequencesKt = SequencesKt___SequencesKt.filterIndexed$lambda$1$SequencesKt___SequencesKt((IndexedValue) obj);
                return filterIndexed$lambda$1$SequencesKt___SequencesKt;
            case 4:
                filterNotNull$lambda$0$SequencesKt___SequencesKt = SequencesKt___SequencesKt.filterNotNull$lambda$0$SequencesKt___SequencesKt(obj);
                return Boolean.valueOf(filterNotNull$lambda$0$SequencesKt___SequencesKt);
            default:
                distinct$lambda$0$SequencesKt___SequencesKt = SequencesKt___SequencesKt.distinct$lambda$0$SequencesKt___SequencesKt(obj);
                return distinct$lambda$0$SequencesKt___SequencesKt;
        }
    }
}
