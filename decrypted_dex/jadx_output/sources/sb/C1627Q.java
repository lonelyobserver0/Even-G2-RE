package sb;

import android.net.http.SslError;
import android.util.Log;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebStorage;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* renamed from: sb.Q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C1627Q implements BasicMessageChannel.Reply, BasicMessageChannel.MessageHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20889a;

    public /* synthetic */ C1627Q(Object obj, int i3) {
        this.f20889a = i3;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List listOf;
        List listOf2;
        List listOf3;
        List listOf4;
        List listOf5;
        List listOf6;
        List listOf7;
        switch (this.f20889a) {
            case 1:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback");
                GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj2;
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj3;
                Object obj4 = list.get(2);
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) obj4).booleanValue();
                Object obj5 = list.get(3);
                Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    callback.invoke(str, booleanValue, ((Boolean) obj5).booleanValue());
                    listOf = CollectionsKt.listOf((Object) null);
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
                break;
            case 5:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj6 = list2.get(0);
                Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                PermissionRequest permissionRequest = (PermissionRequest) obj6;
                Object obj7 = list2.get(1);
                Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                try {
                    permissionRequest.grant((String[]) ((List) obj7).toArray(new String[0]));
                    listOf2 = CollectionsKt.listOf((Object) null);
                } catch (Throwable exception2) {
                    Intrinsics.checkNotNullParameter(exception2, "exception");
                    if (exception2 instanceof C1635a) {
                        C1635a c1635a2 = exception2;
                        listOf2 = CollectionsKt.listOf(c1635a2.f20922a, c1635a2.f20923b, c1635a2.f20924c);
                    } else {
                        listOf2 = CollectionsKt.listOf((Object[]) new String[]{exception2.getClass().getSimpleName(), exception2.toString(), E1.a.m(StubApp.getString2(6769), exception2.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception2))});
                    }
                }
                reply.reply(listOf2);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj8 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                try {
                    ((PermissionRequest) obj8).deny();
                    listOf3 = CollectionsKt.listOf((Object) null);
                } catch (Throwable exception3) {
                    Intrinsics.checkNotNullParameter(exception3, "exception");
                    if (exception3 instanceof C1635a) {
                        C1635a c1635a3 = exception3;
                        listOf3 = CollectionsKt.listOf(c1635a3.f20922a, c1635a3.f20923b, c1635a3.f20924c);
                    } else {
                        listOf3 = CollectionsKt.listOf((Object[]) new String[]{exception3.getClass().getSimpleName(), exception3.toString(), E1.a.m(StubApp.getString2(6769), exception3.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception3))});
                    }
                }
                reply.reply(listOf3);
                break;
            case 11:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj9 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.net.http.SslError");
                try {
                    int primaryError = ((SslError) obj9).getPrimaryError();
                    listOf4 = CollectionsKt.listOf(primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? F0.j : F0.f20859f : F0.f20856c : F0.f20861h : F0.f20858e : F0.f20857d : F0.f20860g);
                } catch (Throwable exception4) {
                    Intrinsics.checkNotNullParameter(exception4, "exception");
                    if (exception4 instanceof C1635a) {
                        C1635a c1635a4 = exception4;
                        listOf4 = CollectionsKt.listOf(c1635a4.f20922a, c1635a4.f20923b, c1635a4.f20924c);
                    } else {
                        listOf4 = CollectionsKt.listOf((Object[]) new String[]{exception4.getClass().getSimpleName(), exception4.toString(), E1.a.m(StubApp.getString2(6769), exception4.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception4))});
                    }
                }
                reply.reply(listOf4);
                break;
            case 13:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj10 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj10).cancel();
                    listOf5 = CollectionsKt.listOf((Object) null);
                } catch (Throwable exception5) {
                    Intrinsics.checkNotNullParameter(exception5, "exception");
                    if (exception5 instanceof C1635a) {
                        C1635a c1635a5 = exception5;
                        listOf5 = CollectionsKt.listOf(c1635a5.f20922a, c1635a5.f20923b, c1635a5.f20924c);
                    } else {
                        listOf5 = CollectionsKt.listOf((Object[]) new String[]{exception5.getClass().getSimpleName(), exception5.toString(), E1.a.m(StubApp.getString2(6769), exception5.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception5))});
                    }
                }
                reply.reply(listOf5);
                break;
            case 14:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj11 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj11).proceed();
                    listOf6 = CollectionsKt.listOf((Object) null);
                } catch (Throwable exception6) {
                    Intrinsics.checkNotNullParameter(exception6, "exception");
                    if (exception6 instanceof C1635a) {
                        C1635a c1635a6 = exception6;
                        listOf6 = CollectionsKt.listOf(c1635a6.f20922a, c1635a6.f20923b, c1635a6.f20924c);
                    } else {
                        listOf6 = CollectionsKt.listOf((Object[]) new String[]{exception6.getClass().getSimpleName(), exception6.toString(), E1.a.m(StubApp.getString2(6769), exception6.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception6))});
                    }
                }
                reply.reply(listOf6);
                break;
            default:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj12 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebStorage");
                try {
                    ((WebStorage) obj12).deleteAllData();
                    listOf7 = CollectionsKt.listOf((Object) null);
                } catch (Throwable exception7) {
                    Intrinsics.checkNotNullParameter(exception7, "exception");
                    if (exception7 instanceof C1635a) {
                        C1635a c1635a7 = exception7;
                        listOf7 = CollectionsKt.listOf(c1635a7.f20922a, c1635a7.f20923b, c1635a7.f20924c);
                    } else {
                        listOf7 = CollectionsKt.listOf((Object[]) new String[]{exception7.getClass().getSimpleName(), exception7.toString(), E1.a.m(StubApp.getString2(6769), exception7.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception7))});
                    }
                }
                reply.reply(listOf7);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        String string2 = StubApp.getString2(9425);
        String string22 = StubApp.getString2(9423);
        String string23 = StubApp.getString2(7094);
        switch (this.f20889a) {
            case 0:
                if (!(obj instanceof List)) {
                    Result.Companion companion = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23230), string22, string2, StubApp.getString2(23231), "");
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
            case 5:
            case 6:
            case 11:
            case 13:
            case 14:
            default:
                if (!(obj instanceof List)) {
                    Result.Companion companion4 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23194), string22, string2, StubApp.getString2(23195), "");
                    Unit unit3 = Unit.INSTANCE;
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        Result.Companion companion5 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion6 = Result.INSTANCE;
                        Object obj4 = list2.get(0);
                        Intrinsics.checkNotNull(obj4, string23);
                        Object obj5 = list2.get(1);
                        Intrinsics.checkNotNull(obj5, string23);
                        AbstractC1482f.u(new C1635a((String) obj4, (String) obj5, (String) list2.get(2)));
                        Unit unit4 = Unit.INSTANCE;
                        break;
                    }
                }
            case 2:
                if (!(obj instanceof List)) {
                    Result.Companion companion7 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23228), string22, string2, StubApp.getString2(23229), "");
                    Unit unit5 = Unit.INSTANCE;
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
                        Unit unit6 = Unit.INSTANCE;
                        break;
                    }
                }
            case 3:
                if (!(obj instanceof List)) {
                    Result.Companion companion10 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(10088), string22, string2, StubApp.getString2(23227), "");
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        Result.Companion companion11 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion12 = Result.INSTANCE;
                        Object obj8 = list4.get(0);
                        Intrinsics.checkNotNull(obj8, string23);
                        Object obj9 = list4.get(1);
                        Intrinsics.checkNotNull(obj9, string23);
                        AbstractC1482f.u(new C1635a((String) obj8, (String) obj9, (String) list4.get(2)));
                        break;
                    }
                }
            case 4:
                if (!(obj instanceof List)) {
                    Result.Companion companion13 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23225), string22, string2, StubApp.getString2(23226), "");
                    Unit unit7 = Unit.INSTANCE;
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
                        Unit unit8 = Unit.INSTANCE;
                        break;
                    }
                }
            case 7:
                if (!(obj instanceof List)) {
                    Result.Companion companion16 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23223), string22, string2, StubApp.getString2(23224), "");
                    Unit unit9 = Unit.INSTANCE;
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
                        Unit unit10 = Unit.INSTANCE;
                        break;
                    }
                }
            case 8:
                if (!(obj instanceof List)) {
                    Result.Companion companion19 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23221), string22, string2, StubApp.getString2(23222), "");
                    Unit unit11 = Unit.INSTANCE;
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        Result.Companion companion20 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion21 = Result.INSTANCE;
                        Object obj14 = list7.get(0);
                        Intrinsics.checkNotNull(obj14, string23);
                        Object obj15 = list7.get(1);
                        Intrinsics.checkNotNull(obj15, string23);
                        AbstractC1482f.u(new C1635a((String) obj14, (String) obj15, (String) list7.get(2)));
                        Unit unit12 = Unit.INSTANCE;
                        break;
                    }
                }
            case 9:
                if (!(obj instanceof List)) {
                    Result.Companion companion22 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23219), string22, string2, StubApp.getString2(23220), "");
                    Unit unit13 = Unit.INSTANCE;
                    break;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        Result.Companion companion23 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion24 = Result.INSTANCE;
                        Object obj16 = list8.get(0);
                        Intrinsics.checkNotNull(obj16, string23);
                        Object obj17 = list8.get(1);
                        Intrinsics.checkNotNull(obj17, string23);
                        AbstractC1482f.u(new C1635a((String) obj16, (String) obj17, (String) list8.get(2)));
                        Unit unit14 = Unit.INSTANCE;
                        break;
                    }
                }
            case 10:
                if (!(obj instanceof List)) {
                    Result.Companion companion25 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23217), string22, string2, StubApp.getString2(23218), "");
                    Unit unit15 = Unit.INSTANCE;
                    break;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        Result.Companion companion26 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion27 = Result.INSTANCE;
                        Object obj18 = list9.get(0);
                        Intrinsics.checkNotNull(obj18, string23);
                        Object obj19 = list9.get(1);
                        Intrinsics.checkNotNull(obj19, string23);
                        AbstractC1482f.u(new C1635a((String) obj18, (String) obj19, (String) list9.get(2)));
                        Unit unit16 = Unit.INSTANCE;
                        break;
                    }
                }
            case 12:
                if (!(obj instanceof List)) {
                    Result.Companion companion28 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23215), string22, string2, StubApp.getString2(23216), "");
                    Unit unit17 = Unit.INSTANCE;
                    break;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        Result.Companion companion29 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion30 = Result.INSTANCE;
                        Object obj20 = list10.get(0);
                        Intrinsics.checkNotNull(obj20, string23);
                        Object obj21 = list10.get(1);
                        Intrinsics.checkNotNull(obj21, string23);
                        AbstractC1482f.u(new C1635a((String) obj20, (String) obj21, (String) list10.get(2)));
                        Unit unit18 = Unit.INSTANCE;
                        break;
                    }
                }
            case 15:
                if (!(obj instanceof List)) {
                    Result.Companion companion31 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23213), string22, string2, StubApp.getString2(23214), "");
                    Unit unit19 = Unit.INSTANCE;
                    break;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        Result.Companion companion32 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion33 = Result.INSTANCE;
                        Object obj22 = list11.get(0);
                        Intrinsics.checkNotNull(obj22, string23);
                        Object obj23 = list11.get(1);
                        Intrinsics.checkNotNull(obj23, string23);
                        AbstractC1482f.u(new C1635a((String) obj22, (String) obj23, (String) list11.get(2)));
                        Unit unit20 = Unit.INSTANCE;
                        break;
                    }
                }
            case 16:
                if (!(obj instanceof List)) {
                    Result.Companion companion34 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23180), string22, string2, StubApp.getString2(23212), "");
                    int i3 = L0.f20878h;
                    break;
                } else {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        Result.Companion companion35 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        int i10 = L0.f20878h;
                        break;
                    } else {
                        Result.Companion companion36 = Result.INSTANCE;
                        Object obj24 = list12.get(0);
                        Intrinsics.checkNotNull(obj24, string23);
                        Object obj25 = list12.get(1);
                        Intrinsics.checkNotNull(obj25, string23);
                        AbstractC1482f.u(new C1635a((String) obj24, (String) obj25, (String) list12.get(2)));
                        int i11 = L0.f20878h;
                        break;
                    }
                }
            case 17:
                if (!(obj instanceof List)) {
                    Result.Companion companion37 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23185), string22, string2, StubApp.getString2(23211), "");
                    int i12 = L0.f20878h;
                    break;
                } else {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        Result.Companion companion38 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        int i13 = L0.f20878h;
                        break;
                    } else {
                        Result.Companion companion39 = Result.INSTANCE;
                        Object obj26 = list13.get(0);
                        Intrinsics.checkNotNull(obj26, string23);
                        Object obj27 = list13.get(1);
                        Intrinsics.checkNotNull(obj27, string23);
                        AbstractC1482f.u(new C1635a((String) obj26, (String) obj27, (String) list13.get(2)));
                        int i14 = L0.f20878h;
                        break;
                    }
                }
            case 18:
                if (!(obj instanceof List)) {
                    Result.Companion companion40 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23184), string22, string2, StubApp.getString2(23210), "");
                    int i15 = L0.f20878h;
                    break;
                } else {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        Result.Companion companion41 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        int i16 = L0.f20878h;
                        break;
                    } else {
                        Result.Companion companion42 = Result.INSTANCE;
                        Object obj28 = list14.get(0);
                        Intrinsics.checkNotNull(obj28, string23);
                        Object obj29 = list14.get(1);
                        Intrinsics.checkNotNull(obj29, string23);
                        AbstractC1482f.u(new C1635a((String) obj28, (String) obj29, (String) list14.get(2)));
                        int i17 = L0.f20878h;
                        break;
                    }
                }
            case 19:
                if (!(obj instanceof List)) {
                    Result.Companion companion43 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23186), string22, string2, StubApp.getString2(23209), "");
                    int i18 = L0.f20878h;
                    break;
                } else {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        Result.Companion companion44 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        int i19 = L0.f20878h;
                        break;
                    } else {
                        Result.Companion companion45 = Result.INSTANCE;
                        Object obj30 = list15.get(0);
                        Intrinsics.checkNotNull(obj30, string23);
                        Object obj31 = list15.get(1);
                        Intrinsics.checkNotNull(obj31, string23);
                        AbstractC1482f.u(new C1635a((String) obj30, (String) obj31, (String) list15.get(2)));
                        int i20 = L0.f20878h;
                        break;
                    }
                }
            case 20:
                if (!(obj instanceof List)) {
                    Result.Companion companion46 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23177), string22, string2, StubApp.getString2(23208), "");
                    int i21 = L0.f20878h;
                    break;
                } else {
                    List list16 = (List) obj;
                    if (list16.size() <= 1) {
                        Result.Companion companion47 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        int i22 = L0.f20878h;
                        break;
                    } else {
                        Result.Companion companion48 = Result.INSTANCE;
                        Object obj32 = list16.get(0);
                        Intrinsics.checkNotNull(obj32, string23);
                        Object obj33 = list16.get(1);
                        Intrinsics.checkNotNull(obj33, string23);
                        AbstractC1482f.u(new C1635a((String) obj32, (String) obj33, (String) list16.get(2)));
                        int i23 = L0.f20878h;
                        break;
                    }
                }
            case 21:
                if (!(obj instanceof List)) {
                    Result.Companion companion49 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23179), string22, string2, StubApp.getString2(23207), "");
                    int i24 = L0.f20878h;
                    break;
                } else {
                    List list17 = (List) obj;
                    if (list17.size() <= 1) {
                        Result.Companion companion50 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        int i25 = L0.f20878h;
                        break;
                    } else {
                        Result.Companion companion51 = Result.INSTANCE;
                        Object obj34 = list17.get(0);
                        Intrinsics.checkNotNull(obj34, string23);
                        Object obj35 = list17.get(1);
                        Intrinsics.checkNotNull(obj35, string23);
                        AbstractC1482f.u(new C1635a((String) obj34, (String) obj35, (String) list17.get(2)));
                        int i26 = L0.f20878h;
                        break;
                    }
                }
            case 22:
                if (!(obj instanceof List)) {
                    Result.Companion companion52 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23178), string22, string2, StubApp.getString2(23206), "");
                    int i27 = L0.f20878h;
                    break;
                } else {
                    List list18 = (List) obj;
                    if (list18.size() <= 1) {
                        Result.Companion companion53 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        int i28 = L0.f20878h;
                        break;
                    } else {
                        Result.Companion companion54 = Result.INSTANCE;
                        Object obj36 = list18.get(0);
                        Intrinsics.checkNotNull(obj36, string23);
                        Object obj37 = list18.get(1);
                        Intrinsics.checkNotNull(obj37, string23);
                        AbstractC1482f.u(new C1635a((String) obj36, (String) obj37, (String) list18.get(2)));
                        int i29 = L0.f20878h;
                        break;
                    }
                }
            case 23:
                if (!(obj instanceof List)) {
                    Result.Companion companion55 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23204), string22, string2, StubApp.getString2(23205), "");
                    Unit unit21 = Unit.INSTANCE;
                    break;
                } else {
                    List list19 = (List) obj;
                    if (list19.size() <= 1) {
                        Result.Companion companion56 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion57 = Result.INSTANCE;
                        Object obj38 = list19.get(0);
                        Intrinsics.checkNotNull(obj38, string23);
                        Object obj39 = list19.get(1);
                        Intrinsics.checkNotNull(obj39, string23);
                        AbstractC1482f.u(new C1635a((String) obj38, (String) obj39, (String) list19.get(2)));
                        Unit unit22 = Unit.INSTANCE;
                        break;
                    }
                }
            case 24:
                if (!(obj instanceof List)) {
                    Result.Companion companion58 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23202), string22, string2, StubApp.getString2(23203), "");
                    Unit unit23 = Unit.INSTANCE;
                    break;
                } else {
                    List list20 = (List) obj;
                    if (list20.size() <= 1) {
                        Result.Companion companion59 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion60 = Result.INSTANCE;
                        Object obj40 = list20.get(0);
                        Intrinsics.checkNotNull(obj40, string23);
                        Object obj41 = list20.get(1);
                        Intrinsics.checkNotNull(obj41, string23);
                        AbstractC1482f.u(new C1635a((String) obj40, (String) obj41, (String) list20.get(2)));
                        Unit unit24 = Unit.INSTANCE;
                        break;
                    }
                }
            case 25:
                if (!(obj instanceof List)) {
                    Result.Companion companion61 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23200), string22, string2, StubApp.getString2(23201), "");
                    Unit unit25 = Unit.INSTANCE;
                    break;
                } else {
                    List list21 = (List) obj;
                    if (list21.size() <= 1) {
                        Result.Companion companion62 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion63 = Result.INSTANCE;
                        Object obj42 = list21.get(0);
                        Intrinsics.checkNotNull(obj42, string23);
                        Object obj43 = list21.get(1);
                        Intrinsics.checkNotNull(obj43, string23);
                        AbstractC1482f.u(new C1635a((String) obj42, (String) obj43, (String) list21.get(2)));
                        Unit unit26 = Unit.INSTANCE;
                        break;
                    }
                }
            case 26:
                if (!(obj instanceof List)) {
                    Result.Companion companion64 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23198), string22, string2, StubApp.getString2(23199), "");
                    Unit unit27 = Unit.INSTANCE;
                    break;
                } else {
                    List list22 = (List) obj;
                    if (list22.size() <= 1) {
                        Result.Companion companion65 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion66 = Result.INSTANCE;
                        Object obj44 = list22.get(0);
                        Intrinsics.checkNotNull(obj44, string23);
                        Object obj45 = list22.get(1);
                        Intrinsics.checkNotNull(obj45, string23);
                        AbstractC1482f.u(new C1635a((String) obj44, (String) obj45, (String) list22.get(2)));
                        Unit unit28 = Unit.INSTANCE;
                        break;
                    }
                }
            case 27:
                if (!(obj instanceof List)) {
                    Result.Companion companion67 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(23196), string22, string2, StubApp.getString2(23197), "");
                    Unit unit29 = Unit.INSTANCE;
                    break;
                } else {
                    List list23 = (List) obj;
                    if (list23.size() <= 1) {
                        Result.Companion companion68 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion69 = Result.INSTANCE;
                        Object obj46 = list23.get(0);
                        Intrinsics.checkNotNull(obj46, string23);
                        Object obj47 = list23.get(1);
                        Intrinsics.checkNotNull(obj47, string23);
                        AbstractC1482f.u(new C1635a((String) obj46, (String) obj47, (String) list23.get(2)));
                        Unit unit30 = Unit.INSTANCE;
                        break;
                    }
                }
        }
    }
}
