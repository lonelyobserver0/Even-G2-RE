package E9;

import Qb.J;
import Qb.L;
import Qb.L0;
import Qb.W;
import android.content.Context;
import android.os.Trace;
import android.speech.tts.TextToSpeech;
import com.stub.StubApp;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f2109a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2110b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2111c;

    /* renamed from: d, reason: collision with root package name */
    public final D9.f f2112d;

    /* renamed from: e, reason: collision with root package name */
    public final TextToSpeech f2113e;

    /* renamed from: f, reason: collision with root package name */
    public float f2114f;

    /* renamed from: g, reason: collision with root package name */
    public C2.d f2115g;

    /* renamed from: h, reason: collision with root package name */
    public F9.b f2116h;

    public w(Context context, String language, r playerAttributes) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(playerAttributes, "playerAttributes");
        this.f2109a = language;
        this.f2110b = playerAttributes;
        L0 b2 = L.b();
        this.f2112d = new D9.f(b2, J.a(CoroutineContext.Element.DefaultImpls.plus(b2, W.f5838a)));
        int i3 = J.g.f3258a;
        Trace.beginSection(StubApp.getString2(1972));
        try {
            Context context2 = StubApp.getOrigApplicationContext(context.getApplicationContext());
            Intrinsics.checkNotNullExpressionValue(context2, "context.applicationContext");
            TextToSpeech.OnInitListener onInitListener = new TextToSpeech.OnInitListener() { // from class: E9.s
                @Override // android.speech.tts.TextToSpeech.OnInitListener
                public final void onInit(int i10) {
                    w this$0 = w.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.getClass();
                    if (i10 == 0) {
                        Locale language2 = new Locale(this$0.f2109a);
                        Intrinsics.checkNotNullParameter(language2, "language");
                        L.j(this$0.f2112d.f1513b, null, new t(this$0, language2, null), 3);
                        this$0.f2113e.setOnUtteranceProgressListener(new v(this$0));
                    }
                }
            };
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(onInitListener, "onInitListener");
            TextToSpeech textToSpeech = new TextToSpeech(context2, onInitListener);
            Trace.endSection();
            this.f2113e = textToSpeech;
            this.f2114f = 1.0f;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void a() {
        F9.b bVar = this.f2116h;
        if (bVar != null) {
            this.f2116h = null;
            C2.d dVar = this.f2115g;
            if (dVar != null) {
                dVar.k(bVar);
            }
        }
    }
}
