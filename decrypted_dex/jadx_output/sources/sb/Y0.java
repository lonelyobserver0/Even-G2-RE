package sb;

import android.content.Context;
import android.util.Log;
import android.webkit.WebViewClient;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import g5.C0955a;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import qb.C1535b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class Y0 implements InterfaceC0825b, eb.a {

    /* renamed from: a, reason: collision with root package name */
    public C0824a f20918a;

    /* renamed from: b, reason: collision with root package name */
    public B3.s f20919b;

    @Override // eb.a
    public final void onAttachedToActivity(eb.b bVar) {
        B3.s sVar = this.f20919b;
        if (sVar != null) {
            sVar.f653e = ((Ya.d) bVar).f8882a;
        }
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        final int i3 = 0;
        final int i10 = 1;
        this.f20918a = c0824a;
        BinaryMessenger binaryMessenger = c0824a.f13554b;
        Context context = c0824a.f13553a;
        B3.s sVar = new B3.s(binaryMessenger, context, new C1673t(context.getAssets(), c0824a.f13557e));
        this.f20919b = sVar;
        c0824a.f13556d.registerViewFactory(StubApp.getString2(23235), new C1535b((C1637b) sVar.f650b));
        B3.s pigeonRegistrar = this.f20919b;
        pigeonRegistrar.getClass();
        Lazy lazy = C1643e.f20950b;
        C1637b c1637b = (C1637b) pigeonRegistrar.f650b;
        BinaryMessenger binaryMessenger2 = (BinaryMessenger) pigeonRegistrar.f651c;
        AbstractC1641d.a(binaryMessenger2, c1637b);
        AbstractC1620J.a(binaryMessenger2, new C1661n(pigeonRegistrar));
        AbstractC1678v0.a(binaryMessenger2, new c1(pigeonRegistrar));
        AbstractC1666p0.a(binaryMessenger2, new O0(pigeonRegistrar));
        C1683y c1683y = new C1683y(pigeonRegistrar);
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        MessageCodec i11 = pigeonRegistrar.i();
        if (i11 == null) {
            i11 = new X2.g(2);
        }
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23236), i11).setMessageHandler(new c5.B(c1683y, 29));
        final W0 w02 = new W0(pigeonRegistrar);
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        MessageCodec i12 = pigeonRegistrar.i();
        if (i12 == null) {
            i12 = new X2.g(2);
        }
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23237), i12).setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.x0
            @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
            public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                List listOf;
                List listOf2;
                switch (i3) {
                    case 0:
                        W0 w03 = w02;
                        Intrinsics.checkNotNullParameter(reply, "reply");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        Object obj2 = ((List) obj).get(0);
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                        long longValue = ((Long) obj2).longValue();
                        try {
                            B3.s sVar2 = w03.f21007a;
                            C1637b c1637b2 = (C1637b) sVar2.f650b;
                            sVar2.getClass();
                            c1637b2.a(longValue, new V0(w03));
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
                    default:
                        W0 w04 = w02;
                        Intrinsics.checkNotNullParameter(reply, "reply");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj3 = list.get(0);
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebViewClient");
                        WebViewClient webViewClient = (WebViewClient) obj3;
                        Object obj4 = list.get(1);
                        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((Boolean) obj4).booleanValue();
                        try {
                            if (webViewClient instanceof Q0) {
                                ((Q0) webViewClient).getClass();
                            } else {
                                w04.f21007a.getClass();
                                if (!(webViewClient instanceof V0)) {
                                    throw new IllegalStateException(StubApp.getString2("23370"));
                                }
                                ((V0) webViewClient).f20914b = booleanValue;
                            }
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
                }
            }
        });
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23238), i12).setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sb.x0
            @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
            public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                List listOf;
                List listOf2;
                switch (i10) {
                    case 0:
                        W0 w03 = w02;
                        Intrinsics.checkNotNullParameter(reply, "reply");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        Object obj2 = ((List) obj).get(0);
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                        long longValue = ((Long) obj2).longValue();
                        try {
                            B3.s sVar2 = w03.f21007a;
                            C1637b c1637b2 = (C1637b) sVar2.f650b;
                            sVar2.getClass();
                            c1637b2.a(longValue, new V0(w03));
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
                    default:
                        W0 w04 = w02;
                        Intrinsics.checkNotNullParameter(reply, "reply");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj3 = list.get(0);
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebViewClient");
                        WebViewClient webViewClient = (WebViewClient) obj3;
                        Object obj4 = list.get(1);
                        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((Boolean) obj4).booleanValue();
                        try {
                            if (webViewClient instanceof Q0) {
                                ((Q0) webViewClient).getClass();
                            } else {
                                w04.f21007a.getClass();
                                if (!(webViewClient instanceof V0)) {
                                    throw new IllegalStateException(StubApp.getString2("23370"));
                                }
                                ((V0) webViewClient).f20914b = booleanValue;
                            }
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
                }
            }
        });
        C1669r c1669r = new C1669r(pigeonRegistrar);
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        MessageCodec i13 = pigeonRegistrar.i();
        if (i13 == null) {
            i13 = new X2.g(2);
        }
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23239), i13).setMessageHandler(new c5.B(c1669r, 28));
        AbstractC1660m0.a(binaryMessenger2, new M0(pigeonRegistrar));
        AbstractC1625O.a(binaryMessenger2, new C1675u(pigeonRegistrar));
        P0 p02 = new P0(pigeonRegistrar);
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        MessageCodec i14 = pigeonRegistrar.i();
        if (i14 == null) {
            i14 = new X2.g(2);
        }
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23240), i14).setMessageHandler(new C1644e0(p02, 2));
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23241), i14).setMessageHandler(new C1627Q(p02, 29));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        C1613C c1613c = new C1613C();
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        MessageCodec i15 = pigeonRegistrar.i();
        if (i15 == null) {
            i15 = new X2.g(2);
        }
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23242), i15).setMessageHandler(new C1627Q(c1613c, 5));
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23243), i15).setMessageHandler(new C1627Q(c1613c, 6));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        C1663o c1663o = new C1663o();
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        MessageCodec i16 = pigeonRegistrar.i();
        if (i16 == null) {
            i16 = new X2.g(2);
        }
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23244), i16).setMessageHandler(new C0955a(c1663o, 26));
        AbstractC1652i0.a(binaryMessenger2, new G0(pigeonRegistrar));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        C1677v c1677v = new C1677v();
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        MessageCodec i17 = pigeonRegistrar.i();
        if (i17 == null) {
            i17 = new X2.g(2);
        }
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23245), i17).setMessageHandler(new C1627Q(c1677v, 1));
        AbstractC1630U.a(binaryMessenger2, new C1679w(pigeonRegistrar));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        C1685z c1685z = new C1685z();
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        MessageCodec i18 = pigeonRegistrar.i();
        if (i18 == null) {
            i18 = new X2.g(2);
        }
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23246), i18).setMessageHandler(new C0955a(c1685z, 19));
        AbstractC1617G.a(binaryMessenger2, new C1653j(pigeonRegistrar));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        D0 d02 = new D0();
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        MessageCodec i19 = pigeonRegistrar.i();
        if (i19 == null) {
            i19 = new X2.g(2);
        }
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23247), i19).setMessageHandler(new C1627Q(d02, 13));
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23248), i19).setMessageHandler(new C1627Q(d02, 14));
        E0 e02 = new E0(pigeonRegistrar);
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        MessageCodec i20 = pigeonRegistrar.i();
        if (i20 == null) {
            i20 = new X2.g(2);
        }
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23249), i20).setMessageHandler(new C1627Q(e02, 11));
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23250), i20).setMessageHandler(new C1644e0(e02, 0));
        AbstractC1640c0.a(binaryMessenger2, new B0(pigeonRegistrar));
        Z.a(binaryMessenger2, new C0(pigeonRegistrar));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        C1651i c1651i = new C1651i();
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        MessageCodec i21 = pigeonRegistrar.i();
        if (i21 == null) {
            i21 = new X2.g(2);
        }
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23251), i21).setMessageHandler(new C0955a(c1651i, 21));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        N0 n02 = new N0();
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        MessageCodec i22 = pigeonRegistrar.i();
        if (i22 == null) {
            i22 = new X2.g(2);
        }
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23252), i22).setMessageHandler(new C1644e0(n02, 1));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        X0 x02 = new X0();
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        MessageCodec i23 = pigeonRegistrar.i();
        if (i23 == null) {
            i23 = new X2.g(2);
        }
        new BasicMessageChannel(binaryMessenger2, StubApp.getString2(23253), i23).setMessageHandler(new C1674t0(x02, 4));
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        this.f20919b.f653e = this.f20918a.f13553a;
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f20919b.f653e = this.f20918a.f13553a;
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        B3.s sVar = this.f20919b;
        if (sVar != null) {
            Lazy lazy = C1643e.f20950b;
            BinaryMessenger binaryMessenger = (BinaryMessenger) sVar.f651c;
            AbstractC1641d.a(binaryMessenger, null);
            AbstractC1620J.a(binaryMessenger, null);
            AbstractC1678v0.a(binaryMessenger, null);
            AbstractC1666p0.a(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23236), new X2.g(2)).setMessageHandler(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            X2.g gVar = new X2.g(2);
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23237), gVar).setMessageHandler(null);
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23238), gVar).setMessageHandler(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23239), new X2.g(2)).setMessageHandler(null);
            AbstractC1660m0.a(binaryMessenger, null);
            AbstractC1625O.a(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            X2.g gVar2 = new X2.g(2);
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23240), gVar2).setMessageHandler(null);
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23241), gVar2).setMessageHandler(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            X2.g gVar3 = new X2.g(2);
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23242), gVar3).setMessageHandler(null);
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23243), gVar3).setMessageHandler(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23244), new X2.g(2)).setMessageHandler(null);
            AbstractC1652i0.a(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23245), new X2.g(2)).setMessageHandler(null);
            AbstractC1630U.a(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23246), new X2.g(2)).setMessageHandler(null);
            AbstractC1617G.a(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            X2.g gVar4 = new X2.g(2);
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23247), gVar4).setMessageHandler(null);
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23248), gVar4).setMessageHandler(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            X2.g gVar5 = new X2.g(2);
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23249), gVar5).setMessageHandler(null);
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23250), gVar5).setMessageHandler(null);
            AbstractC1640c0.a(binaryMessenger, null);
            Z.a(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23251), new X2.g(2)).setMessageHandler(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23252), new X2.g(2)).setMessageHandler(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new BasicMessageChannel(binaryMessenger, StubApp.getString2(23253), new X2.g(2)).setMessageHandler(null);
            C1637b c1637b = (C1637b) this.f20919b.f650b;
            c1637b.f20937g.removeCallbacks(c1637b.f20938h);
            c1637b.j = true;
            this.f20919b = null;
        }
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(eb.b bVar) {
        this.f20919b.f653e = ((Ya.d) bVar).f8882a;
    }
}
