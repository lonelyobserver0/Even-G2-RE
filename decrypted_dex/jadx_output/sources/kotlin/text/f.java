package kotlin.text;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class f implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15641c;

    public /* synthetic */ f(int i3, Object obj, boolean z2) {
        this.f15639a = i3;
        this.f15641c = obj;
        this.f15640b = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Pair rangesDelimitedBy$lambda$0$StringsKt__StringsKt;
        Pair rangesDelimitedBy$lambda$1$StringsKt__StringsKt;
        int i3 = this.f15639a;
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i3) {
            case 0:
                rangesDelimitedBy$lambda$0$StringsKt__StringsKt = StringsKt__StringsKt.rangesDelimitedBy$lambda$0$StringsKt__StringsKt((char[]) this.f15641c, this.f15640b, charSequence, intValue);
                return rangesDelimitedBy$lambda$0$StringsKt__StringsKt;
            default:
                rangesDelimitedBy$lambda$1$StringsKt__StringsKt = StringsKt__StringsKt.rangesDelimitedBy$lambda$1$StringsKt__StringsKt((List) this.f15641c, this.f15640b, charSequence, intValue);
                return rangesDelimitedBy$lambda$1$StringsKt__StringsKt;
        }
    }
}
