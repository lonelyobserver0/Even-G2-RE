package kotlin.text;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0014\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00060\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0082\b\u001a\u001e\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u000f\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002\u001a\u0014\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001H\u0002¨\u0006\u0014"}, d2 = {"toInt", "", "", "Lkotlin/text/FlagEnum;", "fromInt", "", "T", "", "value", "findNext", "Lkotlin/text/MatchResult;", "Ljava/util/regex/Matcher;", "from", "input", "", "matchEntire", "range", "Lkotlin/ranges/IntRange;", "Ljava/util/regex/MatchResult;", "groupIndex", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,404:1\n1803#2,3:405\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n21#1:405,3\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class RegexKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchResult findNext(Matcher matcher, int i3, CharSequence charSequence) {
        if (matcher.find(i3)) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    private static final /* synthetic */ <T extends Enum<T> & FlagEnum> Set<T> fromInt(final int i3) {
        Intrinsics.reifiedOperationMarker(4, "T");
        EnumSet allOf = EnumSet.allOf(Enum.class);
        Intrinsics.checkNotNull(allOf);
        Intrinsics.needClassReification();
        CollectionsKt__MutableCollectionsKt.retainAll(allOf, new Function1<T, Boolean>() { // from class: kotlin.text.RegexKt$fromInt$1$1
            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Enum r32) {
                FlagEnum flagEnum = (FlagEnum) r32;
                return Boolean.valueOf((i3 & flagEnum.getMask()) == flagEnum.getValue());
            }
        });
        Set<T> unmodifiableSet = Collections.unmodifiableSet(allOf);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(...)");
        return unmodifiableSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchResult matchEntire(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange range(java.util.regex.MatchResult matchResult) {
        return RangesKt.until(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toInt(Iterable<? extends FlagEnum> iterable) {
        Iterator<? extends FlagEnum> it = iterable.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 |= it.next().getValue();
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange range(java.util.regex.MatchResult matchResult, int i3) {
        return RangesKt.until(matchResult.start(i3), matchResult.end(i3));
    }
}
