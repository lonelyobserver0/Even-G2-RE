package com.even.translate;

import Ab.b;
import Ab.c;
import android.os.Handler;
import android.os.Looper;
import com.even.translate.azure.translation.AzureTranslationRecognizer;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\n\u001a\u00020\t2\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u000f\u001a\u00020\t2\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ)\u0010\u0010\u001a\u00020\t2\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ)\u0010\u0011\u001a\u00020\t2\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0015R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/even/translate/TranslatePlugin;", "Ldb/b;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "", "args", "Lio/flutter/plugin/common/MethodChannel$Result;", "result", "", "handleInit", "(Ljava/util/Map;Lio/flutter/plugin/common/MethodChannel$Result;)V", "handleStartTranslation", "(Lio/flutter/plugin/common/MethodChannel$Result;)V", "handleStopTranslation", "handleWriteAudioData", "handleSetSourceLanguage", "handleSetTargetLanguage", "Ldb/a;", "flutterPluginBinding", "onAttachedToEngine", "(Ldb/a;)V", "Lio/flutter/plugin/common/MethodCall;", "call", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "binding", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodChannel;", "channel", "Lio/flutter/plugin/common/MethodChannel;", "Lcom/even/translate/azure/translation/AzureTranslationRecognizer;", "translationRecognizer", "Lcom/even/translate/azure/translation/AzureTranslationRecognizer;", "pluginBinding", "Ldb/a;", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTranslatePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslatePlugin.kt\ncom/even/translate/TranslatePlugin\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class TranslatePlugin implements InterfaceC0825b, MethodChannel.MethodCallHandler {
    private MethodChannel channel;
    private C0824a pluginBinding;
    private AzureTranslationRecognizer translationRecognizer;

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x001b, B:9:0x0029, B:11:0x0033, B:13:0x0041, B:15:0x0048, B:17:0x0056, B:19:0x005d, B:21:0x006b, B:23:0x0072, B:25:0x0080, B:27:0x0087, B:29:0x0095, B:31:0x009b, B:33:0x00a4, B:35:0x00b2, B:37:0x00b8, B:41:0x00c6, B:43:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00f0, B:51:0x00f6, B:52:0x0101, B:54:0x010f, B:56:0x0115, B:57:0x0120, B:59:0x012e, B:61:0x0134, B:62:0x0141, B:64:0x0150, B:65:0x0156, B:75:0x00c3, B:79:0x0163, B:80:0x016e, B:82:0x016f, B:83:0x017a, B:85:0x017b, B:86:0x0186, B:88:0x0187, B:89:0x0192, B:91:0x0193, B:92:0x019e), top: B:6:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x001b, B:9:0x0029, B:11:0x0033, B:13:0x0041, B:15:0x0048, B:17:0x0056, B:19:0x005d, B:21:0x006b, B:23:0x0072, B:25:0x0080, B:27:0x0087, B:29:0x0095, B:31:0x009b, B:33:0x00a4, B:35:0x00b2, B:37:0x00b8, B:41:0x00c6, B:43:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00f0, B:51:0x00f6, B:52:0x0101, B:54:0x010f, B:56:0x0115, B:57:0x0120, B:59:0x012e, B:61:0x0134, B:62:0x0141, B:64:0x0150, B:65:0x0156, B:75:0x00c3, B:79:0x0163, B:80:0x016e, B:82:0x016f, B:83:0x017a, B:85:0x017b, B:86:0x0186, B:88:0x0187, B:89:0x0192, B:91:0x0193, B:92:0x019e), top: B:6:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x001b, B:9:0x0029, B:11:0x0033, B:13:0x0041, B:15:0x0048, B:17:0x0056, B:19:0x005d, B:21:0x006b, B:23:0x0072, B:25:0x0080, B:27:0x0087, B:29:0x0095, B:31:0x009b, B:33:0x00a4, B:35:0x00b2, B:37:0x00b8, B:41:0x00c6, B:43:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00f0, B:51:0x00f6, B:52:0x0101, B:54:0x010f, B:56:0x0115, B:57:0x0120, B:59:0x012e, B:61:0x0134, B:62:0x0141, B:64:0x0150, B:65:0x0156, B:75:0x00c3, B:79:0x0163, B:80:0x016e, B:82:0x016f, B:83:0x017a, B:85:0x017b, B:86:0x0186, B:88:0x0187, B:89:0x0192, B:91:0x0193, B:92:0x019e), top: B:6:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x001b, B:9:0x0029, B:11:0x0033, B:13:0x0041, B:15:0x0048, B:17:0x0056, B:19:0x005d, B:21:0x006b, B:23:0x0072, B:25:0x0080, B:27:0x0087, B:29:0x0095, B:31:0x009b, B:33:0x00a4, B:35:0x00b2, B:37:0x00b8, B:41:0x00c6, B:43:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00f0, B:51:0x00f6, B:52:0x0101, B:54:0x010f, B:56:0x0115, B:57:0x0120, B:59:0x012e, B:61:0x0134, B:62:0x0141, B:64:0x0150, B:65:0x0156, B:75:0x00c3, B:79:0x0163, B:80:0x016e, B:82:0x016f, B:83:0x017a, B:85:0x017b, B:86:0x0186, B:88:0x0187, B:89:0x0192, B:91:0x0193, B:92:0x019e), top: B:6:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x001b, B:9:0x0029, B:11:0x0033, B:13:0x0041, B:15:0x0048, B:17:0x0056, B:19:0x005d, B:21:0x006b, B:23:0x0072, B:25:0x0080, B:27:0x0087, B:29:0x0095, B:31:0x009b, B:33:0x00a4, B:35:0x00b2, B:37:0x00b8, B:41:0x00c6, B:43:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00f0, B:51:0x00f6, B:52:0x0101, B:54:0x010f, B:56:0x0115, B:57:0x0120, B:59:0x012e, B:61:0x0134, B:62:0x0141, B:64:0x0150, B:65:0x0156, B:75:0x00c3, B:79:0x0163, B:80:0x016e, B:82:0x016f, B:83:0x017a, B:85:0x017b, B:86:0x0186, B:88:0x0187, B:89:0x0192, B:91:0x0193, B:92:0x019e), top: B:6:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x001b, B:9:0x0029, B:11:0x0033, B:13:0x0041, B:15:0x0048, B:17:0x0056, B:19:0x005d, B:21:0x006b, B:23:0x0072, B:25:0x0080, B:27:0x0087, B:29:0x0095, B:31:0x009b, B:33:0x00a4, B:35:0x00b2, B:37:0x00b8, B:41:0x00c6, B:43:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00f0, B:51:0x00f6, B:52:0x0101, B:54:0x010f, B:56:0x0115, B:57:0x0120, B:59:0x012e, B:61:0x0134, B:62:0x0141, B:64:0x0150, B:65:0x0156, B:75:0x00c3, B:79:0x0163, B:80:0x016e, B:82:0x016f, B:83:0x017a, B:85:0x017b, B:86:0x0186, B:88:0x0187, B:89:0x0192, B:91:0x0193, B:92:0x019e), top: B:6:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x001b, B:9:0x0029, B:11:0x0033, B:13:0x0041, B:15:0x0048, B:17:0x0056, B:19:0x005d, B:21:0x006b, B:23:0x0072, B:25:0x0080, B:27:0x0087, B:29:0x0095, B:31:0x009b, B:33:0x00a4, B:35:0x00b2, B:37:0x00b8, B:41:0x00c6, B:43:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00f0, B:51:0x00f6, B:52:0x0101, B:54:0x010f, B:56:0x0115, B:57:0x0120, B:59:0x012e, B:61:0x0134, B:62:0x0141, B:64:0x0150, B:65:0x0156, B:75:0x00c3, B:79:0x0163, B:80:0x016e, B:82:0x016f, B:83:0x017a, B:85:0x017b, B:86:0x0186, B:88:0x0187, B:89:0x0192, B:91:0x0193, B:92:0x019e), top: B:6:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x001b, B:9:0x0029, B:11:0x0033, B:13:0x0041, B:15:0x0048, B:17:0x0056, B:19:0x005d, B:21:0x006b, B:23:0x0072, B:25:0x0080, B:27:0x0087, B:29:0x0095, B:31:0x009b, B:33:0x00a4, B:35:0x00b2, B:37:0x00b8, B:41:0x00c6, B:43:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00f0, B:51:0x00f6, B:52:0x0101, B:54:0x010f, B:56:0x0115, B:57:0x0120, B:59:0x012e, B:61:0x0134, B:62:0x0141, B:64:0x0150, B:65:0x0156, B:75:0x00c3, B:79:0x0163, B:80:0x016e, B:82:0x016f, B:83:0x017a, B:85:0x017b, B:86:0x0186, B:88:0x0187, B:89:0x0192, B:91:0x0193, B:92:0x019e), top: B:6:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0150 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x001b, B:9:0x0029, B:11:0x0033, B:13:0x0041, B:15:0x0048, B:17:0x0056, B:19:0x005d, B:21:0x006b, B:23:0x0072, B:25:0x0080, B:27:0x0087, B:29:0x0095, B:31:0x009b, B:33:0x00a4, B:35:0x00b2, B:37:0x00b8, B:41:0x00c6, B:43:0x00d4, B:45:0x00da, B:47:0x00e2, B:49:0x00f0, B:51:0x00f6, B:52:0x0101, B:54:0x010f, B:56:0x0115, B:57:0x0120, B:59:0x012e, B:61:0x0134, B:62:0x0141, B:64:0x0150, B:65:0x0156, B:75:0x00c3, B:79:0x0163, B:80:0x016e, B:82:0x016f, B:83:0x017a, B:85:0x017b, B:86:0x0186, B:88:0x0187, B:89:0x0192, B:91:0x0193, B:92:0x019e), top: B:6:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleInit(java.util.Map<?, ?> r18, io.flutter.plugin.common.MethodChannel.Result r19) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.even.translate.TranslatePlugin.handleInit(java.util.Map, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    private final void handleSetSourceLanguage(Map<?, ?> args, MethodChannel.Result result) {
        if (args != null) {
            String string2 = StubApp.getString2(1142);
            if (args.get(string2) instanceof String) {
                try {
                    Object obj = args.get(string2);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj;
                    AzureTranslationRecognizer azureTranslationRecognizer = this.translationRecognizer;
                    if (azureTranslationRecognizer != null) {
                        azureTranslationRecognizer.setSourceLanguage(str);
                    }
                    result.success(null);
                    return;
                } catch (Exception e10) {
                    result.error(StubApp.getString2(10053), e10.getMessage(), null);
                    return;
                }
            }
        }
        result.error(StubApp.getString2(6301), StubApp.getString2(6320), null);
    }

    private final void handleSetTargetLanguage(Map<?, ?> args, MethodChannel.Result result) {
        if (args != null) {
            String string2 = StubApp.getString2(1142);
            if (args.get(string2) instanceof String) {
                try {
                    Object obj = args.get(string2);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj;
                    AzureTranslationRecognizer azureTranslationRecognizer = this.translationRecognizer;
                    if (azureTranslationRecognizer != null) {
                        azureTranslationRecognizer.setTargetLanguage(str);
                    }
                    result.success(null);
                    return;
                } catch (Exception e10) {
                    result.error(StubApp.getString2(10053), e10.getMessage(), null);
                    return;
                }
            }
        }
        result.error(StubApp.getString2(6301), StubApp.getString2(6320), null);
    }

    private final void handleStartTranslation(MethodChannel.Result result) {
        try {
            AzureTranslationRecognizer azureTranslationRecognizer = this.translationRecognizer;
            if (azureTranslationRecognizer != null) {
                azureTranslationRecognizer.startTranslation();
            }
            result.success(null);
        } catch (Exception e10) {
            result.error(StubApp.getString2(10054), e10.getMessage(), null);
        }
    }

    private final void handleStopTranslation(MethodChannel.Result result) {
        AzureTranslationRecognizer azureTranslationRecognizer = this.translationRecognizer;
        if (azureTranslationRecognizer == null) {
            result.error(StubApp.getString2(10055), StubApp.getString2(10056), null);
            return;
        }
        Thread thread = new Thread(new c(azureTranslationRecognizer, this, result, 8));
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleStopTranslation$lambda$3(AzureTranslationRecognizer azureTranslationRecognizer, TranslatePlugin translatePlugin, MethodChannel.Result result) {
        try {
            azureTranslationRecognizer.stopTranslation();
            new Handler(Looper.getMainLooper()).post(new b(29, translatePlugin, result));
        } catch (Exception e10) {
            new Handler(Looper.getMainLooper()).post(new a(0, result, e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleStopTranslation$lambda$3$lambda$1(TranslatePlugin translatePlugin, MethodChannel.Result result) {
        translatePlugin.translationRecognizer = null;
        result.success(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleStopTranslation$lambda$3$lambda$2(MethodChannel.Result result, Exception exc) {
        result.error(StubApp.getString2(10057), exc.getMessage(), null);
    }

    private final void handleWriteAudioData(Map<?, ?> args, MethodChannel.Result result) {
        if (args != null) {
            String string2 = StubApp.getString2(1485);
            if (args.get(string2) instanceof byte[]) {
                try {
                    Object obj = args.get(string2);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.ByteArray");
                    byte[] bArr = (byte[]) obj;
                    AzureTranslationRecognizer azureTranslationRecognizer = this.translationRecognizer;
                    if (azureTranslationRecognizer != null) {
                        azureTranslationRecognizer.writeAudioData(bArr);
                    }
                    result.success(null);
                    return;
                } catch (Exception e10) {
                    result.error(StubApp.getString2(6326), e10.getMessage(), null);
                    return;
                }
            }
        }
        result.error(StubApp.getString2(6301), StubApp.getString2(6327), null);
    }

    @Override // db.InterfaceC0825b
    public void onAttachedToEngine(C0824a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        this.pluginBinding = flutterPluginBinding;
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.f13554b, StubApp.getString2(6297));
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // db.InterfaceC0825b
    public void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1215604863:
                    if (str.equals(StubApp.getString2(10063))) {
                        Object obj = call.arguments;
                        handleWriteAudioData(obj instanceof Map ? (Map) obj : null, result);
                        return;
                    }
                    break;
                case -142902005:
                    if (str.equals(StubApp.getString2(10062))) {
                        Object obj2 = call.arguments;
                        handleSetTargetLanguage(obj2 instanceof Map ? (Map) obj2 : null, result);
                        return;
                    }
                    break;
                case 3237136:
                    if (str.equals(StubApp.getString2(10061))) {
                        Object obj3 = call.arguments;
                        handleInit(obj3 instanceof Map ? (Map) obj3 : null, result);
                        return;
                    }
                    break;
                case 85674389:
                    if (str.equals(StubApp.getString2(10060))) {
                        Object obj4 = call.arguments;
                        handleSetSourceLanguage(obj4 instanceof Map ? (Map) obj4 : null, result);
                        return;
                    }
                    break;
                case 1233626351:
                    if (str.equals(StubApp.getString2(10059))) {
                        handleStartTranslation(result);
                        return;
                    }
                    break;
                case 1951128911:
                    if (str.equals(StubApp.getString2(10058))) {
                        handleStopTranslation(result);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}
