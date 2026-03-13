package g5;

import T0.o;
import T0.r;
import W4.s;
import Xa.h;
import android.os.Message;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import android.webkit.WebChromeClient;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.datatransport.TransportRegistrar;
import com.stub.StubApp;
import f5.C0896e0;
import f5.C0900g0;
import f5.H;
import f5.O0;
import f5.T;
import f5.W;
import io.flutter.plugin.common.BasicMessageChannel;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import n1.k;
import o1.C1452d;
import p0.AbstractC1482f;
import q1.j;
import sb.C1635a;
import y3.e;
import y3.f;

/* renamed from: g5.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C0955a implements b, e, L4.e, r, W4.e, BasicMessageChannel.Reply, BasicMessageChannel.MessageHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14216a;

    public /* synthetic */ C0955a(int i3) {
        this.f14216a = i3;
    }

    @Override // T0.r
    public o[] a() {
        switch (this.f14216a) {
            case 9:
                return new o[]{new k(j.f19902j0, 16)};
            default:
                return new o[]{new C1452d()};
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0313  */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.CharSequence] */
    @Override // y3.e, I3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.C0955a.apply(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // g5.b
    public Object b(JsonReader jsonReader) {
        boolean z2;
        boolean z10;
        boolean z11;
        String string2 = StubApp.getString2(12747);
        String string22 = StubApp.getString2(9576);
        String string23 = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
        String string24 = StubApp.getString2(555);
        String str = null;
        switch (this.f14216a) {
            case 0:
                jsonReader.beginObject();
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    if (nextName.equals(StubApp.getString2(15702))) {
                        String nextString = jsonReader.nextString();
                        if (nextString == null) {
                            throw new NullPointerException(StubApp.getString2(17769));
                        }
                        str = nextString;
                    } else if (nextName.equals(StubApp.getString2(17638))) {
                        bArr = Base64.decode(jsonReader.nextString(), 2);
                        if (bArr == null) {
                            throw new NullPointerException(StubApp.getString2(17768));
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (str != null && bArr != null) {
                    return new H(str, bArr);
                }
                StringBuilder sb2 = new StringBuilder();
                if (str == null) {
                    sb2.append(StubApp.getString2(17770));
                }
                if (bArr == null) {
                    sb2.append(StubApp.getString2(17771));
                }
                throw new IllegalStateException(h.r(sb2, string24));
            case 1:
                C0896e0 c0896e0 = new C0896e0();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    switch (nextName2.hashCode()) {
                        case -1536268810:
                            if (nextName2.equals(StubApp.getString2(17268))) {
                                z2 = false;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1027290370:
                            if (nextName2.equals(StubApp.getString2(17271))) {
                                z2 = true;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 1098747284:
                            if (nextName2.equals(StubApp.getString2(17725))) {
                                z2 = 2;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 1124454216:
                            if (nextName2.equals(StubApp.getString2(17269))) {
                                z2 = 3;
                                break;
                            }
                            z2 = -1;
                            break;
                        default:
                            z2 = -1;
                            break;
                    }
                    switch (z2) {
                        case false:
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 == null) {
                                throw new NullPointerException(StubApp.getString2(17274));
                            }
                            c0896e0.f14001b = nextString2;
                            break;
                        case true:
                            c0896e0.f14003d = jsonReader.nextLong();
                            c0896e0.f14004e = (byte) (c0896e0.f14004e | 1);
                            break;
                        case true:
                            jsonReader.beginObject();
                            String str2 = null;
                            String str3 = null;
                            while (jsonReader.hasNext()) {
                                String nextName3 = jsonReader.nextName();
                                nextName3.getClass();
                                if (nextName3.equals(StubApp.getString2(17270))) {
                                    str3 = jsonReader.nextString();
                                    if (str3 == null) {
                                        throw new NullPointerException(StubApp.getString2(17272));
                                    }
                                } else if (nextName3.equals(StubApp.getString2(17267))) {
                                    str2 = jsonReader.nextString();
                                    if (str2 == null) {
                                        throw new NullPointerException(StubApp.getString2(17275));
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            if (str2 != null && str3 != null) {
                                c0896e0.f14000a = new C0900g0(str2, str3);
                                break;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                if (str2 == null) {
                                    sb3.append(StubApp.getString2(17766));
                                }
                                if (str3 == null) {
                                    sb3.append(StubApp.getString2(17767));
                                }
                                throw new IllegalStateException(h.r(sb3, string24));
                            }
                        case true:
                            String nextString3 = jsonReader.nextString();
                            if (nextString3 == null) {
                                throw new NullPointerException(StubApp.getString2(17273));
                            }
                            c0896e0.f14002c = nextString3;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return c0896e0.a();
            case 2:
                jsonReader.beginObject();
                List list = null;
                byte b2 = 0;
                int i3 = 0;
                while (jsonReader.hasNext()) {
                    String nextName4 = jsonReader.nextName();
                    nextName4.getClass();
                    switch (nextName4.hashCode()) {
                        case -1266514778:
                            if (nextName4.equals(StubApp.getString2(17685))) {
                                z10 = false;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 3373707:
                            if (nextName4.equals(string23)) {
                                z10 = true;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 2125650548:
                            if (nextName4.equals(StubApp.getString2(2644))) {
                                z10 = 2;
                                break;
                            }
                            z10 = -1;
                            break;
                        default:
                            z10 = -1;
                            break;
                    }
                    switch (z10) {
                        case false:
                            list = c.d(jsonReader, new C0955a(4));
                            if (list == null) {
                                throw new NullPointerException(StubApp.getString2(9571));
                            }
                            continue;
                        case true:
                            str = jsonReader.nextString();
                            if (str == null) {
                                throw new NullPointerException(string22);
                            }
                            break;
                        case true:
                            i3 = jsonReader.nextInt();
                            b2 = (byte) (b2 | 1);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b2 == 1 && str != null && list != null) {
                    return new W(i3, str, list);
                }
                StringBuilder sb4 = new StringBuilder();
                if (str == null) {
                    sb4.append(string2);
                }
                if ((b2 & 1) == 0) {
                    sb4.append(StubApp.getString2(17528));
                }
                if (list == null) {
                    sb4.append(StubApp.getString2(17765));
                }
                throw new IllegalStateException(h.r(sb4, string24));
            case 3:
                jsonReader.beginObject();
                String str4 = null;
                String str5 = null;
                byte b10 = 0;
                long j = 0;
                long j3 = 0;
                while (jsonReader.hasNext()) {
                    String nextName5 = jsonReader.nextName();
                    nextName5.getClass();
                    switch (nextName5.hashCode()) {
                        case 3373707:
                            if (nextName5.equals(string23)) {
                                z11 = false;
                                break;
                            }
                            z11 = -1;
                            break;
                        case 3530753:
                            if (nextName5.equals(StubApp.getString2(4473))) {
                                z11 = true;
                                break;
                            }
                            z11 = -1;
                            break;
                        case 3601339:
                            if (nextName5.equals(StubApp.getString2(11240))) {
                                z11 = 2;
                                break;
                            }
                            z11 = -1;
                            break;
                        case 1153765347:
                            if (nextName5.equals(StubApp.getString2(17667))) {
                                z11 = 3;
                                break;
                            }
                            z11 = -1;
                            break;
                        default:
                            z11 = -1;
                            break;
                    }
                    switch (z11) {
                        case false:
                            String nextString4 = jsonReader.nextString();
                            if (nextString4 == null) {
                                throw new NullPointerException(string22);
                            }
                            str4 = nextString4;
                            break;
                        case true:
                            b10 = (byte) (b10 | 2);
                            j3 = jsonReader.nextLong();
                            break;
                        case true:
                            str5 = new String(Base64.decode(jsonReader.nextString(), 2), O0.f13901a);
                            break;
                        case true:
                            b10 = (byte) (b10 | 1);
                            j = jsonReader.nextLong();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b10 == 3 && str4 != null) {
                    return new T(j, j3, str4, str5);
                }
                StringBuilder sb5 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb5.append(StubApp.getString2(9574));
                }
                if ((b10 & 2) == 0) {
                    sb5.append(StubApp.getString2(9575));
                }
                if (str4 == null) {
                    sb5.append(string2);
                }
                throw new IllegalStateException(h.r(sb5, string24));
            default:
                return c.a(jsonReader);
        }
    }

    @Override // W4.e
    public Object h(s sVar) {
        f lambda$getComponents$0;
        f lambda$getComponents$1;
        f lambda$getComponents$2;
        switch (this.f14216a) {
            case 10:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(sVar);
                return lambda$getComponents$0;
            case 11:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(sVar);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(sVar);
                return lambda$getComponents$2;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List listOf;
        List listOf2;
        List listOf3;
        switch (this.f14216a) {
            case 19:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.os.Message");
                try {
                    ((Message) obj2).sendToTarget();
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
            case 20:
            default:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebChromeClient.CustomViewCallback");
                try {
                    ((WebChromeClient.CustomViewCallback) obj3).onCustomViewHidden();
                    listOf3 = CollectionsKt.listOf((Object) null);
                } catch (Throwable exception2) {
                    Intrinsics.checkNotNullParameter(exception2, "exception");
                    if (exception2 instanceof C1635a) {
                        C1635a c1635a2 = exception2;
                        listOf3 = CollectionsKt.listOf(c1635a2.f20922a, c1635a2.f20923b, c1635a2.f20924c);
                    } else {
                        listOf3 = CollectionsKt.listOf((Object[]) new String[]{exception2.getClass().getSimpleName(), exception2.toString(), E1.a.m(StubApp.getString2(6769), exception2.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception2))});
                    }
                }
                reply.reply(listOf3);
                return;
            case 21:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type java.security.cert.Certificate");
                try {
                    try {
                        listOf2 = CollectionsKt.listOf(((Certificate) obj4).getEncoded());
                    } catch (CertificateEncodingException e10) {
                        throw new RuntimeException(e10);
                    }
                } catch (Throwable exception3) {
                    Intrinsics.checkNotNullParameter(exception3, "exception");
                    if (exception3 instanceof C1635a) {
                        C1635a c1635a3 = exception3;
                        listOf2 = CollectionsKt.listOf(c1635a3.f20922a, c1635a3.f20923b, c1635a3.f20924c);
                    } else {
                        listOf2 = CollectionsKt.listOf((Object[]) new String[]{exception3.getClass().getSimpleName(), exception3.toString(), E1.a.m(StubApp.getString2(6769), exception3.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception3))});
                    }
                }
                reply.reply(listOf2);
                return;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        String string2 = StubApp.getString2(9425);
        String string22 = StubApp.getString2(9423);
        String string23 = StubApp.getString2(7094);
        switch (this.f14216a) {
            case 18:
                if (!(obj instanceof List)) {
                    Result.Companion companion = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(17788), string22, string2, StubApp.getString2(17789), "");
                    Unit unit = Unit.INSTANCE;
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion3 = Result.INSTANCE;
                        Object obj2 = list.get(0);
                        Intrinsics.checkNotNull(obj2, string23);
                        Object obj3 = list.get(1);
                        Intrinsics.checkNotNull(obj3, string23);
                        AbstractC1482f.u(new C1635a((String) obj2, (String) obj3, (String) list.get(2)));
                        Unit unit2 = Unit.INSTANCE;
                        break;
                    }
                }
            case 19:
            case 21:
            case 26:
            default:
                if (!(obj instanceof List)) {
                    Result.Companion companion4 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(17772), string22, string2, StubApp.getString2(17773), "");
                    Unit unit3 = Unit.INSTANCE;
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        Result.Companion companion5 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion6 = Result.INSTANCE;
                        Object obj4 = list2.get(0);
                        Intrinsics.checkNotNull(obj4, string23);
                        Object obj5 = list2.get(1);
                        Intrinsics.checkNotNull(obj5, string23);
                        AbstractC1482f.u(new C1635a((String) obj4, (String) obj5, (String) list2.get(2)));
                        Unit unit4 = Unit.INSTANCE;
                        break;
                    }
                }
            case 20:
                if (!(obj instanceof List)) {
                    Result.Companion companion7 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(17786), string22, string2, StubApp.getString2(17787), "");
                    Unit unit5 = Unit.INSTANCE;
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        Result.Companion companion8 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion9 = Result.INSTANCE;
                        Object obj6 = list3.get(0);
                        Intrinsics.checkNotNull(obj6, string23);
                        Object obj7 = list3.get(1);
                        Intrinsics.checkNotNull(obj7, string23);
                        AbstractC1482f.u(new C1635a((String) obj6, (String) obj7, (String) list3.get(2)));
                        Unit unit6 = Unit.INSTANCE;
                        break;
                    }
                }
            case 22:
                if (!(obj instanceof List)) {
                    Result.Companion companion10 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(17784), string22, string2, StubApp.getString2(17785), "");
                    Unit unit7 = Unit.INSTANCE;
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        Result.Companion companion11 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion12 = Result.INSTANCE;
                        Object obj8 = list4.get(0);
                        Intrinsics.checkNotNull(obj8, string23);
                        Object obj9 = list4.get(1);
                        Intrinsics.checkNotNull(obj9, string23);
                        AbstractC1482f.u(new C1635a((String) obj8, (String) obj9, (String) list4.get(2)));
                        Unit unit8 = Unit.INSTANCE;
                        break;
                    }
                }
            case 23:
                if (!(obj instanceof List)) {
                    Result.Companion companion13 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(17782), string22, string2, StubApp.getString2(17783), "");
                    Unit unit9 = Unit.INSTANCE;
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        Result.Companion companion14 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion15 = Result.INSTANCE;
                        Object obj10 = list5.get(0);
                        Intrinsics.checkNotNull(obj10, string23);
                        Object obj11 = list5.get(1);
                        Intrinsics.checkNotNull(obj11, string23);
                        AbstractC1482f.u(new C1635a((String) obj10, (String) obj11, (String) list5.get(2)));
                        Unit unit10 = Unit.INSTANCE;
                        break;
                    }
                }
            case 24:
                if (!(obj instanceof List)) {
                    Result.Companion companion16 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(17780), string22, string2, StubApp.getString2(17781), "");
                    Unit unit11 = Unit.INSTANCE;
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        Result.Companion companion17 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion18 = Result.INSTANCE;
                        Object obj12 = list6.get(0);
                        Intrinsics.checkNotNull(obj12, string23);
                        Object obj13 = list6.get(1);
                        Intrinsics.checkNotNull(obj13, string23);
                        AbstractC1482f.u(new C1635a((String) obj12, (String) obj13, (String) list6.get(2)));
                        Unit unit12 = Unit.INSTANCE;
                        break;
                    }
                }
            case 25:
                if (!(obj instanceof List)) {
                    Result.Companion companion19 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(17778), string22, string2, StubApp.getString2(17779), "");
                    Unit unit13 = Unit.INSTANCE;
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        Result.Companion companion20 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion21 = Result.INSTANCE;
                        Object obj14 = list7.get(0);
                        Intrinsics.checkNotNull(obj14, string23);
                        Object obj15 = list7.get(1);
                        Intrinsics.checkNotNull(obj15, string23);
                        AbstractC1482f.u(new C1635a((String) obj14, (String) obj15, (String) list7.get(2)));
                        Unit unit14 = Unit.INSTANCE;
                        break;
                    }
                }
            case 27:
                if (!(obj instanceof List)) {
                    Result.Companion companion22 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(17776), string22, string2, StubApp.getString2(17777), "");
                    break;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        Result.Companion companion23 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion24 = Result.INSTANCE;
                        Object obj16 = list8.get(0);
                        Intrinsics.checkNotNull(obj16, string23);
                        Object obj17 = list8.get(1);
                        Intrinsics.checkNotNull(obj17, string23);
                        AbstractC1482f.u(new C1635a((String) obj16, (String) obj17, (String) list8.get(2)));
                        break;
                    }
                }
            case 28:
                if (!(obj instanceof List)) {
                    Result.Companion companion25 = Result.INSTANCE;
                    AbstractC1482f.t(StubApp.getString2(17774), string22, string2, StubApp.getString2(17775), "");
                    Unit unit15 = Unit.INSTANCE;
                    break;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        Result.Companion companion26 = Result.INSTANCE;
                        Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                        break;
                    } else {
                        Result.Companion companion27 = Result.INSTANCE;
                        Object obj18 = list9.get(0);
                        Intrinsics.checkNotNull(obj18, string23);
                        Object obj19 = list9.get(1);
                        Intrinsics.checkNotNull(obj19, string23);
                        AbstractC1482f.u(new C1635a((String) obj18, (String) obj19, (String) list9.get(2)));
                        Unit unit16 = Unit.INSTANCE;
                        break;
                    }
                }
        }
    }
}
