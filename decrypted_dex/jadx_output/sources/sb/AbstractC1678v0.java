package sb;

import android.util.Log;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sb.v0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1678v0 {
    public static void a(BinaryMessenger binaryMessenger, final c1 c1Var) {
        MessageCodec gVar;
        B3.s sVar;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        if (c1Var == null || (sVar = c1Var.f21002a) == null || (gVar = sVar.i()) == null) {
            gVar = new X2.g(2);
        }
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23347), gVar);
        if (c1Var != null) {
            final int i3 = 0;
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i3) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23348), gVar);
        if (c1Var != null) {
            final int i10 = 2;
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i10) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23349), gVar);
        if (c1Var != null) {
            final int i11 = 6;
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i11) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23350), gVar);
        if (c1Var != null) {
            final int i12 = 7;
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i12) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23351), gVar);
        if (c1Var != null) {
            final int i13 = 8;
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i13) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23352), gVar);
        if (c1Var != null) {
            final int i14 = 9;
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i14) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel6.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23353), gVar);
        if (c1Var != null) {
            final int i15 = 10;
            basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i15) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel7.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23354), gVar);
        if (c1Var != null) {
            final int i16 = 12;
            basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i16) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel8.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23355), gVar);
        if (c1Var != null) {
            final int i17 = 13;
            basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i17) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel9.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23356), gVar);
        if (c1Var != null) {
            final int i18 = 14;
            basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i18) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel10.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23357), gVar);
        if (c1Var != null) {
            final int i19 = 11;
            basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i19) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel11.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23358), gVar);
        if (c1Var != null) {
            final int i20 = 15;
            basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i20) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel12.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23359), gVar);
        if (c1Var != null) {
            final int i21 = 16;
            basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i21) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel13.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23360), gVar);
        if (c1Var != null) {
            final int i22 = 17;
            basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i22) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel14.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23361), gVar);
        if (c1Var != null) {
            final int i23 = 18;
            basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i23) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel15.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23362), gVar);
        if (c1Var != null) {
            final int i24 = 19;
            basicMessageChannel16.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i24) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel16.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23363), gVar);
        if (c1Var != null) {
            final int i25 = 20;
            basicMessageChannel17.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i25) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel17.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23364), gVar);
        if (c1Var != null) {
            final int i26 = 21;
            basicMessageChannel18.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i26) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel18.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23365), gVar);
        if (c1Var != null) {
            final int i27 = 22;
            basicMessageChannel19.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i27) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel19.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23366), gVar);
        if (c1Var != null) {
            final int i28 = 1;
            basicMessageChannel20.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i28) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel20.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel21 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23367), gVar);
        if (c1Var != null) {
            final int i29 = 3;
            basicMessageChannel21.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i29) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel21.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel22 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23368), gVar);
        if (c1Var != null) {
            final int i30 = 4;
            basicMessageChannel22.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i30) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel22.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel23 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23369), gVar);
        if (c1Var == null) {
            basicMessageChannel23.setMessageHandler(null);
        } else {
            final int i31 = 5;
            basicMessageChannel23.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.u0
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
                    List listOf18;
                    List listOf19;
                    List listOf20;
                    List listOf21;
                    List listOf22;
                    switch (i31) {
                        case 0:
                            c1 c1Var2 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var2.f21002a.f650b).a(((Long) obj2).longValue(), c1Var2.a());
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
                            c1 c1Var3 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1Var3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            c1 c1Var4 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1Var4.f21002a.f650b).a(((Long) obj5).longValue(), webView2.getSettings());
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
                            c1 c1Var5 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            L0 l02 = (L0) list3.get(1);
                            try {
                                c1Var5.getClass();
                                webView3.setWebChromeClient(l02);
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
                            c1 c1Var6 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c1Var6.getClass();
                                webView4.setBackgroundColor((int) longValue);
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
                            c1 c1Var7 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1Var7.getClass();
                                webView5.destroy();
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
                            c1 c1Var8 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1Var8.getClass();
                                webView6.loadData(str, str2, str3);
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
                            c1 c1Var9 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1Var9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            c1 c1Var10 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1Var10.getClass();
                                webView8.loadUrl(str9, map);
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
                            c1 c1Var11 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1Var11.getClass();
                                webView9.postUrl(str10, bArr);
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
                            c1 c1Var12 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1Var12.getClass();
                                listOf11 = CollectionsKt.listOf(webView10.getUrl());
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
                            c1 c1Var13 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1Var13.getClass();
                                webView11.goForward();
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
                            c1 c1Var14 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1Var14.getClass();
                                listOf13 = CollectionsKt.listOf(Boolean.valueOf(webView12.canGoBack()));
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
                            c1 c1Var15 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1Var15.getClass();
                                listOf14 = CollectionsKt.listOf(Boolean.valueOf(webView13.canGoForward()));
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
                            c1 c1Var16 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1Var16.getClass();
                                webView14.goBack();
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
                            c1 c1Var17 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1Var17.getClass();
                                webView15.reload();
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
                        case 16:
                            c1 c1Var18 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1Var18.getClass();
                                webView16.clearCache(booleanValue);
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
                        case 17:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.String");
                            X2.z zVar = new X2.z(reply, 24);
                            c1Var.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1659m(1, zVar));
                            break;
                        case 18:
                            c1 c1Var19 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1Var19.getClass();
                                listOf18 = CollectionsKt.listOf(webView17.getTitle());
                            } catch (Throwable exception18) {
                                Intrinsics.checkNotNullParameter(exception18, "exception");
                                if (exception18 instanceof C1635a) {
                                    C1635a c1635a18 = exception18;
                                    listOf18 = CollectionsKt.listOf(c1635a18.f20922a, c1635a18.f20923b, c1635a18.f20924c);
                                } else {
                                    listOf18 = CollectionsKt.listOf((Object[]) new String[]{exception18.getClass().getSimpleName(), exception18.toString(), E1.a.m(StubApp.getString2(6769), exception18.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception18))});
                                }
                            }
                            reply.reply(listOf18);
                            break;
                        case 19:
                            c1 c1Var20 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1Var20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                listOf19 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception19) {
                                Intrinsics.checkNotNullParameter(exception19, "exception");
                                if (exception19 instanceof C1635a) {
                                    C1635a c1635a19 = exception19;
                                    listOf19 = CollectionsKt.listOf(c1635a19.f20922a, c1635a19.f20923b, c1635a19.f20924c);
                                } else {
                                    listOf19 = CollectionsKt.listOf((Object[]) new String[]{exception19.getClass().getSimpleName(), exception19.toString(), E1.a.m(StubApp.getString2(6769), exception19.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception19))});
                                }
                            }
                            reply.reply(listOf19);
                            break;
                        case 20:
                            c1 c1Var21 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1Var21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listOf20 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception20) {
                                Intrinsics.checkNotNullParameter(exception20, "exception");
                                if (exception20 instanceof C1635a) {
                                    C1635a c1635a20 = exception20;
                                    listOf20 = CollectionsKt.listOf(c1635a20.f20922a, c1635a20.f20923b, c1635a20.f20924c);
                                } else {
                                    listOf20 = CollectionsKt.listOf((Object[]) new String[]{exception20.getClass().getSimpleName(), exception20.toString(), E1.a.m(StubApp.getString2(6769), exception20.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception20))});
                                }
                            }
                            reply.reply(listOf20);
                            break;
                        case 21:
                            c1 c1Var22 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1681x c1681x = (C1681x) obj34;
                            try {
                                c1Var22.getClass();
                                webView19.addJavascriptInterface(c1681x, c1681x.f21003a);
                                listOf21 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception21) {
                                Intrinsics.checkNotNullParameter(exception21, "exception");
                                if (exception21 instanceof C1635a) {
                                    C1635a c1635a21 = exception21;
                                    listOf21 = CollectionsKt.listOf(c1635a21.f20922a, c1635a21.f20923b, c1635a21.f20924c);
                                } else {
                                    listOf21 = CollectionsKt.listOf((Object[]) new String[]{exception21.getClass().getSimpleName(), exception21.toString(), E1.a.m(StubApp.getString2(6769), exception21.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception21))});
                                }
                            }
                            reply.reply(listOf21);
                            break;
                        default:
                            c1 c1Var23 = c1Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            Intrinsics.checkNotNull(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            Intrinsics.checkNotNull(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1Var23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listOf22 = CollectionsKt.listOf((Object) null);
                            } catch (Throwable exception22) {
                                Intrinsics.checkNotNullParameter(exception22, "exception");
                                if (exception22 instanceof C1635a) {
                                    C1635a c1635a22 = exception22;
                                    listOf22 = CollectionsKt.listOf(c1635a22.f20922a, c1635a22.f20923b, c1635a22.f20924c);
                                } else {
                                    listOf22 = CollectionsKt.listOf((Object[]) new String[]{exception22.getClass().getSimpleName(), exception22.toString(), E1.a.m(StubApp.getString2(6769), exception22.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception22))});
                                }
                            }
                            reply.reply(listOf22);
                            break;
                    }
                }
            });
        }
    }
}
