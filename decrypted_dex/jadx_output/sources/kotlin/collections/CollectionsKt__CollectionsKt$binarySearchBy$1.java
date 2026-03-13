package kotlin.collections;

import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX WARN: Incorrect field signature: TK; */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n*L\n1#1,527:1\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class CollectionsKt__CollectionsKt$binarySearchBy$1<T> implements Function1<T, Integer> {
    final /* synthetic */ Comparable $key;
    final /* synthetic */ Function1<T, K> $selector;

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TT;+TK;>;TK;)V */
    public CollectionsKt__CollectionsKt$binarySearchBy$1(Function1 function1, Comparable comparable) {
        this.$selector = function1;
        this.$key = comparable;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(T t3) {
        return Integer.valueOf(ComparisonsKt.compareValues((Comparable) this.$selector.invoke(t3), this.$key));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Object obj) {
        return invoke((CollectionsKt__CollectionsKt$binarySearchBy$1<T>) obj);
    }
}
