package sb;

import android.util.Log;
import android.view.View;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o0.C1436k;
import o0.InterfaceC1410G;
import p0.AbstractC1482f;
import r0.C1555p;
import r0.InterfaceC1546g;
import r0.InterfaceC1547h;
import tb.InterfaceC1750c;
import v0.C1817l;

/* renamed from: sb.t0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C1674t0 implements BasicMessageChannel.Reply, BasicMessageChannel.MessageHandler, InterfaceC1750c, L4.e, InterfaceC1546g, InterfaceC1547h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20999a;

    public /* synthetic */ C1674t0(int i3) {
        this.f20999a = i3;
    }

    @Override // r0.InterfaceC1547h
    public void a(Object obj, C1436k c1436k) {
    }

    @Override // L4.e, y3.e, I3.f
    public Object apply(Object obj) {
        return new w0.c((C1555p) obj);
    }

    @Override // tb.InterfaceC1750c
    public boolean b(View view) {
        return view.hasFocus();
    }

    @Override // r0.InterfaceC1546g
    /* renamed from: invoke */
    public void mo0invoke(Object obj) {
        switch (this.f20999a) {
            case 9:
                ((InterfaceC1410G) obj).z(new C1817l(2, new H9.b(StubApp.getString2(23340)), 1003));
                break;
            case 10:
                ((InterfaceC1410G) obj).getClass();
                break;
            case 11:
                ((w0.h) obj).getClass();
                break;
            case 12:
                ((w0.h) obj).getClass();
                break;
            case 13:
                ((w0.h) obj).getClass();
                break;
            case 14:
                ((w0.h) obj).getClass();
                break;
            case 15:
                ((w0.h) obj).getClass();
                break;
            case 16:
                ((w0.h) obj).getClass();
                break;
            case 17:
                ((w0.h) obj).getClass();
                break;
            case 18:
                ((w0.h) obj).getClass();
                break;
            case 19:
                ((w0.h) obj).getClass();
                break;
            case 20:
                ((w0.h) obj).getClass();
                break;
            case 21:
                ((w0.h) obj).getClass();
                break;
            case 22:
                ((w0.h) obj).getClass();
                break;
            case 23:
                ((w0.h) obj).getClass();
                break;
            case 24:
                ((w0.h) obj).getClass();
                break;
            case 25:
                ((w0.h) obj).getClass();
                break;
            case 26:
                ((w0.h) obj).getClass();
                break;
            case 27:
                ((w0.h) obj).getClass();
                break;
            default:
                ((w0.h) obj).getClass();
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List listOf;
        Intrinsics.checkNotNullParameter(reply, "reply");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object obj2 = ((List) obj).get(0);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        try {
            listOf = CollectionsKt.listOf(Boolean.valueOf(Tc.d.m((String) obj2)));
        } catch (Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            if (exception instanceof C1635a) {
                C1635a c1635a = exception;
                listOf = CollectionsKt.listOf(c1635a.f20922a, c1635a.f20923b, c1635a.f20924c);
            } else {
                listOf = CollectionsKt.listOf((Object[]) new String[]{exception.getClass().getSimpleName(), exception.toString(), E1.a.m(StubApp.getString2(6769), exception.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception))});
            }
        }
        reply.reply(listOf);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        String string2 = StubApp.getString2(9425);
        String string22 = StubApp.getString2(9423);
        String string23 = StubApp.getString2(7094);
        switch (this.f20999a) {
            case 0:
                if (!(obj instanceof List)) {
                    Result.Companion companion = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23292), string22, string2, StubApp.getString2(23346), "");
                    Unit unit = Unit.INSTANCE;
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion3 = Result.INSTANCE;
                        Object obj2 = list.get(0);
                        Intrinsics.checkNotNull(obj2, string23);
                        Object obj3 = list.get(1);
                        Intrinsics.checkNotNull(obj3, string23);
                        AbstractC1482f.u(new C1635a((String) obj2, (String) obj3, (String) list.get(2)));
                        Unit unit2 = Unit.INSTANCE;
                        break;
                    }
                }
            case 1:
                if (!(obj instanceof List)) {
                    Result.Companion companion4 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23261), string22, string2, StubApp.getString2(23345), "");
                    int i3 = b1.f20943d;
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        Result.Companion companion5 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        int i10 = b1.f20943d;
                        break;
                    } else {
                        Result.Companion companion6 = Result.INSTANCE;
                        Object obj4 = list2.get(0);
                        Intrinsics.checkNotNull(obj4, string23);
                        Object obj5 = list2.get(1);
                        Intrinsics.checkNotNull(obj5, string23);
                        AbstractC1482f.u(new C1635a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i11 = b1.f20943d;
                        break;
                    }
                }
            case 2:
                if (!(obj instanceof List)) {
                    Result.Companion companion7 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23295), string22, string2, StubApp.getString2(23344), "");
                    Unit unit3 = Unit.INSTANCE;
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        Result.Companion companion8 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion9 = Result.INSTANCE;
                        Object obj6 = list3.get(0);
                        Intrinsics.checkNotNull(obj6, string23);
                        Object obj7 = list3.get(1);
                        Intrinsics.checkNotNull(obj7, string23);
                        AbstractC1482f.u(new C1635a((String) obj6, (String) obj7, (String) list3.get(2)));
                        Unit unit4 = Unit.INSTANCE;
                        break;
                    }
                }
            case 3:
                if (!(obj instanceof List)) {
                    Result.Companion companion10 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(2229), string22, string2, StubApp.getString2(23343), "");
                    int i12 = V0.f20912c;
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        Result.Companion companion11 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        int i13 = V0.f20912c;
                        break;
                    } else {
                        Result.Companion companion12 = Result.INSTANCE;
                        Object obj8 = list4.get(0);
                        Intrinsics.checkNotNull(obj8, string23);
                        Object obj9 = list4.get(1);
                        Intrinsics.checkNotNull(obj9, string23);
                        AbstractC1482f.u(new C1635a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i14 = V0.f20912c;
                        break;
                    }
                }
            case 4:
            default:
                if (!(obj instanceof List)) {
                    Result.Companion companion13 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23298), string22, string2, StubApp.getString2(23341), "");
                    Unit unit5 = Unit.INSTANCE;
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        Result.Companion companion14 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion15 = Result.INSTANCE;
                        Object obj10 = list5.get(0);
                        Intrinsics.checkNotNull(obj10, string23);
                        Object obj11 = list5.get(1);
                        Intrinsics.checkNotNull(obj11, string23);
                        AbstractC1482f.u(new C1635a((String) obj10, (String) obj11, (String) list5.get(2)));
                        Unit unit6 = Unit.INSTANCE;
                        break;
                    }
                }
            case 5:
                if (!(obj instanceof List)) {
                    Result.Companion companion16 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23291), string22, string2, StubApp.getString2(23342), "");
                    Unit unit7 = Unit.INSTANCE;
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        Result.Companion companion17 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion18 = Result.INSTANCE;
                        Object obj12 = list6.get(0);
                        Intrinsics.checkNotNull(obj12, string23);
                        Object obj13 = list6.get(1);
                        Intrinsics.checkNotNull(obj13, string23);
                        AbstractC1482f.u(new C1635a((String) obj12, (String) obj13, (String) list6.get(2)));
                        Unit unit8 = Unit.INSTANCE;
                        break;
                    }
                }
        }
    }

    public /* synthetic */ C1674t0(Object obj, int i3) {
        this.f20999a = i3;
    }
}
