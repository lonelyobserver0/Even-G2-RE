package kotlin.sequences;

import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15625b;

    public /* synthetic */ b(Object obj, int i3) {
        this.f15624a = i3;
        this.f15625b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object generateSequence$lambda$0$SequencesKt__SequencesKt;
        boolean isInstance;
        Object requireNoNulls$lambda$0$SequencesKt___SequencesKt;
        boolean filterIndexed$lambda$0$SequencesKt___SequencesKt;
        Object onEach$lambda$0$SequencesKt___SequencesKt;
        boolean contains;
        boolean contains2;
        boolean contains3;
        switch (this.f15624a) {
            case 0:
                generateSequence$lambda$0$SequencesKt__SequencesKt = SequencesKt__SequencesKt.generateSequence$lambda$0$SequencesKt__SequencesKt((Function0) this.f15625b, obj);
                return generateSequence$lambda$0$SequencesKt__SequencesKt;
            case 1:
                isInstance = ((Class) this.f15625b).isInstance(obj);
                return Boolean.valueOf(isInstance);
            case 2:
                requireNoNulls$lambda$0$SequencesKt___SequencesKt = SequencesKt___SequencesKt.requireNoNulls$lambda$0$SequencesKt___SequencesKt((Sequence) this.f15625b, obj);
                return requireNoNulls$lambda$0$SequencesKt___SequencesKt;
            case 3:
                filterIndexed$lambda$0$SequencesKt___SequencesKt = SequencesKt___SequencesKt.filterIndexed$lambda$0$SequencesKt___SequencesKt((Function2) this.f15625b, (IndexedValue) obj);
                return Boolean.valueOf(filterIndexed$lambda$0$SequencesKt___SequencesKt);
            case 4:
                onEach$lambda$0$SequencesKt___SequencesKt = SequencesKt___SequencesKt.onEach$lambda$0$SequencesKt___SequencesKt((Function1) this.f15625b, obj);
                return onEach$lambda$0$SequencesKt___SequencesKt;
            case 5:
                contains = ArraysKt.contains((Object[]) this.f15625b, obj);
                return Boolean.valueOf(contains);
            case 6:
                contains2 = ((Collection) this.f15625b).contains(obj);
                return Boolean.valueOf(contains2);
            default:
                contains3 = ((List) this.f15625b).contains(obj);
                return Boolean.valueOf(contains3);
        }
    }
}
