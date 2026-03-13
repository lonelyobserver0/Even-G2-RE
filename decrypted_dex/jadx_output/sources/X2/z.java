package X2;

import android.util.Log;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sb.C1635a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasicMessageChannel.Reply f8372b;

    public /* synthetic */ z(BasicMessageChannel.Reply reply, int i3) {
        this.f8371a = i3;
        this.f8372b = reply;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List listOf;
        List listOf2;
        List listOf3;
        List listOf4;
        List listOf5;
        List listOf6;
        List listOf7;
        List listOf8;
        List listOf9;
        List listOf10;
        List listOf11;
        List listOf12;
        List listOf13;
        Result result = (Result) obj;
        switch (this.f8371a) {
            case 0:
                Throwable m43exceptionOrNullimpl = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply = this.f8372b;
                if (m43exceptionOrNullimpl != null) {
                    reply.reply(F1.b(m43exceptionOrNullimpl));
                } else {
                    Object value = result.getValue();
                    if (Result.m46isFailureimpl(value)) {
                        value = null;
                    }
                    reply.reply(CollectionsKt.listOf((byte[]) value));
                }
                break;
            case 1:
                Throwable m43exceptionOrNullimpl2 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply2 = this.f8372b;
                if (m43exceptionOrNullimpl2 != null) {
                    reply2.reply(F1.b(m43exceptionOrNullimpl2));
                } else {
                    Object value2 = result.getValue();
                    if (Result.m46isFailureimpl(value2)) {
                        value2 = null;
                    }
                    reply2.reply(CollectionsKt.listOf((Boolean) value2));
                }
                break;
            case 2:
                Throwable m43exceptionOrNullimpl3 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply3 = this.f8372b;
                if (m43exceptionOrNullimpl3 != null) {
                    reply3.reply(F1.b(m43exceptionOrNullimpl3));
                } else {
                    Object value3 = result.getValue();
                    if (Result.m46isFailureimpl(value3)) {
                        value3 = null;
                    }
                    reply3.reply(CollectionsKt.listOf((Boolean) value3));
                }
                break;
            case 3:
                Throwable m43exceptionOrNullimpl4 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply4 = this.f8372b;
                if (m43exceptionOrNullimpl4 != null) {
                    reply4.reply(F1.b(m43exceptionOrNullimpl4));
                } else {
                    Object value4 = result.getValue();
                    if (Result.m46isFailureimpl(value4)) {
                        value4 = null;
                    }
                    reply4.reply(CollectionsKt.listOf((byte[]) value4));
                }
                break;
            case 4:
                Throwable m43exceptionOrNullimpl5 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply5 = this.f8372b;
                if (m43exceptionOrNullimpl5 != null) {
                    reply5.reply(F1.b(m43exceptionOrNullimpl5));
                } else {
                    Object value5 = result.getValue();
                    if (Result.m46isFailureimpl(value5)) {
                        value5 = null;
                    }
                    reply5.reply(CollectionsKt.listOf((f) value5));
                }
                break;
            case 5:
                Throwable m43exceptionOrNullimpl6 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply6 = this.f8372b;
                if (m43exceptionOrNullimpl6 != null) {
                    reply6.reply(F1.b(m43exceptionOrNullimpl6));
                } else {
                    Object value6 = result.getValue();
                    if (Result.m46isFailureimpl(value6)) {
                        value6 = null;
                    }
                    reply6.reply(CollectionsKt.listOf((Double) value6));
                }
                break;
            case 6:
                Throwable m43exceptionOrNullimpl7 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply7 = this.f8372b;
                if (m43exceptionOrNullimpl7 != null) {
                    reply7.reply(F1.b(m43exceptionOrNullimpl7));
                } else {
                    Object value7 = result.getValue();
                    if (Result.m46isFailureimpl(value7)) {
                        value7 = null;
                    }
                    reply7.reply(CollectionsKt.listOf((Boolean) value7));
                }
                break;
            case 7:
                Throwable m43exceptionOrNullimpl8 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply8 = this.f8372b;
                if (m43exceptionOrNullimpl8 != null) {
                    reply8.reply(F1.b(m43exceptionOrNullimpl8));
                } else {
                    reply8.reply(CollectionsKt.listOf((Object) null));
                }
                break;
            case 8:
                Throwable m43exceptionOrNullimpl9 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply9 = this.f8372b;
                if (m43exceptionOrNullimpl9 != null) {
                    reply9.reply(F1.b(m43exceptionOrNullimpl9));
                } else {
                    Object value8 = result.getValue();
                    if (Result.m46isFailureimpl(value8)) {
                        value8 = null;
                    }
                    reply9.reply(CollectionsKt.listOf((Boolean) value8));
                }
                break;
            case 9:
                Throwable m43exceptionOrNullimpl10 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply10 = this.f8372b;
                if (m43exceptionOrNullimpl10 != null) {
                    reply10.reply(F1.b(m43exceptionOrNullimpl10));
                } else {
                    Object value9 = result.getValue();
                    if (Result.m46isFailureimpl(value9)) {
                        value9 = null;
                    }
                    reply10.reply(CollectionsKt.listOf((Long) value9));
                }
                break;
            case 10:
                Throwable m43exceptionOrNullimpl11 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply11 = this.f8372b;
                if (m43exceptionOrNullimpl11 != null) {
                    reply11.reply(F1.b(m43exceptionOrNullimpl11));
                } else {
                    Object value10 = result.getValue();
                    if (Result.m46isFailureimpl(value10)) {
                        value10 = null;
                    }
                    reply11.reply(CollectionsKt.listOf((Boolean) value10));
                }
                break;
            case 11:
                Throwable m43exceptionOrNullimpl12 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply12 = this.f8372b;
                if (m43exceptionOrNullimpl12 != null) {
                    reply12.reply(F1.b(m43exceptionOrNullimpl12));
                } else {
                    Object value11 = result.getValue();
                    if (Result.m46isFailureimpl(value11)) {
                        value11 = null;
                    }
                    reply12.reply(CollectionsKt.listOf((Boolean) value11));
                }
                break;
            case 12:
                Throwable exception = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply13 = this.f8372b;
                if (exception != null) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    if (exception instanceof hb.e) {
                        hb.e eVar = (hb.e) exception;
                        listOf = CollectionsKt.listOf(eVar.f14484a, eVar.f14485b, null);
                    } else {
                        listOf = CollectionsKt.listOf((Object[]) new String[]{exception.getClass().getSimpleName(), exception.toString(), E1.a.m(StubApp.getString2(6769), exception.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception))});
                    }
                    reply13.reply(listOf);
                } else {
                    Object value12 = result.getValue();
                    reply13.reply(CollectionsKt.listOf((Long) (Result.m46isFailureimpl(value12) ? null : value12)));
                }
                break;
            case 13:
                Throwable exception2 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply14 = this.f8372b;
                if (exception2 != null) {
                    Intrinsics.checkNotNullParameter(exception2, "exception");
                    if (exception2 instanceof hb.e) {
                        hb.e eVar2 = (hb.e) exception2;
                        listOf2 = CollectionsKt.listOf(eVar2.f14484a, eVar2.f14485b, null);
                    } else {
                        listOf2 = CollectionsKt.listOf((Object[]) new String[]{exception2.getClass().getSimpleName(), exception2.toString(), E1.a.m(StubApp.getString2(6769), exception2.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception2))});
                    }
                    reply14.reply(listOf2);
                } else {
                    reply14.reply(CollectionsKt.listOf((Object) null));
                }
                break;
            case 14:
                Throwable exception3 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply15 = this.f8372b;
                if (exception3 != null) {
                    Intrinsics.checkNotNullParameter(exception3, "exception");
                    if (exception3 instanceof hb.e) {
                        hb.e eVar3 = (hb.e) exception3;
                        listOf3 = CollectionsKt.listOf(eVar3.f14484a, eVar3.f14485b, null);
                    } else {
                        listOf3 = CollectionsKt.listOf((Object[]) new String[]{exception3.getClass().getSimpleName(), exception3.toString(), E1.a.m(StubApp.getString2(6769), exception3.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception3))});
                    }
                    reply15.reply(listOf3);
                } else {
                    reply15.reply(CollectionsKt.listOf((Object) null));
                }
                break;
            case 15:
                Throwable exception4 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply16 = this.f8372b;
                if (exception4 != null) {
                    Intrinsics.checkNotNullParameter(exception4, "exception");
                    if (exception4 instanceof hb.e) {
                        hb.e eVar4 = (hb.e) exception4;
                        listOf4 = CollectionsKt.listOf(eVar4.f14484a, eVar4.f14485b, null);
                    } else {
                        listOf4 = CollectionsKt.listOf((Object[]) new String[]{exception4.getClass().getSimpleName(), exception4.toString(), E1.a.m(StubApp.getString2(6769), exception4.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception4))});
                    }
                    reply16.reply(listOf4);
                } else {
                    reply16.reply(CollectionsKt.listOf((Object) null));
                }
                break;
            case 16:
                Throwable exception5 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply17 = this.f8372b;
                if (exception5 != null) {
                    Intrinsics.checkNotNullParameter(exception5, "exception");
                    if (exception5 instanceof hb.e) {
                        hb.e eVar5 = (hb.e) exception5;
                        listOf5 = CollectionsKt.listOf(eVar5.f14484a, eVar5.f14485b, null);
                    } else {
                        listOf5 = CollectionsKt.listOf((Object[]) new String[]{exception5.getClass().getSimpleName(), exception5.toString(), E1.a.m(StubApp.getString2(6769), exception5.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception5))});
                    }
                    reply17.reply(listOf5);
                } else {
                    reply17.reply(CollectionsKt.listOf((Object) null));
                }
                break;
            case 17:
                Throwable exception6 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply18 = this.f8372b;
                if (exception6 != null) {
                    Intrinsics.checkNotNullParameter(exception6, "exception");
                    if (exception6 instanceof hb.e) {
                        hb.e eVar6 = (hb.e) exception6;
                        listOf6 = CollectionsKt.listOf(eVar6.f14484a, eVar6.f14485b, null);
                    } else {
                        listOf6 = CollectionsKt.listOf((Object[]) new String[]{exception6.getClass().getSimpleName(), exception6.toString(), E1.a.m(StubApp.getString2(6769), exception6.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception6))});
                    }
                    reply18.reply(listOf6);
                } else {
                    reply18.reply(CollectionsKt.listOf((Object) null));
                }
                break;
            case 18:
                Throwable exception7 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply19 = this.f8372b;
                if (exception7 != null) {
                    Intrinsics.checkNotNullParameter(exception7, "exception");
                    if (exception7 instanceof hb.e) {
                        hb.e eVar7 = (hb.e) exception7;
                        listOf7 = CollectionsKt.listOf(eVar7.f14484a, eVar7.f14485b, null);
                    } else {
                        listOf7 = CollectionsKt.listOf((Object[]) new String[]{exception7.getClass().getSimpleName(), exception7.toString(), E1.a.m(StubApp.getString2(6769), exception7.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception7))});
                    }
                    reply19.reply(listOf7);
                } else {
                    reply19.reply(CollectionsKt.listOf((Object) null));
                }
                break;
            case 19:
                Throwable exception8 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply20 = this.f8372b;
                if (exception8 != null) {
                    Intrinsics.checkNotNullParameter(exception8, "exception");
                    if (exception8 instanceof hb.e) {
                        hb.e eVar8 = (hb.e) exception8;
                        listOf8 = CollectionsKt.listOf(eVar8.f14484a, eVar8.f14485b, null);
                    } else {
                        listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                    }
                    reply20.reply(listOf8);
                } else {
                    reply20.reply(CollectionsKt.listOf((Object) null));
                }
                break;
            case 20:
                Throwable exception9 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply21 = this.f8372b;
                if (exception9 != null) {
                    Intrinsics.checkNotNullParameter(exception9, "exception");
                    if (exception9 instanceof hb.e) {
                        hb.e eVar9 = (hb.e) exception9;
                        listOf9 = CollectionsKt.listOf(eVar9.f14484a, eVar9.f14485b, null);
                    } else {
                        listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                    }
                    reply21.reply(listOf9);
                } else {
                    reply21.reply(CollectionsKt.listOf((Object) null));
                }
                break;
            case 21:
                Throwable exception10 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply22 = this.f8372b;
                if (exception10 != null) {
                    Intrinsics.checkNotNullParameter(exception10, "exception");
                    if (exception10 instanceof hb.e) {
                        hb.e eVar10 = (hb.e) exception10;
                        listOf10 = CollectionsKt.listOf(eVar10.f14484a, eVar10.f14485b, null);
                    } else {
                        listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                    }
                    reply22.reply(listOf10);
                } else {
                    Object value13 = result.getValue();
                    reply22.reply(CollectionsKt.listOf((String) (Result.m46isFailureimpl(value13) ? null : value13)));
                }
                break;
            case 22:
                Throwable exception11 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply23 = this.f8372b;
                if (exception11 != null) {
                    Intrinsics.checkNotNullParameter(exception11, "exception");
                    if (exception11 instanceof hb.e) {
                        hb.e eVar11 = (hb.e) exception11;
                        listOf11 = CollectionsKt.listOf(eVar11.f14484a, eVar11.f14485b, null);
                    } else {
                        listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                    }
                    reply23.reply(listOf11);
                } else {
                    reply23.reply(CollectionsKt.listOf((Object) null));
                }
                break;
            case 23:
                Throwable exception12 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply24 = this.f8372b;
                if (exception12 != null) {
                    Intrinsics.checkNotNullParameter(exception12, "exception");
                    if (exception12 instanceof C1635a) {
                        C1635a c1635a = (C1635a) exception12;
                        listOf12 = CollectionsKt.listOf(c1635a.f20922a, c1635a.f20923b, c1635a.f20924c);
                    } else {
                        listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                    }
                    reply24.reply(listOf12);
                } else {
                    Object value14 = result.getValue();
                    if (Result.m46isFailureimpl(value14)) {
                        value14 = null;
                    }
                    reply24.reply(CollectionsKt.listOf((Boolean) value14));
                }
                break;
            default:
                Throwable exception13 = Result.m43exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply25 = this.f8372b;
                if (exception13 != null) {
                    Intrinsics.checkNotNullParameter(exception13, "exception");
                    if (exception13 instanceof C1635a) {
                        C1635a c1635a2 = (C1635a) exception13;
                        listOf13 = CollectionsKt.listOf(c1635a2.f20922a, c1635a2.f20923b, c1635a2.f20924c);
                    } else {
                        listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                    }
                    reply25.reply(listOf13);
                } else {
                    Object value15 = result.getValue();
                    if (Result.m46isFailureimpl(value15)) {
                        value15 = null;
                    }
                    reply25.reply(CollectionsKt.listOf((String) value15));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
