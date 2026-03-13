package sb;

import android.util.Log;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sb.m0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1660m0 {
    public static void a(BinaryMessenger binaryMessenger, final M0 m02) {
        MessageCodec gVar;
        B3.s sVar;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        if (m02 == null || (sVar = m02.f20977a) == null || (gVar = sVar.i()) == null) {
            gVar = new X2.g(2);
        }
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23314), gVar);
        if (m02 != null) {
            final int i3 = 0;
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.l0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    List listOf4;
                    List listOf5;
                    List listOf6;
                    switch (i3) {
                        case 0:
                            M0 m03 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) m03.f20977a.f650b).a(((Long) obj2).longValue(), new L0(m03));
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
                            M0 m04 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l02 = (L0) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                m04.getClass();
                                l02.f20880c = booleanValue;
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
                            M0 m05 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l03 = (L0) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                m05.getClass();
                                l03.f20881d = booleanValue2;
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
                            M0 m06 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l04 = (L0) obj7;
                            Object obj8 = list3.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                m06.getClass();
                                l04.f20882e = booleanValue3;
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
                            M0 m07 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l05 = (L0) obj9;
                            Object obj10 = list4.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                m07.getClass();
                                l05.f20883f = booleanValue4;
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
                        default:
                            M0 m08 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l06 = (L0) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                m08.getClass();
                                l06.f20884g = booleanValue5;
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
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23315), gVar);
        if (m02 != null) {
            final int i10 = 1;
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.l0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    List listOf4;
                    List listOf5;
                    List listOf6;
                    switch (i10) {
                        case 0:
                            M0 m03 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) m03.f20977a.f650b).a(((Long) obj2).longValue(), new L0(m03));
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
                            M0 m04 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l02 = (L0) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                m04.getClass();
                                l02.f20880c = booleanValue;
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
                            M0 m05 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l03 = (L0) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                m05.getClass();
                                l03.f20881d = booleanValue2;
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
                            M0 m06 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l04 = (L0) obj7;
                            Object obj8 = list3.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                m06.getClass();
                                l04.f20882e = booleanValue3;
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
                            M0 m07 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l05 = (L0) obj9;
                            Object obj10 = list4.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                m07.getClass();
                                l05.f20883f = booleanValue4;
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
                        default:
                            M0 m08 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l06 = (L0) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                m08.getClass();
                                l06.f20884g = booleanValue5;
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
                    }
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23316), gVar);
        if (m02 != null) {
            final int i11 = 2;
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.l0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    List listOf4;
                    List listOf5;
                    List listOf6;
                    switch (i11) {
                        case 0:
                            M0 m03 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) m03.f20977a.f650b).a(((Long) obj2).longValue(), new L0(m03));
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
                            M0 m04 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l02 = (L0) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                m04.getClass();
                                l02.f20880c = booleanValue;
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
                            M0 m05 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l03 = (L0) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                m05.getClass();
                                l03.f20881d = booleanValue2;
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
                            M0 m06 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l04 = (L0) obj7;
                            Object obj8 = list3.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                m06.getClass();
                                l04.f20882e = booleanValue3;
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
                            M0 m07 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l05 = (L0) obj9;
                            Object obj10 = list4.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                m07.getClass();
                                l05.f20883f = booleanValue4;
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
                        default:
                            M0 m08 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l06 = (L0) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                m08.getClass();
                                l06.f20884g = booleanValue5;
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
                    }
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23317), gVar);
        if (m02 != null) {
            final int i12 = 3;
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.l0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    List listOf4;
                    List listOf5;
                    List listOf6;
                    switch (i12) {
                        case 0:
                            M0 m03 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) m03.f20977a.f650b).a(((Long) obj2).longValue(), new L0(m03));
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
                            M0 m04 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l02 = (L0) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                m04.getClass();
                                l02.f20880c = booleanValue;
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
                            M0 m05 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l03 = (L0) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                m05.getClass();
                                l03.f20881d = booleanValue2;
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
                            M0 m06 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l04 = (L0) obj7;
                            Object obj8 = list3.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                m06.getClass();
                                l04.f20882e = booleanValue3;
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
                            M0 m07 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l05 = (L0) obj9;
                            Object obj10 = list4.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                m07.getClass();
                                l05.f20883f = booleanValue4;
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
                        default:
                            M0 m08 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l06 = (L0) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                m08.getClass();
                                l06.f20884g = booleanValue5;
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
                    }
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23318), gVar);
        if (m02 != null) {
            final int i13 = 4;
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.l0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    List listOf4;
                    List listOf5;
                    List listOf6;
                    switch (i13) {
                        case 0:
                            M0 m03 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) m03.f20977a.f650b).a(((Long) obj2).longValue(), new L0(m03));
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
                            M0 m04 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l02 = (L0) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                m04.getClass();
                                l02.f20880c = booleanValue;
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
                            M0 m05 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l03 = (L0) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                m05.getClass();
                                l03.f20881d = booleanValue2;
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
                            M0 m06 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l04 = (L0) obj7;
                            Object obj8 = list3.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                m06.getClass();
                                l04.f20882e = booleanValue3;
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
                            M0 m07 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l05 = (L0) obj9;
                            Object obj10 = list4.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                m07.getClass();
                                l05.f20883f = booleanValue4;
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
                        default:
                            M0 m08 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l06 = (L0) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                m08.getClass();
                                l06.f20884g = booleanValue5;
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
                    }
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23319), gVar);
        if (m02 == null) {
            basicMessageChannel6.setMessageHandler(null);
        } else {
            final int i14 = 5;
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.l0
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    List listOf4;
                    List listOf5;
                    List listOf6;
                    switch (i14) {
                        case 0:
                            M0 m03 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1637b) m03.f20977a.f650b).a(((Long) obj2).longValue(), new L0(m03));
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
                            M0 m04 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l02 = (L0) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                m04.getClass();
                                l02.f20880c = booleanValue;
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
                            M0 m05 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l03 = (L0) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                m05.getClass();
                                l03.f20881d = booleanValue2;
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
                            M0 m06 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l04 = (L0) obj7;
                            Object obj8 = list3.get(1);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                m06.getClass();
                                l04.f20882e = booleanValue3;
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
                            M0 m07 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l05 = (L0) obj9;
                            Object obj10 = list4.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                m07.getClass();
                                l05.f20883f = booleanValue4;
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
                        default:
                            M0 m08 = m02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            L0 l06 = (L0) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                m08.getClass();
                                l06.f20884g = booleanValue5;
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
                    }
                }
            });
        }
    }
}
