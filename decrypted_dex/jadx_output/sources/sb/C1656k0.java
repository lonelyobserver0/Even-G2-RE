package sb;

import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* renamed from: sb.k0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C1656k0 implements BasicMessageChannel.Reply {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X2.u f20971b;

    public /* synthetic */ C1656k0(X2.u uVar, int i3) {
        this.f20970a = i3;
        this.f20971b = uVar;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public final void reply(Object obj) {
        String string2 = StubApp.getString2(23307);
        String string22 = StubApp.getString2(23308);
        String string23 = StubApp.getString2(9425);
        String string24 = StubApp.getString2(9423);
        String string25 = StubApp.getString2(7094);
        X2.u uVar = this.f20971b;
        switch (this.f20970a) {
            case 0:
                if (!(obj instanceof List)) {
                    Result.Companion companion = Result.INSTANCE;
                    uVar.invoke(AbstractC1482f.o(StubApp.getString2(23183), string24, string23, StubApp.getString2(23312), ""));
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        uVar.invoke(Result.m39boximpl(Result.m40constructorimpl((String) list.get(0))));
                        break;
                    } else {
                        Result.Companion companion2 = Result.INSTANCE;
                        Object obj2 = list.get(0);
                        Intrinsics.checkNotNull(obj2, string25);
                        Object obj3 = list.get(1);
                        Intrinsics.checkNotNull(obj3, string25);
                        uVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj2, (String) obj3, (String) list.get(2))))));
                        break;
                    }
                }
            case 1:
                if (!(obj instanceof List)) {
                    Result.Companion companion3 = Result.INSTANCE;
                    uVar.invoke(AbstractC1482f.o(StubApp.getString2(23181), string24, string23, StubApp.getString2(23311), ""));
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        Result.Companion companion4 = Result.INSTANCE;
                        uVar.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion5 = Result.INSTANCE;
                        Object obj4 = list2.get(0);
                        Intrinsics.checkNotNull(obj4, string25);
                        Object obj5 = list2.get(1);
                        Intrinsics.checkNotNull(obj5, string25);
                        uVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj4, (String) obj5, (String) list2.get(2))))));
                        break;
                    }
                }
            case 2:
                if (!(obj instanceof List)) {
                    Result.Companion companion6 = Result.INSTANCE;
                    uVar.invoke(AbstractC1482f.o(StubApp.getString2(23187), string24, string23, StubApp.getString2(23310), ""));
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        if (list3.get(0) != null) {
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            uVar.invoke(Result.m39boximpl(Result.m40constructorimpl((List) obj6)));
                            break;
                        } else {
                            Result.Companion companion7 = Result.INSTANCE;
                            uVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a(string22, string2, "")))));
                            break;
                        }
                    } else {
                        Result.Companion companion8 = Result.INSTANCE;
                        Object obj7 = list3.get(0);
                        Intrinsics.checkNotNull(obj7, string25);
                        Object obj8 = list3.get(1);
                        Intrinsics.checkNotNull(obj8, string25);
                        uVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj7, (String) obj8, (String) list3.get(2))))));
                        break;
                    }
                }
            default:
                if (!(obj instanceof List)) {
                    Result.Companion companion9 = Result.INSTANCE;
                    uVar.invoke(AbstractC1482f.o(StubApp.getString2(23182), string24, string23, StubApp.getString2(23309), ""));
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        if (list4.get(0) != null) {
                            Object obj9 = list4.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            Boolean bool = (Boolean) obj9;
                            bool.getClass();
                            uVar.invoke(Result.m39boximpl(Result.m40constructorimpl(bool)));
                            break;
                        } else {
                            Result.Companion companion10 = Result.INSTANCE;
                            uVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a(string22, string2, "")))));
                            break;
                        }
                    } else {
                        Result.Companion companion11 = Result.INSTANCE;
                        Object obj10 = list4.get(0);
                        Intrinsics.checkNotNull(obj10, string25);
                        Object obj11 = list4.get(1);
                        Intrinsics.checkNotNull(obj11, string25);
                        uVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj10, (String) obj11, (String) list4.get(2))))));
                        break;
                    }
                }
        }
    }
}
