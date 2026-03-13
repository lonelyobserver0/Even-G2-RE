package sb;

import android.net.http.SslCertificate;
import android.os.Build;
import android.util.Log;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class Z {
    public static void a(BinaryMessenger binaryMessenger, final C0 c02) {
        MessageCodec gVar;
        B3.s sVar;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        if (c02 == null || (sVar = c02.f20925a) == null || (gVar = sVar.i()) == null) {
            gVar = new X2.g(2);
        }
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23256), gVar);
        if (c02 != null) {
            final int i3 = 0;
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.Y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    List listOf4;
                    List listOf5;
                    X509Certificate x509Certificate;
                    switch (i3) {
                        case 0:
                            C0 c03 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c03.getClass();
                                listOf = CollectionsKt.listOf(sslCertificate.getIssuedBy());
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
                            C0 c04 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c04.getClass();
                                listOf2 = CollectionsKt.listOf(sslCertificate2.getIssuedTo());
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
                            C0 c05 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c05.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listOf3 = CollectionsKt.listOf(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            C0 c06 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c06.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listOf4 = CollectionsKt.listOf(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            C0 c07 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c07.f20925a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d(StubApp.getString2("23254"), StubApp.getString2("23255"));
                                    x509Certificate = null;
                                }
                                listOf5 = CollectionsKt.listOf(x509Certificate);
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
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23257), gVar);
        if (c02 != null) {
            final int i10 = 1;
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.Y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    List listOf4;
                    List listOf5;
                    X509Certificate x509Certificate;
                    switch (i10) {
                        case 0:
                            C0 c03 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c03.getClass();
                                listOf = CollectionsKt.listOf(sslCertificate.getIssuedBy());
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
                            C0 c04 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c04.getClass();
                                listOf2 = CollectionsKt.listOf(sslCertificate2.getIssuedTo());
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
                            C0 c05 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c05.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listOf3 = CollectionsKt.listOf(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            C0 c06 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c06.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listOf4 = CollectionsKt.listOf(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            C0 c07 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c07.f20925a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d(StubApp.getString2("23254"), StubApp.getString2("23255"));
                                    x509Certificate = null;
                                }
                                listOf5 = CollectionsKt.listOf(x509Certificate);
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
                    }
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23258), gVar);
        if (c02 != null) {
            final int i11 = 2;
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.Y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    List listOf4;
                    List listOf5;
                    X509Certificate x509Certificate;
                    switch (i11) {
                        case 0:
                            C0 c03 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c03.getClass();
                                listOf = CollectionsKt.listOf(sslCertificate.getIssuedBy());
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
                            C0 c04 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c04.getClass();
                                listOf2 = CollectionsKt.listOf(sslCertificate2.getIssuedTo());
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
                            C0 c05 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c05.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listOf3 = CollectionsKt.listOf(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            C0 c06 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c06.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listOf4 = CollectionsKt.listOf(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            C0 c07 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c07.f20925a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d(StubApp.getString2("23254"), StubApp.getString2("23255"));
                                    x509Certificate = null;
                                }
                                listOf5 = CollectionsKt.listOf(x509Certificate);
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
                    }
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23259), gVar);
        if (c02 != null) {
            final int i12 = 3;
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.Y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    List listOf4;
                    List listOf5;
                    X509Certificate x509Certificate;
                    switch (i12) {
                        case 0:
                            C0 c03 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c03.getClass();
                                listOf = CollectionsKt.listOf(sslCertificate.getIssuedBy());
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
                            C0 c04 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c04.getClass();
                                listOf2 = CollectionsKt.listOf(sslCertificate2.getIssuedTo());
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
                            C0 c05 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c05.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listOf3 = CollectionsKt.listOf(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            C0 c06 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c06.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listOf4 = CollectionsKt.listOf(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            C0 c07 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c07.f20925a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d(StubApp.getString2("23254"), StubApp.getString2("23255"));
                                    x509Certificate = null;
                                }
                                listOf5 = CollectionsKt.listOf(x509Certificate);
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
                    }
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23260), gVar);
        if (c02 == null) {
            basicMessageChannel5.setMessageHandler(null);
        } else {
            final int i13 = 4;
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.Y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    List listOf;
                    List listOf2;
                    List listOf3;
                    List listOf4;
                    List listOf5;
                    X509Certificate x509Certificate;
                    switch (i13) {
                        case 0:
                            C0 c03 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c03.getClass();
                                listOf = CollectionsKt.listOf(sslCertificate.getIssuedBy());
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
                            C0 c04 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c04.getClass();
                                listOf2 = CollectionsKt.listOf(sslCertificate2.getIssuedTo());
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
                            C0 c05 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c05.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listOf3 = CollectionsKt.listOf(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            C0 c06 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c06.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listOf4 = CollectionsKt.listOf(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            C0 c07 = c02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c07.f20925a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d(StubApp.getString2("23254"), StubApp.getString2("23255"));
                                    x509Certificate = null;
                                }
                                listOf5 = CollectionsKt.listOf(x509Certificate);
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
                    }
                }
            });
        }
    }
}
