package B6;

import V8.v;
import Z9.C0366a;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImplApi26;
import b3.C0517s;
import com.google.android.gms.internal.measurement.L1;
import com.mapbox.common.BillingService;
import com.mapbox.common.BillingServiceError;
import com.mapbox.common.BillingServiceErrorCode;
import com.mapbox.common.BillingServiceFactory;
import com.mapbox.common.BillingSessionStatus;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.SdkInformation;
import com.mapbox.common.SessionSKUIdentifier;
import com.stub.StubApp;
import i2.u;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.AbstractC1264c;
import m0.C1263b;
import n8.C1394a;
import o8.C1464a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f667a;

    /* renamed from: b, reason: collision with root package name */
    public Object f668b;

    /* renamed from: c, reason: collision with root package name */
    public Object f669c;

    /* renamed from: d, reason: collision with root package name */
    public Object f670d;

    /* renamed from: e, reason: collision with root package name */
    public Object f671e;

    /* renamed from: f, reason: collision with root package name */
    public Object f672f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f673g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f674h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, Y.m mVar) {
        this.f668b = str;
        this.f669c = str2;
        this.f667a = arrayList;
        this.f670d = str3;
        this.f671e = str4;
        this.f672f = str5;
        this.f673g = str6;
        this.f674h = mVar;
    }

    public static ArrayList h(com.mapbox.navigation.base.route.g gVar, Function1 function1) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        ArrayList arrayList = gVar.f12508l;
        List drop = CollectionsKt.drop(arrayList, ((Number) function1.invoke(arrayList)).intValue());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : drop) {
            F7.k kVar = (F7.k) obj;
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            if (kVar.f2319d != F7.j.f2313c) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.f(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((F7.k) it.next()).f2316a);
        }
        return arrayList3;
    }

    public static void k(BillingServiceError billingServiceError) {
        BillingServiceErrorCode code = billingServiceError.getCode();
        int i3 = code == null ? -1 : n8.c.f17881a[code.ordinal()];
        if (i3 == -1) {
            throw new IllegalArgumentException(billingServiceError.toString());
        }
        if (i3 == 1 || i3 == 2) {
            String billingServiceError2 = billingServiceError.toString();
            Intrinsics.checkNotNullExpressionValue(billingServiceError2, "error.toString()");
            D9.l.h(billingServiceError2, StubApp.getString2(644));
        }
    }

    public static Boolean m() {
        boolean isHapticPlaybackSupported;
        isHapticPlaybackSupported = AudioManager.isHapticPlaybackSupported();
        return Boolean.valueOf(isHapticPlaybackSupported);
    }

    public boolean a() {
        Context context;
        Context context2 = (Context) this.f671e;
        if (context2 == null) {
            return false;
        }
        if (((Q9.d) this.f669c) != null) {
            Intrinsics.checkNotNull(context2);
            context2.unregisterReceiver((Q9.d) this.f669c);
            this.f669c = null;
        }
        if (((Q9.d) this.f670d) != null && (context = (Context) this.f671e) != null) {
            Intrinsics.checkNotNull(context);
            context.unregisterReceiver((Q9.d) this.f670d);
            this.f670d = null;
        }
        if (((C1263b) this.f668b) != null) {
            AudioManager audioManager = (AudioManager) this.f672f;
            Intrinsics.checkNotNull(audioManager);
            C1263b c1263b = (C1263b) this.f668b;
            Intrinsics.checkNotNull(c1263b);
            if (audioManager == null) {
                throw new IllegalArgumentException(StubApp.getString2(646));
            }
            if (c1263b == null) {
                throw new IllegalArgumentException(StubApp.getString2(645));
            }
            int a3 = AbstractC1264c.a(audioManager, c1263b.f17004f);
            this.f668b = null;
            if (a3 != 1) {
                return false;
            }
        }
        return true;
    }

    public void b(SessionSKUIdentifier sessionSKUIdentifier, long j, String str) {
        SessionSKUIdentifier i3 = i();
        String string2 = StubApp.getString2(647);
        C0366a c0366a = (C0366a) this.f672f;
        if (i3 != null) {
            ((BillingService) c0366a.f9105b).stopBillingSession(i3);
            if (D9.l.a(D9.l.g(), LoggingLevel.INFO)) {
                D9.l.f(L1.h(i3) + StubApp.getString2(648) + str, string2);
            }
        }
        ((BillingService) c0366a.f9105b).beginBillingSession((SdkInformation) this.f671e, sessionSKUIdentifier, new C1394a(this, 0), j);
        if (D9.l.a(D9.l.g(), LoggingLevel.INFO)) {
            D9.l.f(L1.h(sessionSKUIdentifier) + StubApp.getString2(649) + str, string2);
        }
    }

    public void c(Map rawKeyEvent) {
        Intrinsics.checkNotNullParameter(rawKeyEvent, "rawKeyEvent");
        Long l9 = W.a.l(rawKeyEvent.get(StubApp.getString2(650)));
        Intrinsics.checkNotNull(l9);
        long longValue = l9.longValue();
        Long l10 = W.a.l(rawKeyEvent.get(StubApp.getString2(651)));
        Intrinsics.checkNotNull(l10);
        long longValue2 = l10.longValue();
        Object obj = rawKeyEvent.get(StubApp.getString2(652));
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        Object obj2 = rawKeyEvent.get(StubApp.getString2(653));
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((Integer) obj2).intValue();
        Object obj3 = rawKeyEvent.get(StubApp.getString2(654));
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
        int intValue3 = ((Integer) obj3).intValue();
        Object obj4 = rawKeyEvent.get(StubApp.getString2(655));
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
        int intValue4 = ((Integer) obj4).intValue();
        Object obj5 = rawKeyEvent.get(StubApp.getString2(656));
        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
        int intValue5 = ((Integer) obj5).intValue();
        Object obj6 = rawKeyEvent.get(StubApp.getString2(657));
        Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
        int intValue6 = ((Integer) obj6).intValue();
        Object obj7 = rawKeyEvent.get(StubApp.getString2(658));
        Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Int");
        int intValue7 = ((Integer) obj7).intValue();
        Object obj8 = rawKeyEvent.get(StubApp.getString2(376));
        Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Int");
        KeyEvent keyEvent = new KeyEvent(longValue, longValue2, intValue, intValue2, intValue3, intValue4, intValue5, intValue6, intValue7, ((Integer) obj8).intValue());
        AudioManager audioManager = (AudioManager) this.f672f;
        Intrinsics.checkNotNull(audioManager);
        audioManager.dispatchMediaKeyEvent(keyEvent);
    }

    public ArrayList d() {
        List<AudioDeviceInfo> availableCommunicationDevices;
        AudioManager audioManager = (AudioManager) this.f672f;
        Intrinsics.checkNotNull(audioManager);
        availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
        Intrinsics.checkNotNullExpressionValue(availableCommunicationDevices, "getAvailableCommunicationDevices(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.f(availableCommunicationDevices));
        for (AudioDeviceInfo audioDeviceInfo : availableCommunicationDevices) {
            Intrinsics.checkNotNull(audioDeviceInfo);
            arrayList.add(W.a.i(audioDeviceInfo));
        }
        return arrayList;
    }

    public Map e() {
        AudioDeviceInfo communicationDevice;
        AudioManager audioManager = (AudioManager) this.f672f;
        Intrinsics.checkNotNull(audioManager);
        communicationDevice = audioManager.getCommunicationDevice();
        if (communicationDevice == null) {
            return null;
        }
        return W.a.i(communicationDevice);
    }

    public ArrayList f(int i3) {
        ArrayList arrayList = new ArrayList();
        AudioManager audioManager = (AudioManager) this.f672f;
        Intrinsics.checkNotNull(audioManager);
        AudioDeviceInfo[] devices = audioManager.getDevices(i3);
        Intrinsics.checkNotNullExpressionValue(devices, "getDevices(...)");
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            arrayList.add(W.a.i(audioDeviceInfo));
        }
        return arrayList;
    }

    public ArrayList g() {
        ArrayList arrayList = new ArrayList();
        AudioManager audioManager = (AudioManager) this.f672f;
        Intrinsics.checkNotNull(audioManager);
        List<MicrophoneInfo> microphones = audioManager.getMicrophones();
        Intrinsics.checkNotNullExpressionValue(microphones, "getMicrophones(...)");
        for (MicrophoneInfo microphoneInfo : microphones) {
            List<Pair<Float, Float>> frequencyResponse = microphoneInfo.getFrequencyResponse();
            Intrinsics.checkNotNullExpressionValue(frequencyResponse, "getFrequencyResponse(...)");
            ArrayList arrayList2 = new ArrayList(CollectionsKt.f(frequencyResponse));
            Iterator<T> it = frequencyResponse.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList2.add(CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(((Number) pair.first).floatValue()), Double.valueOf(((Number) pair.second).floatValue())}));
            }
            List<Pair<Integer, Integer>> channelMapping = microphoneInfo.getChannelMapping();
            Intrinsics.checkNotNullExpressionValue(channelMapping, "getChannelMapping(...)");
            ArrayList arrayList3 = new ArrayList(CollectionsKt.f(channelMapping));
            Iterator<T> it2 = channelMapping.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                arrayList3.add(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(((Number) pair2.first).intValue()), Integer.valueOf(((Number) pair2.second).intValue())}));
            }
            kotlin.Pair pair3 = TuplesKt.to(StubApp.getString2(659), microphoneInfo.getDescription());
            kotlin.Pair pair4 = TuplesKt.to(StubApp.getString2(290), Integer.valueOf(microphoneInfo.getId()));
            kotlin.Pair pair5 = TuplesKt.to(StubApp.getString2(660), Integer.valueOf(microphoneInfo.getType()));
            kotlin.Pair pair6 = TuplesKt.to(StubApp.getString2(661), microphoneInfo.getAddress());
            kotlin.Pair pair7 = TuplesKt.to(StubApp.getString2(662), Integer.valueOf(microphoneInfo.getLocation()));
            kotlin.Pair pair8 = TuplesKt.to(StubApp.getString2(663), Integer.valueOf(microphoneInfo.getGroup()));
            kotlin.Pair pair9 = TuplesKt.to(StubApp.getString2(664), Integer.valueOf(microphoneInfo.getIndexInTheGroup()));
            MicrophoneInfo.Coordinate3F position = microphoneInfo.getPosition();
            Intrinsics.checkNotNullExpressionValue(position, "getPosition(...)");
            kotlin.Pair pair10 = TuplesKt.to(StubApp.getString2(665), W.a.c(position));
            MicrophoneInfo.Coordinate3F orientation = microphoneInfo.getOrientation();
            Intrinsics.checkNotNullExpressionValue(orientation, "getOrientation(...)");
            arrayList.add(MapsKt.mapOf(pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, TuplesKt.to(StubApp.getString2(666), W.a.c(orientation)), TuplesKt.to(StubApp.getString2(667), arrayList2), TuplesKt.to(StubApp.getString2(668), arrayList3), TuplesKt.to(StubApp.getString2(669), Float.valueOf(microphoneInfo.getSensitivity())), TuplesKt.to(StubApp.getString2(670), Float.valueOf(microphoneInfo.getMaxSpl())), TuplesKt.to(StubApp.getString2(671), Float.valueOf(microphoneInfo.getMinSpl())), TuplesKt.to(StubApp.getString2(672), Integer.valueOf(microphoneInfo.getDirectionality()))));
        }
        return arrayList;
    }

    public SessionSKUIdentifier i() {
        List<SessionSKUIdentifier> listOf = CollectionsKt.listOf((Object[]) new SessionSKUIdentifier[]{SessionSKUIdentifier.NAV3_SES_CORE_AGTRIP, SessionSKUIdentifier.NAV3_SES_CORE_FDTRIP});
        ArrayList arrayList = new ArrayList(CollectionsKt.f(listOf));
        for (SessionSKUIdentifier sessionSKUIdentifier : listOf) {
            BillingSessionStatus sessionStatus = ((BillingService) ((C0366a) this.f672f).f9105b).getSessionStatus(sessionSKUIdentifier);
            Intrinsics.checkNotNullExpressionValue(sessionStatus, "billingService.getSessionStatus(skuIdentifier)");
            arrayList.add(new n8.d(sessionSKUIdentifier, sessionStatus));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((n8.d) next).f17883b != BillingSessionStatus.NO_SESSION) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() > 1) {
            throw new IllegalStateException((StubApp.getString2(673) + arrayList).toString());
        }
        n8.d dVar = (n8.d) CollectionsKt.firstOrNull((List) arrayList2);
        if (dVar != null) {
            return dVar.f17882a;
        }
        return null;
    }

    public Integer j(int i3) {
        AudioManager audioManager = (AudioManager) this.f672f;
        Intrinsics.checkNotNull(audioManager);
        return Integer.valueOf(audioManager.getStreamMaxVolume(i3));
    }

    public void l(String method, Object... args) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        Iterator it = ((ArrayList) this.f667a).iterator();
        while (it.hasNext()) {
            Q9.a aVar = (Q9.a) it.next();
            List mutableList = ArraysKt.toMutableList(args);
            MethodChannel methodChannel = aVar.f5774b;
            Intrinsics.checkNotNull(methodChannel);
            methodChannel.invokeMethod(method, mutableList);
        }
    }

    public Boolean n() {
        AudioManager audioManager = (AudioManager) this.f672f;
        Intrinsics.checkNotNull(audioManager);
        return Boolean.valueOf(audioManager.isMicrophoneMute());
    }

    public Boolean o() {
        AudioManager audioManager = (AudioManager) this.f672f;
        Intrinsics.checkNotNull(audioManager);
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    public boolean p(List args) {
        boolean z2;
        int i3 = 0;
        Intrinsics.checkNotNullParameter(args, "args");
        if (((C1263b) this.f668b) != null) {
            return true;
        }
        Object obj = args.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Map map = (Map) obj;
        Object obj2 = map.get(StubApp.getString2(674));
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        AudioAttributesCompat audioAttributesCompat = C1263b.f16998g;
        if (intValue != 1 && intValue != 2 && intValue != 3 && intValue != 4) {
            throw new IllegalArgumentException(u.p(intValue, StubApp.getString2(675)));
        }
        Q9.b bVar = new Q9.b(this, i3);
        Handler handler = new Handler(Looper.getMainLooper());
        String string2 = StubApp.getString2(676);
        if (map.get(string2) != null) {
            Map attributes = (Map) map.get(string2);
            Intrinsics.checkNotNull(attributes);
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            int i10 = AudioAttributesCompat.f9951b;
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            String string22 = StubApp.getString2(677);
            if (attributes.get(string22) != null) {
                Object obj3 = attributes.get(string22);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                builder.setContentType(((Integer) obj3).intValue());
            }
            String string23 = StubApp.getString2(658);
            if (attributes.get(string23) != null) {
                Object obj4 = attributes.get(string23);
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                builder.setFlags(((Integer) obj4).intValue());
            }
            String string24 = StubApp.getString2(678);
            if (attributes.get(string24) != null) {
                Object obj5 = attributes.get(string24);
                Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
                builder.setUsage(((Integer) obj5).intValue());
            }
            AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26(builder.build());
            audioAttributesCompat = new AudioAttributesCompat();
            audioAttributesCompat.f9952a = audioAttributesImplApi26;
            Intrinsics.checkNotNullExpressionValue(audioAttributesCompat, "build(...)");
        }
        AudioAttributesCompat audioAttributesCompat2 = audioAttributesCompat;
        String string25 = StubApp.getString2(679);
        if (map.get(string25) != null) {
            Object obj6 = map.get(string25);
            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Boolean");
            z2 = ((Boolean) obj6).booleanValue();
        } else {
            z2 = false;
        }
        this.f668b = new C1263b(intValue, bVar, handler, audioAttributesCompat2, z2);
        AudioManager audioManager = (AudioManager) this.f672f;
        Intrinsics.checkNotNull(audioManager);
        C1263b c1263b = (C1263b) this.f668b;
        Intrinsics.checkNotNull(c1263b);
        if (audioManager == null) {
            throw new IllegalArgumentException(StubApp.getString2(646));
        }
        if (c1263b == null) {
            throw new IllegalArgumentException(StubApp.getString2(645));
        }
        boolean z10 = AbstractC1264c.b(audioManager, c1263b.f17004f) == 1;
        if (z10) {
            if (((Q9.d) this.f669c) == null) {
                this.f669c = new Q9.d(this, 0);
                Context context = (Context) this.f671e;
                Intrinsics.checkNotNull(context);
                D.a.c(context, (Q9.d) this.f669c, new IntentFilter(StubApp.getString2(680)), 2);
            }
            if (((Q9.d) this.f670d) == null) {
                this.f670d = new Q9.d(this, 1);
                Context context2 = (Context) this.f671e;
                Intrinsics.checkNotNull(context2);
                D.a.c(context2, (Q9.d) this.f670d, new IntentFilter(StubApp.getString2(681)), 2);
            }
        }
        return z10;
    }

    public a(Context applicationContext, int i3) {
        int i10 = 0;
        switch (i3) {
            case 1:
                Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
                Handler handler = new Handler(Looper.getMainLooper());
                this.f667a = new ArrayList();
                this.f674h = new ArrayList();
                this.f671e = applicationContext;
                Object systemService = applicationContext.getSystemService(StubApp.getString2(643));
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                this.f672f = (AudioManager) systemService;
                this.f673g = new Q9.c(this, i10);
                AudioManager audioManager = (AudioManager) this.f672f;
                Intrinsics.checkNotNull(audioManager);
                Q9.c cVar = (Q9.c) this.f673g;
                Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type android.media.AudioDeviceCallback");
                audioManager.registerAudioDeviceCallback(cVar, handler);
                break;
            default:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                this.f667a = arrayList2;
                arrayList2.addAll(arrayList);
                j jVar = new j(applicationContext, this);
                this.f671e = jVar;
                q qVar = new q(applicationContext, this);
                this.f670d = qVar;
                k kVar = new k(applicationContext, this);
                this.f672f = kVar;
                l lVar = new l(applicationContext, this);
                g gVar = new g(applicationContext, this);
                this.f673g = gVar;
                d dVar = new d(applicationContext, this);
                this.f674h = dVar;
                o oVar = new o(applicationContext, this);
                this.f669c = oVar;
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(Arrays.asList(jVar, qVar, kVar, lVar, gVar, dVar, oVar));
                this.f668b = copyOnWriteArrayList;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (bVar instanceof f) {
                        f fVar = (f) bVar;
                        fVar.j = fVar.f675a.getResources().getDimension(2131099822);
                    }
                    if (bVar instanceof q) {
                        q qVar2 = (q) bVar;
                        qVar2.f735E = qVar2.f675a.getResources().getDimension(2131099813);
                    }
                    if (bVar instanceof k) {
                        k kVar2 = (k) bVar;
                        kVar2.f720w = kVar2.f675a.getResources().getDimension(2131099814);
                        kVar2.f719v = 20.0f;
                    }
                    if (bVar instanceof l) {
                        l lVar2 = (l) bVar;
                        lVar2.f724w = lVar2.f675a.getResources().getDimension(2131099814);
                        lVar2.f723v = 20.0f;
                    }
                    if (bVar instanceof g) {
                        g gVar2 = (g) bVar;
                        gVar2.f704q = gVar2.f675a.getResources().getDimension(2131099812);
                        gVar2.f703p = 150L;
                    }
                    if (bVar instanceof j) {
                        ((j) bVar).f715v = 15.3f;
                    }
                }
                break;
        }
    }

    public a(v navigationSession, C1464a arrivalProgressObserver, V8.q tripSession, I4.e skuIdProvider, SdkInformation sdkInformation) {
        Intrinsics.checkNotNullParameter(navigationSession, "navigationSession");
        Intrinsics.checkNotNullParameter(arrivalProgressObserver, "arrivalProgressObserver");
        Intrinsics.checkNotNullParameter(tripSession, "tripSession");
        Intrinsics.checkNotNullParameter(skuIdProvider, "skuIdProvider");
        Intrinsics.checkNotNullParameter(sdkInformation, "sdkInformation");
        this.f667a = navigationSession;
        this.f668b = arrivalProgressObserver;
        this.f669c = tripSession;
        this.f670d = skuIdProvider;
        this.f671e = sdkInformation;
        BillingService billingServiceFactory = BillingServiceFactory.getInstance();
        Intrinsics.checkNotNullExpressionValue(billingServiceFactory, "getInstance()");
        this.f672f = new C0366a(billingServiceFactory);
        n8.b navigationSessionStateObserver = new n8.b(this);
        this.f673g = navigationSessionStateObserver;
        C0517s arrivalObserver = new C0517s(this, 1);
        this.f674h = arrivalObserver;
        Intrinsics.checkNotNullParameter(navigationSessionStateObserver, "navigationSessionStateObserver");
        navigationSession.f7899a.add(navigationSessionStateObserver);
        navigationSessionStateObserver.a(navigationSession.f7900b);
        Intrinsics.checkNotNullParameter(arrivalObserver, "arrivalObserver");
        arrivalProgressObserver.f18386b.add(arrivalObserver);
    }
}
