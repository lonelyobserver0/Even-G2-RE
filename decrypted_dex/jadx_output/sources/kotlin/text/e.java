package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class e implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharSequence f15638b;

    public /* synthetic */ e(CharSequence charSequence, int i3) {
        this.f15637a = i3;
        this.f15638b = charSequence;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String splitToSequence$lambda$1$StringsKt__StringsKt;
        String splitToSequence$lambda$0$StringsKt__StringsKt;
        switch (this.f15637a) {
            case 0:
                splitToSequence$lambda$1$StringsKt__StringsKt = StringsKt__StringsKt.splitToSequence$lambda$1$StringsKt__StringsKt(this.f15638b, (IntRange) obj);
                return splitToSequence$lambda$1$StringsKt__StringsKt;
            default:
                splitToSequence$lambda$0$StringsKt__StringsKt = StringsKt__StringsKt.splitToSequence$lambda$0$StringsKt__StringsKt(this.f15638b, (IntRange) obj);
                return splitToSequence$lambda$0$StringsKt__StringsKt;
        }
    }
}
