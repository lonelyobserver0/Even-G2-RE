package kotlin.text;

import kotlin.jvm.functions.Function1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15635b;

    public /* synthetic */ c(Object obj, int i3) {
        this.f15634a = i3;
        this.f15635b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String prependIndent$lambda$0$StringsKt__IndentKt;
        String indentFunction$lambda$1$StringsKt__IndentKt;
        MatchGroup matchGroup;
        switch (this.f15634a) {
            case 0:
                prependIndent$lambda$0$StringsKt__IndentKt = StringsKt__IndentKt.prependIndent$lambda$0$StringsKt__IndentKt((String) this.f15635b, (String) obj);
                return prependIndent$lambda$0$StringsKt__IndentKt;
            case 1:
                indentFunction$lambda$1$StringsKt__IndentKt = StringsKt__IndentKt.getIndentFunction$lambda$1$StringsKt__IndentKt((String) this.f15635b, (String) obj);
                return indentFunction$lambda$1$StringsKt__IndentKt;
            default:
                matchGroup = ((MatcherMatchResult$groups$1) this.f15635b).get(((Integer) obj).intValue());
                return matchGroup;
        }
    }
}
