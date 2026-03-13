package d;

import android.os.Looper;
import com.stub.StubApp;
import d5.C0804d;
import d5.C0805e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class y extends FunctionReferenceImpl implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13115a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i3) {
        super(0, C0805e.f13421d, C0804d.class, StubApp.getString2(16431), StubApp.getString2(16432), 0);
        this.f13115a = i3;
        switch (i3) {
            case 3:
                super(0, C0805e.f13421d, C0804d.class, StubApp.getString2(16435), StubApp.getString2(16436), 0);
                break;
            case 4:
                super(0, C0805e.f13421d, C0804d.class, StubApp.getString2(16433), StubApp.getString2(16434), 0);
                break;
            default:
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean contains$default;
        boolean contains$default2;
        switch (this.f13115a) {
            case 0:
                ((z) this.receiver).d();
                return Unit.INSTANCE;
            case 1:
                ((z) this.receiver).d();
                return Unit.INSTANCE;
            case 2:
                ((C0804d) this.receiver).getClass();
                String threadName = Thread.currentThread().getName();
                Intrinsics.checkNotNullExpressionValue(threadName, "threadName");
                contains$default = StringsKt__StringsKt.contains$default(threadName, (CharSequence) StubApp.getString2(16442), false, 2, (Object) null);
                return Boolean.valueOf(contains$default);
            case 3:
                ((C0804d) this.receiver).getClass();
                String threadName2 = Thread.currentThread().getName();
                Intrinsics.checkNotNullExpressionValue(threadName2, "threadName");
                contains$default2 = StringsKt__StringsKt.contains$default(threadName2, (CharSequence) StubApp.getString2(16441), false, 2, (Object) null);
                return Boolean.valueOf(contains$default2);
            case 4:
                ((C0804d) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
            default:
                m8.r rVar = (m8.r) this.receiver;
                P7.b bVar = rVar.f17229i.f7890v;
                return Integer.valueOf(bVar != null ? bVar.f5566e.f5553a : rVar.f17228h.f20093e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i3, Object obj, Class cls, String str, String str2, int i10) {
        super(i3, obj, cls, str, str2, i10);
        this.f13115a = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Object obj) {
        super(0, obj, z.class, StubApp.getString2(16437), StubApp.getString2(16438), 0);
        this.f13115a = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(m8.r rVar) {
        super(0, rVar, m8.r.class, StubApp.getString2(16439), StubApp.getString2(16440), 0);
        this.f13115a = 5;
    }
}
