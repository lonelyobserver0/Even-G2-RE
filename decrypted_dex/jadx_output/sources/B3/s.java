package B3;

import H5.C0069b;
import H5.C0079l;
import H5.V;
import Qb.L;
import Tb.K;
import Tb.b0;
import V8.C0351c;
import Xa.AbstractActivityC0364d;
import a.AbstractC0378a;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.stub.StubApp;
import d0.C0765C;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import f4.C0879c;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p0.AbstractC1482f;
import q0.C1503a;
import q0.C1504b;
import r0.AbstractC1560u;
import sb.C1637b;
import sb.C1643e;
import sb.C1647g;
import sb.C1673t;
import w1.C1858a;
import wc.AbstractC1879D;
import wc.z;
import x5.InterfaceC1913d;
import y3.C1968a;
import y3.C1969b;
import y3.C1970c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s implements D3.b, K5.b, q1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f649a;

    /* renamed from: b, reason: collision with root package name */
    public Object f650b;

    /* renamed from: c, reason: collision with root package name */
    public Object f651c;

    /* renamed from: d, reason: collision with root package name */
    public Object f652d;

    /* renamed from: e, reason: collision with root package name */
    public Object f653e;

    /* renamed from: f, reason: collision with root package name */
    public Object f654f;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.f649a = i3;
        this.f651c = obj;
        this.f650b = obj2;
        this.f652d = obj3;
        this.f653e = obj4;
        this.f654f = obj5;
    }

    public static final void a(s sVar, Function2 function2) {
        L.j(((D9.f) sVar.f650b).f1513b, null, new W8.f(sVar, function2, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d1, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "nativeAlternative");
        r9.add(com.google.android.gms.internal.measurement.L1.x(r1, r3));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(B3.s r7, java.util.List r8, int r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.s.b(B3.s, java.util.List, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static s h(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        s sVar = new s(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) sVar.f653e)) {
            try {
                ((ArrayDeque) sVar.f653e).clear();
                String string = ((SharedPreferences) sVar.f651c).getString((String) sVar.f650b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) sVar.f652d)) {
                    String[] split = string.split((String) sVar.f652d, -1);
                    if (split.length == 0) {
                        Log.e(StubApp.getString2("493"), StubApp.getString2("600"));
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) sVar.f653e).add(str);
                        }
                    }
                    return sVar;
                }
                return sVar;
            } finally {
            }
        }
    }

    public static String j(String str) {
        boolean contains$default;
        if (str != null) {
            String string2 = StubApp.getString2(601);
            contains$default = StringsKt__StringsKt.contains$default(str, (CharSequence) string2, false, 2, (Object) null);
            if (contains$default) {
                String substring = str.substring(0, StringsKt.x(str, string2));
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                return substring;
            }
        }
        return StubApp.getString2(602);
    }

    public static void m(Throwable th) {
        Log.e(StubApp.getString2(605), th.getClass().getSimpleName() + StubApp.getString2(603) + th.getMessage() + StubApp.getString2(604) + Log.getStackTraceString(th));
    }

    public z c() {
        Map unmodifiableMap;
        wc.t tVar = (wc.t) this.f651c;
        if (tVar == null) {
            throw new IllegalStateException(StubApp.getString2(606));
        }
        String str = (String) this.f650b;
        wc.s q10 = ((C0879c) this.f652d).q();
        AbstractC1879D abstractC1879D = (AbstractC1879D) this.f653e;
        Map map = (Map) this.f654f;
        byte[] bArr = xc.b.f23179a;
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            unmodifiableMap = MapsKt.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
            Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new z(tVar, str, q10, abstractC1879D, unmodifiableMap);
    }

    @Override // q1.d
    public int d(long j) {
        long[] jArr = (long[]) this.f650b;
        int a3 = AbstractC1560u.a(jArr, j, false);
        if (a3 < jArr.length) {
            return a3;
        }
        return -1;
    }

    @Override // q1.d
    public long e(int i3) {
        return ((long[]) this.f650b)[i3];
    }

    @Override // q1.d
    public List f(long j) {
        w1.c cVar = (w1.c) this.f651c;
        ArrayList arrayList = new ArrayList();
        cVar.g(j, cVar.f22060h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j, false, cVar.f22060h, treeMap);
        HashMap hashMap = (HashMap) this.f653e;
        cVar.h(j, (Map) this.f652d, hashMap, cVar.f22060h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((HashMap) this.f654f).get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                w1.f fVar = (w1.f) hashMap.get(pair.first);
                fVar.getClass();
                arrayList2.add(new C1504b(null, null, null, decodeByteArray, fVar.f22078c, 0, fVar.f22080e, fVar.f22077b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f22081f, fVar.f22082g, false, -16777216, fVar.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            w1.f fVar2 = (w1.f) hashMap.get(entry.getKey());
            fVar2.getClass();
            C1503a c1503a = (C1503a) entry.getValue();
            CharSequence charSequence = c1503a.f19809a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C1858a c1858a : (C1858a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C1858a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c1858a), spannableStringBuilder.getSpanEnd(c1858a), (CharSequence) "");
            }
            for (int i3 = 0; i3 < spannableStringBuilder.length(); i3++) {
                if (spannableStringBuilder.charAt(i3) == ' ') {
                    int i10 = i3 + 1;
                    int i11 = i10;
                    while (i11 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i11) == ' ') {
                        i11++;
                    }
                    int i12 = i11 - i10;
                    if (i12 > 0) {
                        spannableStringBuilder.delete(i3, i12 + i3);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
                if (spannableStringBuilder.charAt(i13) == '\n') {
                    int i14 = i13 + 1;
                    if (spannableStringBuilder.charAt(i14) == ' ') {
                        spannableStringBuilder.delete(i14, i13 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    int i16 = i15 + 1;
                    if (spannableStringBuilder.charAt(i16) == '\n') {
                        spannableStringBuilder.delete(i15, i16);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c1503a.f19813e = fVar2.f22078c;
            c1503a.f19814f = fVar2.f22079d;
            c1503a.f19815g = fVar2.f22080e;
            c1503a.f19816h = fVar2.f22077b;
            c1503a.f19819l = fVar2.f22081f;
            c1503a.f19818k = fVar2.f22084i;
            c1503a.j = fVar2.f22083h;
            c1503a.f19823p = fVar2.j;
            arrayList2.add(c1503a.a());
        }
        return arrayList2;
    }

    @Override // q1.d
    public int g() {
        return ((long[]) this.f650b).length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45, types: [J5.a] */
    @Override // Pb.a
    public Object get() {
        switch (this.f649a) {
            case 2:
                return new G3.b((Executor) ((Pb.a) this.f651c).get(), (C3.e) ((Pb.a) this.f650b).get(), (H3.d) ((Q2.g) this.f652d).get(), (I3.d) ((Pb.a) this.f653e).get(), (J3.c) ((Pb.a) this.f654f).get());
            case 3:
                return new V((R4.h) ((K5.c) this.f651c).f3721a, (InterfaceC1913d) ((K5.c) this.f650b).f3721a, (L5.j) ((Pb.a) this.f652d).get(), (C0079l) ((Pb.a) this.f653e).get(), (CoroutineContext) ((K5.c) this.f654f).f3721a);
            default:
                CoroutineContext coroutineContext = (CoroutineContext) ((K5.c) this.f651c).f3721a;
                InterfaceC1913d interfaceC1913d = (InterfaceC1913d) ((K5.c) this.f650b).f3721a;
                C0069b c0069b = (C0069b) ((Pb.a) this.f652d).get();
                L5.g gVar = (L5.g) ((Pb.a) this.f653e).get();
                Pb.a aVar = (Pb.a) this.f654f;
                return new L5.e(coroutineContext, interfaceC1913d, c0069b, gVar, aVar instanceof J5.a ? (J5.a) aVar : new K5.a(aVar));
        }
    }

    public MessageCodec i() {
        if (((C1647g) this.f652d) == null) {
            this.f652d = new C1647g(this);
        }
        C1647g c1647g = (C1647g) this.f652d;
        Intrinsics.checkNotNull(c1647g);
        return c1647g;
    }

    public File k() {
        Context context = (AbstractActivityC0364d) this.f650b;
        if (context != null) {
            Intrinsics.checkNotNull(context);
        } else {
            context = (Context) this.f651c;
        }
        return new File(context.getCacheDir(), StubApp.getString2(607));
    }

    public void l(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C0879c c0879c = (C0879c) this.f652d;
        c0879c.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        android.support.v4.media.session.b.f(name);
        android.support.v4.media.session.b.g(value, name);
        c0879c.u(name);
        c0879c.k(name, value);
    }

    public void n(String method, AbstractC1879D abstractC1879D) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException(StubApp.getString2(611));
        }
        String string2 = StubApp.getString2(608);
        if (abstractC1879D == null) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "REPORT")) {
                throw new IllegalArgumentException(E1.a.k(string2, method, StubApp.getString2(609)).toString());
            }
        } else if (!AbstractC0378a.u(method)) {
            throw new IllegalArgumentException(E1.a.k(string2, method, StubApp.getString2(610)).toString());
        }
        Intrinsics.checkNotNullParameter(method, "<set-?>");
        this.f650b = method;
        this.f653e = abstractC1879D;
    }

    public void o(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ((C0879c) this.f652d).u(name);
    }

    public void p(Runnable runnable) {
        Context context = (Context) this.f653e;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public void q(C1968a c1968a, y3.g gVar) {
        j jVar = (j) this.f651c;
        String str = (String) this.f650b;
        y3.e eVar = (y3.e) this.f653e;
        if (eVar == null) {
            throw new NullPointerException(StubApp.getString2(612));
        }
        C1970c c1970c = (C1970c) this.f652d;
        t tVar = (t) this.f654f;
        j b2 = jVar.b(c1968a.f23502b);
        h hVar = new h();
        hVar.f617h = new HashMap();
        hVar.f615f = Long.valueOf(tVar.f656a.f());
        hVar.f616g = Long.valueOf(tVar.f657b.f());
        hVar.f610a = str;
        hVar.f614e = new m(c1970c, (byte[]) eVar.apply(c1968a.f23501a));
        hVar.f612c = null;
        C1969b c1969b = c1968a.f23503c;
        if (c1969b != null) {
            hVar.f613d = c1969b.f23504a;
        }
        i c10 = hVar.c();
        G3.b bVar = (G3.b) tVar.f658c;
        bVar.getClass();
        bVar.f2384b.execute(new G3.a(0, bVar, b2, gVar, c10));
    }

    public void r(Object obj, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((Map) this.f651c).put(key, obj);
        K k3 = (K) ((LinkedHashMap) this.f652d).get(key);
        if (k3 != null) {
            ((b0) k3).g(obj);
        }
        K k4 = (K) ((LinkedHashMap) this.f653e).get(key);
        if (k4 != null) {
            ((b0) k4).g(obj);
        }
    }

    public void s(L8.f fVar) {
        if (Intrinsics.areEqual(fVar, (L8.f) this.f653e)) {
            return;
        }
        this.f653e = fVar;
        Iterator it = ((CopyOnWriteArrayList) this.f654f).iterator();
        while (it.hasNext()) {
            ((m8.t) it.next()).b(fVar);
        }
    }

    public void t(Map arguments) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList<? extends Parcelable> arrayList3;
        String str;
        MethodChannel.Result result;
        boolean z2;
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        File k3 = k();
        File[] listFiles = k3.listFiles();
        if (k3.exists() && listFiles != null && listFiles.length != 0) {
            for (File file : listFiles) {
                file.delete();
            }
            k3.delete();
        }
        String str2 = (String) arguments.get(StubApp.getString2(613));
        String str3 = (String) arguments.get(StubApp.getString2(614));
        String str4 = (String) arguments.get(StubApp.getString2(615));
        String str5 = (String) arguments.get(StubApp.getString2(616));
        List list = (List) arguments.get(StubApp.getString2(617));
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List list2 = (List) arguments.get(StubApp.getString2(618));
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof String) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        Context context = (Context) this.f651c;
        if (arrayList != null) {
            arrayList3 = new ArrayList<>(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file2 = new File((String) it.next());
                try {
                    String canonicalPath = file2.getCanonicalPath();
                    Intrinsics.checkNotNull(canonicalPath);
                    String canonicalPath2 = k().getCanonicalPath();
                    Intrinsics.checkNotNullExpressionValue(canonicalPath2, "getCanonicalPath(...)");
                    z2 = StringsKt.O(canonicalPath, canonicalPath2);
                } catch (IOException unused) {
                    z2 = false;
                }
                if (z2) {
                    throw new IOException(E1.a.k(StubApp.getString2(619), k().getCanonicalPath(), StubApp.getString2(620)));
                }
                File k4 = k();
                if (!k4.exists()) {
                    k4.mkdirs();
                }
                File file3 = new File(k4, file2.getName());
                FilesKt__UtilsKt.copyTo$default(file2, file3, true, 0, 4, null);
                Context context2 = (AbstractActivityC0364d) this.f650b;
                if (context2 != null) {
                    Intrinsics.checkNotNull(context2);
                } else {
                    context2 = context;
                }
                arrayList3.add(D.c.d(context2, (String) ((Lazy) this.f653e).getValue(), file3));
            }
        } else {
            arrayList3 = null;
        }
        Intent intent = new Intent();
        String string2 = StubApp.getString2(621);
        String string22 = StubApp.getString2(622);
        String string23 = StubApp.getString2(623);
        String string24 = StubApp.getString2(624);
        if (arrayList3 == null) {
            intent.setAction(string24);
            intent.setType(StubApp.getString2(625));
            if (str3 != null) {
                str2 = str3;
            }
            intent.putExtra(string23, str2);
            if (!(str4 == null || StringsKt.isBlank(str4))) {
                intent.putExtra(string22, str4);
            }
            if (!(str5 == null || StringsKt.isBlank(str5))) {
                intent.putExtra(string2, str5);
            }
        } else {
            if (arrayList3.isEmpty()) {
                throw new IOException(StubApp.getString2(631));
            }
            int size = arrayList3.size();
            String string25 = StubApp.getString2(626);
            String string26 = StubApp.getString2(627);
            if (size == 1) {
                if (!(arrayList2 == null || arrayList2.isEmpty())) {
                    string26 = (String) CollectionsKt.first((List) arrayList2);
                }
                intent.setAction(string24);
                intent.setType(string26);
                intent.putExtra(string25, (Parcelable) CollectionsKt.first((List) arrayList3));
            } else {
                intent.setAction(StubApp.getString2(628));
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    if (arrayList2.size() == 1) {
                        string26 = (String) CollectionsKt.first((List) arrayList2);
                    } else {
                        str = (String) CollectionsKt.first((List) arrayList2);
                        int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                        if (1 <= lastIndex) {
                            int i3 = 1;
                            while (true) {
                                if (!Intrinsics.areEqual(str, arrayList2.get(i3))) {
                                    if (!Intrinsics.areEqual(j(str), j((String) arrayList2.get(i3)))) {
                                        break;
                                    } else {
                                        str = AbstractC1482f.g(j((String) arrayList2.get(i3)), StubApp.getString2(629));
                                    }
                                }
                                if (i3 == lastIndex) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        intent.setType(str);
                        intent.putParcelableArrayListExtra(string25, arrayList3);
                    }
                }
                str = string26;
                intent.setType(str);
                intent.putParcelableArrayListExtra(string25, arrayList3);
            }
            if (!(str2 == null || StringsKt.isBlank(str2))) {
                intent.putExtra(string23, str2);
            }
            if (!(str4 == null || StringsKt.isBlank(str4))) {
                intent.putExtra(string22, str4);
            }
            if (!(str5 == null || StringsKt.isBlank(str5))) {
                intent.putExtra(string2, str5);
            }
            intent.addFlags(1);
        }
        Intent createChooser = Intent.createChooser(intent, str5, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SharePlusPendingIntent.class), ((Number) ((Lazy) this.f654f).getValue()).intValue() | 134217728).getIntentSender());
        if (arrayList3 != null) {
            Context context3 = (AbstractActivityC0364d) this.f650b;
            if (context3 != null) {
                Intrinsics.checkNotNull(context3);
            } else {
                context3 = context;
            }
            List<ResolveInfo> queryIntentActivities = context3.getPackageManager().queryIntentActivities(createChooser, PKIFailureInfo.notAuthorized);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
            Iterator<T> it2 = queryIntentActivities.iterator();
            while (it2.hasNext()) {
                String str6 = ((ResolveInfo) it2.next()).activityInfo.packageName;
                Iterator<T> it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Uri uri = (Uri) it3.next();
                    Context context4 = (AbstractActivityC0364d) this.f650b;
                    if (context4 != null) {
                        Intrinsics.checkNotNull(context4);
                    } else {
                        context4 = context;
                    }
                    context4.grantUriPermission(str6, uri, 3);
                }
            }
        }
        Intrinsics.checkNotNull(createChooser);
        AbstractActivityC0364d abstractActivityC0364d = (AbstractActivityC0364d) this.f650b;
        if (abstractActivityC0364d != null) {
            Intrinsics.checkNotNull(abstractActivityC0364d);
            abstractActivityC0364d.startActivityForResult(createChooser, 22643);
            return;
        }
        createChooser.addFlags(268435456);
        Sa.c cVar = (Sa.c) this.f652d;
        if (cVar.f6676b.compareAndSet(false, true) && (result = cVar.f6675a) != null) {
            Intrinsics.checkNotNull(result);
            result.success(StubApp.getString2(630));
            cVar.f6675a = null;
        }
        context.startActivity(createChooser);
    }

    public void u(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        boolean L10 = StringsKt.L(url, StubApp.getString2(632));
        String string2 = StubApp.getString2(633);
        if (L10) {
            String substring = url.substring(3);
            Intrinsics.checkNotNullExpressionValue(substring, string2);
            url = Intrinsics.stringPlus("http:", substring);
        } else if (StringsKt.L(url, StubApp.getString2(634))) {
            String substring2 = url.substring(4);
            Intrinsics.checkNotNullExpressionValue(substring2, string2);
            url = Intrinsics.stringPlus("https:", substring2);
        }
        Intrinsics.checkNotNullParameter(url, "<this>");
        Ac.t tVar = new Ac.t();
        tVar.e(null, url);
        wc.t url2 = tVar.a();
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f651c = url2;
    }

    public /* synthetic */ s(boolean z2) {
        this.f649a = 14;
    }

    public s(u5.d routesDataParser, Vb.f scope) {
        this.f649a = 5;
        Intrinsics.checkNotNullParameter(routesDataParser, "routesDataParser");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f651c = routesDataParser;
        this.f650b = scope;
        this.f652d = Zb.f.a();
        this.f654f = new CopyOnWriteArrayList();
    }

    public s(Z8.f navigator, D9.h threadController) {
        this.f649a = 7;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(threadController, "threadController");
        this.f651c = navigator;
        this.f650b = threadController.a();
        this.f652d = new CopyOnWriteArraySet();
        this.f653e = new A0.c(this);
        this.f654f = new Z9.q(this, 24);
        C0351c nativeNavigatorRecreationObserver = new C0351c(this, 1);
        Intrinsics.checkNotNullParameter(nativeNavigatorRecreationObserver, "nativeNavigatorRecreationObserver");
        navigator.f9061n.add(nativeNavigatorRecreationObserver);
    }

    public s(Context context, Sa.c manager) {
        this.f649a = 6;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f651c = context;
        this.f650b = null;
        this.f652d = manager;
        this.f653e = LazyKt.lazy(new J2.d(this, 2));
        this.f654f = LazyKt.lazy(new J2.b(1));
    }

    public s(BinaryMessenger binaryMessenger, Context context, C1673t c1673t) {
        this.f649a = 11;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        this.f651c = binaryMessenger;
        C0879c finalizationListener = new C0879c(new C1643e(binaryMessenger));
        Intrinsics.checkNotNullParameter(finalizationListener, "finalizationListener");
        this.f650b = new C1637b(finalizationListener);
        this.f653e = context;
        this.f654f = c1673t;
    }

    public s(Map initialState) {
        this.f649a = 9;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f651c = MapsKt.toMutableMap(initialState);
        this.f650b = new LinkedHashMap();
        this.f652d = new LinkedHashMap();
        this.f653e = new LinkedHashMap();
        this.f654f = new C0765C(this, 1);
    }

    public s(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider) {
        this.f649a = 8;
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f651c = class2ContextualFactory;
        this.f650b = polyBase2Serializers;
        this.f652d = polyBase2DefaultSerializerProvider;
        this.f653e = polyBase2NamedSerializers;
        this.f654f = polyBase2DefaultDeserializerProvider;
    }

    public s(w1.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f649a = 13;
        this.f651c = cVar;
        this.f653e = hashMap2;
        this.f654f = hashMap3;
        this.f652d = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i3 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i3] = ((Long) it.next()).longValue();
            i3++;
        }
        this.f650b = jArr;
    }

    public s(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f649a = 1;
        this.f653e = new ArrayDeque();
        this.f651c = sharedPreferences;
        this.f650b = StubApp.getString2(596);
        this.f652d = StubApp.getString2(321);
        this.f654f = scheduledThreadPoolExecutor;
    }

    public s(int i3) {
        this.f649a = i3;
        switch (i3) {
            case 14:
                this.f654f = new LinkedHashMap();
                this.f650b = StubApp.getString2(595);
                this.f652d = new C0879c(22);
                break;
        }
    }
}
