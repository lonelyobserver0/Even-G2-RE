package rc;

import Ab.i;
import Cb.e;
import Kc.C0104k;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l4.C1223z;
import no.nordicsemi.android.ble.k;
import no.nordicsemi.android.ble.l;
import no.nordicsemi.android.ble.q;
import no.nordicsemi.android.ble.t;
import no.nordicsemi.android.ble.w;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import tc.C1752B;
import tc.C1754D;
import tc.C1762h;
import tc.C1764j;
import tc.F;
import tc.N;
import uc.C1787a;
import vc.C1850b;
import vc.C1851c;
import vc.EnumC1849a;
import wb.f;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrc/c;", "Ldb/b;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "mcumgr_flutter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMcumgrFlutterPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 McumgrFlutterPlugin.kt\nno/nordicsemi/android/mcumgr_flutter/McumgrFlutterPlugin\n+ 2 Guard.kt\nno/nordicsemi/android/mcumgr_flutter/utils/GuardKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,295:1\n10#2:296\n10#2:297\n10#2:298\n10#2:299\n10#2:304\n10#2:305\n10#2:306\n10#2:307\n10#2:308\n10#2:309\n10#2:310\n10#2:311\n10#2:312\n1557#3:300\n1628#3,3:301\n*S KotlinDebug\n*F\n+ 1 McumgrFlutterPlugin.kt\nno/nordicsemi/android/mcumgr_flutter/McumgrFlutterPlugin\n*L\n65#1:296\n136#1:297\n154#1:298\n158#1:299\n190#1:304\n194#1:305\n226#1:306\n229#1:307\n236#1:308\n242#1:309\n250#1:310\n261#1:311\n264#1:312\n184#1:300\n184#1:301,3\n*E\n"})
/* renamed from: rc.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1588c implements InterfaceC0825b, MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f20559a;

    /* renamed from: e, reason: collision with root package name */
    public Context f20563e;

    /* renamed from: b, reason: collision with root package name */
    public final C1850b f20560b = new C1850b();

    /* renamed from: c, reason: collision with root package name */
    public final C1850b f20561c = new C1850b();

    /* renamed from: d, reason: collision with root package name */
    public final C1850b f20562d = new C1850b();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f20564f = new LinkedHashMap();

    public final void a(MethodCall methodCall, MethodChannel.Result result) {
        Object obj = methodCall.arguments;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            throw new C1851c(StubApp.getString2(35308));
        }
        Object obj2 = this.f20564f.get(str);
        if (obj2 == null) {
            throw new C1851c();
        }
        ((C1589d) obj2).f20571g.b(0, 0, null, DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT, Kb.a.class, new C1587b(result, str));
    }

    public final void b(MethodCall methodCall) {
        Object obj = methodCall.arguments;
        Context context = null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            throw new C1851c(StubApp.getString2(35308));
        }
        LinkedHashMap linkedHashMap = this.f20564f;
        if (linkedHashMap.containsKey(str)) {
            String message = StubApp.getString2(35309);
            Intrinsics.checkNotNullParameter(message, "message");
            throw new C1851c(StubApp.getString2(35310), message);
        }
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
        Context context2 = this.f20563e;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            context = context2;
        }
        Intrinsics.checkNotNull(remoteDevice);
        C1850b c1850b = this.f20562d;
        linkedHashMap.put(str, new C1589d(new C1787a(context, remoteDevice, c1850b), this.f20560b, this.f20561c, c1850b));
    }

    public final void c(MethodCall methodCall) {
        Object obj = methodCall.arguments;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            throw new C1851c(StubApp.getString2(35311));
        }
        LinkedHashMap linkedHashMap = this.f20564f;
        if (linkedHashMap.containsKey(str)) {
            Object obj2 = linkedHashMap.get(str);
            Intrinsics.checkNotNull(obj2);
            C1787a c1787a = ((C1589d) obj2).f20570f;
            no.nordicsemi.android.ble.b bVar = c1787a.f17932b;
            bVar.f17912k.clear();
            bVar.f17913l = null;
            bVar.f17914m = false;
            BluetoothDevice bluetoothDevice = bVar.f17909f;
            if (bluetoothDevice != null) {
                if (bVar.f17921v) {
                    if (5 >= bVar.f17911h.a()) {
                        bVar.f17911h.b(5, StubApp.getString2(1937));
                    }
                    q qVar = bVar.f17900D;
                    if (qVar instanceof t) {
                        qVar.b(bluetoothDevice, -7);
                    }
                    w wVar = bVar.f17904H;
                    if (wVar != null) {
                        wVar.b(bluetoothDevice, -7);
                        bVar.f17904H = null;
                    }
                    q qVar2 = bVar.f17900D;
                    bVar.V(qVar2 == null || qVar2.f17977m);
                }
                k kVar = bVar.f17899C;
                if (kVar != null) {
                    kVar.b(bluetoothDevice, -7);
                    bVar.f17899C = null;
                    bVar.L();
                }
            }
            l lVar = new l(3);
            lVar.g(c1787a.f17932b);
            lVar.a();
        }
        linkedHashMap.remove(str);
    }

    public final byte[] d(MethodCall methodCall) {
        Object obj = methodCall.arguments;
        byte[] bArr = obj instanceof byte[] ? (byte[]) obj : null;
        if (bArr == null) {
            throw new C1851c(StubApp.getString2(35308));
        }
        C1752B c1752b = (C1752B) C1752B.f21258f.c(bArr);
        Object obj2 = this.f20564f.get(c1752b.f21259d);
        if (obj2 == null) {
            throw new C1851c();
        }
        f fVar = ((C1589d) obj2).f20568d.f287b;
        C1787a c1787a = fVar instanceof C1787a ? (C1787a) fVar : null;
        Intrinsics.checkNotNull(c1787a);
        c1787a.getClass();
        String address = c1787a.j.getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
        ArrayList arrayList = c1787a.f21488w;
        C1754D c1754d = new C1754D(address, arrayList, C0104k.f3820d);
        if (c1752b.f21260e) {
            arrayList.clear();
        }
        return c1754d.a();
    }

    public final C1589d e(MethodCall methodCall) {
        Object obj = methodCall.arguments;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            throw new C1851c(StubApp.getString2(35308));
        }
        Object obj2 = this.f20564f.get(str);
        if (obj2 != null) {
            return (C1589d) obj2;
        }
        throw new C1851c();
    }

    public final void f(MethodCall methodCall) {
        String joinToString$default;
        int i3;
        Ab.f fVar;
        Object obj = methodCall.arguments;
        C1586a c1586a = null;
        byte[] bArr = obj instanceof byte[] ? (byte[]) obj : null;
        if (bArr == null) {
            throw new C1851c(StubApp.getString2(35314) + methodCall.arguments.getClass());
        }
        N n10 = (N) N.f21292g.c(bArr);
        Object obj2 = this.f20564f.get(n10.f21293d);
        if (obj2 == null) {
            throw new C1851c();
        }
        C1589d c1589d = (C1589d) obj2;
        C1762h c1762h = n10.f21294e;
        if (c1762h != null) {
            long j = c1762h.f21316d;
            boolean z2 = c1762h.f21317e;
            int i10 = (int) c1762h.f21318f;
            int ordinal = c1762h.f21319g.ordinal();
            if (ordinal == 0) {
                i3 = 0;
            } else if (ordinal != 1) {
                i3 = 4;
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        i3 = 8;
                    } else {
                        if (ordinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = 16;
                    }
                }
            } else {
                i3 = 2;
            }
            long j3 = c1762h.f21320h;
            int ordinal2 = c1762h.j.ordinal();
            if (ordinal2 == 0) {
                fVar = Ab.f.f269a;
            } else if (ordinal2 == 1) {
                fVar = Ab.f.f270b;
            } else if (ordinal2 == 2) {
                fVar = Ab.f.f271c;
            } else {
                if (ordinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar = Ab.f.f272d;
            }
            c1586a = new C1586a(j, z2, i10, i3, j3, fVar);
        }
        List<C1764j> list = n10.f21295f;
        ArrayList images = new ArrayList(CollectionsKt.f(list));
        for (C1764j c1764j : list) {
            images.add(Pair.create(Integer.valueOf(c1764j.f21322d), c1764j.f21325g.r()));
        }
        Intrinsics.checkNotNullParameter(images, "images");
        if (c1586a != null) {
            c1589d.f20568d.b(c1586a.f20554d);
            c1589d.f20568d.a((int) c1586a.f20551a);
            c1589d.f20568d.c(c1586a.f20553c);
            i iVar = c1589d.f20568d;
            Ab.f fVar2 = c1586a.f20556f;
            if (iVar.f286a.g()) {
                i.f285i.n(StubApp.getString2(456));
            } else {
                iVar.f289d = fVar2;
            }
        }
        Iterator it = images.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Integer num = (Integer) pair.first;
            byte[] bArr2 = (byte[]) pair.second;
            Intrinsics.checkNotNull(bArr2);
            Intrinsics.checkNotNullParameter(bArr2, "<this>");
            byte[] digest = MessageDigest.getInstance(StubApp.getString2(5778)).digest(bArr2);
            Intrinsics.checkNotNull(digest);
            joinToString$default = ArraysKt___ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new X2.q(8), 30, (Object) null);
            Log.d(c1589d.f20572h, StubApp.getString2(35312) + num + StubApp.getString2(994) + bArr2.length + StubApp.getString2(35313) + joinToString$default);
        }
        i iVar2 = c1589d.f20568d;
        boolean z10 = c1586a != null ? c1586a.f20552b : true;
        synchronized (iVar2) {
            Bb.a aVar = new Bb.a(0);
            Iterator it2 = images.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                aVar.f745a.add(new Bb.b(((Integer) pair2.first).intValue(), (byte[]) pair2.second));
            }
            iVar2.d(aVar, z10);
        }
    }

    public final void g(MethodCall methodCall) {
        int i3;
        Ab.f fVar;
        Object obj = methodCall.arguments;
        C1586a c1586a = null;
        byte[] bArr = obj instanceof byte[] ? (byte[]) obj : null;
        if (bArr == null) {
            throw new C1851c(StubApp.getString2(35314) + methodCall.arguments.getClass());
        }
        F f10 = (F) F.f21264h.c(bArr);
        Object obj2 = this.f20564f.get(f10.f21265d);
        if (obj2 == null) {
            throw new C1851c();
        }
        C1589d c1589d = (C1589d) obj2;
        C0104k c0104k = f10.f21267f;
        c0104k.r();
        C1762h c1762h = f10.f21268g;
        if (c1762h != null) {
            int i10 = (int) c1762h.f21318f;
            int ordinal = c1762h.f21319g.ordinal();
            if (ordinal == 0) {
                i3 = 0;
            } else if (ordinal != 1) {
                i3 = 4;
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        i3 = 8;
                    } else {
                        if (ordinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = 16;
                    }
                }
            } else {
                i3 = 2;
            }
            int ordinal2 = c1762h.j.ordinal();
            if (ordinal2 == 0) {
                fVar = Ab.f.f269a;
            } else if (ordinal2 == 1) {
                fVar = Ab.f.f270b;
            } else if (ordinal2 == 2) {
                fVar = Ab.f.f271c;
            } else {
                if (ordinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar = Ab.f.f272d;
            }
            c1586a = new C1586a(c1762h.f21316d, c1762h.f21317e, i10, i3, c1762h.f21320h, fVar);
        }
        byte[] imageData = c0104k.r();
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        i iVar = c1589d.f20568d;
        if (c1586a != null) {
            iVar.b(c1586a.f20554d);
            iVar.a((int) c1586a.f20551a);
            iVar.c(c1586a.f20553c);
            Ab.f fVar2 = c1586a.f20556f;
            if (iVar.f286a.g()) {
                i.f285i.n(StubApp.getString2(456));
            } else {
                iVar.f289d = fVar2;
            }
        }
        Bb.a aVar = new Bb.a(0);
        aVar.f745a.add(new Bb.b(imageData));
        iVar.d(aVar, c1586a != null ? c1586a.f20552b : false);
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        this.f20563e = flutterPluginBinding.f13553a;
        BinaryMessenger binaryMessenger = flutterPluginBinding.f13554b;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, StubApp.getString2(35315));
        this.f20559a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        new EventChannel(binaryMessenger, StubApp.getString2(35316)).setStreamHandler(this.f20560b);
        new EventChannel(binaryMessenger, StubApp.getString2(35317)).setStreamHandler(this.f20561c);
        new EventChannel(binaryMessenger, StubApp.getString2(35318)).setStreamHandler(this.f20562d);
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.f20559a;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        EnumC1849a enumC1849a;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        C1223z c1223z = EnumC1849a.f21937a;
        String string = call.method;
        Intrinsics.checkNotNullExpressionValue(string, "method");
        c1223z.getClass();
        Intrinsics.checkNotNullParameter(string, "string");
        try {
            enumC1849a = EnumC1849a.valueOf(string);
        } catch (IllegalArgumentException unused) {
            enumC1849a = null;
        }
        if (enumC1849a == null) {
            result.notImplemented();
            return;
        }
        try {
            switch (enumC1849a.ordinal()) {
                case 0:
                    f(call);
                    result.success(null);
                    return;
                case 1:
                    g(call);
                    result.success(null);
                    return;
                case 2:
                    b(call);
                    result.success(null);
                    return;
                case 3:
                    C1589d e10 = e(call);
                    if (!e10.f20573i) {
                        e10.f20570f.f22300n = true;
                        i iVar = e10.f20568d;
                        synchronized (iVar) {
                            Mb.a aVar = (Mb.a) iVar.f286a.f4728a;
                            if (aVar != null) {
                                e eVar = (e) aVar.f4725d;
                                if (!aVar.f4722a && eVar != null) {
                                    aVar.f4722a = true;
                                    eVar.d();
                                }
                            }
                        }
                    }
                    result.success(null);
                    return;
                case 4:
                    C1589d e11 = e(call);
                    if (e11.f20573i) {
                        i iVar2 = e11.f20568d;
                        synchronized (iVar2) {
                            Mb.a aVar2 = (Mb.a) iVar2.f286a.f4728a;
                            if (aVar2 != null) {
                                e eVar2 = (e) aVar2.f4725d;
                                if (aVar2.f4722a && eVar2 != null) {
                                    aVar2.f4722a = false;
                                    eVar2.e(aVar2);
                                }
                            }
                        }
                        e11.f20570f.f22300n = false;
                    }
                    result.success(null);
                    return;
                case 5:
                    result.success(Boolean.valueOf(e(call).f20573i));
                    return;
                case 6:
                    result.success(Boolean.valueOf(e(call).j));
                    return;
                case 7:
                    i iVar3 = e(call).f20568d;
                    synchronized (iVar3) {
                        Mb.a aVar3 = (Mb.a) iVar3.f286a.f4728a;
                        if (aVar3 != null) {
                            e eVar3 = (e) aVar3.f4725d;
                            if (!aVar3.f4723b && eVar3 != null) {
                                aVar3.f4723b = true;
                                aVar3.f4722a = false;
                                eVar3.a();
                            }
                        }
                    }
                    result.success(null);
                    return;
                case 8:
                    result.success(d(call));
                    return;
                case 9:
                    f fVar = e(call).f20568d.f287b;
                    C1787a c1787a = fVar instanceof C1787a ? (C1787a) fVar : null;
                    Intrinsics.checkNotNull(c1787a);
                    c1787a.f21488w.clear();
                    result.success(null);
                    return;
                case 10:
                    c(call);
                    result.success(null);
                    return;
                case 11:
                    a(call, result);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (C1851c e12) {
            result.error(e12.f21941a, e12.getMessage(), null);
        }
        result.error(e12.f21941a, e12.getMessage(), null);
    }
}
