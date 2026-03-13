package sb;

import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sb.J, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1620J {
    public static void a(BinaryMessenger binaryMessenger, final C1661n c1661n) {
        MessageCodec gVar;
        B3.s sVar;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        if (c1661n == null || (sVar = c1661n.f20874a) == null || (gVar = sVar.i()) == null) {
            gVar = new X2.g(2);
        }
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23173), gVar);
        if (c1661n != null) {
            final int i3 = 0;
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.I
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    switch (i3) {
                        case 0:
                            C1661n c1661n2 = c1661n;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1661n2.f20874a.f650b).a(((Long) obj2).longValue(), CookieManager.getInstance());
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
                            C1661n c1661n3 = c1661n;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c1661n3.getClass();
                                cookieManager.setCookie(str, str2);
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
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            X2.z zVar = new X2.z(reply, 23);
                            c1661n.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C1659m(0, zVar));
                            break;
                        default:
                            C1661n c1661n4 = c1661n;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c1661n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
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
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23174), gVar);
        if (c1661n != null) {
            final int i10 = 1;
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.I
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    switch (i10) {
                        case 0:
                            C1661n c1661n2 = c1661n;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1661n2.f20874a.f650b).a(((Long) obj2).longValue(), CookieManager.getInstance());
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
                            C1661n c1661n3 = c1661n;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c1661n3.getClass();
                                cookieManager.setCookie(str, str2);
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
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            X2.z zVar = new X2.z(reply, 23);
                            c1661n.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C1659m(0, zVar));
                            break;
                        default:
                            C1661n c1661n4 = c1661n;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c1661n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
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
                    }
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23175), gVar);
        if (c1661n != null) {
            final int i11 = 2;
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.I
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    switch (i11) {
                        case 0:
                            C1661n c1661n2 = c1661n;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1661n2.f20874a.f650b).a(((Long) obj2).longValue(), CookieManager.getInstance());
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
                            C1661n c1661n3 = c1661n;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c1661n3.getClass();
                                cookieManager.setCookie(str, str2);
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
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            X2.z zVar = new X2.z(reply, 23);
                            c1661n.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C1659m(0, zVar));
                            break;
                        default:
                            C1661n c1661n4 = c1661n;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c1661n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
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
                    }
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23176), gVar);
        if (c1661n == null) {
            basicMessageChannel4.setMessageHandler(null);
        } else {
            final int i12 = 3;
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.I
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    switch (i12) {
                        case 0:
                            C1661n c1661n2 = c1661n;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) c1661n2.f20874a.f650b).a(((Long) obj2).longValue(), CookieManager.getInstance());
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
                            C1661n c1661n3 = c1661n;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c1661n3.getClass();
                                cookieManager.setCookie(str, str2);
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
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            X2.z zVar = new X2.z(reply, 23);
                            c1661n.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C1659m(0, zVar));
                            break;
                        default:
                            C1661n c1661n4 = c1661n;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c1661n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
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
                    }
                }
            });
        }
    }
}
