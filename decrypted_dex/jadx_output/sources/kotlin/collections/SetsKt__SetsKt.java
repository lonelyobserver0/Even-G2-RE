package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a+\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005\"\u0002H\u0002¢\u0006\u0002\u0010\u0006\u001a\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u0087\b\u001a\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002H\u0087\b\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005\"\u0002H\u0002¢\u0006\u0002\u0010\u0006\u001a$\u0010\t\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\nj\b\u0012\u0004\u0012\u0002H\u0002`\u000b\"\u0004\b\u0000\u0010\u0002H\u0087\b¢\u0006\u0002\u0010\f\u001a5\u0010\t\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\nj\b\u0012\u0004\u0012\u0002H\u0002`\u000b\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005\"\u0002H\u0002¢\u0006\u0002\u0010\r\u001a$\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u000fj\b\u0012\u0004\u0012\u0002H\u0002`\u0010\"\u0004\b\u0000\u0010\u0002H\u0087\b¢\u0006\u0002\u0010\u0011\u001a5\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u000fj\b\u0012\u0004\u0012\u0002H\u0002`\u0010\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005\"\u0002H\u0002¢\u0006\u0002\u0010\u0012\u001a'\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u0001H\u0002H\u0007¢\u0006\u0002\u0010\u0016\u001a5\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00142\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00020\u0005\"\u0004\u0018\u0001H\u0002H\u0007¢\u0006\u0002\u0010\u0006\u001aF\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0001\"\u0004\b\u0000\u0010\u00182\u001f\b\u0001\u0010\u0019\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001cH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001aN\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0001\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u001f\b\u0001\u0010\u0019\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001cH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a!\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\u0087\b\u001a\u001e\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"emptySet", "", "T", "setOf", "elements", "", "([Ljava/lang/Object;)Ljava/util/Set;", "mutableSetOf", "", "hashSetOf", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "()Ljava/util/HashSet;", "([Ljava/lang/Object;)Ljava/util/HashSet;", "linkedSetOf", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "()Ljava/util/LinkedHashSet;", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "setOfNotNull", "", "element", "(Ljava/lang/Object;)Ljava/util/Set;", "buildSet", "E", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "capacity", "", "orEmpty", "optimizeReadOnlySet", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SetsKt__SetsKt extends SetsKt__SetsJVMKt {
    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final <E> Set<E> buildSet(@BuilderInference Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set createSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
        builderAction.invoke(createSetBuilder);
        return SetsKt__SetsJVMKt.build(createSetBuilder);
    }

    public static <T> Set<T> emptySet() {
        return EmptySet.INSTANCE;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> HashSet<T> hashSetOf() {
        return new HashSet<>();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> LinkedHashSet<T> linkedSetOf() {
        return new LinkedHashSet<>();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> Set<T> mutableSetOf() {
        return new LinkedHashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> optimizeReadOnlySet(Set<? extends T> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : SetsKt__SetsJVMKt.setOf(set.iterator().next()) : emptySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> Set<T> orEmpty(Set<? extends T> set) {
        return set == 0 ? emptySet() : set;
    }

    public static <T> Set<T> setOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return ArraysKt___ArraysKt.toSet(elements);
    }

    @SinceKotlin(version = "1.4")
    public static final <T> Set<T> setOfNotNull(T t3) {
        return t3 != null ? SetsKt__SetsJVMKt.setOf(t3) : emptySet();
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final <E> Set<E> buildSet(int i3, @BuilderInference Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set createSetBuilder = SetsKt__SetsJVMKt.createSetBuilder(i3);
        builderAction.invoke(createSetBuilder);
        return SetsKt__SetsJVMKt.build(createSetBuilder);
    }

    public static final <T> HashSet<T> hashSetOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (HashSet) ArraysKt___ArraysKt.toCollection(elements, new HashSet(MapsKt__MapsJVMKt.mapCapacity(elements.length)));
    }

    public static final <T> LinkedHashSet<T> linkedSetOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (LinkedHashSet) ArraysKt___ArraysKt.toCollection(elements, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(elements.length)));
    }

    public static final <T> Set<T> mutableSetOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) ArraysKt___ArraysKt.toCollection(elements, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(elements.length)));
    }

    @InlineOnly
    private static final <T> Set<T> setOf() {
        return emptySet();
    }

    @SinceKotlin(version = "1.4")
    public static final <T> Set<T> setOfNotNull(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) ArraysKt___ArraysKt.filterNotNullTo(elements, new LinkedHashSet());
    }
}
