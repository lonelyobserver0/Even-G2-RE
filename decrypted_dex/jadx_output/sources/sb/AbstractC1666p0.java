package sb;

import android.util.Log;
import android.webkit.WebSettings;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sb.p0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1666p0 {
    public static void a(BinaryMessenger binaryMessenger, final O0 o02) {
        MessageCodec gVar;
        B3.s sVar;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        if (o02 == null || (sVar = o02.f20987a) == null || (gVar = sVar.i()) == null) {
            gVar = new X2.g(2);
        }
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23320), gVar);
        if (o02 != null) {
            final int i3 = 0;
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i3) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23321), gVar);
        if (o02 != null) {
            final int i10 = 15;
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i10) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23322), gVar);
        if (o02 != null) {
            final int i11 = 16;
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i11) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23323), gVar);
        if (o02 != null) {
            final int i12 = 1;
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i12) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23324), gVar);
        if (o02 != null) {
            final int i13 = 2;
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i13) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23325), gVar);
        if (o02 != null) {
            final int i14 = 3;
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i14) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel6.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23326), gVar);
        if (o02 != null) {
            final int i15 = 4;
            basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i15) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel7.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23327), gVar);
        if (o02 != null) {
            final int i16 = 5;
            basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i16) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel8.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23328), gVar);
        if (o02 != null) {
            final int i17 = 6;
            basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i17) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel9.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23329), gVar);
        if (o02 != null) {
            final int i18 = 7;
            basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i18) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel10.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23330), gVar);
        if (o02 != null) {
            final int i19 = 8;
            basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i19) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel11.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23331), gVar);
        if (o02 != null) {
            final int i20 = 9;
            basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i20) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel12.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23332), gVar);
        if (o02 != null) {
            final int i21 = 10;
            basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i21) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel13.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23333), gVar);
        if (o02 != null) {
            final int i22 = 11;
            basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i22) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel14.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23334), gVar);
        if (o02 != null) {
            final int i23 = 12;
            basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i23) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel15.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23335), gVar);
        if (o02 != null) {
            final int i24 = 13;
            basicMessageChannel16.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i24) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel16.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23336), gVar);
        if (o02 == null) {
            basicMessageChannel17.setMessageHandler(null);
        } else {
            final int i25 = 14;
            basicMessageChannel17.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
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
                    List listOf14;
                    List listOf15;
                    List listOf16;
                    List listOf17;
                    switch (i25) {
                        case 0:
                            O0 o03 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                o03.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                        case 1:
                            O0 o04 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                o04.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                        case 2:
                            O0 o05 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                o05.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            O0 o06 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                o06.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                listOf4 = CollectionsKt.listOf((Object) null);
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
                        case 4:
                            O0 o07 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                o07.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            O0 o08 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                o08.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            O0 o09 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                o09.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
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
                        case 7:
                            O0 o010 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                o010.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                listOf8 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof C1635a) {
                                    C1635a c1635a8 = exception8;
                                    listOf8 = CollectionsKt.listOf(c1635a8.f20922a, c1635a8.f20923b, c1635a8.f20924c);
                                } else {
                                    listOf8 = CollectionsKt.listOf((Object[]) new String[]{exception8.getClass().getSimpleName(), exception8.toString(), E1.a.m(StubApp.getString2(6769), exception8.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception8))});
                                }
                            }
                            reply.reply(listOf8);
                            break;
                        case 8:
                            O0 o011 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                o011.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                listOf9 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof C1635a) {
                                    C1635a c1635a9 = exception9;
                                    listOf9 = CollectionsKt.listOf(c1635a9.f20922a, c1635a9.f20923b, c1635a9.f20924c);
                                } else {
                                    listOf9 = CollectionsKt.listOf((Object[]) new String[]{exception9.getClass().getSimpleName(), exception9.toString(), E1.a.m(StubApp.getString2(6769), exception9.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception9))});
                                }
                            }
                            reply.reply(listOf9);
                            break;
                        case 9:
                            O0 o012 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                o012.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                listOf10 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof C1635a) {
                                    C1635a c1635a10 = exception10;
                                    listOf10 = CollectionsKt.listOf(c1635a10.f20922a, c1635a10.f20923b, c1635a10.f20924c);
                                } else {
                                    listOf10 = CollectionsKt.listOf((Object[]) new String[]{exception10.getClass().getSimpleName(), exception10.toString(), E1.a.m(StubApp.getString2(6769), exception10.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception10))});
                                }
                            }
                            reply.reply(listOf10);
                            break;
                        case 10:
                            O0 o013 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                o013.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                listOf11 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof C1635a) {
                                    C1635a c1635a11 = exception11;
                                    listOf11 = CollectionsKt.listOf(c1635a11.f20922a, c1635a11.f20923b, c1635a11.f20924c);
                                } else {
                                    listOf11 = CollectionsKt.listOf((Object[]) new String[]{exception11.getClass().getSimpleName(), exception11.toString(), E1.a.m(StubApp.getString2(6769), exception11.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception11))});
                                }
                            }
                            reply.reply(listOf11);
                            break;
                        case 11:
                            O0 o014 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                o014.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                listOf12 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof C1635a) {
                                    C1635a c1635a12 = exception12;
                                    listOf12 = CollectionsKt.listOf(c1635a12.f20922a, c1635a12.f20923b, c1635a12.f20924c);
                                } else {
                                    listOf12 = CollectionsKt.listOf((Object[]) new String[]{exception12.getClass().getSimpleName(), exception12.toString(), E1.a.m(StubApp.getString2(6769), exception12.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception12))});
                                }
                            }
                            reply.reply(listOf12);
                            break;
                        case 12:
                            O0 o015 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj26).longValue();
                            try {
                                o015.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                listOf13 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof C1635a) {
                                    C1635a c1635a13 = exception13;
                                    listOf13 = CollectionsKt.listOf(c1635a13.f20922a, c1635a13.f20923b, c1635a13.f20924c);
                                } else {
                                    listOf13 = CollectionsKt.listOf((Object[]) new String[]{exception13.getClass().getSimpleName(), exception13.toString(), E1.a.m(StubApp.getString2(6769), exception13.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception13))});
                                }
                            }
                            reply.reply(listOf13);
                            break;
                        case 13:
                            O0 o016 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                o016.getClass();
                                listOf14 = CollectionsKt.listOf(webSettings14.getUserAgentString());
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof C1635a) {
                                    C1635a c1635a14 = exception14;
                                    listOf14 = CollectionsKt.listOf(c1635a14.f20922a, c1635a14.f20923b, c1635a14.f20924c);
                                } else {
                                    listOf14 = CollectionsKt.listOf((Object[]) new String[]{exception14.getClass().getSimpleName(), exception14.toString(), E1.a.m(StubApp.getString2(6769), exception14.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception14))});
                                }
                            }
                            reply.reply(listOf14);
                            break;
                        case 14:
                            O0 o017 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1611A enumC1611A = (EnumC1611A) obj29;
                            try {
                                o017.getClass();
                                int ordinal = enumC1611A.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listOf15 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof C1635a) {
                                    C1635a c1635a15 = exception15;
                                    listOf15 = CollectionsKt.listOf(c1635a15.f20922a, c1635a15.f20923b, c1635a15.f20924c);
                                } else {
                                    listOf15 = CollectionsKt.listOf((Object[]) new String[]{exception15.getClass().getSimpleName(), exception15.toString(), E1.a.m(StubApp.getString2(6769), exception15.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception15))});
                                }
                            }
                            reply.reply(listOf15);
                            break;
                        case 15:
                            O0 o018 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                o018.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                listOf16 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof C1635a) {
                                    C1635a c1635a16 = exception16;
                                    listOf16 = CollectionsKt.listOf(c1635a16.f20922a, c1635a16.f20923b, c1635a16.f20924c);
                                } else {
                                    listOf16 = CollectionsKt.listOf((Object[]) new String[]{exception16.getClass().getSimpleName(), exception16.toString(), E1.a.m(StubApp.getString2(6769), exception16.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception16))});
                                }
                            }
                            reply.reply(listOf16);
                            break;
                        default:
                            O0 o019 = o02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                o019.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                listOf17 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof C1635a) {
                                    C1635a c1635a17 = exception17;
                                    listOf17 = CollectionsKt.listOf(c1635a17.f20922a, c1635a17.f20923b, c1635a17.f20924c);
                                } else {
                                    listOf17 = CollectionsKt.listOf((Object[]) new String[]{exception17.getClass().getSimpleName(), exception17.toString(), E1.a.m(StubApp.getString2(6769), exception17.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception17))});
                                }
                            }
                            reply.reply(listOf17);
                            break;
                    }
                }
            });
        }
    }
}
