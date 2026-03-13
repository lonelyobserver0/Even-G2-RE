package X2;

import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class o implements BasicMessageChannel.Reply {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f8313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8314c;

    public /* synthetic */ o(q qVar, String str, int i3) {
        this.f8312a = i3;
        this.f8313b = qVar;
        this.f8314c = str;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public final void reply(Object obj) {
        String str = this.f8314c;
        String string2 = StubApp.getString2(7094);
        q qVar = this.f8313b;
        switch (this.f8312a) {
            case 0:
                if (!(obj instanceof List)) {
                    Result.Companion companion = Result.INSTANCE;
                    qVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(F1.a(str)))));
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        Result.Companion companion2 = Result.INSTANCE;
                        qVar.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion3 = Result.INSTANCE;
                        Object obj2 = list.get(0);
                        Intrinsics.checkNotNull(obj2, string2);
                        Object obj3 = list.get(1);
                        Intrinsics.checkNotNull(obj3, string2);
                        qVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new k((String) obj2, (String) obj3, (String) list.get(2))))));
                        break;
                    }
                }
            case 1:
                if (!(obj instanceof List)) {
                    Result.Companion companion4 = Result.INSTANCE;
                    qVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(F1.a(str)))));
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        Result.Companion companion5 = Result.INSTANCE;
                        qVar.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion6 = Result.INSTANCE;
                        Object obj4 = list2.get(0);
                        Intrinsics.checkNotNull(obj4, string2);
                        Object obj5 = list2.get(1);
                        Intrinsics.checkNotNull(obj5, string2);
                        qVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new k((String) obj4, (String) obj5, (String) list2.get(2))))));
                        break;
                    }
                }
            case 2:
                if (!(obj instanceof List)) {
                    Result.Companion companion7 = Result.INSTANCE;
                    qVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(F1.a(str)))));
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        Result.Companion companion8 = Result.INSTANCE;
                        qVar.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion9 = Result.INSTANCE;
                        Object obj6 = list3.get(0);
                        Intrinsics.checkNotNull(obj6, string2);
                        Object obj7 = list3.get(1);
                        Intrinsics.checkNotNull(obj7, string2);
                        qVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new k((String) obj6, (String) obj7, (String) list3.get(2))))));
                        break;
                    }
                }
            case 3:
                if (!(obj instanceof List)) {
                    Result.Companion companion10 = Result.INSTANCE;
                    qVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(F1.a(str)))));
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        Result.Companion companion11 = Result.INSTANCE;
                        qVar.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion12 = Result.INSTANCE;
                        Object obj8 = list4.get(0);
                        Intrinsics.checkNotNull(obj8, string2);
                        Object obj9 = list4.get(1);
                        Intrinsics.checkNotNull(obj9, string2);
                        qVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new k((String) obj8, (String) obj9, (String) list4.get(2))))));
                        break;
                    }
                }
            default:
                if (!(obj instanceof List)) {
                    Result.Companion companion13 = Result.INSTANCE;
                    qVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(F1.a(str)))));
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        Result.Companion companion14 = Result.INSTANCE;
                        qVar.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion15 = Result.INSTANCE;
                        Object obj10 = list5.get(0);
                        Intrinsics.checkNotNull(obj10, string2);
                        Object obj11 = list5.get(1);
                        Intrinsics.checkNotNull(obj11, string2);
                        qVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new k((String) obj10, (String) obj11, (String) list5.get(2))))));
                        break;
                    }
                }
        }
    }
}
