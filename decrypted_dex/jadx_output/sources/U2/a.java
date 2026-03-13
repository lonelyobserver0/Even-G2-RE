package U2;

import B3.h;
import C2.d;
import R2.c;
import com.microsoft.cognitiveservices.speech.audio.PushAudioInputStream;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryCodec;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LU2/a;", "Ldb/b;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "flutter_ezw_asr_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements InterfaceC0825b, MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f7446a;

    /* renamed from: b, reason: collision with root package name */
    public MethodChannel f7447b;

    /* renamed from: c, reason: collision with root package name */
    public BasicMessageChannel f7448c;

    /* renamed from: d, reason: collision with root package name */
    public h f7449d;

    /* renamed from: e, reason: collision with root package name */
    public C0824a f7450e;

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        this.f7450e = flutterPluginBinding;
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.f13554b, StubApp.getString2(6297));
        this.f7446a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        BinaryMessenger binaryMessenger = flutterPluginBinding.f13554b;
        MethodChannel methodChannel2 = new MethodChannel(binaryMessenger, StubApp.getString2(6298));
        this.f7447b = methodChannel2;
        methodChannel2.setMethodCallHandler(this);
        this.f7448c = new BasicMessageChannel(binaryMessenger, StubApp.getString2(6299), BinaryCodec.INSTANCE);
        c.b(StubApp.getString2(1030), StubApp.getString2(6300));
        BasicMessageChannel basicMessageChannel = this.f7448c;
        if (basicMessageChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioTextEventChannel");
            basicMessageChannel = null;
        }
        basicMessageChannel.setMessageHandler(new d(this, 21));
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.f7446a;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
        MethodChannel methodChannel2 = this.f7447b;
        if (methodChannel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("transcribeChannel");
            methodChannel2 = null;
        }
        methodChannel2.setMethodCallHandler(null);
        BasicMessageChannel basicMessageChannel = this.f7448c;
        if (basicMessageChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioTextEventChannel");
            basicMessageChannel = null;
        }
        basicMessageChannel.setMessageHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        if (str != null) {
            int hashCode = str.hashCode();
            String string2 = StubApp.getString2(1142);
            String string22 = StubApp.getString2(6301);
            switch (hashCode) {
                case -1679489904:
                    if (str.equals(StubApp.getString2(6325))) {
                        Object obj = call.arguments;
                        Map map = obj instanceof Map ? (Map) obj : null;
                        if (map != null) {
                            String string23 = StubApp.getString2(1485);
                            if (map.get(string23) instanceof byte[]) {
                                try {
                                    Object obj2 = map.get(string23);
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
                                    byte[] bArr = (byte[]) obj2;
                                    h hVar = this.f7449d;
                                    if (hVar != null) {
                                        Intrinsics.checkNotNullParameter(bArr, string23);
                                        PushAudioInputStream pushAudioInputStream = (PushAudioInputStream) hVar.f613d;
                                        if (pushAudioInputStream != null) {
                                            pushAudioInputStream.write(bArr);
                                        }
                                    }
                                    result.success(null);
                                    return;
                                } catch (Exception e10) {
                                    result.error(StubApp.getString2(6326), e10.getMessage(), null);
                                    return;
                                }
                            }
                        }
                        result.error(string22, StubApp.getString2(6327), null);
                        return;
                    }
                    break;
                case -856951205:
                    if (str.equals(StubApp.getString2(6323))) {
                        try {
                            h hVar2 = this.f7449d;
                            if (hVar2 != null) {
                                hVar2.d();
                            }
                            this.f7449d = null;
                            result.success(null);
                            return;
                        } catch (Exception e11) {
                            result.error(StubApp.getString2(6324), e11.getMessage(), null);
                            return;
                        }
                    }
                    break;
                case 357006041:
                    if (str.equals(StubApp.getString2(6321))) {
                        try {
                            h hVar3 = this.f7449d;
                            if (hVar3 != null) {
                                hVar3.g();
                            }
                            result.success(null);
                            return;
                        } catch (Exception e12) {
                            result.error(StubApp.getString2(6322), e12.getMessage(), null);
                            return;
                        }
                    }
                    break;
                case 411400512:
                    if (str.equals(StubApp.getString2(6318))) {
                        Object obj3 = call.arguments;
                        Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                        if (map2 == null || !(map2.get(string2) instanceof String)) {
                            result.error(string22, StubApp.getString2(6320), null);
                            return;
                        }
                        try {
                            Object obj4 = map2.get(string2);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            h hVar4 = this.f7449d;
                            if (hVar4 != null) {
                                hVar4.i(str2);
                            }
                            result.success(null);
                            return;
                        } catch (Exception e13) {
                            result.error(StubApp.getString2(6319), e13.getMessage(), null);
                            return;
                        }
                    }
                    break;
                case 422565445:
                    if (str.equals(StubApp.getString2(6316))) {
                        try {
                            h hVar5 = this.f7449d;
                            if (hVar5 != null) {
                                hVar5.j();
                            }
                            result.success(null);
                            return;
                        } catch (Exception e14) {
                            result.error(StubApp.getString2(6317), e14.getMessage(), null);
                            return;
                        }
                    }
                    break;
                case 628333904:
                    if (str.equals(StubApp.getString2(6314))) {
                        try {
                            h hVar6 = this.f7449d;
                            if (hVar6 != null) {
                                hVar6.h();
                            }
                            result.success(null);
                            return;
                        } catch (Exception e15) {
                            result.error(StubApp.getString2(6315), e15.getMessage(), null);
                            return;
                        }
                    }
                    break;
                case 1076720101:
                    if (str.equals(StubApp.getString2(6312))) {
                        try {
                            h hVar7 = this.f7449d;
                            if (hVar7 != null) {
                                hVar7.l();
                            }
                            result.success(null);
                            return;
                        } catch (Exception e16) {
                            result.error(StubApp.getString2(6313), e16.getMessage(), null);
                            return;
                        }
                    }
                    break;
                case 2084366195:
                    if (str.equals(StubApp.getString2(6302))) {
                        Object obj5 = call.arguments;
                        Map map3 = obj5 instanceof Map ? (Map) obj5 : null;
                        if (map3 == null) {
                            result.error(string22, StubApp.getString2(6303), null);
                            return;
                        }
                        try {
                            Object obj6 = map3.get(StubApp.getString2("5710"));
                            String str3 = obj6 instanceof String ? (String) obj6 : null;
                            if (str3 == null) {
                                throw new Exception(StubApp.getString2("6311"));
                            }
                            Object obj7 = map3.get(StubApp.getString2("2051"));
                            String str4 = obj7 instanceof String ? (String) obj7 : null;
                            if (str4 == null) {
                                throw new Exception(StubApp.getString2("6310"));
                            }
                            Object obj8 = map3.get(string2);
                            String str5 = obj8 instanceof String ? (String) obj8 : null;
                            if (str5 == null) {
                                throw new Exception(StubApp.getString2("6309"));
                            }
                            Object obj9 = map3.get(StubApp.getString2("6304"));
                            String str6 = obj9 instanceof String ? (String) obj9 : null;
                            if (str6 == null) {
                                throw new Exception(StubApp.getString2("6308"));
                            }
                            Object obj10 = map3.get(StubApp.getString2("6305"));
                            Number number = obj10 instanceof Number ? (Number) obj10 : null;
                            int m135constructorimpl = number != null ? UInt.m135constructorimpl(number.intValue()) : 16000;
                            Object obj11 = map3.get(StubApp.getString2("6306"));
                            Number number2 = obj11 instanceof Number ? (Number) obj11 : null;
                            int m135constructorimpl2 = number2 != null ? UInt.m135constructorimpl(number2.intValue()) : 1;
                            Object obj12 = map3.get(StubApp.getString2("6307"));
                            Number number3 = obj12 instanceof Number ? (Number) obj12 : null;
                            W2.a aVar = new W2.a(str3, str4, str5, str6, m135constructorimpl, m135constructorimpl2, number3 != null ? Integer.valueOf(number3.intValue()) : null);
                            C0824a c0824a = this.f7450e;
                            if (c0824a == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("pluginBinding");
                                c0824a = null;
                            }
                            BinaryMessenger binaryMessenger = c0824a.f13554b;
                            Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
                            this.f7449d = new h(aVar, binaryMessenger);
                            result.success(Boolean.TRUE);
                            return;
                        } catch (Exception e17) {
                            result.error("INIT_AZURE_TRANSCRIPTION_ERROR", e17.getMessage(), null);
                            return;
                        }
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}
