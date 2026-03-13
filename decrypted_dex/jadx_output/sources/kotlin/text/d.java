package kotlin.text;

import kotlin.jvm.functions.Function1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15636a;

    public /* synthetic */ d(int i3) {
        this.f15636a = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String indentFunction$lambda$0$StringsKt__IndentKt;
        String windowed$lambda$0$StringsKt___StringsKt;
        String windowedSequence$lambda$0$StringsKt___StringsKt;
        String chunkedSequence$lambda$0$StringsKt___StringsKt;
        switch (this.f15636a) {
            case 0:
                indentFunction$lambda$0$StringsKt__IndentKt = StringsKt__IndentKt.getIndentFunction$lambda$0$StringsKt__IndentKt((String) obj);
                return indentFunction$lambda$0$StringsKt__IndentKt;
            case 1:
                windowed$lambda$0$StringsKt___StringsKt = StringsKt___StringsKt.windowed$lambda$0$StringsKt___StringsKt((CharSequence) obj);
                return windowed$lambda$0$StringsKt___StringsKt;
            case 2:
                windowedSequence$lambda$0$StringsKt___StringsKt = StringsKt___StringsKt.windowedSequence$lambda$0$StringsKt___StringsKt((CharSequence) obj);
                return windowedSequence$lambda$0$StringsKt___StringsKt;
            default:
                chunkedSequence$lambda$0$StringsKt___StringsKt = StringsKt___StringsKt.chunkedSequence$lambda$0$StringsKt___StringsKt((CharSequence) obj);
                return chunkedSequence$lambda$0$StringsKt___StringsKt;
        }
    }
}
