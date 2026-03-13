package b3;

import com.builttoroam.devicecalendar.CalendarDelegate;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import t6.C1737d;
import y6.InterfaceC1973b;

/* renamed from: b3.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0510l implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10637c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10638d;

    public /* synthetic */ C0510l(Object obj, Object obj2, Object obj3, int i3) {
        this.f10635a = i3;
        this.f10636b = obj;
        this.f10637c = obj2;
        this.f10638d = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit createOrUpdateEvent$lambda$5;
        switch (this.f10635a) {
            case 0:
                Result result = (Result) obj;
                if (((AtomicBoolean) this.f10636b).compareAndSet(false, true)) {
                    ((Function1) this.f10637c).invoke(result);
                } else {
                    ((C0498N) this.f10638d).getClass();
                    R2.c.f(StubApp.getString2(103), StubApp.getString2(9187));
                }
                return Unit.INSTANCE;
            case 1:
                createOrUpdateEvent$lambda$5 = CalendarDelegate.createOrUpdateEvent$lambda$5((CalendarDelegate) this.f10636b, (Ref.ObjectRef) this.f10637c, (MethodChannel.Result) this.f10638d, (Throwable) obj);
                return createOrUpdateEvent$lambda$5;
            default:
                C1737d c1737d = (C1737d) this.f10637c;
                InterfaceC1973b interfaceC1973b = ((r6.d) this.f10636b).f20369f;
                Intrinsics.checkNotNull(interfaceC1973b);
                interfaceC1973b.d(c1737d);
                ((MethodChannel.Result) this.f10638d).success(null);
                return Unit.INSTANCE;
        }
    }
}
