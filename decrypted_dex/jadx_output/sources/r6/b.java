package r6;

import C.AbstractC0025b;
import Xa.AbstractActivityC0364d;
import a.AbstractC0378a;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.stub.StubApp;
import i2.u;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import s6.C1601a;
import t6.C1737d;
import t6.EnumC1734a;
import y6.InterfaceC1973b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final C1601a f20360a;

    /* renamed from: b, reason: collision with root package name */
    public final BinaryMessenger f20361b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f20362c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f20363d;

    public b(C1601a permissionManager, BinaryMessenger messenger, Context appContext) {
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(messenger, "messenger");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f20360a = permissionManager;
        this.f20361b = messenger;
        this.f20362c = appContext;
        this.f20363d = new ConcurrentHashMap();
    }

    public final void a(d dVar, String str) {
        dVar.getClass();
        try {
            InterfaceC1973b interfaceC1973b = dVar.f20369f;
            if (interfaceC1973b != null) {
                interfaceC1973b.dispose();
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            dVar.b();
            dVar.e();
            dVar.f20369f = null;
            throw th;
        }
        dVar.b();
        dVar.e();
        dVar.f20369f = null;
        EventChannel eventChannel = dVar.f20365b;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
        }
        dVar.f20365b = null;
        EventChannel eventChannel2 = dVar.f20367d;
        if (eventChannel2 != null) {
            eventChannel2.setStreamHandler(null);
        }
        dVar.f20367d = null;
        this.f20363d.remove(str);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        boolean equals;
        String string2;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = (String) call.argument(StubApp.getString2(22684));
        String string22 = StubApp.getString2(22685);
        String str2 = null;
        if (str == null || str.length() == 0) {
            result.error(string22, StubApp.getString2(22731), null);
            return;
        }
        boolean areEqual = Intrinsics.areEqual(call.method, "create");
        ConcurrentHashMap concurrentHashMap = this.f20363d;
        String string23 = StubApp.getString2(22686);
        Context context = this.f20362c;
        if (areEqual) {
            try {
                concurrentHashMap.put(str, new d(context, str, this.f20361b));
                result.success(null);
                return;
            } catch (Exception e10) {
                result.error(string22, string23, e10.getMessage());
                return;
            }
        }
        d dVar = (d) concurrentHashMap.get(str);
        if (dVar == null) {
            result.error(string22, StubApp.getString2(22687), null);
            return;
        }
        String str3 = call.method;
        if (str3 != null) {
            int hashCode = str3.hashCode();
            String string24 = StubApp.getString2(2448);
            switch (hashCode) {
                case -2122989593:
                    if (str3.equals(StubApp.getString2(22730))) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        InterfaceC1973b interfaceC1973b = dVar.f20369f;
                        result.success(Boolean.valueOf(interfaceC1973b != null ? interfaceC1973b.a() : false));
                        return;
                    }
                    break;
                case -1866158462:
                    if (str3.equals(StubApp.getString2(22728))) {
                        try {
                            C1737d p8 = AbstractC0378a.p(call, context);
                            Intrinsics.checkNotNullParameter(p8, string24);
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (p8.f21194h) {
                                throw new Exception(StubApp.getString2("22729"));
                            }
                            dVar.c(p8, result);
                            return;
                        } catch (IOException e11) {
                            result.error(string22, string23, e11.getMessage());
                            return;
                        }
                    }
                    break;
                case -1367724422:
                    if (str3.equals(StubApp.getString2(6385))) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        try {
                            InterfaceC1973b interfaceC1973b2 = dVar.f20369f;
                            if (interfaceC1973b2 != null) {
                                interfaceC1973b2.cancel();
                            }
                            result.success(null);
                        } catch (Exception e12) {
                            result.error(string22, e12.getMessage(), e12.getCause());
                        }
                        dVar.b();
                        return;
                    }
                    break;
                case -934426579:
                    if (str3.equals(StubApp.getString2(11739))) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        try {
                            InterfaceC1973b interfaceC1973b3 = dVar.f20369f;
                            if (interfaceC1973b3 != null) {
                                interfaceC1973b3.resume();
                            }
                            result.success(null);
                            return;
                        } catch (Exception e13) {
                            result.error(string22, e13.getMessage(), e13.getCause());
                            return;
                        }
                    }
                    break;
                case -321287432:
                    if (str3.equals(StubApp.getString2(22727))) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        InterfaceC1973b interfaceC1973b4 = dVar.f20369f;
                        result.success(Boolean.valueOf(interfaceC1973b4 != null ? interfaceC1973b4.c() : false));
                        return;
                    }
                    break;
                case 3540994:
                    if (str3.equals(StubApp.getString2(22726))) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        try {
                            try {
                                InterfaceC1973b interfaceC1973b5 = dVar.f20369f;
                                if (interfaceC1973b5 == null) {
                                    result.success(null);
                                } else {
                                    interfaceC1973b5.e(new J2.a(result, 4));
                                }
                            } catch (Exception e14) {
                                result.error(string22, e14.getMessage(), e14.getCause());
                            }
                            dVar.e();
                            return;
                        } catch (Throwable th) {
                            dVar.e();
                            throw th;
                        }
                    }
                    break;
                case 106440182:
                    if (str3.equals(StubApp.getString2(22725))) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        try {
                            InterfaceC1973b interfaceC1973b6 = dVar.f20369f;
                            if (interfaceC1973b6 != null) {
                                interfaceC1973b6.pause();
                            }
                            result.success(null);
                            return;
                        } catch (Exception e15) {
                            result.error(string22, e15.getMessage(), e15.getCause());
                            return;
                        }
                    }
                    break;
                case 109757538:
                    if (str3.equals(StubApp.getString2(22724))) {
                        try {
                            C1737d p9 = AbstractC0378a.p(call, context);
                            Intrinsics.checkNotNullParameter(p9, string24);
                            Intrinsics.checkNotNullParameter(result, "result");
                            dVar.c(p9, result);
                            return;
                        } catch (IOException e16) {
                            result.error(string22, string23, e16.getMessage());
                            return;
                        }
                    }
                    break;
                case 115944508:
                    if (str3.equals(StubApp.getString2(22723))) {
                        String str4 = (String) call.argument(StubApp.getString2(8297));
                        Objects.requireNonNull(str4);
                        EnumC1734a enumC1734a = EnumC1734a.f21166a;
                        boolean areEqual2 = Intrinsics.areEqual(str4, "aacLc");
                        String string25 = StubApp.getString2(76);
                        if (areEqual2 || Intrinsics.areEqual(str4, "aacEld") || Intrinsics.areEqual(str4, "aacHe")) {
                            str2 = StubApp.getString2(468);
                        } else if (Intrinsics.areEqual(str4, "amrNb")) {
                            str2 = StubApp.getString2(1624);
                        } else if (Intrinsics.areEqual(str4, "amrWb")) {
                            str2 = StubApp.getString2(1625);
                        } else if (Intrinsics.areEqual(str4, "wav") || Intrinsics.areEqual(str4, "pcm16bits")) {
                            str2 = string25;
                        } else if (Intrinsics.areEqual(str4, "opus")) {
                            str2 = StubApp.getString2(1609);
                        } else if (Intrinsics.areEqual(str4, "flac")) {
                            str2 = StubApp.getString2(1627);
                        }
                        if (str2 != null) {
                            if (!Intrinsics.areEqual(str2, string25)) {
                                Iterator it = ArrayIteratorKt.iterator(new MediaCodecList(0).getCodecInfos());
                                while (it.hasNext()) {
                                    MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) it.next();
                                    if (mediaCodecInfo.isEncoder()) {
                                        Iterator it2 = ArrayIteratorKt.iterator(mediaCodecInfo.getSupportedTypes());
                                        while (it2.hasNext()) {
                                            equals = StringsKt__StringsJVMKt.equals((String) it2.next(), str2, true);
                                            if (equals) {
                                            }
                                        }
                                    }
                                }
                            }
                            result.success(Boolean.valueOf(r9));
                            return;
                        }
                        r9 = false;
                        result.success(Boolean.valueOf(r9));
                        return;
                    }
                    break;
                case 171850761:
                    if (str3.equals(StubApp.getString2(22722))) {
                        Boolean bool = (Boolean) call.argument(StubApp.getString2(13806));
                        boolean booleanValue = bool != null ? bool.booleanValue() : true;
                        C1574a resultCallback = new C1574a(result);
                        C1601a c1601a = this.f20360a;
                        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
                        AbstractActivityC0364d abstractActivityC0364d = c1601a.f20776b;
                        if (abstractActivityC0364d == null) {
                            result.success(Boolean.FALSE);
                            return;
                        }
                        Intrinsics.checkNotNull(abstractActivityC0364d);
                        String string26 = StubApp.getString2(1831);
                        r9 = D.a.a(abstractActivityC0364d, string26) == 0;
                        if (r9 || !booleanValue) {
                            result.success(Boolean.valueOf(r9));
                            return;
                        }
                        c1601a.f20775a = resultCallback;
                        AbstractActivityC0364d abstractActivityC0364d2 = c1601a.f20776b;
                        Intrinsics.checkNotNull(abstractActivityC0364d2);
                        AbstractC0025b.d(abstractActivityC0364d2, new String[]{string26}, 1001);
                        return;
                    }
                    break;
                case 806845809:
                    if (str3.equals(StubApp.getString2(22691))) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        Object systemService = context.getSystemService(StubApp.getString2(643));
                        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                        AudioDeviceInfo[] devices = ((AudioManager) systemService).getDevices(1);
                        Intrinsics.checkNotNull(devices);
                        List devices2 = ArraysKt.asList(devices);
                        Intrinsics.checkNotNullParameter(devices2, "devices");
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : devices2) {
                            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                            if (audioDeviceInfo.isSource() && audioDeviceInfo.getType() != 18 && audioDeviceInfo.getType() != 25 && audioDeviceInfo.getType() != 28) {
                                arrayList.add(obj);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) it3.next();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(audioDeviceInfo2.getProductName());
                            sb2.append(StubApp.getString2(1561));
                            int type = audioDeviceInfo2.getType();
                            switch (type) {
                                case 0:
                                    string2 = StubApp.getString2(351);
                                    break;
                                case 1:
                                    string2 = StubApp.getString2(22721);
                                    break;
                                case 2:
                                    string2 = StubApp.getString2(22720);
                                    break;
                                case 3:
                                    string2 = StubApp.getString2(22719);
                                    break;
                                case 4:
                                    string2 = StubApp.getString2(22718);
                                    break;
                                case 5:
                                    string2 = StubApp.getString2(22717);
                                    break;
                                case 6:
                                    string2 = StubApp.getString2(22716);
                                    break;
                                case 7:
                                    string2 = StubApp.getString2(22715);
                                    break;
                                case 8:
                                    string2 = StubApp.getString2(22714);
                                    break;
                                case 9:
                                    string2 = StubApp.getString2(22713);
                                    break;
                                case 10:
                                    string2 = StubApp.getString2(22712);
                                    break;
                                case 11:
                                    string2 = StubApp.getString2(22711);
                                    break;
                                case 12:
                                    string2 = StubApp.getString2(22710);
                                    break;
                                case 13:
                                    string2 = StubApp.getString2(22709);
                                    break;
                                case 14:
                                    string2 = StubApp.getString2(4698);
                                    break;
                                case 15:
                                    string2 = StubApp.getString2(22708);
                                    break;
                                case 16:
                                    string2 = StubApp.getString2(22707);
                                    break;
                                case 17:
                                    string2 = StubApp.getString2(22706);
                                    break;
                                case 18:
                                    string2 = StubApp.getString2(22705);
                                    break;
                                case 19:
                                    string2 = StubApp.getString2(22704);
                                    break;
                                case 20:
                                    string2 = StubApp.getString2(22703);
                                    break;
                                case 21:
                                    string2 = StubApp.getString2(22702);
                                    break;
                                case 22:
                                    string2 = StubApp.getString2(22701);
                                    break;
                                case 23:
                                    string2 = StubApp.getString2(22700);
                                    break;
                                case 24:
                                    string2 = StubApp.getString2(22699);
                                    break;
                                case 25:
                                    string2 = StubApp.getString2(22698);
                                    break;
                                case 26:
                                    string2 = StubApp.getString2(22697);
                                    break;
                                case 27:
                                    string2 = StubApp.getString2(22696);
                                    break;
                                case 28:
                                    string2 = StubApp.getString2(22695);
                                    break;
                                case 29:
                                    string2 = StubApp.getString2(22694);
                                    break;
                                case 30:
                                    string2 = StubApp.getString2(22693);
                                    break;
                                default:
                                    string2 = u.p(type, StubApp.getString2(22692));
                                    break;
                            }
                            sb2.append(string2);
                            sb2.append(StubApp.getString2(81) + audioDeviceInfo2.getAddress());
                            sb2.append(StubApp.getString2(74));
                            arrayList2.add(MapsKt.mapOf(TuplesKt.to(StubApp.getString2(290), String.valueOf(audioDeviceInfo2.getId())), TuplesKt.to(StubApp.getString2(744), sb2.toString())));
                        }
                        result.success(arrayList2);
                        return;
                    }
                    break;
                case 1262423501:
                    if (str3.equals(StubApp.getString2(22688))) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        InterfaceC1973b interfaceC1973b7 = dVar.f20369f;
                        if (interfaceC1973b7 == null) {
                            result.success(null);
                            return;
                        }
                        Intrinsics.checkNotNull(interfaceC1973b7);
                        ArrayList b2 = interfaceC1973b7.b();
                        HashMap hashMap = new HashMap();
                        hashMap.put(StubApp.getString2(22689), b2.get(0));
                        hashMap.put(StubApp.getString2(22690), b2.get(1));
                        result.success(hashMap);
                        return;
                    }
                    break;
                case 1671767583:
                    if (str3.equals(StubApp.getString2(17844))) {
                        a(dVar, str);
                        result.success(null);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}
