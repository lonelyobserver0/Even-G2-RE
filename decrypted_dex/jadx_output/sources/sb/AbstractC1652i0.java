package sb;

import android.util.Log;
import android.view.View;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sb.i0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1652i0 {
    public static void a(BinaryMessenger binaryMessenger, final G0 g02) {
        MessageCodec gVar;
        B3.s sVar;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        if (g02 == null || (sVar = g02.f20960a) == null || (gVar = sVar.i()) == null) {
            gVar = new X2.g(2);
        }
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23301), gVar);
        if (g02 != null) {
            final int i3 = 0;
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.h0
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
                            G0 g03 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                g03.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            G0 g04 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                g04.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            G0 g05 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                g05.getClass();
                                listOf3 = CollectionsKt.listOf(new Z0(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            G0 g06 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                g06.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            G0 g07 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                g07.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                            return;
                        default:
                            G0 g08 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC1612B enumC1612B = (EnumC1612B) obj14;
                            try {
                                g08.getClass();
                                int ordinal = enumC1612B.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC1612B enumC1612B2 = EnumC1612B.f20849c;
                                    g08.f20960a.getClass();
                                    throw new IllegalArgumentException(enumC1612B2 + StubApp.getString2("23286"));
                                }
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
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23302), gVar);
        if (g02 != null) {
            final int i10 = 1;
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.h0
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
                            G0 g03 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                g03.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            G0 g04 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                g04.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            G0 g05 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                g05.getClass();
                                listOf3 = CollectionsKt.listOf(new Z0(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            G0 g06 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                g06.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            G0 g07 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                g07.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                            return;
                        default:
                            G0 g08 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC1612B enumC1612B = (EnumC1612B) obj14;
                            try {
                                g08.getClass();
                                int ordinal = enumC1612B.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC1612B enumC1612B2 = EnumC1612B.f20849c;
                                    g08.f20960a.getClass();
                                    throw new IllegalArgumentException(enumC1612B2 + StubApp.getString2("23286"));
                                }
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
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23303), gVar);
        if (g02 != null) {
            final int i11 = 2;
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.h0
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
                            G0 g03 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                g03.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            G0 g04 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                g04.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            G0 g05 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                g05.getClass();
                                listOf3 = CollectionsKt.listOf(new Z0(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            G0 g06 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                g06.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            G0 g07 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                g07.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                            return;
                        default:
                            G0 g08 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC1612B enumC1612B = (EnumC1612B) obj14;
                            try {
                                g08.getClass();
                                int ordinal = enumC1612B.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC1612B enumC1612B2 = EnumC1612B.f20849c;
                                    g08.f20960a.getClass();
                                    throw new IllegalArgumentException(enumC1612B2 + StubApp.getString2("23286"));
                                }
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
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23304), gVar);
        if (g02 != null) {
            final int i12 = 3;
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.h0
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
                            G0 g03 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                g03.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            G0 g04 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                g04.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            G0 g05 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                g05.getClass();
                                listOf3 = CollectionsKt.listOf(new Z0(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            G0 g06 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                g06.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            G0 g07 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                g07.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                            return;
                        default:
                            G0 g08 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC1612B enumC1612B = (EnumC1612B) obj14;
                            try {
                                g08.getClass();
                                int ordinal = enumC1612B.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC1612B enumC1612B2 = EnumC1612B.f20849c;
                                    g08.f20960a.getClass();
                                    throw new IllegalArgumentException(enumC1612B2 + StubApp.getString2("23286"));
                                }
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
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23305), gVar);
        if (g02 != null) {
            final int i13 = 4;
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.h0
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
                            G0 g03 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                g03.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            G0 g04 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                g04.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            G0 g05 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                g05.getClass();
                                listOf3 = CollectionsKt.listOf(new Z0(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            G0 g06 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                g06.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            G0 g07 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                g07.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                            return;
                        default:
                            G0 g08 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC1612B enumC1612B = (EnumC1612B) obj14;
                            try {
                                g08.getClass();
                                int ordinal = enumC1612B.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC1612B enumC1612B2 = EnumC1612B.f20849c;
                                    g08.f20960a.getClass();
                                    throw new IllegalArgumentException(enumC1612B2 + StubApp.getString2("23286"));
                                }
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
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, StubApp.getString2(23306), gVar);
        if (g02 == null) {
            basicMessageChannel6.setMessageHandler(null);
        } else {
            final int i14 = 5;
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.h0
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
                            G0 g03 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                g03.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            G0 g04 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                g04.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            G0 g05 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                g05.getClass();
                                listOf3 = CollectionsKt.listOf(new Z0(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            G0 g06 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                g06.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            G0 g07 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                g07.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                            return;
                        default:
                            G0 g08 = g02;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC1612B enumC1612B = (EnumC1612B) obj14;
                            try {
                                g08.getClass();
                                int ordinal = enumC1612B.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    EnumC1612B enumC1612B2 = EnumC1612B.f20849c;
                                    g08.f20960a.getClass();
                                    throw new IllegalArgumentException(enumC1612B2 + StubApp.getString2("23286"));
                                }
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
                            return;
                    }
                }
            });
        }
    }
}
