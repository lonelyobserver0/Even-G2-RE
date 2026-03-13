package sb;

import android.util.Log;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sb.O, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1625O {
    public static void a(BinaryMessenger binaryMessenger, final C1675u c1675u) {
        MessageCodec gVar;
        B3.s sVar;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        if (c1675u == null || (sVar = c1675u.f20888a) == null || (gVar = sVar.i()) == null) {
            gVar = new X2.g(2);
        }
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23191), gVar);
        if (c1675u != null) {
            final int i3 = 0;
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.N
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    switch (i3) {
                        case 0:
                            C1675u c1675u2 = c1675u;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj2).longValue();
                            try {
                                B3.s sVar2 = c1675u2.f20888a;
                                ((C1637b) sVar2.f650b).a(longValue, (C1673t) sVar2.f654f);
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
                            return;
                        case 1:
                            C1675u c1675u3 = c1675u;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C1673t c1673t = (C1673t) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            try {
                                c1675u3.getClass();
                                try {
                                    String[] list2 = c1673t.f20997a.list(str);
                                    listOf2 = CollectionsKt.listOf(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e10) {
                                    throw new RuntimeException(e10.getMessage());
                                }
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
                            return;
                        default:
                            C1675u c1675u4 = c1675u;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C1673t c1673t2 = (C1673t) obj5;
                            Object obj6 = list3.get(1);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c1675u4.getClass();
                                listOf3 = CollectionsKt.listOf(((bb.d) c1673t2.f20998b.f2238b).b(str2));
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
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23192), gVar);
        if (c1675u != null) {
            final int i10 = 1;
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.N
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    switch (i10) {
                        case 0:
                            C1675u c1675u2 = c1675u;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj2).longValue();
                            try {
                                B3.s sVar2 = c1675u2.f20888a;
                                ((C1637b) sVar2.f650b).a(longValue, (C1673t) sVar2.f654f);
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
                            return;
                        case 1:
                            C1675u c1675u3 = c1675u;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C1673t c1673t = (C1673t) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            try {
                                c1675u3.getClass();
                                try {
                                    String[] list2 = c1673t.f20997a.list(str);
                                    listOf2 = CollectionsKt.listOf(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e10) {
                                    throw new RuntimeException(e10.getMessage());
                                }
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
                            return;
                        default:
                            C1675u c1675u4 = c1675u;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C1673t c1673t2 = (C1673t) obj5;
                            Object obj6 = list3.get(1);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c1675u4.getClass();
                                listOf3 = CollectionsKt.listOf(((bb.d) c1673t2.f20998b.f2238b).b(str2));
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
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23193), gVar);
        if (c1675u == null) {
            basicMessageChannel3.setMessageHandler(null);
        } else {
            final int i11 = 2;
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.N
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    switch (i11) {
                        case 0:
                            C1675u c1675u2 = c1675u;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj2).longValue();
                            try {
                                B3.s sVar2 = c1675u2.f20888a;
                                ((C1637b) sVar2.f650b).a(longValue, (C1673t) sVar2.f654f);
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
                            return;
                        case 1:
                            C1675u c1675u3 = c1675u;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C1673t c1673t = (C1673t) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            try {
                                c1675u3.getClass();
                                try {
                                    String[] list2 = c1673t.f20997a.list(str);
                                    listOf2 = CollectionsKt.listOf(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e10) {
                                    throw new RuntimeException(e10.getMessage());
                                }
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
                            return;
                        default:
                            C1675u c1675u4 = c1675u;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C1673t c1673t2 = (C1673t) obj5;
                            Object obj6 = list3.get(1);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c1675u4.getClass();
                                listOf3 = CollectionsKt.listOf(((bb.d) c1673t2.f20998b.f2238b).b(str2));
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
                            return;
                    }
                }
            });
        }
    }
}
