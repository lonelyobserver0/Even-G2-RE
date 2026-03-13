package kotlin.sequences;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class d implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15627a;

    public /* synthetic */ d(int i3) {
        this.f15627a = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Pair pair;
        Pair pair2;
        switch (this.f15627a) {
            case 0:
                pair = TuplesKt.to(obj, obj2);
                return pair;
            default:
                pair2 = TuplesKt.to(obj, obj2);
                return pair2;
        }
    }
}
