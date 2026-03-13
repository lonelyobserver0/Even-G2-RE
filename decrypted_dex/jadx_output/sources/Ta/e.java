package Ta;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.dfu.DfuBaseService;
import no.nordicsemi.android.dfu.DfuServiceController;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import no.nordicsemi.android.dfu.DfuServiceListenerHelper;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LTa/e;", "Ldb/b;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "", "<init>", "()V", "nordic_dfu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements InterfaceC0825b, MethodChannel.MethodCallHandler, EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public Context f7249a;

    /* renamed from: b, reason: collision with root package name */
    public d f7250b;

    /* renamed from: c, reason: collision with root package name */
    public EventChannel.EventSink f7251c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f7252d = new LinkedHashMap();

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f7249a = binding.f13553a;
        Context context = binding.f13553a;
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        this.f7250b = new d(context, this);
        BinaryMessenger binaryMessenger = binding.f13554b;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, StubApp.getString2(6263));
        Intrinsics.checkNotNull(methodChannel);
        methodChannel.setMethodCallHandler(this);
        EventChannel eventChannel = new EventChannel(binaryMessenger, StubApp.getString2(6264));
        Intrinsics.checkNotNull(eventChannel);
        eventChannel.setStreamHandler(this);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        this.f7251c = null;
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f7250b = null;
        this.f7249a = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f7251c = eventSink;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Object m40constructorimpl;
        Object obj;
        LinkedHashMap linkedHashMap;
        Object obj2;
        Object m40constructorimpl2;
        File externalCacheDir;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        boolean areEqual = Intrinsics.areEqual(str, "startDfu");
        String string2 = StubApp.getString2(661);
        if (!areEqual) {
            if (!Intrinsics.areEqual(str, "abortDfu")) {
                result.notImplemented();
                return;
            }
            String str2 = (String) call.argument(string2);
            d dVar = this.f7250b;
            if (dVar != null) {
                LinkedHashMap linkedHashMap2 = dVar.f7246c;
                if (str2 != null) {
                    b bVar = (b) linkedHashMap2.get(str2);
                    if (bVar == null) {
                        Result.Companion companion = Result.INSTANCE;
                        m40constructorimpl = Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(6289).concat(str2))));
                    } else {
                        if (linkedHashMap2.size() > 1) {
                            Log.w(StubApp.getString2(6290), StubApp.getString2(6291));
                        }
                        bVar.f7240b.abort();
                        Result.Companion companion2 = Result.INSTANCE;
                        m40constructorimpl = Result.m40constructorimpl(Unit.INSTANCE);
                    }
                } else if (linkedHashMap2.isEmpty()) {
                    Result.Companion companion3 = Result.INSTANCE;
                    m40constructorimpl = Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(6288))));
                } else {
                    Iterator it = linkedHashMap2.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f7240b.abort();
                    }
                    Result.Companion companion4 = Result.INSTANCE;
                    m40constructorimpl = Result.m40constructorimpl(Unit.INSTANCE);
                }
                if (Result.m47isSuccessimpl(m40constructorimpl)) {
                    obj = null;
                    result.success(null);
                } else {
                    obj = null;
                }
                Throwable m43exceptionOrNullimpl = Result.m43exceptionOrNullimpl(m40constructorimpl);
                if (m43exceptionOrNullimpl != null) {
                    result.error(StubApp.getString2(6292), m43exceptionOrNullimpl.getMessage(), obj);
                }
                Result.m39boximpl(m40constructorimpl);
                return;
            }
            return;
        }
        String str3 = (String) call.argument(string2);
        String str4 = (String) call.argument(StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
        String str5 = (String) call.argument(StubApp.getString2(6265));
        Boolean bool = (Boolean) call.argument(StubApp.getString2(6266));
        Boolean bool2 = (Boolean) call.argument(StubApp.getString2(6267));
        Boolean bool3 = (Boolean) call.argument(StubApp.getString2(6268));
        Boolean bool4 = (Boolean) call.argument(StubApp.getString2(6269));
        Boolean bool5 = (Boolean) call.argument(StubApp.getString2(6270));
        Boolean bool6 = (Boolean) call.argument(StubApp.getString2(6271));
        Boolean bool7 = (Boolean) call.argument(StubApp.getString2(6272));
        Boolean bool8 = (Boolean) call.argument(StubApp.getString2(6273));
        Integer num = (Integer) call.argument(StubApp.getString2(6274));
        Integer num2 = (Integer) call.argument(StubApp.getString2(6275));
        Integer num3 = (Integer) call.argument(StubApp.getString2(6276));
        Long valueOf = ((Integer) call.argument(StubApp.getString2(6277))) != null ? Long.valueOf(r7.intValue()) : null;
        Integer num4 = (Integer) call.argument(StubApp.getString2(6278));
        Integer num5 = (Integer) call.argument(StubApp.getString2(5771));
        Integer num6 = (Integer) call.argument(StubApp.getString2(6279));
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        if (str3 == null || str5 == null) {
            result.error(StubApp.getString2(6286), StubApp.getString2(6287), null);
            return;
        }
        if (bool.booleanValue()) {
            bb.d dVar2 = (bb.d) Q2.g.H().f5711b;
            Intrinsics.checkNotNullExpressionValue(dVar2, "flutterLoader(...)");
            String b2 = dVar2.b(str5);
            Context context = this.f7249a;
            Intrinsics.checkNotNull(context);
            Intrinsics.checkNotNullParameter(context, "context");
            String str6 = "";
            if (Intrinsics.areEqual(StubApp.getString2(6280), Environment.getExternalStorageState()) && (externalCacheDir = StubApp.getOrigApplicationContext(context.getApplicationContext()).getExternalCacheDir()) != null) {
                str6 = externalCacheDir.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(str6, "getAbsolutePath(...)");
            }
            str5 = str6 + UUID.randomUUID() + StubApp.getString2(6281);
            Context context2 = this.f7249a;
            Intrinsics.checkNotNull(context2);
            if (!g.a(context2, b2, str5)) {
                result.error(StubApp.getString2(6282), StubApp.getString2(6283), b2);
                return;
            }
        }
        String str7 = str5;
        a config = new a(str3, str4, str7, bool2, bool3, bool4, bool5, bool6, bool7, bool8, num, num2, num3, valueOf, num4, num5, num6);
        LinkedHashMap linkedHashMap3 = this.f7252d;
        linkedHashMap3.put(str3, result);
        d dVar3 = this.f7250b;
        if (dVar3 != null) {
            Intrinsics.checkNotNullParameter(config, "config");
            DfuServiceInitiator zip = new DfuServiceInitiator(str3).setZip(str7);
            if (str4 != null) {
                zip.setDeviceName(str4);
            }
            if (bool3 != null) {
                zip.setUnsafeExperimentalButtonlessServiceInSecureDfuEnabled(bool3.booleanValue());
            }
            if (bool2 != null) {
                zip.setForceDfu(bool2.booleanValue());
            }
            if (bool4 != null) {
                zip.setDisableNotification(bool4.booleanValue());
            }
            if (bool8 != null) {
                zip.setForeground(bool8.booleanValue());
            }
            if (bool5 != null) {
                zip.setKeepBond(bool5.booleanValue());
            }
            if (bool7 != null) {
                zip.setRestoreBond(bool7.booleanValue());
            }
            if (bool6 != null) {
                zip.setPacketsReceiptNotificationsEnabled(bool6.booleanValue());
            }
            if (num != null) {
                zip.setPacketsReceiptNotificationsValue(num.intValue());
            }
            if (num2 != null) {
                zip.setPrepareDataObjectDelay(num2.intValue());
            }
            if (num3 != null) {
                zip.setNumberOfRetries(num3.intValue());
            }
            if (valueOf != null) {
                zip.setRebootTime(valueOf.longValue());
            }
            if (num4 != null) {
                zip.setMbrSize(num4.intValue());
            }
            if (num5 != null) {
                zip.setScope(num5.intValue());
            }
            if (num6 != null) {
                zip.setCurrentMtu(num6.intValue());
            }
            Context context3 = dVar3.f7244a;
            DfuServiceListenerHelper.registerProgressListener(context3, dVar3.f7248e, str3);
            if (!Intrinsics.areEqual(bool8, Boolean.FALSE) && !dVar3.f7247d) {
                DfuServiceInitiator.createDfuNotificationChannel(context3);
                dVar3.f7247d = true;
            }
            Iterator it2 = d.f7243f.iterator();
            loop0: while (true) {
                boolean hasNext = it2.hasNext();
                linkedHashMap = dVar3.f7246c;
                if (!hasNext) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                Class cls = (Class) obj2;
                Collection values = linkedHashMap.values();
                if (values != null && values.isEmpty()) {
                    break;
                }
                Iterator it3 = values.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.areEqual(((b) it3.next()).f7241c, cls)) {
                        break;
                    }
                }
                break loop0;
            }
            Class<? extends DfuBaseService> cls2 = (Class) obj2;
            if (cls2 == null) {
                Result.Companion companion5 = Result.INSTANCE;
                m40constructorimpl2 = Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(6284))));
            } else {
                DfuServiceController start = zip.start(context3, cls2);
                Intrinsics.checkNotNull(start);
                linkedHashMap.put(str3, new b(str3, start, cls2));
                Result.Companion companion6 = Result.INSTANCE;
                m40constructorimpl2 = Result.m40constructorimpl(Unit.INSTANCE);
            }
            Throwable m43exceptionOrNullimpl2 = Result.m43exceptionOrNullimpl(m40constructorimpl2);
            if (m43exceptionOrNullimpl2 != null) {
                result.error(StubApp.getString2(6285), m43exceptionOrNullimpl2.getMessage(), null);
                linkedHashMap3.remove(str3);
            }
            Result.m39boximpl(m40constructorimpl2);
        }
    }
}
