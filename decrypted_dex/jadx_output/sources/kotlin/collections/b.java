package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15581b;

    public /* synthetic */ b(Object obj, int i3) {
        this.f15580a = i3;
        this.f15581b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Iterator it;
        switch (this.f15580a) {
            case 0:
                return ArraysKt___ArraysKt.withIndex$lambda$1$ArraysKt___ArraysKt((byte[]) this.f15581b);
            case 1:
                return ArraysKt___ArraysKt.withIndex$lambda$0$ArraysKt___ArraysKt((Object[]) this.f15581b);
            case 2:
                return ArraysKt___ArraysKt.withIndex$lambda$3$ArraysKt___ArraysKt((int[]) this.f15581b);
            case 3:
                return ArraysKt___ArraysKt.withIndex$lambda$6$ArraysKt___ArraysKt((double[]) this.f15581b);
            case 4:
                return ArraysKt___ArraysKt.withIndex$lambda$8$ArraysKt___ArraysKt((char[]) this.f15581b);
            case 5:
                return ArraysKt___ArraysKt.withIndex$lambda$2$ArraysKt___ArraysKt((short[]) this.f15581b);
            case 6:
                return ArraysKt___ArraysKt.withIndex$lambda$5$ArraysKt___ArraysKt((float[]) this.f15581b);
            case 7:
                return ArraysKt___ArraysKt.withIndex$lambda$7$ArraysKt___ArraysKt((boolean[]) this.f15581b);
            case 8:
                return ArraysKt___ArraysKt.withIndex$lambda$4$ArraysKt___ArraysKt((long[]) this.f15581b);
            default:
                it = ((Iterable) this.f15581b).iterator();
                return it;
        }
    }
}
