package com.mapbox.common.location;

import com.mapbox.common.module.cronet.LazyEngine;
import com.mapbox.common.movement.GoogleActivityRecognition;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;
import q4.f;
import sb.C1635a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements f, BasicMessageChannel.Reply {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f12395b;

    public /* synthetic */ a(int i3, Function1 function1) {
        this.f12394a = i3;
        this.f12395b = function1;
    }

    @Override // q4.f
    public void i(Object obj) {
        switch (this.f12394a) {
            case 0:
                GoogleDeviceLocationProvider.removeLocationUpdates$lambda$9(this.f12395b, obj);
                break;
            case 1:
                GoogleDeviceLocationProvider.doStop$lambda$2(this.f12395b, obj);
                break;
            case 2:
                GoogleDeviceLocationProvider.doStart$lambda$0(this.f12395b, obj);
                break;
            case 3:
                GoogleDeviceLocationProvider.requestLocationUpdates$lambda$7(this.f12395b, obj);
                break;
            case 4:
                LazyEngine.tryInstallFromGooglePlay$lambda$1(this.f12395b, obj);
                break;
            default:
                GoogleActivityRecognition.Companion.withLogs$lambda$6(this.f12395b, obj);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        String string2 = StubApp.getString2(9425);
        String string22 = StubApp.getString2(9423);
        String string23 = StubApp.getString2(7094);
        Function1 function1 = this.f12395b;
        switch (this.f12394a) {
            case 6:
                if (!(obj instanceof List)) {
                    Result.Companion companion = Result.INSTANCE;
                    function1.invoke(AbstractC1482f.o(StubApp.getString2(13737), string22, string2, StubApp.getString2(13738), ""));
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        Result.Companion companion2 = Result.INSTANCE;
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion3 = Result.INSTANCE;
                        Object obj2 = list.get(0);
                        Intrinsics.checkNotNull(obj2, string23);
                        Object obj3 = list.get(1);
                        Intrinsics.checkNotNull(obj3, string23);
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj2, (String) obj3, (String) list.get(2))))));
                        break;
                    }
                }
            case 7:
                if (!(obj instanceof List)) {
                    Result.Companion companion4 = Result.INSTANCE;
                    function1.invoke(AbstractC1482f.o(StubApp.getString2(9415), string22, string2, StubApp.getString2(13736), ""));
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        Result.Companion companion5 = Result.INSTANCE;
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion6 = Result.INSTANCE;
                        Object obj4 = list2.get(0);
                        Intrinsics.checkNotNull(obj4, string23);
                        Object obj5 = list2.get(1);
                        Intrinsics.checkNotNull(obj5, string23);
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj4, (String) obj5, (String) list2.get(2))))));
                        break;
                    }
                }
            case 8:
                if (!(obj instanceof List)) {
                    Result.Companion companion7 = Result.INSTANCE;
                    function1.invoke(AbstractC1482f.o(StubApp.getString2(2228), string22, string2, StubApp.getString2(13735), ""));
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        Result.Companion companion8 = Result.INSTANCE;
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion9 = Result.INSTANCE;
                        Object obj6 = list3.get(0);
                        Intrinsics.checkNotNull(obj6, string23);
                        Object obj7 = list3.get(1);
                        Intrinsics.checkNotNull(obj7, string23);
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj6, (String) obj7, (String) list3.get(2))))));
                        break;
                    }
                }
            case 9:
                if (!(obj instanceof List)) {
                    Result.Companion companion10 = Result.INSTANCE;
                    function1.invoke(AbstractC1482f.o(StubApp.getString2(13733), string22, string2, StubApp.getString2(13734), ""));
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        Result.Companion companion11 = Result.INSTANCE;
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion12 = Result.INSTANCE;
                        Object obj8 = list4.get(0);
                        Intrinsics.checkNotNull(obj8, string23);
                        Object obj9 = list4.get(1);
                        Intrinsics.checkNotNull(obj9, string23);
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj8, (String) obj9, (String) list4.get(2))))));
                        break;
                    }
                }
            case 10:
                if (!(obj instanceof List)) {
                    Result.Companion companion13 = Result.INSTANCE;
                    function1.invoke(AbstractC1482f.o(StubApp.getString2(13731), string22, string2, StubApp.getString2(13732), ""));
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        Result.Companion companion14 = Result.INSTANCE;
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion15 = Result.INSTANCE;
                        Object obj10 = list5.get(0);
                        Intrinsics.checkNotNull(obj10, string23);
                        Object obj11 = list5.get(1);
                        Intrinsics.checkNotNull(obj11, string23);
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj10, (String) obj11, (String) list5.get(2))))));
                        break;
                    }
                }
            case 11:
                if (!(obj instanceof List)) {
                    Result.Companion companion16 = Result.INSTANCE;
                    function1.invoke(AbstractC1482f.o(StubApp.getString2(13729), string22, string2, StubApp.getString2(13730), ""));
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        Result.Companion companion17 = Result.INSTANCE;
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion18 = Result.INSTANCE;
                        Object obj12 = list6.get(0);
                        Intrinsics.checkNotNull(obj12, string23);
                        Object obj13 = list6.get(1);
                        Intrinsics.checkNotNull(obj13, string23);
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj12, (String) obj13, (String) list6.get(2))))));
                        break;
                    }
                }
            case 12:
                if (!(obj instanceof List)) {
                    Result.Companion companion19 = Result.INSTANCE;
                    function1.invoke(AbstractC1482f.o(StubApp.getString2(426), string22, string2, StubApp.getString2(13728), ""));
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        Result.Companion companion20 = Result.INSTANCE;
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion21 = Result.INSTANCE;
                        Object obj14 = list7.get(0);
                        Intrinsics.checkNotNull(obj14, string23);
                        Object obj15 = list7.get(1);
                        Intrinsics.checkNotNull(obj15, string23);
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj14, (String) obj15, (String) list7.get(2))))));
                        break;
                    }
                }
            case 13:
                if (!(obj instanceof List)) {
                    Result.Companion companion22 = Result.INSTANCE;
                    function1.invoke(AbstractC1482f.o(StubApp.getString2(425), string22, string2, StubApp.getString2(13727), ""));
                    break;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        Result.Companion companion23 = Result.INSTANCE;
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion24 = Result.INSTANCE;
                        Object obj16 = list8.get(0);
                        Intrinsics.checkNotNull(obj16, string23);
                        Object obj17 = list8.get(1);
                        Intrinsics.checkNotNull(obj17, string23);
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj16, (String) obj17, (String) list8.get(2))))));
                        break;
                    }
                }
            case 14:
                if (!(obj instanceof List)) {
                    Result.Companion companion25 = Result.INSTANCE;
                    function1.invoke(AbstractC1482f.o(StubApp.getString2(13725), string22, string2, StubApp.getString2(13726), ""));
                    break;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        Result.Companion companion26 = Result.INSTANCE;
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion27 = Result.INSTANCE;
                        Object obj18 = list9.get(0);
                        Intrinsics.checkNotNull(obj18, string23);
                        Object obj19 = list9.get(1);
                        Intrinsics.checkNotNull(obj19, string23);
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj18, (String) obj19, (String) list9.get(2))))));
                        break;
                    }
                }
            case 15:
                if (!(obj instanceof List)) {
                    Result.Companion companion28 = Result.INSTANCE;
                    function1.invoke(AbstractC1482f.o(StubApp.getString2(13723), string22, string2, StubApp.getString2(13724), ""));
                    break;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        Result.Companion companion29 = Result.INSTANCE;
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion30 = Result.INSTANCE;
                        Object obj20 = list10.get(0);
                        Intrinsics.checkNotNull(obj20, string23);
                        Object obj21 = list10.get(1);
                        Intrinsics.checkNotNull(obj21, string23);
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj20, (String) obj21, (String) list10.get(2))))));
                        break;
                    }
                }
            case 16:
                if (!(obj instanceof List)) {
                    Result.Companion companion31 = Result.INSTANCE;
                    function1.invoke(AbstractC1482f.o(StubApp.getString2(13721), string22, string2, StubApp.getString2(13722), ""));
                    break;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        Result.Companion companion32 = Result.INSTANCE;
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion33 = Result.INSTANCE;
                        Object obj22 = list11.get(0);
                        Intrinsics.checkNotNull(obj22, string23);
                        Object obj23 = list11.get(1);
                        Intrinsics.checkNotNull(obj23, string23);
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj22, (String) obj23, (String) list11.get(2))))));
                        break;
                    }
                }
            case 17:
                if (!(obj instanceof List)) {
                    Result.Companion companion34 = Result.INSTANCE;
                    function1.invoke(AbstractC1482f.o(StubApp.getString2(13719), string22, string2, StubApp.getString2(13720), ""));
                    break;
                } else {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        Result.Companion companion35 = Result.INSTANCE;
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion36 = Result.INSTANCE;
                        Object obj24 = list12.get(0);
                        Intrinsics.checkNotNull(obj24, string23);
                        Object obj25 = list12.get(1);
                        Intrinsics.checkNotNull(obj25, string23);
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj24, (String) obj25, (String) list12.get(2))))));
                        break;
                    }
                }
            case 18:
                if (!(obj instanceof List)) {
                    Result.Companion companion37 = Result.INSTANCE;
                    function1.invoke(AbstractC1482f.o(StubApp.getString2(2231), string22, string2, StubApp.getString2(13718), ""));
                    break;
                } else {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        Result.Companion companion38 = Result.INSTANCE;
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion39 = Result.INSTANCE;
                        Object obj26 = list13.get(0);
                        Intrinsics.checkNotNull(obj26, string23);
                        Object obj27 = list13.get(1);
                        Intrinsics.checkNotNull(obj27, string23);
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj26, (String) obj27, (String) list13.get(2))))));
                        break;
                    }
                }
            case 19:
                if (!(obj instanceof List)) {
                    Result.Companion companion40 = Result.INSTANCE;
                    function1.invoke(AbstractC1482f.o(StubApp.getString2(2230), string22, string2, StubApp.getString2(13717), ""));
                    break;
                } else {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        Result.Companion companion41 = Result.INSTANCE;
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion42 = Result.INSTANCE;
                        Object obj28 = list14.get(0);
                        Intrinsics.checkNotNull(obj28, string23);
                        Object obj29 = list14.get(1);
                        Intrinsics.checkNotNull(obj29, string23);
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj28, (String) obj29, (String) list14.get(2))))));
                        break;
                    }
                }
            default:
                if (!(obj instanceof List)) {
                    Result.Companion companion43 = Result.INSTANCE;
                    function1.invoke(AbstractC1482f.o(StubApp.getString2(13715), string22, string2, StubApp.getString2(13716), ""));
                    break;
                } else {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        Result.Companion companion44 = Result.INSTANCE;
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion45 = Result.INSTANCE;
                        Object obj30 = list15.get(0);
                        Intrinsics.checkNotNull(obj30, string23);
                        Object obj31 = list15.get(1);
                        Intrinsics.checkNotNull(obj31, string23);
                        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj30, (String) obj31, (String) list15.get(2))))));
                        break;
                    }
                }
        }
    }
}
