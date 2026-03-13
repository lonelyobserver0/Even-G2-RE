package J2;

import io.flutter.plugin.common.MethodChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f3397b;

    public /* synthetic */ a(MethodChannel.Result result, int i3) {
        this.f3396a = i3;
        this.f3397b = result;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MethodChannel.Result result = this.f3397b;
        switch (this.f3396a) {
            case 0:
                Map schedule = (Map) obj;
                Intrinsics.checkNotNullParameter(schedule, "schedule");
                result.success(schedule);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                LinkedHashMap linkedHashMap = M2.c.f4515g;
                result.success(bool);
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                LinkedHashMap linkedHashMap2 = M2.c.f4515g;
                result.success(bool2);
                break;
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                LinkedHashMap linkedHashMap3 = M2.c.f4515g;
                result.success(bool3);
                break;
            default:
                result.success((String) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
