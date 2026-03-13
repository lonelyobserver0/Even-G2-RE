package sb;

import android.util.Log;
import android.webkit.ClientCertRequest;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sb.G, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1617G {
    public static void a(BinaryMessenger binaryMessenger, final C1653j c1653j) {
        MessageCodec gVar;
        B3.s sVar;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        if (c1653j == null || (sVar = c1653j.f20865a) == null || (gVar = sVar.i()) == null) {
            gVar = new X2.g(2);
        }
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23170), gVar);
        if (c1653j != null) {
            final int i3 = 0;
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.F
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    switch (i3) {
                        case 0:
                            C1653j c1653j2 = c1653j;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj2;
                            try {
                                c1653j2.getClass();
                                clientCertRequest.cancel();
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
                            C1653j c1653j3 = c1653j;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj3;
                            try {
                                c1653j3.getClass();
                                clientCertRequest2.ignore();
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
                        default:
                            C1653j c1653j4 = c1653j;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj5;
                            Object obj6 = list.get(2);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj6;
                            try {
                                c1653j4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23171), gVar);
        if (c1653j != null) {
            final int i10 = 1;
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.F
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    switch (i10) {
                        case 0:
                            C1653j c1653j2 = c1653j;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj2;
                            try {
                                c1653j2.getClass();
                                clientCertRequest.cancel();
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
                            C1653j c1653j3 = c1653j;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj3;
                            try {
                                c1653j3.getClass();
                                clientCertRequest2.ignore();
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
                        default:
                            C1653j c1653j4 = c1653j;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj5;
                            Object obj6 = list.get(2);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj6;
                            try {
                                c1653j4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23172), gVar);
        if (c1653j == null) {
            basicMessageChannel3.setMessageHandler(null);
        } else {
            final int i11 = 2;
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.F
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    switch (i11) {
                        case 0:
                            C1653j c1653j2 = c1653j;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj2;
                            try {
                                c1653j2.getClass();
                                clientCertRequest.cancel();
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
                            C1653j c1653j3 = c1653j;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj3;
                            try {
                                c1653j3.getClass();
                                clientCertRequest2.ignore();
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
                        default:
                            C1653j c1653j4 = c1653j;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj5;
                            Object obj6 = list.get(2);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj6;
                            try {
                                c1653j4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
