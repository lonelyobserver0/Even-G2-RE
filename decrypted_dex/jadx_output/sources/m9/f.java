package m9;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17288b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i3, int i10) {
        super(1);
        this.f17287a = i3;
        this.f17288b = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue() - this.f17287a;
        if (intValue < 0 || intValue >= this.f17288b) {
            return null;
        }
        return Integer.valueOf(intValue);
    }
}
