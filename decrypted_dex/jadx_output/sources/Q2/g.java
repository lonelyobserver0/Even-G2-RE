package Q2;

import Ac.m;
import B3.s;
import B3.t;
import C2.i;
import E0.k;
import E9.r;
import L0.Q;
import M4.F;
import M4.G;
import M4.I;
import M4.Z;
import Qb.F0;
import Qb.InterfaceC0221t0;
import Qb.J;
import Qb.L;
import T0.l;
import T0.o;
import V8.C0351c;
import V8.C0353e;
import Y.n;
import Y.u;
import Y.v;
import Z9.q;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.CancellationSignal;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import com.even.even_core.utils.room.EvDatabase_Impl;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.HttpServiceInterface;
import com.mapbox.common.NetworkRestriction;
import com.mapbox.common.ResourceLoadFlags;
import com.mapbox.common.ResourceLoadProgress;
import com.mapbox.common.ResourceLoadProgressCallback;
import com.mapbox.common.ResourceLoadResultCallback;
import com.mapbox.common.SdkInformation;
import com.mapbox.navigation.base.route.j;
import com.stub.StubApp;
import f5.u0;
import i5.C1059c;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.FlutterCallbackInformation;
import java.io.BufferedReader;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledFuture;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource;
import l4.E0;
import p0.AbstractC1482f;
import p2.h;
import r0.AbstractC1550k;
import s.C1590a;
import t0.InterfaceC1708h;
import vb.InterfaceC1845b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g implements D3.b, ResourceLoadProgressCallback, ResourceLoadResultCallback, InterfaceC1845b, j, q4.d, org.slf4j.a {

    /* renamed from: e, reason: collision with root package name */
    public static g f5709e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5710a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5711b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5712c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5713d;

    public /* synthetic */ g(int i3, char c10) {
        this.f5710a = i3;
    }

    public static g H() {
        if (f5709e == null) {
            i iVar = new i();
            Wa.a aVar = new Wa.a(0);
            aVar.f8210b = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(aVar);
            FlutterJNI flutterJNI = new FlutterJNI();
            bb.d dVar = new bb.d();
            dVar.f10743b = false;
            dVar.f10746e = flutterJNI;
            dVar.f10747f = newCachedThreadPool;
            g gVar = new g(25, (char) 0);
            gVar.f5711b = dVar;
            gVar.f5712c = iVar;
            gVar.f5713d = newCachedThreadPool;
            f5709e = gVar;
        }
        return f5709e;
    }

    public static AudioFocusRequest v(F9.a owner, r rVar) {
        AudioFocusRequest.Builder audioFocusRequestBuilder = new AudioFocusRequest.Builder(3);
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(audioFocusRequestBuilder, "audioFocusRequestBuilder");
        Intrinsics.checkNotNullParameter(owner, "owner");
        new E1.b(1, rVar, owner).invoke(audioFocusRequestBuilder);
        return audioFocusRequestBuilder.build();
    }

    public static Expected x(String str) {
        Expected createError = ExpectedFactory.createError(new Error(str));
        Intrinsics.checkNotNullExpressionValue(createError, "createError(Error(message))");
        return createError;
    }

    public static boolean z(Editable editable, KeyEvent keyEvent, boolean z2) {
        v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
                for (v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A() {
        Charset charset = (Charset) this.f5713d;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        if (charset.equals(charset2)) {
            if (((StringBuilder) this.f5711b).length() > 0) {
                StringBuilder sb2 = (StringBuilder) this.f5712c;
                if (sb2 == null) {
                    this.f5712c = (StringBuilder) this.f5711b;
                    this.f5711b = new StringBuilder();
                    return;
                } else {
                    sb2.append((CharSequence) this.f5711b);
                    this.f5711b = new StringBuilder();
                    return;
                }
            }
            return;
        }
        if (((StringBuilder) this.f5711b).length() > 0) {
            byte[] bytes = ((StringBuilder) this.f5711b).toString().getBytes(charset2);
            this.f5711b = new StringBuilder();
            StringBuilder sb3 = (StringBuilder) this.f5712c;
            if (sb3 == null) {
                this.f5712c = new StringBuilder(new String(bytes, (Charset) this.f5713d));
            } else {
                sb3.append(new String(bytes, (Charset) this.f5713d));
            }
        }
    }

    public long B() {
        l lVar = (l) this.f5713d;
        if (lVar != null) {
            return lVar.f7030d;
        }
        return -1L;
    }

    public Object C(int i3, N2.a aVar) {
        J1.v e10 = J1.v.e(1, StubApp.getString2(5088));
        e10.m(1, i3);
        return u0.k((EvDatabase_Impl) this.f5711b, new CancellationSignal(), new b(this, e10, 2), aVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(80:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(77:239|240|(1:24)|25|26|27|(1:29)|236|31|32|33|34|35|(1:37)(6:213|(1:232)(2:215|(1:217)(1:218))|219|(2:221|(1:223))(1:231)|224|(65:226|(1:228)(1:230)|229|39|(1:41)|42|(1:44)|45|(55:47|(1:51)|52|(1:54)|55|(1:57)(2:197|(1:202)(1:201))|(1:59)|60|(1:62)(5:185|(1:187)|188|(1:190)(1:196)|(1:192)(2:193|(1:195)))|63|(1:65)(6:167|(4:170|(2:178|179)(1:176)|177|168)|180|181|(1:183)|184)|66|(1:68)(1:166)|(1:70)|71|(38:162|163|(1:77)|78|(1:80)|81|(32:153|(1:157)|(1:85)|86|(28:148|(1:152)|(1:90)|91|(24:145|(1:147)|(1:95)|96|(1:98)|99|(1:101)|102|(3:104|(1:109)(1:107)|108)|110|(1:112)|113|(1:115)|116|(1:118)|119|(1:144)|121|(6:129|130|(1:132)(1:139)|133|(1:135)(1:138)|136)|123|124|(1:126)|127|128)|93|(0)|96|(0)|99|(0)|102|(0)|110|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128)|88|(0)|91|(0)|93|(0)|96|(0)|99|(0)|102|(0)|110|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128)|83|(0)|86|(0)|88|(0)|91|(0)|93|(0)|96|(0)|99|(0)|102|(0)|110|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128)|73|(38:158|159|(0)|78|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|93|(0)|96|(0)|99|(0)|102|(0)|110|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128)|75|(0)|78|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|93|(0)|96|(0)|99|(0)|102|(0)|110|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128)|203|(2:208|209)|(1:206)(1:207)|52|(0)|55|(0)(0)|(0)|60|(0)(0)|63|(0)(0)|66|(0)(0)|(0)|71|(0)|73|(0)|75|(0)|78|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|93|(0)|96|(0)|99|(0)|102|(0)|110|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128))|38|39|(0)|42|(0)|45|(0)|203|(0)|(0)(0)|52|(0)|55|(0)(0)|(0)|60|(0)(0)|63|(0)(0)|66|(0)(0)|(0)|71|(0)|73|(0)|75|(0)|78|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|93|(0)|96|(0)|99|(0)|102|(0)|110|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128)|22|(0)|25|26|27|(0)|236|31|32|33|34|35|(0)(0)|38|39|(0)|42|(0)|45|(0)|203|(0)|(0)(0)|52|(0)|55|(0)(0)|(0)|60|(0)(0)|63|(0)(0)|66|(0)(0)|(0)|71|(0)|73|(0)|75|(0)|78|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|93|(0)|96|(0)|99|(0)|102|(0)|110|(0)|113|(0)|116|(0)|119|(0)|121|(0)|123|124|(0)|127|128) */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x01d2, code lost:
    
        r17 = 1;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x00e7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x00e8, code lost:
    
        android.util.Log.w(r8, r11 + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e3, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0653 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0488 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0452 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x027f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1 A[Catch: NameNotFoundException -> 0x00e7, TRY_LEAVE, TryCatch #3 {NameNotFoundException -> 0x00e7, blocks: (B:27:0x00db, B:29:0x00e1), top: B:26:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05b0  */
    /* JADX WARN: Type inference failed for: r0v112, types: [int] */
    /* JADX WARN: Type inference failed for: r0v144 */
    /* JADX WARN: Type inference failed for: r0v207 */
    /* JADX WARN: Type inference failed for: r0v208 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D() {
        /*
            Method dump skipped, instructions count: 1777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.g.D():boolean");
    }

    public boolean E(CharSequence charSequence, int i3, int i10, u uVar) {
        if ((uVar.f8700c & 3) == 0) {
            Y.c cVar = (Y.c) this.f5713d;
            Z.a b2 = uVar.b();
            int a3 = b2.a(8);
            if (a3 != 0) {
                ((ByteBuffer) b2.f4812d).getShort(a3 + b2.f4809a);
            }
            cVar.getClass();
            ThreadLocal threadLocal = Y.c.f8652b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i3 < i10) {
                sb2.append(charSequence.charAt(i3));
                i3++;
            }
            TextPaint textPaint = cVar.f8653a;
            String sb3 = sb2.toString();
            int i11 = F.d.f2169a;
            boolean hasGlyph = textPaint.hasGlyph(sb3);
            int i12 = uVar.f8700c & 4;
            uVar.f8700c = hasGlyph ? i12 | 2 : i12 | 1;
        }
        return (uVar.f8700c & 3) == 2;
    }

    public boolean F() {
        String trim;
        if (((String) this.f5713d) == null) {
            ArrayDeque arrayDeque = (ArrayDeque) this.f5712c;
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f5713d = str;
                return true;
            }
            do {
                String readLine = ((BufferedReader) this.f5711b).readLine();
                this.f5713d = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f5713d = trim;
            } while (trim.isEmpty());
        }
        return true;
    }

    public void G(InterfaceC1708h interfaceC1708h, Uri uri, Map map, long j, long j3, Q q10) {
        boolean z2;
        boolean z10 = true;
        l lVar = new l(interfaceC1708h, j, j3);
        this.f5713d = lVar;
        if (((o) this.f5712c) != null) {
            return;
        }
        o[] f10 = ((T0.r) this.f5711b).f(uri, map);
        int length = f10.length;
        G g10 = I.f4549b;
        M4.r.d(length, StubApp.getString2(2021));
        F f11 = new F(length);
        if (f10.length == 1) {
            this.f5712c = f10[0];
        } else {
            int length2 = f10.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                o oVar = f10[i3];
                try {
                } catch (EOFException unused) {
                    z2 = ((o) this.f5712c) != null || lVar.f7030d == j;
                } catch (Throwable th) {
                    if (((o) this.f5712c) == null && lVar.f7030d != j) {
                        z10 = false;
                    }
                    AbstractC1550k.g(z10);
                    lVar.f7032f = 0;
                    throw th;
                }
                if (oVar.h(lVar)) {
                    this.f5712c = oVar;
                    lVar.f7032f = 0;
                    break;
                } else {
                    f11.d(oVar.g());
                    z2 = ((o) this.f5712c) != null || lVar.f7030d == j;
                    AbstractC1550k.g(z2);
                    lVar.f7032f = 0;
                    i3++;
                }
            }
            if (((o) this.f5712c) == null) {
                String str = StubApp.getString2(5134) + new A0.c(StubApp.getString2(81)).j(M4.r.u(I.n(f10), new A1.a(19))) + StubApp.getString2(5135);
                uri.getClass();
                Z g11 = f11.g();
                K0.e eVar = new K0.e(str, null, false, 1);
                I.m(g11);
                throw eVar;
            }
        }
        ((o) this.f5712c).f(q10);
    }

    public Object I(int i3, String str, String str2, long j, N2.f fVar) {
        J1.v e10 = J1.v.e(4, StubApp.getString2(5136));
        e10.m(1, i3);
        e10.g(2, str);
        e10.g(3, str2);
        e10.m(4, j);
        return u0.k((EvDatabase_Impl) this.f5711b, new CancellationSignal(), new b(this, e10, 0), fVar);
    }

    public Object J(String str, String str2, long j, N2.f fVar) {
        J1.v e10 = J1.v.e(3, StubApp.getString2(5137));
        e10.g(1, str);
        e10.g(2, str2);
        e10.m(3, j);
        return u0.k((EvDatabase_Impl) this.f5711b, new CancellationSignal(), new b(this, e10, 1), fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object K(com.mapbox.api.directions.v5.models.VoiceInstructions r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = 1
            boolean r1 = r7 instanceof E9.h
            if (r1 == 0) goto L14
            r1 = r7
            E9.h r1 = (E9.h) r1
            int r2 = r1.f2070d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.f2070d = r2
            goto L19
        L14:
            E9.h r1 = new E9.h
            r1.<init>(r5, r7)
        L19:
            java.lang.Object r7 = r1.f2068b
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.f2070d
            if (r3 == 0) goto L3a
            if (r3 != r0) goto L2d
            Q2.g r6 = r1.f2067a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L2b
            goto L76
        L2b:
            r6 = move-exception
            goto L92
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r7 = 275(0x113, float:3.85E-43)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L2b
            java.lang.String r7 = "voiceInstructions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r7 = r6.announcement()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = r6.ssmlAnnouncement()     // Catch: java.lang.Throwable -> L2b
            com.mapbox.bindgen.Expected r6 = a.AbstractC0378a.s(r7, r6)     // Catch: java.lang.Throwable -> L2b
            A1.a r7 = new A1.a     // Catch: java.lang.Throwable -> L2b
            r3 = 8
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r6.getValueOrElse(r7)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r7 = "VoiceInstructionsParser.…tValueOrElse { throw it }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch: java.lang.Throwable -> L2b
            F9.f r6 = (F9.f) r6     // Catch: java.lang.Throwable -> L2b
            Q2.g r6 = r5.y(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r5.f5713d     // Catch: java.lang.Throwable -> L2b
            C9.b r7 = (C9.b) r7     // Catch: java.lang.Throwable -> L2b
            r1.f2067a = r5     // Catch: java.lang.Throwable -> L2b
            r1.f2070d = r0     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = com.google.android.gms.internal.measurement.L1.v(r7, r6, r1)     // Catch: java.lang.Throwable -> L2b
            if (r7 != r2) goto L75
            return r2
        L75:
            r6 = r5
        L76:
            com.mapbox.bindgen.Expected r7 = (com.mapbox.bindgen.Expected) r7     // Catch: java.lang.Throwable -> L2b
            r6.getClass()     // Catch: java.lang.Throwable -> L2b
            E9.f r1 = new E9.f     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L2b
            E9.f r2 = new E9.f     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r7.fold(r1, r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r7 = "response.fold({\n        …            }\n        },)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch: java.lang.Throwable -> L2b
            com.mapbox.bindgen.Expected r6 = (com.mapbox.bindgen.Expected) r6     // Catch: java.lang.Throwable -> L2b
            return r6
        L92:
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)
            java.lang.Object r6 = kotlin.Result.m40constructorimpl(r6)
            java.lang.Throwable r7 = kotlin.Result.m43exceptionOrNullimpl(r6)
            if (r7 != 0) goto La3
            goto La7
        La3:
            com.mapbox.bindgen.Expected r6 = com.mapbox.bindgen.ExpectedFactory.createError(r7)
        La7:
            java.lang.String r7 = "runCatching {\n          …createError(it)\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.g.K(com.mapbox.api.directions.v5.models.VoiceInstructions, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public String L() {
        if (!F()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f5713d;
        this.f5713d = null;
        return str;
    }

    public void M(E8.d error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Long l9 = (Long) this.f5711b;
        if (l9 != null && ((LinkedHashMap) ((C1059c) this.f5713d).f14846e).remove(l9) == null) {
            return;
        }
        ((O8.e) this.f5712c).a(error);
    }

    public Object N(CharSequence charSequence, int i3, int i10, int i11, boolean z2, n nVar) {
        int i12;
        char c10;
        Y.o oVar = new Y.o((Y.r) ((h) this.f5712c).f19673c);
        int codePointAt = Character.codePointAt(charSequence, i3);
        boolean z10 = true;
        int i13 = 0;
        int i14 = i3;
        loop0: while (true) {
            i12 = i14;
            while (i14 < i10 && i13 < i11 && z10) {
                SparseArray sparseArray = oVar.f8678c.f8691a;
                Y.r rVar = sparseArray == null ? null : (Y.r) sparseArray.get(codePointAt);
                if (oVar.f8676a == 2) {
                    if (rVar != null) {
                        oVar.f8678c = rVar;
                        oVar.f8681f++;
                    } else {
                        if (codePointAt == 65038) {
                            oVar.a();
                        } else if (codePointAt != 65039) {
                            Y.r rVar2 = oVar.f8678c;
                            if (rVar2.f8692b != null) {
                                if (oVar.f8681f != 1) {
                                    oVar.f8679d = rVar2;
                                    oVar.a();
                                } else if (oVar.b()) {
                                    oVar.f8679d = oVar.f8678c;
                                    oVar.a();
                                } else {
                                    oVar.a();
                                }
                                c10 = 3;
                            } else {
                                oVar.a();
                            }
                        }
                        c10 = 1;
                    }
                    c10 = 2;
                } else if (rVar == null) {
                    oVar.a();
                    c10 = 1;
                } else {
                    oVar.f8676a = 2;
                    oVar.f8678c = rVar;
                    oVar.f8681f = 1;
                    c10 = 2;
                }
                oVar.f8680e = codePointAt;
                if (c10 == 1) {
                    i14 = Character.charCount(Character.codePointAt(charSequence, i12)) + i12;
                    if (i14 < i10) {
                        codePointAt = Character.codePointAt(charSequence, i14);
                    }
                } else if (c10 == 2) {
                    int charCount = Character.charCount(codePointAt) + i14;
                    if (charCount < i10) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i14 = charCount;
                } else if (c10 == 3) {
                    if (z2 || !E(charSequence, i12, i14, oVar.f8679d.f8692b)) {
                        z10 = nVar.e(charSequence, i12, i14, oVar.f8679d.f8692b);
                        i13++;
                    }
                }
            }
        }
        if (oVar.f8676a == 2 && oVar.f8678c.f8692b != null && ((oVar.f8681f > 1 || oVar.b()) && i13 < i11 && z10 && (z2 || !E(charSequence, i12, i14, oVar.f8678c.f8692b)))) {
            nVar.e(charSequence, i12, i14, oVar.f8678c.f8692b);
        }
        return nVar.getResult();
    }

    public boolean O(int i3, int i10, int i11, int i12) {
        if (i3 < 0) {
            i3 += i11;
            i10 += 4 - ((i11 + 4) & 7);
        }
        if (i10 < 0) {
            i10 += i12;
            i3 += 4 - ((i12 + 4) & 7);
        }
        if (i3 >= i11) {
            i3 -= i11;
        }
        ((T5.b) this.f5712c).h(i10, i3);
        return ((T5.b) this.f5711b).b(i10, i3);
    }

    public int P(int i3, int i10, int i11, int i12) {
        int i13 = i3 - 2;
        int i14 = i10 - 2;
        int i15 = (O(i13, i14, i11, i12) ? 1 : 0) << 1;
        int i16 = i10 - 1;
        if (O(i13, i16, i11, i12)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        int i18 = i3 - 1;
        if (O(i18, i14, i11, i12)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        if (O(i18, i16, i11, i12)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (O(i18, i10, i11, i12)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (O(i3, i14, i11, i12)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (O(i3, i16, i11, i12)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        return O(i3, i10, i11, i12) ? i23 | 1 : i23;
    }

    public void Q(Object[] objArr) {
        Sc.a aVar = new Sc.a();
        System.currentTimeMillis();
        aVar.f6728a = (Tc.b) this.f5712c;
        Thread.currentThread().getName();
        aVar.f6729b = objArr;
        ((LinkedBlockingQueue) this.f5713d).add(aVar);
    }

    public void R(Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            Q(new Object[]{obj});
        } else {
            Q(new Object[]{obj, obj2});
        }
    }

    public void S(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f5711b).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f5713d) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void T(String str) {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(1121));
        }
        this.f5711b = str;
    }

    @Override // org.slf4j.a
    public void a(String str) {
        Q(null);
    }

    @Override // org.slf4j.a
    public void b(String str, Throwable th) {
        Q(null);
    }

    @Override // org.slf4j.a
    public void c(Object obj, String str) {
        Q(new Object[]{obj});
    }

    @Override // com.mapbox.navigation.base.route.j
    public void d(ArrayList routes, String routerOrigin) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(routerOrigin, "routerOrigin");
        Long l9 = (Long) this.f5711b;
        if (l9 != null && ((LinkedHashMap) ((C1059c) this.f5713d).f14845d).remove(l9) == null) {
            return;
        }
        ((j) this.f5712c).d(routes, routerOrigin);
    }

    @Override // org.slf4j.a
    public void e(String str) {
        Q(null);
    }

    @Override // org.slf4j.a
    public void f() {
        Q(null);
    }

    @Override // com.mapbox.navigation.base.route.j
    public void g(RouteOptions routeOptions, String routerOrigin) {
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        Intrinsics.checkNotNullParameter(routerOrigin, "routerOrigin");
        Long l9 = (Long) this.f5711b;
        if (l9 != null && ((LinkedHashMap) ((C1059c) this.f5713d).f14845d).remove(l9) == null) {
            return;
        }
        ((j) this.f5712c).g(routeOptions, routerOrigin);
    }

    @Override // Pb.a
    public Object get() {
        switch (this.f5710a) {
            case 2:
                return new t(new I4.e(11), new i(), (G3.c) ((s) this.f5711b).get(), (H3.i) ((C1059c) this.f5712c).get(), (H3.j) ((h) this.f5713d).get());
            default:
                return new H3.d((Context) ((F5.c) this.f5711b).f2238b, (I3.d) ((Pb.a) this.f5712c).get(), (H3.b) ((u5.d) this.f5713d).get());
        }
    }

    @Override // org.slf4j.a
    public String getName() {
        return (String) this.f5711b;
    }

    @Override // org.slf4j.a
    public void h(String str, String str2) {
        R(str, str2);
    }

    @Override // vb.InterfaceC1845b
    public void i(Db.c cVar) {
        Cb.n.f((Cb.n) this.f5713d, (Mb.a) this.f5712c, false, true);
    }

    @Override // q4.d
    public void j(q4.j jVar) {
        P3.b bVar = (P3.b) this.f5711b;
        String str = (String) this.f5712c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f5713d;
        synchronized (bVar.f5491a) {
            bVar.f5491a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // org.slf4j.a
    public void k(String str, Boolean bool) {
        R(str, bool);
    }

    @Override // org.slf4j.a
    public void l(Object obj, String str) {
        Q(new Object[]{obj});
    }

    @Override // vb.InterfaceC1845b
    public void m(Hb.b bVar) {
        Ib.a aVar = (Ib.a) bVar;
        Cb.n.f1183d.c(aVar.bootloader, StubApp.getString2(5138));
        if (!StubApp.getString2(5139).equals(aVar.bootloader)) {
            Cb.n.f((Cb.n) this.f5713d, (Mb.a) this.f5712c, false, true);
            return;
        }
        int i3 = Gb.b.f2459e;
        q qVar = new q(this, 3);
        Gb.b bVar2 = (Gb.b) this.f5711b;
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(2268), StubApp.getString2(2774));
        bVar2.b(0, 8, hashMap, 2500L, Ib.a.class, qVar);
    }

    @Override // org.slf4j.a
    public void n(String str) {
        Q(null);
    }

    @Override // org.slf4j.a
    public void o(String str) {
        Q(null);
    }

    @Override // org.slf4j.a
    public void p(Boolean bool, Boolean bool2) {
        R(bool, bool2);
    }

    @Override // com.mapbox.navigation.base.route.j
    public void q(List reasons, RouteOptions routeOptions) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        Long l9 = (Long) this.f5711b;
        if (l9 != null && ((LinkedHashMap) ((C1059c) this.f5713d).f14845d).remove(l9) == null) {
            return;
        }
        ((j) this.f5712c).q(reasons, routeOptions);
    }

    public Object r(a aVar, N2.f fVar) {
        return u0.l((EvDatabase_Impl) this.f5711b, new J9.c(5, this, aVar), fVar);
    }

    @Override // com.mapbox.common.ResourceLoadProgressCallback
    public void run(ResourceLoadProgress progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        g request = (g) this.f5711b;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Iterator it = ((ConcurrentLinkedQueue) this.f5713d).iterator();
        while (it.hasNext()) {
            ((C9.c) it.next()).getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(progress, "progress");
        }
    }

    public void s(char c10) {
        ((StringBuilder) this.f5711b).append((char) (c10 & 255));
    }

    public void t(int i3) {
        A();
        T5.d a3 = T5.d.a(i3);
        if (a3 == null) {
            throw N5.e.a();
        }
        this.f5713d = Charset.forName(a3.name());
    }

    public String toString() {
        switch (this.f5710a) {
            case 17:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f5711b);
                sb2.append('{');
                E0 e02 = (E0) ((E0) this.f5712c).f16038c;
                String str = "";
                while (e02 != null) {
                    E0 e03 = (E0) e02.f16037b;
                    sb2.append(str);
                    if (e03 == null || !E0.class.isArray()) {
                        sb2.append(e03);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{e03});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    e02 = (E0) e02.f16038c;
                    str = StubApp.getString2(81);
                }
                sb2.append('}');
                return sb2.toString();
            case 22:
                A();
                StringBuilder sb3 = (StringBuilder) this.f5712c;
                return sb3 == null ? "" : sb3.toString();
            case 29:
                StringBuilder sb4 = new StringBuilder(StubApp.getString2(5140));
                sb4.append((String) this.f5712c);
                sb4.append(StubApp.getString2(5141));
                FlutterCallbackInformation flutterCallbackInformation = (FlutterCallbackInformation) this.f5713d;
                sb4.append(flutterCallbackInformation.callbackLibraryPath);
                sb4.append(StubApp.getString2(5142));
                return AbstractC1482f.k(sb4, flutterCallbackInformation.callbackName, StubApp.getString2(5143));
            default:
                return super.toString();
        }
    }

    public B3.j u() {
        String string2 = ((String) this.f5711b) == null ? StubApp.getString2(5144) : "";
        if (((y3.d) this.f5713d) == null) {
            string2 = string2.concat(StubApp.getString2(5145));
        }
        if (string2.isEmpty()) {
            return new B3.j((String) this.f5711b, (byte[]) this.f5712c, (y3.d) this.f5713d);
        }
        throw new IllegalStateException(StubApp.getString2(555).concat(string2));
    }

    public void w(long j) {
        if (((LinkedHashSet) this.f5713d).remove(Long.valueOf(j))) {
            ((HttpServiceInterface) ((Lazy) this.f5711b).getValue()).cancelRequest(j, new A1.a(16));
        }
        InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) ((LinkedHashMap) this.f5712c).remove(Long.valueOf(j));
        if (interfaceC0221t0 != null) {
            interfaceC0221t0.d(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Q2.g y(F9.f r18) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.g.y(F9.f):Q2.g");
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i3) {
        this.f5710a = i3;
        this.f5711b = obj;
        this.f5712c = obj2;
        this.f5713d = obj3;
    }

    public g(AudioManager audioManager, r playerAttributes) {
        this.f5710a = 12;
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        Intrinsics.checkNotNullParameter(playerAttributes, "playerAttributes");
        this.f5711b = audioManager;
        this.f5712c = playerAttributes;
        this.f5713d = F9.a.f2331a;
    }

    public g(String url, int i3) {
        this.f5710a = i3;
        switch (i3) {
            case 17:
                E0 e02 = new E0(13, false);
                this.f5712c = e02;
                this.f5713d = e02;
                this.f5711b = url;
                break;
            default:
                Intrinsics.checkNotNullParameter(url, "url");
                this.f5711b = url;
                this.f5712c = ResourceLoadFlags.NONE;
                this.f5713d = NetworkRestriction.NONE;
                break;
        }
    }

    @Override // com.mapbox.common.ResourceLoadResultCallback
    public void run(Expected result) {
        Intrinsics.checkNotNullParameter(result, "result");
        C9.c cVar = (C9.c) this.f5712c;
        g request = (g) this.f5711b;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        cVar.f1152a.invoke(result);
        Iterator it = ((ConcurrentLinkedQueue) this.f5713d).iterator();
        while (it.hasNext()) {
            C9.c cVar2 = (C9.c) it.next();
            cVar2.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(result, "result");
            cVar2.f1152a.invoke(result);
        }
    }

    public g(Z8.f navigator) {
        this.f5710a = 24;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f5711b = navigator;
        this.f5712c = new CopyOnWriteArraySet();
        C0351c nativeNavigatorRecreationObserver = new C0351c(this, 2);
        Intrinsics.checkNotNullParameter(nativeNavigatorRecreationObserver, "nativeNavigatorRecreationObserver");
        navigator.f9061n.add(nativeNavigatorRecreationObserver);
        this.f5713d = new s2.d(this, 21);
    }

    public g(String language, C1590a urlSkuTokenProvider, G9.a options, C9.b resourceLoader) {
        this.f5710a = 11;
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(urlSkuTokenProvider, "urlSkuTokenProvider");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
        this.f5711b = language;
        this.f5712c = urlSkuTokenProvider;
        this.f5713d = resourceLoader;
    }

    public g(Xb.d serialisationDispatcher, F0 mainDispatcher, I8.a httpServiceFactory, SdkInformation sdkInformation, I8.b getCurrentAccessToken, C1590a skuTokenProvider) {
        this.f5710a = 15;
        Intrinsics.checkNotNullParameter(serialisationDispatcher, "serialisationDispatcher");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(httpServiceFactory, "httpServiceFactory");
        Intrinsics.checkNotNullParameter(sdkInformation, "sdkInformation");
        Intrinsics.checkNotNullParameter(getCurrentAccessToken, "getCurrentAccessToken");
        Intrinsics.checkNotNullParameter(skuTokenProvider, "skuTokenProvider");
        this.f5711b = LazyKt.lazy(new m(httpServiceFactory, 3));
        J.a(mainDispatcher.plus(L.b()));
        this.f5712c = new LinkedHashMap();
        this.f5713d = new LinkedHashSet();
    }

    public g(T5.b bVar) {
        int i3;
        int i10;
        this.f5710a = 26;
        int i11 = bVar.f7184b;
        if (i11 >= 8 && i11 <= 144 && (i3 = i11 & 1) == 0) {
            int i12 = bVar.f7183a;
            X5.d[] dVarArr = X5.d.f8416h;
            if (i3 == 0 && (i12 & 1) == 0) {
                X5.d[] dVarArr2 = X5.d.f8416h;
                for (int i13 = 0; i13 < 48; i13++) {
                    X5.d dVar = dVarArr2[i13];
                    int i14 = dVar.f8418b;
                    if (i14 == i11 && (i10 = dVar.f8419c) == i12) {
                        this.f5713d = dVar;
                        if (bVar.f7184b == i14) {
                            int i15 = dVar.f8420d;
                            int i16 = i14 / i15;
                            int i17 = dVar.f8421e;
                            int i18 = i10 / i17;
                            T5.b bVar2 = new T5.b(i18 * i17, i16 * i15);
                            for (int i19 = 0; i19 < i16; i19++) {
                                int i20 = i19 * i15;
                                for (int i21 = 0; i21 < i18; i21++) {
                                    int i22 = i21 * i17;
                                    for (int i23 = 0; i23 < i15; i23++) {
                                        int i24 = ((i15 + 2) * i19) + 1 + i23;
                                        int i25 = i20 + i23;
                                        for (int i26 = 0; i26 < i17; i26++) {
                                            if (bVar.b(((i17 + 2) * i21) + 1 + i26, i24)) {
                                                bVar2.h(i22 + i26, i25);
                                            }
                                        }
                                    }
                                }
                            }
                            this.f5711b = bVar2;
                            this.f5712c = new T5.b(bVar2.f7183a, bVar2.f7184b);
                            return;
                        }
                        throw new IllegalArgumentException(StubApp.getString2(5087));
                    }
                }
                throw N5.e.a();
            }
            throw N5.e.a();
        }
        throw N5.e.a();
    }

    public g(int i3) {
        this.f5710a = 22;
        this.f5713d = StandardCharsets.ISO_8859_1;
        this.f5711b = new StringBuilder(i3);
    }

    public g(EvDatabase_Impl database) {
        this.f5710a = 0;
        this.f5711b = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5712c = new c(database, 0);
        Intrinsics.checkNotNullParameter(database, "database");
        new d(database);
        this.f5713d = new e(database, 0);
    }

    public g(FirebaseMessagingService firebaseMessagingService, s2.d dVar, ExecutorService executorService) {
        this.f5710a = 7;
        this.f5711b = executorService;
        this.f5712c = firebaseMessagingService;
        this.f5713d = dVar;
    }

    public g(int i3, byte b2) {
        this.f5710a = i3;
        switch (i3) {
            case 22:
                this.f5713d = StandardCharsets.ISO_8859_1;
                this.f5711b = new StringBuilder();
                break;
            default:
                k kVar = k.f1774a;
                this.f5711b = new HashSet();
                this.f5712c = kVar;
                break;
        }
    }

    public g(T0.r rVar) {
        this.f5710a = 16;
        this.f5711b = rVar;
    }

    public g(Cb.n nVar, Gb.b bVar, Mb.a aVar) {
        this.f5710a = 6;
        this.f5713d = nVar;
        this.f5711b = bVar;
        this.f5712c = aVar;
    }

    public g(Runnable runnable) {
        this.f5710a = 18;
        this.f5712c = new CopyOnWriteArrayList();
        this.f5713d = new HashMap();
        this.f5711b = runnable;
    }

    public g(g request, C9.c callback, ConcurrentLinkedQueue observers) {
        this.f5710a = 4;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(observers, "observers");
        this.f5711b = request;
        this.f5712c = callback;
        this.f5713d = observers;
    }

    public g(h hVar, u5.d dVar, Y.c cVar, Set set) {
        this.f5710a = 27;
        this.f5711b = dVar;
        this.f5712c = hVar;
        this.f5713d = cVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            N(str, 0, str.length(), 1, true, new q(str, 26));
        }
    }

    public g(Sb.e eVar, Function3 function3, Function3 function32, Sb.d dVar) {
        this.f5710a = 28;
        this.f5711b = eVar;
        this.f5712c = function3;
        this.f5713d = function32;
    }

    public g(V8.q tripSession, Oc.a rerouteController) {
        this.f5710a = 23;
        Intrinsics.checkNotNullParameter(tripSession, "tripSession");
        Intrinsics.checkNotNullParameter(rerouteController, "rerouteController");
        this.f5711b = tripSession;
        this.f5712c = rerouteController;
        TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
        this.f5713d = new C0353e(this);
    }

    public g(C1059c c1059c, Long l9, j callback) {
        this.f5710a = 10;
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f5713d = c1059c;
        this.f5711b = l9;
        this.f5712c = callback;
    }

    public g(C1059c c1059c, Long l9, O8.e callback) {
        this.f5710a = 9;
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f5713d = c1059c;
        this.f5711b = l9;
        this.f5712c = callback;
    }

    public g(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f5710a = 3;
        this.f5712c = arrayDeque;
        this.f5711b = bufferedReader;
    }
}
