package H5;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p2.h f2833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2834c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p2.h hVar, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f2833b = hVar;
        this.f2834c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a0(this.f2833b, this.f2834c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List filterNotNull;
        List<Message> sortedWith;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f2832a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            I5.c cVar = I5.c.f3228a;
            this.f2832a = 1;
            obj = cVar.b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        Map map = (Map) obj;
        boolean isEmpty = map.isEmpty();
        String string2 = StubApp.getString2(88);
        if (isEmpty) {
            Log.d(string2, StubApp.getString2(2593));
        } else {
            Collection values = map.values();
            if (values == null || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (((c5.i) it.next()).f10881a.a()) {
                        ArrayList arrayList = this.f2834c;
                        p2.h hVar = this.f2833b;
                        filterNotNull = CollectionsKt___CollectionsKt.filterNotNull(CollectionsKt.mutableListOf(p2.h.a(hVar, arrayList, 2), p2.h.a(hVar, arrayList, 1)));
                        sortedWith = CollectionsKt___CollectionsKt.sortedWith(filterNotNull, new Z());
                        for (Message message : sortedWith) {
                            String string22 = StubApp.getString2(2594);
                            if (((Messenger) hVar.f19672b) != null) {
                                try {
                                    Log.d(string2, string22 + message.what + StubApp.getString2("2595"));
                                    Messenger messenger = (Messenger) hVar.f19672b;
                                    if (messenger != null) {
                                        messenger.send(message);
                                    }
                                } catch (RemoteException e10) {
                                    Log.w(string2, StubApp.getString2(2596) + message.what, e10);
                                    hVar.g(message);
                                }
                            } else {
                                hVar.g(message);
                            }
                        }
                    }
                }
            }
            Log.d(string2, StubApp.getString2(2597));
        }
        return Unit.INSTANCE;
    }
}
