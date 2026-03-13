package kotlin.collections.builders;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0005\u001a=\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\n\u0012\u0006\b\u0001\u0012\u0002H\b0\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\fH\u0002¢\u0006\u0002\u0010\r\u001a-\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u000f\u001a9\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002¢\u0006\u0002\u0010\u0014\u001a+\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0017\u001a%\u0010\u0018\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u001b\u001a-\u0010\u001c\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u001f¨\u0006 "}, d2 = {"arrayOfUninitializedElements", "", "E", "size", "", "(I)[Ljava/lang/Object;", "subarrayContentToString", "", "T", "offset", "length", "thisCollection", "", "([Ljava/lang/Object;IILjava/util/Collection;)Ljava/lang/String;", "subarrayContentHashCode", "([Ljava/lang/Object;II)I", "subarrayContentEquals", "", "other", "", "([Ljava/lang/Object;IILjava/util/List;)Z", "copyOfUninitializedElements", "newSize", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "resetAt", "", "index", "([Ljava/lang/Object;I)V", "resetRange", "fromIndex", "toIndex", "([Ljava/lang/Object;II)V", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class ListBuilderKt {
    public static final <E> E[] arrayOfUninitializedElements(int i3) {
        if (i3 >= 0) {
            return (E[]) new Object[i3];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final <T> T[] copyOfUninitializedElements(T[] tArr, int i3) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i3);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <E> void resetAt(E[] eArr, int i3) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        eArr[i3] = null;
    }

    public static final <E> void resetRange(E[] eArr, int i3, int i10) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        while (i3 < i10) {
            resetAt(eArr, i3);
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean subarrayContentEquals(T[] tArr, int i3, int i10, List<?> list) {
        if (i10 != list.size()) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!Intrinsics.areEqual(tArr[i3 + i11], list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int subarrayContentHashCode(T[] tArr, int i3, int i10) {
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            T t3 = tArr[i3 + i12];
            i11 = (i11 * 31) + (t3 != null ? t3.hashCode() : 0);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> String subarrayContentToString(T[] tArr, int i3, int i10, Collection<? extends T> collection) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            T t3 = tArr[i3 + i11];
            if (t3 == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(t3);
            }
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
