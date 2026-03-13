package J9;

import B0.o;
import D5.r;
import P1.k;
import Q2.g;
import S3.D;
import android.content.Context;
import android.os.Trace;
import com.even.even_core.utils.room.EvDatabase_Impl;
import com.microsoft.cognitiveservices.speech.KeywordRecognitionModel;
import com.microsoft.cognitiveservices.speech.dialog.DialogServiceConnector;
import com.microsoft.cognitiveservices.speech.speaker.SpeakerIdentificationModel;
import com.microsoft.cognitiveservices.speech.speaker.SpeakerRecognitionResult;
import com.microsoft.cognitiveservices.speech.speaker.SpeakerRecognizer;
import com.microsoft.cognitiveservices.speech.speaker.SpeakerVerificationModel;
import com.microsoft.cognitiveservices.speech.speaker.VoiceProfile;
import com.microsoft.cognitiveservices.speech.speaker.VoiceProfileClient;
import com.microsoft.cognitiveservices.speech.speaker.VoiceProfileType;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import l4.BinderC1212t0;
import l4.C1184i;
import l4.C1199n;
import l4.C1224z0;
import l4.EnumC1222y0;
import l4.F1;
import l4.M1;
import tb.AbstractC1748a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3463c;

    public /* synthetic */ c(int i3, Object obj, Object obj2) {
        this.f3461a = i3;
        this.f3462b = obj;
        this.f3463c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long sendActivity;
        long startKeywordRecognition;
        long verifyOnce;
        long identifyOnce;
        long profilesJson;
        String string2;
        switch (this.f3461a) {
            case 0:
                StringRef stringRef = new StringRef("");
                DialogServiceConnector dialogServiceConnector = (DialogServiceConnector) this.f3462b;
                sendActivity = dialogServiceConnector.sendActivity(dialogServiceConnector.f12578b, stringRef, (String) this.f3463c);
                Contracts.throwIfFail(sendActivity);
                return stringRef.getValue();
            case 1:
                DialogServiceConnector dialogServiceConnector2 = (DialogServiceConnector) this.f3462b;
                startKeywordRecognition = dialogServiceConnector2.startKeywordRecognition(dialogServiceConnector2.f12578b, ((KeywordRecognitionModel) this.f3463c).getImpl());
                Contracts.throwIfFail(startKeywordRecognition);
                return null;
            case 2:
                IntRef intRef = new IntRef(0L);
                SpeakerRecognizer speakerRecognizer = (SpeakerRecognizer) this.f3462b;
                verifyOnce = speakerRecognizer.verifyOnce(speakerRecognizer.f12621a, ((SpeakerVerificationModel) this.f3463c).getImpl(), intRef);
                Contracts.throwIfFail(verifyOnce);
                return new SpeakerRecognitionResult(intRef.getValue());
            case 3:
                IntRef intRef2 = new IntRef(0L);
                SpeakerRecognizer speakerRecognizer2 = (SpeakerRecognizer) this.f3462b;
                identifyOnce = speakerRecognizer2.identifyOnce(speakerRecognizer2.f12621a, ((SpeakerIdentificationModel) this.f3463c).getImpl(), intRef2);
                Contracts.throwIfFail(identifyOnce);
                return new SpeakerRecognitionResult(intRef2.getValue());
            case 4:
                ArrayList arrayList = new ArrayList();
                StringRef stringRef2 = new StringRef("");
                IntRef intRef3 = new IntRef(0L);
                VoiceProfileClient voiceProfileClient = (VoiceProfileClient) this.f3462b;
                SafeHandle safeHandle = voiceProfileClient.f12631a;
                VoiceProfileType voiceProfileType = (VoiceProfileType) this.f3463c;
                profilesJson = voiceProfileClient.getProfilesJson(safeHandle, voiceProfileType.getValue(), stringRef2, intRef3);
                Contracts.throwIfFail(profilesJson);
                if (!stringRef2.getValue().isEmpty()) {
                    Iterator it = Arrays.asList(stringRef2.getValue().split(StubApp.getString2(3048))).iterator();
                    while (it.hasNext()) {
                        arrayList.add(new VoiceProfile((String) it.next(), voiceProfileType));
                    }
                }
                return arrayList;
            case 5:
                g gVar = (g) this.f3462b;
                EvDatabase_Impl evDatabase_Impl = (EvDatabase_Impl) gVar.f5711b;
                evDatabase_Impl.c();
                try {
                    Q2.c cVar = (Q2.c) gVar.f5712c;
                    Q2.a aVar = (Q2.a) this.f3463c;
                    k a3 = cVar.a();
                    try {
                        cVar.f(a3, aVar);
                        long a9 = a3.a();
                        cVar.d(a3);
                        Long valueOf = Long.valueOf(a9);
                        evDatabase_Impl.n();
                        return valueOf;
                    } catch (Throwable th) {
                        cVar.d(a3);
                        throw th;
                    }
                } finally {
                    evDatabase_Impl.j();
                }
            case 6:
                Context context = (Context) this.f3463c;
                bb.d dVar = (bb.d) this.f3462b;
                String string22 = StubApp.getString2(3035);
                String string23 = StubApp.getString2(3036);
                AbstractC1748a.d(StubApp.getString2(3037));
                try {
                    dVar.getClass();
                    FlutterJNI flutterJNI = (FlutterJNI) dVar.f10746e;
                    try {
                        flutterJNI.loadLibrary(context);
                        flutterJNI.updateRefreshRate();
                        ((ExecutorService) dVar.f10747f).execute(new o(this, 15));
                        File filesDir = context.getFilesDir();
                        if (filesDir == null) {
                            filesDir = new File(context.getDataDir().getPath(), StubApp.getString2("3038"));
                        }
                        String path = filesDir.getPath();
                        File codeCacheDir = context.getCodeCacheDir();
                        if (codeCacheDir == null) {
                            codeCacheDir = context.getCacheDir();
                        }
                        if (codeCacheDir == null) {
                            codeCacheDir = new File(context.getDataDir().getPath(), StubApp.getString2("3039"));
                        }
                        String path2 = codeCacheDir.getPath();
                        File dir = context.getDir(StubApp.getString2("3040"), 0);
                        if (dir == null) {
                            dir = new File(context.getDataDir().getPath(), StubApp.getString2("3041"));
                        }
                        dir.getPath();
                        bb.c cVar2 = new bb.c(path, path2);
                        Trace.endSection();
                        return cVar2;
                    } catch (UnsatisfiedLinkError e10) {
                        String string24 = StubApp.getString2("3042");
                        String string25 = StubApp.getString2("3043");
                        if (!e10.toString().contains(string24) && !e10.toString().contains(string25)) {
                            throw e10;
                        }
                        String property = System.getProperty(StubApp.getString2("3044"));
                        File file = new File((String) ((r) dVar.f10745d).f1451e);
                        String[] list = file.list();
                        StringBuilder sb2 = new StringBuilder(string23);
                        sb2.append(property);
                        sb2.append(StubApp.getString2("3045"));
                        sb2.append(file.getAbsolutePath());
                        sb2.append(StubApp.getString2("3046"));
                        if (file.exists()) {
                            string2 = string22 + Arrays.toString(list);
                        } else {
                            string2 = StubApp.getString2("3047");
                        }
                        sb2.append(string2);
                        throw new UnsupportedOperationException(sb2.toString(), e10);
                    }
                } catch (Throwable th2) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 7:
                BinderC1212t0 binderC1212t0 = (BinderC1212t0) this.f3462b;
                binderC1212t0.f16629e.A();
                C1199n c1199n = binderC1212t0.f16629e.f16061c;
                F1.S(c1199n);
                return c1199n.h0((String) this.f3463c);
            case 8:
                BinderC1212t0 binderC1212t02 = (BinderC1212t0) this.f3462b;
                binderC1212t02.f16629e.A();
                return new C1184i(binderC1212t02.f16629e.o0(((M1) this.f3463c).f16165a));
            default:
                M1 m12 = (M1) this.f3463c;
                String str = m12.f16165a;
                D.h(str);
                F1 f12 = (F1) this.f3462b;
                C1224z0 d8 = f12.d(str);
                EnumC1222y0 enumC1222y0 = EnumC1222y0.f16685c;
                if (d8.i(enumC1222y0) && C1224z0.c(100, m12.f16182v).i(enumC1222y0)) {
                    return f12.a0(m12).E();
                }
                f12.a().f16249p.b(StubApp.getString2(3034));
                return null;
        }
    }

    public c(BinderC1212t0 binderC1212t0, String str) {
        this.f3461a = 7;
        this.f3463c = str;
        Objects.requireNonNull(binderC1212t0);
        this.f3462b = binderC1212t0;
    }

    public c(BinderC1212t0 binderC1212t0, M1 m12) {
        this.f3461a = 8;
        this.f3463c = m12;
        Objects.requireNonNull(binderC1212t0);
        this.f3462b = binderC1212t0;
    }

    public c(F1 f12, M1 m12) {
        this.f3461a = 9;
        this.f3463c = m12;
        Objects.requireNonNull(f12);
        this.f3462b = f12;
    }
}
