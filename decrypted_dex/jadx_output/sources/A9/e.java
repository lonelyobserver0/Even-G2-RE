package A9;

import com.mapbox.api.directions.v5.models.Closure;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends Lambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f226b = new e(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f227c = new e(2, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f228d = new e(2, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final e f229e = new e(2, 3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i3, int i10) {
        super(i3);
        this.f230a = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f230a) {
            case 0:
                return Boolean.valueOf(Intrinsics.areEqual((Closure) obj, (Closure) obj2));
            case 1:
                return Boolean.valueOf(Intrinsics.areEqual((String) obj, (String) obj2));
            case 2:
                return Boolean.valueOf(Intrinsics.areEqual((String) obj, (String) obj2));
            default:
                return Boolean.valueOf(Intrinsics.areEqual((Integer) obj, (Integer) obj2));
        }
    }
}
