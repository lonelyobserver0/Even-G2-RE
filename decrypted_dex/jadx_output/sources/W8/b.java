package W8;

import B3.s;
import Qb.I;
import com.google.android.gms.internal.measurement.D1;
import com.mapbox.navigator.ElectronicHorizonPosition;
import com.mapbox.navigator.RoadObjectDistance;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.TimeSource;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ElectronicHorizonPosition f8174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f8175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f8176c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ElectronicHorizonPosition electronicHorizonPosition, List list, s sVar, Continuation continuation) {
        super(2, continuation);
        this.f8174a = electronicHorizonPosition;
        this.f8175b = list;
        this.f8176c = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f8174a, this.f8175b, this.f8176c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        E7.a aVar = E7.a.f1927a;
        boolean a3 = E7.a.a();
        ElectronicHorizonPosition electronicHorizonPosition = this.f8174a;
        List list = this.f8175b;
        s sVar = this.f8176c;
        if (a3) {
            String string2 = StubApp.getString2(6929);
            E7.a.c(string2);
            try {
                long m1480markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                Q7.f b2 = D1.b(electronicHorizonPosition);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(D1.c((RoadObjectDistance) it.next()));
                }
                sVar.getClass();
                s.a(sVar, new a(b2, arrayList, null));
                Unit unit = Unit.INSTANCE;
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto));
                E7.a.b(string2);
            } catch (Throwable th) {
                E7.a.b(string2);
                throw th;
            }
        } else {
            Q7.f b10 = D1.b(electronicHorizonPosition);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(D1.c((RoadObjectDistance) it2.next()));
            }
            sVar.getClass();
            s.a(sVar, new a(b10, arrayList2, null));
        }
        return Unit.INSTANCE;
    }
}
