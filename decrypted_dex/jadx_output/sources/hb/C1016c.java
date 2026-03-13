package hb;

import D5.C0043g;
import D5.w;
import R0.t;
import X2.z;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import q4.k;
import q4.s;

/* renamed from: hb.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1016c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C1016c f14481a = new C1016c();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f14482b = LazyKt.lazy(new J2.b(7));

    public static MessageCodec a() {
        return (MessageCodec) f14482b.getValue();
    }

    public static void b(C1016c c1016c, BinaryMessenger binaryMessenger, final i iVar) {
        c1016c.getClass();
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter("", StubApp.getString2(7040));
        String concat = "".length() > 0 ? StubApp.getString2(1).concat("") : "";
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(18315), concat), a());
        if (iVar != null) {
            final int i3 = 2;
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: hb.b
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    int i10 = 20;
                    int i11 = 21;
                    int i12 = 2;
                    int i13 = 22;
                    int i14 = 1;
                    String string2 = StubApp.getString2(18310);
                    i iVar2 = iVar;
                    int i15 = 0;
                    String string22 = StubApp.getString2(18311);
                    String string23 = StubApp.getString2(696);
                    String string24 = StubApp.getString2(18312);
                    switch (i3) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar = new z(reply, i11);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar, string23);
                            k kVar = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar, iVar2, i14));
                            s sVar = kVar.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar, string22);
                            sVar.addOnCompleteListener(new C0043g(25, iVar2, zVar));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar2 = new z(reply, 12);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar2, string23);
                            k kVar2 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar2, iVar2, i15));
                            s sVar2 = kVar2.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar2, string22);
                            sVar2.addOnCompleteListener(new C0043g(i13, iVar2, zVar2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj2;
                            z zVar3 = new z(reply, 17);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(zVar3, string23);
                            k kVar3 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, iVar2, kVar3, i12));
                            s sVar3 = kVar3.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar3, string22);
                            sVar3.addOnCompleteListener(new C0043g(29, iVar2, zVar3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj3;
                            z zVar4 = new z(reply, 13);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(zVar4, string23);
                            Result.Companion companion = Result.INSTANCE;
                            zVar4.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new e(StubApp.getString2(18314), StubApp.getString2(18313))))));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            String str = (String) ((List) obj).get(0);
                            z zVar5 = new z(reply, i10);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar5, string23);
                            k kVar4 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.c(iVar2, str, kVar4, 11));
                            s sVar4 = kVar4.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar4, string22);
                            sVar4.addOnCompleteListener(new C0043g(23, iVar2, zVar5));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj4;
                            String str2 = (String) list.get(1);
                            z zVar6 = new z(reply, 18);
                            i iVar3 = iVar;
                            iVar3.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(zVar6, string23);
                            k kVar5 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new G3.a(4, iVar3, name, str2, kVar5));
                            s sVar5 = kVar5.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar5, string22);
                            sVar5.addOnCompleteListener(new C0043g(i10, iVar3, zVar6));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj5 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            z zVar7 = new z(reply, 16);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar7, string23);
                            k kVar6 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new w(iVar2, booleanValue, kVar6, i12));
                            s sVar6 = kVar6.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar6, string22);
                            sVar6.addOnCompleteListener(new C0043g(i11, iVar2, zVar7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar8 = new z(reply, 14);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar8, string23);
                            k kVar7 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(iVar2, kVar7));
                            s sVar7 = kVar7.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar7, string22);
                            sVar7.addOnCompleteListener(new C0043g(28, iVar2, zVar8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj6).longValue();
                            z zVar9 = new z(reply, i13);
                            i iVar4 = iVar;
                            iVar4.getClass();
                            Intrinsics.checkNotNullParameter(zVar9, string23);
                            k kVar8 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new t(iVar4, longValue, kVar8, 3));
                            s sVar8 = kVar8.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar8, string22);
                            sVar8.addOnCompleteListener(new C0043g(24, iVar4, zVar9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj7 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj7;
                            z zVar10 = new z(reply, 19);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(zVar10, string23);
                            k kVar9 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, iVar2, kVar9, i14));
                            s sVar9 = kVar9.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar9, string22);
                            sVar9.addOnCompleteListener(new C0043g(26, iVar2, zVar10));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Map map = (Map) ((List) obj).get(0);
                            z zVar11 = new z(reply, 15);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar11, string23);
                            k kVar10 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(iVar2, map, kVar10));
                            s sVar10 = kVar10.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar10, string22);
                            sVar10.addOnCompleteListener(new C0043g(27, iVar2, zVar11));
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(18316), concat), a());
        if (iVar != null) {
            final int i10 = 4;
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: hb.b
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    int i102 = 20;
                    int i11 = 21;
                    int i12 = 2;
                    int i13 = 22;
                    int i14 = 1;
                    String string2 = StubApp.getString2(18310);
                    i iVar2 = iVar;
                    int i15 = 0;
                    String string22 = StubApp.getString2(18311);
                    String string23 = StubApp.getString2(696);
                    String string24 = StubApp.getString2(18312);
                    switch (i10) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar = new z(reply, i11);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar, string23);
                            k kVar = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar, iVar2, i14));
                            s sVar = kVar.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar, string22);
                            sVar.addOnCompleteListener(new C0043g(25, iVar2, zVar));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar2 = new z(reply, 12);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar2, string23);
                            k kVar2 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar2, iVar2, i15));
                            s sVar2 = kVar2.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar2, string22);
                            sVar2.addOnCompleteListener(new C0043g(i13, iVar2, zVar2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj2;
                            z zVar3 = new z(reply, 17);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(zVar3, string23);
                            k kVar3 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, iVar2, kVar3, i12));
                            s sVar3 = kVar3.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar3, string22);
                            sVar3.addOnCompleteListener(new C0043g(29, iVar2, zVar3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj3;
                            z zVar4 = new z(reply, 13);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(zVar4, string23);
                            Result.Companion companion = Result.INSTANCE;
                            zVar4.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new e(StubApp.getString2(18314), StubApp.getString2(18313))))));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            String str = (String) ((List) obj).get(0);
                            z zVar5 = new z(reply, i102);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar5, string23);
                            k kVar4 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.c(iVar2, str, kVar4, 11));
                            s sVar4 = kVar4.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar4, string22);
                            sVar4.addOnCompleteListener(new C0043g(23, iVar2, zVar5));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj4;
                            String str2 = (String) list.get(1);
                            z zVar6 = new z(reply, 18);
                            i iVar3 = iVar;
                            iVar3.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(zVar6, string23);
                            k kVar5 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new G3.a(4, iVar3, name, str2, kVar5));
                            s sVar5 = kVar5.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar5, string22);
                            sVar5.addOnCompleteListener(new C0043g(i102, iVar3, zVar6));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj5 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            z zVar7 = new z(reply, 16);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar7, string23);
                            k kVar6 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new w(iVar2, booleanValue, kVar6, i12));
                            s sVar6 = kVar6.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar6, string22);
                            sVar6.addOnCompleteListener(new C0043g(i11, iVar2, zVar7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar8 = new z(reply, 14);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar8, string23);
                            k kVar7 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(iVar2, kVar7));
                            s sVar7 = kVar7.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar7, string22);
                            sVar7.addOnCompleteListener(new C0043g(28, iVar2, zVar8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj6).longValue();
                            z zVar9 = new z(reply, i13);
                            i iVar4 = iVar;
                            iVar4.getClass();
                            Intrinsics.checkNotNullParameter(zVar9, string23);
                            k kVar8 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new t(iVar4, longValue, kVar8, 3));
                            s sVar8 = kVar8.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar8, string22);
                            sVar8.addOnCompleteListener(new C0043g(24, iVar4, zVar9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj7 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj7;
                            z zVar10 = new z(reply, 19);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(zVar10, string23);
                            k kVar9 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, iVar2, kVar9, i14));
                            s sVar9 = kVar9.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar9, string22);
                            sVar9.addOnCompleteListener(new C0043g(26, iVar2, zVar10));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Map map = (Map) ((List) obj).get(0);
                            z zVar11 = new z(reply, 15);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar11, string23);
                            k kVar10 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(iVar2, map, kVar10));
                            s sVar10 = kVar10.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar10, string22);
                            sVar10.addOnCompleteListener(new C0043g(27, iVar2, zVar11));
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(18317), concat), a());
        if (iVar != null) {
            final int i11 = 5;
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: hb.b
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    int i102 = 20;
                    int i112 = 21;
                    int i12 = 2;
                    int i13 = 22;
                    int i14 = 1;
                    String string2 = StubApp.getString2(18310);
                    i iVar2 = iVar;
                    int i15 = 0;
                    String string22 = StubApp.getString2(18311);
                    String string23 = StubApp.getString2(696);
                    String string24 = StubApp.getString2(18312);
                    switch (i11) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar = new z(reply, i112);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar, string23);
                            k kVar = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar, iVar2, i14));
                            s sVar = kVar.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar, string22);
                            sVar.addOnCompleteListener(new C0043g(25, iVar2, zVar));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar2 = new z(reply, 12);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar2, string23);
                            k kVar2 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar2, iVar2, i15));
                            s sVar2 = kVar2.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar2, string22);
                            sVar2.addOnCompleteListener(new C0043g(i13, iVar2, zVar2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj2;
                            z zVar3 = new z(reply, 17);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(zVar3, string23);
                            k kVar3 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, iVar2, kVar3, i12));
                            s sVar3 = kVar3.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar3, string22);
                            sVar3.addOnCompleteListener(new C0043g(29, iVar2, zVar3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj3;
                            z zVar4 = new z(reply, 13);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(zVar4, string23);
                            Result.Companion companion = Result.INSTANCE;
                            zVar4.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new e(StubApp.getString2(18314), StubApp.getString2(18313))))));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            String str = (String) ((List) obj).get(0);
                            z zVar5 = new z(reply, i102);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar5, string23);
                            k kVar4 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.c(iVar2, str, kVar4, 11));
                            s sVar4 = kVar4.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar4, string22);
                            sVar4.addOnCompleteListener(new C0043g(23, iVar2, zVar5));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj4;
                            String str2 = (String) list.get(1);
                            z zVar6 = new z(reply, 18);
                            i iVar3 = iVar;
                            iVar3.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(zVar6, string23);
                            k kVar5 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new G3.a(4, iVar3, name, str2, kVar5));
                            s sVar5 = kVar5.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar5, string22);
                            sVar5.addOnCompleteListener(new C0043g(i102, iVar3, zVar6));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj5 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            z zVar7 = new z(reply, 16);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar7, string23);
                            k kVar6 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new w(iVar2, booleanValue, kVar6, i12));
                            s sVar6 = kVar6.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar6, string22);
                            sVar6.addOnCompleteListener(new C0043g(i112, iVar2, zVar7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar8 = new z(reply, 14);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar8, string23);
                            k kVar7 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(iVar2, kVar7));
                            s sVar7 = kVar7.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar7, string22);
                            sVar7.addOnCompleteListener(new C0043g(28, iVar2, zVar8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj6).longValue();
                            z zVar9 = new z(reply, i13);
                            i iVar4 = iVar;
                            iVar4.getClass();
                            Intrinsics.checkNotNullParameter(zVar9, string23);
                            k kVar8 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new t(iVar4, longValue, kVar8, 3));
                            s sVar8 = kVar8.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar8, string22);
                            sVar8.addOnCompleteListener(new C0043g(24, iVar4, zVar9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj7 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj7;
                            z zVar10 = new z(reply, 19);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(zVar10, string23);
                            k kVar9 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, iVar2, kVar9, i14));
                            s sVar9 = kVar9.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar9, string22);
                            sVar9.addOnCompleteListener(new C0043g(26, iVar2, zVar10));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Map map = (Map) ((List) obj).get(0);
                            z zVar11 = new z(reply, 15);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar11, string23);
                            k kVar10 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(iVar2, map, kVar10));
                            s sVar10 = kVar10.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar10, string22);
                            sVar10.addOnCompleteListener(new C0043g(27, iVar2, zVar11));
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(18318), concat), a());
        if (iVar != null) {
            final int i12 = 6;
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: hb.b
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    int i102 = 20;
                    int i112 = 21;
                    int i122 = 2;
                    int i13 = 22;
                    int i14 = 1;
                    String string2 = StubApp.getString2(18310);
                    i iVar2 = iVar;
                    int i15 = 0;
                    String string22 = StubApp.getString2(18311);
                    String string23 = StubApp.getString2(696);
                    String string24 = StubApp.getString2(18312);
                    switch (i12) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar = new z(reply, i112);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar, string23);
                            k kVar = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar, iVar2, i14));
                            s sVar = kVar.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar, string22);
                            sVar.addOnCompleteListener(new C0043g(25, iVar2, zVar));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar2 = new z(reply, 12);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar2, string23);
                            k kVar2 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar2, iVar2, i15));
                            s sVar2 = kVar2.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar2, string22);
                            sVar2.addOnCompleteListener(new C0043g(i13, iVar2, zVar2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj2;
                            z zVar3 = new z(reply, 17);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(zVar3, string23);
                            k kVar3 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, iVar2, kVar3, i122));
                            s sVar3 = kVar3.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar3, string22);
                            sVar3.addOnCompleteListener(new C0043g(29, iVar2, zVar3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj3;
                            z zVar4 = new z(reply, 13);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(zVar4, string23);
                            Result.Companion companion = Result.INSTANCE;
                            zVar4.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new e(StubApp.getString2(18314), StubApp.getString2(18313))))));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            String str = (String) ((List) obj).get(0);
                            z zVar5 = new z(reply, i102);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar5, string23);
                            k kVar4 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.c(iVar2, str, kVar4, 11));
                            s sVar4 = kVar4.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar4, string22);
                            sVar4.addOnCompleteListener(new C0043g(23, iVar2, zVar5));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj4;
                            String str2 = (String) list.get(1);
                            z zVar6 = new z(reply, 18);
                            i iVar3 = iVar;
                            iVar3.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(zVar6, string23);
                            k kVar5 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new G3.a(4, iVar3, name, str2, kVar5));
                            s sVar5 = kVar5.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar5, string22);
                            sVar5.addOnCompleteListener(new C0043g(i102, iVar3, zVar6));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj5 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            z zVar7 = new z(reply, 16);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar7, string23);
                            k kVar6 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new w(iVar2, booleanValue, kVar6, i122));
                            s sVar6 = kVar6.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar6, string22);
                            sVar6.addOnCompleteListener(new C0043g(i112, iVar2, zVar7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar8 = new z(reply, 14);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar8, string23);
                            k kVar7 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(iVar2, kVar7));
                            s sVar7 = kVar7.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar7, string22);
                            sVar7.addOnCompleteListener(new C0043g(28, iVar2, zVar8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj6).longValue();
                            z zVar9 = new z(reply, i13);
                            i iVar4 = iVar;
                            iVar4.getClass();
                            Intrinsics.checkNotNullParameter(zVar9, string23);
                            k kVar8 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new t(iVar4, longValue, kVar8, 3));
                            s sVar8 = kVar8.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar8, string22);
                            sVar8.addOnCompleteListener(new C0043g(24, iVar4, zVar9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj7 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj7;
                            z zVar10 = new z(reply, 19);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(zVar10, string23);
                            k kVar9 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, iVar2, kVar9, i14));
                            s sVar9 = kVar9.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar9, string22);
                            sVar9.addOnCompleteListener(new C0043g(26, iVar2, zVar10));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Map map = (Map) ((List) obj).get(0);
                            z zVar11 = new z(reply, 15);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar11, string23);
                            k kVar10 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(iVar2, map, kVar10));
                            s sVar10 = kVar10.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar10, string22);
                            sVar10.addOnCompleteListener(new C0043g(27, iVar2, zVar11));
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(18319), concat), a());
        if (iVar != null) {
            final int i13 = 7;
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: hb.b
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    int i102 = 20;
                    int i112 = 21;
                    int i122 = 2;
                    int i132 = 22;
                    int i14 = 1;
                    String string2 = StubApp.getString2(18310);
                    i iVar2 = iVar;
                    int i15 = 0;
                    String string22 = StubApp.getString2(18311);
                    String string23 = StubApp.getString2(696);
                    String string24 = StubApp.getString2(18312);
                    switch (i13) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar = new z(reply, i112);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar, string23);
                            k kVar = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar, iVar2, i14));
                            s sVar = kVar.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar, string22);
                            sVar.addOnCompleteListener(new C0043g(25, iVar2, zVar));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar2 = new z(reply, 12);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar2, string23);
                            k kVar2 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar2, iVar2, i15));
                            s sVar2 = kVar2.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar2, string22);
                            sVar2.addOnCompleteListener(new C0043g(i132, iVar2, zVar2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj2;
                            z zVar3 = new z(reply, 17);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(zVar3, string23);
                            k kVar3 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, iVar2, kVar3, i122));
                            s sVar3 = kVar3.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar3, string22);
                            sVar3.addOnCompleteListener(new C0043g(29, iVar2, zVar3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj3;
                            z zVar4 = new z(reply, 13);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(zVar4, string23);
                            Result.Companion companion = Result.INSTANCE;
                            zVar4.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new e(StubApp.getString2(18314), StubApp.getString2(18313))))));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            String str = (String) ((List) obj).get(0);
                            z zVar5 = new z(reply, i102);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar5, string23);
                            k kVar4 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.c(iVar2, str, kVar4, 11));
                            s sVar4 = kVar4.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar4, string22);
                            sVar4.addOnCompleteListener(new C0043g(23, iVar2, zVar5));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj4;
                            String str2 = (String) list.get(1);
                            z zVar6 = new z(reply, 18);
                            i iVar3 = iVar;
                            iVar3.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(zVar6, string23);
                            k kVar5 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new G3.a(4, iVar3, name, str2, kVar5));
                            s sVar5 = kVar5.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar5, string22);
                            sVar5.addOnCompleteListener(new C0043g(i102, iVar3, zVar6));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj5 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            z zVar7 = new z(reply, 16);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar7, string23);
                            k kVar6 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new w(iVar2, booleanValue, kVar6, i122));
                            s sVar6 = kVar6.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar6, string22);
                            sVar6.addOnCompleteListener(new C0043g(i112, iVar2, zVar7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar8 = new z(reply, 14);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar8, string23);
                            k kVar7 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(iVar2, kVar7));
                            s sVar7 = kVar7.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar7, string22);
                            sVar7.addOnCompleteListener(new C0043g(28, iVar2, zVar8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj6).longValue();
                            z zVar9 = new z(reply, i132);
                            i iVar4 = iVar;
                            iVar4.getClass();
                            Intrinsics.checkNotNullParameter(zVar9, string23);
                            k kVar8 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new t(iVar4, longValue, kVar8, 3));
                            s sVar8 = kVar8.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar8, string22);
                            sVar8.addOnCompleteListener(new C0043g(24, iVar4, zVar9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj7 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj7;
                            z zVar10 = new z(reply, 19);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(zVar10, string23);
                            k kVar9 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, iVar2, kVar9, i14));
                            s sVar9 = kVar9.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar9, string22);
                            sVar9.addOnCompleteListener(new C0043g(26, iVar2, zVar10));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Map map = (Map) ((List) obj).get(0);
                            z zVar11 = new z(reply, 15);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar11, string23);
                            k kVar10 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(iVar2, map, kVar10));
                            s sVar10 = kVar10.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar10, string22);
                            sVar10.addOnCompleteListener(new C0043g(27, iVar2, zVar11));
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(18320), concat), a());
        if (iVar != null) {
            final int i14 = 8;
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: hb.b
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    int i102 = 20;
                    int i112 = 21;
                    int i122 = 2;
                    int i132 = 22;
                    int i142 = 1;
                    String string2 = StubApp.getString2(18310);
                    i iVar2 = iVar;
                    int i15 = 0;
                    String string22 = StubApp.getString2(18311);
                    String string23 = StubApp.getString2(696);
                    String string24 = StubApp.getString2(18312);
                    switch (i14) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar = new z(reply, i112);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar, string23);
                            k kVar = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar, iVar2, i142));
                            s sVar = kVar.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar, string22);
                            sVar.addOnCompleteListener(new C0043g(25, iVar2, zVar));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar2 = new z(reply, 12);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar2, string23);
                            k kVar2 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar2, iVar2, i15));
                            s sVar2 = kVar2.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar2, string22);
                            sVar2.addOnCompleteListener(new C0043g(i132, iVar2, zVar2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj2;
                            z zVar3 = new z(reply, 17);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(zVar3, string23);
                            k kVar3 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, iVar2, kVar3, i122));
                            s sVar3 = kVar3.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar3, string22);
                            sVar3.addOnCompleteListener(new C0043g(29, iVar2, zVar3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj3;
                            z zVar4 = new z(reply, 13);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(zVar4, string23);
                            Result.Companion companion = Result.INSTANCE;
                            zVar4.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new e(StubApp.getString2(18314), StubApp.getString2(18313))))));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            String str = (String) ((List) obj).get(0);
                            z zVar5 = new z(reply, i102);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar5, string23);
                            k kVar4 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.c(iVar2, str, kVar4, 11));
                            s sVar4 = kVar4.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar4, string22);
                            sVar4.addOnCompleteListener(new C0043g(23, iVar2, zVar5));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj4;
                            String str2 = (String) list.get(1);
                            z zVar6 = new z(reply, 18);
                            i iVar3 = iVar;
                            iVar3.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(zVar6, string23);
                            k kVar5 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new G3.a(4, iVar3, name, str2, kVar5));
                            s sVar5 = kVar5.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar5, string22);
                            sVar5.addOnCompleteListener(new C0043g(i102, iVar3, zVar6));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj5 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            z zVar7 = new z(reply, 16);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar7, string23);
                            k kVar6 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new w(iVar2, booleanValue, kVar6, i122));
                            s sVar6 = kVar6.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar6, string22);
                            sVar6.addOnCompleteListener(new C0043g(i112, iVar2, zVar7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar8 = new z(reply, 14);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar8, string23);
                            k kVar7 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(iVar2, kVar7));
                            s sVar7 = kVar7.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar7, string22);
                            sVar7.addOnCompleteListener(new C0043g(28, iVar2, zVar8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj6).longValue();
                            z zVar9 = new z(reply, i132);
                            i iVar4 = iVar;
                            iVar4.getClass();
                            Intrinsics.checkNotNullParameter(zVar9, string23);
                            k kVar8 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new t(iVar4, longValue, kVar8, 3));
                            s sVar8 = kVar8.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar8, string22);
                            sVar8.addOnCompleteListener(new C0043g(24, iVar4, zVar9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj7 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj7;
                            z zVar10 = new z(reply, 19);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(zVar10, string23);
                            k kVar9 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, iVar2, kVar9, i142));
                            s sVar9 = kVar9.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar9, string22);
                            sVar9.addOnCompleteListener(new C0043g(26, iVar2, zVar10));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Map map = (Map) ((List) obj).get(0);
                            z zVar11 = new z(reply, 15);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar11, string23);
                            k kVar10 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(iVar2, map, kVar10));
                            s sVar10 = kVar10.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar10, string22);
                            sVar10.addOnCompleteListener(new C0043g(27, iVar2, zVar11));
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel6.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(18321), concat), a());
        if (iVar != null) {
            final int i15 = 9;
            basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: hb.b
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    int i102 = 20;
                    int i112 = 21;
                    int i122 = 2;
                    int i132 = 22;
                    int i142 = 1;
                    String string2 = StubApp.getString2(18310);
                    i iVar2 = iVar;
                    int i152 = 0;
                    String string22 = StubApp.getString2(18311);
                    String string23 = StubApp.getString2(696);
                    String string24 = StubApp.getString2(18312);
                    switch (i15) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar = new z(reply, i112);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar, string23);
                            k kVar = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar, iVar2, i142));
                            s sVar = kVar.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar, string22);
                            sVar.addOnCompleteListener(new C0043g(25, iVar2, zVar));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar2 = new z(reply, 12);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar2, string23);
                            k kVar2 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar2, iVar2, i152));
                            s sVar2 = kVar2.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar2, string22);
                            sVar2.addOnCompleteListener(new C0043g(i132, iVar2, zVar2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj2;
                            z zVar3 = new z(reply, 17);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(zVar3, string23);
                            k kVar3 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, iVar2, kVar3, i122));
                            s sVar3 = kVar3.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar3, string22);
                            sVar3.addOnCompleteListener(new C0043g(29, iVar2, zVar3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj3;
                            z zVar4 = new z(reply, 13);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(zVar4, string23);
                            Result.Companion companion = Result.INSTANCE;
                            zVar4.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new e(StubApp.getString2(18314), StubApp.getString2(18313))))));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            String str = (String) ((List) obj).get(0);
                            z zVar5 = new z(reply, i102);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar5, string23);
                            k kVar4 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.c(iVar2, str, kVar4, 11));
                            s sVar4 = kVar4.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar4, string22);
                            sVar4.addOnCompleteListener(new C0043g(23, iVar2, zVar5));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj4;
                            String str2 = (String) list.get(1);
                            z zVar6 = new z(reply, 18);
                            i iVar3 = iVar;
                            iVar3.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(zVar6, string23);
                            k kVar5 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new G3.a(4, iVar3, name, str2, kVar5));
                            s sVar5 = kVar5.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar5, string22);
                            sVar5.addOnCompleteListener(new C0043g(i102, iVar3, zVar6));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj5 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            z zVar7 = new z(reply, 16);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar7, string23);
                            k kVar6 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new w(iVar2, booleanValue, kVar6, i122));
                            s sVar6 = kVar6.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar6, string22);
                            sVar6.addOnCompleteListener(new C0043g(i112, iVar2, zVar7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar8 = new z(reply, 14);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar8, string23);
                            k kVar7 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(iVar2, kVar7));
                            s sVar7 = kVar7.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar7, string22);
                            sVar7.addOnCompleteListener(new C0043g(28, iVar2, zVar8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj6).longValue();
                            z zVar9 = new z(reply, i132);
                            i iVar4 = iVar;
                            iVar4.getClass();
                            Intrinsics.checkNotNullParameter(zVar9, string23);
                            k kVar8 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new t(iVar4, longValue, kVar8, 3));
                            s sVar8 = kVar8.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar8, string22);
                            sVar8.addOnCompleteListener(new C0043g(24, iVar4, zVar9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj7 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj7;
                            z zVar10 = new z(reply, 19);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(zVar10, string23);
                            k kVar9 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, iVar2, kVar9, i142));
                            s sVar9 = kVar9.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar9, string22);
                            sVar9.addOnCompleteListener(new C0043g(26, iVar2, zVar10));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Map map = (Map) ((List) obj).get(0);
                            z zVar11 = new z(reply, 15);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar11, string23);
                            k kVar10 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(iVar2, map, kVar10));
                            s sVar10 = kVar10.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar10, string22);
                            sVar10.addOnCompleteListener(new C0043g(27, iVar2, zVar11));
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel7.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(18322), concat), a());
        if (iVar != null) {
            final int i16 = 10;
            basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: hb.b
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    int i102 = 20;
                    int i112 = 21;
                    int i122 = 2;
                    int i132 = 22;
                    int i142 = 1;
                    String string2 = StubApp.getString2(18310);
                    i iVar2 = iVar;
                    int i152 = 0;
                    String string22 = StubApp.getString2(18311);
                    String string23 = StubApp.getString2(696);
                    String string24 = StubApp.getString2(18312);
                    switch (i16) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar = new z(reply, i112);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar, string23);
                            k kVar = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar, iVar2, i142));
                            s sVar = kVar.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar, string22);
                            sVar.addOnCompleteListener(new C0043g(25, iVar2, zVar));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar2 = new z(reply, 12);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar2, string23);
                            k kVar2 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar2, iVar2, i152));
                            s sVar2 = kVar2.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar2, string22);
                            sVar2.addOnCompleteListener(new C0043g(i132, iVar2, zVar2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj2;
                            z zVar3 = new z(reply, 17);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(zVar3, string23);
                            k kVar3 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, iVar2, kVar3, i122));
                            s sVar3 = kVar3.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar3, string22);
                            sVar3.addOnCompleteListener(new C0043g(29, iVar2, zVar3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj3;
                            z zVar4 = new z(reply, 13);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(zVar4, string23);
                            Result.Companion companion = Result.INSTANCE;
                            zVar4.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new e(StubApp.getString2(18314), StubApp.getString2(18313))))));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            String str = (String) ((List) obj).get(0);
                            z zVar5 = new z(reply, i102);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar5, string23);
                            k kVar4 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.c(iVar2, str, kVar4, 11));
                            s sVar4 = kVar4.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar4, string22);
                            sVar4.addOnCompleteListener(new C0043g(23, iVar2, zVar5));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj4;
                            String str2 = (String) list.get(1);
                            z zVar6 = new z(reply, 18);
                            i iVar3 = iVar;
                            iVar3.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(zVar6, string23);
                            k kVar5 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new G3.a(4, iVar3, name, str2, kVar5));
                            s sVar5 = kVar5.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar5, string22);
                            sVar5.addOnCompleteListener(new C0043g(i102, iVar3, zVar6));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj5 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            z zVar7 = new z(reply, 16);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar7, string23);
                            k kVar6 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new w(iVar2, booleanValue, kVar6, i122));
                            s sVar6 = kVar6.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar6, string22);
                            sVar6.addOnCompleteListener(new C0043g(i112, iVar2, zVar7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar8 = new z(reply, 14);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar8, string23);
                            k kVar7 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(iVar2, kVar7));
                            s sVar7 = kVar7.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar7, string22);
                            sVar7.addOnCompleteListener(new C0043g(28, iVar2, zVar8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj6).longValue();
                            z zVar9 = new z(reply, i132);
                            i iVar4 = iVar;
                            iVar4.getClass();
                            Intrinsics.checkNotNullParameter(zVar9, string23);
                            k kVar8 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new t(iVar4, longValue, kVar8, 3));
                            s sVar8 = kVar8.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar8, string22);
                            sVar8.addOnCompleteListener(new C0043g(24, iVar4, zVar9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj7 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj7;
                            z zVar10 = new z(reply, 19);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(zVar10, string23);
                            k kVar9 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, iVar2, kVar9, i142));
                            s sVar9 = kVar9.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar9, string22);
                            sVar9.addOnCompleteListener(new C0043g(26, iVar2, zVar10));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Map map = (Map) ((List) obj).get(0);
                            z zVar11 = new z(reply, 15);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar11, string23);
                            k kVar10 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(iVar2, map, kVar10));
                            s sVar10 = kVar10.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar10, string22);
                            sVar10.addOnCompleteListener(new C0043g(27, iVar2, zVar11));
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel8.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(18323), concat), a());
        if (iVar != null) {
            final int i17 = 0;
            basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: hb.b
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    int i102 = 20;
                    int i112 = 21;
                    int i122 = 2;
                    int i132 = 22;
                    int i142 = 1;
                    String string2 = StubApp.getString2(18310);
                    i iVar2 = iVar;
                    int i152 = 0;
                    String string22 = StubApp.getString2(18311);
                    String string23 = StubApp.getString2(696);
                    String string24 = StubApp.getString2(18312);
                    switch (i17) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar = new z(reply, i112);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar, string23);
                            k kVar = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar, iVar2, i142));
                            s sVar = kVar.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar, string22);
                            sVar.addOnCompleteListener(new C0043g(25, iVar2, zVar));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar2 = new z(reply, 12);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar2, string23);
                            k kVar2 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar2, iVar2, i152));
                            s sVar2 = kVar2.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar2, string22);
                            sVar2.addOnCompleteListener(new C0043g(i132, iVar2, zVar2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj2;
                            z zVar3 = new z(reply, 17);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(zVar3, string23);
                            k kVar3 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, iVar2, kVar3, i122));
                            s sVar3 = kVar3.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar3, string22);
                            sVar3.addOnCompleteListener(new C0043g(29, iVar2, zVar3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj3;
                            z zVar4 = new z(reply, 13);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(zVar4, string23);
                            Result.Companion companion = Result.INSTANCE;
                            zVar4.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new e(StubApp.getString2(18314), StubApp.getString2(18313))))));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            String str = (String) ((List) obj).get(0);
                            z zVar5 = new z(reply, i102);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar5, string23);
                            k kVar4 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.c(iVar2, str, kVar4, 11));
                            s sVar4 = kVar4.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar4, string22);
                            sVar4.addOnCompleteListener(new C0043g(23, iVar2, zVar5));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj4;
                            String str2 = (String) list.get(1);
                            z zVar6 = new z(reply, 18);
                            i iVar3 = iVar;
                            iVar3.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(zVar6, string23);
                            k kVar5 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new G3.a(4, iVar3, name, str2, kVar5));
                            s sVar5 = kVar5.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar5, string22);
                            sVar5.addOnCompleteListener(new C0043g(i102, iVar3, zVar6));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj5 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            z zVar7 = new z(reply, 16);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar7, string23);
                            k kVar6 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new w(iVar2, booleanValue, kVar6, i122));
                            s sVar6 = kVar6.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar6, string22);
                            sVar6.addOnCompleteListener(new C0043g(i112, iVar2, zVar7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar8 = new z(reply, 14);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar8, string23);
                            k kVar7 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(iVar2, kVar7));
                            s sVar7 = kVar7.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar7, string22);
                            sVar7.addOnCompleteListener(new C0043g(28, iVar2, zVar8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj6).longValue();
                            z zVar9 = new z(reply, i132);
                            i iVar4 = iVar;
                            iVar4.getClass();
                            Intrinsics.checkNotNullParameter(zVar9, string23);
                            k kVar8 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new t(iVar4, longValue, kVar8, 3));
                            s sVar8 = kVar8.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar8, string22);
                            sVar8.addOnCompleteListener(new C0043g(24, iVar4, zVar9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj7 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj7;
                            z zVar10 = new z(reply, 19);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(zVar10, string23);
                            k kVar9 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, iVar2, kVar9, i142));
                            s sVar9 = kVar9.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar9, string22);
                            sVar9.addOnCompleteListener(new C0043g(26, iVar2, zVar10));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Map map = (Map) ((List) obj).get(0);
                            z zVar11 = new z(reply, 15);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar11, string23);
                            k kVar10 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(iVar2, map, kVar10));
                            s sVar10 = kVar10.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar10, string22);
                            sVar10.addOnCompleteListener(new C0043g(27, iVar2, zVar11));
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel9.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(18324), concat), a());
        if (iVar != null) {
            final int i18 = 1;
            basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: hb.b
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    int i102 = 20;
                    int i112 = 21;
                    int i122 = 2;
                    int i132 = 22;
                    int i142 = 1;
                    String string2 = StubApp.getString2(18310);
                    i iVar2 = iVar;
                    int i152 = 0;
                    String string22 = StubApp.getString2(18311);
                    String string23 = StubApp.getString2(696);
                    String string24 = StubApp.getString2(18312);
                    switch (i18) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar = new z(reply, i112);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar, string23);
                            k kVar = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar, iVar2, i142));
                            s sVar = kVar.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar, string22);
                            sVar.addOnCompleteListener(new C0043g(25, iVar2, zVar));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar2 = new z(reply, 12);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar2, string23);
                            k kVar2 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar2, iVar2, i152));
                            s sVar2 = kVar2.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar2, string22);
                            sVar2.addOnCompleteListener(new C0043g(i132, iVar2, zVar2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj2;
                            z zVar3 = new z(reply, 17);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(zVar3, string23);
                            k kVar3 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, iVar2, kVar3, i122));
                            s sVar3 = kVar3.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar3, string22);
                            sVar3.addOnCompleteListener(new C0043g(29, iVar2, zVar3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj3;
                            z zVar4 = new z(reply, 13);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(zVar4, string23);
                            Result.Companion companion = Result.INSTANCE;
                            zVar4.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new e(StubApp.getString2(18314), StubApp.getString2(18313))))));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            String str = (String) ((List) obj).get(0);
                            z zVar5 = new z(reply, i102);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar5, string23);
                            k kVar4 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.c(iVar2, str, kVar4, 11));
                            s sVar4 = kVar4.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar4, string22);
                            sVar4.addOnCompleteListener(new C0043g(23, iVar2, zVar5));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj4;
                            String str2 = (String) list.get(1);
                            z zVar6 = new z(reply, 18);
                            i iVar3 = iVar;
                            iVar3.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(zVar6, string23);
                            k kVar5 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new G3.a(4, iVar3, name, str2, kVar5));
                            s sVar5 = kVar5.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar5, string22);
                            sVar5.addOnCompleteListener(new C0043g(i102, iVar3, zVar6));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj5 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            z zVar7 = new z(reply, 16);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar7, string23);
                            k kVar6 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new w(iVar2, booleanValue, kVar6, i122));
                            s sVar6 = kVar6.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar6, string22);
                            sVar6.addOnCompleteListener(new C0043g(i112, iVar2, zVar7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar8 = new z(reply, 14);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar8, string23);
                            k kVar7 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(iVar2, kVar7));
                            s sVar7 = kVar7.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar7, string22);
                            sVar7.addOnCompleteListener(new C0043g(28, iVar2, zVar8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj6).longValue();
                            z zVar9 = new z(reply, i132);
                            i iVar4 = iVar;
                            iVar4.getClass();
                            Intrinsics.checkNotNullParameter(zVar9, string23);
                            k kVar8 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new t(iVar4, longValue, kVar8, 3));
                            s sVar8 = kVar8.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar8, string22);
                            sVar8.addOnCompleteListener(new C0043g(24, iVar4, zVar9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj7 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj7;
                            z zVar10 = new z(reply, 19);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(zVar10, string23);
                            k kVar9 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, iVar2, kVar9, i142));
                            s sVar9 = kVar9.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar9, string22);
                            sVar9.addOnCompleteListener(new C0043g(26, iVar2, zVar10));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Map map = (Map) ((List) obj).get(0);
                            z zVar11 = new z(reply, 15);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar11, string23);
                            k kVar10 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(iVar2, map, kVar10));
                            s sVar10 = kVar10.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar10, string22);
                            sVar10.addOnCompleteListener(new C0043g(27, iVar2, zVar11));
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel10.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(18325), concat), a());
        if (iVar == null) {
            basicMessageChannel11.setMessageHandler(null);
        } else {
            final int i19 = 3;
            basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: hb.b
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    int i102 = 20;
                    int i112 = 21;
                    int i122 = 2;
                    int i132 = 22;
                    int i142 = 1;
                    String string2 = StubApp.getString2(18310);
                    i iVar2 = iVar;
                    int i152 = 0;
                    String string22 = StubApp.getString2(18311);
                    String string23 = StubApp.getString2(696);
                    String string24 = StubApp.getString2(18312);
                    switch (i19) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar = new z(reply, i112);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar, string23);
                            k kVar = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar, iVar2, i142));
                            s sVar = kVar.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar, string22);
                            sVar.addOnCompleteListener(new C0043g(25, iVar2, zVar));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar2 = new z(reply, 12);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar2, string23);
                            k kVar2 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar2, iVar2, i152));
                            s sVar2 = kVar2.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar2, string22);
                            sVar2.addOnCompleteListener(new C0043g(i132, iVar2, zVar2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj2;
                            z zVar3 = new z(reply, 17);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(zVar3, string23);
                            k kVar3 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, iVar2, kVar3, i122));
                            s sVar3 = kVar3.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar3, string22);
                            sVar3.addOnCompleteListener(new C0043g(29, iVar2, zVar3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj3 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj3;
                            z zVar4 = new z(reply, 13);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(zVar4, string23);
                            Result.Companion companion = Result.INSTANCE;
                            zVar4.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new e(StubApp.getString2(18314), StubApp.getString2(18313))))));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            String str = (String) ((List) obj).get(0);
                            z zVar5 = new z(reply, i102);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar5, string23);
                            k kVar4 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.c(iVar2, str, kVar4, 11));
                            s sVar4 = kVar4.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar4, string22);
                            sVar4.addOnCompleteListener(new C0043g(23, iVar2, zVar5));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj4;
                            String str2 = (String) list.get(1);
                            z zVar6 = new z(reply, 18);
                            i iVar3 = iVar;
                            iVar3.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(zVar6, string23);
                            k kVar5 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new G3.a(4, iVar3, name, str2, kVar5));
                            s sVar5 = kVar5.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar5, string22);
                            sVar5.addOnCompleteListener(new C0043g(i102, iVar3, zVar6));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj5 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            z zVar7 = new z(reply, 16);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar7, string23);
                            k kVar6 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new w(iVar2, booleanValue, kVar6, i122));
                            s sVar6 = kVar6.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar6, string22);
                            sVar6.addOnCompleteListener(new C0043g(i112, iVar2, zVar7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            z zVar8 = new z(reply, 14);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar8, string23);
                            k kVar7 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(iVar2, kVar7));
                            s sVar7 = kVar7.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar7, string22);
                            sVar7.addOnCompleteListener(new C0043g(28, iVar2, zVar8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj6 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj6).longValue();
                            z zVar9 = new z(reply, i132);
                            i iVar4 = iVar;
                            iVar4.getClass();
                            Intrinsics.checkNotNullParameter(zVar9, string23);
                            k kVar8 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new t(iVar4, longValue, kVar8, 3));
                            s sVar8 = kVar8.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar8, string22);
                            sVar8.addOnCompleteListener(new C0043g(24, iVar4, zVar9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Object obj7 = ((List) obj).get(0);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj7;
                            z zVar10 = new z(reply, 19);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(zVar10, string23);
                            k kVar9 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, iVar2, kVar9, i142));
                            s sVar9 = kVar9.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar9, string22);
                            sVar9.addOnCompleteListener(new C0043g(26, iVar2, zVar10));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, string24);
                            Intrinsics.checkNotNull(obj, string2);
                            Map map = (Map) ((List) obj).get(0);
                            z zVar11 = new z(reply, 15);
                            iVar2.getClass();
                            Intrinsics.checkNotNullParameter(zVar11, string23);
                            k kVar10 = new k();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(iVar2, map, kVar10));
                            s sVar10 = kVar10.f20051a;
                            Intrinsics.checkNotNullExpressionValue(sVar10, string22);
                            sVar10.addOnCompleteListener(new C0043g(27, iVar2, zVar11));
                            break;
                    }
                }
            });
        }
    }
}
